<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.code.rec.*
	,	chosun.ciis.co.code.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_COMNCD_SDataSet ds = (CO_COMNCD_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	int record		= 0;
	formData = rx.add(root, "tempData", "");
	record = rx.add(formData, "code", "");
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_COMNCD_SCURLISTRecord rec = (CO_COMNCD_SCURLISTRecord)ds.curlist.get(i);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cdflnm", rec.cdflnm);
		}
		/****** CURLIST END */
	}
	catch (Exception e) {
	}
	finally {
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
			<cd/>
			<cdnm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Feb 03 15:10:32 KST 2009 */ %>