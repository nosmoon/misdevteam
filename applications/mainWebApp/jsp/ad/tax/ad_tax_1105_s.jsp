<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.common.rec.*
	,	chosun.ciis.ad.common.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_CO_9004_SDataSet ds = (AD_CO_9004_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		rx.add( tempData , "ern" , ds.ern);	
		rx.add( tempData , "dlco_no" , ds.dlco_no); 
		rx.add( tempData , "dlco_nm" , ds.dlco_nm);
		rx.add( tempData , "addr" , ds.addr);	
		rx.add( tempData , "deal_clsf" , ds.corp_clsf);	
		rx.add( tempData , "presi_nm" , ds.presi_nm);	 
		rx.add( tempData , "bizcond" , ds.bizcond);	
		rx.add( tempData , "item" , ds.item);	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>