<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.submatrout.rec.*
	,	chosun.ciis.mt.submatrout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATROUT_1117_UDataSet ds = (MT_SUBMATROUT_1117_UDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "tempData", "");

	try {
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Mon Jun 29 10:49:13 KST 2009 */ %>