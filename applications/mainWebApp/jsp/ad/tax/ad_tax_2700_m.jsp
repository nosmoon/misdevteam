<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.tax.rec.*
	,	chosun.ciis.ad.tax.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_TAX_2700_MDataSet ds = (AD_TAX_2700_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		int elec_tax_comp_cd = rx.add( tempData , "elec_tax_comp_cd" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){ 
			AD_TAX_2700_MCURLISTRecord rec = (AD_TAX_2700_MCURLISTRecord)ds.curlist1.get(i);
			int item  = rx.add( elec_tax_comp_cd, "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>