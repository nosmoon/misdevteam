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
String token_session = (String)session.getAttribute("ENC_TOKEN"); // ������������ ������ ������ū��
String sso_session = (String)session.getAttribute("SSO_INFO");  // ������������ ���輭���� �Ѱ��ִ� ����� ����
String sp_session = (String)session.getAttribute("SP_SESSION"); // �ش�ý��� ��������(�޴��� ���ѵ�):SP=Service Provider
String sso_id = null;
String req_url = request.getRequestURL().toString();
//String message = " IP ��ǻ�Ϳ��� �α����� �Ͽ����ϴ�. �ý��۰����ڿ��� �����Ͻñ� �ٶ��ϴ�.";

if(sso_session != null && !"".equals(sso_session) && !"null".equals(sso_session)) {
	String[] ssoInfos	= sso_session.split("\\$\\$");
	sso_id = ssoInfos[1];
}
%>