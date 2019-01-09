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
	HD_YADJM_1001_LDataSet ds = (HD_YADJM_1001_LDataSet)request.getAttribute("ds");
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
			HD_YADJM_1001_LCURLISTRecord rec = (HD_YADJM_1001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "adjm_yy", rec.adjm_yy);
			rx.add(record, "slf_dduc_amt", rec.slf_dduc_amt);
			rx.add(record, "spos_dduc_amt", rec.spos_dduc_amt);
			rx.add(record, "child_dduc_amt", rec.child_dduc_amt);
			rx.add(record, "child_dduc_basi_yy", rec.child_dduc_basi_yy);
			rx.add(record, "prnt_dduc_amt_1", rec.prnt_dduc_amt_1);
			rx.add(record, "prnt_dduc_basi_yy_1", rec.prnt_dduc_basi_yy_1);
			rx.add(record, "prnt_dduc_amt_2", rec.prnt_dduc_amt_2);
			rx.add(record, "prnt_dduc_basi_yy_2", rec.prnt_dduc_basi_yy_2);
			rx.add(record, "brth_istt_amt_1", rec.brth_istt_amt_1);
			rx.add(record, "brth_istt_basi_yy_1", rec.brth_istt_basi_yy_1);
			rx.add(record, "brth_istt_amt_2", rec.brth_istt_amt_2);
			rx.add(record, "brth_istt_basi_yy_2", rec.brth_istt_basi_yy_2);
			rx.add(record, "brth_istt_amt_3", rec.brth_istt_amt_3);
			rx.add(record, "brth_istt_basi_yy_3", rec.brth_istt_basi_yy_3);
			rx.add(record, "rspc_dduc_amt_1", rec.rspc_dduc_amt_1);
			rx.add(record, "rspc_dduc_basi_yy_1_fr", rec.rspc_dduc_basi_yy_1_fr);
			rx.add(record, "rspc_dduc_basi_yy_1_to", rec.rspc_dduc_basi_yy_1_to);
			rx.add(record, "rspc_dduc_amt_2", rec.rspc_dduc_amt_2);
			rx.add(record, "rspc_dduc_basi_yy_2", rec.rspc_dduc_basi_yy_2);
			rx.add(record, "obcl_pers_dduc_amt", rec.obcl_pers_dduc_amt);
			rx.add(record, "fml_dduc_amt", rec.fml_dduc_amt);
			rx.add(record, "child_care_fee_dduc_amt", rec.child_care_fee_dduc_amt);
			rx.add(record, "mlt_chld_basi_dduc_amt", rec.mlt_chld_basi_dduc_amt);
			rx.add(record, "mlt_chld_pers_dduc_amt", rec.mlt_chld_pers_dduc_amt);
			rx.add(record, "mlt_chld_birth_dduc_amt", rec.mlt_chld_birth_dduc_amt);
			rx.add(record, "one_paren_dduc_amt", rec.one_paren_dduc_amt);
			rx.add(record, "gnr_insr_limt_amt", rec.gnr_insr_limt_amt);
			rx.add(record, "obcl_pers_insr_limt_amt", rec.obcl_pers_insr_limt_amt);
			rx.add(record, "hosp_fee_basi_ratio", rec.hosp_fee_basi_ratio);
			rx.add(record, "hosp_fee_limt_amt", rec.hosp_fee_limt_amt);
			rx.add(record, "baby_edu_fee", rec.baby_edu_fee);
			rx.add(record, "elmihi_edu_fee", rec.elmihi_edu_fee);
			rx.add(record, "univ_edu_fee", rec.univ_edu_fee);
			rx.add(record, "hous_savg_aply_ratio", rec.hous_savg_aply_ratio);
			rx.add(record, "hous_savg_aply_limt_amt", rec.hous_savg_aply_limt_amt);
			rx.add(record, "hous_hire_aply_ratio", rec.hous_hire_aply_ratio);
			rx.add(record, "hous_hire_aply_limt_amt", rec.hous_hire_aply_limt_amt);
			rx.add(record, "ltrm_hous_loan_amt_limt_amt_1", rec.ltrm_hous_loan_amt_limt_amt_1);
			rx.add(record, "ltrm_hous_loan_amt_limt_amt_2", rec.ltrm_hous_loan_amt_limt_amt_2);
			rx.add(record, "ltrm_hous_loan_amt_limt_amt_3", rec.ltrm_hous_loan_amt_limt_amt_3);
			rx.add(record, "wedd_fnrl_movm_widr_amt", rec.wedd_fnrl_movm_widr_amt);
			rx.add(record, "wedd_fnrl_movm_tot_saly_amt", rec.wedd_fnrl_movm_tot_saly_amt);
			rx.add(record, "wedd_fnrl_movm_dduc_incm_amt", rec.wedd_fnrl_movm_dduc_incm_amt);
			rx.add(record, "std_dduc_amt", rec.std_dduc_amt);
			rx.add(record, "prsn_pens_savg_ratio", rec.prsn_pens_savg_ratio);
			rx.add(record, "prsn_pens_savg_limt_amt", rec.prsn_pens_savg_limt_amt);
			rx.add(record, "pens_savg_limt_amt", rec.pens_savg_limt_amt);
			rx.add(record, "invsm_cmpd_invsm_ratio", rec.invsm_cmpd_invsm_ratio);
			rx.add(record, "lvcmpy_pens_limt_amt", rec.lvcmpy_pens_limt_amt);
			rx.add(record, "emp_stok_ownr_limt_amt", rec.emp_stok_ownr_limt_amt);
			rx.add(record, "crdt_card_tot_saly_ratio", rec.crdt_card_tot_saly_ratio);
			rx.add(record, "crdt_card_excs_amt_ratio", rec.crdt_card_excs_amt_ratio);
			rx.add(record, "crdt_card_limt_amt", rec.crdt_card_limt_amt);
			rx.add(record, "monthly_rent_amt_ratio", rec.monthly_rent_amt_ratio);
			rx.add(record, "no_lar_sum_lease_limt_amt", rec.no_lar_sum_lease_limt_amt);
			rx.add(record, "no_lar_sum_lease_limt_ratio", rec.no_lar_sum_lease_limt_ratio);
			
			//rx.add(record, "adjm_yy", StringUtil.replaceToXml(rec.adjm_yy));
			//rx.add(record, "slf_dduc_amt", StringUtil.replaceToXml(rec.slf_dduc_amt));
			//rx.add(record, "spos_dduc_amt", StringUtil.replaceToXml(rec.spos_dduc_amt));
			//rx.add(record, "child_dduc_amt", StringUtil.replaceToXml(rec.child_dduc_amt));
			//rx.add(record, "child_dduc_basi_yy", StringUtil.replaceToXml(rec.child_dduc_basi_yy));
			//rx.add(record, "prnt_dduc_amt_1", StringUtil.replaceToXml(rec.prnt_dduc_amt_1));
			//rx.add(record, "prnt_dduc_basi_yy_1", StringUtil.replaceToXml(rec.prnt_dduc_basi_yy_1));
			//rx.add(record, "prnt_dduc_amt_2", StringUtil.replaceToXml(rec.prnt_dduc_amt_2));
			//rx.add(record, "prnt_dduc_basi_yy_2", StringUtil.replaceToXml(rec.prnt_dduc_basi_yy_2));
			//rx.add(record, "brth_istt_amt_1", StringUtil.replaceToXml(rec.brth_istt_amt_1));
			//rx.add(record, "brth_istt_basi_yy_1", StringUtil.replaceToXml(rec.brth_istt_basi_yy_1));
			//rx.add(record, "brth_istt_amt_2", StringUtil.replaceToXml(rec.brth_istt_amt_2));
			//rx.add(record, "brth_istt_basi_yy_2", StringUtil.replaceToXml(rec.brth_istt_basi_yy_2));
			//rx.add(record, "brth_istt_amt_3", StringUtil.replaceToXml(rec.brth_istt_amt_3));
			//rx.add(record, "brth_istt_basi_yy_3", StringUtil.replaceToXml(rec.brth_istt_basi_yy_3));
			//rx.add(record, "rspc_dduc_amt_1", StringUtil.replaceToXml(rec.rspc_dduc_amt_1));
			//rx.add(record, "rspc_dduc_basi_yy_1_fr", StringUtil.replaceToXml(rec.rspc_dduc_basi_yy_1_fr));
			//rx.add(record, "rspc_dduc_basi_yy_1_to", StringUtil.replaceToXml(rec.rspc_dduc_basi_yy_1_to));
			//rx.add(record, "rspc_dduc_amt_2", StringUtil.replaceToXml(rec.rspc_dduc_amt_2));
			//rx.add(record, "rspc_dduc_basi_yy_2", StringUtil.replaceToXml(rec.rspc_dduc_basi_yy_2));
			//rx.add(record, "obcl_pers_dduc_amt", StringUtil.replaceToXml(rec.obcl_pers_dduc_amt));
			//rx.add(record, "fml_dduc_amt", StringUtil.replaceToXml(rec.fml_dduc_amt));
			//rx.add(record, "child_care_fee_dduc_amt", StringUtil.replaceToXml(rec.child_care_fee_dduc_amt));
			//rx.add(record, "mlt_chld_basi_dduc_amt", StringUtil.replaceToXml(rec.mlt_chld_basi_dduc_amt));
			//rx.add(record, "mlt_chld_pers_dduc_amt", StringUtil.replaceToXml(rec.mlt_chld_pers_dduc_amt));
			//rx.add(record, "mlt_chld_birth_dduc_amt", StringUtil.replaceToXml(rec.mlt_chld_birth_dduc_amt));
			//rx.add(record, "gnr_insr_limt_amt", StringUtil.replaceToXml(rec.gnr_insr_limt_amt));
			//rx.add(record, "obcl_pers_insr_limt_amt", StringUtil.replaceToXml(rec.obcl_pers_insr_limt_amt));
			//rx.add(record, "hosp_fee_basi_ratio", StringUtil.replaceToXml(rec.hosp_fee_basi_ratio));
			//rx.add(record, "hosp_fee_limt_amt", StringUtil.replaceToXml(rec.hosp_fee_limt_amt));
			//rx.add(record, "baby_edu_fee", StringUtil.replaceToXml(rec.baby_edu_fee));
			//rx.add(record, "elmihi_edu_fee", StringUtil.replaceToXml(rec.elmihi_edu_fee));
			//rx.add(record, "univ_edu_fee", StringUtil.replaceToXml(rec.univ_edu_fee));
			//rx.add(record, "hous_savg_aply_ratio", StringUtil.replaceToXml(rec.hous_savg_aply_ratio));
			//rx.add(record, "hous_savg_aply_limt_amt", StringUtil.replaceToXml(rec.hous_savg_aply_limt_amt));
			//rx.add(record, "hous_hire_aply_ratio", StringUtil.replaceToXml(rec.hous_hire_aply_ratio));
			//rx.add(record, "hous_hire_aply_limt_amt", StringUtil.replaceToXml(rec.hous_hire_aply_limt_amt));
			//rx.add(record, "ltrm_hous_loan_amt_limt_amt_1", StringUtil.replaceToXml(rec.ltrm_hous_loan_amt_limt_amt_1));
			//rx.add(record, "ltrm_hous_loan_amt_limt_amt_2", StringUtil.replaceToXml(rec.ltrm_hous_loan_amt_limt_amt_2));
			//rx.add(record, "wedd_fnrl_movm_widr_amt", StringUtil.replaceToXml(rec.wedd_fnrl_movm_widr_amt));
			//rx.add(record, "wedd_fnrl_movm_tot_saly_amt", StringUtil.replaceToXml(rec.wedd_fnrl_movm_tot_saly_amt));
			//rx.add(record, "wedd_fnrl_movm_dduc_incm_amt", StringUtil.replaceToXml(rec.wedd_fnrl_movm_dduc_incm_amt));
			//rx.add(record, "std_dduc_amt", StringUtil.replaceToXml(rec.std_dduc_amt));
			//rx.add(record, "prsn_pens_savg_ratio", StringUtil.replaceToXml(rec.prsn_pens_savg_ratio));
			//rx.add(record, "prsn_pens_savg_limt_amt", StringUtil.replaceToXml(rec.prsn_pens_savg_limt_amt));
			//rx.add(record, "pens_savg_limt_amt", StringUtil.replaceToXml(rec.pens_savg_limt_amt));
			//rx.add(record, "invsm_cmpd_invsm_ratio", StringUtil.replaceToXml(rec.invsm_cmpd_invsm_ratio));
			//rx.add(record, "lvcmpy_pens_limt_amt", StringUtil.replaceToXml(rec.lvcmpy_pens_limt_amt));
			//rx.add(record, "emp_stok_ownr_limt_amt", StringUtil.replaceToXml(rec.emp_stok_ownr_limt_amt));
			//rx.add(record, "crdt_card_tot_saly_ratio", StringUtil.replaceToXml(rec.crdt_card_tot_saly_ratio));
			//rx.add(record, "crdt_card_excs_amt_ratio", StringUtil.replaceToXml(rec.crdt_card_excs_amt_ratio));
			//rx.add(record, "crdt_card_limt_amt", StringUtil.replaceToXml(rec.crdt_card_limt_amt));
			//rx.add(record, "ltrm_hous_loan_amt_limt_amt_3", StringUtil.replaceToXml(rec.ltrm_hous_loan_amt_limt_amt_3));
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
<hd_yadjm_1001_l>
	<dataSet>
		<CURLIST>
			<record>
				<adjm_yy/>
				<slf_dduc_amt/>
				<spos_dduc_amt/>
				<child_dduc_amt/>
				<child_dduc_basi_yy/>
				<prnt_dduc_amt_1/>
				<prnt_dduc_basi_yy_1/>
				<prnt_dduc_amt_2/>
				<prnt_dduc_basi_yy_2/>
				<brth_istt_amt_1/>
				<brth_istt_basi_yy_1/>
				<brth_istt_amt_2/>
				<brth_istt_basi_yy_2/>
				<brth_istt_amt_3/>
				<brth_istt_basi_yy_3/>
				<rspc_dduc_amt_1/>
				<rspc_dduc_basi_yy_1_fr/>
				<rspc_dduc_basi_yy_1_to/>
				<rspc_dduc_amt_2/>
				<rspc_dduc_basi_yy_2/>
				<obcl_pers_dduc_amt/>
				<fml_dduc_amt/>
				<child_care_fee_dduc_amt/>
				<mlt_chld_basi_dduc_amt/>
				<mlt_chld_pers_dduc_amt/>
				<mlt_chld_birth_dduc_amt/>
				<gnr_insr_limt_amt/>
				<obcl_pers_insr_limt_amt/>
				<hosp_fee_basi_ratio/>
				<hosp_fee_limt_amt/>
				<baby_edu_fee/>
				<elmihi_edu_fee/>
				<univ_edu_fee/>
				<hous_savg_aply_ratio/>
				<hous_savg_aply_limt_amt/>
				<hous_hire_aply_ratio/>
				<hous_hire_aply_limt_amt/>
				<ltrm_hous_loan_amt_limt_amt_1/>
				<ltrm_hous_loan_amt_limt_amt_2/>
				<wedd_fnrl_movm_widr_amt/>
				<wedd_fnrl_movm_tot_saly_amt/>
				<wedd_fnrl_movm_dduc_incm_amt/>
				<std_dduc_amt/>
				<prsn_pens_savg_ratio/>
				<prsn_pens_savg_limt_amt/>
				<pens_savg_limt_amt/>
				<invsm_cmpd_invsm_ratio/>
				<lvcmpy_pens_limt_amt/>
				<emp_stok_ownr_limt_amt/>
				<crdt_card_tot_saly_ratio/>
				<crdt_card_excs_amt_ratio/>
				<crdt_card_limt_amt/>
				<ltrm_hous_loan_amt_limt_amt_3/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_1001_l>
*/
%>

<% /* 작성시간 : Tue Dec 01 21:12:29 KST 2009 */ %>