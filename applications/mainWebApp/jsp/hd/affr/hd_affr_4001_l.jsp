<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_4001_LDataSet ds = (HD_AFFR_4001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_4001_LCURLISTRecord rec = (HD_AFFR_4001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pont_clsf", rec.pont_clsf);
			rx.add(record, "pont", rec.pont);
			rx.add(record, "aply_basi_dt", rec.aply_basi_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "db_status", rec.db_status);
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<pont_clsf/>
			<pont/>
			<aply_basi_dt/>
			<seq/>
			<db_status/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Mon Jul 06 22:04:14 KST 2009 */ %>