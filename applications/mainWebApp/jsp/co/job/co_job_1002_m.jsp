<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.job.rec.*
	,	chosun.ciis.co.job.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_JOB_1002_MDataSet ds = (CO_JOB_1002_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int comboSet = 0;

	try {
		int emp = rx.add(root, "emp", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_JOB_1002_MCURLISTRecord rec = (CO_JOB_1002_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(emp, "item", "");
			rx.add(record, "empno", rec.empno);
			rx.add(record, "empnm", rec.empnm);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
