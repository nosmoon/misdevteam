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
	SP_SUP_1610_LDataSet ds = (SP_SUP_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SUP_1610_LCURLISTRecord rec = (SP_SUP_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "req_clsf", rec.req_clsf);
			rx.addCData(record, "titl", rec.titl);
			rx.add(record, "make_pers_nm", rec.make_pers_nm);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "brws_cnt", rec.brws_cnt);
			rx.add(record, "proc_stat", rec.proc_stat);
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
