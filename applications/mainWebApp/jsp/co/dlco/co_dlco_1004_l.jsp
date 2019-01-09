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
	CO_DLCO_1004_LDataSet ds = (CO_DLCO_1004_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "tempData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_DLCO_1004_LCURLISTRecord rec = (CO_DLCO_1004_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "sys_clsf", "");
			rx.add(record, "sys_clsf_1", rec.sys_clsf_1);
			rx.add(record, "sys_clsf_2", rec.sys_clsf_2);
			rx.add(record, "sys_clsf_3", rec.sys_clsf_3);
			rx.add(record, "sys_clsf_4", rec.sys_clsf_4);
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
			<sys_clsf_1/>
			<sys_clsf_2/>
			<sys_clsf_3/>
			<sys_clsf_4/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 06 16:46:20 KST 2009 */ %>