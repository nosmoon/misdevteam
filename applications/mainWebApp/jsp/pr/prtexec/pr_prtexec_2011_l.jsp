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
	PR_PRTEXEC_2011_LDataSet ds = (PR_PRTEXEC_2011_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	recordSet = rx.add(root, "tempData", "");

	try {
		formData = rx.add(recordSet, "sect_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_2011_LCURLISTRecord rec = (PR_PRTEXEC_2011_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);

		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Mon Apr 20 20:24:12 KST 2009 */ %>