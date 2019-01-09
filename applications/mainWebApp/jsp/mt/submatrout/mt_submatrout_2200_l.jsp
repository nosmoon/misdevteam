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
	MT_SUBMATROUT_2200_LDataSet ds = (MT_SUBMATROUT_2200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATROUT_2200_LCURLISTRecord rec = (MT_SUBMATROUT_2200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "gb", rec.gb);
			rx.add(record, "bjcidat", rec.bjcidat);
			rx.add(record, "jcjjcdnm", rec.jcjjcdnm);
			rx.add(record, "factcdnm", rec.factcdnm);
			rx.add(record, "mov_qunt", rec.mov_qunt);
			rx.add(record, "mov_unit", rec.mov_unit);
			rx.add(record, "mov_uprc", rec.mov_uprc);
			rx.add(record, "mov_amt", rec.mov_amt);
			rx.add(record, "remk", rec.remk);
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
			<gb/>
			<bjcidat/>
			<jcjjcdnm/>
			<factcdnm/>
			<mov_qunt/>
			<mov_unit/>
			<mov_uprc/>
			<mov_amt/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Mar 28 16:50:30 KST 2009 */ %>