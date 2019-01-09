<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_4001_LDataSet ds = (MT_COMMATR_4001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	recordSet = rx.add(root, "tempData", "");
	formData = rx.add(recordSet, "matr_cd", "");
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_COMMATR_4001_LCURLISTRecord rec = (MT_COMMATR_4001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "item", "");
			rx.add(record, "value", rec.matr_cd);
			rx.add(record, "label", rec.matr_cdnm);
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
			<matr_cd/>
			<matr_nm/>
			<matr_cdnm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu May 07 21:38:57 KST 2009 */ %>