<%@ page contentType="text/html;charset=euc-kr" %>
<%@ include file="/genics/sso_inc/inc_session.jsp" %>
<%
response.setHeader("Cache-Control","no-store");   
response.setHeader("Pragma","no-cache");   
response.setDateHeader("Expires",0);   
if (request.getProtocol().equals("HTTP/1.1")) { 
	response.setHeader("Cache-Control", "no-cache"); 
}

	//String saved_sso_id = request.getParameter("sso_id");
%>
<html>
<head>
<script language='JavaScript'>
function logout_proc() {
	var f = document.logout_actor;
	f.action = "<%=sso_domain%>/cert.genics";
	f.submit();
}
</script>
</head>
<table>
<form name="logout_actor" method="post">
<input type='hidden' name='a' value='SsoActionApp'>
<input type='hidden' name='c' value='1002'>
<input type='hidden' name='sso_id' value='<%=sso_id%>'>
<input type='hidden' name='target_url' value='<%=fam_domain %>'>
<input type='hidden' name='action_url' value='<%=fam_domain %>/genics/client_action.jsp'>
<input type='hidden' name='action_type' value='LO'>
</form>
</table>
</html>
<script>
logout_proc();
</script>