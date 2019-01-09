<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.aset.rec.*
	,	chosun.ciis.as.aset.ds.*;
	" 
%>

<%
	RwXml rx = new RwXml();
	AS_ASET_1006_SDataSet ds = (AS_ASET_1006_SDataSet)request.getAttribute("ds");
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
			AS_ASET_1006_SCURLISTRecord rec = (AS_ASET_1006_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "aset_no", rec.aset_no);
			rx.add(record, "car_no", rec.car_no);
			rx.add(record, "usag", rec.usag);
			rx.add(record, "car_engine_size", rec.car_engine_size);
			rx.add(record, "car_kind", rec.car_kind);
			rx.add(record, "insr_no", rec.insr_no);
			rx.add(record, "quorum_cnt", rec.quorum_cnt);
			rx.add(record, "car_mang_no", rec.car_mang_no);
			rx.add(record, "car_make_yymm", rec.car_make_yymm);
			rx.add(record, "car_usag", rec.car_usag);
			rx.add(record, "use_car_oil", rec.use_car_oil);
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
			<cmpy_cd/>
			<aset_no/>
			<car_no/>
			<usag/>
			<car_engine_size/>
			<car_kind/>
			<insr_no/>
			<quorum_cnt/>
			<car_mang_no/>
			<car_make_yymm/>
			<car_usag/>
			<use_car_oil/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 03 14:30:33 KST 2009 */ %>