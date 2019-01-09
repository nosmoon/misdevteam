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
	IS_AGR_2110_LDataSet ds = (IS_AGR_2110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_2110_LCURLISTRecord rec = (IS_AGR_2110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "t_no", rec.t_no);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "sub_dept_cd", rec.sub_dept_cd);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "rvord_type_amt01", rec.rvord_type_amt01);
			//rx.add(record, "rvord_type_amt01_rate", rec.rvord_type_amt01_rate);
			rx.add(record, "rvord_type_amt01_rate", DigitUtil.cutUnderPoint(rec.rvord_type_amt01_rate,2));
			rx.add(record, "rvord_type_amt02", rec.rvord_type_amt02);
			//rx.add(record, "rvord_type_amt02_rate", rec.rvord_type_amt02_rate);
			rx.add(record, "rvord_type_amt02_rate", DigitUtil.cutUnderPoint(rec.rvord_type_amt02_rate,2));
			rx.add(record, "rvord_type_amt_subtot", rec.rvord_type_amt_subtot);
			rx.add(record, "rvord_type_amt03", rec.rvord_type_amt03);
			rx.add(record, "rvord_type_amt_tot", rec.rvord_type_amt_tot);
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
