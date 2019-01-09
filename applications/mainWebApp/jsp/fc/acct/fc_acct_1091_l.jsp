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
	FC_ACCT_1091_LDataSet ds = (FC_ACCT_1091_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_1091_LCURLISTRecord rec = (FC_ACCT_1091_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "note_amt_llmt", rec.note_amt_llmt);
			rx.add(record, "note_amt_hlmt", rec.note_amt_hlmt);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "rem_cash_hlmt", rec.rem_cash_hlmt);
			rx.add(record, "pay_amt_llmt", rec.pay_amt_llmt);
			rx.add(record, "pay_amt_hlmt", rec.pay_amt_hlmt);
			rx.add(record, "mtrydd_llmt", rec.mtrydd_llmt);
			rx.add(record, "mtrydd_hlmt", rec.mtrydd_hlmt);
			rx.add(record, "mtrymm_llmt", rec.mtrymm_llmt);
			rx.add(record, "mtrymm_hlmt", rec.mtrymm_hlmt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "lump_setoff_excl_yn", rec.lump_setoff_excl_yn);
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
			<note_amt_llmt/>
			<note_amt_hlmt/>
			<incmg_pers_ipadd/>
			<rem_cash_hlmt/>
			<pay_amt_llmt/>
			<pay_amt_hlmt/>
			<mtrydd_llmt/>
			<mtrydd_hlmt/>
			<mtrymm_llmt/>
			<mtrymm_hlmt/>
			<seq/>
			<chg_dt_tm/>
			<chg_pers/>
			<lump_setoff_excl_yn/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 05 09:58:14 KST 2009 */ %>