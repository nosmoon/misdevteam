<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BAS_2120_LDataSet ds = (AD_BAS_2120_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";

	dataSet = rx.add(root, "gridData", "");
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "record", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_2120_LCURLISTRecord rec = (AD_BAS_2120_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cust_mang_item", rec.cust_mang_item);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "send_dt", rec.send_dt);
			rx.add(record, "remk", rec.remk);
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
			<cust_mang_item/>
			<flnm/>
			<send_dt/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jan 21 15:19:14 KST 2009 */ %>