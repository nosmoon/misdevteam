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
	HD_SALY_5002_2006_LDataSet ds = (HD_SALY_5002_2006_LDataSet)request.getAttribute("ds");
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
			HD_SALY_5002_2006_LCURLISTRecord rec = (HD_SALY_5002_2006_LCURLISTRecord)ds.curlist.get(i);
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
			rx.add(record, "evngt_saly", rec.evngt_saly);
			rx.add(record, "supl_saly", rec.supl_saly);
			rx.add(record, "trff_alon", rec.trff_alon);
			rx.add(record, "treat_add_amt", rec.treat_add_amt);
			rx.add(record, "month_amt", rec.month_amt);
			rx.add(record, "year_amt", rec.year_amt);
			rx.add(record, "week_hody_base_alon", rec.week_hody_base_alon);
			rx.add(record, "week_hody_cmpn_alon", rec.week_hody_cmpn_alon);
			rx.add(record, "lgl_hody_alon", rec.lgl_hody_alon);
			rx.add(record, "nissu_dd_alon", rec.nissu_dd_alon);
			rx.add(record, "vgl_fee", rec.vgl_fee);
			rx.add(record, "ovt_alon", rec.ovt_alon);
			rx.add(record, "corr_base_stay_fee", rec.corr_base_stay_fee);
			rx.add(record, "prvmm_mstk_saly", rec.prvmm_mstk_saly);
			rx.add(record, "prvmm_mstk_dduc", rec.prvmm_mstk_dduc);
			rx.add(record, "yymm_alon", rec.yymm_alon);
			rx.add(record, "retr_saly", rec.retr_saly);
			rx.add(record, "tot_pay_saly", rec.tot_pay_saly);
			rx.add(record, "deci_incm_tax", rec.deci_incm_tax);
			rx.add(record, "deci_res_tax", rec.deci_res_tax);
			rx.add(record, "hlth_insr_fee", rec.hlth_insr_fee);
			rx.add(record, "np_slf_ctrb_amt", rec.np_slf_ctrb_amt);
			rx.add(record, "emp_insr_fee", rec.emp_insr_fee);
			rx.add(record, "jnl_lon", rec.jnl_lon);
			rx.add(record, "welf_lon", rec.welf_lon);
			rx.add(record, "vgl_fee_tm", rec.vgl_fee_tm);
			rx.add(record, "ovt_alon_tm", rec.ovt_alon_tm);
			rx.add(record, "corr_base_stay_fee_tm", rec.corr_base_stay_fee_tm);
			rx.add(record, "paty_crc_dduc_amt", rec.paty_crc_dduc_amt);
			rx.add(record, "fitness_amt", rec.fitness_amt);
			rx.add(record, "labor_dduc_amt", rec.labor_dduc_amt);
			rx.add(record, "park_fee_dduc", rec.park_fee_dduc);
			rx.add(record, "adv_dduc", rec.adv_dduc);
			rx.add(record, "seiz_dduc_amt", rec.seiz_dduc_amt);
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
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "shft_bank_nm", StringUtil.replaceToXml(rec.shft_bank_nm));
			//rx.add(record, "shft_acct_no", StringUtil.replaceToXml(rec.shft_acct_no));
			//rx.add(record, "saly_pay_dt", StringUtil.replaceToXml(rec.saly_pay_dt));
			//rx.add(record, "base_saly", StringUtil.replaceToXml(rec.base_saly));
			//rx.add(record, "posk_saly", StringUtil.replaceToXml(rec.posk_saly));
			//rx.add(record, "evngt_saly", StringUtil.replaceToXml(rec.evngt_saly));
			//rx.add(record, "supl_saly", StringUtil.replaceToXml(rec.supl_saly));
			//rx.add(record, "trff_alon", StringUtil.replaceToXml(rec.trff_alon));
			//rx.add(record, "treat_add_amt", StringUtil.replaceToXml(rec.treat_add_amt));
			//rx.add(record, "month_amt", StringUtil.replaceToXml(rec.month_amt));
			//rx.add(record, "year_amt", StringUtil.replaceToXml(rec.year_amt));
			//rx.add(record, "week_hody_base_alon", StringUtil.replaceToXml(rec.week_hody_base_alon));
			//rx.add(record, "week_hody_cmpn_alon", StringUtil.replaceToXml(rec.week_hody_cmpn_alon));
			//rx.add(record, "lgl_hody_alon", StringUtil.replaceToXml(rec.lgl_hody_alon));
			//rx.add(record, "nissu_dd_alon", StringUtil.replaceToXml(rec.nissu_dd_alon));
			//rx.add(record, "vgl_fee", StringUtil.replaceToXml(rec.vgl_fee));
			//rx.add(record, "ovt_alon", StringUtil.replaceToXml(rec.ovt_alon));
			//rx.add(record, "corr_base_stay_fee", StringUtil.replaceToXml(rec.corr_base_stay_fee));
			//rx.add(record, "prvmm_mstk_saly", StringUtil.replaceToXml(rec.prvmm_mstk_saly));
			//rx.add(record, "prvmm_mstk_dduc", StringUtil.replaceToXml(rec.prvmm_mstk_dduc));
			//rx.add(record, "yymm_alon", StringUtil.replaceToXml(rec.yymm_alon));
			//rx.add(record, "retr_saly", StringUtil.replaceToXml(rec.retr_saly));
			//rx.add(record, "tot_pay_saly", StringUtil.replaceToXml(rec.tot_pay_saly));
			//rx.add(record, "deci_incm_tax", StringUtil.replaceToXml(rec.deci_incm_tax));
			//rx.add(record, "deci_res_tax", StringUtil.replaceToXml(rec.deci_res_tax));
			//rx.add(record, "hlth_insr_fee", StringUtil.replaceToXml(rec.hlth_insr_fee));
			//rx.add(record, "np_slf_ctrb_amt", StringUtil.replaceToXml(rec.np_slf_ctrb_amt));
			//rx.add(record, "emp_insr_fee", StringUtil.replaceToXml(rec.emp_insr_fee));
			//rx.add(record, "jnl_lon", StringUtil.replaceToXml(rec.jnl_lon));
			//rx.add(record, "welf_lon", StringUtil.replaceToXml(rec.welf_lon));
			//rx.add(record, "vgl_fee_tm", StringUtil.replaceToXml(rec.vgl_fee_tm));
			//rx.add(record, "ovt_alon_tm", StringUtil.replaceToXml(rec.ovt_alon_tm));
			//rx.add(record, "corr_base_stay_fee_tm", StringUtil.replaceToXml(rec.corr_base_stay_fee_tm));
			//rx.add(record, "paty_crc_dduc_amt", StringUtil.replaceToXml(rec.paty_crc_dduc_amt));
			//rx.add(record, "fitness_amt", StringUtil.replaceToXml(rec.fitness_amt));
			//rx.add(record, "labor_dduc_amt", StringUtil.replaceToXml(rec.labor_dduc_amt));
			//rx.add(record, "park_fee_dduc", StringUtil.replaceToXml(rec.park_fee_dduc));
			//rx.add(record, "adv_dduc", StringUtil.replaceToXml(rec.adv_dduc));
			//rx.add(record, "seiz_dduc_amt", StringUtil.replaceToXml(rec.seiz_dduc_amt));
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
<hd_saly_5002_2006_l>
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
				<base_saly/>
				<posk_saly/>
				<evngt_saly/>
				<supl_saly/>
				<trff_alon/>
				<treat_add_amt/>
				<month_amt/>
				<year_amt/>
				<week_hody_base_alon/>
				<week_hody_cmpn_alon/>
				<lgl_hody_alon/>
				<nissu_dd_alon/>
				<vgl_fee/>
				<ovt_alon/>
				<corr_base_stay_fee/>
				<prvmm_mstk_saly/>
				<prvmm_mstk_dduc/>
				<yymm_alon/>
				<retr_saly/>
				<tot_pay_saly/>
				<deci_incm_tax/>
				<deci_res_tax/>
				<hlth_insr_fee/>
				<np_slf_ctrb_amt/>
				<emp_insr_fee/>
				<jnl_lon/>
				<welf_lon/>
				<vgl_fee_tm/>
				<ovt_alon_tm/>
				<corr_base_stay_fee_tm/>
				<paty_crc_dduc_amt/>
				<fitness_amt/>
				<labor_dduc_amt/>
				<park_fee_dduc/>
				<adv_dduc/>
				<seiz_dduc_amt/>
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
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_5002_2006_l>
*/
%>

<% /* 작성시간 : Mon Apr 08 18:05:19 KST 2013 */ %>