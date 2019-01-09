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
<%
	response.setHeader("Pragma","No-cache"); //HTTP 1.0 
	response.setDateHeader ("Expires", 0); 
	response.setHeader ("Cache-Control", "no-cache");

	if (session.getAttribute("user_auth") != null){
		response.sendRedirect("/common/jsp/main.jsp"); 
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>조선일보통합정보지원시스템</title>
<link href="/css/login.css" rel="stylesheet" type="text/css"/>
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
		n.elements['mb_passwd'].focus();
		return;
	}

	//트러스트폼 설치및 설치확인
	var obj = document.myform;
	obj.action = "/common/jsp/install.jsp";
	//obj.action = "/common/jsp/login.jsp";
	obj.submit();
	//주석처리 노창용 - 2009/01/06
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
					<td background="/images/login_img_04.gif" valign="bottom">
						<form name="myform" action="#">
							<table>
								<tr>
									<td><input type="text" value="c190053" name="user_id" size="20" /><br>
										<input type="password" value="c190053" name="user_passwd" size="20" OnKeyPress="JavaScript:KeyChk();" />
									</td>
									<td><img src="/images/login_btn_01.gif" onclick="login_req()"></td>
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
</table>
</body>
</html>