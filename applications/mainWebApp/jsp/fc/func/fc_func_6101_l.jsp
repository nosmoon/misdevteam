<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_6101_LDataSet ds = (FC_FUNC_6101_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_6101_LCURLISTRecord rec = (FC_FUNC_6101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "deps_isav_clsf_cd", rec.deps_isav_clsf_cd);
			rx.add(record, "deps_isav_no", rec.deps_isav_no);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "pymt_mm", rec.pymt_mm);
			rx.add(record, "bicount", rec.bicount);
			rx.add(record, "sumbiamt", rec.sumbiamt);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "int_rate", rec.int_rate);
			rx.add(record, "cntr_amt", rec.cntr_amt);
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
			<deps_isav_clsf_cd/>
			<deps_isav_no/>
			<dlco_clsf_cd/>
			<pymt_mm/>
			<bicount/>
			<sumbiamt/>
			<comp_dt/>
			<mtry_dt/>
			<int_rate/>
			<cntr_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 04 12:03:51 KST 2009 */ %>