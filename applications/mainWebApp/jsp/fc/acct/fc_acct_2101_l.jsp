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
	FC_ACCT_2101_LDataSet ds = (FC_ACCT_2101_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2101_LCURLISTRecord rec = (FC_ACCT_2101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "rmks1", rec.rmks1);
			rx.add(record, "rmks2", rec.rmks2);
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "incmg_dt", rec.incmg_dt);
			rx.add(record, "draft_impt_amt1", rec.draft_impt_amt1);
			rx.add(record, "draft_expn_amt1", rec.draft_expn_amt1);
			rx.add(record, "draft_impt_amt2", rec.draft_impt_amt2);
			rx.add(record, "draft_expn_amt2", rec.draft_expn_amt2);
			rx.add(record, "draft_impt_amt", rec.draft_impt_amt);
			rx.add(record, "draft_expn_amt", rec.draft_expn_amt);
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
			<slip_no/>
			<rmks1/>
			<rmks2/>
			<fisc_dt/>
			<incmg_dt/>
			<draft_impt_amt1/>
			<draft_expn_amt1/>
			<draft_impt_amt2/>
			<draft_expn_amt2/>
			<draft_impt_amt/>
			<draft_expn_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 11 21:40:16 KST 2009 */ %>