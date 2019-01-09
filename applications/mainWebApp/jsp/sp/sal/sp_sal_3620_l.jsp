<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_3620_LDataSet ds = (SP_SAL_3620_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData2 = rx.add(root, "", "");
	
	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_3620_LCURLISTRecord rec = (SP_SAL_3620_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "item", rec.item);
			rx.add(record, "std", rec.std);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
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