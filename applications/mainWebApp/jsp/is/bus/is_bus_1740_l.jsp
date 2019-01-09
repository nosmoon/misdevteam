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
	IS_BUS_1740_LDataSet ds = (IS_BUS_1740_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData4 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_BUS_1740_LCURLISTRecord rec = (IS_BUS_1740_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData4, "record", "");
			rx.add(record, "preng_dt", rec.preng_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sale_clsf", rec.sale_clsf);
			rx.add(record, "spcsale_clsf", rec.spcsale_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.addCData(record, "advcs_nm", rec.advcs_nm);
			rx.addCData(record, "remk_matt", rec.remk_matt);
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "make_pers", rec.make_pers);
			rx.add(record, "make_pers_nm", rec.make_pers_nm);
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
