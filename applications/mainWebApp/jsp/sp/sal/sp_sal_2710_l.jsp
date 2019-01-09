<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_2710_LDataSet ds = (SP_SAL_2710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_2710_LCURLISTRecord rec = (SP_SAL_2710_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "sp_comp_chrg_pers_emp_nm", rec.sp_comp_chrg_pers_emp_nm);
			rx.add(record, "sp_comp_chrg_pers_emp_no", rec.sp_comp_chrg_pers_emp_no);
			rx.add(record, "m01", rec.m01);
			rx.add(record, "m02", rec.m02);
			rx.add(record, "m03", rec.m03);
			rx.add(record, "m04", rec.m04);
			rx.add(record, "m05", rec.m05);
			rx.add(record, "m06", rec.m06);
			rx.add(record, "m07", rec.m07);
			rx.add(record, "m08", rec.m08);
			rx.add(record, "m09", rec.m09);
			rx.add(record, "m10", rec.m10);
			rx.add(record, "m11", rec.m11);
			rx.add(record, "m12", rec.m12);
			rx.add(record, "m13", rec.m13);
			rx.add(record, "m14", rec.m14);
			rx.add(record, "m15", rec.m15);
			rx.add(record, "m16", rec.m16);
			rx.add(record, "tot", rec.tot);
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
