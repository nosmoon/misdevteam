<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pl.com.rec.*
	,	chosun.ciis.pl.com.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_com_1510_m.jsp
* 기능 : 
* 작성일자 : 2009-03-24
* 작성자 : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_COM_1510_SDataSet ds = (PL_COM_1510_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "resultData", "");

	try {
		/****** DEAL_ETCINFO BEGIN */
		int DEAL_ETCINFO = rx.add(dataSet, "DEAL_ETCINFO", "");
		rx.add(DEAL_ETCINFO, "stok_qty", ds.stok_qty);
		rx.add(DEAL_ETCINFO, "deal_uprc", ds.deal_uprc);
		rx.add(DEAL_ETCINFO, "dcrate", ds.dcrate);
		rx.add(DEAL_ETCINFO, "wh_cd", ds.wh_cd);
		rx.add(DEAL_ETCINFO, "sendclsf", ds.sendclsf);
		rx.add(DEAL_ETCINFO, "prv_deli_qty", ds.prv_deli_qty);
		rx.add(DEAL_ETCINFO, "prv_widr_qty", ds.prv_widr_qty);
		rx.add(DEAL_ETCINFO, "prv_retn_qty", ds.prv_retn_qty);
		rx.add(DEAL_ETCINFO, "vexc_medi_ser_no", ds.vexc_medi_ser_no);
		/****** DEAL_ETCINFO END */
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
