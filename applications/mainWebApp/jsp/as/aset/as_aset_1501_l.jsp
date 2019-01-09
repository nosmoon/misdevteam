<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.aset.rec.*
	,	chosun.ciis.as.aset.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASET_1501_LDataSet ds = (AS_ASET_1501_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			AS_ASET_1501_LCURLIST4Record rec = (AS_ASET_1501_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "deps_rmtt_dt", rec.deps_rmtt_dt);
			rx.add(record, "deps_rcpm_amt", rec.deps_rcpm_amt);
			rx.add(record, "deps_rmtt_plac", rec.deps_rmtt_plac);
			rx.add(record, "deps_acct_mang_no", rec.deps_acct_mang_no);
			rx.add(record, "deps_acct_mang_nm", rec.deps_acct_mang_nm);
			rx.add(record, "deps_coms_amt", rec.deps_coms_amt);
			rx.add(record, "deps_sub_seq", rec.deps_sub_seq);
			rx.add(record, "deps_biz_reg_no", rec.deps_biz_reg_no);
			rx.add(record, "deps_bank_id", rec.deps_bank_id);
			rx.add(record, "deps_acct_num", rec.deps_acct_num);
			rx.add(record, "deps_tran_date", rec.deps_tran_date);
			rx.add(record, "deps_tran_date_seq", rec.deps_tran_date_seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			AS_ASET_1501_LCURLIST3Record rec = (AS_ASET_1501_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cash_sub_seq", rec.cash_sub_seq);
			rx.add(record, "cash_rcpm_amt", rec.cash_rcpm_amt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			AS_ASET_1501_LCURLIST2Record rec = (AS_ASET_1501_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aset_no", rec.aset_no);
			rx.add(record, "aset_nm", rec.aset_nm);
			rx.add(record, "sale_now_acqr_amt", rec.sale_now_acqr_amt);
			rx.add(record, "sale_redm_tot_amt", rec.sale_redm_tot_amt);
			rx.add(record, "sale_un_redm_amt", rec.sale_un_redm_amt);
			rx.add(record, "chg_amt", rec.chg_amt);
			rx.add(record, "chg_vat_amt", rec.chg_vat_amt);
			rx.add(record, "sale_pfls_amt", rec.sale_pfls_amt);
			rx.add(record, "chg_clsf_nm", rec.chg_clsf_nm);
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "occr_seq", rec.occr_seq);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "dtls_remk", rec.dtls_remk);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			AS_ASET_1501_LCURLIST1Record rec = (AS_ASET_1501_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "draft_doc_no2", rec.draft_doc_no2);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "tax_stmt_no", rec.tax_stmt_no);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_ern", rec.dlco_ern);
			rx.add(record, "dlco_nm", rec.dlco_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST6", "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			AS_ASET_1501_LCURLIST6Record rec = (AS_ASET_1501_LCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "etc_budg_cd", rec.etc_budg_cd);
			rx.add(record, "etc_budg_nm", rec.etc_budg_nm);
			rx.add(record, "etc_rcpm_amt", rec.etc_rcpm_amt);
			rx.add(record, "etc_bal_occr_slip_clsf", rec.etc_bal_occr_slip_clsf);
			rx.add(record, "etc_bal_occr_slip_no", rec.etc_bal_occr_slip_no);
			rx.add(record, "etc_sub_seq", rec.etc_sub_seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			AS_ASET_1501_LCURLIST5Record rec = (AS_ASET_1501_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "note_note_no", rec.note_note_no);
			rx.add(record, "note_rcpm_amt", rec.note_rcpm_amt);
			rx.add(record, "note_note_clsf_cd", rec.note_note_clsf_cd);
			rx.add(record, "note_bank_cd", rec.note_bank_cd);
			rx.add(record, "note_bank_nm", rec.note_bank_nm);
			rx.add(record, "note_issu_pers_nm", rec.note_issu_pers_nm);
			rx.add(record, "note_issu_cmpy_clsf", rec.note_issu_cmpy_clsf);
			rx.add(record, "note_comp_dt", rec.note_comp_dt);
			rx.add(record, "note_mtry_dt", rec.note_mtry_dt);
			rx.add(record, "note_rcpm_acct", rec.note_rcpm_acct);
			rx.add(record, "note_sale_aprv_no", rec.note_sale_aprv_no);
			rx.add(record, "note_sub_seq", rec.note_sub_seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */

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
	<CURLIST4>
		<record>
			<deps_rmtt_dt/>
			<deps_rcpm_amt/>
			<deps_rmtt_plac/>
			<deps_acct_mang_no/>
			<deps_acct_mang_nm/>
			<deps_coms_amt/>
			<deps_sub_seq/>
			<deps_biz_reg_no/>
			<deps_bank_id/>
			<deps_acct_num/>
			<deps_tran_date/>
			<deps_tran_date_seq/>
		</record>
	</CURLIST4>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST3>
		<record>
			<cash_sub_seq/>
			<cash_rcpm_amt/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<aset_no/>
			<aset_nm/>
			<sale_now_acqr_amt/>
			<sale_redm_tot_amt/>
			<sale_un_redm_amt/>
			<chg_amt/>
			<chg_vat_amt/>
			<sale_pfls_amt/>
			<chg_clsf_nm/>
			<chg_dt/>
			<occr_dt/>
			<occr_seq/>
			<dept_cd/>
			<budg_cd/>
			<sub_seq/>
			<dtls_remk/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<chg_dt/>
			<remk/>
			<draft_doc_no2/>
			<slip_no/>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<tax_stmt_no/>
			<dlco_clsf_cd/>
			<dlco_ern/>
			<dlco_nm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST6>
		<record>
			<etc_budg_cd/>
			<etc_budg_nm/>
			<etc_rcpm_amt/>
			<etc_bal_occr_slip_clsf/>
			<etc_bal_occr_slip_no/>
			<etc_sub_seq/>
		</record>
	</CURLIST6>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST5>
		<record>
			<note_note_no/>
			<note_rcpm_amt/>
			<note_note_clsf_cd/>
			<note_bank_cd/>
			<note_bank_nm/>
			<note_issu_pers_nm/>
			<note_issu_cmpy_clsf/>
			<note_comp_dt/>
			<note_mtry_dt/>
			<note_rcpm_acct/>
			<note_sale_aprv_no/>
			<note_sub_seq/>
		</record>
	</CURLIST5>
</dataSet>
*/
%>

<% /* 작성시간 : Wed May 27 11:18:13 KST 2009 */ %>