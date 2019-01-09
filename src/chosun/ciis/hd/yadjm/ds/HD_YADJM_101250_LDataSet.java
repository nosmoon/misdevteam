

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


public class HD_YADJM_101250_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_101250_LDataSet(){}
	public HD_YADJM_101250_LDataSet(String errcode, String errmsg){
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
			HD_YADJM_101250_LCURLISTRecord rec = new HD_YADJM_101250_LCURLISTRecord();
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
			rec.child_care_fee_nops = Util.checkString(rset0.getString("child_care_fee_nops"));
			rec.addm_dduc_care_fee = Util.checkString(rset0.getString("addm_dduc_care_fee"));
			rec.adopt_dduc_nops = Util.checkString(rset0.getString("adopt_dduc_nops"));
			rec.adopt_dduc = Util.checkString(rset0.getString("adopt_dduc"));
			rec.addm_dduc_fml_hshd = Util.checkString(rset0.getString("addm_dduc_fml_hshd"));
			rec.multi_child_nops = Util.checkString(rset0.getString("multi_child_nops"));
			rec.multi_child_addm_dduc = Util.checkString(rset0.getString("multi_child_addm_dduc"));
			rec.np_insr_fee_dduc = Util.checkString(rset0.getString("np_insr_fee_dduc"));
			rec.tot_hlth_insr_fee = Util.checkString(rset0.getString("tot_hlth_insr_fee"));
			rec.tot_emp_insr_fee = Util.checkString(rset0.getString("tot_emp_insr_fee"));
			rec.gnr_asrc_prpn_insr_fee = Util.checkString(rset0.getString("gnr_asrc_prpn_insr_fee"));
			rec.obcl_pers_lesd_insr_fee = Util.checkString(rset0.getString("obcl_pers_lesd_insr_fee"));
			rec.spc_dduc_hosp_fee = Util.checkString(rset0.getString("spc_dduc_hosp_fee"));
			rec.spc_dduc_edu_fee = Util.checkString(rset0.getString("spc_dduc_edu_fee"));
			rec.spc_dduc_won_li_amt = Util.checkString(rset0.getString("spc_dduc_won_li_amt"));
			rec.monthly_rent_amt = Util.checkString(rset0.getString("monthly_rent_amt"));
			rec.spc_dduc_mogg_loan_amt = Util.checkString(rset0.getString("spc_dduc_mogg_loan_amt"));
			rec.spc_dduc_dona_amt = Util.checkString(rset0.getString("spc_dduc_dona_amt"));
			rec.spc_dduc_stot = Util.checkString(rset0.getString("spc_dduc_stot"));
			rec.std_dduc_amt = Util.checkString(rset0.getString("std_dduc_amt"));
			rec.dedu_labr_incm_amt = Util.checkString(rset0.getString("dedu_labr_incm_amt"));
			rec.tax_rl_dduc_prsn_pens = Util.checkString(rset0.getString("tax_rl_dduc_prsn_pens"));
			rec.pens_savg_incm_dduc = Util.checkString(rset0.getString("pens_savg_incm_dduc"));
			rec.hous_subc_savg = Util.checkString(rset0.getString("hous_subc_savg"));
			rec.multy_house_plan_savg = Util.checkString(rset0.getString("multy_house_plan_savg"));
			rec.ltrm_hous_savg = Util.checkString(rset0.getString("ltrm_hous_savg"));
			rec.labr_hous_savg = Util.checkString(rset0.getString("labr_hous_savg"));
			rec.vent_invsm = Util.checkString(rset0.getString("vent_invsm"));
			rec.crdt_card_use_amt = Util.checkString(rset0.getString("crdt_card_use_amt"));
			rec.stock_save = Util.checkString(rset0.getString("stock_save"));
			rec.txn_std_amt = Util.checkString(rset0.getString("txn_std_amt"));
			rec.calc_incm_tax = Util.checkString(rset0.getString("calc_incm_tax"));
			rec.tax_amt_dduc_labr_incm = Util.checkString(rset0.getString("tax_amt_dduc_labr_incm"));
			rec.tax_amt_dduc_hous_loan_amt_int = Util.checkString(rset0.getString("tax_amt_dduc_hous_loan_amt_int"));
			rec.tax_amt_dduc_polt_fund = Util.checkString(rset0.getString("tax_amt_dduc_polt_fund"));
			rec.tax_amt_dduc_forn_pymt = Util.checkString(rset0.getString("tax_amt_dduc_forn_pymt"));
			rec.tax_amt_dduc_stot = Util.checkString(rset0.getString("tax_amt_dduc_stot"));
			rec.deci_incm_tax2 = Util.checkString(rset0.getString("deci_incm_tax2"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_101250_LDataSet ds = (HD_YADJM_101250_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_101250_LCURLISTRecord curlistRec = (HD_YADJM_101250_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.child_care_fee_nops%>
<%= curlistRec.addm_dduc_care_fee%>
<%= curlistRec.adopt_dduc_nops%>
<%= curlistRec.adopt_dduc%>
<%= curlistRec.addm_dduc_fml_hshd%>
<%= curlistRec.multi_child_nops%>
<%= curlistRec.multi_child_addm_dduc%>
<%= curlistRec.np_insr_fee_dduc%>
<%= curlistRec.tot_hlth_insr_fee%>
<%= curlistRec.tot_emp_insr_fee%>
<%= curlistRec.gnr_asrc_prpn_insr_fee%>
<%= curlistRec.obcl_pers_lesd_insr_fee%>
<%= curlistRec.spc_dduc_hosp_fee%>
<%= curlistRec.spc_dduc_edu_fee%>
<%= curlistRec.spc_dduc_won_li_amt%>
<%= curlistRec.monthly_rent_amt%>
<%= curlistRec.spc_dduc_mogg_loan_amt%>
<%= curlistRec.spc_dduc_dona_amt%>
<%= curlistRec.spc_dduc_stot%>
<%= curlistRec.std_dduc_amt%>
<%= curlistRec.dedu_labr_incm_amt%>
<%= curlistRec.tax_rl_dduc_prsn_pens%>
<%= curlistRec.pens_savg_incm_dduc%>
<%= curlistRec.hous_subc_savg%>
<%= curlistRec.multy_house_plan_savg%>
<%= curlistRec.ltrm_hous_savg%>
<%= curlistRec.labr_hous_savg%>
<%= curlistRec.vent_invsm%>
<%= curlistRec.crdt_card_use_amt%>
<%= curlistRec.stock_save%>
<%= curlistRec.txn_std_amt%>
<%= curlistRec.calc_incm_tax%>
<%= curlistRec.tax_amt_dduc_labr_incm%>
<%= curlistRec.tax_amt_dduc_hous_loan_amt_int%>
<%= curlistRec.tax_amt_dduc_polt_fund%>
<%= curlistRec.tax_amt_dduc_forn_pymt%>
<%= curlistRec.tax_amt_dduc_stot%>
<%= curlistRec.deci_incm_tax2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jan 09 17:28:53 KST 2011 */