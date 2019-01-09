<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.submatrout.rec.*
	,	chosun.ciis.mt.submatrout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATROUT_3202_LDataSet ds = (MT_SUBMATROUT_3202_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

		if (ds.curlist.size() > 0 ) {
			MT_SUBMATROUT_3202_LCURLISTRecord rec = (MT_SUBMATROUT_3202_LCURLISTRecord)ds.curlist.get(0);
			rx.add(dataSet, "dlco_no", rec.dlco_no);
			rx.add(dataSet, "dlco_nm", rec.dlco_nm);
			rx.add(dataSet, "presi_nm", rec.presi_nm);
			rx.add(dataSet, "email", rec.email);
			rx.add(dataSet, "tel_no", rec.tel_no);
		}
		//for(int i = 0; i < ds.curlist.size(); i++) {
		//	MT_SUBMATROUT_3202_LCURLISTRecord rec = (MT_SUBMATROUT_3202_LCURLISTRecord)ds.curlist.get(i);
		//	int record = rx.add(recordSet, "record", "");
		//	rx.add(record, "dlco_no", rec.dlco_no);
		//	rx.add(record, "dlco_nm", rec.dlco_nm);
		//	rx.add(record, "presi_nm", rec.presi_nm);
		//	rx.add(record, "email", rec.email);
		//	rx.add(record, "presi_tel_no", rec.presi_tel_no);
		//}
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
			<dlco_no/>
			<dlco_nm/>
			<presi_nm/>
			<email/>
			<presi_tel_no/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed May 06 13:18:14 KST 2009 */ %>