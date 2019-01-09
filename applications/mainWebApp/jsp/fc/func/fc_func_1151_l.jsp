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
	FC_FUNC_1151_LDataSet ds = (FC_FUNC_1151_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1151_LCURLISTRecord rec = (FC_FUNC_1151_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "yyyymm", rec.yyyymm);
			rx.add(record, "balsaengcnttot", rec.balsaengcnttot);
			rx.add(record, "balsaengamttot", rec.balsaengamttot);
			rx.add(record, "somyeolcnttot", rec.somyeolcnttot);
			rx.add(record, "somyeolamttot", rec.somyeolamttot);
			rx.add(record, "daesoncnttot", rec.daesoncnttot);
			rx.add(record, "daesonamttot", rec.daesonamttot);
			rx.add(record, "janaegcnttot", rec.janaegcnttot);
			rx.add(record, "janaegamttot", rec.janaegamttot);
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
			<yyyymm/>
			<balsaengcnttot/>
			<balsaengamttot/>
			<somyeolcnttot/>
			<somyeolamttot/>
			<daesoncnttot/>
			<daesonamttot/>
			<janaegcnttot/>
			<janaegamttot/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 05 17:20:16 KST 2009 */ %>