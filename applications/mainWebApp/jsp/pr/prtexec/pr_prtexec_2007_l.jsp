<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.prtexec.rec.*
	,	chosun.ciis.pr.prtexec.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTEXEC_2007_LDataSet ds = (PR_PRTEXEC_2007_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	recordSet = rx.add(root, "tempData", "");
	
	try {
		formData = rx.add(recordSet, "occr_seq_fr", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_2007_LCURLISTRecord rec = (PR_PRTEXEC_2007_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "item", "");
			rx.add(record, "label", rec.seq +  " 주차");
			rx.add(record, "value", rec.seq);
		}
		formData = rx.add(recordSet, "occr_seq_to", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_2007_LCURLISTRecord rec = (PR_PRTEXEC_2007_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "item", "");
			rx.add(record, "label", rec.seq +  " 주차");
			rx.add(record, "value", rec.seq);
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
			<occr_yy/>
			<seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Apr 18 14:25:28 KST 2009 */ %>