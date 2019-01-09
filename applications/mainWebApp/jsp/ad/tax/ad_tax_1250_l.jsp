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
	AD_TAX_1250_LDataSet ds = (AD_TAX_1250_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try {
		
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_TAX_1250_LCURLISTRecord rec = (AD_TAX_1250_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			rx.add ( record, "pubc_slip_no", rec.pubc_slip_no);
			rx.add ( record, "pubc_dt", rec.pubc_dt);
			rx.add ( record, "advt_fee", rec.advt_fee);
			rx.add ( record, "pubc_side", rec.pubc_side);
			rx.add ( record, "dn", rec.dn);
			rx.add ( record, "cm", rec.cm);
			rx.add ( record, "slcrg_pers", rec.slcrg_pers); 
			rx.add ( record, "mchrg_pers", rec.mchrg_pers);
			rx.add ( record, "incmg_dt", rec.incmg_dt);
			
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