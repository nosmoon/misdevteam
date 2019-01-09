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
	HD_SALY_5002_322_LDataSet ds = (HD_SALY_5002_322_LDataSet)request.getAttribute("ds");
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
			HD_SALY_5002_322_LCURLISTRecord rec = (HD_SALY_5002_322_LCURLISTRecord)ds.curlist.get(i);
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
			rx.add(record, "dty_alon", rec.dty_alon);
			rx.add(record, "posk_alon", rec.posk_alon);
			rx.add(record, "ovt_alon", rec.ovt_alon);
			rx.add(record, "month_amt", rec.month_amt);
			rx.add(record, "year_amt", rec.year_amt);
			rx.add(record, "corr_base_stay_fee", rec.corr_base_stay_fee);
			rx.add(record, "prvmm_mstk_saly", rec.prvmm_mstk_saly);
			rx.add(record, "prvmm_mstk_dduc", rec.prvmm_mstk_dduc);
			rx.add(record, "yymm_alon", rec.yymm_alon);
			rx.add(record, "retr_saly", rec.retr_saly);
			rx.add(record, "tot_pay_saly", rec.tot_pay_saly);
			rx.add(record, "hlth_insr_fee", rec.hlth_insr_fee);
			rx.add(record, "np_slf_ctrb_amt", rec.np_slf_ctrb_amt);
			rx.add(record, "emp_insr_fee", rec.emp_insr_fee);
			rx.add(record, "vgl_fee_tm", rec.vgl_fee_tm);
			rx.add(record, "ovt_alon_tm", rec.ovt_alon_tm);
			rx.add(record, "corr_base_stay_fee_tm", rec.corr_base_stay_fee_tm);
			rx.add(record, "etc_dduc_amt", rec.etc_dduc_amt);
			rx.add(record, "deci_incm_tax", rec.deci_incm_tax);
			rx.add(record, "deci_res_tax", rec.deci_res_tax);
			rx.add(record, "deci_farm_spc_tax", rec.deci_farm_spc_tax);
			rx.add(record, "adjm_dedu_incm_tax", rec.adjm_dedu_incm_tax);
			rx.add(record, "adjm_dedu_res_tax", rec.adjm_dedu_res_tax);
			rx.add(record, "adjm_dedu_farm_spc_tax", rec.adjm_dedu_farm_spc_tax);
			rx.add(record, "saly_dduc_stot", rec.saly_dduc_stot);
			rx.add(record, "cal_pay_amt", rec.cal_pay_amt);
			rx.add(record, "emp_clsf", rec.emp_clsf);
			rx.add(record, "care_alon", rec.care_alon);
			rx.add(record, "food_alon", rec.food_alon);
			rx.add(record, "lang_study_splamt", rec.lang_study_splamt);
			rx.add(record, "rslt_alon", rec.rslt_alon);
			rx.add(record, "scl_exps_alon", rec.scl_exps_alon);
			rx.add(record, "etc_alon", rec.etc_alon);
			rx.add(record, "anvy_pay_fee", rec.anvy_pay_fee);
			rx.add(record, "rslt_alon_exst_pay", rec.rslt_alon_exst_pay);
			rx.add(record, "sply_chk_fee", rec.sply_chk_fee);
			rx.add(record, "etc_alon_exst_pay", rec.etc_alon_exst_pay);
			rx.add(record, "scl_exps_alon_exst_pay", rec.scl_exps_alon_exst_pay);
			rx.add(record, "rdr_extn_alon", rec.rdr_extn_alon);
			rx.add(record, "vaca_fee", rec.vaca_fee);
			rx.add(record, "park_vilt_sply_fee", rec.park_vilt_sply_fee);
			rx.add(record, "clamt_alon", rec.clamt_alon);
			rx.add(record, "prz_fee", rec.prz_fee);
			rx.add(record, "hody_duty_alon", rec.hody_duty_alon);
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
			//rx.add(record, "dty_alon", StringUtil.replaceToXml(rec.dty_alon));
			//rx.add(record, "posk_alon", StringUtil.replaceToXml(rec.posk_alon));
			//rx.add(record, "ovt_alon", StringUtil.replaceToXml(rec.ovt_alon));
			//rx.add(record, "month_amt", StringUtil.replaceToXml(rec.month_amt));
			//rx.add(record, "year_amt", StringUtil.replaceToXml(rec.year_amt));
			//rx.add(record, "corr_base_stay_fee", StringUtil.replaceToXml(rec.corr_base_stay_fee));
			//rx.add(record, "prvmm_mstk_saly", StringUtil.replaceToXml(rec.prvmm_mstk_saly));
			//rx.add(record, "prvmm_mstk_dduc", StringUtil.replaceToXml(rec.prvmm_mstk_dduc));
			//rx.add(record, "yymm_alon", StringUtil.replaceToXml(rec.yymm_alon));
			//rx.add(record, "retr_saly", StringUtil.replaceToXml(rec.retr_saly));
			//rx.add(record, "tot_pay_saly", StringUtil.replaceToXml(rec.tot_pay_saly));
			//rx.add(record, "hlth_insr_fee", StringUtil.replaceToXml(rec.hlth_insr_fee));
			//rx.add(record, "np_slf_ctrb_amt", StringUtil.replaceToXml(rec.np_slf_ctrb_amt));
			//rx.add(record, "emp_insr_fee", StringUtil.replaceToXml(rec.emp_insr_fee));
			//rx.add(record, "vgl_fee_tm", StringUtil.replaceToXml(rec.vgl_fee_tm));
			//rx.add(record, "ovt_alon_tm", StringUtil.replaceToXml(rec.ovt_alon_tm));
			//rx.add(record, "corr_base_stay_fee_tm", StringUtil.replaceToXml(rec.corr_base_stay_fee_tm));
			//rx.add(record, "etc_dduc_amt", StringUtil.replaceToXml(rec.etc_dduc_amt));
			//rx.add(record, "deci_incm_tax", StringUtil.replaceToXml(rec.deci_incm_tax));
			//rx.add(record, "deci_res_tax", StringUtil.replaceToXml(rec.deci_res_tax));
			//rx.add(record, "deci_farm_spc_tax", StringUtil.replaceToXml(rec.deci_farm_spc_tax));
			//rx.add(record, "adjm_dedu_incm_tax", StringUtil.replaceToXml(rec.adjm_dedu_incm_tax));
			//rx.add(record, "adjm_dedu_res_tax", StringUtil.replaceToXml(rec.adjm_dedu_res_tax));
			//rx.add(record, "adjm_dedu_farm_spc_tax", StringUtil.replaceToXml(rec.adjm_dedu_farm_spc_tax));
			//rx.add(record, "saly_dduc_stot", StringUtil.replaceToXml(rec.saly_dduc_stot));
			//rx.add(record, "cal_pay_amt", StringUtil.replaceToXml(rec.cal_pay_amt));
			//rx.add(record, "emp_clsf", StringUtil.replaceToXml(rec.emp_clsf));
			//rx.add(record, "care_alon", StringUtil.replaceToXml(rec.care_alon));
			//rx.add(record, "food_alon", StringUtil.replaceToXml(rec.food_alon));
			//rx.add(record, "lang_study_splamt", StringUtil.replaceToXml(rec.lang_study_splamt));
			//rx.add(record, "rslt_alon", StringUtil.replaceToXml(rec.rslt_alon));
			//rx.add(record, "scl_exps_alon", StringUtil.replaceToXml(rec.scl_exps_alon));
			//rx.add(record, "etc_alon", StringUtil.replaceToXml(rec.etc_alon));
			//rx.add(record, "anvy_pay_fee", StringUtil.replaceToXml(rec.anvy_pay_fee));
			//rx.add(record, "rslt_alon_exst_pay", StringUtil.replaceToXml(rec.rslt_alon_exst_pay));
			//rx.add(record, "sply_chk_fee", StringUtil.replaceToXml(rec.sply_chk_fee));
			//rx.add(record, "etc_alon_exst_pay", StringUtil.replaceToXml(rec.etc_alon_exst_pay));
			//rx.add(record, "scl_exps_alon_exst_pay", StringUtil.replaceToXml(rec.scl_exps_alon_exst_pay));
			//rx.add(record, "rdr_extn_alon", StringUtil.replaceToXml(rec.rdr_extn_alon));
			//rx.add(record, "vaca_fee", StringUtil.replaceToXml(rec.vaca_fee));
			//rx.add(record, "park_vilt_sply_fee", StringUtil.replaceToXml(rec.park_vilt_sply_fee));
			//rx.add(record, "clamt_alon", StringUtil.replaceToXml(rec.clamt_alon));
			//rx.add(record, "prz_fee", StringUtil.replaceToXml(rec.prz_fee));
			//rx.add(record, "hody_duty_alon", StringUtil.replaceToXml(rec.hody_duty_alon));
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
<hd_saly_5002_322_l>
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
				<dty_alon/>
				<posk_alon/>
				<ovt_alon/>
				<month_amt/>
				<year_amt/>
				<corr_base_stay_fee/>
				<prvmm_mstk_saly/>
				<prvmm_mstk_dduc/>
				<yymm_alon/>
				<retr_saly/>
				<tot_pay_saly/>
				<hlth_insr_fee/>
				<np_slf_ctrb_amt/>
				<emp_insr_fee/>
				<vgl_fee_tm/>
				<ovt_alon_tm/>
				<corr_base_stay_fee_tm/>
				<etc_dduc_amt/>
				<deci_incm_tax/>
				<deci_res_tax/>
				<deci_farm_spc_tax/>
				<adjm_dedu_incm_tax/>
				<adjm_dedu_res_tax/>
				<adjm_dedu_farm_spc_tax/>
				<saly_dduc_stot/>
				<cal_pay_amt/>
				<emp_clsf/>
				<care_alon/>
				<food_alon/>
				<lang_study_splamt/>
				<rslt_alon/>
				<scl_exps_alon/>
				<etc_alon/>
				<anvy_pay_fee/>
				<rslt_alon_exst_pay/>
				<sply_chk_fee/>
				<etc_alon_exst_pay/>
				<scl_exps_alon_exst_pay/>
				<rdr_extn_alon/>
				<vaca_fee/>
				<park_vilt_sply_fee/>
				<clamt_alon/>
				<prz_fee/>
				<hody_duty_alon/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_5002_322_l>
*/
%>

<% /* 작성시간 : Thu Jul 12 10:54:04 KST 2012 */ %>