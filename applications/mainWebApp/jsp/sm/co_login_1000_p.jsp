<%---------------------------------------------------------------------------------------------------
* ���ϸ� : co_login_1000_p.jsp 
* ��� : �α��� - ��й�ȣ ���� ��󿩺� Ȯ��
* �ۼ����� : 2006-01-05
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
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

	//�Է°��� ���ٸ� �������� �̵��Ѵ�
	if (loginid.equals("") || loginpwd.equals("")) {
		out.println ("<script language=javascript>\n<!--");
		out.println ("alert (\"�Է°��� �����ϴ�\");\n");
		out.println ("	location.href = \"/\";");
		out.println ("//-->\n</script>");
	}

	boolean auth = false, result = false;
	
	//���̵�, ��й�ȣ ��ġ���θ� Ȯ���Ѵ�
	auth = authUser.isAuth (loginid, loginpwd);
	
	//��й�ȣ ���� ��󿩺θ� Ȯ���Ѵ�
	if (auth)		result = authUser.isTarget (loginid, loginpwd, -30);
%>
<% if (result) {  %>
<script language=javascript>
<!--
	alert ("��й�ȣ ��ȿ�Ⱓ�� ����Ǿ��ų� ���� �α����Դϴ�. ��й�ȣ�� ������ �ּ���.");
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