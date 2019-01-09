<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.submatrin.rec.*
	,	chosun.ciis.mt.submatrin.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATRIN_1304_LDataSet ds = (MT_SUBMATRIN_1304_LDataSet)request.getAttribute("ds");
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
			MT_SUBMATRIN_1304_LCURLISTRecord rec = (MT_SUBMATRIN_1304_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "ewh_dt", rec.slip_occr_dt);
			rx.add(record, "ewh_no",  rec.slip_occr_dt.substring(0,4) + "-" + rec.slip_occr_dt.substring(4,6) + "-" + rec.slip_occr_dt.substring(6,8)  + "-" + rec.slip_seq);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "factcdnm", rec.wifactcd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "remk",    "");
			rx.add(record, "ewh_unit", rec.unit);

			rx.add(record, "use_deptcd", "");
			rx.add(record, "biusedeptnm", "");
			rx.add(record, "ewh_qunt", rec.ewh_wgt);

			rx.add(record, "ewh_uprc", rec.ewh_uprc);
			rx.add(record, "ewh_amt", rec.ewh_amt);
			rx.add(record, "ewh_vat", rec.ewh_vat);
			rx.add(record, "ewh_sum", rec.w_amt);
			rx.add(record, "bihannm", "");


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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<slip_occr_dt/>
			<slip_seq/>
			<ern/>
			<wifactcd/>
			<dlco_nm/>
			<matr_cd/>
			<matr_nm/>
			<ewh_wgt/>
			<unit/>
			<ewh_uprc/>
			<ewh_amt/>
			<ewh_vat/>
			<w_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Thu Mar 19 17:50:05 KST 2009 */ %>