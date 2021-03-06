/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_YADJM_2017_1250_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_2017_1250_LDataSet(){}
	public HD_YADJM_2017_1250_LDataSet(String errcode, String errmsg){
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
			HD_YADJM_2017_1250_LCURLISTRecord rec = new HD_YADJM_2017_1250_LCURLISTRecord();
			rec.deci_incm_tax = Util.checkString(rset0.getString("deci_incm_tax"));
			rec.deci_res_tax = Util.checkString(rset0.getString("deci_res_tax"));
			rec.deci_farm_spc_tax = Util.checkString(rset0.getString("deci_farm_spc_tax"));
			rec.deci_tax_stot = Util.checkString(rset0.getString("deci_tax_stot"));
			rec.befo_pymt_incm_tax = Util.checkString(rset0.getString("befo_pymt_incm_tax"));
			rec.befo_pymt_res_tax = Util.checkString(rset0.getString("befo_pymt_res_tax"));
			rec.befo_pymt_farm_spc_tax = Util.checkString(rset0.getString("befo_pymt_farm_spc_tax"));
			rec.befo_pymt_tax_stot = Util.checkString(rset0.getString("befo_pymt_tax_stot"));
			rec.now_pymt_incm_tax = Util.checkString(rset0.getString("now_pymt_incm_tax"));
			rec.now_pymt_res_tax = Util.checkString(rset0.getString("now_pymt_res_tax"));
			rec.now_pymt_farm_spc_tax = Util.checkString(rset0.getString("now_pymt_farm_spc_tax"));
			rec.now_pymt_tax_stot = Util.checkString(rset0.getString("now_pymt_tax_stot"));
			rec.dedu_incm_tax = Util.checkString(rset0.getString("dedu_incm_tax"));
			rec.dedu_res_tax = Util.checkString(rset0.getString("dedu_res_tax"));
			rec.dedu_farm_spc_tax = Util.checkString(rset0.getString("dedu_farm_spc_tax"));
			rec.dedu_tax_stot = Util.checkString(rset0.getString("dedu_tax_stot"));
			rec.labr_incm_impt_amt = Util.checkString(rset0.getString("labr_incm_impt_amt"));
			rec.labr_incm_dduc = Util.checkString(rset0.getString("labr_incm_dduc"));
			rec.labr_incm_amt = Util.checkString(rset0.getString("labr_incm_amt"));
			rec.base_dduc_slf = Util.checkString(rset0.getString("base_dduc_slf"));
			rec.base_dduc_spos = Util.checkString(rset0.getString("base_dduc_spos"));
			rec.faml_nops = Util.checkString(rset0.getString("faml_nops"));
			rec.base_dduc_child_oldg = Util.checkString(rset0.getString("base_dduc_child_oldg"));
			rec.rspc_nops = Util.checkString(rset0.getString("rspc_nops"));
			rec.addm_dduc_rspc = Util.checkString(rset0.getString("addm_dduc_rspc"));
			rec.obcl_pers_nops = Util.checkString(rset0.getString("obcl_pers_nops"));
			rec.addm_dduc_obcl_pers = Util.checkString(rset0.getString("addm_dduc_obcl_pers"));
			rec.addm_dduc_fml_hshd = Util.checkString(rset0.getString("addm_dduc_fml_hshd"));
			rec.addm_dduc_one_paren = Util.checkString(rset0.getString("addm_dduc_one_paren"));
			rec.np_insr_fee_dduc = Util.checkString(rset0.getString("np_insr_fee_dduc"));
			rec.tot_hlth_insr_fee = Util.checkString(rset0.getString("tot_hlth_insr_fee"));
			rec.tot_emp_insr_fee = Util.checkString(rset0.getString("tot_emp_insr_fee"));
			rec.spc_dduc_won_li_amt = Util.checkString(rset0.getString("spc_dduc_won_li_amt"));
			rec.spc_dduc_mogg_loan_amt = Util.checkString(rset0.getString("spc_dduc_mogg_loan_amt"));
			rec.spc_dduc_dona_amt = Util.checkString(rset0.getString("spc_dduc_dona_amt"));
			rec.spc_dduc_stot = Util.checkString(rset0.getString("spc_dduc_stot"));
			rec.dedu_labr_incm_amt = Util.checkString(rset0.getString("dedu_labr_incm_amt"));
			rec.tax_rl_dduc_prsn_pens = Util.checkString(rset0.getString("tax_rl_dduc_prsn_pens"));
			rec.smallbiz_incm_dduc = Util.checkString(rset0.getString("smallbiz_incm_dduc"));
			rec.hous_subc_savg = Util.checkString(rset0.getString("hous_subc_savg"));
			rec.multy_house_plan_savg = Util.checkString(rset0.getString("multy_house_plan_savg"));
			rec.labr_hous_savg = Util.checkString(rset0.getString("labr_hous_savg"));
			rec.vent_invsm = Util.checkString(rset0.getString("vent_invsm"));
			rec.crdt_card_use_amt = Util.checkString(rset0.getString("crdt_card_use_amt"));
			rec.lease_house_int_dduc = Util.checkString(rset0.getString("lease_house_int_dduc"));
			rec.ltrm_invsm_stock_dduc = Util.checkString(rset0.getString("ltrm_invsm_stock_dduc"));
			rec.other_tax_sum = Util.checkString(rset0.getString("other_tax_sum"));
			rec.incm_dduc_tot_limt_excs_amt = Util.checkString(rset0.getString("incm_dduc_tot_limt_excs_amt"));
			rec.txn_std_amt = Util.checkString(rset0.getString("txn_std_amt"));
			rec.calc_incm_tax = Util.checkString(rset0.getString("calc_incm_tax"));
			rec.tax_amt_dduc_labr_incm = Util.checkString(rset0.getString("tax_amt_dduc_labr_incm"));
			rec.tax_dduc_child = Util.checkString(rset0.getString("tax_dduc_child"));
			rec.pens_savg_dduc_obj = Util.checkString(rset0.getString("pens_savg_dduc_obj"));
			rec.tax_dduc_pens_savg = Util.checkString(rset0.getString("tax_dduc_pens_savg"));
			rec.asrc_insr_fee_dduc_obj = Util.checkString(rset0.getString("asrc_insr_fee_dduc_obj"));
			rec.tax_dduc_asrc_insr_fee = Util.checkString(rset0.getString("tax_dduc_asrc_insr_fee"));
			rec.hosp_fee_dduc_obj = Util.checkString(rset0.getString("hosp_fee_dduc_obj"));
			rec.tax_dduc_hosp_fee = Util.checkString(rset0.getString("tax_dduc_hosp_fee"));
			rec.edu_fee_dduc_obj = Util.checkString(rset0.getString("edu_fee_dduc_obj"));
			rec.tax_dduc_edu_fee = Util.checkString(rset0.getString("tax_dduc_edu_fee"));
			rec.dona_polt_1_dduc_obj = Util.checkString(rset0.getString("dona_polt_1_dduc_obj"));
			rec.tax_dduc_dona_polt_1 = Util.checkString(rset0.getString("tax_dduc_dona_polt_1"));
			rec.dona_polt_2_dduc_obj = Util.checkString(rset0.getString("dona_polt_2_dduc_obj"));
			rec.tax_dduc_dona_polt_2 = Util.checkString(rset0.getString("tax_dduc_dona_polt_2"));
			rec.dona_law_dduc_obj = Util.checkString(rset0.getString("dona_law_dduc_obj"));
			rec.tax_dduc_dona_law = Util.checkString(rset0.getString("tax_dduc_dona_law"));
			rec.dona_appm_dduc_obj = Util.checkString(rset0.getString("dona_appm_dduc_obj"));
			rec.tax_dduc_dona_appm = Util.checkString(rset0.getString("tax_dduc_dona_appm"));
			rec.std_tax_dduc_amt = Util.checkString(rset0.getString("std_tax_dduc_amt"));
			rec.tax_amt_dduc_hous_loan_amt_int = Util.checkString(rset0.getString("tax_amt_dduc_hous_loan_amt_int"));
			rec.tax_amt_dduc_forn_pymt = Util.checkString(rset0.getString("tax_amt_dduc_forn_pymt"));
			rec.monthly_rent_dduc_obj = Util.checkString(rset0.getString("monthly_rent_dduc_obj"));
			rec.tax_dduc_monthly_rent = Util.checkString(rset0.getString("tax_dduc_monthly_rent"));
			rec.tax_amt_dduc_stot = Util.checkString(rset0.getString("tax_amt_dduc_stot"));
			rec.deci_incm_tax2 = Util.checkString(rset0.getString("deci_incm_tax2"));
			rec.deci_incm_tax2 = Util.checkString(rset0.getString("deci_incm_tax2"));
			rec.obcl_asrc_insr_dduc_obj = Util.checkString(rset0.getString("obcl_asrc_insr_dduc_obj"));
			rec.tax_dduc_obcl_asrc_insr = Util.checkString(rset0.getString("tax_dduc_obcl_asrc_insr"));
			rec.dduc_child_nops = Util.checkString(rset0.getString("dduc_child_nops"));
			rec.dduc_child_6years_nops = Util.checkString(rset0.getString("dduc_child_6years_nops"));
			rec.tax_dduc_child_6years = Util.checkString(rset0.getString("tax_dduc_child_6years"));
			rec.adopt_dduc_nops = Util.checkString(rset0.getString("adopt_dduc_nops"));
			rec.tax_dduc_child_born = Util.checkString(rset0.getString("tax_dduc_child_born"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_2015_1250_LDataSet ds = (HD_YADJM_2015_1250_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_2015_1250_LCURLISTRecord curlistRec = (HD_YADJM_2015_1250_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.deci_incm_tax%>
<%= curlistRec.deci_res_tax%>
<%= curlistRec.deci_farm_spc_tax%>
<%= curlistRec.deci_tax_stot%>
<%= curlistRec.befo_pymt_incm_tax%>
<%= curlistRec.befo_pymt_res_tax%>
<%= curlistRec.befo_pymt_farm_spc_tax%>
<%= curlistRec.befo_pymt_tax_stot%>
<%= curlistRec.now_pymt_incm_tax%>
<%= curlistRec.now_pymt_res_tax%>
<%= curlistRec.now_pymt_farm_spc_tax%>
<%= curlistRec.now_pymt_tax_stot%>
<%= curlistRec.dedu_incm_tax%>
<%= curlistRec.dedu_res_tax%>
<%= curlistRec.dedu_farm_spc_tax%>
<%= curlistRec.dedu_tax_stot%>
<%= curlistRec.labr_incm_impt_amt%>
<%= curlistRec.labr_incm_dduc%>
<%= curlistRec.labr_incm_amt%>
<%= curlistRec.base_dduc_slf%>
<%= curlistRec.base_dduc_spos%>
<%= curlistRec.faml_nops%>
<%= curlistRec.base_dduc_child_oldg%>
<%= curlistRec.rspc_nops%>
<%= curlistRec.addm_dduc_rspc%>
<%= curlistRec.obcl_pers_nops%>
<%= curlistRec.addm_dduc_obcl_pers%>
<%= curlistRec.addm_dduc_fml_hshd%>
<%= curlistRec.addm_dduc_one_paren%>
<%= curlistRec.np_insr_fee_dduc%>
<%= curlistRec.tot_hlth_insr_fee%>
<%= curlistRec.tot_emp_insr_fee%>
<%= curlistRec.spc_dduc_won_li_amt%>
<%= curlistRec.spc_dduc_mogg_loan_amt%>
<%= curlistRec.spc_dduc_dona_amt%>
<%= curlistRec.spc_dduc_stot%>
<%= curlistRec.dedu_labr_incm_amt%>
<%= curlistRec.tax_rl_dduc_prsn_pens%>
<%= curlistRec.smallbiz_incm_dduc%>
<%= curlistRec.hous_subc_savg%>
<%= curlistRec.multy_house_plan_savg%>
<%= curlistRec.labr_hous_savg%>
<%= curlistRec.vent_invsm%>
<%= curlistRec.crdt_card_use_amt%>
<%= curlistRec.lease_house_int_dduc%>
<%= curlistRec.ltrm_invsm_stock_dduc%>
<%= curlistRec.other_tax_sum%>
<%= curlistRec.incm_dduc_tot_limt_excs_amt%>
<%= curlistRec.txn_std_amt%>
<%= curlistRec.calc_incm_tax%>
<%= curlistRec.tax_amt_dduc_labr_incm%>
<%= curlistRec.tax_dduc_child%>
<%= curlistRec.pens_savg_dduc_obj%>
<%= curlistRec.tax_dduc_pens_savg%>
<%= curlistRec.asrc_insr_fee_dduc_obj%>
<%= curlistRec.tax_dduc_asrc_insr_fee%>
<%= curlistRec.hosp_fee_dduc_obj%>
<%= curlistRec.tax_dduc_hosp_fee%>
<%= curlistRec.edu_fee_dduc_obj%>
<%= curlistRec.tax_dduc_edu_fee%>
<%= curlistRec.dona_polt_1_dduc_obj%>
<%= curlistRec.tax_dduc_dona_polt_1%>
<%= curlistRec.dona_polt_2_dduc_obj%>
<%= curlistRec.tax_dduc_dona_polt_2%>
<%= curlistRec.dona_law_dduc_obj%>
<%= curlistRec.tax_dduc_dona_law%>
<%= curlistRec.dona_appm_dduc_obj%>
<%= curlistRec.tax_dduc_dona_appm%>
<%= curlistRec.std_tax_dduc_amt%>
<%= curlistRec.tax_amt_dduc_hous_loan_amt_int%>
<%= curlistRec.tax_amt_dduc_forn_pymt%>
<%= curlistRec.monthly_rent_dduc_obj%>
<%= curlistRec.tax_dduc_monthly_rent%>
<%= curlistRec.tax_amt_dduc_stot%>
<%= curlistRec.deci_incm_tax2%>
<%= curlistRec.deci_incm_tax2%>
<%= curlistRec.obcl_asrc_insr_dduc_obj%>
<%= curlistRec.tax_dduc_obcl_asrc_insr%>
<%= curlistRec.dduc_child_nops%>
<%= curlistRec.dduc_child_6years_nops%>
<%= curlistRec.tax_dduc_child_6years%>
<%= curlistRec.adopt_dduc_nops%>
<%= curlistRec.tax_dduc_child_born%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 14 12:30:29 KST 2016 */