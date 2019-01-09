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
	FC_ACCT_7011_LDataSet ds = (FC_ACCT_7011_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_7011_LCURLISTRecord rec = (FC_ACCT_7011_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "use_amt", rec.use_amt);
			rx.add(record, "rece_exp_clsf", rec.rece_exp_clsf);
			rx.add(record, "rcpt_clsf", rec.rcpt_clsf);
			rx.add(record, "card_mang_no", rec.card_mang_no);
			rx.add(record, "use_pers_emp_no", rec.use_pers_emp_no);
			rx.add(record, "rmks1", rec.rmks1);
			rx.add(record, "rmks2", rec.rmks2);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "use_dt", rec.use_dt);
			rx.add(record, "attd_fee", rec.attd_fee);
			rx.add(record, "prof_type_cd", rec.prof_type_cd);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "erplace_addr", rec.erplace_addr);
			rx.add(record, "firm_nm", rec.firm_nm);
			rx.add(record, "presi_nm", rec.presi_nm);
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
			<acct_cd/>
			<slip_no/>
			<fisc_dt/>
			<use_amt/>
			<rece_exp_clsf/>
			<rcpt_clsf/>
			<card_mang_no/>
			<use_pers_emp_no/>
			<rmks1/>
			<rmks2/>
			<budg_cd/>
			<use_dt/>
			<attd_fee/>
			<prof_type_cd/>
			<ern/>
			<prn/>
			<erplace_addr/>
			<firm_nm/>
			<presi_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Feb 06 15:09:48 KST 2009 */ %>