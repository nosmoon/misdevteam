<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import="genics.cryptography.StringEncrypter" %>
<%@ page import="java.net.URLDecoder" %>
<%
	request.setCharacterEncoding("euc-kr");
	
	String action_type = request.getParameter("action_type");
	//String target_url = request.getParameter("target_url");
	String target_url = "/common/jsp/main_test_genics.jsp";
	String enc_token = request.getParameter("enc_token");
	String sso_info = request.getParameter("sso_info");

	if(action_type == null) {
		action_type = "";
	}
	
	if("LI".equals(action_type) || "XX".equals(action_type)) {

		enc_token = request.getParameter("enc_token");
		sso_info = request.getParameter("sso_info");
		
%>
<%@ include file="/genics/sso_info/genics_sso.jsp" %>
<%
	}
	
	if("LO".equals(action_type)) { // 2. 로그아웃 요청인 경우
		// 해당 Client 시스템의 기존 세션정보를 지운다.
		session.invalidate();
		target_url = "/common/jsp/logclose.jsp";
	}
%>
<html>
<head></head>
<body>
<form name="client_action" method="post" action="<%=target_url%>">
<input type="hidden" name="target_url" value="<%=target_url%>">
</form>
<script type="text/JavaScript">
<!--
	var f = document.client_action;
	f.target = '_top';
	f.submit();
//-->
</script>
</body>
</html>
