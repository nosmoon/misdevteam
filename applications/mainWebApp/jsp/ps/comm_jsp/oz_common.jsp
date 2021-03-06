<%--------------------------------------------------------------------------------------------------
* 파일명   : oz_common.jsp
* 기능     : 오즈 Object 정보
* 작성일자 : 2004-01-20
* 작성자   : 김건호
--------------------------------------------------------------------------------------------------%>
<%--------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
--------------------------------------------------------------------------------------------------%>
<%@ page errorPage="/jsp/ps/comm_jsp/sys_error.jsp"%>
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
		somo.framework.ejb.*,
		somo.framework.prop.*,
		somo.framework.servlet.*,
		somo.framework.lib.*,
        somo.framework.util.*"
%>
<%
System.out.println("oz_common.jsp : =============================================================================start");
    //운영계와 계발계에 따른 오크 component _url 과 _port 설정
    String _url   = request.getRequestURL().toString();

    String _root  = _url.substring(0, _url.indexOf(":",5));
    String _port  = _url.substring(_url.indexOf(":",5) + 1, _url.indexOf("/",7));

    /*_root  = ("80".equalsIgnoreCase(_port))? _root : "http://220.73.135.221" ;
    _port  = ("80".equalsIgnoreCase(_port))? "80" : "8020";

    String ozClasssID = "CLSID:64DA633F-E73B-4344-83BF-48483346CD53" ;                        // 추후 변경시 적용부분
    String ozServerIP = _root + ("80".equals(_port)? "" : ":" + _port) + "/oz30/server" ;     // 추후 변경시 적용부분*/
	//_root  = ("80".equalsIgnoreCase(_port))? _root : "http://220.73.135.221" ;
	//_port  = ("80".equalsIgnoreCase(_port))? "80" : "8020";

	_root  = ("http://ciis.chosun.com".equalsIgnoreCase(_root))? _root : "http://220.73.135.221" ;
  	_port  = ("http://ciis.chosun.com".equalsIgnoreCase(_root))? "80" : "8020";

  	String ozViewerID = "CLSID:64DA633F-E73B-4344-83BF-48483346CD53" ;                        // 뷰어 클래스 아이디
	String ozClasssID = "CLSID:C7C7225A-9476-47AC-B0B0-FF3B79D55E67" ;                        // 추후 변경시 적용부분
	//String ozServerIP = _root + ("80".equals(_port)? "" : ":" + _port) + "/oz30/server" ;     // 추후 변경시 적용부분
  
  	//String ozClasssID = "CLSID:64DA633F-E73B-4344-83BF-48483346CD53" ;                          
	//String ozServerIP = _root + ("80".equals(_port)? "" : ":" + _port) + "/oz30/server" ;     
  	String ozServerIP = _root + ("http://branch.chosun.com".equals(_root)? "" : ":" + _port) + "/oz30/server" ;
  	
  	
System.out.println("_url : "+_url);
System.out.println("_root : "+_root);
System.out.println("_port : "+_port);
System.out.println("ozViewerID : "+ozViewerID);
System.out.println("ozClasssID : "+ozClasssID);
System.out.println("ozServerIP : "+ozServerIP);
System.out.println("oz_common.jsp : =============================================================================end");  	
%>

<HTML>
<HEAD>
    <TITLE>Forcs Application Deploy Sample</TITLE>
</HEAD>
<BODY>
<OBJECT width = "0" height = "0" ID="ZTransferX" CLASSID="CLSID:C7C7225A-9476-47AC-B0B0-FF3B79D55E67" codebase="<%=_root + ("http://branch.chosun.com".equals(_port)? "" : ":" + _port)%>/html/ozactivex/ZTransferX.cab#version=2,1,1,6">
<PARAM NAME="download.Server"		VALUE="<%=_root%>/html/ozactivex">
<PARAM NAME="download.Port" 		VALUE="<%=_port%>">
<PARAM NAME="download.Instruction"  VALUE="OzViewer.idf">
<PARAM NAME="install.Base" 		    VALUE="<PROGRAMS>/Forcs">
<PARAM NAME="install.Namespace" 	VALUE="ChosunCRM_4">
<PARAM NAME="maxconnect" 		    VALUE="20">
</OBJECT>