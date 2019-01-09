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
	AD_TAX_1810_LDataSet ds = (AD_TAX_1810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");

	try {
	
		long repl_amt = 0;
		long pay_amt = 0;
	
		int gridData1 = rx.add(resData, "gridData1", "");
		for(int i=0; i<ds.curlist.size(); i++){  
			AD_TAX_1810_LCURLISTRecord rec = (AD_TAX_1810_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData1 , "record" , "");
			rx.add ( record, "checked", "" );
			rx.add ( record, "rcpm_slip_no", rec.rcpm_slip_no );
			rx.add ( record, "advt_fee", StringUtil.toLong(rec.advt_fee) +  StringUtil.toLong(rec.vat));
			rx.add ( record, "rcpm_amt", rec.rcpm_amt );
			rx.add ( record, "fee", rec.fee );
			rx.add ( record, "remk", "" );
			
			repl_amt += StringUtil.toLong(rec.rcpm_amt);
		}	
				 
		int gridData2 = rx.add(resData, "gridData2", ""); 
		for(int i=0; i<ds.curlist2.size(); i++){  
			AD_TAX_1810_LCURLIST2Record rec = (AD_TAX_1810_LCURLIST2Record)ds.curlist2.get(i);
			int record  = rx.add( gridData2 , "record" , "");
			rx.add ( record, "checked", "" );
			rx.add ( record, "tax_stmt_no", rec.tax_stmt_no );
			rx.add ( record, "make_dt", rec.make_dt);
			rx.add ( record, "suply_amt", rec.suply_amt );
			rx.add ( record, "vat_amt", rec.vat_amt );
			rx.add ( record, "obj_amt", StringUtil.toLong(rec.suply_amt) +  StringUtil.toLong(rec.vat_amt) );
			rx.add ( record, "clamt_stat_nm", rec.clamt_stat_nm );
			rx.add ( record, "clamt_stat", rec.clamt_stat );  
			rx.add ( record, "slip_clsf_cd", rec.slip_clsf_cd );
			rx.add ( record, "slip_occr_dt", rec.slip_occr_dt );
			rx.add ( record, "slip_seq", rec.slip_seq );
			
			pay_amt += StringUtil.toLong(rec.suply_amt) +  StringUtil.toLong(rec.vat_amt) ;
		}			
		rx.add ( resData, "repl_cnt", ds.curlist.size() );
		rx.add ( resData, "repl_amt", repl_amt );
		rx.add ( resData, "pay_cnt", ds.curlist2.size() );
		rx.add ( resData, "pay_amt", pay_amt );
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>