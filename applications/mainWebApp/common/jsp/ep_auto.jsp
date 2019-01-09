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
	// Session ���� ����
	session.invalidate();
	setCookie("SM_USER", "", 0, response);
	setCookie("SMSESSION", "", 0, response);

	String smsession = GetCookie(request, response, "SMSESSION");
	String eip_userid = (request.getParameter ("userId") == null) ? request.getParameter("user_id") : request.getParameter("userId");
	String eip_userpasswd =  (request.getParameter ("userPass") == null) ? request.getParameter("user_passwd") : request.getParameter("userPass");

	String strmainFrame = request.getParameter("url");

	if(eip_userid == null || eip_userid.equals("") || eip_userpasswd == null || eip_userpasswd.equals("")) {
%>
<%--
<script>
	alert("���̵� �н����尡 �Էµ��� �ʾҽ��ϴ�.");
	window.close();
</script>
--%>
<%
	}

//	eip_userid="c153001";
//	eip_userpasswd = "asdf";
System.out.println("smsession  smsession" + smsession);

	if(true) {
//	if(smsession == null || smsession.equals("") || smsession.equals("LOGGEDOFF")) {
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
	    <input type="hidden" name="target" 			value="/common/jsp/ep.jsp?url=<%=strmainFrame%>">
		<input type="hidden" name="smauthreason" 	value="0">
<%--		<input type="hidden" name="url" 			value="/xrw/hd/affr/HD_AFFR_1000.xrw"> --%>
		<input type="hidden" name="user_id" 		value="<%=eip_userid%>" >
		<input type="hidden" name="user_passwd"		value="<%=eip_userpasswd%>" >
	</form>
	</body>
</HTML>
<% 
	} else {
System.out.println("status is in");

	//String domainName = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	String domainName = request.getScheme()+"://"+request.getServerName()+request.getContextPath();

	//String userid = request.getParameter("user_id");
	//String userpasswd = request.getParameter("user_passwd");
	String userid = (request.getParameter ("userId") == null) ? request.getParameter("user_id") : request.getParameter("userId");
	String userpasswd =  (request.getParameter ("userPass") == null) ? request.getParameter("user_passwd") : request.getParameter("userPass");
	
	String configURL  = domainName +"/install/config.xml";
	String configDir  = "/install";
	
	String serverPath = domainName +"/install";

	String intendPath = "";
	
%>
<HTML>
<HEAD>
<TITLE>�����Ϻ��������������ý��� [TFSmartUpdater]</TITLE>
<SCRIPT language="JavaScript">
function window::onLoad(){
	//ȯ�� ���� ����

	var obj = document.myform;
	obj.action = "/common/jsp/ep_auto.jsp?url=<%=strmainFrame%>";
	obj.submit();
	
	//smartUpdater.setCustomDir("{server}", "<%=serverPath%>" );
	//smartUpdater.setCustomDir("{intend}", "c:/install" );
	//smartUpdater.setStyle2("resizable=no, location=no, menubar=no, toolbar=no, status=yes, fullscreen=no");
	//smartUpdater.setIEResizable(false);
	
	
	
	//if (smartUpdater.getConfig("<%=configURL%>")==true)
	//{
	//	var obj = document.myform;
	//	obj.action = "/common/jsp/ep_auto.jsp?url=<%=strmainFrame%>";
	//	obj.submit();
	//}
	//else {
	//	alert("TFSmartUpdater�� ��ġ �� ������ �߻��߽��ϴ�. �����ڿ��� �����Ͻʽÿ�.");
	//}
}
</SCRIPT>
</HEAD>
<BODY>

<form name="myform" method="POST">
<input type="hidden" value="<%=userid%>" name="user_id">
<input type="hidden" value="<%=userpasswd%>" name="user_passwd">
</form>
<%--
<OBJECT id="smartUpdater" classid="CLSID:ED5D862B-6A06-46de-A929-F2C588742CBD" width="0" height="0" CODEBASE="/install/TFSmartUpdater_m.cab#version=2,6,0,9">
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
--%>
</BODY>
</HTML>

<% } %>
