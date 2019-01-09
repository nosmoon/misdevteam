<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_2101_LDataSet ds = (HD_EVLU_2101_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_2101_LCURLISTRecord rec = (HD_EVLU_2101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evlu_pers_nops", rec.evlu_pers_nops);
			rx.add(record, "s_nops_1tms", rec.s_nops_1tms);
			rx.add(record, "a_pls_nops_1tms", rec.a_pls_nops_1tms);
			rx.add(record, "a_nops_1tms", rec.a_nops_1tms);
			rx.add(record, "s_nops_2tms", rec.s_nops_2tms);
			rx.add(record, "a_pls_nops_2tms", rec.a_pls_nops_2tms);
			rx.add(record, "s_a_nops_2tms_sum", rec.s_a_nops_2tms_sum);
			rx.add(record, "db_status", rec.db_status);
			//rx.add(record, "evlu_pers_nops", StringUtil.replaceToXml(rec.evlu_pers_nops));
			//rx.add(record, "s_nops_1tms", StringUtil.replaceToXml(rec.s_nops_1tms));
			//rx.add(record, "a_pls_nops_1tms", StringUtil.replaceToXml(rec.a_pls_nops_1tms));
			//rx.add(record, "a_nops_1tms", StringUtil.replaceToXml(rec.a_nops_1tms));
			//rx.add(record, "s_nops_2tms", StringUtil.replaceToXml(rec.s_nops_2tms));
			//rx.add(record, "a_pls_nops_2tms", StringUtil.replaceToXml(rec.a_pls_nops_2tms));
			//rx.add(record, "s_a_nops_2tms_sum", StringUtil.replaceToXml(rec.s_a_nops_2tms_sum));
			//rx.add(record, "db_status", StringUtil.replaceToXml(rec.db_status));
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
<hd_evlu_2101_l>
	<dataSet>
		<CURLIST>
			<record>
				<evlu_pers_nops/>
				<s_nops_1tms/>
				<a_pls_nops_1tms/>
				<a_nops_1tms/>
				<s_nops_2tms/>
				<a_pls_nops_2tms/>
				<s_a_nops_2tms_sum/>
				<db_status/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_2101_l>
*/
%>

<% /* 작성시간 : Thu Mar 06 16:14:20 KST 2014 */ %>