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
	HD_YADJM_2016_1250_LDataSet ds = (HD_YADJM_2016_1250_LDataSet)request.getAttribute("ds");
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
			HD_YADJM_2016_1250_LCURLISTRecord rec = (HD_YADJM_2016_1250_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "deci_incm_tax", rec.deci_incm_tax);
			rx.add(record, "deci_res_tax", rec.deci_res_tax);
			rx.add(record, "deci_farm_spc_tax", rec.deci_farm_spc_tax);
			rx.add(record, "deci_tax_stot", rec.deci_tax_stot);
			rx.add(record, "befo_pymt_incm_tax", rec.befo_pymt_incm_tax);
			rx.add(record, "befo_pymt_res_tax", rec.befo_pymt_res_tax);
			rx.add(record, "befo_pymt_farm_spc_tax", rec.befo_pymt_farm_spc_tax);
			rx.add(record, "befo_pymt_tax_stot", rec.befo_pymt_tax_stot);
			rx.add(record, "now_pymt_incm_tax", rec.now_pymt_incm_tax);
			rx.add(record, "now_pymt_res_tax", rec.now_pymt_res_tax);
			rx.add(record, "now_pymt_farm_spc_tax", rec.now_pymt_farm_spc_tax);
			rx.add(record, "now_pymt_tax_stot", rec.now_pymt_tax_stot);
			rx.add(record, "dedu_incm_tax", rec.dedu_incm_tax);
			rx.add(record, "dedu_res_tax", rec.dedu_res_tax);
			rx.add(record, "dedu_farm_spc_tax", rec.dedu_farm_spc_tax);
			rx.add(record, "dedu_tax_stot", rec.dedu_tax_stot);
			rx.add(record, "labr_incm_impt_amt", rec.labr_incm_impt_amt);
			rx.add(record, "labr_incm_dduc", rec.labr_incm_dduc);
			rx.add(record, "labr_incm_amt", rec.labr_incm_amt);
			rx.add(record, "base_dduc_slf", rec.base_dduc_slf);
			rx.add(record, "base_dduc_spos", rec.base_dduc_spos);
			rx.add(record, "faml_nops", rec.faml_nops);
			rx.add(record, "base_dduc_child_oldg", rec.base_dduc_child_oldg);
			rx.add(record, "rspc_nops", rec.rspc_nops);
			rx.add(record, "addm_dduc_rspc", rec.addm_dduc_rspc);
			rx.add(record, "obcl_pers_nops", rec.obcl_pers_nops);
			rx.add(record, "addm_dduc_obcl_pers", rec.addm_dduc_obcl_pers);
			rx.add(record, "addm_dduc_fml_hshd", rec.addm_dduc_fml_hshd);
			rx.add(record, "addm_dduc_one_paren", rec.addm_dduc_one_paren);
			rx.add(record, "np_insr_fee_dduc", rec.np_insr_fee_dduc);
			rx.add(record, "tot_hlth_insr_fee", rec.tot_hlth_insr_fee);
			rx.add(record, "tot_emp_insr_fee", rec.tot_emp_insr_fee);
			rx.add(record, "spc_dduc_won_li_amt", rec.spc_dduc_won_li_amt);
			rx.add(record, "spc_dduc_mogg_loan_amt", rec.spc_dduc_mogg_loan_amt);
			rx.add(record, "spc_dduc_dona_amt", rec.spc_dduc_dona_amt);
			rx.add(record, "spc_dduc_stot", rec.spc_dduc_stot);
			rx.add(record, "dedu_labr_incm_amt", rec.dedu_labr_incm_amt);
			rx.add(record, "tax_rl_dduc_prsn_pens", rec.tax_rl_dduc_prsn_pens);
			rx.add(record, "smallbiz_incm_dduc", rec.smallbiz_incm_dduc);
			rx.add(record, "hous_subc_savg", rec.hous_subc_savg);
			rx.add(record, "multy_house_plan_savg", rec.multy_house_plan_savg);
			rx.add(record, "labr_hous_savg", rec.labr_hous_savg);
			rx.add(record, "vent_invsm", rec.vent_invsm);
			rx.add(record, "crdt_card_use_amt", rec.crdt_card_use_amt);
			rx.add(record, "lease_house_int_dduc", rec.lease_house_int_dduc);
			rx.add(record, "ltrm_invsm_stock_dduc", rec.ltrm_invsm_stock_dduc);
			rx.add(record, "other_tax_sum", rec.other_tax_sum);
			rx.add(record, "incm_dduc_tot_limt_excs_amt", rec.incm_dduc_tot_limt_excs_amt);
			rx.add(record, "txn_std_amt", rec.txn_std_amt);
			rx.add(record, "calc_incm_tax", rec.calc_incm_tax);
			rx.add(record, "tax_amt_dduc_labr_incm", rec.tax_amt_dduc_labr_incm);
			rx.add(record, "tax_dduc_child", rec.tax_dduc_child);
			rx.add(record, "pens_savg_dduc_obj", rec.pens_savg_dduc_obj);
			rx.add(record, "tax_dduc_pens_savg", rec.tax_dduc_pens_savg);
			rx.add(record, "asrc_insr_fee_dduc_obj", rec.asrc_insr_fee_dduc_obj);
			rx.add(record, "tax_dduc_asrc_insr_fee", rec.tax_dduc_asrc_insr_fee);
			rx.add(record, "hosp_fee_dduc_obj", rec.hosp_fee_dduc_obj);
			rx.add(record, "tax_dduc_hosp_fee", rec.tax_dduc_hosp_fee);
			rx.add(record, "edu_fee_dduc_obj", rec.edu_fee_dduc_obj);
			rx.add(record, "tax_dduc_edu_fee", rec.tax_dduc_edu_fee);
			rx.add(record, "dona_polt_1_dduc_obj", rec.dona_polt_1_dduc_obj);
			rx.add(record, "tax_dduc_dona_polt_1", rec.tax_dduc_dona_polt_1);
			rx.add(record, "dona_polt_2_dduc_obj", rec.dona_polt_2_dduc_obj);
			rx.add(record, "tax_dduc_dona_polt_2", rec.tax_dduc_dona_polt_2);
			rx.add(record, "dona_law_dduc_obj", rec.dona_law_dduc_obj);
			rx.add(record, "tax_dduc_dona_law", rec.tax_dduc_dona_law);
			rx.add(record, "dona_appm_dduc_obj", rec.dona_appm_dduc_obj);
			rx.add(record, "tax_dduc_dona_appm", rec.tax_dduc_dona_appm);
			rx.add(record, "std_tax_dduc_amt", rec.std_tax_dduc_amt);
			rx.add(record, "tax_amt_dduc_hous_loan_amt_int", rec.tax_amt_dduc_hous_loan_amt_int);
			rx.add(record, "tax_amt_dduc_forn_pymt", rec.tax_amt_dduc_forn_pymt);
			rx.add(record, "monthly_rent_dduc_obj", rec.monthly_rent_dduc_obj);
			rx.add(record, "tax_dduc_monthly_rent", rec.tax_dduc_monthly_rent);
			rx.add(record, "tax_amt_dduc_stot", rec.tax_amt_dduc_stot);
			rx.add(record, "deci_incm_tax2", rec.deci_incm_tax2);
			rx.add(record, "obcl_asrc_insr_dduc_obj", rec.obcl_asrc_insr_dduc_obj);
			rx.add(record, "tax_dduc_obcl_asrc_insr", rec.tax_dduc_obcl_asrc_insr);
			rx.add(record, "dduc_child_nops", rec.dduc_child_nops);
			rx.add(record, "dduc_child_6years_nops", rec.dduc_child_6years_nops);
			rx.add(record, "tax_dduc_child_6years", rec.tax_dduc_child_6years);
			rx.add(record, "adopt_dduc_nops", rec.adopt_dduc_nops);
			rx.add(record, "tax_dduc_child_born", rec.tax_dduc_child_born);
			//rx.add(record, "deci_incm_tax", StringUtil.replaceToXml(rec.deci_incm_tax));
			//rx.add(record, "deci_res_tax", StringUtil.replaceToXml(rec.deci_res_tax));
			//rx.add(record, "deci_farm_spc_tax", StringUtil.replaceToXml(rec.deci_farm_spc_tax));
			//rx.add(record, "deci_tax_stot", StringUtil.replaceToXml(rec.deci_tax_stot));
			//rx.add(record, "befo_pymt_incm_tax", StringUtil.replaceToXml(rec.befo_pymt_incm_tax));
			//rx.add(record, "befo_pymt_res_tax", StringUtil.replaceToXml(rec.befo_pymt_res_tax));
			//rx.add(record, "befo_pymt_farm_spc_tax", StringUtil.replaceToXml(rec.befo_pymt_farm_spc_tax));
			//rx.add(record, "befo_pymt_tax_stot", StringUtil.replaceToXml(rec.befo_pymt_tax_stot));
			//rx.add(record, "now_pymt_incm_tax", StringUtil.replaceToXml(rec.now_pymt_incm_tax));
			//rx.add(record, "now_pymt_res_tax", StringUtil.replaceToXml(rec.now_pymt_res_tax));
			//rx.add(record, "now_pymt_farm_spc_tax", StringUtil.replaceToXml(rec.now_pymt_farm_spc_tax));
			//rx.add(record, "now_pymt_tax_stot", StringUtil.replaceToXml(rec.now_pymt_tax_stot));
			//rx.add(record, "dedu_incm_tax", StringUtil.replaceToXml(rec.dedu_incm_tax));
			//rx.add(record, "dedu_res_tax", StringUtil.replaceToXml(rec.dedu_res_tax));
			//rx.add(record, "dedu_farm_spc_tax", StringUtil.replaceToXml(rec.dedu_farm_spc_tax));
			//rx.add(record, "dedu_tax_stot", StringUtil.replaceToXml(rec.dedu_tax_stot));
			//rx.add(record, "labr_incm_impt_amt", StringUtil.replaceToXml(rec.labr_incm_impt_amt));
			//rx.add(record, "labr_incm_dduc", StringUtil.replaceToXml(rec.labr_incm_dduc));
			//rx.add(record, "labr_incm_amt", StringUtil.replaceToXml(rec.labr_incm_amt));
			//rx.add(record, "base_dduc_slf", StringUtil.replaceToXml(rec.base_dduc_slf));
			//rx.add(record, "base_dduc_spos", StringUtil.replaceToXml(rec.base_dduc_spos));
			//rx.add(record, "faml_nops", StringUtil.replaceToXml(rec.faml_nops));
			//rx.add(record, "base_dduc_child_oldg", StringUtil.replaceToXml(rec.base_dduc_child_oldg));
			//rx.add(record, "rspc_nops", StringUtil.replaceToXml(rec.rspc_nops));
			//rx.add(record, "addm_dduc_rspc", StringUtil.replaceToXml(rec.addm_dduc_rspc));
			//rx.add(record, "obcl_pers_nops", StringUtil.replaceToXml(rec.obcl_pers_nops));
			//rx.add(record, "addm_dduc_obcl_pers", StringUtil.replaceToXml(rec.addm_dduc_obcl_pers));
			//rx.add(record, "addm_dduc_fml_hshd", StringUtil.replaceToXml(rec.addm_dduc_fml_hshd));
			//rx.add(record, "addm_dduc_one_paren", StringUtil.replaceToXml(rec.addm_dduc_one_paren));
			//rx.add(record, "np_insr_fee_dduc", StringUtil.replaceToXml(rec.np_insr_fee_dduc));
			//rx.add(record, "tot_hlth_insr_fee", StringUtil.replaceToXml(rec.tot_hlth_insr_fee));
			//rx.add(record, "tot_emp_insr_fee", StringUtil.replaceToXml(rec.tot_emp_insr_fee));
			//rx.add(record, "spc_dduc_won_li_amt", StringUtil.replaceToXml(rec.spc_dduc_won_li_amt));
			//rx.add(record, "spc_dduc_mogg_loan_amt", StringUtil.replaceToXml(rec.spc_dduc_mogg_loan_amt));
			//rx.add(record, "spc_dduc_dona_amt", StringUtil.replaceToXml(rec.spc_dduc_dona_amt));
			//rx.add(record, "spc_dduc_stot", StringUtil.replaceToXml(rec.spc_dduc_stot));
			//rx.add(record, "dedu_labr_incm_amt", StringUtil.replaceToXml(rec.dedu_labr_incm_amt));
			//rx.add(record, "tax_rl_dduc_prsn_pens", StringUtil.replaceToXml(rec.tax_rl_dduc_prsn_pens));
			//rx.add(record, "smallbiz_incm_dduc", StringUtil.replaceToXml(rec.smallbiz_incm_dduc));
			//rx.add(record, "hous_subc_savg", StringUtil.replaceToXml(rec.hous_subc_savg));
			//rx.add(record, "multy_house_plan_savg", StringUtil.replaceToXml(rec.multy_house_plan_savg));
			//rx.add(record, "labr_hous_savg", StringUtil.replaceToXml(rec.labr_hous_savg));
			//rx.add(record, "vent_invsm", StringUtil.replaceToXml(rec.vent_invsm));
			//rx.add(record, "crdt_card_use_amt", StringUtil.replaceToXml(rec.crdt_card_use_amt));
			//rx.add(record, "lease_house_int_dduc", StringUtil.replaceToXml(rec.lease_house_int_dduc));
			//rx.add(record, "ltrm_invsm_stock_dduc", StringUtil.replaceToXml(rec.ltrm_invsm_stock_dduc));
			//rx.add(record, "other_tax_sum", StringUtil.replaceToXml(rec.other_tax_sum));
			//rx.add(record, "incm_dduc_tot_limt_excs_amt", StringUtil.replaceToXml(rec.incm_dduc_tot_limt_excs_amt));
			//rx.add(record, "txn_std_amt", StringUtil.replaceToXml(rec.txn_std_amt));
			//rx.add(record, "calc_incm_tax", StringUtil.replaceToXml(rec.calc_incm_tax));
			//rx.add(record, "tax_amt_dduc_labr_incm", StringUtil.replaceToXml(rec.tax_amt_dduc_labr_incm));
			//rx.add(record, "tax_dduc_child", StringUtil.replaceToXml(rec.tax_dduc_child));
			//rx.add(record, "pens_savg_dduc_obj", StringUtil.replaceToXml(rec.pens_savg_dduc_obj));
			//rx.add(record, "tax_dduc_pens_savg", StringUtil.replaceToXml(rec.tax_dduc_pens_savg));
			//rx.add(record, "asrc_insr_fee_dduc_obj", StringUtil.replaceToXml(rec.asrc_insr_fee_dduc_obj));
			//rx.add(record, "tax_dduc_asrc_insr_fee", StringUtil.replaceToXml(rec.tax_dduc_asrc_insr_fee));
			//rx.add(record, "hosp_fee_dduc_obj", StringUtil.replaceToXml(rec.hosp_fee_dduc_obj));
			//rx.add(record, "tax_dduc_hosp_fee", StringUtil.replaceToXml(rec.tax_dduc_hosp_fee));
			//rx.add(record, "edu_fee_dduc_obj", StringUtil.replaceToXml(rec.edu_fee_dduc_obj));
			//rx.add(record, "tax_dduc_edu_fee", StringUtil.replaceToXml(rec.tax_dduc_edu_fee));
			//rx.add(record, "dona_polt_1_dduc_obj", StringUtil.replaceToXml(rec.dona_polt_1_dduc_obj));
			//rx.add(record, "tax_dduc_dona_polt_1", StringUtil.replaceToXml(rec.tax_dduc_dona_polt_1));
			//rx.add(record, "dona_polt_2_dduc_obj", StringUtil.replaceToXml(rec.dona_polt_2_dduc_obj));
			//rx.add(record, "tax_dduc_dona_polt_2", StringUtil.replaceToXml(rec.tax_dduc_dona_polt_2));
			//rx.add(record, "dona_law_dduc_obj", StringUtil.replaceToXml(rec.dona_law_dduc_obj));
			//rx.add(record, "tax_dduc_dona_law", StringUtil.replaceToXml(rec.tax_dduc_dona_law));
			//rx.add(record, "dona_appm_dduc_obj", StringUtil.replaceToXml(rec.dona_appm_dduc_obj));
			//rx.add(record, "tax_dduc_dona_appm", StringUtil.replaceToXml(rec.tax_dduc_dona_appm));
			//rx.add(record, "std_tax_dduc_amt", StringUtil.replaceToXml(rec.std_tax_dduc_amt));
			//rx.add(record, "tax_amt_dduc_hous_loan_amt_int", StringUtil.replaceToXml(rec.tax_amt_dduc_hous_loan_amt_int));
			//rx.add(record, "tax_amt_dduc_forn_pymt", StringUtil.replaceToXml(rec.tax_amt_dduc_forn_pymt));
			//rx.add(record, "monthly_rent_dduc_obj", StringUtil.replaceToXml(rec.monthly_rent_dduc_obj));
			//rx.add(record, "tax_dduc_monthly_rent", StringUtil.replaceToXml(rec.tax_dduc_monthly_rent));
			//rx.add(record, "tax_amt_dduc_stot", StringUtil.replaceToXml(rec.tax_amt_dduc_stot));
			//rx.add(record, "deci_incm_tax2", StringUtil.replaceToXml(rec.deci_incm_tax2));
			//rx.add(record, "tax_dduc_obcl_asrc_insr", StringUtil.replaceToXml(rec.tax_dduc_obcl_asrc_insr));
			//rx.add(record, "deci_incm_tax2", StringUtil.replaceToXml(rec.deci_incm_tax2));
			//rx.add(record, "obcl_asrc_insr_dduc_obj", StringUtil.replaceToXml(rec.obcl_asrc_insr_dduc_obj));
			//rx.add(record, "tax_dduc_obcl_asrc_insr", StringUtil.replaceToXml(rec.tax_dduc_obcl_asrc_insr));
			//rx.add(record, "dduc_child_nops", StringUtil.replaceToXml(rec.dduc_child_nops));
			//rx.add(record, "dduc_child_6years_nops", StringUtil.replaceToXml(rec.dduc_child_6years_nops));
			//rx.add(record, "tax_dduc_child_6years", StringUtil.replaceToXml(rec.tax_dduc_child_6years));
			//rx.add(record, "adopt_dduc_nops", StringUtil.replaceToXml(rec.adopt_dduc_nops));
			//rx.add(record, "tax_dduc_child_born", StringUtil.replaceToXml(rec.tax_dduc_child_born));
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
<hd_yadjm_2016_1250_l>
	<dataSet>
		<CURLIST>
			<record>
				<deci_incm_tax/>
				<deci_res_tax/>
				<deci_farm_spc_tax/>
				<deci_tax_stot/>
				<befo_pymt_incm_tax/>
				<befo_pymt_res_tax/>
				<befo_pymt_farm_spc_tax/>
				<befo_pymt_tax_stot/>
				<now_pymt_incm_tax/>
				<now_pymt_res_tax/>
				<now_pymt_farm_spc_tax/>
				<now_pymt_tax_stot/>
				<dedu_incm_tax/>
				<dedu_res_tax/>
				<dedu_farm_spc_tax/>
				<dedu_tax_stot/>
				<labr_incm_impt_amt/>
				<labr_incm_dduc/>
				<labr_incm_amt/>
				<base_dduc_slf/>
				<base_dduc_spos/>
				<faml_nops/>
				<base_dduc_child_oldg/>
				<rspc_nops/>
				<addm_dduc_rspc/>
				<obcl_pers_nops/>
				<addm_dduc_obcl_pers/>
				<addm_dduc_fml_hshd/>
				<addm_dduc_one_paren/>
				<np_insr_fee_dduc/>
				<tot_hlth_insr_fee/>
				<tot_emp_insr_fee/>
				<spc_dduc_won_li_amt/>
				<spc_dduc_mogg_loan_amt/>
				<spc_dduc_dona_amt/>
				<spc_dduc_stot/>
				<dedu_labr_incm_amt/>
				<tax_rl_dduc_prsn_pens/>
				<smallbiz_incm_dduc/>
				<hous_subc_savg/>
				<multy_house_plan_savg/>
				<labr_hous_savg/>
				<vent_invsm/>
				<crdt_card_use_amt/>
				<lease_house_int_dduc/>
				<ltrm_invsm_stock_dduc/>
				<other_tax_sum/>
				<incm_dduc_tot_limt_excs_amt/>
				<txn_std_amt/>
				<calc_incm_tax/>
				<tax_amt_dduc_labr_incm/>
				<tax_dduc_child/>
				<pens_savg_dduc_obj/>
				<tax_dduc_pens_savg/>
				<asrc_insr_fee_dduc_obj/>
				<tax_dduc_asrc_insr_fee/>
				<hosp_fee_dduc_obj/>
				<tax_dduc_hosp_fee/>
				<edu_fee_dduc_obj/>
				<tax_dduc_edu_fee/>
				<dona_polt_1_dduc_obj/>
				<tax_dduc_dona_polt_1/>
				<dona_polt_2_dduc_obj/>
				<tax_dduc_dona_polt_2/>
				<dona_law_dduc_obj/>
				<tax_dduc_dona_law/>
				<dona_appm_dduc_obj/>
				<tax_dduc_dona_appm/>
				<std_tax_dduc_amt/>
				<tax_amt_dduc_hous_loan_amt_int/>
				<tax_amt_dduc_forn_pymt/>
				<monthly_rent_dduc_obj/>
				<tax_dduc_monthly_rent/>
				<tax_amt_dduc_stot/>
				<deci_incm_tax2/>
				<tax_dduc_obcl_asrc_insr/>
				<deci_incm_tax2/>
				<obcl_asrc_insr_dduc_obj/>
				<tax_dduc_obcl_asrc_insr/>
				<dduc_child_nops/>
				<dduc_child_6years_nops/>
				<tax_dduc_child_6years/>
				<adopt_dduc_nops/>
				<tax_dduc_child_born/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_2016_1250_l>
*/
%>

<% /* 작성시간 : Thu Jan 14 11:45:30 KST 2016 */ %>