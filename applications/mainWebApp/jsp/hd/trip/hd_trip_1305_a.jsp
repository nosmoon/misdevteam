<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.trip.rec.*
	,	chosun.ciis.hd.trip.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_TRIP_1305_ADataSet ds = (HD_TRIP_1305_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
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

<% /* 작성시간 : Sat May 09 16:27:13 KST 2009 */ %>