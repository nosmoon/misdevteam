<%@ page contentType="text/html;charset=euc-kr" %>
<% request.setCharacterEncoding("euc-kr"); %>
<%
	String sso_token = (String)request.getParameter("sso_token");
	
	String fs = (String)request.getParameter("fs");
	
	String ip = (String)request.getParameter("ip");
	
	String msg = (String)request.getParameter("msg");
%>
<script type="text/JavaScript">
	parent.parent.BSSO_sso_process('<%=sso_token%>', '<%=fs%>', '<%=ip%>', '<%=msg%>');
</script>