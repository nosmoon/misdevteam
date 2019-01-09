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
	FC_FUNC_6061_LDataSet ds = (FC_FUNC_6061_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_6061_LCURLISTRecord rec = (FC_FUNC_6061_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "deps_isav_nm", rec.deps_isav_nm);
			rx.add(record, "cntr_amt", rec.cntr_amt);
			rx.add(record, "int_rate", rec.int_rate);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "pymt_mm", rec.pymt_mm);
			rx.add(record, "tot_pymt_amt", rec.tot_pymt_amt);
			rx.add(record, "deps_isav_stat_cdnm", rec.deps_isav_stat_cdnm);
			rx.add(record, "insr_amt", rec.insr_amt);
			rx.add(record, "isav_amt", rec.isav_amt);
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
			<deps_isav_nm/>
			<cntr_amt/>
			<int_rate/>
			<comp_dt/>
			<mtry_dt/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<dlco_nm/>
			<pymt_mm/>
			<tot_pymt_amt/>
			<deps_isav_stat_cdnm/>
			<insr_amt/>
			<isav_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Fri Mar 20 11:59:26 KST 2009 */ %>