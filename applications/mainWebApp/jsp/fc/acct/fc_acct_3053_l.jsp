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
	FC_ACCT_3053_LDataSet ds = (FC_ACCT_3053_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_3053_LCURLISTRecord rec = (FC_ACCT_3053_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "x", rec.x);
			rx.add(record, "prelae_pay_clsf_cd", rec.prelae_pay_clsf_cd);
			rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "loan_nm", rec.loan_nm);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "loan_amt", rec.loan_amt);
			rx.add(record, "dds", rec.dds);
			rx.add(record, "int_rate", rec.int_rate);
			rx.add(record, "prvmm_bal", rec.prvmm_bal);
			rx.add(record, "thmm_dr", rec.thmm_dr);
			rx.add(record, "thmm_crdt", rec.thmm_crdt);
			rx.add(record, "thmm_bal", rec.thmm_bal);
			rx.add(record, "prelae_pay_clsf_cd1", rec.prelae_pay_clsf_cd1);
			rx.add(record, "mang_clsf_cd1", rec.mang_clsf_cd1);
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
			<x/>
			<prelae_pay_clsf_cd/>
			<mang_clsf_cd/>
			<mang_no/>
			<loan_nm/>
			<comp_dt/>
			<mtry_dt/>
			<loan_amt/>
			<dds/>
			<int_rate/>
			<prvmm_bal/>
			<thmm_dr/>
			<thmm_crdt/>
			<thmm_bal/>
			<prelae_pay_clsf_cd1/>
			<mang_clsf_cd1/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Mon Feb 16 15:57:53 KST 2009 */ %>