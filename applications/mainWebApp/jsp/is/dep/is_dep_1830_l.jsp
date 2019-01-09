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
	IS_DEP_1830_LDataSet ds = (IS_DEP_1830_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData2 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_DEP_1830_LCURLISTRecord rec = (IS_DEP_1830_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "sale_proc_dt", rec.sale_proc_dt);
			rx.add(record, "stmt_no", rec.stmt_no);
			rx.add(record, "acwr_reg_dt_seq", rec.acwr_reg_dt_seq);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "tot_rvord_amt", rec.tot_rvord_amt);
			rx.add(record, "trc_unrcp_amt", rec.trc_unrcp_amt);
			rx.add(record, "chg_prv_dept_cd_nm", rec.chg_prv_dept_cd_nm);
			rx.add(record, "chg_prv_sub_dept_cd_nm", rec.chg_prv_sub_dept_cd_nm);
			rx.add(record, "chg_prv_chrg_pers", rec.chg_prv_chrg_pers);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "trc_reg_dt", rec.trc_reg_dt);
			rx.add(record, "incmg_pers", rec.incmg_pers);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
