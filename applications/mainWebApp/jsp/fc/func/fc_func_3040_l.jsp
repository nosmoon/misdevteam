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
	FC_FUNC_3040_LDataSet ds = (FC_FUNC_3040_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_3040_LCURLISTRecord rec = (FC_FUNC_3040_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "busn_dt", rec.busn_dt);
			rx.add(record, "in_cash", rec.in_cash);
			rx.add(record, "in_note", rec.in_note);
			rx.add(record, "in_tot", rec.in_tot);
			rx.add(record, "out_amt", rec.out_amt);
			rx.add(record, "mtry_amt", rec.mtry_amt);
			rx.add(record, "entry_amt", rec.entry_amt);
			rx.add(record, "bal_amt", rec.bal_amt);
			rx.add(record, "bal_amt2", rec.bal_amt2);
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
			<busn_dt/>
			<in_cash/>
			<in_note/>
			<in_tot/>
			<out_amt/>
			<mtry_amt/>
			<entry_amt/>
			<bal_amt/>
			<bal_amt2/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 02 12:07:46 KST 2009 */ %>