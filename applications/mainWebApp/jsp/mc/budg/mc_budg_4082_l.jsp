<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_4082_LDataSet ds = (MC_BUDG_4082_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_4082_LCURLISTRecord rec = (MC_BUDG_4082_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "befamt_10", rec.befamt_10);
			rx.add(record, "addamt_10", rec.addamt_10);
			rx.add(record, "sumamt_10", rec.sumamt_10);
			rx.add(record, "befamt_20", rec.befamt_20);
			rx.add(record, "addamt_20", rec.addamt_20);
			rx.add(record, "sumamt_20", rec.sumamt_20);
			//rx.add(record, "befamt_10", StringUtil.replaceToXml(rec.befamt_10));
			//rx.add(record, "addamt_10", StringUtil.replaceToXml(rec.addamt_10));
			//rx.add(record, "sumamt_10", StringUtil.replaceToXml(rec.sumamt_10));
			//rx.add(record, "befamt_20", StringUtil.replaceToXml(rec.befamt_20));
			//rx.add(record, "addamt_20", StringUtil.replaceToXml(rec.addamt_20));
			//rx.add(record, "sumamt_20", StringUtil.replaceToXml(rec.sumamt_20));
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
<mc_budg_4082_l>
	<dataSet>
		<CURLIST>
			<record>
				<befamt_10/>
				<addamt_10/>
				<sumamt_10/>
				<befamt_20/>
				<addamt_20/>
				<sumamt_20/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_4082_l>
*/
%>

<% /* 작성시간 : Mon May 18 14:24:01 KST 2009 */ %>