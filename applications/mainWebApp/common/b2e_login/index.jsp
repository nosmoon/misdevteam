<%
/*
 * -----------------------------------------------------------------------------
 * 파일명  : index.jsp
 * 설계자  : 양정녕
 * 작성자  : 양정녕
 * 설명    : 로그인 페이지를 구성한다.
 * -----------------------------------------------------------------------------
 * 수정이력
 * Version   Date         Description		작성자
 *  1.0.0    2008/10/27   상세설계에 의거.		양정녕
 * -----------------------------------------------------------------------------
 */
%>
<%@ page import = "java.util.*,java.net.*" %>
<%@ page language="java" contentType="text/html; charset=euc-kr"%>
<%!
	public void setCookie(String s, String s1, int i, javax.servlet.http.HttpServletResponse res)
	{
		Cookie cookie = new Cookie(s, s1);
		cookie.setDomain(".chosun.com");
	
		if ( i != 1 )
			cookie.setMaxAge(i);
	
		cookie.setPath("/");
		res.addCookie(cookie);
	} 	 
	
	

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

%>
<%
	String loginid = (request.getParameter ("User") == null) ? "" : request.getParameter("User").trim();
	String loginpwd = (request.getParameter ("Password") == null) ? "" : request.getParameter("Password").trim();
	String loginurl = (request.getParameter ("URL") == null) ? "" : request.getParameter("URL").trim();
	String logintarget = (request.getParameter ("target") == null) ? "" : request.getParameter("target").trim();
	if(logintarget.equals("")) {
		logintarget = (request.getParameter ("TARGET") == null) ? "" : request.getParameter("TARGET").trim();
	}

	if (!logintarget.equals(""))			logintarget = java.net.URLDecoder.decode(logintarget);
	else									logintarget = "/";

	//2006.03.13
/*
	if (logintarget.indexOf("$") != -1) {
		logintarget = utils.aTob (logintarget, "$", "");
	}
	if (logintarget.indexOf("SM") != -1) {
		logintarget = utils.aTob (logintarget, "SM", "");
	}
*/
	String site= (request.getParameter ("site") == null) ? logintarget : request.getParameter("site").trim();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>조선일보통합정보지원시스템</title>
<link href="/css/login.css" rel="stylesheet" type="text/css"/>
<SCRIPT language="JavaScript">

window.onload = function(){
	document.form.elements['User'].focus();
}

function login_req(){
	var n = document.form;
	var pUrl = "";
	var params = "";

	if (n.elements['User'].value == ""){
		alert("회원 ID를 입력해주십시오.");
		n.elements['User'].focus();
		return;
	}
	if (n.elements['Password'].value == ""){
		alert("회원 비밀번호를 입력해주십시오.");
		n.elements['Password'].focus();
		return;
	}
	n.submit();
 
}
 
function KeyChk(){
	var temp=parseInt(event.keyCode);
	
	if (temp==13){
		login_req();
	}
}
</script>
 </head>
<body border="0" leftmargin="0" topmargin="0" rightmargin="0" bottommargin="0" cellpadding="0" cellspacing="0" scroll="no"> 
<br>
<br>
<br>
<br>
<table width="100%" height="100%">
	<tr>
		<td align="center" valign="middle">
			<table cellSpacing="0" cellPadding="0" border="0">
				<tr>
					<td><img src="/images/login_img_01.gif"></td>
					<td><img src="/images/login_img_02.gif"></td>
				</tr>
				<tr>
					<td><img src="/images/login_img_03.gif"></td>
					<td background="/images/login_img_04.gif" valign="bottom">
						<form name="form" method="post" action="http://ciis.chosun.com/common/b2e_login/login_forward.jsp">
					    	<input name="target" type="hidden" value="http://ciis.chosun.com/common/b2e_login/getHeader.jsp">
					    	<input name="smauthreason" type="hidden" value="0">
							<input type="hidden" name="site" value="<%=site%>">

							<table>
								<tr>
									<td><input type="text" value="<%=loginid%>" name="User" size="20" /><br>
										<input type="password" value="<%=loginpwd%>" name="Password"  size="20" OnKeyPress="JavaScript:KeyChk();" >
									</td>
									<td> <!--<img src="/images/login_btn_01.gif" onclick="javascript:login_req()"> -->
										<input type="image" tabIndex="3" onclick="javascript:login_req();window.event.returnValue=false;" src="/images/login_btn_01.gif" >
									</td>
									<td><img src="/images/login_btn_02.gif"><br>
										<img src="/images/login_btn_03.gif">
									</td>
								</tr>
							</table>
						</form>
					</td>
				</tr>
				<tr>
					<td><img src="/images/login_img_05.gif"></td>
					<td><img src="/images/login_img_06.gif"></td>
				</tr>
			</table>
		</td>
	</tr>


<%if("1".equals(GetCookie(request, response, "logtype"))){%>
        <tr>
          <td><font color="#FF0000">회원아이디가 올바르지 않습니다.</font></td>
        </tr>
<%}else if("2".equals(GetCookie(request, response, "logtype"))){%>
        <tr>
          <td><font color="#FF0000">비밀번호가 올바르지 않습니다.</font></td>
        </tr>
<%}%>


Cookie logtype : <%=GetCookie(request, response, "logtype")%><BR>
target site : <%=site%><BR>
logintarget site : <%=logintarget%>

</table>
</body>
</html>