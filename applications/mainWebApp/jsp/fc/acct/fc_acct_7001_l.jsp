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
	FC_ACCT_7001_LDataSet ds = (FC_ACCT_7001_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_7001_LCURLISTRecord rec = (FC_ACCT_7001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "card_mang_no", rec.card_mang_no);
			rx.add(record, "card_no", rec.card_no);
			rx.add(record, "use_pers_emp_no", rec.use_pers_emp_no);
			rx.add(record, "use_pers_emp_nm", rec.use_pers_emp_nm);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "decid_dd", rec.decid_dd);
			rx.add(record, "wste_dt", rec.wste_dt);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "decid_bank_cd", rec.decid_bank_cd);
			rx.add(record, "bank_nm", rec.bank_nm);
			rx.add(record, "memb_dnmn", rec.memb_dnmn);
			rx.add(record, "use_yn", rec.use_yn);
			rx.add(record, "corp_card_clsf", rec.corp_card_clsf);
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
			<card_mang_no/>
			<card_no/>
			<use_pers_emp_no/>
			<use_pers_emp_nm/>
			<issu_dt/>
			<mtry_dt/>
			<decid_dd/>
			<wste_dt/>
			<dlco_cd/>
			<decid_bank_cd/>
			<bank_nm/>
			<memb_dnmn/>
			<use_yn/>
			<corp_card_clsf/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 06 13:21:09 KST 2009 */ %>