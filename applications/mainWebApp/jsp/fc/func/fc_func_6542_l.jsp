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
	FC_FUNC_6542_LDataSet ds = (FC_FUNC_6542_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_6542_LCURLISTRecord rec = (FC_FUNC_6542_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cost_gain_stot", rec.cost_gain_stot);
			rx.add(record, "rcpay_amt_stot", rec.rcpay_amt_stot);
			rx.add(record, "ijajanamt", rec.ijajanamt);
			rx.add(record, "prelae_pay_clsf_cd", rec.prelae_pay_clsf_cd);
			rx.add(record, "deps_isav_nm", rec.deps_isav_nm);
			rx.add(record, "tot_pymt_amt", rec.tot_pymt_amt);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "jpno", rec.jpno);
			rx.add(record, "deps_isav_stat_cdnm", rec.deps_isav_stat_cdnm);
			rx.add(record, "hy_cctr_dt", rec.hy_cctr_dt);
			rx.add(record, "hy_impt_amt", rec.hy_impt_amt);
			rx.add(record, "hy_corp_tax_amt", rec.hy_corp_tax_amt);
			rx.add(record, "hy_patr_budg_cd", rec.hy_patr_budg_cd);
			rx.add(record, "hy_deps_clsf_cd", rec.hy_deps_clsf_cd);
			rx.add(record, "hy_rmks", rec.hy_rmks);
			rx.add(record, "hy_yejpno", rec.hy_yejpno);
			rx.add(record, "hy_tot_int_amt", rec.hy_tot_int_amt);
			rx.add(record, "hy_unrcp_precpt_bal", rec.hy_unrcp_precpt_bal);
			rx.add(record, "int_rate", rec.int_rate);
			rx.add(record, "hy_def_tax_amt", rec.hy_def_tax_amt);
			//rx.add(record, "cost_gain_stot", StringUtil.replaceToXml(rec.cost_gain_stot));
			//rx.add(record, "rcpay_amt_stot", StringUtil.replaceToXml(rec.rcpay_amt_stot));
			//rx.add(record, "ijajanamt", StringUtil.replaceToXml(rec.ijajanamt));
			//rx.add(record, "prelae_pay_clsf_cd", StringUtil.replaceToXml(rec.prelae_pay_clsf_cd));
			//rx.add(record, "deps_isav_nm", StringUtil.replaceToXml(rec.deps_isav_nm));
			//rx.add(record, "tot_pymt_amt", StringUtil.replaceToXml(rec.tot_pymt_amt));
			//rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "compnm", StringUtil.replaceToXml(rec.compnm));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			//rx.add(record, "jpno", StringUtil.replaceToXml(rec.jpno));
			//rx.add(record, "deps_isav_stat_cdnm", StringUtil.replaceToXml(rec.deps_isav_stat_cdnm));
			//rx.add(record, "hy_cctr_dt", StringUtil.replaceToXml(rec.hy_cctr_dt));
			//rx.add(record, "hy_impt_amt", StringUtil.replaceToXml(rec.hy_impt_amt));
			//rx.add(record, "hy_corp_tax_amt", StringUtil.replaceToXml(rec.hy_corp_tax_amt));
			//rx.add(record, "hy_patr_budg_cd", StringUtil.replaceToXml(rec.hy_patr_budg_cd));
			//rx.add(record, "hy_deps_clsf_cd", StringUtil.replaceToXml(rec.hy_deps_clsf_cd));
			//rx.add(record, "hy_rmks", StringUtil.replaceToXml(rec.hy_rmks));
			//rx.add(record, "hy_yejpno", StringUtil.replaceToXml(rec.hy_yejpno));
			//rx.add(record, "hy_tot_int_amt", StringUtil.replaceToXml(rec.hy_tot_int_amt));
			//rx.add(record, "hy_unrcp_precpt_bal", StringUtil.replaceToXml(rec.hy_unrcp_precpt_bal));
			//rx.add(record, "int_rate", StringUtil.replaceToXml(rec.int_rate));
			//rx.add(record, "hy_def_tax_amt", StringUtil.replaceToXml(rec.hy_def_tax_amt));
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
<fc_func_6542_l>
	<dataSet>
		<CURLIST>
			<record>
				<cost_gain_stot/>
				<rcpay_amt_stot/>
				<ijajanamt/>
				<prelae_pay_clsf_cd/>
				<deps_isav_nm/>
				<tot_pymt_amt/>
				<comp_dt/>
				<mtry_dt/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<compnm/>
				<rmks/>
				<jpno/>
				<deps_isav_stat_cdnm/>
				<hy_cctr_dt/>
				<hy_impt_amt/>
				<hy_corp_tax_amt/>
				<hy_patr_budg_cd/>
				<hy_deps_clsf_cd/>
				<hy_rmks/>
				<hy_yejpno/>
				<hy_tot_int_amt/>
				<hy_unrcp_precpt_bal/>
				<int_rate/>
				<hy_def_tax_amt/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_6542_l>
*/
%>

<% /* 작성시간 : Fri Apr 29 14:52:57 KST 2016 */ %>