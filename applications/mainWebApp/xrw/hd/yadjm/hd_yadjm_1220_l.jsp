<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_1220_LDataSet ds = (HD_YADJM_1220_LDataSet)request.getAttribute("ds");
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
			HD_YADJM_1220_LCURLISTRecord rec = (HD_YADJM_1220_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "adjm_rvrs_yy", rec.adjm_rvrs_yy);
			rx.add(record, "adjm_clsf", rec.adjm_clsf);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "spos_exne", rec.spos_exne);
			rx.add(record, "child_nops", rec.child_nops);
			rx.add(record, "oldg_nops", rec.oldg_nops);
			rx.add(record, "obcl_pers_nops", rec.obcl_pers_nops);
			rx.add(record, "rspc_nops", rec.rspc_nops);
			rx.add(record, "rspc_nops_70", rec.rspc_nops_70);
			rx.add(record, "fml_hshd_yn", rec.fml_hshd_yn);
			rx.add(record, "care_fee_nops", rec.care_fee_nops);
			rx.add(record, "child_birth_in_qunt_nops", rec.child_birth_in_qunt_nops);
			rx.add(record, "edu_fee_slf", rec.edu_fee_slf);
			rx.add(record, "edu_cost_slf_both_point", rec.edu_cost_slf_both_point);
			rx.add(record, "edu_fee_faml_ent_scl_prv", rec.edu_fee_faml_ent_scl_prv);
			rx.add(record, "edu_fee_faml_ent_scl_prv_nops", rec.edu_fee_faml_ent_scl_prv_nops);
			rx.add(record, "edu_fee_faml_elmihi", rec.edu_fee_faml_elmihi);
			rx.add(record, "edu_fee_faml_elmihi_nops", rec.edu_fee_faml_elmihi_nops);
			rx.add(record, "edu_fee_faml_univ", rec.edu_fee_faml_univ);
			rx.add(record, "edu_fee_faml_univ_nops", rec.edu_fee_faml_univ_nops);
			rx.add(record, "obcl_pers_spc_edu_fee", rec.obcl_pers_spc_edu_fee);
			rx.add(record, "obcl_pers_spc_edu_cost_nops", rec.obcl_pers_spc_edu_cost_nops);
			rx.add(record, "hosp_cost_slf_path_pers_obcl_p", rec.hosp_cost_slf_path_pers_obcl_p);
			rx.add(record, "gnr_fee_cost_slf_excep", rec.gnr_fee_cost_slf_excep);
			rx.add(record, "gnr_asrc_prpn_insr_fee", rec.gnr_asrc_prpn_insr_fee);
			rx.add(record, "obcl_pers_lesd_insr_fee", rec.obcl_pers_lesd_insr_fee);
			rx.add(record, "dona_amt_lgl", rec.dona_amt_lgl);
			rx.add(record, "dona_amt_spc_case_dona_amt", rec.dona_amt_spc_case_dona_amt);
			rx.add(record, "emp_stok_ownr_cmpd_dona_amt", rec.emp_stok_ownr_cmpd_dona_amt);
			rx.add(record, "dona_phb_regu_boks_amt", rec.dona_phb_regu_boks_amt);
			rx.add(record, "relg_dona_amt", rec.relg_dona_amt);
			rx.add(record, "hous_hire_rcpm_won_li_amt_repa", rec.hous_hire_rcpm_won_li_amt_repa);
			rx.add(record, "ltrm_hous_mogg_loan_amt_int_re", rec.ltrm_hous_mogg_loan_amt_int_re);
			rx.add(record, "hous_loan_amt_int", rec.hous_loan_amt_int);
			rx.add(record, "wedd_tms", rec.wedd_tms);
			rx.add(record, "wedd_fee", rec.wedd_fee);
			rx.add(record, "movm_tms", rec.movm_tms);
			rx.add(record, "movm_fee", rec.movm_fee);
			rx.add(record, "fnrl_tms", rec.fnrl_tms);
			rx.add(record, "fnrl_fee", rec.fnrl_fee);
			rx.add(record, "prsn_pens", rec.prsn_pens);
			rx.add(record, "pens_savg", rec.pens_savg);
			rx.add(record, "crdt_non_pcc_use", rec.crdt_non_pcc_use);
			rx.add(record, "cash_rcpt", rec.cash_rcpt);
			rx.add(record, "edu_cost_giro_pymt_amt", rec.edu_cost_giro_pymt_amt);
			rx.add(record, "invsm_cmpd_invsm_amt", rec.invsm_cmpd_invsm_amt);
			rx.add(record, "emp_stok_ownr_out_pens", rec.emp_stok_ownr_out_pens);
			rx.add(record, "lvcmpy_pens_incm_dduc", rec.lvcmpy_pens_incm_dduc);
			rx.add(record, "plac_cmpy_plac_trad_authr_inc", rec.plac_cmpy_plac_trad_authr_inc);
			rx.add(record, "ltrm_stok_type_savg_incm_dduc", rec.ltrm_stok_type_savg_incm_dduc);
			rx.add(record, "tax_paymt_cmpd_dduc", rec.tax_paymt_cmpd_dduc);
			rx.add(record, "dona_polt_fund", rec.dona_polt_fund);
			rx.add(record, "forn_duty_plac", rec.forn_duty_plac);
			rx.add(record, "forn_duty_dty", rec.forn_duty_dty);
			rx.add(record, "forn_duty_prd_frdt", rec.forn_duty_prd_frdt);
			rx.add(record, "forn_duty_prd_todt", rec.forn_duty_prd_todt);
			rx.add(record, "forn_duty_tot_saly", rec.forn_duty_tot_saly);
			rx.add(record, "tax_paymt_offi_nm", rec.tax_paymt_offi_nm);
			rx.add(record, "tax_paymt_amt_frex", rec.tax_paymt_amt_frex);
			rx.add(record, "tax_paymt_amt_won", rec.tax_paymt_amt_won);
			rx.add(record, "forn_duty_clsf", rec.forn_duty_clsf);
			rx.add(record, "txn_obj_addm_amt", rec.txn_obj_addm_amt);
			rx.add(record, "ltrm_stok_type_savg_incm_dduc1", rec.ltrm_stok_type_savg_incm_dduc1);
			rx.add(record, "ltrm_stok_type_savg_incm_dduc2", rec.ltrm_stok_type_savg_incm_dduc2);
			rx.add(record, "ltrm_stok_type_savg_incm_dduc3", rec.ltrm_stok_type_savg_incm_dduc3);
			rx.add(record, "hous_subc_savg", rec.hous_subc_savg);
			rx.add(record, "labr_hous_savg", rec.labr_hous_savg);
			rx.add(record, "ltrm_hous_savg", rec.ltrm_hous_savg);
			rx.add(record, "invsm_cmpd_invsm_amt_6", rec.invsm_cmpd_invsm_amt_6);
			rx.add(record, "hous_loan_amt_int_1", rec.hous_loan_amt_int_1);
			rx.add(record, "tmp1", rec.tmp1);
			rx.add(record, "tmp2", rec.tmp2);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "adjm_rvrs_yy", StringUtil.replaceToXml(rec.adjm_rvrs_yy));
			//rx.add(record, "adjm_clsf", StringUtil.replaceToXml(rec.adjm_clsf));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "spos_exne", StringUtil.replaceToXml(rec.spos_exne));
			//rx.add(record, "child_nops", StringUtil.replaceToXml(rec.child_nops));
			//rx.add(record, "oldg_nops", StringUtil.replaceToXml(rec.oldg_nops));
			//rx.add(record, "obcl_pers_nops", StringUtil.replaceToXml(rec.obcl_pers_nops));
			//rx.add(record, "rspc_nops", StringUtil.replaceToXml(rec.rspc_nops));
			//rx.add(record, "rspc_nops_70", StringUtil.replaceToXml(rec.rspc_nops_70));
			//rx.add(record, "fml_hshd_yn", StringUtil.replaceToXml(rec.fml_hshd_yn));
			//rx.add(record, "care_fee_nops", StringUtil.replaceToXml(rec.care_fee_nops));
			//rx.add(record, "child_birth_in_qunt_nops", StringUtil.replaceToXml(rec.child_birth_in_qunt_nops));
			//rx.add(record, "edu_fee_slf", StringUtil.replaceToXml(rec.edu_fee_slf));
			//rx.add(record, "edu_cost_slf_both_point", StringUtil.replaceToXml(rec.edu_cost_slf_both_point));
			//rx.add(record, "edu_fee_faml_ent_scl_prv", StringUtil.replaceToXml(rec.edu_fee_faml_ent_scl_prv));
			//rx.add(record, "edu_fee_faml_ent_scl_prv_nops", StringUtil.replaceToXml(rec.edu_fee_faml_ent_scl_prv_nops));
			//rx.add(record, "edu_fee_faml_elmihi", StringUtil.replaceToXml(rec.edu_fee_faml_elmihi));
			//rx.add(record, "edu_fee_faml_elmihi_nops", StringUtil.replaceToXml(rec.edu_fee_faml_elmihi_nops));
			//rx.add(record, "edu_fee_faml_univ", StringUtil.replaceToXml(rec.edu_fee_faml_univ));
			//rx.add(record, "edu_fee_faml_univ_nops", StringUtil.replaceToXml(rec.edu_fee_faml_univ_nops));
			//rx.add(record, "obcl_pers_spc_edu_fee", StringUtil.replaceToXml(rec.obcl_pers_spc_edu_fee));
			//rx.add(record, "obcl_pers_spc_edu_cost_nops", StringUtil.replaceToXml(rec.obcl_pers_spc_edu_cost_nops));
			//rx.add(record, "hosp_cost_slf_path_pers_obcl_p", StringUtil.replaceToXml(rec.hosp_cost_slf_path_pers_obcl_p));
			//rx.add(record, "gnr_fee_cost_slf_excep", StringUtil.replaceToXml(rec.gnr_fee_cost_slf_excep));
			//rx.add(record, "gnr_asrc_prpn_insr_fee", StringUtil.replaceToXml(rec.gnr_asrc_prpn_insr_fee));
			//rx.add(record, "obcl_pers_lesd_insr_fee", StringUtil.replaceToXml(rec.obcl_pers_lesd_insr_fee));
			//rx.add(record, "dona_amt_lgl", StringUtil.replaceToXml(rec.dona_amt_lgl));
			//rx.add(record, "dona_amt_spc_case_dona_amt", StringUtil.replaceToXml(rec.dona_amt_spc_case_dona_amt));
			//rx.add(record, "emp_stok_ownr_cmpd_dona_amt", StringUtil.replaceToXml(rec.emp_stok_ownr_cmpd_dona_amt));
			//rx.add(record, "dona_phb_regu_boks_amt", StringUtil.replaceToXml(rec.dona_phb_regu_boks_amt));
			//rx.add(record, "relg_dona_amt", StringUtil.replaceToXml(rec.relg_dona_amt));
			//rx.add(record, "hous_hire_rcpm_won_li_amt_repa", StringUtil.replaceToXml(rec.hous_hire_rcpm_won_li_amt_repa));
			//rx.add(record, "ltrm_hous_mogg_loan_amt_int_re", StringUtil.replaceToXml(rec.ltrm_hous_mogg_loan_amt_int_re));
			//rx.add(record, "hous_loan_amt_int", StringUtil.replaceToXml(rec.hous_loan_amt_int));
			//rx.add(record, "wedd_tms", StringUtil.replaceToXml(rec.wedd_tms));
			//rx.add(record, "wedd_fee", StringUtil.replaceToXml(rec.wedd_fee));
			//rx.add(record, "movm_tms", StringUtil.replaceToXml(rec.movm_tms));
			//rx.add(record, "movm_fee", StringUtil.replaceToXml(rec.movm_fee));
			//rx.add(record, "fnrl_tms", StringUtil.replaceToXml(rec.fnrl_tms));
			//rx.add(record, "fnrl_fee", StringUtil.replaceToXml(rec.fnrl_fee));
			//rx.add(record, "prsn_pens", StringUtil.replaceToXml(rec.prsn_pens));
			//rx.add(record, "pens_savg", StringUtil.replaceToXml(rec.pens_savg));
			//rx.add(record, "crdt_non_pcc_use", StringUtil.replaceToXml(rec.crdt_non_pcc_use));
			//rx.add(record, "cash_rcpt", StringUtil.replaceToXml(rec.cash_rcpt));
			//rx.add(record, "edu_cost_giro_pymt_amt", StringUtil.replaceToXml(rec.edu_cost_giro_pymt_amt));
			//rx.add(record, "invsm_cmpd_invsm_amt", StringUtil.replaceToXml(rec.invsm_cmpd_invsm_amt));
			//rx.add(record, "emp_stok_ownr_out_pens", StringUtil.replaceToXml(rec.emp_stok_ownr_out_pens));
			//rx.add(record, "lvcmpy_pens_incm_dduc", StringUtil.replaceToXml(rec.lvcmpy_pens_incm_dduc));
			//rx.add(record, "plac_cmpy_plac_trad_authr_inc", StringUtil.replaceToXml(rec.plac_cmpy_plac_trad_authr_inc));
			//rx.add(record, "ltrm_stok_type_savg_incm_dduc", StringUtil.replaceToXml(rec.ltrm_stok_type_savg_incm_dduc));
			//rx.add(record, "tax_paymt_cmpd_dduc", StringUtil.replaceToXml(rec.tax_paymt_cmpd_dduc));
			//rx.add(record, "dona_polt_fund", StringUtil.replaceToXml(rec.dona_polt_fund));
			//rx.add(record, "forn_duty_plac", StringUtil.replaceToXml(rec.forn_duty_plac));
			//rx.add(record, "forn_duty_dty", StringUtil.replaceToXml(rec.forn_duty_dty));
			//rx.add(record, "forn_duty_prd_frdt", StringUtil.replaceToXml(rec.forn_duty_prd_frdt));
			//rx.add(record, "forn_duty_prd_todt", StringUtil.replaceToXml(rec.forn_duty_prd_todt));
			//rx.add(record, "forn_duty_tot_saly", StringUtil.replaceToXml(rec.forn_duty_tot_saly));
			//rx.add(record, "tax_paymt_offi_nm", StringUtil.replaceToXml(rec.tax_paymt_offi_nm));
			//rx.add(record, "tax_paymt_amt_frex", StringUtil.replaceToXml(rec.tax_paymt_amt_frex));
			//rx.add(record, "tax_paymt_amt_won", StringUtil.replaceToXml(rec.tax_paymt_amt_won));
			//rx.add(record, "forn_duty_clsf", StringUtil.replaceToXml(rec.forn_duty_clsf));
			//rx.add(record, "txn_obj_addm_amt", StringUtil.replaceToXml(rec.txn_obj_addm_amt));
			//rx.add(record, "ltrm_stok_type_savg_incm_dduc1", StringUtil.replaceToXml(rec.ltrm_stok_type_savg_incm_dduc1));
			//rx.add(record, "ltrm_stok_type_savg_incm_dduc2", StringUtil.replaceToXml(rec.ltrm_stok_type_savg_incm_dduc2));
			//rx.add(record, "ltrm_stok_type_savg_incm_dduc3", StringUtil.replaceToXml(rec.ltrm_stok_type_savg_incm_dduc3));
			//rx.add(record, "hous_subc_savg", StringUtil.replaceToXml(rec.hous_subc_savg));
			//rx.add(record, "labr_hous_savg", StringUtil.replaceToXml(rec.labr_hous_savg));
			//rx.add(record, "ltrm_hous_savg", StringUtil.replaceToXml(rec.ltrm_hous_savg));
			//rx.add(record, "invsm_cmpd_invsm_amt_6", StringUtil.replaceToXml(rec.invsm_cmpd_invsm_amt_6));
			//rx.add(record, "hous_loan_amt_int_1", StringUtil.replaceToXml(rec.hous_loan_amt_int_1));
			//rx.add(record, "tmp1", StringUtil.replaceToXml(rec.tmp1));
			//rx.add(record, "tmp2", StringUtil.replaceToXml(rec.tmp2));
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
<hd_yadjm_1220_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<adjm_rvrs_yy/>
				<adjm_clsf/>
				<emp_no/>
				<spos_exne/>
				<child_nops/>
				<oldg_nops/>
				<obcl_pers_nops/>
				<rspc_nops/>
				<rspc_nops_70/>
				<fml_hshd_yn/>
				<care_fee_nops/>
				<child_birth_in_qunt_nops/>
				<edu_fee_slf/>
				<edu_cost_slf_both_point/>
				<edu_fee_faml_ent_scl_prv/>
				<edu_fee_faml_ent_scl_prv_nops/>
				<edu_fee_faml_elmihi/>
				<edu_fee_faml_elmihi_nops/>
				<edu_fee_faml_univ/>
				<edu_fee_faml_univ_nops/>
				<obcl_pers_spc_edu_fee/>
				<obcl_pers_spc_edu_cost_nops/>
				<hosp_cost_slf_path_pers_obcl_p/>
				<gnr_fee_cost_slf_excep/>
				<gnr_asrc_prpn_insr_fee/>
				<obcl_pers_lesd_insr_fee/>
				<dona_amt_lgl/>
				<dona_amt_spc_case_dona_amt/>
				<emp_stok_ownr_cmpd_dona_amt/>
				<dona_phb_regu_boks_amt/>
				<relg_dona_amt/>
				<hous_hire_rcpm_won_li_amt_repa/>
				<ltrm_hous_mogg_loan_amt_int_re/>
				<hous_loan_amt_int/>
				<wedd_tms/>
				<wedd_fee/>
				<movm_tms/>
				<movm_fee/>
				<fnrl_tms/>
				<fnrl_fee/>
				<prsn_pens/>
				<pens_savg/>
				<crdt_non_pcc_use/>
				<cash_rcpt/>
				<edu_cost_giro_pymt_amt/>
				<invsm_cmpd_invsm_amt/>
				<emp_stok_ownr_out_pens/>
				<lvcmpy_pens_incm_dduc/>
				<plac_cmpy_plac_trad_authr_inc/>
				<ltrm_stok_type_savg_incm_dduc/>
				<tax_paymt_cmpd_dduc/>
				<dona_polt_fund/>
				<forn_duty_plac/>
				<forn_duty_dty/>
				<forn_duty_prd_frdt/>
				<forn_duty_prd_todt/>
				<forn_duty_tot_saly/>
				<tax_paymt_offi_nm/>
				<tax_paymt_amt_frex/>
				<tax_paymt_amt_won/>
				<forn_duty_clsf/>
				<txn_obj_addm_amt/>
				<ltrm_stok_type_savg_incm_dduc1/>
				<ltrm_stok_type_savg_incm_dduc2/>
				<ltrm_stok_type_savg_incm_dduc3/>
				<hous_subc_savg/>
				<labr_hous_savg/>
				<ltrm_hous_savg/>
				<invsm_cmpd_invsm_amt_6/>
				<hous_loan_amt_int_1/>
				<tmp1/>
				<tmp2/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_1220_l>
*/
%>

<% /* 작성시간 : Thu Jan 14 20:47:15 KST 2010 */ %>