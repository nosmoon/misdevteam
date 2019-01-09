/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_1220_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_1220_LDataSet(){}
	public HD_YADJM_1220_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_YADJM_1220_LCURLISTRecord rec = new HD_YADJM_1220_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.adjm_rvrs_yy = Util.checkString(rset0.getString("adjm_rvrs_yy"));
			rec.adjm_clsf = Util.checkString(rset0.getString("adjm_clsf"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.spos_exne = Util.checkString(rset0.getString("spos_exne"));
			rec.child_nops = Util.checkString(rset0.getString("child_nops"));
			rec.oldg_nops = Util.checkString(rset0.getString("oldg_nops"));
			rec.obcl_pers_nops = Util.checkString(rset0.getString("obcl_pers_nops"));
			rec.rspc_nops = Util.checkString(rset0.getString("rspc_nops"));
			rec.rspc_nops_70 = Util.checkString(rset0.getString("rspc_nops_70"));
			rec.fml_hshd_yn = Util.checkString(rset0.getString("fml_hshd_yn"));
			rec.care_fee_nops = Util.checkString(rset0.getString("care_fee_nops"));
			rec.child_birth_in_qunt_nops = Util.checkString(rset0.getString("child_birth_in_qunt_nops"));
			rec.edu_fee_slf = Util.checkString(rset0.getString("edu_fee_slf"));
			rec.edu_cost_slf_both_point = Util.checkString(rset0.getString("edu_cost_slf_both_point"));
			rec.edu_fee_faml_ent_scl_prv = Util.checkString(rset0.getString("edu_fee_faml_ent_scl_prv"));
			rec.edu_fee_faml_ent_scl_prv_nops = Util.checkString(rset0.getString("edu_fee_faml_ent_scl_prv_nops"));
			rec.edu_fee_faml_elmihi = Util.checkString(rset0.getString("edu_fee_faml_elmihi"));
			rec.edu_fee_faml_elmihi_nops = Util.checkString(rset0.getString("edu_fee_faml_elmihi_nops"));
			rec.edu_fee_faml_univ = Util.checkString(rset0.getString("edu_fee_faml_univ"));
			rec.edu_fee_faml_univ_nops = Util.checkString(rset0.getString("edu_fee_faml_univ_nops"));
			rec.obcl_pers_spc_edu_fee = Util.checkString(rset0.getString("obcl_pers_spc_edu_fee"));
			rec.obcl_pers_spc_edu_cost_nops = Util.checkString(rset0.getString("obcl_pers_spc_edu_cost_nops"));
			rec.hosp_cost_slf_path_pers_obcl_p = Util.checkString(rset0.getString("hosp_cost_slf_path_pers_obcl_p"));
			rec.gnr_fee_cost_slf_excep = Util.checkString(rset0.getString("gnr_fee_cost_slf_excep"));
			rec.gnr_asrc_prpn_insr_fee = Util.checkString(rset0.getString("gnr_asrc_prpn_insr_fee"));
			rec.obcl_pers_lesd_insr_fee = Util.checkString(rset0.getString("obcl_pers_lesd_insr_fee"));
			rec.dona_amt_lgl = Util.checkString(rset0.getString("dona_amt_lgl"));
			rec.dona_amt_spc_case_dona_amt = Util.checkString(rset0.getString("dona_amt_spc_case_dona_amt"));
			rec.emp_stok_ownr_cmpd_dona_amt = Util.checkString(rset0.getString("emp_stok_ownr_cmpd_dona_amt"));
			rec.dona_phb_regu_boks_amt = Util.checkString(rset0.getString("dona_phb_regu_boks_amt"));
			rec.relg_dona_amt = Util.checkString(rset0.getString("relg_dona_amt"));
			rec.hous_hire_rcpm_won_li_amt_repa = Util.checkString(rset0.getString("hous_hire_rcpm_won_li_amt_repa"));
			rec.ltrm_hous_mogg_loan_amt_int_re = Util.checkString(rset0.getString("ltrm_hous_mogg_loan_amt_int_re"));
			rec.hous_loan_amt_int = Util.checkString(rset0.getString("hous_loan_amt_int"));
			rec.wedd_tms = Util.checkString(rset0.getString("wedd_tms"));
			rec.wedd_fee = Util.checkString(rset0.getString("wedd_fee"));
			rec.movm_tms = Util.checkString(rset0.getString("movm_tms"));
			rec.movm_fee = Util.checkString(rset0.getString("movm_fee"));
			rec.fnrl_tms = Util.checkString(rset0.getString("fnrl_tms"));
			rec.fnrl_fee = Util.checkString(rset0.getString("fnrl_fee"));
			rec.prsn_pens = Util.checkString(rset0.getString("prsn_pens"));
			rec.pens_savg = Util.checkString(rset0.getString("pens_savg"));
			rec.crdt_non_pcc_use = Util.checkString(rset0.getString("crdt_non_pcc_use"));
			rec.cash_rcpt = Util.checkString(rset0.getString("cash_rcpt"));
			rec.edu_cost_giro_pymt_amt = Util.checkString(rset0.getString("edu_cost_giro_pymt_amt"));
			rec.invsm_cmpd_invsm_amt = Util.checkString(rset0.getString("invsm_cmpd_invsm_amt"));
			rec.emp_stok_ownr_out_pens = Util.checkString(rset0.getString("emp_stok_ownr_out_pens"));
			rec.lvcmpy_pens_incm_dduc = Util.checkString(rset0.getString("lvcmpy_pens_incm_dduc"));
			rec.plac_cmpy_plac_trad_authr_inc = Util.checkString(rset0.getString("plac_cmpy_plac_trad_authr_inc"));
			rec.ltrm_stok_type_savg_incm_dduc = Util.checkString(rset0.getString("ltrm_stok_type_savg_incm_dduc"));
			rec.tax_paymt_cmpd_dduc = Util.checkString(rset0.getString("tax_paymt_cmpd_dduc"));
			rec.dona_polt_fund = Util.checkString(rset0.getString("dona_polt_fund"));
			rec.forn_duty_plac = Util.checkString(rset0.getString("forn_duty_plac"));
			rec.forn_duty_dty = Util.checkString(rset0.getString("forn_duty_dty"));
			rec.forn_duty_prd_frdt = Util.checkString(rset0.getString("forn_duty_prd_frdt"));
			rec.forn_duty_prd_todt = Util.checkString(rset0.getString("forn_duty_prd_todt"));
			rec.forn_duty_tot_saly = Util.checkString(rset0.getString("forn_duty_tot_saly"));
			rec.tax_paymt_offi_nm = Util.checkString(rset0.getString("tax_paymt_offi_nm"));
			rec.tax_paymt_amt_frex = Util.checkString(rset0.getString("tax_paymt_amt_frex"));
			rec.tax_paymt_amt_won = Util.checkString(rset0.getString("tax_paymt_amt_won"));
			rec.forn_duty_clsf = Util.checkString(rset0.getString("forn_duty_clsf"));
			rec.txn_obj_addm_amt = Util.checkString(rset0.getString("txn_obj_addm_amt"));
			rec.ltrm_stok_type_savg_incm_dduc1 = Util.checkString(rset0.getString("ltrm_stok_type_savg_incm_dduc1"));
			rec.ltrm_stok_type_savg_incm_dduc2 = Util.checkString(rset0.getString("ltrm_stok_type_savg_incm_dduc2"));
			rec.ltrm_stok_type_savg_incm_dduc3 = Util.checkString(rset0.getString("ltrm_stok_type_savg_incm_dduc3"));
			rec.hous_subc_savg = Util.checkString(rset0.getString("hous_subc_savg"));
			rec.labr_hous_savg = Util.checkString(rset0.getString("labr_hous_savg"));
			rec.ltrm_hous_savg = Util.checkString(rset0.getString("ltrm_hous_savg"));
			rec.invsm_cmpd_invsm_amt_6 = Util.checkString(rset0.getString("invsm_cmpd_invsm_amt_6"));
			rec.hous_loan_amt_int_1 = Util.checkString(rset0.getString("hous_loan_amt_int_1"));
			rec.tmp1 = Util.checkString(rset0.getString("tmp1"));
			rec.tmp2 = Util.checkString(rset0.getString("tmp2"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_1220_LDataSet ds = (HD_YADJM_1220_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_1220_LCURLISTRecord curlistRec = (HD_YADJM_1220_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.adjm_rvrs_yy%>
<%= curlistRec.adjm_clsf%>
<%= curlistRec.emp_no%>
<%= curlistRec.spos_exne%>
<%= curlistRec.child_nops%>
<%= curlistRec.oldg_nops%>
<%= curlistRec.obcl_pers_nops%>
<%= curlistRec.rspc_nops%>
<%= curlistRec.rspc_nops_70%>
<%= curlistRec.fml_hshd_yn%>
<%= curlistRec.care_fee_nops%>
<%= curlistRec.child_birth_in_qunt_nops%>
<%= curlistRec.edu_fee_slf%>
<%= curlistRec.edu_cost_slf_both_point%>
<%= curlistRec.edu_fee_faml_ent_scl_prv%>
<%= curlistRec.edu_fee_faml_ent_scl_prv_nops%>
<%= curlistRec.edu_fee_faml_elmihi%>
<%= curlistRec.edu_fee_faml_elmihi_nops%>
<%= curlistRec.edu_fee_faml_univ%>
<%= curlistRec.edu_fee_faml_univ_nops%>
<%= curlistRec.obcl_pers_spc_edu_fee%>
<%= curlistRec.obcl_pers_spc_edu_cost_nops%>
<%= curlistRec.hosp_cost_slf_path_pers_obcl_p%>
<%= curlistRec.gnr_fee_cost_slf_excep%>
<%= curlistRec.gnr_asrc_prpn_insr_fee%>
<%= curlistRec.obcl_pers_lesd_insr_fee%>
<%= curlistRec.dona_amt_lgl%>
<%= curlistRec.dona_amt_spc_case_dona_amt%>
<%= curlistRec.emp_stok_ownr_cmpd_dona_amt%>
<%= curlistRec.dona_phb_regu_boks_amt%>
<%= curlistRec.relg_dona_amt%>
<%= curlistRec.hous_hire_rcpm_won_li_amt_repa%>
<%= curlistRec.ltrm_hous_mogg_loan_amt_int_re%>
<%= curlistRec.hous_loan_amt_int%>
<%= curlistRec.wedd_tms%>
<%= curlistRec.wedd_fee%>
<%= curlistRec.movm_tms%>
<%= curlistRec.movm_fee%>
<%= curlistRec.fnrl_tms%>
<%= curlistRec.fnrl_fee%>
<%= curlistRec.prsn_pens%>
<%= curlistRec.pens_savg%>
<%= curlistRec.crdt_non_pcc_use%>
<%= curlistRec.cash_rcpt%>
<%= curlistRec.edu_cost_giro_pymt_amt%>
<%= curlistRec.invsm_cmpd_invsm_amt%>
<%= curlistRec.emp_stok_ownr_out_pens%>
<%= curlistRec.lvcmpy_pens_incm_dduc%>
<%= curlistRec.plac_cmpy_plac_trad_authr_inc%>
<%= curlistRec.ltrm_stok_type_savg_incm_dduc%>
<%= curlistRec.tax_paymt_cmpd_dduc%>
<%= curlistRec.dona_polt_fund%>
<%= curlistRec.forn_duty_plac%>
<%= curlistRec.forn_duty_dty%>
<%= curlistRec.forn_duty_prd_frdt%>
<%= curlistRec.forn_duty_prd_todt%>
<%= curlistRec.forn_duty_tot_saly%>
<%= curlistRec.tax_paymt_offi_nm%>
<%= curlistRec.tax_paymt_amt_frex%>
<%= curlistRec.tax_paymt_amt_won%>
<%= curlistRec.forn_duty_clsf%>
<%= curlistRec.txn_obj_addm_amt%>
<%= curlistRec.ltrm_stok_type_savg_incm_dduc1%>
<%= curlistRec.ltrm_stok_type_savg_incm_dduc2%>
<%= curlistRec.ltrm_stok_type_savg_incm_dduc3%>
<%= curlistRec.hous_subc_savg%>
<%= curlistRec.labr_hous_savg%>
<%= curlistRec.ltrm_hous_savg%>
<%= curlistRec.invsm_cmpd_invsm_amt_6%>
<%= curlistRec.hous_loan_amt_int_1%>
<%= curlistRec.tmp1%>
<%= curlistRec.tmp2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 14 20:47:15 KST 2010 */