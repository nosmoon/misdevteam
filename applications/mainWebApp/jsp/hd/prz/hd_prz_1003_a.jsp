<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.prz.rec.*
	,	chosun.ciis.hd.prz.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_PRZ_1003_ADataSet ds = (HD_PRZ_1003_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
    String ov_cmpy_cd = ds.getCmpy_cd();
    String ov_occr_dt = ds.getOccr_dt();
    String ov_max_seq = ds.getMax_seq();

	try {
		rx.add(dataSet, "ov_cmpy_cd", ov_cmpy_cd);
		rx.add(dataSet, "ov_occr_dt", ov_occr_dt);
		rx.add(dataSet, "ov_max_seq", ov_max_seq);
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

<% /* 작성시간 : Wed Apr 01 13:46:42 KST 2009 */ %>