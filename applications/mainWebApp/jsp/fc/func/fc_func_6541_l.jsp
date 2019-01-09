<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_6541_LDataSet ds = (FC_FUNC_6541_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_6541_LCURLISTRecord rec = (FC_FUNC_6541_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "deps_isav_nm", rec.deps_isav_nm);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "tot_pymt_amt", rec.tot_pymt_amt);
			rx.add(record, "hy_cctr_dt", rec.hy_cctr_dt);
			rx.add(record, "hy_frex_cd", rec.hy_frex_cd);
			rx.add(record, "hy_exrate", rec.hy_exrate);
			rx.add(record, "hy_frex_amt", rec.hy_frex_amt);
			rx.add(record, "hy_impt_amt", rec.hy_impt_amt);
			rx.add(record, "hy_corp_tax_amt", rec.hy_corp_tax_amt);
			rx.add(record, "hy_def_tax_amt", rec.hy_def_tax_amt);
			rx.add(record, "hy_patr_budg_cd", rec.hy_patr_budg_cd);
			rx.add(record, "hy_deps_clsf_cd", rec.hy_deps_clsf_cd);
			rx.add(record, "hy_rmks", rec.hy_rmks);
			rx.add(record, "cancel_frex_cd", rec.cancel_frex_cd);
			rx.add(record, "cancel_exrate", rec.cancel_exrate);
			rx.add(record, "cancel_frex_amt", rec.cancel_frex_amt);
			rx.add(record, "cancel_won_pfls_amt", rec.cancel_won_pfls_amt);
			rx.add(record, "payment_frex_cd", rec.payment_frex_cd);
			rx.add(record, "payment_exrate", rec.payment_exrate);
			rx.add(record, "payment_frex_amt", rec.payment_frex_amt);
			rx.add(record, "payment_won_pfls_amt", rec.payment_won_pfls_amt);
			rx.add(record, "deps_isav_clsf_cd", rec.deps_isav_clsf_cd);
			rx.add(record, "deps_isav_no", rec.deps_isav_no);
			rx.add(record, "cost_gain_stot", rec.cost_gain_stot);
			rx.add(record, "rcpay_amt_stot", rec.rcpay_amt_stot);
			rx.add(record, "ijajanamt", rec.ijajanamt);
			rx.add(record, "prelae_pay_clsf_cd", rec.prelae_pay_clsf_cd);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "jpno", rec.jpno);
			rx.add(record, "deps_isav_stat_cdnm", rec.deps_isav_stat_cdnm);
			rx.add(record, "hy_yejpno", rec.hy_yejpno);
			rx.add(record, "hy_tot_int_amt", rec.hy_tot_int_amt);
			rx.add(record, "hy_unrcp_precpt_bal", rec.hy_unrcp_precpt_bal);
			rx.add(record, "int_rate", rec.int_rate);
			rx.add(record, "deps_isav_stat_cd", rec.deps_isav_stat_cd);
			rx.add(record, "cctr_dt", rec.cctr_dt);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "deps_isav_nm", StringUtil.replaceToXml(rec.deps_isav_nm));
			//rx.add(record, "compnm", StringUtil.replaceToXml(rec.compnm));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "tot_pymt_amt", StringUtil.replaceToXml(rec.tot_pymt_amt));
			//rx.add(record, "hy_cctr_dt", StringUtil.replaceToXml(rec.hy_cctr_dt));
			//rx.add(record, "hy_frex_cd", StringUtil.replaceToXml(rec.hy_frex_cd));
			//rx.add(record, "hy_exrate", StringUtil.replaceToXml(rec.hy_exrate));
			//rx.add(record, "hy_frex_amt", StringUtil.replaceToXml(rec.hy_frex_amt));
			//rx.add(record, "hy_impt_amt", StringUtil.replaceToXml(rec.hy_impt_amt));
			//rx.add(record, "hy_corp_tax_amt", StringUtil.replaceToXml(rec.hy_corp_tax_amt));
			//rx.add(record, "hy_patr_budg_cd", StringUtil.replaceToXml(rec.hy_patr_budg_cd));
			//rx.add(record, "hy_deps_clsf_cd", StringUtil.replaceToXml(rec.hy_deps_clsf_cd));
			//rx.add(record, "hy_rmks", StringUtil.replaceToXml(rec.hy_rmks));
			//rx.add(record, "cancel_frex_cd", StringUtil.replaceToXml(rec.cancel_frex_cd));
			//rx.add(record, "cancel_exrate", StringUtil.replaceToXml(rec.cancel_exrate));
			//rx.add(record, "cancel_frex_amt", StringUtil.replaceToXml(rec.cancel_frex_amt));
			//rx.add(record, "cancel_won_pfls_amt", StringUtil.replaceToXml(rec.cancel_won_pfls_amt));
			//rx.add(record, "payment_frex_cd", StringUtil.replaceToXml(rec.payment_frex_cd));
			//rx.add(record, "payment_exrate", StringUtil.replaceToXml(rec.payment_exrate));
			//rx.add(record, "payment_frex_amt", StringUtil.replaceToXml(rec.payment_frex_amt));
			//rx.add(record, "payment_won_pfls_amt", StringUtil.replaceToXml(rec.payment_won_pfls_amt));
			//rx.add(record, "deps_isav_clsf_cd", StringUtil.replaceToXml(rec.deps_isav_clsf_cd));
			//rx.add(record, "deps_isav_no", StringUtil.replaceToXml(rec.deps_isav_no));
			//rx.add(record, "cost_gain_stot", StringUtil.replaceToXml(rec.cost_gain_stot));
			//rx.add(record, "rcpay_amt_stot", StringUtil.replaceToXml(rec.rcpay_amt_stot));
			//rx.add(record, "ijajanamt", StringUtil.replaceToXml(rec.ijajanamt));
			//rx.add(record, "prelae_pay_clsf_cd", StringUtil.replaceToXml(rec.prelae_pay_clsf_cd));
			//rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			//rx.add(record, "jpno", StringUtil.replaceToXml(rec.jpno));
			//rx.add(record, "deps_isav_stat_cdnm", StringUtil.replaceToXml(rec.deps_isav_stat_cdnm));
			//rx.add(record, "hy_yejpno", StringUtil.replaceToXml(rec.hy_yejpno));
			//rx.add(record, "hy_tot_int_amt", StringUtil.replaceToXml(rec.hy_tot_int_amt));
			//rx.add(record, "hy_unrcp_precpt_bal", StringUtil.replaceToXml(rec.hy_unrcp_precpt_bal));
			//rx.add(record, "int_rate", StringUtil.replaceToXml(rec.int_rate));
			//rx.add(record, "deps_isav_stat_cd", StringUtil.replaceToXml(rec.deps_isav_stat_cd));
			//rx.add(record, "cctr_dt", StringUtil.replaceToXml(rec.cctr_dt));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
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
<fc_func_6541_l>
	<dataSet>
		<CURLIST>
			<record>
				<deps_isav_nm/>
				<compnm/>
				<mtry_dt/>
				<tot_pymt_amt/>
				<hy_cctr_dt/>
				<hy_frex_cd/>
				<hy_exrate/>
				<hy_frex_amt/>
				<hy_impt_amt/>
				<hy_corp_tax_amt/>
				<hy_patr_budg_cd/>
				<hy_deps_clsf_cd/>
				<hy_rmks/>
				<cancel_frex_cd/>
				<cancel_exrate/>
				<cancel_frex_amt/>
				<cancel_won_pfls_amt/>
				<payment_frex_cd/>
				<payment_exrate/>
				<payment_frex_amt/>
				<payment_won_pfls_amt/>
				<deps_isav_clsf_cd/>
				<deps_isav_no/>
				<cost_gain_stot/>
				<rcpay_amt_stot/>
				<ijajanamt/>
				<prelae_pay_clsf_cd/>
				<comp_dt/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<rmks/>
				<jpno/>
				<deps_isav_stat_cdnm/>
				<hy_yejpno/>
				<hy_tot_int_amt/>
				<hy_unrcp_precpt_bal/>
				<int_rate/>
				<deps_isav_stat_cd/>
				<cctr_dt/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_6541_l>
*/
%>

<% /* 작성시간 : Fri Apr 29 14:52:57 KST 2016 */ %>