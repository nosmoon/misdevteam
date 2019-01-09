<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_6032_LDataSet ds = (FC_FUNC_6032_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_6032_LCURLISTRecord rec = (FC_FUNC_6032_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "recp_dt", rec.recp_dt);
			rx.add(record, "tot_int_amt", rec.tot_int_amt);
			rx.add(record, "corp_tax_amt", rec.corp_tax_amt);
			rx.add(record, "aft_tax_int_amt", rec.aft_tax_int_amt);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "unrcp_precpt_bal", rec.unrcp_precpt_bal);
			rx.add(record, "jpno", rec.jpno);
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
			<recp_dt/>
			<tot_int_amt/>
			<corp_tax_amt/>
			<aft_tax_int_amt/>
			<rmks/>
			<unrcp_precpt_bal/>
			<jpno/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 17 15:47:29 KST 2009 */ %>