<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.etccar.rec.*
	,	chosun.ciis.mt.etccar.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCCAR_5200_LDataSet ds = (MT_ETCCAR_5200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "resData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_ETCCAR_5200_LCURLISTRecord rec = (MT_ETCCAR_5200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "driv_dt", rec.driv_dt);
			rx.add(record, "car_no", rec.car_no);
			rx.add(record, "cmpy_mang_nm", rec.cmpy_mang_nm);
			rx.add(record, "oil_kind", rec.oil_kind);
			rx.add(record, "buyoil_qunt", rec.buyoil_qunt);
			rx.add(record, "outsd_oil_qunt", rec.outsd_oil_qunt);
			rx.add(record, "tot_oil_qunt", rec.tot_oil_qunt);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "unit", rec.unit);
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
			<driv_dt/>
			<oil_kind/>
			<buyoil_qunt/>
			<uprc/>
			<unit/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 22 16:34:47 KST 2009 */ %>