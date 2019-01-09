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
	var sso_token = str; // ������������ ������ �Ѱ��ִ� ������ū
	if(sso_id == null || sso_id == '' || sso_id == 'null') { // �ش� SP�� ������ ���ٸ�
		if(sso_token != null && sso_token != '' && sso_token != 'null') { // ������ ������������ ������ �ִٸ�
			// �α��� ó���Ѵ�.
			BSSO_login_process(str);
		}
	}else{	// �̹� ������ �ξ��� �ִٸ�
		if(sso_token == null || sso_token == '' || sso_token == 'null') { // ������ ������������ ������ ���ٸ�
			// �α׾ƿ� ó���Ѵ�.
			BSSO_logout_process();
		}else{
			if(fs == '1') { // �ߺ����� ���¿���  �޽��� ��� ������ �����ϱ� ���� ����
				alert(ip + ' '+Base64.decode(msg));
				//BSSO_login_process(str);
				//�ٸ� ��ǻ�Ϳ��� �����ߴ� �� ���θ� �˸��� ������ �����Ѵ�.
				document.getElementById('_sso_frame').src = "<%=sso_domain%>/function/initMsgProc.jsp";
			}else if(fs == '2') { // ������ ������ �����ϴ� ���
				alert(ip + ' '+Base64.decode(msg));
				BSSO_logout_process();
			}else if(fs == '5') { // �����ڰ� ������ ������ ���� ���
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