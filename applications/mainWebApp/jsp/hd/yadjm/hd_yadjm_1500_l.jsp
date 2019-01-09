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
	HD_YADJM_1500_LDataSet ds = (HD_YADJM_1500_LDataSet)request.getAttribute("ds");
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
			HD_YADJM_1500_LCURLISTRecord rec = (HD_YADJM_1500_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "labr_incm_impt_amt", rec.labr_incm_impt_amt);
			rx.add(record, "labr_incm_dduc", rec.labr_incm_dduc);
			rx.add(record, "labr_incm_amt", rec.labr_incm_amt);
			rx.add(record, "base_dduc_slf", rec.base_dduc_slf);
			rx.add(record, "base_dduc_spos", rec.base_dduc_spos);
			rx.add(record, "base_dduc_child", rec.base_dduc_child);
			rx.add(record, "base_dduc_oldg", rec.base_dduc_oldg);
			rx.add(record, "faml_nops", rec.faml_nops);
			rx.add(record, "addm_dduc_rspc", rec.addm_dduc_rspc);
			rx.add(record, "rspc_nops", rec.rspc_nops);
			rx.add(record, "addm_dduc_obcl_pers", rec.addm_dduc_obcl_pers);
			rx.add(record, "obcl_pers_nops", rec.obcl_pers_nops);
			rx.add(record, "addm_dduc_fml_hshd", rec.addm_dduc_fml_hshd);
			rx.add(record, "addm_dduc_care_fee", rec.addm_dduc_care_fee);
			rx.add(record, "child_care_fee_nops", rec.child_care_fee_nops);
			rx.add(record, "adopt_dduc", rec.adopt_dduc);
			rx.add(record, "adopt_dduc_nops", rec.adopt_dduc_nops);
			rx.add(record, "multi_child_addm_dduc", rec.multi_child_addm_dduc);
			rx.add(record, "multi_child_nops", rec.multi_child_nops);
			rx.add(record, "pens_savg_incm_dduc", rec.pens_savg_incm_dduc);
			rx.add(record, "np_insr_fee_dduc", rec.np_insr_fee_dduc);
			rx.add(record, "spc_dduc_insr_fee", rec.spc_dduc_insr_fee);
			rx.add(record, "spc_dduc_hosp_fee", rec.spc_dduc_hosp_fee);
			rx.add(record, "spc_dduc_edu_fee", rec.spc_dduc_edu_fee);
			rx.add(record, "spc_dduc_hous_fund", rec.spc_dduc_hous_fund);
			rx.add(record, "spc_dduc_dona_amt", rec.spc_dduc_dona_amt);
			rx.add(record, "spc_dduc_wedd_etc", rec.spc_dduc_wedd_etc);
			rx.add(record, "spc_dduc_stot", rec.spc_dduc_stot);
			rx.add(record, "std_dduc_amt", rec.std_dduc_amt);
			rx.add(record, "crdt_card_use_amt", rec.crdt_card_use_amt);
			rx.add(record, "vent_invsm_1", rec.vent_invsm_1);
			rx.add(record, "vent_invsm_2", rec.vent_invsm_2);
			rx.add(record, "stock_save", rec.stock_save);
			rx.add(record, "tax_rl_dduc_prsn_pens", rec.tax_rl_dduc_prsn_pens);
			rx.add(record, "tax_rl_dduc_tech_manpwr", rec.tax_rl_dduc_tech_manpwr);
			rx.add(record, "tax_rl_dduc_etc", rec.tax_rl_dduc_etc);
			rx.add(record, "txn_std_amt", rec.txn_std_amt);
			rx.add(record, "calc_incm_tax", rec.calc_incm_tax);
			rx.add(record, "tax_amt_dduc_labr_incm", rec.tax_amt_dduc_labr_incm);
			rx.add(record, "tax_amt_dduc_forn_pymt", rec.tax_amt_dduc_forn_pymt);
			rx.add(record, "tax_amt_dduc_hous_loan_amt_int", rec.tax_amt_dduc_hous_loan_amt_int);
			rx.add(record, "tax_amt_dduc_stok_savg", rec.tax_amt_dduc_stok_savg);
			rx.add(record, "tax_amt_dduc_savg", rec.tax_amt_dduc_savg);
			rx.add(record, "tax_amt_dduc_hous_fund", rec.tax_amt_dduc_hous_fund);
			rx.add(record, "tax_amt_dduc_ltrm_savg", rec.tax_amt_dduc_ltrm_savg);
			rx.add(record, "tax_amt_dduc_polt_fund", rec.tax_amt_dduc_polt_fund);
			rx.add(record, "tax_amt_dduc_etc", rec.tax_amt_dduc_etc);
			rx.add(record, "tax_amt_dduc_stot", rec.tax_amt_dduc_stot);
			rx.add(record, "tax_amt_redu_incm_tax_law", rec.tax_amt_redu_incm_tax_law);
			rx.add(record, "tax_amt_redu_tax_rl", rec.tax_amt_redu_tax_rl);
			rx.add(record, "tax_amt_redu_etc", rec.tax_amt_redu_etc);
			rx.add(record, "tax_amt_redu_stot", rec.tax_amt_redu_stot);
			rx.add(record, "deci_incm_tax", rec.deci_incm_tax);
			rx.add(record, "deci_farm_spc_tax", rec.deci_farm_spc_tax);
			rx.add(record, "deci_res_tax", rec.deci_res_tax);
			rx.add(record, "deci_tax_stot", rec.deci_tax_stot);
			rx.add(record, "befo_pymt_incm_tax", rec.befo_pymt_incm_tax);
			rx.add(record, "befo_pymt_farm_spc_tax", rec.befo_pymt_farm_spc_tax);
			rx.add(record, "befo_pymt_res_tax", rec.befo_pymt_res_tax);
			rx.add(record, "befo_pymt_tax_stot", rec.befo_pymt_tax_stot);
			rx.add(record, "now_pymt_incm_tax", rec.now_pymt_incm_tax);
			rx.add(record, "now_pymt_farm_spc_tax", rec.now_pymt_farm_spc_tax);
			rx.add(record, "now_pymt_res_tax", rec.now_pymt_res_tax);
			rx.add(record, "now_pymt_tax_stot", rec.now_pymt_tax_stot);
			rx.add(record, "dedu_labr_incm_amt", rec.dedu_labr_incm_amt);
			rx.add(record, "dedu_incm_tax", rec.dedu_incm_tax);
			rx.add(record, "dedu_farm_spc_tax", rec.dedu_farm_spc_tax);
			rx.add(record, "dedu_res_tax", rec.dedu_res_tax);
			rx.add(record, "dedu_tax_stot", rec.dedu_tax_stot);
			rx.add(record, "rvrs_prd_frdt", rec.rvrs_prd_frdt);
			rx.add(record, "rvrs_prd_todt", rec.rvrs_prd_todt);
			rx.add(record, "redu_prd_frdt", rec.redu_prd_frdt);
			rx.add(record, "redu_prd_todt", rec.redu_prd_todt);
			rx.add(record, "spc_dduc_won_li_amt", rec.spc_dduc_won_li_amt);
			rx.add(record, "spc_dduc_mogg_loan_amt", rec.spc_dduc_mogg_loan_amt);
			//rx.add(record, "labr_incm_impt_amt", StringUtil.replaceToXml(rec.labr_incm_impt_amt));
			//rx.add(record, "labr_incm_dduc", StringUtil.replaceToXml(rec.labr_incm_dduc));
			//rx.add(record, "labr_incm_amt", StringUtil.replaceToXml(rec.labr_incm_amt));
			//rx.add(record, "base_dduc_slf", StringUtil.replaceToXml(rec.base_dduc_slf));
			//rx.add(record, "base_dduc_spos", StringUtil.replaceToXml(rec.base_dduc_spos));
			//rx.add(record, "base_dduc_child", StringUtil.replaceToXml(rec.base_dduc_child));
			//rx.add(record, "base_dduc_oldg", StringUtil.replaceToXml(rec.base_dduc_oldg));
			//rx.add(record, "faml_nops", StringUtil.replaceToXml(rec.faml_nops));
			//rx.add(record, "addm_dduc_rspc", StringUtil.replaceToXml(rec.addm_dduc_rspc));
			//rx.add(record, "rspc_nops", StringUtil.replaceToXml(rec.rspc_nops));
			//rx.add(record, "addm_dduc_obcl_pers", StringUtil.replaceToXml(rec.addm_dduc_obcl_pers));
			//rx.add(record, "obcl_pers_nops", StringUtil.replaceToXml(rec.obcl_pers_nops));
			//rx.add(record, "addm_dduc_fml_hshd", StringUtil.replaceToXml(rec.addm_dduc_fml_hshd));
			//rx.add(record, "addm_dduc_care_fee", StringUtil.replaceToXml(rec.addm_dduc_care_fee));
			//rx.add(record, "child_care_fee_nops", StringUtil.replaceToXml(rec.child_care_fee_nops));
			//rx.add(record, "adopt_dduc", StringUtil.replaceToXml(rec.adopt_dduc));
			//rx.add(record, "adopt_dduc_nops", StringUtil.replaceToXml(rec.adopt_dduc_nops));
			//rx.add(record, "multi_child_addm_dduc", StringUtil.replaceToXml(rec.multi_child_addm_dduc));
			//rx.add(record, "multi_child_nops", StringUtil.replaceToXml(rec.multi_child_nops));
			//rx.add(record, "pens_savg_incm_dduc", StringUtil.replaceToXml(rec.pens_savg_incm_dduc));
			//rx.add(record, "np_insr_fee_dduc", StringUtil.replaceToXml(rec.np_insr_fee_dduc));
			//rx.add(record, "spc_dduc_insr_fee", StringUtil.replaceToXml(rec.spc_dduc_insr_fee));
			//rx.add(record, "spc_dduc_hosp_fee", StringUtil.replaceToXml(rec.spc_dduc_hosp_fee));
			//rx.add(record, "spc_dduc_edu_fee", StringUtil.replaceToXml(rec.spc_dduc_edu_fee));
			//rx.add(record, "spc_dduc_hous_fund", StringUtil.replaceToXml(rec.spc_dduc_hous_fund));
			//rx.add(record, "spc_dduc_dona_amt", StringUtil.replaceToXml(rec.spc_dduc_dona_amt));
			//rx.add(record, "spc_dduc_wedd_etc", StringUtil.replaceToXml(rec.spc_dduc_wedd_etc));
			//rx.add(record, "spc_dduc_stot", StringUtil.replaceToXml(rec.spc_dduc_stot));
			//rx.add(record, "std_dduc_amt", StringUtil.replaceToXml(rec.std_dduc_amt));
			//rx.add(record, "crdt_card_use_amt", StringUtil.replaceToXml(rec.crdt_card_use_amt));
			//rx.add(record, "vent_invsm_1", StringUtil.replaceToXml(rec.vent_invsm_1));
			//rx.add(record, "vent_invsm_2", StringUtil.replaceToXml(rec.vent_invsm_2));
			//rx.add(record, "stock_save", StringUtil.replaceToXml(rec.stock_save));
			//rx.add(record, "tax_rl_dduc_prsn_pens", StringUtil.replaceToXml(rec.tax_rl_dduc_prsn_pens));
			//rx.add(record, "tax_rl_dduc_tech_manpwr", StringUtil.replaceToXml(rec.tax_rl_dduc_tech_manpwr));
			//rx.add(record, "tax_rl_dduc_etc", StringUtil.replaceToXml(rec.tax_rl_dduc_etc));
			//rx.add(record, "txn_std_amt", StringUtil.replaceToXml(rec.txn_std_amt));
			//rx.add(record, "calc_incm_tax", StringUtil.replaceToXml(rec.calc_incm_tax));
			//rx.add(record, "tax_amt_dduc_labr_incm", StringUtil.replaceToXml(rec.tax_amt_dduc_labr_incm));
			//rx.add(record, "tax_amt_dduc_forn_pymt", StringUtil.replaceToXml(rec.tax_amt_dduc_forn_pymt));
			//rx.add(record, "tax_amt_dduc_hous_loan_amt_int", StringUtil.replaceToXml(rec.tax_amt_dduc_hous_loan_amt_int));
			//rx.add(record, "tax_amt_dduc_stok_savg", StringUtil.replaceToXml(rec.tax_amt_dduc_stok_savg));
			//rx.add(record, "tax_amt_dduc_savg", StringUtil.replaceToXml(rec.tax_amt_dduc_savg));
			//rx.add(record, "tax_amt_dduc_hous_fund", StringUtil.replaceToXml(rec.tax_amt_dduc_hous_fund));
			//rx.add(record, "tax_amt_dduc_ltrm_savg", StringUtil.replaceToXml(rec.tax_amt_dduc_ltrm_savg));
			//rx.add(record, "tax_amt_dduc_polt_fund", StringUtil.replaceToXml(rec.tax_amt_dduc_polt_fund));
			//rx.add(record, "tax_amt_dduc_etc", StringUtil.replaceToXml(rec.tax_amt_dduc_etc));
			//rx.add(record, "tax_amt_dduc_stot", StringUtil.replaceToXml(rec.tax_amt_dduc_stot));
			//rx.add(record, "tax_amt_redu_incm_tax_law", StringUtil.replaceToXml(rec.tax_amt_redu_incm_tax_law));
			//rx.add(record, "tax_amt_redu_tax_rl", StringUtil.replaceToXml(rec.tax_amt_redu_tax_rl));
			//rx.add(record, "tax_amt_redu_etc", StringUtil.replaceToXml(rec.tax_amt_redu_etc));
			//rx.add(record, "tax_amt_redu_stot", StringUtil.replaceToXml(rec.tax_amt_redu_stot));
			//rx.add(record, "deci_incm_tax", StringUtil.replaceToXml(rec.deci_incm_tax));
			//rx.add(record, "deci_farm_spc_tax", StringUtil.replaceToXml(rec.deci_farm_spc_tax));
			//rx.add(record, "deci_res_tax", StringUtil.replaceToXml(rec.deci_res_tax));
			//rx.add(record, "deci_tax_stot", StringUtil.replaceToXml(rec.deci_tax_stot));
			//rx.add(record, "befo_pymt_incm_tax", StringUtil.replaceToXml(rec.befo_pymt_incm_tax));
			//rx.add(record, "befo_pymt_farm_spc_tax", StringUtil.replaceToXml(rec.befo_pymt_farm_spc_tax));
			//rx.add(record, "befo_pymt_res_tax", StringUtil.replaceToXml(rec.befo_pymt_res_tax));
			//rx.add(record, "befo_pymt_tax_stot", StringUtil.replaceToXml(rec.befo_pymt_tax_stot));
			//rx.add(record, "now_pymt_incm_tax", StringUtil.replaceToXml(rec.now_pymt_incm_tax));
			//rx.add(record, "now_pymt_farm_spc_tax", StringUtil.replaceToXml(rec.now_pymt_farm_spc_tax));
			//rx.add(record, "now_pymt_res_tax", StringUtil.replaceToXml(rec.now_pymt_res_tax));
			//rx.add(record, "now_pymt_tax_stot", StringUtil.replaceToXml(rec.now_pymt_tax_stot));
			//rx.add(record, "dedu_labr_incm_amt", StringUtil.replaceToXml(rec.dedu_labr_incm_amt));
			//rx.add(record, "dedu_incm_tax", StringUtil.replaceToXml(rec.dedu_incm_tax));
			//rx.add(record, "dedu_farm_spc_tax", StringUtil.replaceToXml(rec.dedu_farm_spc_tax));
			//rx.add(record, "dedu_res_tax", StringUtil.replaceToXml(rec.dedu_res_tax));
			//rx.add(record, "dedu_tax_stot", StringUtil.replaceToXml(rec.dedu_tax_stot));
			//rx.add(record, "rvrs_prd_frdt", StringUtil.replaceToXml(rec.rvrs_prd_frdt));
			//rx.add(record, "rvrs_prd_todt", StringUtil.replaceToXml(rec.rvrs_prd_todt));
			//rx.add(record, "redu_prd_frdt", StringUtil.replaceToXml(rec.redu_prd_frdt));
			//rx.add(record, "redu_prd_todt", StringUtil.replaceToXml(rec.redu_prd_todt));
			//rx.add(record, "spc_dduc_won_li_amt", StringUtil.replaceToXml(rec.spc_dduc_won_li_amt));
			//rx.add(record, "spc_dduc_mogg_loan_amt", StringUtil.replaceToXml(rec.spc_dduc_mogg_loan_amt));
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
<hd_yadjm_1500_l>
	<dataSet>
		<CURLIST>
			<record>
				<labr_incm_impt_amt/>
				<labr_incm_dduc/>
				<labr_incm_amt/>
				<base_dduc_slf/>
				<base_dduc_spos/>
				<base_dduc_child/>
				<base_dduc_oldg/>
				<faml_nops/>
				<addm_dduc_rspc/>
				<rspc_nops/>
				<addm_dduc_obcl_pers/>
				<obcl_pers_nops/>
				<addm_dduc_fml_hshd/>
				<addm_dduc_care_fee/>
				<child_care_fee_nops/>
				<adopt_dduc/>
				<adopt_dduc_nops/>
				<multi_child_addm_dduc/>
				<multi_child_nops/>
				<pens_savg_incm_dduc/>
				<np_insr_fee_dduc/>
				<spc_dduc_insr_fee/>
				<spc_dduc_hosp_fee/>
				<spc_dduc_edu_fee/>
				<spc_dduc_hous_fund/>
				<spc_dduc_dona_amt/>
				<spc_dduc_wedd_etc/>
				<spc_dduc_stot/>
				<std_dduc_amt/>
				<crdt_card_use_amt/>
				<vent_invsm_1/>
				<vent_invsm_2/>
				<stock_save/>
				<tax_rl_dduc_prsn_pens/>
				<tax_rl_dduc_tech_manpwr/>
				<tax_rl_dduc_etc/>
				<txn_std_amt/>
				<calc_incm_tax/>
				<tax_amt_dduc_labr_incm/>
				<tax_amt_dduc_forn_pymt/>
				<tax_amt_dduc_hous_loan_amt_int/>
				<tax_amt_dduc_stok_savg/>
				<tax_amt_dduc_savg/>
				<tax_amt_dduc_hous_fund/>
				<tax_amt_dduc_ltrm_savg/>
				<tax_amt_dduc_polt_fund/>
				<tax_amt_dduc_etc/>
				<tax_amt_dduc_stot/>
				<tax_amt_redu_incm_tax_law/>
				<tax_amt_redu_tax_rl/>
				<tax_amt_redu_etc/>
				<tax_amt_redu_stot/>
				<deci_incm_tax/>
				<deci_farm_spc_tax/>
				<deci_res_tax/>
				<deci_tax_stot/>
				<befo_pymt_incm_tax/>
				<befo_pymt_farm_spc_tax/>
				<befo_pymt_res_tax/>
				<befo_pymt_tax_stot/>
				<now_pymt_incm_tax/>
				<now_pymt_farm_spc_tax/>
				<now_pymt_res_tax/>
				<now_pymt_tax_stot/>
				<dedu_labr_incm_amt/>
				<dedu_incm_tax/>
				<dedu_farm_spc_tax/>
				<dedu_res_tax/>
				<dedu_tax_stot/>
				<rvrs_prd_frdt/>
				<rvrs_prd_todt/>
				<redu_prd_frdt/>
				<redu_prd_todt/>
				<spc_dduc_won_li_amt/>
				<spc_dduc_mogg_loan_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_1500_l>
*/
%>

<% /* 작성시간 : Mon Jan 18 09:14:01 KST 2010 */ %>