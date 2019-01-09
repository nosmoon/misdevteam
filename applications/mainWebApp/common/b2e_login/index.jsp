<%
/*
 * -----------------------------------------------------------------------------
 * ���ϸ�  : index.jsp
 * ������  : ������
 * �ۼ���  : ������
 * ����    : �α��� �������� �����Ѵ�.
 * -----------------------------------------------------------------------------
 * �����̷�
 * Version   Date         Description		�ۼ���
 *  1.0.0    2008/10/27   �󼼼��迡 �ǰ�.		������
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
	
	

    // ���޵� ��Ű�� ������ ���� �� �����Ѵ�.
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
<title>�����Ϻ��������������ý���</title>
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
		alert("ȸ�� ID�� �Է����ֽʽÿ�.");
		n.elements['User'].focus();
		return;
	}
	if (n.elements['Password'].value == ""){
		alert("ȸ�� ��й�ȣ�� �Է����ֽʽÿ�.");
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
          <td><font color="#FF0000">ȸ�����̵� �ùٸ��� �ʽ��ϴ�.</font></td>
        </tr>
<%}else if("2".equals(GetCookie(request, response, "logtype"))){%>
        <tr>
          <td><font color="#FF0000">��й�ȣ�� �ùٸ��� �ʽ��ϴ�.</font></td>
        </tr>
<%}%>


Cookie logtype : <%=GetCookie(request, response, "logtype")%><BR>
target site : <%=site%><BR>
logintarget site : <%=logintarget%>

</table>
</body>
</html>