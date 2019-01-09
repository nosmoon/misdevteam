<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.smtb.rec.*
	,	chosun.ciis.co.smtb.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_SMTB_1021_UDataSet ds = (CO_SMTB_1021_UDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	String batch_id = ds.batch_id;
	String smart_id = ds.smart_id;
	String smart_pw = ds.smart_pw;			
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
		rx.add(dataSet, "batch_id", batch_id);
		rx.add(dataSet, "smart_id", smart_id);
		rx.add(dataSet, "smart_pw", smart_pw);		
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Mon Mar 22 20:09:00 KST 2010 */ %>