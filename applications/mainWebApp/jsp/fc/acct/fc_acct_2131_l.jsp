<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2131_LDataSet ds = (FC_ACCT_2131_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2131_LCURLISTRecord rec = (FC_ACCT_2131_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "prof_type_cd", rec.prof_type_cd);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "occr_slip_occr_dt", rec.occr_slip_occr_dt);
			rx.add(record, "occr_slip_clsf_cd", rec.occr_slip_clsf_cd);
			rx.add(record, "occr_slip_seq", rec.occr_slip_seq);
			rx.add(record, "occr_slip_sub_seq", rec.occr_slip_sub_seq);
			rx.add(record, "occr_slip_arow_no", rec.occr_slip_arow_no);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "erplace_cd", rec.erplace_cd);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "deal_clsf", rec.deal_clsf);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "bizcond", rec.bizcond);
			rx.add(record, "item", rec.item);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "tax_stmt_aprv_yn", rec.tax_stmt_aprv_yn);
			rx.add(record, "upd_tms", rec.upd_tms);
			rx.add(record, "rcpt_nosh", rec.rcpt_nosh);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "ask_emp_no", rec.ask_emp_no);
			rx.add(record, "ask_emp_nm", rec.ask_emp_nm);
			rx.add(record, "ask_dept_cd", rec.ask_dept_cd);
			rx.add(record, "ask_dept_nm", rec.ask_dept_nm);
			rx.add(record, "rcpm_plan_dt", rec.rcpm_plan_dt);
			rx.add(record, "item2", rec.item2);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_nm", rec.evnt_nm);
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
			<prof_type_cd/>
			<slip_clsf_cd/>
			<slip_occr_dt/>
			<slip_seq/>
			<occr_slip_occr_dt/>
			<occr_slip_clsf_cd/>
			<occr_slip_seq/>
			<occr_slip_sub_seq/>
			<occr_slip_arow_no/>
			<make_dt/>
			<erplace_cd/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<deal_clsf/>
			<ern/>
			<dlco_nm/>
			<presi_nm/>
			<addr/>
			<bizcond/>
			<item/>
			<suply_amt/>
			<vat_amt/>
			<tax_stmt_aprv_yn/>
			<upd_tms/>
			<rcpt_nosh/>
			<budg_cd/>
			<budg_nm/>
			<ask_emp_no/>
			<ask_emp_nm/>
			<ask_dept_cd/>
			<ask_dept_nm/>
			<rcpm_plan_dt/>
			<item2/>
			<medi_cd/>
			<medi_nm/>
			<remk/>
			<slip_no/>
			<evnt_cd/>
			<evnt_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 26 17:14:31 KST 2009 */ %>