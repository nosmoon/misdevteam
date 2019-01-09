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
	MT_PRNPAP_2030_LDataSet ds = (MT_PRNPAP_2030_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_2030_LCURLISTRecord rec = (MT_PRNPAP_2030_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "real_matr_clsf", rec.real_matr_clsf);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "matr_clsf", rec.matr_clsf);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "amt", rec.amt);
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
			<occr_dt/>
			<seq/>
			<real_matr_clsf/>
			<sub_seq/>
			<matr_clsf/>
			<unit/>
			<qunt/>
			<uprc/>
			<amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat May 23 19:12:43 KST 2009 */ %>