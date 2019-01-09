<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.com.rec.*
	,	chosun.ciis.is.com.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_COM_1810_LDataSet ds = (IS_COM_1810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_COM_1810_LCURLIST1Record rec = (IS_COM_1810_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "wkcd", rec.wkcd);
			rx.add(record, "frdt", rec.frdt);
			rx.add(record, "todt", rec.todt);
			rx.add(record, "sale_rfl_ratio", rec.sale_rfl_ratio);
			rx.add(record, "clamt_rfl_ratio", rec.clamt_rfl_ratio);
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
