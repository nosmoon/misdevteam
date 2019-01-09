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
	IS_RPT_2010_LDataSet ds = (IS_RPT_2010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_RPT_2010_LCURLIST1Record rec = (IS_RPT_2010_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "sido", rec.sido);
			rx.add(record, "gu", rec.gu);
			rx.add(record, "sido_nm", rec.sido_nm);
			rx.add(record, "gu_nm", rec.gu_nm);
			rx.add(record, "scat_yyyy", rec.scat_yyyy);
			rx.add(record, "scat_yyyy_2", rec.scat_yyyy_2);
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
			rx.add(record, "amt_12", rec.amt_12);
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
