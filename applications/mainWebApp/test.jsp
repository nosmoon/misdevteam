<%@ page contentType="text/html; charset=KSC5601"%>
<%@	page import=" com.enc.aes.crypt.*  ,ldapp.*"
%>
<html>
<body bgcolor="yellowgreen">test1
<center>
<%= MD5Crypt2.hash("1234") %>
<%= request.getSession().getId() %>
<h1> ciis </h1>
</body>
</html>
