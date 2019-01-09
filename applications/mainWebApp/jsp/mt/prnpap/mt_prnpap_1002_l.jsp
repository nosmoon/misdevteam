<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PRNPAP_1002_LDataSet ds = (MT_PRNPAP_1002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "paperqulttestocom", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_1002_LCURLISTRecord rec = (MT_PRNPAP_1002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "test_item_clsf", rec.cd);
			rx.add(record, "test_item_nm", rec.cdnm);
			rx.add(record, "ocom_val","");
			rx.add(record, "unit", rec.mang_cd_1);
			rx.add(record, "mang_cd_2", rec.mang_cd_2);
			rx.add(record, "mang_cd_3", rec.mang_cd_3);
			rx.add(record, "mang_cd_4", rec.mang_cd_4);
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
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<cd/>
			<cdnm/>
			<mang_cd_1/>
			<mang_cd_2/>
			<mang_cd_3/>
			<mang_cd_4/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 30 18:35:51 KST 2009 */ %>