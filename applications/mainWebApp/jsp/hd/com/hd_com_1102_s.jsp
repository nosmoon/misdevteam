<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.com.rec.*
	,	chosun.ciis.hd.com.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_COM_1102_SDataSet ds = (HD_COM_1102_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	int record		= 0;
	formData = rx.add(root, "tempData", "");
	record = rx.add(formData, "dept", "");
	
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_COM_1102_SCURLISTRecord rec = (HD_COM_1102_SCURLISTRecord)ds.curlist.get(i);
			
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_flnm", rec.dept_flnm);
			rx.add(record, "dept_nm", rec.dept_nm);
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
			<dept_cd/>
			<abrv_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 04 13:17:57 KST 2009 */ %>