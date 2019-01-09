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
	FC_ACCT_5842_LDataSet ds = (FC_ACCT_5842_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_5842_LCURLISTRecord rec = (FC_ACCT_5842_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sum_cbamt", rec.sum_cbamt);
			rx.add(record, "jan_cbamt", rec.jan_cbamt);
			rx.add(record, "insd_acct_cd", rec.insd_acct_cd);
			rx.addCData(record, "acct_subj_nm", rec.acct_subj_nm);
			rx.add(record, "slip_incmg_exne", rec.slip_incmg_exne);
			rx.add(record, "acct_levl", rec.acct_levl);
			rx.add(record, "jan_dbamt", rec.jan_dbamt);
			rx.add(record, "sum_dbamt", rec.sum_dbamt);
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
			<sum_cbamt/>
			<jan_cbamt/>
			<insd_acct_cd/>
			<acct_subj_nm/>
			<slip_incmg_exne/>
			<acct_levl/>
			<jan_dbamt/>
			<sum_dbamt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 11 10:03:53 KST 2009 */ %>