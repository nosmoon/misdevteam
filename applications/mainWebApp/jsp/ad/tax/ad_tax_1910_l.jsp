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
	AD_TAX_1910_LDataSet ds = (AD_TAX_1910_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData1", "");

	try {
	
		for(int i=0; i<ds.curlist.size(); i++){  
			AD_TAX_1910_LCURLISTRecord rec = (AD_TAX_1910_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData, "record" , "");
			
			rx.add ( record, "tax_stmt_no", rec.tax_stmt_no );
			rx.add ( record, "dlco_nm", rec.dlco_nm );  
			rx.add ( record, "pay_clsf", rec.pay_clsf );
			rx.add ( record, "make_dt", rec.make_dt );
			rx.add ( record, "suply_amt", rec.suply_amt );
			rx.add ( record, "vat_amt", rec.vat_amt );
			rx.add ( record, "total_amt", rec.total_amt );
			rx.add ( record, "slip_clsf_cd", rec.slip_clsf_cd );
			rx.add ( record, "slip_occr_dt", rec.slip_occr_dt );
			rx.add ( record, "slip_seq", rec.slip_seq );
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