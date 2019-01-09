<%@ page contentType="text/html; charset=KSC5601" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : logout.jsp
* 기능 : 
* 작성일자 : 
* 작성자 : 
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
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
	// Session 정보 제거
	session.invalidate();
	setCookie("SM_USER", "", 0, response);
	setCookie("SMSESSION", "LOGGEDOFF", -1, response);
%>
<html>
<head>
<script language="JavaScript">
<!--

// 로그인
function logout()
{
	// 로그인 페이지 이동
    top.location.replace("/index.jsp");
}
-->
</script>
</head>
<body onload="logout()">
<body>
</html>