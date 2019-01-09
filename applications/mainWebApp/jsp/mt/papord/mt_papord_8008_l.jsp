<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_8008_LDataSet ds = (MT_PAPORD_8008_LDataSet)request.getAttribute("ds");
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
			MT_PAPORD_8008_LCURLISTRecord rec = (MT_PAPORD_8008_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "pap_row", rec.pap_row);
			rx.add(record, "car_cnt_c", rec.car_cnt_c);
			rx.add(record, "car_cnt_b", rec.car_cnt_b);
			rx.add(record, "car_cnt_a", rec.car_cnt_a);
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "pap_row", StringUtil.replaceToXml(rec.pap_row));
			//rx.add(record, "car_cnt_c", StringUtil.replaceToXml(rec.car_cnt_c));
			//rx.add(record, "car_cnt_b", StringUtil.replaceToXml(rec.car_cnt_b));
			//rx.add(record, "car_cnt_a", StringUtil.replaceToXml(rec.car_cnt_a));
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
<mt_papord_8008_l>
	<dataSet>
		<CURLIST>
			<record>
				<occr_dt/>
				<pap_row/>
				<car_cnt_c/>
				<car_cnt_b/>
				<car_cnt_a/>
			</record>
		</CURLIST>
	</dataSet>
</mt_papord_8008_l>
*/
%>

<% /* 작성시간 : Thu Jan 19 16:34:54 KST 2017 */ %>