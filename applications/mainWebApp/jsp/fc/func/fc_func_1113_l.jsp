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
	FC_FUNC_1113_LDataSet ds = (FC_FUNC_1113_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1113_LCURLISTRecord rec = (FC_FUNC_1113_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rcpay_dt", rec.rcpay_dt);
			rx.add(record, "rcpay_amt", rec.rcpay_amt);
			rx.add(record, "dr_budg_cd", rec.dr_budg_cd);
			rx.add(record, "deps_clsf_cd", rec.deps_clsf_cd);
			rx.add(record, "deps_dt", rec.deps_dt);
			rx.add(record, "trsfnd_slip_no", rec.trsfnd_slip_no);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "extnc_ptcr", rec.extnc_ptcr);
			rx.add(record, "trsfnd_slip_clsf", rec.trsfnd_slip_clsf);
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
			<rcpay_dt/>
			<rcpay_amt/>
			<dr_budg_cd/>
			<deps_clsf_cd/>
			<deps_dt/>
			<trsfnd_slip_no/>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<slip_no/>
			<extnc_ptcr/>
			<trsfnd_slip_clsf/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 26 14:11:39 KST 2009 */ %>