<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.comm.rec.*
	,	chosun.ciis.se.comm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SE_COMM_1410_LDataSet ds = (SE_COMM_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	dataSet = rx.add(root, "gridData", "");

	try {

		for(int i = 0; i < ds.curcommlist.size(); i++) {
			SE_COMM_1410_LCURCOMMLISTRecord rec = (SE_COMM_1410_LCURCOMMLISTRecord)ds.curcommlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
