<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%----------------------------------------------------------
* 프로그램명	: co_login_1100_i.jsp
* 프로그램기능	: 비밀번호 재발급 신청
* 작성일자	: 2004.07.27
* 작성자	: 김대섭
----------------------------------------------------------%>
<%
  String userid = Util.Uni2Ksc(Util.checkString(request.getParameter("USERNAME")));
%>
<html>
<head>
<title>비밀번호 변경</title>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.re_pwd_form.deptnm.focus();
}

// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 변경처리
function re_pwd(){
	var lo_form1 = document.re_pwd_form;
	
	// 입력값체크
	// 아이디 5자리 체크 없을 경우 불변코드5자리+사용자순번(1-5) (지국)
	
	if(lo_form1.deptnm.value == ''){
		alert("부서명을 입력하세요");
		return;
	}
	
	if(lo_form1.usernm.value == ''){
		alert("사용자명을 입력하세요");
		return;
	}
	
	if(lo_form1.position.value == ''){
		alert("직책명을 입력하세요");
		return;
	}
	
	if(lo_form1.userid.value == ''){
		alert("아이디를 입력하세요");
		return;
	}
	
	if(lo_form1.reason.value == ''){
		alert("변경사유를 입력하세요");
		return;
	}
	
    lo_form1.submit();
}

// 취소
function cancel(){
	location.replace("/login.jsp");
}
//-->
</script>
</head>
<body text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" bgcolor="#ffffff">
<table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td background="/html/comm_img/login_back.jpg" height="155">
      <object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=5,0,0,0" width="1000" height="155">
        <param name=movie value="/html/comm_img/login_top1.swf">
        <param name=quality value=high>
        <embed src="/html/comm_img/login_top1.swf" quality=high pluginspage="http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash" type="application/x-shockwave-flash" width="1000" height="155">
        </embed>
      </object>
    </td>
  </tr>
  <tr>
    <td height="25" background="/html/comm_img/login_tiback01.gif"> <font color="#FFFFFF">
      <img src="/html/comm_img/login_tiback.gif" width="83" height="25" align="absmiddle">
      <font color="#FFCC00"><b><img src="/html/comm_img/ic_arr01.gif" width="20" height="16" align="absmiddle">
      </b></font>비밀번호를 재발급</font>
    </td>
  </tr>
  <tr>
    <td align="center">
      <table width=493 border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td width=19 height=35 ></td>
          <td> <img src="/html/comm_img/login_box_02.gif" width=460 height=35 alt=""></td>
          <td  width=14 height=35 ></td>
        </tr>
        <tr>
          <td> <img src="/html/comm_img/login_box_04.gif" width=19 height=25 alt=""></td>
          <td> <img src="/html/comm_img/login_box_05.gif" width=460 height=25 alt=""></td>
          <td> <img src="/html/comm_img/login_box_06.gif" width=14 height=25 alt=""></td>
        </tr>
        <tr>
          <td> <img src="/html/comm_img/login_box_07.gif" width=19 height=27 alt=""></td>
          <td> <img src="/html/comm_img/login_box_08_03.gif" width=460 height=27 alt=""></td>
          <td> <img src="/html/comm_img/login_box_09.gif" width=14 height=27 alt=""></td>
        </tr>
        <tr>
          <td background="/html/comm_img/login_box_10.gif">&nbsp; </td>
          <td bgcolor="#F2F3F3" height="140">
			<table width="460" border="0" cellpadding="2" cellspacing="1" bgcolor="#999999" align="center">
		    <form name="re_pwd_form" method="post" action="/jsp/ss/sm/co_login_1100_u.jsp" >
				<tr align="center" bgcolor="#D5D5D5"> 
					<td width="90" height="24" align="center" bgcolor="#D5D5D5"><strong>소 속</strong></td>
					<td width="132" height="24" align="left" bgcolor="#FFFFFF"><input type="text" name="deptnm" size="18" class="text_box" caption="소 속" notEmpty></td>
					<td width="90" height="24" align="center"><strong>사용자명</strong></td>
					<td width="143" height="24"  align="left" bgcolor="#FFFFFF"><input type="text" name="usernm" size="18" class="text_box" caption="사용자명" notEmpty></td>
				</tr>
				<tr bgcolor="#FFFFFF"> 
					<td height="24" align="center" bgcolor="#D5D5D5"><strong>직 책</strong></td>
					<td height="24" align="left"><input type="text" name="position" size="18" class="text_box" caption="직 책" notEmpty></td>
					<td height="24" align="center" bgcolor="#D5D5D5"><strong>아이디</strong></td>
					<td height="24" align="left"><input type="text" name="userid" size="18" class="text_box" caption="아이디" notEmpty value="<%=userid%>"></td>
				</tr>
				<tr bgcolor="#FFFFFF"> 
					<td height="49" align="center" bgcolor="#D5D5D5"><strong>변경사유</strong></td>
					<td height="49" colspan="3"><textarea name="reason" style="ime-mode:active;" cols="46" rows="3" class="scroll1" caption="변경사유" notEmpty></textarea></td>
				</tr>
			</form>				
			</table>
			<br>
			<table width="140" border="0" cellspacing="0" cellpadding="0" align="center">
				<tr align="center">
					<td><input name="login_img" type="image" src="/html/comm_img/bu_login.gif" width="47" height="47" border="0" onclick="re_pwd();window.event.returnValue=false;"></td>
					<td><input name="cancel_img" type="image" src="/html/comm_img/bu_pw_cancel.gif" width="47" height="47" border="0" onclick="cancel();window.event.returnValue=false;"></td>
				</tr>
			</table>
        
        <br>
      </td>
      <td background="/html/comm_img/login_box_12.gif">&nbsp; </td>
    </tr>
    <tr> 
      <td><img height=12 alt="" src="/html/comm_img/login_box_13.gif" width=19></td>
      <td background="/html/comm_img/login_box_14.gif"></td>
      <td><img height=12 alt="" src="/html/comm_img/login_box_15.gif" width=14></td>
    </tr>
  </tbody>
</table>
</body>
</html>
