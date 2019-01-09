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
	FC_ACCT_3015_ADataSet ds = (FC_ACCT_3015_ADataSet)request.getAttribute("ds");
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
			FC_ACCT_3015_ACURLISTRecord rec = (FC_ACCT_3015_ACURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "x", rec.x);
			rx.add(record, "prelae_pay_clsf_cd", rec.prelae_pay_clsf_cd);
			rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "pymt_amt", rec.pymt_amt);
			rx.add(record, "cntr_bal", rec.cntr_bal);
			rx.add(record, "pymt_cnt", rec.pymt_cnt);
			rx.add(record, "int_rate", rec.int_rate);
			rx.add(record, "prvmm_bal", rec.prvmm_bal);
			rx.add(record, "thmm_dr", rec.thmm_dr);
			rx.add(record, "thmm_crdt", rec.thmm_crdt);
			rx.add(record, "thmm_bal", rec.thmm_bal);
			rx.add(record, "famt1", rec.famt1);
			rx.add(record, "lcnt1", rec.lcnt1);
			rx.add(record, "lcnt2", rec.lcnt2);
			rx.add(record, "famt2", rec.famt2);
			rx.add(record, "famt3", rec.famt3);
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
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<x/>
			<prelae_pay_clsf_cd/>
			<mang_clsf_cd/>
			<mang_no/>
			<comp_dt/>
			<mtry_dt/>
			<pymt_amt/>
			<cntr_bal/>
			<pymt_cnt/>
			<int_rate/>
			<prvmm_bal/>
			<thmm_dr/>
			<thmm_crdt/>
			<thmm_bal/>
			<famt1/>
			<lcnt1/>
			<lcnt2/>
			<famt2/>
			<famt3/>
			<prelae_pay_clsf_cd1/>
			<mang_clsf_cd1/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Feb 17 17:54:24 KST 2009 */ %>