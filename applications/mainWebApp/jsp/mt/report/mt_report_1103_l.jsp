<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.report.rec.*
	,	chosun.ciis.mt.report.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_REPORT_1103_LDataSet ds = (MT_REPORT_1103_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = 0;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	tempData = rx.add(root, "tempData", "");

	try {
		dataSet = rx.add(tempData, "dataSet", "");
		rx.add(dataSet, "fix_yn", ds.getFix_yn());  
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

<% /* 작성시간 : Fri Aug 03 15:19:42 KST 2012 */ %>