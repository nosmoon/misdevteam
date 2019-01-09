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
	FC_ACCT_5821_LDataSet ds = (FC_ACCT_5821_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_5821_LCURLISTRecord rec = (FC_ACCT_5821_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pch_acctnm", rec.pch_acctnm);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.addCData(record, "pch_compnm", rec.pch_compnm);
			rx.add(record, "pch_convno", rec.pch_convno);
			rx.addCData(record, "pch_gwgbnm", rec.pch_gwgbnm);
			rx.addCData(record, "pch_mccdnm", rec.pch_mccdnm);
			rx.add(record, "intg_dlco_cd", rec.intg_dlco_cd);
			rx.addCData(record, "pch_hsnm", rec.pch_hsnm);
			rx.add(record, "dr_amt", rec.dr_amt);
			rx.add(record, "crdt_amt", rec.crdt_amt);
			rx.add(record, "pch_amt", rec.pch_amt);
			rx.add(record, "dr_amt_00", rec.dr_amt_00);
			rx.add(record, "crdt_amt_00", rec.crdt_amt_00);
			rx.add(record, "pch_amt_00", rec.pch_amt_00);
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
			<pch_acctnm/>
			<dlco_cd/>
			<pch_compnm/>
			<pch_convno/>
			<pch_gwgbnm/>
			<pch_mccdnm/>
			<intg_dlco_cd/>
			<pch_hsnm/>
			<dr_amt/>
			<crdt_amt/>
			<pch_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 11 17:56:45 KST 2009 */ %>