<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_1003_LDataSet ds = (FC_FUNC_1003_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_FUNC_1003_LCURLISTRecord rec = (FC_FUNC_1003_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pubc_frdt", rec.pubc_frdt);
			rx.add(record, "pubc_todt", rec.pubc_todt);
			rx.add(record, "slcrg_pers", rec.slcrg_pers);
			rx.add(record, "slcrg_pers_nm", rec.slcrg_pers_nm);
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
			<pubc_frdt/>
			<pubc_todt/>
			<slcrg_pers/>
			<slcrg_pers_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Wed Mar 11 17:32:42 KST 2009 */ %>