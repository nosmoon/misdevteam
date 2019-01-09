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
	AD_TAX_2210_LDataSet ds = (AD_TAX_2210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try {
	
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_TAX_2210_LCURLISTRecord rec = (AD_TAX_2210_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			rx.add ( record, "pubc_dt", rec.pubc_dt );
			rx.add ( record, "slip_no", rec.slip_no );
			rx.add ( record, "medi_nm", rec.medi_nm );
			rx.add ( record, "advt_fee", rec.advt_fee ); 
			rx.add ( record, "vat", rec.vat );
			rx.add ( record, "issu_pers", rec.issu_pers );
			rx.addCData ( record, "agn", rec.agn );
			rx.add ( record, "slcrg_pers", rec.slcrg_pers );
			rx.add ( record, "mchrg_pers", rec.mchrg_pers );
			rx.add ( record, "dlco_clsf_cd", rec.dlco_clsf_cd );
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