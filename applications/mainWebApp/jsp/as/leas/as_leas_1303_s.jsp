<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.leas.rec.*
	,	chosun.ciis.as.leas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_LEAS_1303_SDataSet ds = (AS_LEAS_1303_SDataSet)request.getAttribute("ds");
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
			AS_LEAS_1303_SCURLIST4Record rec = (AS_LEAS_1303_SCURLIST4Record)ds.curlist4.get(i);
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
			//rx.add(record, "note_note_no", StringUtil.replaceToXml(rec.note_note_no));
			//rx.add(record, "note_rcpm_amt", StringUtil.replaceToXml(rec.note_rcpm_amt));
			//rx.add(record, "note_note_clsf_cd", StringUtil.replaceToXml(rec.note_note_clsf_cd));
			//rx.add(record, "note_bank_cd", StringUtil.replaceToXml(rec.note_bank_cd));
			//rx.add(record, "note_bank_nm", StringUtil.replaceToXml(rec.note_bank_nm));
			//rx.add(record, "note_issu_pers_nm", StringUtil.replaceToXml(rec.note_issu_pers_nm));
			//rx.add(record, "note_issu_cmpy_clsf", StringUtil.replaceToXml(rec.note_issu_cmpy_clsf));
			//rx.add(record, "note_comp_dt", StringUtil.replaceToXml(rec.note_comp_dt));
			//rx.add(record, "note_mtry_dt", StringUtil.replaceToXml(rec.note_mtry_dt));
			//rx.add(record, "note_rcpm_acct", StringUtil.replaceToXml(rec.note_rcpm_acct));
			//rx.add(record, "note_sale_aprv_no", StringUtil.replaceToXml(rec.note_sale_aprv_no));
			//rx.add(record, "note_sub_seq", StringUtil.replaceToXml(rec.note_sub_seq));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			AS_LEAS_1303_SCURLIST3Record rec = (AS_LEAS_1303_SCURLIST3Record)ds.curlist3.get(i);
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
			rx.add(record, "deps_current_clsf_ref", rec.deps_current_clsf_ref);
			rx.add(record, "deps_acct_tonghwa_ref", rec.deps_acct_tonghwa_ref);
			rx.add(record, "deps_frex_amt", rec.deps_frex_amt);
			//rx.add(record, "deps_rmtt_dt", StringUtil.replaceToXml(rec.deps_rmtt_dt));
			//rx.add(record, "deps_rcpm_amt", StringUtil.replaceToXml(rec.deps_rcpm_amt));
			//rx.add(record, "deps_rmtt_plac", StringUtil.replaceToXml(rec.deps_rmtt_plac));
			//rx.add(record, "deps_acct_mang_no", StringUtil.replaceToXml(rec.deps_acct_mang_no));
			//rx.add(record, "deps_acct_mang_nm", StringUtil.replaceToXml(rec.deps_acct_mang_nm));
			//rx.add(record, "deps_coms_amt", StringUtil.replaceToXml(rec.deps_coms_amt));
			//rx.add(record, "deps_sub_seq", StringUtil.replaceToXml(rec.deps_sub_seq));
			//rx.add(record, "deps_biz_reg_no", StringUtil.replaceToXml(rec.deps_biz_reg_no));
			//rx.add(record, "deps_bank_id", StringUtil.replaceToXml(rec.deps_bank_id));
			//rx.add(record, "deps_acct_num", StringUtil.replaceToXml(rec.deps_acct_num));
			//rx.add(record, "deps_tran_date", StringUtil.replaceToXml(rec.deps_tran_date));
			//rx.add(record, "deps_tran_date_seq", StringUtil.replaceToXml(rec.deps_tran_date_seq));
			//rx.add(record, "deps_current_clsf_ref", StringUtil.replaceToXml(rec.deps_current_clsf_ref));
			//rx.add(record, "deps_acct_tonghwa_ref", StringUtil.replaceToXml(rec.deps_acct_tonghwa_ref));
			//rx.add(record, "deps_frex_amt", StringUtil.replaceToXml(rec.deps_frex_amt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			AS_LEAS_1303_SCURLIST2Record rec = (AS_LEAS_1303_SCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cash_sub_seq", rec.cash_sub_seq);
			rx.add(record, "cash_rcpm_amt", rec.cash_rcpm_amt);
			//rx.add(record, "cash_sub_seq", StringUtil.replaceToXml(rec.cash_sub_seq));
			//rx.add(record, "cash_rcpm_amt", StringUtil.replaceToXml(rec.cash_rcpm_amt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			AS_LEAS_1303_SCURLIST1Record rec = (AS_LEAS_1303_SCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "flag", rec.flag);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "occr_seq", rec.occr_seq);
			rx.add(record, "rcpm_dt", rec.rcpm_dt);
			rx.add(record, "rcpm_shet_no", rec.rcpm_shet_no);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_ern", rec.dlco_ern);
			rx.add(record, "hire_dlco_nm", rec.hire_dlco_nm);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "inout_clsf", rec.inout_clsf);
			rx.add(record, "inout_acct_clsf", rec.inout_acct_clsf);
			rx.add(record, "gurt_payo_clsf", rec.gurt_payo_clsf);
			rx.add(record, "bldg_cd", rec.bldg_cd);
			rx.add(record, "bldg_nm", rec.bldg_nm);
			rx.add(record, "cntr_yy", rec.cntr_yy);
			rx.add(record, "cntr_seq", rec.cntr_seq);
			rx.add(record, "cntr_no", rec.cntr_no);
			rx.add(record, "clam_yymm", rec.clam_yymm);
			rx.add(record, "clam_seq", rec.clam_seq);
			rx.add(record, "leas_clam_amt", rec.leas_clam_amt);
			rx.add(record, "mang_clam_amt", rec.mang_clam_amt);
			rx.add(record, "vat_clam_amt", rec.vat_clam_amt);
			rx.add(record, "clam_tot_amt", rec.clam_tot_amt);
			rx.add(record, "leas_rcpm_amt", rec.leas_rcpm_amt);
			rx.add(record, "mang_rcpm_amt", rec.mang_rcpm_amt);
			rx.add(record, "vat_rcpm_amt", rec.vat_rcpm_amt);
			rx.add(record, "rcpm_tot_amt", rec.rcpm_tot_amt);
			rx.add(record, "gurt_amt", rec.gurt_amt);
			rx.add(record, "precpt_amt", rec.precpt_amt);
			rx.add(record, "gurt_rcpm_amt", rec.gurt_rcpm_amt);
			rx.add(record, "precpt_rcpm_amt", rec.precpt_rcpm_amt);
			rx.add(record, "trufnd_rcpm_amt", rec.trufnd_rcpm_amt);
			rx.add(record, "trufnd_dlco_ern", rec.trufnd_dlco_ern);
			rx.add(record, "trufnd_dlco_nm", rec.trufnd_dlco_nm);
			rx.add(record, "trufnd_slip_clsf_cd", rec.trufnd_slip_clsf_cd);
			rx.add(record, "slip_no", rec.slip_no);
			//rx.add(record, "flag", StringUtil.replaceToXml(rec.flag));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "occr_seq", StringUtil.replaceToXml(rec.occr_seq));
			//rx.add(record, "rcpm_dt", StringUtil.replaceToXml(rec.rcpm_dt));
			//rx.add(record, "rcpm_shet_no", StringUtil.replaceToXml(rec.rcpm_shet_no));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_ern", StringUtil.replaceToXml(rec.dlco_ern));
			//rx.add(record, "hire_dlco_nm", StringUtil.replaceToXml(rec.hire_dlco_nm));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "inout_clsf", StringUtil.replaceToXml(rec.inout_clsf));
			//rx.add(record, "inout_acct_clsf", StringUtil.replaceToXml(rec.inout_acct_clsf));
			//rx.add(record, "gurt_payo_clsf", StringUtil.replaceToXml(rec.gurt_payo_clsf));
			//rx.add(record, "bldg_cd", StringUtil.replaceToXml(rec.bldg_cd));
			//rx.add(record, "bldg_nm", StringUtil.replaceToXml(rec.bldg_nm));
			//rx.add(record, "cntr_yy", StringUtil.replaceToXml(rec.cntr_yy));
			//rx.add(record, "cntr_seq", StringUtil.replaceToXml(rec.cntr_seq));
			//rx.add(record, "cntr_no", StringUtil.replaceToXml(rec.cntr_no));
			//rx.add(record, "clam_yymm", StringUtil.replaceToXml(rec.clam_yymm));
			//rx.add(record, "clam_seq", StringUtil.replaceToXml(rec.clam_seq));
			//rx.add(record, "leas_clam_amt", StringUtil.replaceToXml(rec.leas_clam_amt));
			//rx.add(record, "mang_clam_amt", StringUtil.replaceToXml(rec.mang_clam_amt));
			//rx.add(record, "vat_clam_amt", StringUtil.replaceToXml(rec.vat_clam_amt));
			//rx.add(record, "clam_tot_amt", StringUtil.replaceToXml(rec.clam_tot_amt));
			//rx.add(record, "leas_rcpm_amt", StringUtil.replaceToXml(rec.leas_rcpm_amt));
			//rx.add(record, "mang_rcpm_amt", StringUtil.replaceToXml(rec.mang_rcpm_amt));
			//rx.add(record, "vat_rcpm_amt", StringUtil.replaceToXml(rec.vat_rcpm_amt));
			//rx.add(record, "rcpm_tot_amt", StringUtil.replaceToXml(rec.rcpm_tot_amt));
			//rx.add(record, "gurt_amt", StringUtil.replaceToXml(rec.gurt_amt));
			//rx.add(record, "precpt_amt", StringUtil.replaceToXml(rec.precpt_amt));
			//rx.add(record, "gurt_rcpm_amt", StringUtil.replaceToXml(rec.gurt_rcpm_amt));
			//rx.add(record, "precpt_rcpm_amt", StringUtil.replaceToXml(rec.precpt_rcpm_amt));
			//rx.add(record, "trufnd_rcpm_amt", StringUtil.replaceToXml(rec.trufnd_rcpm_amt));
			//rx.add(record, "trufnd_dlco_ern", StringUtil.replaceToXml(rec.trufnd_dlco_ern));
			//rx.add(record, "trufnd_dlco_nm", StringUtil.replaceToXml(rec.trufnd_dlco_nm));
			//rx.add(record, "trufnd_slip_clsf_cd", StringUtil.replaceToXml(rec.trufnd_slip_clsf_cd));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST6", "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			AS_LEAS_1303_SCURLIST6Record rec = (AS_LEAS_1303_SCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cntr_no", rec.cntr_no);
			rx.add(record, "clam_yymm", rec.clam_yymm);
			rx.add(record, "clam_seq", rec.clam_seq);
			rx.add(record, "leas_clam_amt", rec.leas_clam_amt);
			rx.add(record, "mang_clam_amt", rec.mang_clam_amt);
			rx.add(record, "vat_clam_amt", rec.vat_clam_amt);
			rx.add(record, "clam_tot_amt", rec.clam_tot_amt);
			rx.add(record, "leas_rcpm_amt", rec.leas_rcpm_amt);
			rx.add(record, "mang_rcpm_amt", rec.mang_rcpm_amt);
			rx.add(record, "vat_rcpm_amt", rec.vat_rcpm_amt);
			rx.add(record, "rcpm_tot_amt", rec.rcpm_tot_amt);
			//rx.add(record, "cntr_no", StringUtil.replaceToXml(rec.cntr_no));
			//rx.add(record, "clam_yymm", StringUtil.replaceToXml(rec.clam_yymm));
			//rx.add(record, "clam_seq", StringUtil.replaceToXml(rec.clam_seq));
			//rx.add(record, "leas_clam_amt", StringUtil.replaceToXml(rec.leas_clam_amt));
			//rx.add(record, "mang_clam_amt", StringUtil.replaceToXml(rec.mang_clam_amt));
			//rx.add(record, "vat_clam_amt", StringUtil.replaceToXml(rec.vat_clam_amt));
			//rx.add(record, "clam_tot_amt", StringUtil.replaceToXml(rec.clam_tot_amt));
			//rx.add(record, "leas_rcpm_amt", StringUtil.replaceToXml(rec.leas_rcpm_amt));
			//rx.add(record, "mang_rcpm_amt", StringUtil.replaceToXml(rec.mang_rcpm_amt));
			//rx.add(record, "vat_rcpm_amt", StringUtil.replaceToXml(rec.vat_rcpm_amt));
			//rx.add(record, "rcpm_tot_amt", StringUtil.replaceToXml(rec.rcpm_tot_amt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			AS_LEAS_1303_SCURLIST5Record rec = (AS_LEAS_1303_SCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "etc_budg_cd", rec.etc_budg_cd);
			rx.add(record, "etc_budg_nm", rec.etc_budg_nm);
			rx.add(record, "etc_rcpm_amt", rec.etc_rcpm_amt);
			rx.add(record, "etc_bal_occr_slip_clsf", rec.etc_bal_occr_slip_clsf);
			rx.add(record, "etc_bal_occr_slip_no", rec.etc_bal_occr_slip_no);
			rx.add(record, "etc_sub_seq", rec.etc_sub_seq);
			//rx.add(record, "etc_budg_cd", StringUtil.replaceToXml(rec.etc_budg_cd));
			//rx.add(record, "etc_budg_nm", StringUtil.replaceToXml(rec.etc_budg_nm));
			//rx.add(record, "etc_rcpm_amt", StringUtil.replaceToXml(rec.etc_rcpm_amt));
			//rx.add(record, "etc_bal_occr_slip_clsf", StringUtil.replaceToXml(rec.etc_bal_occr_slip_clsf));
			//rx.add(record, "etc_bal_occr_slip_no", StringUtil.replaceToXml(rec.etc_bal_occr_slip_no));
			//rx.add(record, "etc_sub_seq", StringUtil.replaceToXml(rec.etc_sub_seq));
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
<as_leas_1303_s>
	<dataSet>
		<CURLIST4>
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
		</CURLIST4>
	</dataSet>
