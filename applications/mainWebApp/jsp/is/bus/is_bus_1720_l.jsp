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
	IS_BUS_1720_LDataSet ds = (IS_BUS_1720_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData2 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_BUS_1720_LCURLISTRecord rec = (IS_BUS_1720_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "sale_clsf", rec.sale_clsf);
			rx.add(record, "sale_clsf_nm", rec.sale_clsf_nm);
			rx.add(record, "sun", rec.sun);
			rx.add(record, "mon", rec.mon);
			rx.add(record, "tue", rec.tue);
			rx.add(record, "wed", rec.wed);
			rx.add(record, "thr", rec.thr);
			rx.add(record, "fri", rec.fri);
			rx.add(record, "sat", rec.sat);
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
