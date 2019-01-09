<%@ include file="/genics/sso_inc/inc_session.jsp" %>

<form name="connect_actor" method="post" style="display:inline;">
	<input type='hidden' name='a' value='SsoActionApp'>
	<input type='hidden' name='c' value = ''>
	<input type='hidden' name='sso_token' value=''>
	<input type='hidden' name='target_url' value='<%=req_url%>'>
	<input type='hidden' name='action_url' value='<%=fam_domain %>/genics/client_action.jsp'>
	<input type='hidden' name='action_type' value=''>
	<input type='hidden' name='sso_id' value=''>
</form>

<script type="text/JavaScript" src="<%=fam_domain %>/genics/sso_inc/webtoolkit.base64.js"></script>
<script type="text/JavaScript">
var sso_id = '<%=sso_id%>';
function BSSO_sso_process(str, fs, ip, msg) {
	var sso_token = str; // 인증서버에서 인증후 넘겨주는 인증토큰
	if(sso_id == null || sso_id == '' || sso_id == 'null') { // 해당 SP에 세션이 없다면
		if(sso_token != null && sso_token != '' && sso_token != 'null') { // 하지만 인증서버에서 세션이 있다면
			// 로그인 처리한다.
			BSSO_login_process(str);
		}
	}else{	// 이미 세션이 맺어져 있다면
		if(sso_token == null || sso_token == '' || sso_token == 'null') { // 하지만 인증서버에서 세션이 없다면
			// 로그아웃 처리한다.
			BSSO_logout_process();
		}else{
			if(fs == '1') { // 중복접속 상태에서  메시지 명령 세션을 삭제하기 위한 구문
				alert(ip + ' '+Base64.decode(msg));
				//BSSO_login_process(str);
				//다른 컴퓨터에서 접속했는 지 여부를 알리는 세션을 삭제한다.
				document.getElementById('_sso_frame').src = "<%=sso_domain%>/function/initMsgProc.jsp";
			}else if(fs == '2') { // 세션을 강제로 종료하는 경우
				alert(ip + ' '+Base64.decode(msg));
				BSSO_logout_process();
			}else if(fs == '5') { // 관리자가 세션을 강제로 끊는 경우
				alert(Base64.decode(msg));
				BSSO_logout_process();
			}
		}
	}
}

function BSSO_login_process(str) {
	var f = document.connect_actor;
	f.action = '<%=sso_domain%>/cert.genics';
	f.c.value = '1003';
	f.action_type.value = 'XX';
	f.sso_token.value = str;
	f.submit();
}

function BSSO_logout_process() {
	var f = document.connect_actor;
	f.action = '<%=sso_domain%>/cert.genics';
	f.c.value = '1002';
	f.action_type.value = 'LO';
	f.sso_id.value = sso_id;
	f.submit();
}

<%if(sso_id!=null){%>

BSSO_login_process("<%=sso_id%>");

<%}%>
</script>

<iframe id="_sso_frame" name="_sso_frame" width="500" height="0" frameborder="0" src="<%=sso_domain%>/sso_auth.jsp?fam_domain=<%=fam_domain%>&file_ext=<%=file_ext%>"></iframe>