</as_leas_1303_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<as_leas_1303_s>
	<dataSet>
		<CURLIST3>
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
				<deps_current_clsf_ref/>
				<deps_acct_tonghwa_ref/>
				<deps_frex_amt/>
			</record>
		</CURLIST3>
	</dataSet>
</as_leas_1303_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<as_leas_1303_s>
	<dataSet>
		<CURLIST2>
			<record>
				<cash_sub_seq/>
				<cash_rcpm_amt/>
			</record>
		</CURLIST2>
	</dataSet>
</as_leas_1303_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<as_leas_1303_s>
	<dataSet>
		<CURLIST1>
			<record>
				<flag/>
				<occr_dt/>
				<occr_seq/>
				<rcpm_dt/>
				<rcpm_shet_no/>
				<dlco_clsf_cd/>
				<dlco_ern/>
				<hire_dlco_nm/>
				<remk/>
				<inout_clsf/>
				<inout_acct_clsf/>
				<gurt_payo_clsf/>
				<bldg_cd/>
				<bldg_nm/>
				<cntr_yy/>
				<cntr_seq/>
				<cntr_no/>
				<clam_yymm/>
				<clam_seq/>
				<leas_clam_amt/>
				<mang_clam_amt/>
				<vat_clam_amt/>
				<clam_tot_amt/>
				<leas_rcpm_amt/>
				<mang_rcpm_amt/>
				<vat_rcpm_amt/>
				<rcpm_tot_amt/>
				<gurt_amt/>
				<precpt_amt/>
				<gurt_rcpm_amt/>
				<precpt_rcpm_amt/>
				<trufnd_rcpm_amt/>
				<trufnd_dlco_ern/>
				<trufnd_dlco_nm/>
				<trufnd_slip_clsf_cd/>
				<slip_no/>
			</record>
		</CURLIST1>
	</dataSet>
</as_leas_1303_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<as_leas_1303_s>
	<dataSet>
		<CURLIST6>
			<record>
				<cntr_no/>
				<clam_yymm/>
				<clam_seq/>
				<leas_clam_amt/>
				<mang_clam_amt/>
				<vat_clam_amt/>
				<clam_tot_amt/>
				<leas_rcpm_amt/>
				<mang_rcpm_amt/>
				<vat_rcpm_amt/>
				<rcpm_tot_amt/>
			</record>
		</CURLIST6>
	</dataSet>
</as_leas_1303_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<as_leas_1303_s>
	<dataSet>
		<CURLIST5>
			<record>
				<etc_budg_cd/>
				<etc_budg_nm/>
				<etc_rcpm_amt/>
				<etc_bal_occr_slip_clsf/>
				<etc_bal_occr_slip_no/>
				<etc_sub_seq/>
			</record>
		</CURLIST5>
	</dataSet>
</as_leas_1303_s>
*/
%>

<% /* 작성시간 : Mon Jun 14 19:56:40 KST 2010 */ %>