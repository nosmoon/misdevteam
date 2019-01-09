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
	IS_BAS_1930_LDataSet ds = (IS_BAS_1930_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");


	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_BAS_1930_LCURLISTRecord rec = (IS_BAS_1930_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "sub_dept_nm", rec.sub_dept_nm);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "sale_clsf_nm", rec.sale_clsf_nm);
			rx.add(record, "trgt_sale_amt_01", rec.trgt_sale_amt_01);
			rx.add(record, "trgt_sale_amt_02", rec.trgt_sale_amt_02);
			rx.add(record, "trgt_sale_amt_03", rec.trgt_sale_amt_03);
			rx.add(record, "trgt_sale_amt_04", rec.trgt_sale_amt_04);
			rx.add(record, "trgt_sale_amt_05", rec.trgt_sale_amt_05);
			rx.add(record, "trgt_sale_amt_06", rec.trgt_sale_amt_06);
			rx.add(record, "trgt_sale_amt_07", rec.trgt_sale_amt_07);
			rx.add(record, "trgt_sale_amt_08", rec.trgt_sale_amt_08);
			rx.add(record, "trgt_sale_amt_09", rec.trgt_sale_amt_09);
			rx.add(record, "trgt_sale_amt_10", rec.trgt_sale_amt_10);
			rx.add(record, "trgt_sale_amt_11", rec.trgt_sale_amt_11);
			rx.add(record, "trgt_sale_amt_12", rec.trgt_sale_amt_12);
			rx.add(record, "trgt_sale_amt", rec.trgt_sale_amt);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
