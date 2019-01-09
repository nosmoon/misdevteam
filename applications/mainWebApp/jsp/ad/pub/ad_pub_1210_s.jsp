<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_1210_SDataSet ds = (AD_PUB_1210_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int resForm = rx.add(resData, "resForm", "");

	try { 

		rx.add(resForm, "medi_cd", ds.medi_cd);  
		rx.add(resForm, "dlco_no", ds.dlco_no);
		rx.add(resForm, "dlco_nm", ds.dlco_nm);
		rx.add(resForm, "sect_nm", ds.sect_cd + ds.sect_seq);
		rx.add(resForm, "dn", DigitUtil.cutUnderPoint(ds.dn,1));
		rx.add(resForm, "cm", DigitUtil.cutUnderPoint(ds.cm,1));
		rx.addCData(resForm, "advt_cont", ds.advt_cont);
		rx.add(resForm, "uprc", ds.uprc);
		rx.add(resForm, "advt_fee", ds.advt_fee);
		rx.add(resForm, "vat", ds.vat);  
		rx.add(resForm, "pubc_tot_amt", ds.pubc_tot_amt);
		rx.add(resForm, "hndl_clsf", ds.hndl_clsf);
		rx.add(resForm, "agn", ds.agn); 
		rx.add(resForm, "agn_nm", ds.agn_nm);  
		rx.add(resForm, "fee_rate", ds.fee_rate);  
		rx.add(resForm, "fee", ds.fee);
		rx.add(resForm, "hndl_plac_cd", ds.hndl_plac_cd);
		rx.add(resForm, "hndl_plac_nm", ds.hndl_plac_nm);  
		rx.add(resForm, "coms_rate", ds.coms_rate); 
		rx.add(resForm, "coms", ds.coms);
		rx.add(resForm, "proc_dt", ds.proc_dt); 
		rx.add(resForm, "proc_seq", ds.proc_seq); 
		rx.add(resForm, "pubc_side", ds.pubc_side); 
		rx.add(resForm, "pubc_occr_dt", ds.pubc_occr_dt);
		rx.add(resForm, "pubc_occr_seq", ds.pubc_occr_seq);
		rx.add(resForm, "pubc_slip_no", ds.pubc_slip_no); 

		rx.add(resForm, "div_yn", ds.div_yn); 
		
		String clos_stat = StringUtil.nvl(ds.clos_stat);
		if("1".equals(clos_stat)) 	   clos_stat = "마감취소";
		else if("2".equals(clos_stat)) clos_stat = "마감";
		
		rx.add(resForm, "clos_stat", clos_stat); 
		rx.add(resForm, "clamt_stat", ds.clamt_stat); 
		rx.add(resForm, "sale_stmt_issu_yn", ds.sale_stmt_issu_yn); 
		rx.add(resForm, "purc_stmt_issu_yn", ds.purc_stmt_issu_yn+ds.purc_stmt_issu_yn2); 
		
		rx.add(resForm, "sum_cm", DigitUtil.cutUnderPoint(ds.sum_cm, 1)); 
		rx.add(resForm, "sum_dn", DigitUtil.cutUnderPoint(ds.sum_dn, 1)); 
		rx.add(resForm, "sum_advt_fee", ds.sum_advt_fee); 
		rx.add(resForm, "sum_vat", ds.sum_vat); 
		rx.add(resForm, "sum_pubc_tot_amt", ds.sum_pubc_tot_amt); 
		rx.add(resForm, "sum_fee", ds.sum_fee); 
		rx.add(resForm, "sum_coms", ds.sum_coms); 

		int gridData = rx.add(resData, "gridData", "");
		
		for(int i=0; i<ds.curlist.size(); i++){
			AD_PUB_1210_SCURLISTRecord rec = (AD_PUB_1210_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");	
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "advt_cont", rec.advt_cont);
			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm, 1)); 
			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn, 1)); 
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "pubc_tot_amt", rec.pubc_tot_amt);
			rx.add(record, "fee", rec.fee);
			rx.add(record, "coms", rec.coms); 
			rx.add(record, "div_pubc_occr_dt", rec.pubc_occr_dt);
			rx.add(record, "div_pubc_occr_seq", rec.pubc_occr_seq);					
		}

		for(int i=0; i<100 - ds.curlist.size(); i++){
			int record = rx.add(gridData, "record", "");	
			rx.add(record, "pubc_slip_no", "");
			rx.add(record, "dlco_no", "");
			rx.add(record, "dlco_nm", "");
			rx.add(record, "advt_cont", "");
			rx.add(record, "cm", "");
			rx.add(record, "dn", "");
			rx.add(record, "advt_fee", "");
			rx.add(record, "vat", "");
			rx.add(record, "pubc_tot_amt", "");
			rx.add(record, "fee", "");
			rx.add(record, "coms", "");		
			rx.add(record, "div_pubc_occr_dt", "");
			rx.add(record, "div_pubc_occr_seq", "");		
		}

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jan 29 11:08:42 KST 2009 */ %>