<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.semuro.rec.*
	,	chosun.ciis.co.semuro.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_SEMURO_1800_LDataSet ds = (CO_SEMURO_1800_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "userInfo", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_SEMURO_1800_LCURLISTRecord rec = (CO_SEMURO_1800_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "semuro_id", rec.semuro_id);
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
			<semuro_id/>
			<semuro_pwd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sun Mar 15 19:03:07 KST 2009 */ %>