<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.dlco.rec.*
	,	chosun.ciis.co.dlco.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_DLCO_1003_LDataSet ds = (CO_DLCO_1003_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "tempData", "");

	try {
		rx.add(formData, "chk_count", ds.getCount());
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Sun Apr 05 18:14:03 KST 2009 */ %>