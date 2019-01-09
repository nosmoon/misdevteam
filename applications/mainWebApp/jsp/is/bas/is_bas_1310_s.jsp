<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.bas.rec.*
	,	chosun.ciis.is.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_BAS_1310_SDataSet ds = (IS_BAS_1310_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm   = rx.add(root, "resForm", "");
	
	try {
		/****** CURLIST_A BEGIN(탭1.업체담당자) */
		int gridData1 = rx.add(resForm, "gridData1", "");
		for(int i = 0; i < ds.curlist_a.size(); i++) {
			IS_BAS_1310_SCURLIST_ARecord rec = (IS_BAS_1310_SCURLIST_ARecord)ds.curlist_a.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "a_cmpy_cd", rec.a_cmpy_cd);
			rx.add(record, "a_dlco_clsf", rec.a_dlco_clsf);
			rx.add(record, "a_dlco_cd", rec.a_dlco_cd);
			rx.add(record, "a_dlco_seq", rec.a_dlco_seq);
			rx.add(record, "a_dlco_chrg_pers_seq", rec.a_dlco_chrg_pers_seq);
			rx.add(record, "a_chrg_job_clsf", rec.a_chrg_job_clsf);
			rx.add(record, "a_chrg_pers_nm", rec.a_chrg_pers_nm);
			rx.add(record, "a_dept", rec.a_dept);
			rx.add(record, "a_posi", rec.a_posi);
			rx.add(record, "a_ptph_no", rec.a_ptph_no);
			rx.add(record, "a_tel_no_1", rec.a_tel_no_1);
			rx.add(record, "a_tel_no_2", rec.a_tel_no_2);
			rx.add(record, "a_fax_no", rec.a_fax_no);
			rx.add(record, "a_email", rec.a_email);
			rx.add(record, "a_tax_asp_id", rec.a_tax_asp_id);
			rx.add(record, "a_kind_erplace_no", rec.a_kind_erplace_no);
			rx.add(record, "a_remk_matt", rec.a_remk_matt);
			rx.add(record, "a_chg_pers", rec.a_chg_pers);
			rx.add(record, "a_chg_dt_tm", rec.a_chg_dt_tm);
		}
		/****** CURLIST_A END */
		
		/****** CURLIST_B BEGIN(탭2.계약자료) */
		int gridData2 = rx.add(resForm, "gridData2", "");
		for(int i = 0; i < ds.curlist_b.size(); i++) {
			IS_BAS_1310_SCURLIST_BRecord rec = (IS_BAS_1310_SCURLIST_BRecord)ds.curlist_b.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "b_cmpy_cd", rec.b_cmpy_cd);
			rx.add(record, "b_dlco_clsf", rec.b_dlco_clsf);
			rx.add(record, "b_dlco_cd", rec.b_dlco_cd);
			rx.add(record, "b_dlco_seq", rec.b_dlco_seq);
			rx.add(record, "b_sale_item_cd", rec.b_sale_item_cd);
			rx.add(record, "b_sale_item_nm", rec.b_sale_item_nm);
			rx.add(record, "b_cntr_dt", rec.b_cntr_dt);
			rx.add(record, "b_expy_dt", rec.b_expy_dt);
			rx.add(record, "b_fst_clamt_mm", rec.b_fst_clamt_mm);
			rx.add(record, "b_amt", rec.b_amt);
			rx.add(record, "b_clamt_mthd_cd", rec.b_clamt_mthd_cd);
			rx.add(record, "b_pay_cntr_clsf", rec.b_pay_cntr_clsf);
			rx.add(record, "b_remk", rec.b_remk);
			rx.add(record, "b_chg_pers", rec.b_chg_pers);
		}
		/****** CURLIST_B END */
		
		/****** CURLIST_C BEGIN(탭3.지로정보) */	
		int gridData3 = rx.add(resForm, "gridData3", "");
		for(int i = 0; i < ds.curlist_c.size(); i++) {
			IS_BAS_1310_SCURLIST_CRecord rec = (IS_BAS_1310_SCURLIST_CRecord)ds.curlist_c.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.add(record, "c_cmpy_cd", rec.c_cmpy_cd);
			rx.add(record, "c_dlco_clsf", rec.c_dlco_clsf);
			rx.add(record, "c_dlco_cd", rec.c_dlco_cd);
			rx.add(record, "c_dlco_seq", rec.c_dlco_seq);
			rx.add(record, "c_giro_seq", rec.c_giro_seq);
			rx.add(record, "c_giro_no", rec.c_giro_no);
			rx.add(record, "c_giro_clsf", rec.c_giro_clsf);
			rx.add(record, "c_aprv_no", rec.c_aprv_no);
			rx.add(record, "c_dnmn_pers", rec.c_dnmn_pers);
			rx.add(record, "c_bank_no", rec.c_bank_no);
			rx.add(record, "c_acct_no", rec.c_acct_no);
			rx.add(record, "c_deps_pers", rec.c_deps_pers);
			rx.add(record, "c_open_dt", rec.c_open_dt);
			rx.add(record, "c_cdatmaplc_dt", rec.c_cdatmaplc_dt);
			rx.add(record, "c_cdatmaprv_dt", rec.c_cdatmaprv_dt);
			rx.add(record, "c_cdatmacpn_dt", rec.c_cdatmacpn_dt);
			rx.add(record, "c_chg_pers", rec.c_chg_pers);
			rx.add(record, "c_chg_dt_tm", rec.c_chg_dt_tm);
		}	
		/****** CURLIST_C END */
	
		/****** CURLIST_D BEGIN(탭4.인터넷전화) */
		int gridData4 = rx.add(resForm, "gridData4", "");
		for(int i = 0; i < ds.curlist_d.size(); i++) {
			IS_BAS_1310_SCURLIST_DRecord rec = (IS_BAS_1310_SCURLIST_DRecord)ds.curlist_d.get(i);
			int record = rx.add(gridData4, "record", "");
			rx.add(record, "d_cmpy_cd", rec.d_cmpy_cd);
			rx.add(record, "d_dlco_clsf", rec.d_dlco_clsf);
			rx.add(record, "d_dlco_cd", rec.d_dlco_cd);
			rx.add(record, "d_dlco_seq", rec.d_dlco_seq);
			rx.add(record, "d_intn_tel_seq", rec.d_intn_tel_seq);
			rx.add(record, "d_estb_dt", rec.d_estb_dt);
			rx.add(record, "d_mang_no", rec.d_mang_no);
			rx.add(record, "d_tel_no", rec.d_tel_no);
			rx.add(record, "d_use_yn", rec.d_use_yn);
			rx.add(record, "d_remk", rec.d_remk);
			rx.add(record, "d_chg_dt_tm", rec.d_chg_dt_tm);
		}
		/****** CURLIST_D END */

		
		rx.add(resForm, "dlco_no", ds.dlco_no);
		rx.add(resForm, "sp_comp_chrg_pers_emp_no", ds.sp_comp_chrg_pers_emp_no);
		rx.add(resForm, "sp_comp_chrg_pers_emp_nm", ds.sp_comp_chrg_pers_emp_nm);
		rx.add(resForm, "use_sw", ds.use_sw);
		rx.add(resForm, "leaf_open_chrg_pers", ds.leaf_open_chrg_pers);
		rx.add(resForm, "leaf_open_chrg_pers_nm", ds.leaf_open_chrg_pers_nm);
		rx.add(resForm, "leaf_now_chrg_pers",ds.leaf_now_chrg_pers);
		rx.add(resForm, "leaf_now_chrg_pers_nm",ds.leaf_now_chrg_pers_nm);
		rx.add(resForm, "dept_cd",ds.dept_cd);
		rx.add(resForm, "sub_dept_cd",ds.sub_dept_cd);
		rx.add(resForm, "bo_nm",ds.bo_nm);
		rx.add(resForm, "bo_zip_1",ds.bo_zip_1);
		rx.add(resForm, "bo_zip_2",ds.bo_zip_2);
		rx.addCData(resForm, "bo_addr",ds.bo_addr);
		rx.add(resForm, "bo_dtls_addr",ds.bo_dtls_addr);
		rx.add(resForm, "hdqt_sell_dept_cd",ds.hdqt_sell_dept_cd);
		rx.add(resForm, "hdqt_sell_sub_dept_cd",ds.hdqt_sell_sub_dept_cd);
		rx.add(resForm, "hdqt_sell_area_cd",ds.hdqt_sell_area_cd);
		rx.add(resForm, "cntr_stat_clsf",ds.cntr_stat_clsf);
		rx.add(resForm, "malig_yn",ds.malig_yn);
		rx.add(resForm, "tax_stmt_cmpy_cd",ds.tax_stmt_cmpy_cd);
		rx.add(resForm, "cu_acct_cd",ds.cu_acct_cd);
		rx.add(resForm, "cntr_dt",ds.cntr_dt);
		rx.add(resForm, "expy_dt",ds.expy_dt);
		rx.add(resForm, "leaf_sale_yn",ds.leaf_sale_yn);
		rx.add(resForm, "leaf_purc_yn",ds.leaf_purc_yn);
		rx.add(resForm, "dmang_bo_yn",ds.dmang_bo_yn);
		rx.add(resForm, "outsd_leaf_cmpy_yn",ds.outsd_leaf_cmpy_yn);
		rx.add(resForm, "vexc_cmpy_yn",ds.vexc_cmpy_yn);
		rx.add(resForm, "design_cmpy_yn",ds.design_cmpy_yn);
		rx.add(resForm, "excep_main_prt_plac_yn",ds.excep_main_prt_plac_yn);
		rx.add(resForm, "isgrp_yn",ds.isgrp_yn);
		rx.add(resForm, "sp_deal_yn",ds.sp_deal_yn);
		rx.addCData(resForm, "jurs_dong_nm",ds.jurs_dong_nm);
		rx.addCData(resForm, "jurs_apt",ds.jurs_apt);
		rx.addCData(resForm, "leaf_addr",ds.leaf_addr);
		rx.add(resForm, "adms_dstc_cd",ds.adms_dstc_cd);
		rx.add(resForm, "adms_dstc_cd_nm",ds.adms_dstc_cd_nm);
		rx.add(resForm, "asnt_dstc_cd",ds.asnt_dstc_cd);
		rx.add(resForm, "asnt_dstc_cd_nm",ds.asnt_dstc_cd_nm);
		rx.add(resForm, "dstc_seqo",ds.dstc_seqo);
		rx.add(resForm, "srt_seqo",ds.srt_seqo);
		rx.add(resForm, "wh_cd",ds.wh_cd);
		rx.add(resForm, "send_qty",ds.send_qty);
		rx.add(resForm, "acwr_rmsg_ptph",ds.acwr_rmsg_ptph);
		rx.add(resForm, "hmpg",ds.hmpg);
		rx.addCData(resForm, "remk",ds.remk);
		rx.add(resForm, "chg_pers",ds.chg_pers);
		rx.add(resForm, "chg_dt_tm",ds.chg_dt_tm);
		rx.addCData(resForm, "dlco_abrv_nm",ds.dlco_abrv_nm);
		rx.addCData(resForm, "dlco_nm",ds.dlco_nm);
		rx.add(resForm, "ern",ds.ern);
		rx.add(resForm, "bizcond",ds.bizcond);
		rx.add(resForm, "item",ds.item);
		rx.add(resForm, "zip_1",ds.zip_1);
		rx.add(resForm, "zip_2",ds.zip_2);
		rx.addCData(resForm, "addr",ds.addr);
		rx.addCData(resForm, "dtls_addr",ds.dtls_addr);
		rx.add(resForm, "presi_nm",ds.presi_nm);
		rx.add(resForm, "presi_prn",ds.presi_prn);
		rx.add(resForm, "presi_zip_1",ds.presi_zip_1);
		rx.add(resForm, "presi_zip_2",ds.presi_zip_2);
		rx.add(resForm, "presi_addr",ds.presi_addr);
		rx.add(resForm, "presi_dtls_addr",ds.presi_dtls_addr);
		rx.add(resForm, "tel_no",ds.tel_no);
		rx.add(resForm, "fax_no",ds.fax_no);
		rx.add(resForm, "flag",ds.flag);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
