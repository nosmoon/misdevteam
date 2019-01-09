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


public class HD_YADJM_1500_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_1500_LDataSet(){}
	public HD_YADJM_1500_LDataSet(String errcode, String errmsg){
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
			HD_YADJM_1500_LCURLISTRecord rec = new HD_YADJM_1500_LCURLISTRecord();
			rec.labr_incm_impt_amt = Util.checkString(rset0.getString("labr_incm_impt_amt"));
			rec.labr_incm_dduc = Util.checkString(rset0.getString("labr_incm_dduc"));
			rec.labr_incm_amt = Util.checkString(rset0.getString("labr_incm_amt"));
			rec.base_dduc_slf = Util.checkString(rset0.getString("base_dduc_slf"));
			rec.base_dduc_spos = Util.checkString(rset0.getString("base_dduc_spos"));
			rec.base_dduc_child = Util.checkString(rset0.getString("base_dduc_child"));
			rec.base_dduc_oldg = Util.checkString(rset0.getString("base_dduc_oldg"));
			rec.faml_nops = Util.checkString(rset0.getString("faml_nops"));
			rec.addm_dduc_rspc = Util.checkString(rset0.getString("addm_dduc_rspc"));
			rec.rspc_nops = Util.checkString(rset0.getString("rspc_nops"));
			rec.addm_dduc_obcl_pers = Util.checkString(rset0.getString("addm_dduc_obcl_pers"));
			rec.obcl_pers_nops = Util.checkString(rset0.getString("obcl_pers_nops"));
			rec.addm_dduc_fml_hshd = Util.checkString(rset0.getString("addm_dduc_fml_hshd"));
			rec.addm_dduc_care_fee = Util.checkString(rset0.getString("addm_dduc_care_fee"));
			rec.child_care_fee_nops = Util.checkString(rset0.getString("child_care_fee_nops"));
			rec.adopt_dduc = Util.checkString(rset0.getString("adopt_dduc"));
			rec.adopt_dduc_nops = Util.checkString(rset0.getString("adopt_dduc_nops"));
			rec.multi_child_addm_dduc = Util.checkString(rset0.getString("multi_child_addm_dduc"));
			rec.multi_child_nops = Util.checkString(rset0.getString("multi_child_nops"));
			rec.pens_savg_incm_dduc = Util.checkString(rset0.getString("pens_savg_incm_dduc"));
			rec.np_insr_fee_dduc = Util.checkString(rset0.getString("np_insr_fee_dduc"));
			rec.spc_dduc_insr_fee = Util.checkString(rset0.getString("spc_dduc_insr_fee"));
			rec.spc_dduc_hosp_fee = Util.checkString(rset0.getString("spc_dduc_hosp_fee"));
			rec.spc_dduc_edu_fee = Util.checkString(rset0.getString("spc_dduc_edu_fee"));
			rec.spc_dduc_hous_fund = Util.checkString(rset0.getString("spc_dduc_hous_fund"));
			rec.spc_dduc_dona_amt = Util.checkString(rset0.getString("spc_dduc_dona_amt"));
			rec.spc_dduc_wedd_etc = Util.checkString(rset0.getString("spc_dduc_wedd_etc"));
			rec.spc_dduc_stot = Util.checkString(rset0.getString("spc_dduc_stot"));
			rec.std_dduc_amt = Util.checkString(rset0.getString("std_dduc_amt"));
			rec.crdt_card_use_amt = Util.checkString(rset0.getString("crdt_card_use_amt"));
			rec.vent_invsm_1 = Util.checkString(rset0.getString("vent_invsm_1"));
			rec.vent_invsm_2 = Util.checkString(rset0.getString("vent_invsm_2"));
			rec.stock_save = Util.checkString(rset0.getString("stock_save"));
			rec.tax_rl_dduc_prsn_pens = Util.checkString(rset0.getString("tax_rl_dduc_prsn_pens"));
			rec.tax_rl_dduc_tech_manpwr = Util.checkString(rset0.getString("tax_rl_dduc_tech_manpwr"));
			rec.tax_rl_dduc_etc = Util.checkString(rset0.getString("tax_rl_dduc_etc"));
			rec.txn_std_amt = Util.checkString(rset0.getString("txn_std_amt"));
			rec.calc_incm_tax = Util.checkString(rset0.getString("calc_incm_tax"));
			rec.tax_amt_dduc_labr_incm = Util.checkString(rset0.getString("tax_amt_dduc_labr_incm"));
			rec.tax_amt_dduc_forn_pymt = Util.checkString(rset0.getString("tax_amt_dduc_forn_pymt"));
			rec.tax_amt_dduc_hous_loan_amt_int = Util.checkString(rset0.getString("tax_amt_dduc_hous_loan_amt_int"));
			rec.tax_amt_dduc_stok_savg = Util.checkString(rset0.getString("tax_amt_dduc_stok_savg"));
			rec.tax_amt_dduc_savg = Util.checkString(rset0.getString("tax_amt_dduc_savg"));
			rec.tax_amt_dduc_hous_fund = Util.checkString(rset0.getString("tax_amt_dduc_hous_fund"));
			rec.tax_amt_dduc_ltrm_savg = Util.checkString(rset0.getString("tax_amt_dduc_ltrm_savg"));
			rec.tax_amt_dduc_polt_fund = Util.checkString(rset0.getString("tax_amt_dduc_polt_fund"));
			rec.tax_amt_dduc_etc = Util.checkString(rset0.getString("tax_amt_dduc_etc"));
			rec.tax_amt_dduc_stot = Util.checkString(rset0.getString("tax_amt_dduc_stot"));
			rec.tax_amt_redu_incm_tax_law = Util.checkString(rset0.getString("tax_amt_redu_incm_tax_law"));
			rec.tax_amt_redu_tax_rl = Util.checkString(rset0.getString("tax_amt_redu_tax_rl"));
			rec.tax_amt_redu_etc = Util.checkString(rset0.getString("tax_amt_redu_etc"));
			rec.tax_amt_redu_stot = Util.checkString(rset0.getString("tax_amt_redu_stot"));
			rec.deci_incm_tax = Util.checkString(rset0.getString("deci_incm_tax"));
			rec.deci_farm_spc_tax = Util.checkString(rset0.getString("deci_farm_spc_tax"));
			rec.deci_res_tax = Util.checkString(rset0.getString("deci_res_tax"));
			rec.deci_tax_stot = Util.checkString(rset0.getString("deci_tax_stot"));
			rec.befo_pymt_incm_tax = Util.checkString(rset0.getString("befo_pymt_incm_tax"));
			rec.befo_pymt_farm_spc_tax = Util.checkString(rset0.getString("befo_pymt_farm_spc_tax"));
			rec.befo_pymt_res_tax = Util.checkString(rset0.getString("befo_pymt_res_tax"));
			rec.befo_pymt_tax_stot = Util.checkString(rset0.getString("befo_pymt_tax_stot"));
			rec.now_pymt_incm_tax = Util.checkString(rset0.getString("now_pymt_incm_tax"));
			rec.now_pymt_farm_spc_tax = Util.checkString(rset0.getString("now_pymt_farm_spc_tax"));
			rec.now_pymt_res_tax = Util.checkString(rset0.getString("now_pymt_res_tax"));
			rec.now_pymt_tax_stot = Util.checkString(rset0.getString("now_pymt_tax_stot"));
			rec.dedu_labr_incm_amt = Util.checkString(rset0.getString("dedu_labr_incm_amt"));
			rec.dedu_incm_tax = Util.checkString(rset0.getString("dedu_incm_tax"));
			rec.dedu_farm_spc_tax = Util.checkString(rset0.getString("dedu_farm_spc_tax"));
			rec.dedu_res_tax = Util.checkString(rset0.getString("dedu_res_tax"));
			rec.dedu_tax_stot = Util.checkString(rset0.getString("dedu_tax_stot"));
			rec.rvrs_prd_frdt = Util.checkString(rset0.getString("rvrs_prd_frdt"));
			rec.rvrs_prd_todt = Util.checkString(rset0.getString("rvrs_prd_todt"));
			rec.redu_prd_frdt = Util.checkString(rset0.getString("redu_prd_frdt"));
			rec.redu_prd_todt = Util.checkString(rset0.getString("redu_prd_todt"));
			rec.spc_dduc_won_li_amt = Util.checkString(rset0.getString("spc_dduc_won_li_amt"));
			rec.spc_dduc_mogg_loan_amt = Util.checkString(rset0.getString("spc_dduc_mogg_loan_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_1500_LDataSet ds = (HD_YADJM_1500_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_1500_LCURLISTRecord curlistRec = (HD_YADJM_1500_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.labr_incm_impt_amt%>
<%= curlistRec.labr_incm_dduc%>
<%= curlistRec.labr_incm_amt%>
<%= curlistRec.base_dduc_slf%>
<%= curlistRec.base_dduc_spos%>
<%= curlistRec.base_dduc_child%>
<%= curlistRec.base_dduc_oldg%>
<%= curlistRec.faml_nops%>
<%= curlistRec.addm_dduc_rspc%>
<%= curlistRec.rspc_nops%>
<%= curlistRec.addm_dduc_obcl_pers%>
<%= curlistRec.obcl_pers_nops%>
<%= curlistRec.addm_dduc_fml_hshd%>
<%= curlistRec.addm_dduc_care_fee%>
<%= curlistRec.child_care_fee_nops%>
<%= curlistRec.adopt_dduc%>
<%= curlistRec.adopt_dduc_nops%>
<%= curlistRec.multi_child_addm_dduc%>
<%= curlistRec.multi_child_nops%>
<%= curlistRec.pens_savg_incm_dduc%>
<%= curlistRec.np_insr_fee_dduc%>
<%= curlistRec.spc_dduc_insr_fee%>
<%= curlistRec.spc_dduc_hosp_fee%>
<%= curlistRec.spc_dduc_edu_fee%>
<%= curlistRec.spc_dduc_hous_fund%>
<%= curlistRec.spc_dduc_dona_amt%>
<%= curlistRec.spc_dduc_wedd_etc%>
<%= curlistRec.spc_dduc_stot%>
<%= curlistRec.std_dduc_amt%>
<%= curlistRec.crdt_card_use_amt%>
<%= curlistRec.vent_invsm_1%>
<%= curlistRec.vent_invsm_2%>
<%= curlistRec.stock_save%>
<%= curlistRec.tax_rl_dduc_prsn_pens%>
<%= curlistRec.tax_rl_dduc_tech_manpwr%>
<%= curlistRec.tax_rl_dduc_etc%>
<%= curlistRec.txn_std_amt%>
<%= curlistRec.calc_incm_tax%>
<%= curlistRec.tax_amt_dduc_labr_incm%>
<%= curlistRec.tax_amt_dduc_forn_pymt%>
<%= curlistRec.tax_amt_dduc_hous_loan_amt_int%>
<%= curlistRec.tax_amt_dduc_stok_savg%>
<%= curlistRec.tax_amt_dduc_savg%>
<%= curlistRec.tax_amt_dduc_hous_fund%>
<%= curlistRec.tax_amt_dduc_ltrm_savg%>
<%= curlistRec.tax_amt_dduc_polt_fund%>
<%= curlistRec.tax_amt_dduc_etc%>
<%= curlistRec.tax_amt_dduc_stot%>
<%= curlistRec.tax_amt_redu_incm_tax_law%>
<%= curlistRec.tax_amt_redu_tax_rl%>
<%= curlistRec.tax_amt_redu_etc%>
<%= curlistRec.tax_amt_redu_stot%>
<%= curlistRec.deci_incm_tax%>
<%= curlistRec.deci_farm_spc_tax%>
<%= curlistRec.deci_res_tax%>
<%= curlistRec.deci_tax_stot%>
<%= curlistRec.befo_pymt_incm_tax%>
<%= curlistRec.befo_pymt_farm_spc_tax%>
<%= curlistRec.befo_pymt_res_tax%>
<%= curlistRec.befo_pymt_tax_stot%>
<%= curlistRec.now_pymt_incm_tax%>
<%= curlistRec.now_pymt_farm_spc_tax%>
<%= curlistRec.now_pymt_res_tax%>
<%= curlistRec.now_pymt_tax_stot%>
<%= curlistRec.dedu_labr_incm_amt%>
<%= curlistRec.dedu_incm_tax%>
<%= curlistRec.dedu_farm_spc_tax%>
<%= curlistRec.dedu_res_tax%>
<%= curlistRec.dedu_tax_stot%>
<%= curlistRec.rvrs_prd_frdt%>
<%= curlistRec.rvrs_prd_todt%>
<%= curlistRec.redu_prd_frdt%>
<%= curlistRec.redu_prd_todt%>
<%= curlistRec.spc_dduc_won_li_amt%>
<%= curlistRec.spc_dduc_mogg_loan_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 18 09:14:01 KST 2010 */