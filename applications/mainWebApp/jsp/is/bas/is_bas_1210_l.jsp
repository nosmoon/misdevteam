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
	IS_BAS_1210_LDataSet ds = (IS_BAS_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_BAS_1210_LCURLISTRecord rec = (IS_BAS_1210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dlco_cd_seq", rec.dlco_cd_seq);
			rx.add(record, "asnt_dstc_cd", rec.asnt_dstc_cd);
			rx.add(record, "asnt_dstc_cd_nm", rec.asnt_dstc_cd_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "leaf_now_chrg_pers", rec.leaf_now_chrg_pers);
			rx.add(record, "leaf_now_chrg_pers_nm", rec.leaf_now_chrg_pers_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "sub_dept_cd", rec.sub_dept_cd);
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
