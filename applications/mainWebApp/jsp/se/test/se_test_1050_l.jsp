<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.test.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.se.test.ds.*;
	"
%>

<%

	RwXml rx = new RwXml();
	SE_TEST_1050_LDataSet ds = (SE_TEST_1050_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	try {
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SE_TEST_1050_LCURLIST1Record rec = (SE_TEST_1050_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(tempData, "record", "");
			rx.add(record, "yy", rec.yy);
			rx.add(record, "mm", rec.mm);
			rx.add(record, "week", rec.week);
			rx.addCData(record, "emp_nm", rec.emp_nm);
			rx.addCData(record, "cmpycd", rec.cmpycd);
			rx.addCData(record, "workcd", rec.workcd);		
			rx.addCData(record, "vip_lastweek", rec.vip_lastweek);		
			rx.addCData(record, "lastweek", rec.lastweek);	
			rx.addCData(record, "thisweek", rec.thisweek);	
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Fri Jan 30 16:14:10 KST 2009 */ %>