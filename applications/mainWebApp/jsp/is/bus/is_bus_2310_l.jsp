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
	IS_BUS_2310_LDataSet ds = (IS_BUS_2310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST_1 BEGIN */
		for(int i = 0; i < ds.curlist_1.size(); i++) {
			IS_BUS_2310_LCURLIST_1Record rec = (IS_BUS_2310_LCURLIST_1Record)ds.curlist_1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "sido_nm", rec.sido_nm);
			rx.add(record, "gu_nm", rec.gu_nm);
			rx.add(record, "tot_bo_cnt", rec.tot_bo_cnt);
			rx.add(record, "in_bo_cnt", rec.in_bo_cnt);
			//rx.add(record, "in_bo_rate", rec.in_bo_rate);
			rx.add(record, "in_bo_rate", DigitUtil.cutUnderPoint(rec.in_bo_rate,2));
			rx.add(record, "cnt_0", rec.cnt_0);
			rx.add(record, "cnt_1", rec.cnt_1);
			rx.add(record, "cnt_2", rec.cnt_2);
			rx.add(record, "cnt_3", rec.cnt_3);
			rx.add(record, "cnt_4", rec.cnt_4);
			rx.add(record, "cnt_t", rec.cnt_t);
			rx.add(record, "per_2", rec.per_2);
			rx.add(record, "per_3", rec.per_3);
			rx.add(record, "per_4", rec.per_4);
			rx.add(record, "minus_2", rec.minus_2);
			rx.add(record, "minus_3", rec.minus_3);
			rx.add(record, "minus_4", rec.minus_4);
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
