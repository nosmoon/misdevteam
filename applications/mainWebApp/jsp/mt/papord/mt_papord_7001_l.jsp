<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_7001_LDataSet ds = (MT_PAPORD_7001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */

		MT_PAPORD_7001_LCURLISTRecord rec = (MT_PAPORD_7001_LCURLISTRecord)ds.curlist.get(0);
		rx.add(dataSet, "date1", rec.date1.substring(0,4) + "." + rec.date1.substring(4,6) + "." + rec.date1.substring(6,8));
		rx.add(dataSet, "date2", rec.date2.substring(0,4) + "." + rec.date2.substring(4,6) + "." + rec.date2.substring(6,8));
		rx.add(dataSet, "date3", rec.date3.substring(0,4) + "." + rec.date3.substring(4,6) + "." + rec.date3.substring(6,8));
		rx.add(dataSet, "date4", rec.date4.substring(0,4) + "." + rec.date4.substring(4,6) + "." + rec.date4.substring(6,8));
		rx.add(dataSet, "date5", rec.date5.substring(0,4) + "." + rec.date5.substring(4,6) + "." + rec.date5.substring(6,8));
		rx.add(dataSet, "date6", rec.date6.substring(0,4) + "." + rec.date6.substring(4,6) + "." + rec.date6.substring(6,8));
		rx.add(dataSet, "date7", rec.date7.substring(0,4) + "." + rec.date7.substring(4,6) + "." + rec.date7.substring(6,8));
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
			<date1/>
			<date2/>
			<date3/>
			<date4/>
			<date5/>
			<date6/>
			<date7/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 17 18:51:29 KST 2009 */ %>