<%@ page contentType="text/html; charset=KSC5601" %>
<%
	String loginid = (request.getParameter ("User") == null) ? "" : request.getParameter("User").trim();
	String loginpwd = (request.getParameter ("Password") == null) ? "" : request.getParameter("Password").trim();
	String loginurl = (request.getParameter ("URL") == null) ? "" : request.getParameter("URL").trim();
	String logintarget = (request.getParameter ("target") == null) ? "" : request.getParameter("target").trim();
%>	

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