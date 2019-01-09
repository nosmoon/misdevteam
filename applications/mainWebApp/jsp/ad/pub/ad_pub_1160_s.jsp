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
	AD_PUB_1160_SDataSet ds = (AD_PUB_1160_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int formData = rx.add(root, "formData", "");

	try { 
 
		rx.add(formData, "proc_dt", ds.proc_dt); 
		rx.add(formData, "proc_seq", ds.proc_seq);
		rx.add(formData, "medi_cd", ds.medi_cd);
		rx.add(formData, "hndl_clsf", StringUtil.nvl(ds.hndl_clsf, "1"));
		rx.add(formData, "dlco_no", ds.dlco_no);
		rx.add(formData, "dlco_nm", ds.dlco_nm);
		rx.add(formData, "hndl_plac_cd", ds.hndl_plac_cd);
		rx.add(formData, "hndl_plac_nm", ds.hndl_plac_nm);
		rx.add(formData, "coms_rate", StringUtil.nvl(ds.coms_rate,"0")); 
		rx.add(formData, "coms", StringUtil.nvl(ds.coms,"0"));
		rx.add(formData, "sect_nm", ds.sect_cd + ds.sect_seq);
		rx.add(formData, "arow", ds.arow);   
		rx.add(formData, "uprc", StringUtil.nvl(ds.uprc, "0"));
		rx.add(formData, "advt_fee", StringUtil.nvl(ds.advt_fee, "0"));
		rx.add(formData, "vat", StringUtil.nvl(ds.vat, "0"));  
		rx.add(formData, "pubc_tot_amt", StringUtil.nvl(ds.pubc_tot_amt,"0"));
		rx.add(formData, "guid_sec_kind_cd", ds.guid_sec_kind_cd);
		
		rx.add(formData, "slcrg_pers", ds.slcrg_pers);   
		rx.add(formData, "slcrg_pers_nm", ds.slcrg_pers_nm);
		rx.add(formData, "dept_cd", ds.dept_cd);
		rx.add(formData, "dept_nm", ds.dept_nm);
		rx.add(formData, "mchrg_pers", ds.mchrg_pers);
		rx.add(formData, "mchrg_pers_nm", ds.mchrg_pers_nm); 
		rx.add(formData, "pubc_dt", ds.pubc_dt); 
		
		rx.add(formData, "pre_pubc_slip_no", ds.pre_pubc_slip_no);
		rx.add(formData, "upd_yn", ds.upd_yn);
		rx.add(formData, "clos_stat", ds.clos_stat);
		rx.add(formData, "clamt_stat", ds.clamt_stat);
		rx.add(formData, "sale_stmt_issu_yn", ds.sale_stmt_issu_yn);
		rx.add(formData, "purc_stmt_issu_yn", ds.purc_stmt_issu_yn + ds.purc_stmt_issu_yn2);
		rx.add(formData, "purc_stmt_issu_yn2", ds.purc_stmt_issu_yn2);
		rx.add(formData, "upd_resn", ds.upd_resn);
		rx.add(formData, "upd_cont", ds.upd_cont);
		
		rx.add(formData, "pubc_side", ds.pubc_side); 
		rx.add(formData, "pubc_occr_dt", ds.pubc_occr_dt); 
		rx.add(formData, "pubc_occr_seq", ds.pubc_occr_seq); 
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jan 29 11:08:42 KST 2009 */ %>