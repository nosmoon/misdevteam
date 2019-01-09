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
	IS_AGR_2010_LDataSet ds = (IS_AGR_2010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_2010_LCURLISTRecord rec = (IS_AGR_2010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "t_no", rec.t_no);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "sub_dept_cd", rec.sub_dept_cd);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "amt_01", rec.amt_01);
			rx.add(record, "amt_02", rec.amt_02);
			rx.add(record, "amt_03", rec.amt_03);
			rx.add(record, "amt_04", rec.amt_04);
			rx.add(record, "amt_05", rec.amt_05);
			rx.add(record, "amt_06", rec.amt_06);
			rx.add(record, "amt_07", rec.amt_07);
			rx.add(record, "amt_08", rec.amt_08);
			rx.add(record, "amt_09", rec.amt_09);
			rx.add(record, "amt_10", rec.amt_10);
			rx.add(record, "amt_11", rec.amt_11);
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
