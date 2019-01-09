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
	MT_SUBMATROUT_3000_LDataSet ds = (MT_SUBMATROUT_3000_LDataSet)request.getAttribute("ds");
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
			MT_SUBMATROUT_3000_LCURLISTRecord rec = (MT_SUBMATROUT_3000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "item_nm", rec.item_nm);
			rx.add(record, "std_modl", rec.std_modl);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "ordr_qunt", rec.ordr_qunt);
			rx.add(record, "ordr_uprc", rec.ordr_uprc);
			rx.add(record, "ordr_amt", rec.ordr_amt);
			rx.add(record, "ordr_req_dd", rec.ordr_req_dd);
			rx.add(record, "remk_ar", rec.remk_ar);
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
			<sub_seq/>
			<matr_cd/>
			<item_nm/>
			<std_modl/>
			<unit/>
			<ordr_qunt/>
			<ordr_uprc/>
			<ordr_amt/>
			<ordr_req_dd/>
			<remk_ar/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 08 11:43:23 KST 2009 */ %>