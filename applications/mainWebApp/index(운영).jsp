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
	public String getCookie2 (HttpServletRequest req, String name)
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
	response.setHeader("Pragma","No-cache"); //HTTP 1.0 
	response.setDateHeader ("Expires", 0); 
	response.setHeader ("Cache-Control", "no-cache");

	boolean ckid = false;
	String saveUserID = "";

 	if (getCookie2 (request, "saveUserID") != null && !getCookie2 (request, "saveUserID").trim().equals("")) {
		saveUserID = getCookie2 (request, "saveUserID").trim();
	}
	if (getCookie2 (request, "saveID") != null && getCookie2 (request, "saveID").trim().equals("1")) {
		ckid = true;
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>조선일보통합정보지원시스템</title>
<!--link href="/css/login.css" rel="stylesheet" type="text/css"-->
<style type="text/css">
<!--
	form {padding:0px; margin:0px;}
-->
</style>
<SCRIPT language="JavaScript">

window.onload = function(){
	document.myform.elements['user_id'].focus();
}

function login_req(){
	var n = document.myform;
	var pUrl = "";
	var params = "";

	if (n.elements['user_id'].value == ""){
		alert("회원 ID를 입력해주십시오.");
		n.elements['user_id'].focus();
		return;
	}
	if (n.elements['user_passwd'].value == ""){
		alert("회원 비밀번호를 입력해주십시오.");
		n.elements['user_passwd'].focus();
		return;
	}


	if (document.forms.myform.saveID.checked == true) {
		var expdate = new Date (); 
		expdate.setTime(expdate.getTime() + (96 * 60 * 60 * 1000)); 
		SetCookie('saveID', '1', expdate); 
		SetCookie('saveUserID', document.forms.myform.user_id.value, expdate); 
    
	} else {
		document.forms.myform.saveID.checked == false;
    
		var expdate = new Date (); 
		expdate.setTime(expdate.getTime() + (96 * 60 * 60 * 1000)); 
		SetCookie('saveID', '0', null); 
		SetCookie('saveUserID', document.forms.myform.user_id.value, null); 
	}


	//트러스트폼 설치및 설치확인
	var obj = document.myform;
	obj.submit();
	
	//주석처리 노창용 - 2009/01/06
	//obj.action = "/common/jsp/install.jsp";
	//n.action = "/common/jsp/login.jsp";
	//n.submit();
	
//	params += Form.serialize($(n));
//	pUrl = "/common/jsp/login.jsp";
	
//	new ajax.xhr.Request(pUrl, params, login_result, 'POST');
}

function login_result(req){
	if (req.readyState == 4) {
		if (req.status == 200) {
			var xmlDoc = req.responseXML;
			var code = xmlDoc.getElementsByTagName('code').item(0).firstChild.nodeValue;
			var msg = xmlDoc.getElementsByTagName('message').item(0).firstChild.nodeValue;

			if (code == '00') {	
				var fData = eval("(" + xmlDoc.getElementsByTagName('data').item(0).firstChild.nodeValue + ")");
				document.location.href = fData[0].user_url;
			}
		} else {
			alert("error:login_result." + req.status);
		}
	}
}

function KeyChk(){
	var temp=parseInt(event.keyCode);
	
	if (temp==13){
		login_req();
	}
}

function ModifySSOpasswd() {
	//location.href = "/common/jsp/passchange.jsp";
	//var url = "http://implus.chosun.com:40003/IMPlus/ext/ChosunPortalLink.jsp";
	var url = "http://ciis.chosun.com/common/jsp/passchange.jsp";
	window.open(url,"SSOpasswd_win","width=900,height=630,status=yes,scrollbars=no,resizable");
}
 
function id_cookie_alert()
{
	if (document.forms.myform.saveID.checked == true) {
		alert("여러 사람이 이용하는 공공장소(PC방, 학교, 회사 등)에서 쿠키를 저장하지 않는 것이 안전합니다.");
		//document.cookie = "saveID =" + escape( 1 ) + "; path=/; ";

		var expdate = new Date (); 
		expdate.setTime(expdate.getTime() + (96 * 60 * 60 * 1000)); 
		SetCookie('saveID', '1', expdate); 
		SetCookie('saveUserID', document.forms.myform.user_id.value, expdate); 

	} else {
		document.forms.myform.saveID.checked == false;
		//document.cookie = "saveID =" + escape( 0 ) + "; path=/; ";

		var expdate = new Date (); 
		expdate.setTime(expdate.getTime() + (96 * 60 * 60 * 1000)); 
		SetCookie('saveID', '0', null); 
		SetCookie('saveUserID', document.forms.myform.user_id.value, null); 

	}
}

function SetCookie( name, value, expires) 
{
	var argv 	= SetCookie.arguments;
	var argc 	= SetCookie.arguments.length;
	var expires = expires;
	var path 	= "/";
	var domain 	= ".chosun.com";
	var secure	= (argc > 5) ? argv[5] : false;

	document.cookie = name + "=" + escape (value) +
		((expires == null) ? "" : ("; expires=" + expires.toGMTString())) +
		((path == null) ? "" : ("; path=" + path)) +
		((domain == null) ? "" : ("; domain=" + domain));

} 
</script>
<script language="javascript">
//온로드에서 로긴시로 변경
//function window::onLoad(){
//	//환경 변수 설정
//	var obj = document.myform;
//	obj.action = "install.jsp";
//	obj.submit();
//}

//TFBroker 설치 (vista에서 필요)
var BROKER_CLSID = "clsid:0DFA67D7-B78C-40A7-B583-E7090D5F38C6";
var BROKER_CODEBASE = "/install/TFBroker.cab";
var BROKER_VERSION = "version=1,0,0,4";
var Str="";

if( navigator.userAgent.indexOf("Windows NT 6.") != -1 ){
	Str+= ' <object id="BROKER" classid="' + BROKER_CLSID + '"';
	Str+= '\n\t codebase="' + BROKER_CODEBASE + '#' + BROKER_VERSION + '"';
	Str+= '\n\t height="0" width="0" >';
	Str+= '\n\tNo BROKER Plugin';
	Str+= '\n</object>';
}
document.write(Str);
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
					<td background="/images/login_img_04.gif" valign="bottom" style="padding-bottom:9px;" >
						<form name="myform" action="/genics/login_proc.jsp" method='post'>
						<input name="smauthreason" type="hidden" value="0">
							<table>
								<tr>
<%--									<td><input type="text"     name="user_id" 		size="10" value="" style="width:110px;font-size: 15px;font-weight: bold;IME-MODE:inactive;" /><br>  --%>
									<td><input type="text"     name="user_id" 		size="10" value="<% if (ckid) out.println(saveUserID); %>" style="width:110px;font-size: 15px;font-weight: bold;IME-MODE:inactive;" / >
										<input type="checkbox" name="saveID"  		value=""  <% if (ckid) out.println("checked"); %>  onClick="id_cookie_alert()">ID저장<br>
										<input type="password" name="user_passwd"	value=""  size="10" style="width:110px;font-size: 15px;font-weight: bold;IME-MODE:inactive;" OnKeyPress="JavaScript:KeyChk();" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
									</td>
									<td><img src="/images/login_btn_01.gif" onclick="login_req()"  style="cursor:hand"></td>
									<td><img src="/images/login_btn_02.gif" onclick="ModifySSOpasswd()" style="cursor:hand"><br>
										<img src="/images/login_btn_03.gif">
									</td>
								</tr>
							</table>
						</form>
					</td>
				</tr>
<%if("1".equals(GetCookie(request, response, "loginstatus"))){%>
        <tr>
          <td><font color="#FF0000">회원아이디가 올바르지 않습니다..</font></td>
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
<% //---------------------- GENICS ASSOCIATE ------------------------// %> 
<%@ include file="/genics/sso_inc/inc_agent2.jsp" %>
<% //---------------------- GENICS ASSOCIATE ------------------------// %> 