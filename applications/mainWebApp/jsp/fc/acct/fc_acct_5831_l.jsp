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
	FC_ACCT_5831_LDataSet ds = (FC_ACCT_5831_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_5831_LCURLISTRecord rec = (FC_ACCT_5831_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.add(record, "acacctnm", rec.acacctnm);
			rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			rx.add(record, "jbgwgbnm", rec.jbgwgbnm);
			rx.add(record, "kind", rec.kind);
			rx.add(record, "prvdd_bal", rec.prvdd_bal);
			rx.add(record, "dr_amt", rec.dr_amt);
			rx.add(record, "crdt_amt", rec.crdt_amt);
			rx.add(record, "curdd_bal", rec.curdd_bal);
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
			<acacctnm/>
			<mang_clsf_cd/>
			<jbgwgbnm/>
			<kind/>
			<prvdd_bal/>
			<dr_amt/>
			<crdt_amt/>
			<curdd_bal/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 10 21:19:09 KST 2009 */ %>