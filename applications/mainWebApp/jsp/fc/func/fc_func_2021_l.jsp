<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_2021_LDataSet ds = (FC_FUNC_2021_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_2021_LCURLISTRecord rec = (FC_FUNC_2021_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pay_bank_cdnm", rec.pay_bank_cdnm);
			rx.add(record, "seci_no", rec.seci_no);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "jbgamt", rec.jbgamt);
			rx.add(record, "rcpay_amt", rec.rcpay_amt);
			rx.add(record, "corp_tax_amt", rec.corp_tax_amt);
			rx.add(record, "jpno", rec.jpno);
			rx.add(record, "intamt", rec.intamt);
			rx.add(record, "misusuic", rec.misusuic);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "cost_gain_stot", rec.cost_gain_stot);
			rx.add(record, "rcpay_amt_stot", rec.rcpay_amt_stot);
			rx.add(record, "yugaint", rec.yugaint);
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
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<pay_bank_cdnm/>
			<seci_no/>
			<mtry_dt/>
			<jbgamt/>
			<rcpay_amt/>
			<corp_tax_amt/>
			<jpno/>
			<intamt/>
			<misusuic/>
			<rmks/>
			<cost_gain_stot/>
			<rcpay_amt_stot/>
			<yugaint/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 12 14:03:13 KST 2009 */ %>