<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.eis.rec.*
	,	chosun.ciis.ad.eis.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_EIS_1530_SDataSet ds = (AD_EIS_1530_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resForm = rx.add( root , "resForm" , "");

	try {
		rx.add(resForm, "titl", ds.titl);
		rx.add(resForm, "cont", StringUtil.replaceToXml(ds.cont));
		rx.add(resForm, "seq", ds.seq);
	}
	catch (Exception e) {
	}  
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>