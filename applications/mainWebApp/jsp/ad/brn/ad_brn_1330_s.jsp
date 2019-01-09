<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.brn.rec.*
	,	chosun.ciis.ad.brn.ds.*;
	"
%>

<%
	
	RwXml rx = new RwXml();
	AD_BRN_1330_SDataSet ds = (AD_BRN_1330_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");

	try {

		int gridData = rx.add(resData, "gridData", "");
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_BRN_1330_SCURLISTRecord rec = (AD_BRN_1330_SCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			rx.add ( record, "checked", "N" );
			rx.add ( record, "medi_nm", rec.medi_nm);
			rx.add ( record, "pubc_dt", rec.pubc_dt);
			rx.add ( record, "pubc_slip_no", rec.pubc_slip_no);
			rx.add ( record, "dlco_no", rec.dlco_no);
			rx.add ( record, "dlco_nm", rec.dlco_nm);
			rx.add ( record, "advt_fee", rec.advt_fee);
			rx.add ( record, "vat", rec.vat); 
			rx.add ( record, "sale_stmt_issu_yn", rec.sale_stmt_issu_yn);
		}	
			
		int resForm = rx.add(resData, "resForm", "");
		rx.add( resForm , "prof_type_cd" , ds.prof_type_cd);
		rx.add( resForm , "slip_clsf_cd" , ds.slip_clsf_cd);	
		rx.add( resForm , "slip_occr_dt" , ds.slip_occr_dt);	
		rx.add( resForm , "slip_seq" , ds.slip_seq);	
		
		rx.add( resForm , "demand_ern" , ds.demand_ern);	
		rx.add( resForm , "demand_dlco_no" , ds.demand_dlco_no);
		rx.add( resForm , "demand_dlco_nm" , ds.demand_dlco_nm);
		rx.add( resForm , "demand_presi_nm" , ds.demand_presi_nm);	
		rx.add( resForm , "demand_addr" , ds.demand_addr);	
		rx.add( resForm , "demand_bizcond" , ds.demand_bizcond);	
		rx.add( resForm , "demand_item" , ds.demand_item);	
		
		rx.add( resForm , "suply_ern" , ds.suply_ern);	
		rx.add( resForm , "suply_dlco_no" , ds.suply_dlco_no);
		rx.add( resForm , "suply_dlco_nm" , ds.suply_dlco_nm);
		rx.add( resForm , "suply_presi_nm" , ds.suply_presi_nm);	
		rx.add( resForm , "suply_addr" , ds.suply_addr);	
		rx.add( resForm , "suply_bizcond" , ds.suply_bizcond);	
		rx.add( resForm , "suply_item" , ds.suply_item);	
		
		rx.add( resForm , "make_dt" , ds.make_dt);	
		rx.add( resForm , "suply_amt" , ds.suply_amt);	
		rx.add( resForm , "vat_amt" , ds.vat_amt);	
		rx.add( resForm , "tot_amt" , ds.tot_amt);	
		rx.add( resForm , "setoff_yn" , StringUtil.nvl(ds.setoff_yn, "N"));	
		rx.add( resForm , "canc_yn" , StringUtil.nvl(ds.canc_yn, "N"));	
		rx.add( resForm , "re_issu_resn_cd" ,ds.re_issu_resn_cd);	
		rx.add( resForm , "tax_item" ,ds.tax_item);	
		rx.add( resForm , "issu_tms" ,ds.issu_tms);	
		
		rx.add( resForm , "chk_cnt" , ds.chk_cnt);	  
		
		rx.add( resForm , "flag" , "");	
		rx.add( resForm , "multiUpdateData" , "");	
		rx.add( resForm , "medi_cd" , "");	
		rx.add( resForm , "hndl_clsf" , "");	
		
		rx.add( resForm , "email_id", ds.email_id);
		rx.add( resForm , "elec_tax_comp_cd", ds.elec_tax_comp_cd);
		rx.add( resForm , "semuro_no", ds.semuro_no);
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>