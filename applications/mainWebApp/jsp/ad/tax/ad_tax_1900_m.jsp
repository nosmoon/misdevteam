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
	AD_TAX_1900_MDataSet ds = (AD_TAX_1900_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	
		int prof_type_cd = rx.add( tempData , "prof_type_cd" , "");		
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_TAX_1900_MCURLISTRecord rec = (AD_TAX_1900_MCURLISTRecord)ds.curlist.get(i);
			int item  = rx.add( prof_type_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
			
		}	
		
		int slip_clsf_cd = rx.add( tempData , "slip_clsf_cd" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){ 
			AD_TAX_1900_MCURLIST2Record rec = (AD_TAX_1900_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( slip_clsf_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd_abrv_nm);
			
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