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
	IS_BAS_2030_LDataSet ds = (IS_BAS_2030_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_BAS_2030_LCURLISTRecord rec = (IS_BAS_2030_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "sub_dept_nm", rec.sub_dept_nm);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "trgt_clamt_01", rec.trgt_clamt_01);
			rx.add(record, "trgt_clamt_02", rec.trgt_clamt_02);
			rx.add(record, "trgt_clamt_03", rec.trgt_clamt_03);
			rx.add(record, "trgt_clamt_04", rec.trgt_clamt_04);
			rx.add(record, "trgt_clamt_05", rec.trgt_clamt_05);
			rx.add(record, "trgt_clamt_06", rec.trgt_clamt_06);
			rx.add(record, "trgt_clamt_07", rec.trgt_clamt_07);
			rx.add(record, "trgt_clamt_08", rec.trgt_clamt_08);
			rx.add(record, "trgt_clamt_09", rec.trgt_clamt_09);
			rx.add(record, "trgt_clamt_10", rec.trgt_clamt_10);
			rx.add(record, "trgt_clamt_11", rec.trgt_clamt_11);
			rx.add(record, "trgt_clamt_12", rec.trgt_clamt_12);
			rx.add(record, "trgt_clamt", rec.trgt_clamt);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
