<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.co.rec.*
	,	chosun.ciis.fc.co.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_CO_1061_LDataSet ds = (FC_CO_1061_LDataSet)request.getAttribute("ds");
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
			FC_CO_1061_LCURLISTRecord rec = (FC_CO_1061_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cntr_clsf_cd", rec.cntr_clsf_cd);
			rx.add(record, "leas_clsf_cd", rec.leas_clsf_cd);
			rx.add(record, "leas_no", rec.leas_no);
			rx.add(record, "leas_sub_seq", rec.leas_sub_seq);
			rx.add(record, "leas_nm", rec.leas_nm);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "re_leas_yn", rec.re_leas_yn);
			rx.add(record, "cntr_clsf_cd1", rec.cntr_clsf_cd1);
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
			<cntr_clsf_cd/>
			<leas_clsf_cd/>
			<leas_no/>
			<leas_sub_seq/>
			<leas_nm/>
			<comp_dt/>
			<mtry_dt/>
			<re_leas_yn/>
			<cntr_clsf_cd1/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 04 10:40:31 KST 2009 */ %>