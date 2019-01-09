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
	AD_TAX_2410_LDataSet ds = (AD_TAX_2410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try { 

		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_TAX_2410_LCURLISTRecord rec = (AD_TAX_2410_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			rx.add ( record, "checked", "" );
			rx.add ( record, "pubc_slip_no", rec.pubc_slip_no );
			rx.addCData ( record, "dlco_nm", rec.dlco_nm );   
			rx.addCData ( record, "agn_nm", rec.agn_nm ); 
			rx.add ( record, "slcrg_pers_nm", rec.slcrg_pers_nm ); 
			rx.add ( record, "advt_fee", rec.advt_fee );
			rx.add ( record, "vat", rec.vat );
			rx.add ( record, "ms_amt", rec.ms_amt );
		}	  
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* �ۼ��ð� : Wed Jan 21 21:10:45 KST 2009 */ %>