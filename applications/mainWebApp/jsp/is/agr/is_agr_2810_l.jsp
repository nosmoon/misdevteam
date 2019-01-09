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
	IS_AGR_2810_LDataSet ds = (IS_AGR_2810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_2810_LCURLISTRecord rec = (IS_AGR_2810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "dlvs_dt", rec.dlvs_dt);
			rx.add(record, "make_ask_reg_dt", rec.make_ask_reg_dt);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "tot_rvord_amt", rec.tot_rvord_amt);
			rx.add(record, "prt_paper_cd_nm", rec.prt_paper_cd_nm);
			rx.add(record, "prt_plan_dt", rec.prt_plan_dt);
			rx.add(record, "work_clsf_nm", rec.work_clsf_nm);
			rx.add(record, "clr_cd_nm", rec.clr_cd_nm);
			rx.add(record, "pcnt_clsf_nm", rec.pcnt_clsf_nm);
			rx.add(record, "yy", rec.yy);
			rx.add(record, "purc_dlco_nm", rec.purc_dlco_nm);
			rx.add(record, "purc_clsf_nm", rec.purc_clsf_nm);
			rx.add(record, "purc_amt", rec.purc_amt);
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
