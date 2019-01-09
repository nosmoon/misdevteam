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
	IS_RPT_2410_LDataSet ds = (IS_RPT_2410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_RPT_2410_LCURLIST1Record rec = (IS_RPT_2410_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "asnt_dstc_cd", rec.asnt_dstc_cd);
			rx.add(record, "purc_dlco_no", rec.purc_dlco_no);
			rx.add(record, "asnt_dstc_cd_nm", rec.asnt_dstc_cd_nm);
			rx.add(record, "purc_dlco_nm", rec.purc_dlco_nm);
			rx.add(record, "o_amt_01", rec.o_amt_01);
			rx.add(record, "o_amt_02", rec.o_amt_02);
			rx.add(record, "o_amt_03", rec.o_amt_03);
			rx.add(record, "o_amt_04", rec.o_amt_04);
			rx.add(record, "o_amt_05", rec.o_amt_05);
			rx.add(record, "o_amt_06", rec.o_amt_06);
			rx.add(record, "o_amt_07", rec.o_amt_07);
			rx.add(record, "o_amt_08", rec.o_amt_08);
			rx.add(record, "o_amt_09", rec.o_amt_09);
			rx.add(record, "o_amt_10", rec.o_amt_10);
			rx.add(record, "o_amt_11", rec.o_amt_11);
			rx.add(record, "o_amt_12", rec.o_amt_12);
			rx.add(record, "p_amt_01", rec.p_amt_01);
			rx.add(record, "p_amt_02", rec.p_amt_02);
			rx.add(record, "p_amt_03", rec.p_amt_03);
			rx.add(record, "p_amt_04", rec.p_amt_04);
			rx.add(record, "p_amt_05", rec.p_amt_05);
			rx.add(record, "p_amt_06", rec.p_amt_06);
			rx.add(record, "p_amt_07", rec.p_amt_07);
			rx.add(record, "p_amt_08", rec.p_amt_08);
			rx.add(record, "p_amt_09", rec.p_amt_09);
			rx.add(record, "p_amt_10", rec.p_amt_10);
			rx.add(record, "p_amt_11", rec.p_amt_11);
			rx.add(record, "p_amt_12", rec.p_amt_12);
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
