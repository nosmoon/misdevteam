<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.common.rec.*
	,	chosun.ciis.ad.common.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_CO_9000_SDataSet ds = (AD_CO_9000_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try { 
		rx.add(tempData, "srch_cd", ds.srch_cd);
		rx.addCData(tempData, "srch_nm", ds.srch_nm);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

