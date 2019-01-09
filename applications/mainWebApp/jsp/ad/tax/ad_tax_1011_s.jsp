<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.tax.rec.*
	,	chosun.ciis.ad.tax.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_TAX_1011_SDataSet ds = (AD_TAX_1011_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		rx.add( tempData , "ern" , ds.ern);	
		rx.add( tempData , "dlco_no" , ds.dlco_no); 
		rx.addCData( tempData , "dlco_nm" , ds.dlco_nm);
		rx.addCData( tempData , "dlco_abrv_nm" , ds.dlco_abrv_nm);	
		rx.add( tempData , "presi_nm" , ds.presi_nm);	
		rx.addCData( tempData , "addr" , ds.addr);	
		rx.add( tempData , "deal_clsf" , ds.corp_clsf);
		rx.addCData( tempData , "bizcond" , ds.bizcond);	
		rx.addCData( tempData , "item" , ds.item);
		rx.add( tempData , "elec_tax_comp_cd", ds.elec_tax_comp_cd);
		rx.add( tempData , "email_id", ds.email_id);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>