<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.submatrin.rec.*
	,	chosun.ciis.mt.submatrin.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATRIN_1303_LDataSet ds = (MT_SUBMATRIN_1303_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	String tmpNo = "";
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATRIN_1303_LCURLISTRecord rec = (MT_SUBMATRIN_1303_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "ewh_dt", rec.ewh_dt);
			rx.add(record, "ewh_seq", rec.seq);
			//rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "ewh_no",  rec.ewh_dt.substring(0,4) + "-" + rec.ewh_dt.substring(4,6) + "-" + rec.ewh_dt.substring(6,8)  + "-" + rec.seq);

			rx.add(record, "ern", rec.ern);
			rx.add(record, "factcdnm", rec.factcdnm);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.addCData(record, "matr_nm", rec.matr_nm);
			rx.addCData(record, "remk", rec.remk);
			rx.add(record, "use_deptcd", rec.use_deptcd);
			rx.add(record, "biusedeptnm", rec.biusedeptnm);
			rx.add(record, "ewh_qunt", rec.ewh_qunt);
			rx.add(record, "ewh_unit", rec.ewh_unit);
			rx.add(record, "ewh_uprc", rec.ewh_uprc);
			rx.add(record, "ewh_amt", rec.ewh_amt);
			rx.add(record, "ewh_vat", rec.ewh_vat);
			rx.add(record, "ewh_sum", (Long.parseLong(rec.ewh_amt) + Long.parseLong(rec.ewh_vat)));
			rx.add(record, "bihannm", rec.bihannm);
			rx.add(record, "matr_clas", rec.matr_clas);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "ewh_budg_cd", rec.ewh_budg_cd);
			rx.add(record, "ewh_budg_nm", rec.ewh_budg_nm);

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
			<ewh_dt/>
			<ewh_seq/>
			<sub_seq/>
			<ern/>
			<factcdnm/>
			<dlco_nm/>
			<matr_cd/>
			<matr_nm/>
			<remk/>
			<use_deptcd/>
			<biusedeptnm/>
			<ewh_qunt/>
			<ewh_unit/>
			<ewh_uprc/>
			<ewh_amt/>
			<ewh_vat/>
			<bihannm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 19 17:50:05 KST 2009 */ %>