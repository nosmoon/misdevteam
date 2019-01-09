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
	IS_RPT_1910_LDataSet ds = (IS_RPT_1910_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_RPT_1910_LCURLIST1Record rec = (IS_RPT_1910_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "sido", rec.sido);
			rx.add(record, "gu", rec.gu);
			rx.add(record, "sido_nm", rec.sido_nm);
			rx.add(record, "gu_nm", rec.gu_nm);
			rx.add(record, "p_amt_010", rec.p_amt_010);
			rx.add(record, "p_amt_020", rec.p_amt_020);
			rx.add(record, "p_amt_030", rec.p_amt_030);
			rx.add(record, "p_amt_tot", rec.p_amt_tot);
			rx.add(record, "b_amt_010", rec.b_amt_010);
			rx.add(record, "b_amt_020", rec.b_amt_020);
			rx.add(record, "b_amt_030", rec.b_amt_030);
			rx.add(record, "b_amt_tot", rec.b_amt_tot);
			rx.add(record, "c_amt_010", rec.c_amt_010);
			rx.add(record, "c_amt_020", rec.c_amt_020);
			rx.add(record, "c_amt_030", rec.c_amt_030);
			rx.add(record, "c_amt_tot", rec.c_amt_tot);
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
