<%@ page contentType="text/html; charset=EUC-KR" %>
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
System.out.println("smsession  1111");
	String smsession = GetCookie(request, response, "SMSESSION");
	String eip_userid = (request.getParameter ("userId") == null) ? request.getParameter("user_id") : request.getParameter("userId");
	String eip_userpasswd =  (request.getParameter ("userPass") == null) ? request.getParameter("user_passwd") : request.getParameter("userPass");
System.out.println("smsession  smsession" + smsession);
	if(smsession == null || smsession.equals("") || smsession.equals("LOGGEDOFF")) {
//	if(smsession == null || smsession.equals("")) {
System.out.println("status is out" + eip_userid + " : " + eip_userpasswd );
%>
<HTML>
<HEAD>
<TITLE>EIP->AUTO_LOGIN</TITLE>
<SCRIPT language="JavaScript">
//function window::onLoad(){
//		var obj = document.myform2;
//		obj.action = "/common/jsp/login.jsp";
//		obj.submit();
//}
</SCRIPT>
</HEAD>
	<body onload="javascript:document.myform2.submit();">
	<form name="myform2" method="post" action="/common/jsp/login.jsp">
	    <input type="hidden" name="target" 			value="/common/jsp/bridge.jsp">
		<input type="hidden" name="smauthreason" 	value="0">
		<input type="hidden" name="user_id" 		value="<%=eip_userid%>" >
		<input type="hidden" name="user_passwd"		value="<%=eip_userpasswd%>" >
	</form>
	</body>
</HTML>
<% 
	} else {
System.out.println("status is in");

	String domainName = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	
	String userid = request.getParameter("user_id");
	String userpasswd = request.getParameter("user_passwd");
	
	String configURL  = domainName +"/install/config.xml";
	String configDir  = "/install";
	
	String serverPath = domainName +"/install";

	String intendPath = "";
	
%>
<HTML>
<HEAD>
<TITLE>조선일보통합정보지원시스템 [TFSmartUpdater]</TITLE>
<SCRIPT language="JavaScript">
function window::onLoad(){
	//환경 변수 설정
	
	smartUpdater.setCustomDir("{server}", "<%=serverPath%>" );
	smartUpdater.setCustomDir("{intend}", "c:/install" );
	//smartUpdater.setStyle2("resizable=no, location=no, menubar=no, toolbar=no, status=yes, fullscreen=no");
	//smartUpdater.setIEResizable(false);
	
	
	
	if (smartUpdater.getConfig("<%=configURL%>")==true)
	{
		var obj = document.myform;
		obj.action = "/common/jsp/bridge.jsp";
		obj.submit();
	}
	else {
		alert("TFSmartUpdater가 설치 중 에러가 발생했습니다. 관리자에게 문의하십시오.");
	}
}
</SCRIPT>
</HEAD>
<BODY>

<form name="myform" method="POST">
<input type="hidden" value="<%=userid%>" name="user_id">
<input type="hidden" value="<%=userpasswd%>" name="user_passwd">
</form>

<OBJECT id="smartUpdater" classid="CLSID:ED5D862B-6A06-46de-A929-F2C588742CBD" width="0" height="0" CODEBASE="/install/TFSmartUpdater_m.cab#version=2,6,3,5">
	<PARAM name="deleteZipFile" value="true"/>
	<PARAM name="registry" value="false"/>
	<PARAM name="configDir" value="c:\install"/>
	<PARAM name="enableLog" value ="true"/>
	<PARAM name="selfUi" value="true"/>
	<PARAM name="dlgNotClose" value="true"/>
	<PARAM name="hideDownloadCancel" value="true"/>
	<PARAM name="stopNotFindContent" value="false"/>
	<PARAM name="useNameTarget" value="true"/>
</OBJECT>
</BODY>
</HTML>

<% } %>
