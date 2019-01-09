<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.en.innexp.rec.*
	,	chosun.ciis.en.innexp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_INNEXP_1002_SDataSet ds = (EN_INNEXP_1002_SDataSet)request.getAttribute("ds");
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
			EN_INNEXP_1002_SCURLIST4Record rec = (EN_INNEXP_1002_SCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evnt_seq", rec.evnt_seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			EN_INNEXP_1002_SCURLIST3Record rec = (EN_INNEXP_1002_SCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.addCData(record, "budg_nm", rec.budg_nm);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "acct_mang_no", rec.acct_mang_no);
			rx.add(record, "rmtt_dt", rec.rmtt_dt);
			rx.add(record, "rmtt_plac", rec.rmtt_plac);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "note_clsf_cd", rec.note_clsf_cd);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.addCData(record, "bank_nm", rec.bank_nm);
			rx.addCData(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "issu_cmpy_clsf_cd", rec.issu_cmpy_clsf_cd);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "rcpm_acct", rec.rcpm_acct);
			rx.add(record, "sale_aprv_no", rec.sale_aprv_no);
			rx.add(record, "bal_occr_slip_no", rec.bal_occr_slip_no);
			rx.add(record, "extnc_obj_slip_clsf", rec.extnc_obj_slip_clsf);
			rx.add(record, "extnc_dlco_no", rec.extnc_dlco_no);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.addCData(record, "acct_mang_nm", rec.acct_mang_nm);
			rx.add(record, "biz_reg_no", rec.biz_reg_no);
			rx.add(record, "bank_id", rec.bank_id);
			rx.add(record, "acct_num", rec.acct_num);
			rx.add(record, "tran_date", rec.tran_date);
			rx.add(record, "tran_date_seq", rec.tran_date_seq);
			rx.add(record, "slip_no", rec.slip_no);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			EN_INNEXP_1002_SCURLIST2Record rec = (EN_INNEXP_1002_SCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.addCData(record, "budg_nm", rec.budg_nm);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "acct_mang_no", rec.acct_mang_no);
			rx.add(record, "rmtt_dt", rec.rmtt_dt);
			rx.add(record, "rmtt_plac", rec.rmtt_plac);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "note_clsf_cd", rec.note_clsf_cd);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.addCData(record, "bank_nm", rec.bank_nm);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "issu_cmpy_clsf_cd", rec.issu_cmpy_clsf_cd);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "rcpm_acct", rec.rcpm_acct);
			rx.add(record, "sale_aprv_no", rec.sale_aprv_no);
			rx.add(record, "bal_occr_slip_no", rec.bal_occr_slip_no);
			rx.add(record, "extnc_obj_slip_clsf", rec.extnc_obj_slip_clsf);
			rx.add(record, "extnc_dlco_no", rec.extnc_dlco_no);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.addCData(record, "acct_mang_nm", rec.acct_mang_nm);
			rx.add(record, "biz_reg_no", rec.biz_reg_no);
			rx.add(record, "bank_id", rec.bank_id);
			rx.add(record, "acct_num", rec.acct_num);
			rx.add(record, "tran_date", rec.tran_date);
			rx.add(record, "tran_date_seq", rec.tran_date_seq);
			rx.add(record, "slip_no", rec.slip_no);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			EN_INNEXP_1002_SCURLIST1Record rec = (EN_INNEXP_1002_SCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "occr_seq", rec.occr_seq);
			rx.add(record, "reven_dt", rec.reven_dt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "boks_dlco_nm", rec.boks_dlco_nm);
			rx.add(record, "titl", rec.titl);
			rx.add(record, "reven_amt", rec.reven_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "rcpm_shet_kind", rec.rcpm_shet_kind);
			rx.add(record, "rcpm_shet_no", rec.rcpm_shet_no);
			rx.add(record, "prof_type_cd", rec.prof_type_cd);
			rx.add(record, "stmt_occr_dt", rec.stmt_occr_dt);
			rx.add(record, "stmt_occr_seq", rec.stmt_occr_seq);
			rx.add(record, "chrg_dept_cd", rec.chrg_dept_cd);
			rx.add(record, "chrg_dept_nm", rec.chrg_dept_nm);
			rx.add(record, "chrg_pers_emp_no", rec.chrg_pers_emp_no);
			rx.add(record, "chrg_pers_emp_nm", rec.chrg_pers_emp_nm);
			rx.add(record, "evnt_yy", rec.evnt_yy);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.addCData(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "evnt_seq", rec.evnt_seq);
			rx.addCData(record, "remk", rec.remk);
			rx.add(record, "payo_clsf", rec.payo_clsf);
			rx.add(record, "rcpm_occr_dt", rec.rcpm_occr_dt);
			rx.add(record, "rcpm_occr_seq", rec.rcpm_occr_seq);
			rx.add(record, "p_upd_occr_dt", rec.p_upd_occr_dt);
			rx.add(record, "p_upd_occr_seq", rec.p_upd_occr_seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST7 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST7", "");

		for(int i = 0; i < ds.curlist7.size(); i++) {
			EN_INNEXP_1002_SCURLIST7Record rec = (EN_INNEXP_1002_SCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "biz_reg_no", rec.biz_reg_no);
			rx.add(record, "bank_id", rec.bank_id);
			rx.add(record, "acct_num", rec.acct_num);
			rx.add(record, "tran_date", rec.tran_date);
			rx.add(record, "tran_date_seq", rec.tran_date_seq);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "extnc_amt", rec.extnc_amt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist7.size());
		/****** CURLIST7 END */

		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST6", "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			EN_INNEXP_1002_SCURLIST6Record rec = (EN_INNEXP_1002_SCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "reven_stot", rec.reven_stot);
			rx.add(record, "expn_stot", rec.expn_stot);
			rx.add(record, "bal_stot", rec.bal_stot);
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			EN_INNEXP_1002_SCURLIST5Record rec = (EN_INNEXP_1002_SCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "reven_amt", rec.reven_amt);
			rx.add(record, "expn_amt", rec.expn_amt);
			rx.add(record, "bal_amt", rec.bal_amt);
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
			<evnt_seq/>
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
			<budg_cd/>
			<budg_nm/>
			<amt/>
			<acct_mang_no/>
			<rmtt_dt/>
			<rmtt_plac/>
			<note_no/>
			<note_clsf_cd/>
			<bank_cd/>
			<bank_nm/>
			<issu_pers_nm/>
			<issu_cmpy_clsf_cd/>
			<comp_dt/>
			<mtry_dt/>
			<rcpm_acct/>
			<sale_aprv_no/>
			<bal_occr_slip_no/>
			<extnc_obj_slip_clsf/>
			<extnc_dlco_no/>
			<medi_cd/>
			<acct_mang_nm/>
			<biz_reg_no/>
			<bank_id/>
			<acct_num/>
			<tran_date/>
			<tran_date_seq/>
			<slip_no/>
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
			<budg_cd/>
			<budg_nm/>
			<amt/>
			<acct_mang_no/>
			<rmtt_dt/>
			<rmtt_plac/>
			<note_no/>
			<note_clsf_cd/>
			<bank_cd/>
			<bank_nm/>
			<issu_pers_nm/>
			<issu_cmpy_clsf_cd/>
			<comp_dt/>
			<mtry_dt/>
			<rcpm_acct/>
			<sale_aprv_no/>
			<bal_occr_slip_no/>
			<extnc_obj_slip_clsf/>
			<extnc_dlco_no/>
			<medi_cd/>
			<acct_mang_nm/>
			<biz_reg_no/>
			<bank_id/>
			<acct_num/>
			<tran_date/>
			<tran_date_seq/>
			<slip_no/>
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
			<occr_dt/>
			<slip_clsf_cd/>
			<occr_seq/>
			<reven_dt/>
			<dlco_clsf_cd/>
			<dlco_no/>
			<dlco_nm/>
			<boks_dlco_nm/>
			<titl/>
			<reven_amt/>
			<vat_amt/>
			<rcpm_amt/>
			<rcpm_shet_kind/>
			<rcpm_shet_no/>
			<prof_type_cd/>
			<stmt_occr_dt/>
			<stmt_occr_seq/>
			<chrg_dept_cd/>
			<chrg_dept_nm/>
			<chrg_pers_emp_no/>
			<chrg_pers_emp_nm/>
			<evnt_yy/>
			<evnt_cd/>
			<evnt_nm/>
			<evnt_seq/>
			<remk/>
			<payo_clsf/>
			<rcpm_occr_dt/>
			<rcpm_occr_seq/>
			<p_upd_occr_dt/>
			<p_upd_occr_seq/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST7>
		<record>
			<biz_reg_no/>
			<bank_id/>
			<acct_num/>
			<tran_date/>
			<tran_date_seq/>
			<slip_no/>
			<extnc_amt/>
		</record>
	</CURLIST7>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST6>
		<record>
			<reven_stot/>
			<expn_stot/>
			<bal_stot/>
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
			<reven_amt/>
			<expn_amt/>
			<bal_amt/>
		</record>
	</CURLIST5>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 22 14:20:59 KST 2009 */ %>