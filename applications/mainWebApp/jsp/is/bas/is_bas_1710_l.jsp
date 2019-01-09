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
	IS_BAS_1710_LDataSet ds = (IS_BAS_1710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");
	
	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_BAS_1710_LCURLISTRecord rec = (IS_BAS_1710_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "cntr_stat_clsf_nm", rec.cntr_stat_clsf_nm);
			rx.add(record, "dlco_cd_seq", rec.dlco_cd_seq);
			rx.add(record, "asnt_dstc_cd", rec.asnt_dstc_cd);
			rx.addCData(record, "asnt_dstc_cd_nm", rec.asnt_dstc_cd_nm);
			rx.add(record, "adms_dstc_cd", rec.adms_dstc_cd);
			rx.addCData(record, "adms_dstc_cdd_nm", rec.adms_dstc_cdd_nm);
			rx.addCData(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.addCData(record, "addr", rec.addr);
			rx.addCData(record, "jurs_dong_nm", rec.jurs_dong_nm);
			rx.addCData(record, "jurs_apt", rec.jurs_apt);
			rx.addCData(record, "leaf_addr", rec.leaf_addr);
			rx.add(record, "job_ptph_no", rec.job_ptph_no);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "setl_bank_nm", rec.setl_bank_nm);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "rcpm_main_nm", rec.rcpm_main_nm);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
