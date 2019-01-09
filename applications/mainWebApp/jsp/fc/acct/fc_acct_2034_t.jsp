<%@ page contentType="text/html; charset=EUC-KR" %>
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
    //운영계와 계발계에 따른 오크 component _url 과 _port 설정
    String _url   = request.getRequestURL().toString();

    String _root  = _url.substring(0, _url.indexOf(":",5));
    String _port  = _url.substring(_url.indexOf(":",5) + 1, _url.indexOf("/",7));

    //_root  = ("80".equalsIgnoreCase(_port))? _root : "http://220.73.135.221" ;  //educrm.chosun.com으로 변경됨
    //_port  = ("80".equalsIgnoreCase(_port))? "80" : "8020";

    _root  = ("http://agency.chosun.com".equalsIgnoreCase(_root))? _root : "http://220.73.135.221" ;
    _port  = ("http://agency.chosun.com".equalsIgnoreCase(_root))? "80" : "8020";

    String ozClasssID = "CLSID:64DA633F-E73B-4344-83BF-48483346CD53" ;                          // 추후 변경시 적용부분
//    String ozServerIP = _root + ("80".equals(_port)? "" : ":" + _port) + "/oz30/server" ;     // 추후 변경시 적용부분
    String ozServerIP = _root + ("http://agency.chosun.com".equals(_root)? "" : ":" + _port) + "/oz30/server" ;     // 추후 변경시 적용부분

	 System.out.println("alsl::::");
%>
<HTML>
<HEAD>
    <TITLE>Forcs Application Deploy Sample</TITLE>
</HEAD>
<BODY>
    <OBJECT width = "0" height = "0" ID="ZTransferX" CLASSID="CLSID:C7C7225A-9476-47AC-B0B0-FF3B79D55E67" codebase="<%=_root + ("http://agency.chosun.com".equals(_port)? "" : ":" + _port)%>/html/ozactivex/ZTransferX.cab#version=2,1,1,6">
        <PARAM NAME="download.Server"      VALUE="<%=_root%>/html/ozactivex">
        <PARAM NAME="download.Port"        VALUE="80">
        <PARAM NAME="download.Instruction" VALUE="OzViewer.idf">
        <PARAM NAME="install.Base"         VALUE="<PROGRAMS>/Forcs">
        <PARAM NAME="install.Namespace"    VALUE="ChosunCRM_4">
       	<param NAME="maxconnect" 					 VALUE="20">
        <PARAM NAME="debug"                VALUE="TRUE">
    </OBJECT>

<%
    //Session process
    String bocd      = "19110";          //지국지사코드
    String url       = request.getRequestURI();                                       //프로그램명
    String uid       = "191101";           //사용자아이디
    String bonm      = "신염창";          //지국명
    String sysDate = Util.getDate(); // 엑셀화일 저장시 파일이름으로 사용

    //request process
    String medicd   = "110";   //매체코드(리스트)

    String dstccd   = ""; 	//구역코드(리스트)
    String frbno 	= ""; 	//시작배달번호(리스트)
    String tobno 	= "";  	//종료배달번호(리스트)
    String freecd 	= "";  //유가,준유가,무가(0,1,2)(리스트)
    String dlvmth 	= "";  //배달방법(리스트)
    String rdrnmyn  = "";  //독자명출력

    String subsumyn = "";  //소계출력여부
    String cnclyn   = "";  //중지독자포함
    String line     = "";  //라인간격

    String remkyn   = "";  //비고 출력
    
    String rpttp   = "";     //비고 출력

    String paper   = "";     //용지선택 (0:A4, 1:80컬럼 연속)
    //rdrnmyn = ("".equals(rdrnmyn))? "0":rdrnmyn;
    //rdrnmyn = "1"; //독자명은 항상 출력 됨
    // 독자명은 항상 출력되므로 전화번호 출력여부로 대체하여 사용함.(독자명 출력여부는 단축명단에서만 사용)
    rdrnmyn = rpttp;
    rpttp = "0";
    subsumyn = ("".equals(subsumyn))? "0":subsumyn;
    cnclyn = ("".equals(cnclyn))? "0":cnclyn;
    remkyn = ("".equals(remkyn))? "0":remkyn;
	rpttp = ("".equals(rpttp))? "0":rpttp;

    String filename = "";
    String papername = "A4";
    filename = ("1".equals(paper))? "SP_SL_P_NWSPRDR_LIST_1" : "SP_SL_P_NWSPRDR_LIST";
    papername = ("1".equals(paper))? "US std Fanfold" : papername;
%>
    <OBJECT width = "800" height = "600" CLASSID="<%=ozClasssID%>">
        <param name="connection.servlet"              		value="<%=ozServerIP%>">
        <param name="connection.reportname"           		value="<%=filename%>.ozr">
        <param name="print.size"                            value="<%=papername%>">
        <param name="odi.odinames"                    		value="SP_SL_P_NWSPRDR_LIST">
		<!--PARAM NAME="connection.usewinhttp" VALUE="true"-->
        <param name="connection.pcount" 					value="6">
        <param name="connection.args1" 	value="sv_url=<%=url%>">
        <param name="connection.args2" 	value="sv_uid=<%=uid%>">
        <param name="connection.args3" 	value="sv_bonm=<%=bonm%>">
        <param name="connection.args4" 	value="uv_line=<%=line%>">
        <param name="connection.args5" 	value="uv_cnclyn=<%=cnclyn%>">
        <param name="connection.args6" 	value="uv_summary=<%=subsumyn%>">
        <param name="odi.SP_SL_P_NWSPRDR_LIST.pcount" 		value="10">
        <param name="odi.SP_SL_P_NWSPRDR_LIST.args1"  		value="iv_bocd=<%=bocd%>">
        <param name="odi.SP_SL_P_NWSPRDR_LIST.args2"  		value="iv_medicd=<%=medicd%>">
        <param name="odi.SP_SL_P_NWSPRDR_LIST.args3"  		value="iv_dstccd=<%=dstccd%>">
        <param name="odi.SP_SL_P_NWSPRDR_LIST.args4"  		value="iv_frbno=<%=frbno%>">
        <param name="odi.SP_SL_P_NWSPRDR_LIST.args5"  		value="iv_tobno=<%=tobno%>">
        <param name="odi.SP_SL_P_NWSPRDR_LIST.args6"  		value="iv_freecd=<%=freecd%>">
        <param name="odi.SP_SL_P_NWSPRDR_LIST.args7"  		value="iv_dlvmth=<%=dlvmth%>">
        <param name="odi.SP_SL_P_NWSPRDR_LIST.args8"  		value="iv_rdrnmyn=<%=rdrnmyn%>">
        <param name="odi.SP_SL_P_NWSPRDR_LIST.args9"  		value="iv_rpttp=<%=rpttp%>">
        <param name="odi.SP_SL_P_NWSPRDR_LIST.args10"  		value="iv_remkyn=<%=remkyn%>">
        <param name="applet.configmode"               		value="html">
        <param name="applet.isframe"                  		value="true">
        <param name="applet.mode"                     		value="preview">
    </OBJECT>
</BODY>
</HTML>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	
	dataSet = rx.add(root, "dataSet", "");	
	
	rx.add(dataSet, "errcode", errcode);
	rx.add(dataSet, "errmsg", errmsg);
	
	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());
%>