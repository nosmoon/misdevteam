<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_3201_SDataSet ds = (HD_EVLU_3201_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	int evlu_pers_meda_opn_1tms = rx.addCData(dataSet, "evlu_pers_meda_opn_1tms", ds.evlu_pers_meda_opn_1tms);
	int evlu_pers_meda_grad_1tms = rx.add(dataSet, "evlu_pers_meda_grad_1tms", ds.evlu_pers_meda_grad_1tms);
	int evlu_proc_stat_1tms      = rx.add(dataSet, "evlu_proc_stat_1tms", ds.evlu_proc_stat_1tms );
	int tmp_grad      = rx.add(dataSet, "tmp_grad", ds.tmp_grad );

	try {
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

<% /* 작성시간 : Fri May 29 10:51:51 KST 2009 */ %>