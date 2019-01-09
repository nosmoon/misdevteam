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


package chosun.ciis.hd.emsy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.emsy.dm.*;
import chosun.ciis.hd.emsy.rec.*;

/**
 * 
 */


public class HD_EMSY_2010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EMSY_2010_LDataSet(){}
	public HD_EMSY_2010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_EMSY_2010_LCURLISTRecord rec = new HD_EMSY_2010_LCURLISTRecord();
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.shft_bank_nm = Util.checkString(rset0.getString("shft_bank_nm"));
			rec.shft_acct_no = Util.checkString(rset0.getString("shft_acct_no"));
			rec.saly_pay_dt = Util.checkString(rset0.getString("saly_pay_dt"));
			rec.base_saly = Util.checkString(rset0.getString("base_saly"));
			rec.posk_saly = Util.checkString(rset0.getString("posk_saly"));
			rec.week_hody_base_alon = Util.checkString(rset0.getString("week_hody_base_alon"));
			rec.week_hody_cmpn_alon = Util.checkString(rset0.getString("week_hody_cmpn_alon"));
			rec.lgl_hody_alon = Util.checkString(rset0.getString("lgl_hody_alon"));
			rec.nissu_dd_alon = Util.checkString(rset0.getString("nissu_dd_alon"));
			rec.vgl_fee = Util.checkString(rset0.getString("vgl_fee"));
			rec.ovt_alon = Util.checkString(rset0.getString("ovt_alon"));
			rec.corr_base_stay_fee = Util.checkString(rset0.getString("corr_base_stay_fee"));
			rec.prvmm_mstk_dduc = Util.checkString(rset0.getString("prvmm_mstk_dduc"));
			rec.yymm_alon = Util.checkString(rset0.getString("yymm_alon"));
			rec.retr_saly = Util.checkString(rset0.getString("retr_saly"));
			rec.tot_pay_saly = Util.checkString(rset0.getString("tot_pay_saly"));
			rec.deci_incm_tax = Util.checkString(rset0.getString("deci_incm_tax"));
			rec.deci_res_tax = Util.checkString(rset0.getString("deci_res_tax"));
			rec.hlth_insr_fee = Util.checkString(rset0.getString("hlth_insr_fee"));
			rec.np_slf_ctrb_amt = Util.checkString(rset0.getString("np_slf_ctrb_amt"));
			rec.emp_insr_fee = Util.checkString(rset0.getString("emp_insr_fee"));
			rec.jnl_lon = Util.checkString(rset0.getString("jnl_lon"));
			rec.welf_lon = Util.checkString(rset0.getString("welf_lon"));
			rec.vgl_fee_tm = Util.checkString(rset0.getString("vgl_fee_tm"));
			rec.ovt_alon_tm = Util.checkString(rset0.getString("ovt_alon_tm"));
			rec.corr_base_stay_fee_tm = Util.checkString(rset0.getString("corr_base_stay_fee_tm"));
			rec.paty_crc_dduc_amt = Util.checkString(rset0.getString("paty_crc_dduc_amt"));
			rec.fitness_amt = Util.checkString(rset0.getString("fitness_amt"));
			rec.labor_dduc_amt = Util.checkString(rset0.getString("labor_dduc_amt"));
			rec.park_fee_dduc = Util.checkString(rset0.getString("park_fee_dduc"));
			rec.adv_dduc = Util.checkString(rset0.getString("adv_dduc"));
			rec.seiz_dduc_amt = Util.checkString(rset0.getString("seiz_dduc_amt"));
			rec.etc_dduc_amt = Util.checkString(rset0.getString("etc_dduc_amt"));
			rec.adjm_dedu_incm_tax = Util.checkString(rset0.getString("adjm_dedu_incm_tax"));
			rec.adjm_dedu_res_tax = Util.checkString(rset0.getString("adjm_dedu_res_tax"));
			rec.adjm_dedu_farm_spc_tax = Util.checkString(rset0.getString("adjm_dedu_farm_spc_tax"));
			rec.saly_dduc_stot = Util.checkString(rset0.getString("saly_dduc_stot"));
			rec.cal_pay_amt = Util.checkString(rset0.getString("cal_pay_amt"));
			rec.emp_clsf = Util.checkString(rset0.getString("emp_clsf"));
			rec.etcsaly_spc = Util.checkString(rset0.getString("etcsaly_spc"));
			rec.prsn_pens_dduc = Util.checkString(rset0.getString("prsn_pens_dduc"));
			rec.etc_dduc_remk = Util.checkString(rset0.getString("etc_dduc_remk"));
			rec.etc_dduc_nm1 = Util.checkString(rset0.getString("etc_dduc_nm1"));
			rec.etc_dduc_amt1 = Util.checkString(rset0.getString("etc_dduc_amt1"));
			rec.etc_dduc_nm2 = Util.checkString(rset0.getString("etc_dduc_nm2"));
			rec.etc_dduc_amt2 = Util.checkString(rset0.getString("etc_dduc_amt2"));
			rec.etc_dduc_nm3 = Util.checkString(rset0.getString("etc_dduc_nm3"));
			rec.etc_dduc_amt3 = Util.checkString(rset0.getString("etc_dduc_amt3"));
			rec.bns_saly = Util.checkString(rset0.getString("bns_saly"));
			rec.non_tax_food_alon = Util.checkString(rset0.getString("non_tax_food_alon"));
			rec.non_tax_auto_driv_alon = Util.checkString(rset0.getString("non_tax_auto_driv_alon"));
			rec.non_tax_jrnst = Util.checkString(rset0.getString("non_tax_jrnst"));
			rec.repay_scl_exps = Util.checkString(rset0.getString("repay_scl_exps"));
			rec.evngt_saly = Util.checkString(rset0.getString("evngt_saly"));
			rec.hlth_insr_med_care_insr_fee = Util.checkString(rset0.getString("hlth_insr_med_care_insr_fee"));
			rec.congr_fee = Util.checkString(rset0.getString("congr_fee"));
			rec.etc_alon_saly = Util.checkString(rset0.getString("etc_alon_saly"));
			rec.adpay_amt = Util.checkString(rset0.getString("adpay_amt"));
			rec.hody_duty_alon = Util.checkString(rset0.getString("hody_duty_alon"));
			rec.hlth_insr_fee_adjm = Util.checkString(rset0.getString("hlth_insr_fee_adjm"));
			rec.paty_dus_tot = Util.checkString(rset0.getString("paty_dus_tot"));
			rec.welfare_fee = Util.checkString(rset0.getString("welfare_fee"));
			rec.crc_dus_tot = Util.checkString(rset0.getString("crc_dus_tot"));
			rec.dty_acty_fee = Util.checkString(rset0.getString("dty_acty_fee"));
			rec.prvmm_mstk_saly = Util.checkString(rset0.getString("prvmm_mstk_saly"));
			rec.etc_dduc_nm4 = Util.checkString(rset0.getString("etc_dduc_nm4"));
			rec.etc_dduc_amt4 = Util.checkString(rset0.getString("etc_dduc_amt4"));
			rec.etc_dduc_nm5 = Util.checkString(rset0.getString("etc_dduc_nm5"));
			rec.etc_dduc_amt5 = Util.checkString(rset0.getString("etc_dduc_amt5"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EMSY_2010_LDataSet ds = (HD_EMSY_2010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EMSY_2010_LCURLISTRecord curlistRec = (HD_EMSY_2010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.prn%>
<%= curlistRec.flnm%>
<%= curlistRec.emp_no%>
<%= curlistRec.dept_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.shft_bank_nm%>
<%= curlistRec.shft_acct_no%>
<%= curlistRec.saly_pay_dt%>
<%= curlistRec.base_saly%>
<%= curlistRec.posk_saly%>
<%= curlistRec.week_hody_base_alon%>
<%= curlistRec.week_hody_cmpn_alon%>
<%= curlistRec.lgl_hody_alon%>
<%= curlistRec.nissu_dd_alon%>
<%= curlistRec.vgl_fee%>
<%= curlistRec.ovt_alon%>
<%= curlistRec.corr_base_stay_fee%>
<%= curlistRec.prvmm_mstk_dduc%>
<%= curlistRec.yymm_alon%>
<%= curlistRec.retr_saly%>
<%= curlistRec.tot_pay_saly%>
<%= curlistRec.deci_incm_tax%>
<%= curlistRec.deci_res_tax%>
<%= curlistRec.hlth_insr_fee%>
<%= curlistRec.np_slf_ctrb_amt%>
<%= curlistRec.emp_insr_fee%>
<%= curlistRec.jnl_lon%>
<%= curlistRec.welf_lon%>
<%= curlistRec.vgl_fee_tm%>
<%= curlistRec.ovt_alon_tm%>
<%= curlistRec.corr_base_stay_fee_tm%>
<%= curlistRec.paty_crc_dduc_amt%>
<%= curlistRec.fitness_amt%>
<%= curlistRec.labor_dduc_amt%>
<%= curlistRec.park_fee_dduc%>
<%= curlistRec.adv_dduc%>
<%= curlistRec.seiz_dduc_amt%>
<%= curlistRec.etc_dduc_amt%>
<%= curlistRec.adjm_dedu_incm_tax%>
<%= curlistRec.adjm_dedu_res_tax%>
<%= curlistRec.adjm_dedu_farm_spc_tax%>
<%= curlistRec.saly_dduc_stot%>
<%= curlistRec.cal_pay_amt%>
<%= curlistRec.emp_clsf%>
<%= curlistRec.etcsaly_spc%>
<%= curlistRec.prsn_pens_dduc%>
<%= curlistRec.etc_dduc_remk%>
<%= curlistRec.etc_dduc_nm1%>
<%= curlistRec.etc_dduc_amt1%>
<%= curlistRec.etc_dduc_nm2%>
<%= curlistRec.etc_dduc_amt2%>
<%= curlistRec.etc_dduc_nm3%>
<%= curlistRec.etc_dduc_amt3%>
<%= curlistRec.bns_saly%>
<%= curlistRec.non_tax_food_alon%>
<%= curlistRec.non_tax_auto_driv_alon%>
<%= curlistRec.non_tax_jrnst%>
<%= curlistRec.repay_scl_exps%>
<%= curlistRec.evngt_saly%>
<%= curlistRec.hlth_insr_med_care_insr_fee%>
<%= curlistRec.congr_fee%>
<%= curlistRec.etc_alon_saly%>
<%= curlistRec.adpay_amt%>
<%= curlistRec.hody_duty_alon%>
<%= curlistRec.hlth_insr_fee_adjm%>
<%= curlistRec.paty_dus_tot%>
<%= curlistRec.welfare_fee%>
<%= curlistRec.crc_dus_tot%>
<%= curlistRec.dty_acty_fee%>
<%= curlistRec.prvmm_mstk_saly%>
<%= curlistRec.etc_dduc_nm4%>
<%= curlistRec.etc_dduc_amt4%>
<%= curlistRec.etc_dduc_nm5%>
<%= curlistRec.etc_dduc_amt5%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 10 13:55:45 KST 2015 */