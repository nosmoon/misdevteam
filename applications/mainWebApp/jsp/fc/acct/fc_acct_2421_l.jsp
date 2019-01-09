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
	FC_ACCT_2421_LDataSet ds = (FC_ACCT_2421_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2421_LCURLISTRecord rec = (FC_ACCT_2421_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "acct_cd_nm", rec.acct_cd_nm);
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "dr_amt", rec.dr_amt);
			rx.add(record, "crdt_amt", rec.crdt_amt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

		/****** CURAMT BEGIN */
		recordSet = rx.add(dataSet, "CURAMT", "");

		for(int i = 0; i < ds.curamt.size(); i++) {
			FC_ACCT_2421_LCURAMTRecord rec = (FC_ACCT_2421_LCURAMTRecord)ds.curamt.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fajcbamt", rec.fajcbamt);
			rx.add(record, "fajdbamt", rec.fajdbamt);
			rx.add(record, "fdajcbamt", rec.fdajcbamt);
			rx.add(record, "fdajdbamt", rec.fdajdbamt);
			rx.add(record, "fcbjan", rec.fcbjan);
			rx.add(record, "fdbjan", rec.fdbjan);
		}
		rx.add(recordSet, "totalcnt", ds.curamt.size());
		/****** CURAMT END */

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