<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sup.rec.*
	,	chosun.ciis.sp.sup.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SUP_1510_LDataSet ds = (SP_SUP_1510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SUP_1510_LCURLISTRecord rec = (SP_SUP_1510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "l1", rec.l1);
			rx.add(record, "l2", rec.l2);
			rx.add(record, "l3", rec.l3);
			rx.add(record, "l4", rec.l4);
			rx.add(record, "l5", rec.l5);
			rx.add(record, "l6", rec.l6);
			rx.add(record, "r1", rec.r1);
			rx.add(record, "r2", rec.r2);
			rx.add(record, "r3", rec.r3);
			rx.add(record, "r4", rec.r4);
			rx.add(record, "r5", rec.r5);
			rx.add(record, "r6", rec.r6);
			rx.add(record, "r7", rec.r7);
			rx.add(record, "tot", Integer.parseInt(rec.l1)+Integer.parseInt(rec.l2)+Integer.parseInt(rec.l3)+Integer.parseInt(rec.l4)+
			                      Integer.parseInt(rec.l5)+Integer.parseInt(rec.l6)+Integer.parseInt(rec.r1)+Integer.parseInt(rec.r2)+
			                      Integer.parseInt(rec.r3)+Integer.parseInt(rec.r4)+Integer.parseInt(rec.r5)+Integer.parseInt(rec.r6)+Integer.parseInt(rec.r7));
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
