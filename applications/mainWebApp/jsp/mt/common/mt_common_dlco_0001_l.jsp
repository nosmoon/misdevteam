<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.common.rec.*
	,	chosun.ciis.mt.common.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMON_DLCO_0001_LDataSet ds = (MT_COMMON_DLCO_0001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		if( ds.curlist.size() > 0 )
		{
			MT_COMMON_DLCO_0001_LCURLISTRecord rec = (MT_COMMON_DLCO_0001_LCURLISTRecord)ds.curlist.get(0);
			//	int record = rx.add(recordSet, "record", "");
		 	rx.add(dataSet, "ern", rec.ern);
		 	rx.add(dataSet, "dlco_no", rec.dlco_no);
			rx.add(dataSet, "dlco_nm", rec.dlco_nm);
		}
			//recordSet = rx.add(dataSet, "CURLIST", "");

		//for(int i = 0; i < ds.curlist.size(); i++) {
		//	MT_COMMON_DLCO_0001_LCURLISTRecord rec = (MT_COMMON_DLCO_0001_LCURLISTRecord)ds.curlist.get(i);
		//	int record = rx.add(recordSet, "record", "");
		//	rx.add(record, "ern", rec.ern);
		//	rx.add(record, "dlco_no", rec.dlco_no);
		//	rx.add(record, "dlco_nm", rec.dlco_nm);
		//}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
			<ern/>
			<dlco_no/>
			<dlco_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 02 10:51:55 KST 2009 */ %>