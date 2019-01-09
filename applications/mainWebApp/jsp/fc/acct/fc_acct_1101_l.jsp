<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_1101_LDataSet ds = (FC_ACCT_1101_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_1101_LCURLISTRecord rec = (FC_ACCT_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "rem_cash_hlmt", rec.rem_cash_hlmt);
			rx.add(record, "pay_amt_llmt", rec.pay_amt_llmt);
			rx.add(record, "pay_amt_hlmt", rec.pay_amt_hlmt);
			rx.add(record, "mtrydate", rec.mtrydate);
			rx.add(record, "note_amt_llmt", rec.note_amt_llmt);
			rx.add(record, "note_amt_hlmt", rec.note_amt_hlmt);
			rx.add(record, "rem_cash_hlmt1", rec.rem_cash_hlmt1);
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

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<dlco_clsf/>
			<rem_cash_hlmt/>
			<pay_amt_llmt/>
			<pay_amt_hlmt/>
			<mtrydate/>
			<note_amt_llmt/>
			<note_amt_hlmt/>
			<rem_cash_hlmt1/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Mon Mar 02 14:46:59 KST 2009 */ %>