<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_5812_LDataSet ds = (FC_ACCT_5812_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_5812_LCURLISTRecord rec = (FC_ACCT_5812_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "supr_acct_cd", rec.supr_acct_cd);
			rx.addCData(record, "insd_acct_nm", rec.insd_acct_nm);
			rx.addCData(record, "acctcdacct_abrvnm", rec.acctcdacct_abrvnm);
			rx.add(record, "acct_levl", rec.acct_levl);
			rx.add(record, "etc", rec.etc);
			rx.add(record, "medi_100", rec.medi_100);
			rx.add(record, "medi_200", rec.medi_200);
			rx.add(record, "medi_210", rec.medi_210);
			rx.add(record, "medi_300", rec.medi_300);
			rx.add(record, "medi_400", rec.medi_400);
			rx.add(record, "medi_410", rec.medi_410);
			rx.add(record, "medi_450", rec.medi_450);
			rx.add(record, "medi_500", rec.medi_500);
			rx.add(record, "medi_550", rec.medi_550);
			rx.add(record, "medi_600", rec.medi_600);
			rx.add(record, "medi_660", rec.medi_660);
			rx.add(record, "medi_700", rec.medi_700);
			rx.add(record, "medi_770", rec.medi_770);
			rx.add(record, "medi_810", rec.medi_810);
			rx.add(record, "medi_900", rec.medi_900);
			rx.add(record, "medi_910", rec.medi_910);
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