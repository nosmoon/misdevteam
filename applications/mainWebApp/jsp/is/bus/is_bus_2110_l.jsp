<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.bus.rec.*
	,	chosun.ciis.is.bus.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_BUS_2110_LDataSet ds = (IS_BUS_2110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST_1 BEGIN */
		for(int i = 0; i < ds.curlist_1.size(); i++) {
			IS_BUS_2110_LCURLIST_1Record rec = (IS_BUS_2110_LCURLIST_1Record)ds.curlist_1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "grp_row_number", rec.grp_row_number);
			rx.add(record, "purc_dlco_nm", rec.purc_dlco_nm);
			rx.add(record, "feed_dt", rec.feed_dt);
			rx.addCData(record, "advcs_nm", rec.advcs_nm);
			rx.add(record, "asnt_dstc_cd_nm", rec.asnt_dstc_cd_nm);
			rx.add(record, "std", rec.std);
			rx.add(record, "cnt_01", rec.cnt_01);
			rx.add(record, "cnt_02", rec.cnt_02);
			rx.add(record, "cnt_2", rec.cnt_2);
			rx.add(record, "cnt_3", rec.cnt_3);
			rx.add(record, "cnt_4", rec.cnt_4);
			rx.add(record, "etc_nm", rec.etc_nm);
		}
		/****** CURLIST_1 END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
