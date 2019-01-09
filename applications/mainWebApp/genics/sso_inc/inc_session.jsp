<%@ page import="java.net.URL" %>
<%
request.setCharacterEncoding("euc-kr");
response.setHeader("Cache-Control","no-store");   
response.setHeader("Pragma","no-cache");   
response.setDateHeader("Expires",0);   
if (request.getProtocol().equals("HTTP/1.1")) { 
	response.setHeader("Cache-Control", "no-cache"); 
}

String sso_domain = "http://sso2.chosun.com";
String fam_domain = "http://"+request.getServerName();
String server_url = "http://"+request.getServerName();
String file_ext = "jsp";
String token_session = (String)session.getAttribute("ENC_TOKEN"); // 인증서버에서 셋팅한 인증토큰값
String sso_session = (String)session.getAttribute("SSO_INFO");  // 인증서버에서 연계서버로 넘겨주는 사용자 정보
String sp_session = (String)session.getAttribute("SP_SESSION"); // 해당시스템 업무세션(메뉴나 권한등):SP=Service Provider
String sso_id = null;
String req_url = request.getRequestURL().toString();
//String message = " IP 컴퓨터에서 로그인을 하였습니다. 시스템관리자에게 문의하시기 바랍니다.";

if(sso_session != null && !"".equals(sso_session) && !"null".equals(sso_session)) {
	String[] ssoInfos	= sso_session.split("\\$\\$");
	sso_id = ssoInfos[1];
}
%>