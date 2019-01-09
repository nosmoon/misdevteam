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
	IS_DEP_2710_LDataSet ds = (IS_DEP_2710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_DEP_2710_LCURLISTRecord rec = (IS_DEP_2710_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "sub_dept_cd", rec.sub_dept_cd);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "sale_proc_ym", rec.sale_proc_ym);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "tot_rvord_amt", rec.tot_rvord_amt);
			rx.add(record, "setoff_amt_m0", rec.setoff_amt_m0);
			rx.add(record, "setoff_amt_m1", rec.setoff_amt_m1);
			rx.add(record, "setoff_amt_m2", rec.setoff_amt_m2);
			rx.add(record, "setoff_amt_m3", rec.setoff_amt_m3);
			rx.add(record, "setoff_amt_m4", rec.setoff_amt_m4);
			rx.add(record, "setoff_amt_m5", rec.setoff_amt_m5);
			rx.add(record, "setoff_amt_m6", rec.setoff_amt_m6);
			rx.add(record, "setoff_amt_m7", rec.setoff_amt_m7);
			rx.add(record, "misu_amt", rec.misu_amt);
			rx.add(record, "setoff_amt_rate_m0", DigitUtil.cutUnderPoint(rec.setoff_amt_rate_m0,2));
			rx.add(record, "setoff_amt_rate_m1", DigitUtil.cutUnderPoint(rec.setoff_amt_rate_m1,2));
			rx.add(record, "setoff_amt_rate_m2", DigitUtil.cutUnderPoint(rec.setoff_amt_rate_m2,2));
			rx.add(record, "setoff_amt_rate_m3", DigitUtil.cutUnderPoint(rec.setoff_amt_rate_m3,2));
			rx.add(record, "setoff_amt_rate_m4", DigitUtil.cutUnderPoint(rec.setoff_amt_rate_m4,2));
			rx.add(record, "setoff_amt_rate_m5", DigitUtil.cutUnderPoint(rec.setoff_amt_rate_m5,2));
			rx.add(record, "setoff_amt_rate_m6", DigitUtil.cutUnderPoint(rec.setoff_amt_rate_m6,2));
			rx.add(record, "setoff_amt_rate_m7", DigitUtil.cutUnderPoint(rec.setoff_amt_rate_m7,2));
			rx.add(record, "misu_amt_rate", DigitUtil.cutUnderPoint(rec.misu_amt_rate,2));
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
