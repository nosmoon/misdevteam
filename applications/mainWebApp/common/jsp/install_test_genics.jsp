<%@ page contentType="text/html; charset=EUC-KR" %>
<%
	String domainName = request.getScheme()+"://"+request.getServerName()+request.getContextPath(); // ":"+request.getServerPort()+
	
	String userid = request.getParameter("user_id");
	String userpasswd = request.getParameter("user_passwd");
	
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
		alert("TFSmartUpdater�� ��ġ �� ������ �߻��߽��ϴ�. �����ڿ��� �����Ͻʽÿ�.");
	}
}
</SCRIPT>
</HEAD>
<BODY>

<form name="myform" method="POST">
<input type="hidden" value="<%=userid%>" name="user_id">
<input type="hidden" value="<%=userpasswd%>" name="user_passwd">
</form>

<OBJECT id="smartUpdater" classid="CLSID:ED5D862B-6A06-46de-A929-F2C588742CBD" width="0" height="0" CODEBASE="/install/TFSmartUpdater_m.cab#version=2,6,1,5">
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