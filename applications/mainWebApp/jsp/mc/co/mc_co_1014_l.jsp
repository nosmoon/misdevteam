<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.co.rec.*
	,	chosun.ciis.mc.co.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_CO_1014_LDataSet ds = (MC_CO_1014_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MC_CO_1014_LCURLISTRecord rec = (MC_CO_1014_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
<% /* �ۼ��ð� : Wed May 27 11:11:45 KST 2009 */ %>