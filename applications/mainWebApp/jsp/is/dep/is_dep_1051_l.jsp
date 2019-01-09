<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_DEP_1051_LDataSet ds = (IS_DEP_1051_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");

	try {
		int resForm = rx.add( resData , "resForm" , "");

		rx.add(resForm, "occr_dt" 			,ds.occr_dt);						
		rx.add(resForm, "slip_clsf" 		,ds.slip_clsf);						
		rx.add(resForm, "seq" 				,ds.seq);						
		rx.add(resForm, "dlco_no" 			,ds.dlco_clsf_cd_seq);						
	    rx.add(resForm, "dlco_nm"          	,ds.dlco_nm);         					
	    rx.add(resForm, "rcpm_tot_amt"     	,ds.rcpm_tot_amt);    						
	    rx.add(resForm, "tot_rvord_amt"     ,ds.tot_rvord_amt);   
	    rx.add(resForm, "setoff_done_amt"   ,ds.setoff_done_amt); 
	    rx.add(resForm, "setoff_tobe_amt"   ,ds.setoff_tobe_amt); 
	    rx.add(resForm, "final_setoff_yn"   ,ds.final_setoff_yn); 
	    rx.add(resForm, "pubc_frdt"         ,ds.proc_frdt);       
	    rx.add(resForm, "pubc_todt"         ,ds.proc_todt);
	    rx.add(resForm, "pubc_tot_amt"		,ds.tot_rvord_amt);
		
		rx.add(resForm, "setoff_tobe_amt"	,ds.setoff_tobe_amt);
		rx.add(resForm, "final_setoff_yn"	,ds.final_setoff_yn);
		rx.add(resForm, "setoff_sum_amt"	,"0");
		rx.add(resForm, "tmp_setoff_tobe_amt" ,ds.setoff_tobe_amt);

		
		int gridData = rx.add( resData , "gridData" , "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_DEP_1051_LCURLISTRecord rec = (IS_DEP_1051_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "setoff_yn", "N");
			rx.add(record, "rcpm_suply_amt", rec.rcpm_suply_amt);
			rx.add(record, "rcpm_vat", rec.rcpm_vat);
			rx.add(record, "sale_proc_dt", rec.sale_proc_dt);
			rx.add(record, "acwr_reg_dt_seq", rec.acwr_reg_dt_seq);
			rx.addCData(record, "advt_nm", rec.advt_nm);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "unrcpm_amt", Integer.parseInt(rec.unrcpm_suply_amt) + Integer.parseInt(rec.unrcpm_vat_amt)); /**¹Ì¼ö¾×**/
			rx.add(record, "unrcpm_suply_amt", rec.unrcpm_suply_amt);
			rx.add(record, "unrcpm_vat_amt", rec.unrcpm_vat_amt);
			rx.add(record, "acwr_reg_dt", rec.acwr_reg_dt);
			rx.add(record, "acwr_reg_seq", rec.acwr_reg_seq);
			rx.add(record, "sale_dlco_li_seq", rec.sale_dlco_li_seq);
		}	

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
