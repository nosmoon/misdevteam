<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PRNPAP_3406_LDataSet ds = (MT_PRNPAP_3406_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		recordSet = rx.add(dataSet, "a_paji_wgt", ds.a_paji_wgt);
		recordSet = rx.add(dataSet, "a_simbong_cnt", ds.a_simbong_cnt);
		recordSet = rx.add(dataSet, "b_paji_wgt", ds.b_paji_wgt);
		recordSet = rx.add(dataSet, "b_simbong_cnt", ds.b_simbong_cnt);
		recordSet = rx.add(dataSet, "c_paji_wgt", ds.c_paji_wgt);
		recordSet = rx.add(dataSet, "c_simbong_cnt", ds.c_simbong_cnt);
		recordSet = rx.add(dataSet, "pj5_wgt", ds.pj5_wgt);
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

<% /* 작성시간 : Wed Jul 29 19:39:00 KST 2009 */ %>