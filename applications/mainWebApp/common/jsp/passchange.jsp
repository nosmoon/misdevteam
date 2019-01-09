<%@ page language="java" contentType="text/html; charset=euc-kr"%>
<%----------------------------------------------------------
* 프로그램명	: passchange.jsp
* 프로그램기능	: B2E 사용자 비밀번호 변경 처리
* 작성일자	: 2004.05.31
* 작성자	: 조은영
* 수정내역	:
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
<html>
<head>
<title>조선일보통합정보지원시스템</title>
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
		alert("회원 ID를 입력해주십시오.");
		n.elements['User'].focus();
		return;
	}
	if (n.elements['Password'].value == ""){
		alert("회원 비밀번호를 입력해주십시오.");
		n.elements['Password'].focus();
		return;
	}

	//트러스트폼 설치및 설치확인
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
          <td><font color="#FF0000">회원아이디가 올바르지 않습니다.</font></td>
        </tr>
<%}else if("2".equals(GetCookie(request, response, "loginstatus"))){%>
        <tr>
          <td><font color="#FF0000">비밀번호가 올바르지 않습니다.</font></td>
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
