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
	AD_TAX_1510_LDataSet ds = (AD_TAX_1510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try {
		
		for(int i=0; i<ds.curlist.size(); i++){  
			AD_TAX_1510_LCURLISTRecord rec = (AD_TAX_1510_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData, "record" , "");
			rx.add ( record, "ask_clsf", rec.ask_clsf );
			rx.add ( record, "medi_nm", rec.medi_nm );
			rx.add ( record, "make_dt", rec.make_dt ); 
			rx.add ( record, "dlco_nm", rec.dlco_nm );
			rx.add ( record, "suply_amt", rec.suply_amt );
			rx.add ( record, "aft_suply_amt", rec.aft_suply_amt );
			rx.add ( record, "tax_stmt_no", rec.prof_type_cd + rec.slip_clsf_cd + rec.slip_occr_dt + rec.slip_seq );
			rx.add ( record, "resn", rec.resn );
			rx.add ( record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add ( record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add ( record, "slip_seq", rec.slip_seq);
			rx.add ( record, "seq", rec.seq);
			rx.add ( record, "dlco_no", rec.dlco_no); 
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