<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.rpt.rec.*
	,	chosun.ciis.is.rpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_RPT_1060_LDataSet ds = (IS_RPT_1060_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_RPT_1060_LCURLIST1Record rec = (IS_RPT_1060_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "rcpm_dt", rec.rcpm_dt);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "rcpm_clsf_nm", rec.rcpm_clsf_nm);
			rx.add(record, "rcpm_acct_nm", rec.rcpm_acct_nm);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
		}
		/****** CURLIST1 END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
