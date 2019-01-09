<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2122_IDataSet ds = (FC_ACCT_2122_IDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
    String alert_check = ds.alert_check;
    String slip_seq = ds.slip_seq;
    String rcpm_slip_no = ds.rcpm_slip_no;
	dataSet = rx.add(root, "dataSet", "");

	try {
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
        rx.add(dataSet, "alert_check", alert_check);
        rx.add(dataSet, "slip_seq", slip_seq);
        rx.add(dataSet, "rcpm_slip_no", rcpm_slip_no);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Sat Aug 29 17:28:38 KST 2009 */ %>