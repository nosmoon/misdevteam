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
	CO_SMTB_1075_MDataSet ds = (CO_SMTB_1075_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	String regno = ds.regno;
	dataSet = rx.add(root, "dataSet", "");

	rx.add(dataSet, "regno", ds.regno);
	
	try {
	
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		rx.add(dataSet, "regno", regno);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Dec 22 10:02:36 KST 2011 */ %>