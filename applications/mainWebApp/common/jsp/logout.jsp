<%@ page contentType="text/html; charset=KSC5601" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : logout.jsp
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%!
	public void setCookie(String s, String s1, int i, javax.servlet.http.HttpServletResponse res)
	{
		Cookie cookie = new Cookie(s, s1);
		cookie.setDomain(".chosun.com");
		cookie.setPath("/");
		cookie.setMaxAge(i);
		res.addCookie(cookie);
	} 	 

	public String getCookie (HttpServletRequest req, String name)
	{
		Cookie[] cookies = req.getCookies();
		String tmp = "";

		if ( cookies != null ) {
			for ( int i = 0; i < cookies.length; i++ ) {
				if ( cookies[i].getName().equals(name) ) {
					tmp = cookies[i].getValue();
					break;
				}
			}
		}
		return tmp;
	}
%>
<%
	// Session ���� ����
	session.invalidate();
	setCookie("SM_USER", "", 0, response);
	setCookie("SMSESSION", "LOGGEDOFF", -1, response);
%>
<html>
<head>
<script language="JavaScript">
<!--

// �α���
function logout()
{
	// �α��� ������ �̵�
    top.location.replace("/index.jsp");
}
-->
</script>
</head>
<body onload="logout()">
<body>
</html>