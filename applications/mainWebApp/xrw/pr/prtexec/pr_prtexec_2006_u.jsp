<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,chosun.ciis.pr.prtexec.rec.*,chosun.ciis.pr.prtexec.ds.*;"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTEXEC_2006_UDataSet ds = (PR_PRTEXEC_2006_UDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "formData", "");

	try {
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Sat Apr 18 14:25:19 KST 2009 */ %>