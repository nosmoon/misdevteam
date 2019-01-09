<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_5002_334_LDataSet ds = (HD_SALY_5002_334_LDataSet)request.getAttribute("ds");
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
			HD_SALY_5002_334_LCURLISTRecord rec = (HD_SALY_5002_334_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "shft_bank_nm", rec.shft_bank_nm);
			rx.add(record, "shft_acct_no", rec.shft_acct_no);
			rx.add(record, "saly_pay_dt", rec.saly_pay_dt);
			rx.add(record, "base_saly", rec.base_saly);
			rx.add(record, "posk_saly", rec.posk_saly);
			rx.add(record, "bns_saly", rec.bns_saly);
			rx.add(record, "month_amt", rec.month_amt);
			rx.add(record, "year_amt", rec.year_amt);
			rx.add(record, "non_tax_food_alon", rec.non_tax_food_alon);
			rx.add(record, "non_tax_auto_driv_alon", rec.non_tax_auto_driv_alon);
			rx.add(record, "non_tax_jrnst", rec.non_tax_jrnst);
			rx.add(record, "evngt_saly", rec.evngt_saly);
			rx.add(record, "congr_fee", rec.congr_fee);
			rx.add(record, "etc_alon_saly", rec.etc_alon_saly);
			rx.add(record, "hody_duty_alon", rec.hody_duty_alon);
			rx.add(record, "welfare_fee", rec.welfare_fee);
			rx.add(record, "yymm_alon", rec.yymm_alon);
			rx.add(record, "prvmm_mstk_saly", rec.prvmm_mstk_saly);
			rx.add(record, "retr_saly", rec.retr_saly);
			rx.add(record, "tot_pay_saly", rec.tot_pay_saly);
			rx.add(record, "deci_incm_tax", rec.deci_incm_tax);
			rx.add(record, "deci_res_tax", rec.deci_res_tax);
			rx.add(record, "hlth_insr_fee", rec.hlth_insr_fee);
			rx.add(record, "np_slf_ctrb_amt", rec.np_slf_ctrb_amt);
			rx.add(record, "emp_insr_fee", rec.emp_insr_fee);
			rx.add(record, "jnl_lon", rec.jnl_lon);
			rx.add(record, "repay_scl_exps", rec.repay_scl_exps);
			rx.add(record, "hlth_insr_med_care_insr_fee", rec.hlth_insr_med_care_insr_fee);
			rx.add(record, "hlth_insr_fee_adjm", rec.hlth_insr_fee_adjm);
			rx.add(record, "crc_dus_tot", rec.crc_dus_tot);
			rx.add(record, "etc_dduc_amt", rec.etc_dduc_amt);
			rx.add(record, "adjm_dedu_incm_tax", rec.adjm_dedu_incm_tax);
			rx.add(record, "adjm_dedu_res_tax", rec.adjm_dedu_res_tax);
			rx.add(record, "adjm_dedu_farm_spc_tax", rec.adjm_dedu_farm_spc_tax);
			rx.add(record, "saly_dduc_stot", rec.saly_dduc_stot);
			rx.add(record, "cal_pay_amt", rec.cal_pay_amt);
			rx.add(record, "emp_clsf", rec.emp_clsf);
			rx.add(record, "etcsaly_spc", rec.etcsaly_spc);
			rx.add(record, "prsn_pens_dduc", rec.prsn_pens_dduc);
			rx.add(record, "etc_dduc_remk", rec.etc_dduc_remk);
			rx.add(record, "adpay_amt", rec.adpay_amt);
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "shft_bank_nm", StringUtil.replaceToXml(rec.shft_bank_nm));
			//rx.add(record, "shft_acct_no", StringUtil.replaceToXml(rec.shft_acct_no));
			//rx.add(record, "saly_pay_dt", StringUtil.replaceToXml(rec.saly_pay_dt));
			//rx.add(record, "bvarchar2e_saly", StringUtil.replaceToXml(rec.bvarchar2e_saly));
			//rx.add(record, "posk_saly", StringUtil.replaceToXml(rec.posk_saly));
			//rx.add(record, "bns_saly", StringUtil.replaceToXml(rec.bns_saly));
			//rx.add(record, "month_amt", StringUtil.replaceToXml(rec.month_amt));
			//rx.add(record, "year_amt", StringUtil.replaceToXml(rec.year_amt));
			//rx.add(record, "non_tax_food_alon", StringUtil.replaceToXml(rec.non_tax_food_alon));
			//rx.add(record, "non_tax_auto_driv_alon", StringUtil.replaceToXml(rec.non_tax_auto_driv_alon));
			//rx.add(record, "non_tax_jrnst", StringUtil.replaceToXml(rec.non_tax_jrnst));
			//rx.add(record, "evngt_saly", StringUtil.replaceToXml(rec.evngt_saly));
			//rx.add(record, "congr_fee", StringUtil.replaceToXml(rec.congr_fee));
			//rx.add(record, "etc_alon_saly", StringUtil.replaceToXml(rec.etc_alon_saly));
			//rx.add(record, "hody_duty_alon", StringUtil.replaceToXml(rec.hody_duty_alon));
			//rx.add(record, "welfare_fee", StringUtil.replaceToXml(rec.welfare_fee));
			//rx.add(record, "yymm_alon", StringUtil.replaceToXml(rec.yymm_alon));
			//rx.add(record, "retr_saly", StringUtil.replaceToXml(rec.retr_saly));
			//rx.add(record, "tot_pay_saly", StringUtil.replaceToXml(rec.tot_pay_saly));
			//rx.add(record, "deci_incm_tax", StringUtil.replaceToXml(rec.deci_incm_tax));
			//rx.add(record, "deci_res_tax", StringUtil.replaceToXml(rec.deci_res_tax));
			//rx.add(record, "hlth_insr_fee", StringUtil.replaceToXml(rec.hlth_insr_fee));
			//rx.add(record, "np_slf_ctrb_amt", StringUtil.replaceToXml(rec.np_slf_ctrb_amt));
			//rx.add(record, "emp_insr_fee", StringUtil.replaceToXml(rec.emp_insr_fee));
			//rx.add(record, "jnl_lon", StringUtil.replaceToXml(rec.jnl_lon));
			//rx.add(record, "repay_scl_exps", StringUtil.replaceToXml(rec.repay_scl_exps));
			//rx.add(record, "hlth_insr_med_care_insr_fee", StringUtil.replaceToXml(rec.hlth_insr_med_care_insr_fee));
			//rx.add(record, "hlth_insr_fee_adjm", StringUtil.replaceToXml(rec.hlth_insr_fee_adjm));
			//rx.add(record, "paty_dus_tot", StringUtil.replaceToXml(rec.paty_dus_tot));
			//rx.add(record, "etc_dduc_amt", StringUtil.replaceToXml(rec.etc_dduc_amt));
			//rx.add(record, "adjm_dedu_incm_tax", StringUtil.replaceToXml(rec.adjm_dedu_incm_tax));
			//rx.add(record, "adjm_dedu_res_tax", StringUtil.replaceToXml(rec.adjm_dedu_res_tax));
			//rx.add(record, "adjm_dedu_farm_spc_tax", StringUtil.replaceToXml(rec.adjm_dedu_farm_spc_tax));
			//rx.add(record, "saly_dduc_stot", StringUtil.replaceToXml(rec.saly_dduc_stot));
			//rx.add(record, "cal_pay_amt", StringUtil.replaceToXml(rec.cal_pay_amt));
			//rx.add(record, "emp_clsf", StringUtil.replaceToXml(rec.emp_clsf));
			//rx.add(record, "etcsaly_spc", StringUtil.replaceToXml(rec.etcsaly_spc));
			//rx.add(record, "prsn_pens_dduc", StringUtil.replaceToXml(rec.prsn_pens_dduc));
			//rx.add(record, "etc_dduc_remk", StringUtil.replaceToXml(rec.etc_dduc_remk));
			//rx.add(record, "adpay_amt", StringUtil.replaceToXml(rec.adpay_amt));
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
<hd_saly_5002_334_l>
	<dataSet>
		<CURLIST>
			<record>
				<flnm/>
				<emp_no/>
				<dept_nm/>
				<posi_nm/>
				<shft_bank_nm/>
				<shft_acct_no/>
				<saly_pay_dt/>
				<bvarchar2e_saly/>
				<posk_saly/>
				<bns_saly/>
				<month_amt/>
				<year_amt/>
				<non_tax_food_alon/>
				<non_tax_auto_driv_alon/>
				<non_tax_jrnst/>
				<evngt_saly/>
				<congr_fee/>
				<etc_alon_saly/>
				<hody_duty_alon/>
				<welfare_fee/>
				<yymm_alon/>
				<retr_saly/>
				<tot_pay_saly/>
				<deci_incm_tax/>
				<deci_res_tax/>
				<hlth_insr_fee/>
				<np_slf_ctrb_amt/>
				<emp_insr_fee/>
				<jnl_lon/>
				<repay_scl_exps/>
				<hlth_insr_med_care_insr_fee/>
				<hlth_insr_fee_adjm/>
				<paty_dus_tot/>
				<etc_dduc_amt/>
				<adjm_dedu_incm_tax/>
				<adjm_dedu_res_tax/>
				<adjm_dedu_farm_spc_tax/>
				<saly_dduc_stot/>
				<cal_pay_amt/>
				<emp_clsf/>
				<etcsaly_spc/>
				<prsn_pens_dduc/>
				<etc_dduc_remk/>
				<adpay_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_5002_334_l>
*/
%>

<% /* 작성시간 : Mon Jun 09 11:42:10 KST 2014 */ %>