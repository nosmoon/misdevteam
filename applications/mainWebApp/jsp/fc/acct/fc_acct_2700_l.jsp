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
	FC_ACCT_2700_LDataSet ds = (FC_ACCT_2700_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2700_LCURLISTRecord rec = (FC_ACCT_2700_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "before_amt", rec.before_amt);
			rx.add(record, "dd_amt1", rec.dd_amt1);
			rx.add(record, "dd_amt2", rec.dd_amt2);
			rx.add(record, "dd_amt3", rec.dd_amt3);
		}
		/****** CURLIST END */
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_2700_LCURLIST2Record rec = (FC_ACCT_2700_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "before_amt", rec.before_amt);
			rx.add(record, "dd_amt1", rec.dd_amt1);
			rx.add(record, "dd_amt2", rec.dd_amt2);
			rx.add(record, "dd_amt3", rec.dd_amt3);
		}
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
			<acct_cd_nm/>
			<fisc_dt/>
			<slip_no/>
			<rmks/>
			<dr_amt/>
			<crdt_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURAMT>
		<record>
			<fajcbamt/>
			<fajdbamt/>
			<fdajcbamt/>
			<fdajdbamt/>
			<fcbjan/>
			<fdbjan/>
		</record>
	</CURAMT>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Feb 23 12:17:17 KST 2009 */ %>