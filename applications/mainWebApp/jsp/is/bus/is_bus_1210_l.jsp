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
	IS_BUS_1210_LDataSet ds = (IS_BUS_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_BUS_1210_LCURLIST1Record rec = (IS_BUS_1210_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "wkcd", rec.wkcd);
			rx.add(record, "frdt", rec.frdt);
			rx.add(record, "todt", rec.todt);
			rx.add(record, "sale_rfl_ratio", DigitUtil.cutUnderPoint(rec.sale_rfl_ratio,2));
			rx.add(record, "sale_rfl_ratio_cum", rec.sale_rfl_ratio_cum);
			rx.add(record, "clamt_rfl_ratio", DigitUtil.cutUnderPoint(rec.clamt_rfl_ratio,2));
			rx.add(record, "clamt_rfl_ratio_cum", rec.clamt_rfl_ratio_cum);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
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
