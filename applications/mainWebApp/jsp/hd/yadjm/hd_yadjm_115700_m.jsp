<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_115700_MDataSet ds = (HD_YADJM_115700_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_stok_savg_type_010", ds.getXx_stok_savg_type_010());
		rx.add(dataSet, "xx_stok_savg_type_020", ds.getXx_stok_savg_type_020());
		rx.add(dataSet, "xx_stok_savg_type_030", ds.getXx_stok_savg_type_030());
		rx.add(dataSet, "xx_stok_savg_type_040", ds.getXx_stok_savg_type_040());
		rx.add(dataSet, "xx_stok_savg_type_050", ds.getXx_stok_savg_type_050());
		rx.add(dataSet, "xx_stok_savg_type_060", ds.getXx_stok_savg_type_060());
		rx.add(dataSet, "xx_stok_savg_type_070", ds.getXx_stok_savg_type_070());
		rx.add(dataSet, "xx_stok_savg_type_080", ds.getXx_stok_savg_type_080());
		rx.add(dataSet, "xx_stok_savg_type_090", ds.getXx_stok_savg_type_090());
		rx.add(dataSet, "xx_stok_savg_type_100", ds.getXx_stok_savg_type_100());
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

<% /* 작성시간 : Wed Feb 15 14:20:08 KST 2012 */ %>