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
	IS_AGR_2440_LDataSet ds = (IS_AGR_2440_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData4 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_2440_LCURLISTRecord rec = (IS_AGR_2440_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData4, "record", "");
			rx.add(record, "t_no", rec.t_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "scat_dt_yy", rec.scat_dt_yy);
			rx.add(record, "qunt_01", rec.qunt_01);
			rx.add(record, "qunt_02", rec.qunt_02);
			rx.add(record, "qunt_03", rec.qunt_03);
			rx.add(record, "qunt_04", rec.qunt_04);
			rx.add(record, "qunt_05", rec.qunt_05);
			rx.add(record, "qunt_06", rec.qunt_06);
			rx.add(record, "qunt_07", rec.qunt_07);
			rx.add(record, "qunt_08", rec.qunt_08);
			rx.add(record, "qunt_09", rec.qunt_09);
			rx.add(record, "qunt_10", rec.qunt_10);
			rx.add(record, "qunt_11", rec.qunt_11);
			rx.add(record, "qunt_12", rec.qunt_12);
			rx.add(record, "suply_amt_01", rec.suply_amt_01);
			rx.add(record, "suply_amt_02", rec.suply_amt_02);
			rx.add(record, "suply_amt_03", rec.suply_amt_03);
			rx.add(record, "suply_amt_04", rec.suply_amt_04);
			rx.add(record, "suply_amt_05", rec.suply_amt_05);
			rx.add(record, "suply_amt_06", rec.suply_amt_06);
			rx.add(record, "suply_amt_07", rec.suply_amt_07);
			rx.add(record, "suply_amt_08", rec.suply_amt_08);
			rx.add(record, "suply_amt_09", rec.suply_amt_09);
			rx.add(record, "suply_amt_10", rec.suply_amt_10);
			rx.add(record, "suply_amt_11", rec.suply_amt_11);
			rx.add(record, "suply_amt_12", rec.suply_amt_12);
			rx.add(record, "qunt_tot", rec.qunt_tot);
			rx.add(record, "suply_amt_tot", rec.suply_amt_tot);
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
