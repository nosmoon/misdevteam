<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.sal.rec.*
	,	chosun.ciis.is.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_SAL_2210_LDataSet ds = (IS_SAL_2210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_SAL_2210_LCURLISTRecord rec = (IS_SAL_2210_LCURLISTRecord)ds.curlist.get(i);
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
			rx.add(record, "scat_dt", rec.scat_dt);
			rx.add(record, "b_suply_amt", rec.b_suply_amt);
			rx.add(record, "sale_clsf_nm", rec.sale_clsf_nm);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "uprc", DigitUtil.cutUnderPoint(rec.uprc,2));
			rx.add(record, "c_suply_amt", DigitUtil.cutUnderPoint(rec.c_suply_amt,2));
			rx.add(record, "sub_num", rec.sub_num);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_seq", rec.slip_seq);
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
