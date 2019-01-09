<%@ page import = "java.util.*,java.io.*,java.net.*" contentType="text/html; charset=euc-kr" %>
<%!
    // 전달된 쿠키에 설정된 값을 얻어서 리턴한다.
    public String GetCookie(HttpServletRequest req, HttpServletResponse res, String param) throws Exception{
        String ret = "";
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for(int i=0; i<cookies.length; i++){
                if(cookies[i].getName().equals(param)){
                    ret = cookies[i].getValue();
					break;
                }
            }
        }
        return ret;
    }

public void setCookie(String s,
					  String s1,
					  String s2,
					  int i,
					  javax.servlet.http.HttpServletResponse response)
{
    Cookie cookie = new Cookie(s, URLEncoder.encode(s1));
    if(!s2.equals("")) cookie.setDomain(s2);
	cookie.setMaxAge(i);
	cookie.setPath("/");
	response.addCookie(cookie);
}

public void delCookie(javax.servlet.http.HttpServletRequest request,
					  javax.servlet.http.HttpServletResponse response,
					  String s)
{
    setCookie(s, "", request.getHeader("SM_SDOMAIN"), 0, response);
}


%>
<%
	Enumeration enum = request.getHeaderNames();
	while (enum.hasMoreElements()) {
		String name  = (String) enum.nextElement();
		String value = (String) request.getHeader(name);
		System.out.println(name + " : " + value );
		
		if ( value != null ) {
//			out.println("<br><font color=red><b>" + name + "</b></font> : " + value + " ");
		}
	}
	
%>
<% 

String returl = request.getParameter("site");
	String uid			= request.getHeader("UID")   		== null ? "" :  request.getHeader("UID"); 		 	  // 아이디

setCookie("cognos_uid", uid,".chosun.com",  -1, response);
setCookie("uid", uid,".chosun.com",  -1, response);

System.out.println("cogno : "+ uid);

    // LDAP 사용자 정보 Session 처리
    session.setAttribute("uid"          ,uid        );      // 아이디

%>

<%
	if("1".equals(GetCookie(request, response, "logtype"))){
		delCookie(request,response,"logtype");
%>

<%--
        <tr>
          <td><font color="#FF0000">회원아이디가 올바르지 않습니다.</font></td>
        </tr>
--%>

<%
	} else if("2".equals(GetCookie(request, response, "logtype"))){
		delCookie(request,response,"logtype");

%>
<%--
        <tr>
          <td><font color="#FF0000">비밀번호가 올바르지 않습니다.</font></td>
        </tr>
--%>
<% } %>
<form  name="getHeader" method="post" action="<%=returl%>" >
	<input type="hidden" name="uid" value="<%=uid%>">
</form>

<script language="javascript">
	document.getHeader.submit();
</script>

<%-- <meta http-equiv="Refresh" Content="0;url=<%=returl% >"> --%>