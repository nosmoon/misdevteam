<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>
<%
	RwXml rx = new RwXml();
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	dataSet = rx.add(root, "connData", "");

	rx.add(dataSet, "conn_log", (String)request.getAttribute("conn_log"));
	
	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());
%>