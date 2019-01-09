<%---------------------------------------------------------------------------------------------------
* 파일명 : co_login_1000_p.jsp 
* 기능 : 로그인 - 비밀번호 변경 대상여부 확인
* 작성일자 : 2006-01-05
* 작성자 : 조은영
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%@ page contentType="text/html; charset=KSC5601" %>
<jsp:useBean id="authUser" scope="page" class="ldapp.AuthUser" />
<%
	String loginid = (request.getParameter ("User") == null) ? "" : request.getParameter("User").trim();
	String loginpwd = (request.getParameter ("Password") == null) ? "" : request.getParameter("Password").trim();
	String loginurl = (request.getParameter ("URL") == null) ? "" : request.getParameter("URL").trim();
	String logintarget = (request.getParameter ("target") == null) ? "" : request.getParameter("target").trim();
	
	if (!logintarget.equals(""))	logintarget = java.net.URLDecoder.decode(logintarget);
	else									logintarget = "/";

	//입력값이 없다면 메인으로 이동한다
	if (loginid.equals("") || loginpwd.equals("")) {
		out.println ("<script language=javascript>\n<!--");
		out.println ("alert (\"입력값이 없습니다\");\n");
		out.println ("	location.href = \"/\";");
		out.println ("//-->\n</script>");
	}

	boolean auth = false, result = false;
	
	//아이디, 비밀번호 일치여부를 확인한다
	auth = authUser.isAuth (loginid, loginpwd);
	
	//비밀번호 변경 대상여부를 확인한다
	if (auth)		result = authUser.isTarget (loginid, loginpwd, -30);
%>
<% if (result) {  %>
<script language=javascript>
<!--
	alert ("비밀번호 유효기간이 만료되었거나 최초 로그인입니다. 비밀번호를 변경해 주세요.");
	location.href = "/jsp/sm/co_login_1000_i.jsp?USERNAME=<%=loginid%>";
//-->
</script>
<% } else { %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
</head>
<body onload="javascript:document.form.submit();">
<form name="form" method="post" action="/siteminderagent/forms/login.fcc">
<input type="hidden" name="target" value="<%=logintarget%>">
<input type="hidden" name="smauthreason" value="0">
<input type="hidden" name="User" value="<%=loginid%>">
<input type="hidden" name="Password" value="<%=loginpwd%>">
</form>
</body>
</html>
<% } %>