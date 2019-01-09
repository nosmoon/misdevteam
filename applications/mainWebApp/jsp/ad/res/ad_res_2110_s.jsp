<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_RES_2110_SDataSet ds = (AD_RES_2110_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int resForm = rx.add(resData, "resForm", "");

	try { 
		rx.add(resForm, "medi_cd", ds.medi_cd);
		rx.add(resForm, "preng_occr_dt", ds.preng_occr_dt);
		rx.add(resForm, "preng_occr_seq", ds.preng_occr_seq);
		rx.add(resForm, "dlco_no", ds.dlco_no);
		rx.add(resForm, "dlco_nm", ds.dlco_nm);
		rx.add(resForm, "pubc_side", ds.pubc_side); 
		rx.add(resForm, "issu_ser_no", ds.issu_ser_no); 
		rx.add(resForm, "publ_std", ds.publ_std);
		rx.add(resForm, "advt_fee", ds.advt_fee);
		rx.add(resForm, "vat", ds.vat);
		rx.add(resForm, "pubc_tot_amt", ds.pubc_tot_amt);
		rx.add(resForm, "rtax_yn", ds.rtax_yn);
		rx.add(resForm, "govern_advt_yn", ds.govern_advt_yn);
		rx.add(resForm, "advcs_offr_yn", ds.advcs_offr_yn);
		rx.add(resForm, "hndl_clsf", StringUtil.nvl(ds.hndl_clsf,"1"));
		rx.add(resForm, "agn", ds.agn); 
		rx.add(resForm, "agn_nm", ds.agn_nm); 
		rx.add(resForm, "fee_rate", ds.fee_rate);  
		rx.add(resForm, "fee", ds.fee);
		rx.add(resForm, "hndl_plac_cd", ds.hndl_plac_cd);
		rx.add(resForm, "hndl_plac_nm", ds.hndl_plac_nm);
		rx.add(resForm, "coms_rate", ds.coms_rate);
		rx.add(resForm, "coms", ds.coms);
		rx.add(resForm, "indt_clsf", ds.indt_clsf);  
		rx.add(resForm, "indt_clsf_nm", ds.indt_clsf_nm);
		rx.add(resForm, "mony_kind", StringUtil.nvl(ds.mony_kind, "KRW"));
		rx.add(resForm, "chro_clsf", StringUtil.nvl(ds.chro_clsf, "1"));
		rx.add(resForm, "type_clsf", ds.type_clsf);
		rx.add(resForm, "type_clsf_nm", ds.type_clsf_nm);
		rx.add(resForm, "exrate", ds.exrate);
		rx.add(resForm, "book_appndx_clsf", StringUtil.nvl(ds.book_appndx_clsf, "1")); 
		rx.add(resForm, "nwsp_type_clsf", StringUtil.nvl(ds.nwsp_type_clsf, "01"));
		rx.add(resForm, "frex_cntr_amt", ds.frex_cntr_amt);
		rx.add(resForm, "slcrg_pers", ds.slcrg_pers);
		rx.add(resForm, "slcrg_pers_nm", ds.slcrg_pers_nm);
		rx.add(resForm, "dept_cd", ds.dept_cd);
		rx.add(resForm, "dept_nm", ds.dept_nm); 
		rx.add(resForm, "mchrg_pers", ds.mchrg_pers);
		rx.add(resForm, "mchrg_pers_nm", ds.mchrg_pers_nm); 
		rx.add(resForm, "advt_cont", ds.advt_cont);
		rx.add(resForm, "remk", ds.remk); 
		rx.add(resForm, "chrg_aprv_pers", ds.chrg_aprv_pers);
		rx.add(resForm, "chrg_aprv_dt", ds.chrg_aprv_dt);
		rx.add(resForm, "team_chf_aprv_pers", ds.team_chf_aprv_pers);
		rx.add(resForm, "team_chf_aprv_dt", ds.team_chf_aprv_dt);
		rx.add(resForm, "preng_clos_yn", ds.preng_clos_yn);
		rx.add(resForm, "preng_dt", ds.preng_dt);
		rx.add(resForm, "pubc_slip_no", ds.pubc_slip_no);
		rx.add(resForm, "incmg_pers", ds.incmg_pers);
		rx.add(resForm, "incmg_pers_nm", ds.incmg_pers_nm);
		rx.add(resForm, "tax_email", ds.tax_email);
		rx.add(resForm, "tax_clsf", ds.tax_clsf);		
		rx.add(resForm, "advt_clsf", ds.advt_clsf); 
		rx.add(resForm, "patr_chrg_info", ds.patr_chrg_info);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jan 29 11:08:42 KST 2009 */ %>