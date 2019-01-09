<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.dlco.rec.*
	,	chosun.ciis.co.dlco.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_DLCO_1100_LDataSet ds = (CO_DLCO_1100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_DLCO_1100_LCURLISTRecord rec = (CO_DLCO_1100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "dlco_abrv_nm", rec.dlco_abrv_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "presi_nm", rec.presi_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
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
			<dlco_no/>
			<ern/>
			<dlco_abrv_nm/>
			<dlco_nm/>
			<presi_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Feb 28 11:01:30 KST 2009 */ %>