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
	IS_DEP_2910_LDataSet ds = (IS_DEP_2910_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_DEP_2910_LCURLISTRecord rec = (IS_DEP_2910_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "tax_stmt_no", rec.tax_stmt_no);
			rx.add(record, "prof_type_cd_nm", rec.prof_type_cd_nm);
			rx.add(record, "make_dt", rec.make_dt);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "total_amt", rec.total_amt);
			rx.add(record, "erplace_cd_nm", rec.erplace_cd_nm);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "clamt_plan_dt", rec.clamt_plan_dt);
			rx.add(record, "clamt_plan_dt_cnt", rec.clamt_plan_dt_cnt);
			rx.add(record, "tot_rcpm_amt", rec.tot_rcpm_amt);
			rx.add(record, "misu_amt", rec.misu_amt);
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
