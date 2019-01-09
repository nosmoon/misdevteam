<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.en.evnt.rec.*
	,	chosun.ciis.en.evnt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_EVNT_1203_LDataSet ds = (EN_EVNT_1203_LDataSet)request.getAttribute("ds");
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
			EN_EVNT_1203_LCURLIST2Record rec = (EN_EVNT_1203_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tmp_evnt_cd", rec.tmp_evnt_cd);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "evnt_rcpm_unit_clsf", rec.evnt_rcpm_unit_clsf);
			rx.add(record, "evnt_rcpm_unit_nm", rec.evnt_rcpm_unit_nm);
			rx.add(record, "vitl_acct_no_bgn", rec.vitl_acct_no_bgn);
			rx.add(record, "vitl_acct_no_end", rec.vitl_acct_no_end);
			rx.add(record, "use_end_yn", rec.use_end_yn);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_pers_emp_nm", rec.incmg_pers_emp_nm);
			rx.add(record, "incmg_dt", rec.incmg_dt);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_pers_emp_nm", rec.chg_pers_emp_nm);
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "evnt_yy", rec.evnt_yy);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_seq", rec.evnt_seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			EN_EVNT_1203_LCURLIST1Record rec = (EN_EVNT_1203_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "evnt_yy", rec.evnt_yy);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_seq", rec.evnt_seq);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "evnt_type", rec.evnt_type);
			rx.add(record, "regu_non_regu_clsf", rec.regu_non_regu_clsf);
			rx.add(record, "spons_clsf", rec.spons_clsf);
			rx.add(record, "entr_cost", rec.entr_cost);
			rx.add(record, "charg_entr_nops", rec.charg_entr_nops);
			rx.add(record, "free_entr_nops", rec.free_entr_nops);
			rx.add(record, "grp_entr_nops", rec.grp_entr_nops);
			rx.add(record, "grp_entr_team_cnt", rec.grp_entr_team_cnt);
			rx.add(record, "evnt_dds", rec.evnt_dds);
			rx.add(record, "evnt_frdt", rec.evnt_frdt);
			rx.add(record, "evnt_todt", rec.evnt_todt);
			rx.add(record, "plac_1", rec.plac_1);
			rx.add(record, "plac_2", rec.plac_2);
			rx.add(record, "plac_3", rec.plac_3);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "chrg_pers_emp_no", rec.chrg_pers_emp_no);
			rx.add(record, "chrg_pers_emp_nm", rec.chrg_pers_emp_nm);
			rx.add(record, "reven_budg_amt", rec.reven_budg_amt);
			rx.add(record, "expn_budg_amt", rec.expn_budg_amt);
			rx.add(record, "enpr_reven_stlm_amt", rec.enpr_reven_stlm_amt);
			rx.add(record, "enpr_expn_stlm_amt", rec.enpr_expn_stlm_amt);
			rx.add(record, "acct_reven_stlm_amt", rec.acct_reven_stlm_amt);
			rx.add(record, "acct_expn_stlm_amt", rec.acct_expn_stlm_amt);
			rx.add(record, "stlm_dt", rec.stlm_dt);
			rx.add(record, "stlm_proc_dt", rec.stlm_proc_dt);
			rx.add(record, "stlm_proc_pers_emp_no", rec.stlm_proc_pers_emp_no);
			rx.add(record, "vat_incd_yn", rec.vat_incd_yn);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_pers_emp_nm", rec.incmg_pers_emp_nm);
			rx.add(record, "incmg_dt", rec.incmg_dt);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_pers_emp_nm", rec.chg_pers_emp_nm);
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "evnt_cd_nm", rec.evnt_cd_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
	<CURLIST2>
		<record>
			<tmp_evnt_cd/>
			<evnt_nm/>
			<evnt_rcpm_unit_clsf/>
			<evnt_rcpm_unit_nm/>
			<vitl_acct_no_bgn/>
			<vitl_acct_no_end/>
			<use_end_yn/>
			<remk/>
			<incmg_pers/>
			<incmg_pers_emp_nm/>
			<incmg_dt/>
			<chg_pers/>
			<chg_pers_emp_nm/>
			<chg_dt/>
			<cmpy_cd/>
			<evnt_yy/>
			<evnt_cd/>
			<evnt_seq/>
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
			<cmpy_cd/>
			<evnt_yy/>
			<evnt_cd/>
			<evnt_seq/>
			<evnt_nm/>
			<evnt_type/>
			<regu_non_regu_clsf/>
			<spons_clsf/>
			<entr_cost/>
			<charg_entr_nops/>
			<free_entr_nops/>
			<grp_entr_nops/>
			<grp_entr_team_cnt/>
			<evnt_dds/>
			<evnt_frdt/>
			<evnt_todt/>
			<plac_1/>
			<plac_2/>
			<plac_3/>
			<dept_cd/>
			<dept_nm/>
			<chrg_pers_emp_no/>
			<chrg_pers_emp_nm/>
			<reven_budg_amt/>
			<expn_budg_amt/>
			<enpr_reven_stlm_amt/>
			<enpr_expn_stlm_amt/>
			<acct_reven_stlm_amt/>
			<acct_expn_stlm_amt/>
			<stlm_dt/>
			<stlm_proc_dt/>
			<stlm_proc_pers_emp_no/>
			<vat_incd_yn/>
			<incmg_pers/>
			<incmg_pers_emp_nm/>
			<incmg_dt/>
			<chg_pers/>
			<chg_pers_emp_nm/>
			<chg_dt/>
			<evnt_cd_nm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Thu May 14 12:00:56 KST 2009 */ %>