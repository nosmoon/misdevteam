<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>
 
<%
RwXml rx = new RwXml();
IS_DEP_4600_MDataSet ds = (IS_DEP_4600_MDataSet)request.getAttribute("ds");
int root = RwXml.rootNodeID;
int dataSet = 0;
int recordSet = 0;
String errcode = ds.errcode;
String errmsg = ds.errmsg;
dataSet = rx.add(root, "dataSet", "");
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_DEP_4600_MCURLIST1Record rec = (IS_DEP_4600_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cdnm_cd", rec.cd+ " " + rec.cdnm );
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
