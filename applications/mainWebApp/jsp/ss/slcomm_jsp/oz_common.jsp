<%--------------------------------------------------------------------------------------------------
* ���ϸ�   : oz_common.jsp
* ���     : ���� Object ����
* �ۼ����� : 2004-01-20
* �ۼ���   : ���ȣ
--------------------------------------------------------------------------------------------------%>
<%--------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ���     :
--------------------------------------------------------------------------------------------------%>
<%@ page errorPage="/jsp/ss/comm_jsp/sys_error.jsp"%>
<%@	page import="
		java.sql.*,
		java.text.*,
		java.lang.*,
		java.util.*,
		java.io.*,
		javax.ejb.*,
		somo.framework.db.*,
		somo.framework.expt.*,
		somo.framework.log.*,
		somo.framework.prop.*,
		somo.framework.servlet.*,
		somo.framework.lib.*,
        somo.framework.util.*"
%>
<%
    //���� ��߰迡 ���� ��ũ component _url �� _port ����
    String _url   = request.getRequestURL().toString();

    String _root  = _url.substring(0, _url.indexOf(":",5));
    String _port  = _url.substring(_url.indexOf(":",5) + 1, _url.indexOf("/",7));

    _root  = ("80".equalsIgnoreCase(_port))? _root : "http://220.73.135.221" ;
    _port  = ("80".equalsIgnoreCase(_port))? "80" : "8020";

    String ozClasssID = "CLSID:64DA633F-E73B-4344-83BF-48483346CD53" ;                        // ���� ����� ����κ�
    String ozServerIP = _root + ("80".equals(_port)? "" : ":" + _port) + "/oz30/server" ;     // ���� ����� ����κ�
%>

<HTML>
<HEAD>
	<TITLE>Forcs Application Deploy Sample</TITLE>
</HEAD>
<BODY>
	<OBJECT width = "0" height = "0" ID="ZTransferX" CLASSID="CLSID:C7C7225A-9476-47AC-B0B0-FF3B79D55E67" codebase="<%=_root + ("80".equals(_port)? "" : ":" + _port)%>/html/ozactivex/ZTransferX.cab#version=1,0,1,9">
		<PARAM NAME="download.Server"      VALUE="<%=_root%>/html/ozactivex">
		<PARAM NAME="download.Port"        VALUE="<%=_port%>">
		<PARAM NAME="download.Instruction" VALUE="OzViewer.idf">
		<PARAM NAME="install.Base"         VALUE="<PROGRAMS>/Forcs">
		<PARAM NAME="install.Namespace"    VALUE="ChosunCRM_4">
		<PARAM NAME="debug"                VALUE="TRUE">
	</OBJECT>