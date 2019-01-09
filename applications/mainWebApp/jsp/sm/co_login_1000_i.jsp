<%@ page contentType="text/html; charset=KSC5601" %>
<%----------------------------------------------------------
* 프로그램명	: co_login_1000_i.jsp
* 프로그램기능	: B2E LDAP 사용자 비밀번호 변경
* 작성일자	: 2004.05.31
* 작성자	: 조은영
* 수정내역	:
----------------------------------------------------------%>
<html>
<head>
<title>비밀번호 변경</title>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<script language="JavaScript">
<!--
function ModifySSOpasswd() {
	//location.href = "/common/jsp/passchange.jsp";
	//var url = "http://implus.chosun.com:40003/IMPlus/ext/ChosunPortalLink.jsp";

	alert("비밀 변경 변경 후 로그인이 가능합니다 " );
	var url = "http://ciis.chosun.com/common/jsp/passchange.jsp";
	window.open(url,"SSOpasswd_win","width=900,height=630,status=yes,scrollbars=no,resizable");
}
//-->
</script>
</head>

<body text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" bgcolor="#ffffff" onload="ModifySSOpasswd();">

</body>
</html>
<meta http-equiv="refresh" content="1;url=http://ciis.chosun.com/index.jsp" target="1"> 