<%//@ page contentType="text/html;charset=euc-kr" %>
<%@ include file="/genics/sso_inc/inc_session.jsp" %>
<script type="text/JavaScript">
<!--
	var sso_domain = '<%=sso_domain%>';
//-->
</script>
<%
	response.setHeader("Cache-Control","no-store");   
	response.setHeader("Pragma","no-cache");   
	response.setDateHeader("Expires",0);   
	if (request.getProtocol().equals("HTTP/1.1")) { 
		response.setHeader("Cache-Control", "no-cache"); 
	}
	
	String strLoginId = (String)request.getParameter("user_id");
	String strPassword = (String)request.getParameter("user_passwd");
	String strTargetUrl = (String)request.getParameter("target");
	if(strTargetUrl == null || "".equals(strTargetUrl)) {
		strTargetUrl = fam_domain;
	}
%>
<html>
<head>
<script type="text/JavaScript">
<!--
	function login_proc() {
		var f = document.login_actor;
		f.action = "<%=sso_domain%>/cert.genics";
		f.submit();
	}
	//-->
</script>
</head>
<table>
	<form name="login_actor" method="post">
	<input type='hidden' name='a' value='SsoActionApp'>
	<input type='hidden' name='c' value='1001'>
	<input type='hidden' name='login_id' value='<%=strLoginId%>'>
	<input type='hidden' name='login_pw' value='<%=strPassword%>'>
	<input type='hidden' name='target_url' value='<%=strTargetUrl %>'>
	<input type='hidden' name='action_url' value='<%=fam_domain %>/genics/client_action.jsp'>
	<input type='hidden' name='action_type' value='LI'>
	</form>
</table>
</html>
<script type="text/JavaScript">
<!--
	login_proc();
//-->
</script>