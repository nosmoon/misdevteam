<%@ page contentType="text/html; charset=EUC-KR" %>
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
    //���� ��߰迡 ���� ��ũ component _url �� _port ����
    String _url   = request.getRequestURL().toString();

    String _root  = _url.substring(0, _url.indexOf(":",5));
    String _port  = _url.substring(_url.indexOf(":",5) + 1, _url.indexOf("/",7));

    //_root  = ("80".equalsIgnoreCase(_port))? _root : "http://220.73.135.221" ;  //educrm.chosun.com���� �����
    //_port  = ("80".equalsIgnoreCase(_port))? "80" : "8020";

    _root  = ("http://agency.chosun.com".equalsIgnoreCase(_root))? _root : "http://220.73.135.221" ;
    _port  = ("http://agency.chosun.com".equalsIgnoreCase(_root))? "80" : "8020";

    String ozClasssID = "CLSID:64DA633F-E73B-4344-83BF-48483346CD53" ;                          // ���� ����� ����κ�
//    String ozServerIP = _root + ("80".equals(_port)? "" : ":" + _port) + "/oz30/server" ;     // ���� ����� ����κ�
    String ozServerIP = _root + ("http://agency.chosun.com".equals(_root)? "" : ":" + _port) + "/oz30/server" ;     // ���� ����� ����κ�

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
    String bocd      = "19110";          //���������ڵ�
    String url       = request.getRequestURI();                                       //���α׷���
    String uid       = "191101";           //����ھ��̵�
    String bonm      = "�ſ�â";          //������
    String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���

    //request process
    String medicd   = "110";   //��ü�ڵ�(����Ʈ)

    String dstccd   = ""; 	//�����ڵ�(����Ʈ)
    String frbno 	= ""; 	//���۹�޹�ȣ(����Ʈ)
    String tobno 	= "";  	//�����޹�ȣ(����Ʈ)
    String freecd 	= "";  //����,������,����(0,1,2)(����Ʈ)
    String dlvmth 	= "";  //��޹��(����Ʈ)
    String rdrnmyn  = "";  //���ڸ����

    String subsumyn = "";  //�Ұ���¿���
    String cnclyn   = "";  //������������
    String line     = "";  //���ΰ���

    String remkyn   = "";  //��� ���
    
    String rpttp   = "";     //��� ���

    String paper   = "";     //�������� (0:A4, 1:80�÷� ����)
    //rdrnmyn = ("".equals(rdrnmyn))? "0":rdrnmyn;
    //rdrnmyn = "1"; //���ڸ��� �׻� ��� ��
    // ���ڸ��� �׻� ��µǹǷ� ��ȭ��ȣ ��¿��η� ��ü�Ͽ� �����.(���ڸ� ��¿��δ� �����ܿ����� ���)
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