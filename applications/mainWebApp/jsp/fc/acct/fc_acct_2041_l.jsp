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
	FC_ACCT_2041_LDataSet ds = (FC_ACCT_2041_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_2041_LCURLIST1Record rec = (FC_ACCT_2041_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_amt", rec.occr_amt);
			rx.add(record, "actu_adpay_bal", rec.actu_adpay_bal);
			rx.add(record, "rest_amt", rec.rest_amt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_2041_LCURLISTRecord rec = (FC_ACCT_2041_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "chk", rec.chk);
			rx.add(record, "slip_no", rec.slip_no);
			rx.addCData(record, "rmks1", rec.rmks1);
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "occr_amt", rec.occr_amt);
			rx.add(record, "actu_adpay_bal", rec.actu_adpay_bal);
			rx.add(record, "rest_amt", rec.rest_amt);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.addCData(record, "dept_nm", rec.dept_nm);
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
	<CURLIST1>
		<record>
			<occr_amt/>
			<actu_adpay_bal/>
			<rest_amt/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<chk/>
			<slip_no/>
			<rmks1/>
			<fisc_dt/>
			<occr_amt/>
			<actu_adpay_bal/>
			<rest_amt/>
			<evnt_cd/>
			<dept_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 04 17:28:13 KST 2009 */ %>