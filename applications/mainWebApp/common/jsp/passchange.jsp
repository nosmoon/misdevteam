<%@ page language="java" contentType="text/html; charset=euc-kr"%>
<%----------------------------------------------------------
* ���α׷���	: passchange.jsp
* ���α׷����	: B2E ����� ��й�ȣ ���� ó��
* �ۼ�����	: 2004.05.31
* �ۼ���	: ������
* ��������	:
----------------------------------------------------------%>
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
<html>
<head>
<title>�����Ϻ��������������ý���</title>
<link href="/css/login.css" rel="stylesheet" type="text/css"/>
<style type="text/css">
<!--
	form {padding:0px; margin:0px;}
-->
</style>
<SCRIPT language="JavaScript">

window.onload = function(){
	document.myform.elements['User'].focus();
}

function login_req(){
	var n = document.myform;
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

	//Ʈ����Ʈ�� ��ġ�� ��ġȮ��
	var obj = document.myform;
	obj.submit();

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
					<td background="/images/login_img_04.gif" valign="bottom" style="padding-bottom:9px;" >
						<form name="myform" action="http://membership.chosun.com/b2e_login/login_forward.jsp">
					    <input name="target" type="hidden" value="http://membership.chosun.com/b2e_login/getHeader.jsp">
						<input name="smauthreason" type="hidden" value="0">
						<input name="site" type="hidden" value="http://iam.chosun.com/IMPlus/ext/ChosunPortalLink.jsp">
							<table>
								<tr>
									<td><input type="text" value="" name="User" size="20" style="width:150px; height:18px;" /><br>
										<input type="password" value="" name="Password" size="20" style="width:150px; height:18px;" OnKeyPress="JavaScript:KeyChk();" />
									</td>
<%--									<td><img src="/images/login_btn_01.gif" onclick="login_req()"  style="cursor:hand"></td> --%>
									<td><img src="/images/login_btn_02.gif" onclick="login_req()" style="cursor:hand"> 
									</td>
								</tr>
							</table>
						</form>
					</td>
				</tr>
<%if("1".equals(GetCookie(request, response, "loginstatus"))){%>
        <tr>
          <td><font color="#FF0000">ȸ�����̵� �ùٸ��� �ʽ��ϴ�.</font></td>
        </tr>
<%}else if("2".equals(GetCookie(request, response, "loginstatus"))){%>
        <tr>
          <td><font color="#FF0000">��й�ȣ�� �ùٸ��� �ʽ��ϴ�.</font></td>
        </tr>
<%}%>

				<tr>
					<td><img src="/images/login_img_05.gif"></td>
					<td><img src="/images/login_img_06.gif"></td>
				</tr>
			</table>
		</td>
	</tr>
</table>
</body>
</html>