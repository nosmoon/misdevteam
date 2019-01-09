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
	AD_TAX_2110_LDataSet ds = (AD_TAX_2110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		
		long total_amt = 0;
		
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_TAX_2110_LCURLISTRecord rec = (AD_TAX_2110_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			rx.add ( record, "dlco_cd", rec.dlco_cd ); 
			rx.addCData ( record, "dlco_nm", rec.dlco_nm ); 
			rx.add ( record, "tax_stmt_no", rec.prof_type_cd + rec.slip_clsf_cd + rec.slip_occr_dt + rec.slip_seq ); 
			rx.add ( record, "make_dt", rec.make_dt ); 
			rx.add ( record, "medi_nm", rec.medi_nm ); 
			rx.add ( record, "tot_amt", StringUtil.toNumber(rec.suply_amt) + StringUtil.toNumber(rec.vat_amt) ); 
			rx.add ( record, "mtry_dt", rec.mtry_dt ); 
			rx.add ( record, "fisc_dt", rec.fisc_dt ); 
			rx.add ( record, "pay_dt", rec.pay_dt ); 
			rx.add ( record, "pay_clsf", rec.pay_clsf ); 
			
			total_amt += StringUtil.toNumber(rec.suply_amt) + StringUtil.toNumber(rec.vat_amt);
		}	  
		
		String fee_pay_stat = StringUtil.nvl(ds.fee_pay_stat);
		
		if(!"*".equals(fee_pay_stat)){
			fee_pay_stat = !"1".equals(fee_pay_stat) ? "0" : "1";
		}
		
		rx.add ( resData, "total_amt", 	  total_amt ); 
		rx.add ( resData, "fee_pay_stat", fee_pay_stat ); 
		rx.add ( resData, "bank",		  ds.bank ); 
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>