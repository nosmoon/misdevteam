<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%> 

<%
	RwXml rx = new RwXml();
	MT_COMMATR_3007_LDataSet ds = (MT_COMMATR_3007_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
     int seq_1=1;
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_COMMATR_3007_LCURLISTRecord rec = (MT_COMMATR_3007_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "ewh_amt", rec.ewh_amt);
			rx.add(record, "aewh_amt", rec.aewh_amt);
			rx.add(record, "seq", seq_1);
			rx.add(record, "ewh_qunt", rec.ewh_qunt);
			rx.add(record, "ewh_uprc", rec.ewh_uprc);

			seq_1++;
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
			<matr_cd/>
			<matr_nm/>
			<ewh_amt/>
			<aewh_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 31 15:33:18 KST 2009 */ %>