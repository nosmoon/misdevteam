<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2121_LDataSet ds = (FC_ACCT_2121_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_2121_LCURLIST2Record rec = (FC_ACCT_2121_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "rcpm_slip_no2", rec.rcpm_slip_no2);
			rx.add(record, "rcpm_slip_no2", StringUtil.replaceToXml(rec.rcpm_slip_no2));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_2121_LCURLIST1Record rec = (FC_ACCT_2121_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "rcpm_slip_no", StringUtil.replaceToXml(rec.rcpm_slip_no));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_2121_LCURLISTRecord rec = (FC_ACCT_2121_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "prof_type_cd", rec.prof_type_cd);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "occr_slip_occr_dt", rec.occr_slip_occr_dt);
			//rx.add(record, "occr_slip_clsf_cd", rec.occr_slip_clsf_cd);
			//rx.add(record, "occr_slip_seq", rec.occr_slip_seq);
			//rx.add(record, "occr_slip_sub_seq", rec.occr_slip_sub_seq);
			//rx.add(record, "occr_slip_arow_no", rec.occr_slip_arow_no);
			//rx.add(record, "make_dt", rec.make_dt);
			//rx.add(record, "erplace_cd", rec.erplace_cd);
			//rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "deal_clsf", rec.deal_clsf);
			//rx.add(record, "ern", rec.ern);
			//rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "boks_dlco_nm", rec.boks_dlco_nm);
			//rx.add(record, "presi_nm", rec.presi_nm);
			//rx.add(record, "addr", rec.addr);
			//rx.add(record, "bizcond", rec.bizcond);
			//rx.add(record, "presi_item", rec.presi_item);
			//rx.add(record, "suply_amt", rec.suply_amt);
			//rx.add(record, "vat_amt", rec.vat_amt);
			//rx.add(record, "tax_stmt_aprv_yn", rec.tax_stmt_aprv_yn);
			//rx.add(record, "upd_tms", rec.upd_tms);
			//rx.add(record, "rcpt_nosh", rec.rcpt_nosh);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "budg_cd_nm", rec.budg_cd_nm);
			//rx.add(record, "ask_emp_no", rec.ask_emp_no);
			//rx.add(record, "ask_emp_nm", rec.ask_emp_nm);
			//rx.add(record, "ask_dept_cd", rec.ask_dept_cd);
			//rx.add(record, "ask_dept_nm", rec.ask_dept_nm);
			//rx.add(record, "rcpm_plan_dt", rec.rcpm_plan_dt);
			//rx.add(record, "item", rec.item);
			//rx.add(record, "medi_cd", rec.medi_cd);
			//rx.add(record, "remk", rec.remk);
			//rx.add(record, "evnt_cd", rec.evnt_cd);
			//rx.add(record, "evnt_cd_nm", rec.evnt_cd_nm);
			//rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			//rx.add(record, "dtls_medi_cd_nm", rec.dtls_medi_cd_nm);
			//rx.add(record, "draft_doc_no", rec.draft_doc_no);
			//rx.add(record, "draft_impt_amt", rec.draft_impt_amt);
			//rx.add(record, "draft_expn_amt", rec.draft_expn_amt);
			//rx.add(record, "rcpm_amt", rec.rcpm_amt);
			//rx.add(record, "vexc_cmpy_cd", rec.vexc_cmpy_cd);
			//rx.add(record, "vexc_cmpy_cd_ern", rec.vexc_cmpy_cd_ern);
			//rx.add(record, "vexc_cmpy_cd_nm", rec.vexc_cmpy_cd_nm);
			//rx.add(record, "reg_clsf", rec.reg_clsf);
			//rx.add(record, "unit", rec.unit);
			//rx.add(record, "qunt", rec.qunt);
			//rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			rx.add(record, "prof_type_cd", StringUtil.replaceToXml(rec.prof_type_cd));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			rx.add(record, "occr_slip_occr_dt", StringUtil.replaceToXml(rec.occr_slip_occr_dt));
			rx.add(record, "occr_slip_clsf_cd", StringUtil.replaceToXml(rec.occr_slip_clsf_cd));
			rx.add(record, "occr_slip_seq", StringUtil.replaceToXml(rec.occr_slip_seq));
			rx.add(record, "occr_slip_sub_seq", StringUtil.replaceToXml(rec.occr_slip_sub_seq));
			rx.add(record, "occr_slip_arow_no", StringUtil.replaceToXml(rec.occr_slip_arow_no));
			rx.add(record, "make_dt", StringUtil.replaceToXml(rec.make_dt));
			rx.add(record, "erplace_cd", StringUtil.replaceToXml(rec.erplace_cd));
			rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.add(record, "deal_clsf", StringUtil.replaceToXml(rec.deal_clsf));
			rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "boks_dlco_nm", StringUtil.replaceToXml(rec.boks_dlco_nm));
			rx.add(record, "presi_nm", StringUtil.replaceToXml(rec.presi_nm));
			rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
			rx.add(record, "bizcond", StringUtil.replaceToXml(rec.bizcond));
			rx.add(record, "presi_item", StringUtil.replaceToXml(rec.presi_item));
			rx.add(record, "suply_amt", StringUtil.replaceToXml(rec.suply_amt));
			rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			rx.add(record, "tax_stmt_aprv_yn", StringUtil.replaceToXml(rec.tax_stmt_aprv_yn));
			rx.add(record, "upd_tms", StringUtil.replaceToXml(rec.upd_tms));
			rx.add(record, "rcpt_nosh", StringUtil.replaceToXml(rec.rcpt_nosh));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "budg_cd_nm", StringUtil.replaceToXml(rec.budg_cd_nm));
			rx.add(record, "ask_emp_no", StringUtil.replaceToXml(rec.ask_emp_no));
			rx.add(record, "ask_emp_nm", StringUtil.replaceToXml(rec.ask_emp_nm));
			rx.add(record, "ask_dept_cd", StringUtil.replaceToXml(rec.ask_dept_cd));
			rx.add(record, "ask_dept_nm", StringUtil.replaceToXml(rec.ask_dept_nm));
			rx.add(record, "rcpm_plan_dt", StringUtil.replaceToXml(rec.rcpm_plan_dt));
			rx.add(record, "item", StringUtil.replaceToXml(rec.item));
			rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			rx.add(record, "evnt_cd_nm", StringUtil.replaceToXml(rec.evnt_cd_nm));
			rx.add(record, "dtls_medi_cd", StringUtil.replaceToXml(rec.dtls_medi_cd));
			rx.add(record, "dtls_medi_cd_nm", StringUtil.replaceToXml(rec.dtls_medi_cd_nm));
			rx.add(record, "draft_doc_no", StringUtil.replaceToXml(rec.draft_doc_no));
			rx.add(record, "draft_impt_amt", StringUtil.replaceToXml(rec.draft_impt_amt));
			rx.add(record, "draft_expn_amt", StringUtil.replaceToXml(rec.draft_expn_amt));
			rx.add(record, "rcpm_amt", StringUtil.replaceToXml(rec.rcpm_amt));
			rx.add(record, "vexc_cmpy_cd", StringUtil.replaceToXml(rec.vexc_cmpy_cd));
			rx.add(record, "vexc_cmpy_cd_ern", StringUtil.replaceToXml(rec.vexc_cmpy_cd_ern));
			rx.add(record, "vexc_cmpy_cd_nm", StringUtil.replaceToXml(rec.vexc_cmpy_cd_nm));
			rx.add(record, "reg_clsf", StringUtil.replaceToXml(rec.reg_clsf));
			rx.add(record, "unit", StringUtil.replaceToXml(rec.unit));
			rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
			rx.add(record, "mang_clsf_cd", StringUtil.replaceToXml(rec.mang_clsf_cd));
			rx.add(record, "email", StringUtil.replaceToXml(rec.email));
			rx.add(record, "semuro_no", rec.semuro_no);
			rx.add(record, "elec_tax_comp_cd", rec.elec_tax_comp_cd);			
			rx.add(record, "chnl_clsf_cd", rec.chnl_clsf_cd);			
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
<fc_acct_2121_l>
	<dataSet>
		<CURLIST2>
			<record>
				<rcpm_slip_no2/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_2121_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2121_l>
	<dataSet>
		<CURLIST1>
			<record>
				<rcpm_slip_no/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_2121_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2121_l>
	<dataSet>
		<CURLIST>
			<record>
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
				<boks_dlco_nm/>
				<presi_nm/>
				<addr/>
				<bizcond/>
				<presi_item/>
				<suply_amt/>
				<vat_amt/>
				<tax_stmt_aprv_yn/>
				<upd_tms/>
				<rcpt_nosh/>
				<budg_cd/>
				<budg_cd_nm/>
				<ask_emp_no/>
				<ask_emp_nm/>
				<ask_dept_cd/>
				<ask_dept_nm/>
				<rcpm_plan_dt/>
				<item/>
				<medi_cd/>
				<remk/>
				<evnt_cd/>
				<evnt_cd_nm/>
				<dtls_medi_cd/>
				<dtls_medi_cd_nm/>
				<draft_doc_no/>
				<draft_impt_amt/>
				<draft_expn_amt/>
				<rcpm_amt/>
				<vexc_cmpy_cd/>
				<vexc_cmpy_cd_ern/>
				<vexc_cmpy_cd_nm/>
				<reg_clsf/>
				<unit/>
				<qunt/>
				<mang_clsf_cd/>
				<email/>
				<semuro_no/>
				<elec_tax_comp_cd/>				
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2121_l>
*/
%>

<% /* 작성시간 : Sat Aug 29 17:28:38 KST 2009 */ %>