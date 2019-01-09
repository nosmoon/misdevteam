<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.agr.rec.*
	,	chosun.ciis.is.agr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_AGR_3210_LDataSet ds = (IS_AGR_3210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_3210_LCURLISTRecord rec = (IS_AGR_3210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "make_ask_reg_dt", rec.make_ask_reg_dt);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "advt_nm", rec.advt_nm);
			rx.add(record, "work_kind_nm", rec.work_kind_nm);
			rx.add(record, "make_clsf_nm", rec.make_clsf_nm);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "clr_cd_nm", rec.clr_cd_nm);
			rx.add(record, "rvord_qunt", rec.rvord_qunt);
			//rx.add(record, "rvord_uprc", rec.rvord_uprc);
			rx.add(record, "rvord_uprc", DigitUtil.cutUnderPoint(rec.rvord_uprc,2));
			rx.add(record, "rvord_amt", rec.rvord_amt);
			rx.add(record, "acwr_incmg_dt_tm", rec.acwr_incmg_dt_tm);
			rx.add(record, "draft_end_dt", rec.draft_end_dt);
			rx.add(record, "dlvs_dt", rec.dlvs_dt);
			rx.add(record, "purc_dlco_nm", rec.purc_dlco_nm);
			rx.add(record, "purc_clsf_nm", rec.purc_clsf_nm);
			rx.add(record, "purc_amt", rec.purc_amt);
			rx.add(record, "stmt_recp_yn", rec.stmt_recp_yn);
			rx.add(record, "make_ask_reg_seq", rec.make_ask_reg_seq);
		}
		/****** CURLIST END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

