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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_5002_334_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_5002_334_LDataSet(){}
	public HD_SALY_5002_334_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_SALY_5002_334_LCURLISTRecord rec = new HD_SALY_5002_334_LCURLISTRecord();
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.shft_bank_nm = Util.checkString(rset0.getString("shft_bank_nm"));
			rec.shft_acct_no = Util.checkString(rset0.getString("shft_acct_no"));
			rec.saly_pay_dt = Util.checkString(rset0.getString("saly_pay_dt"));
			rec.base_saly = Util.checkString(rset0.getString("base_saly"));
			rec.posk_saly = Util.checkString(rset0.getString("posk_saly"));
			rec.bns_saly = Util.checkString(rset0.getString("bns_saly"));
			rec.month_amt = Util.checkString(rset0.getString("month_amt"));
			rec.year_amt = Util.checkString(rset0.getString("year_amt"));
			rec.non_tax_food_alon = Util.checkString(rset0.getString("non_tax_food_alon"));
			rec.non_tax_auto_driv_alon = Util.checkString(rset0.getString("non_tax_auto_driv_alon"));
			rec.non_tax_jrnst = Util.checkString(rset0.getString("non_tax_jrnst"));
			rec.evngt_saly = Util.checkString(rset0.getString("evngt_saly"));
			rec.congr_fee = Util.checkString(rset0.getString("congr_fee"));
			rec.etc_alon_saly = Util.checkString(rset0.getString("etc_alon_saly"));
			rec.hody_duty_alon = Util.checkString(rset0.getString("hody_duty_alon"));
			rec.welfare_fee = Util.checkString(rset0.getString("welfare_fee"));
			rec.yymm_alon = Util.checkString(rset0.getString("yymm_alon"));
			rec.prvmm_mstk_saly = Util.checkString(rset0.getString("prvmm_mstk_saly"));
			rec.retr_saly = Util.checkString(rset0.getString("retr_saly"));
			rec.tot_pay_saly = Util.checkString(rset0.getString("tot_pay_saly"));
			rec.deci_incm_tax = Util.checkString(rset0.getString("deci_incm_tax"));
			rec.deci_res_tax = Util.checkString(rset0.getString("deci_res_tax"));
			rec.hlth_insr_fee = Util.checkString(rset0.getString("hlth_insr_fee"));
			rec.np_slf_ctrb_amt = Util.checkString(rset0.getString("np_slf_ctrb_amt"));
			rec.emp_insr_fee = Util.checkString(rset0.getString("emp_insr_fee"));
			rec.jnl_lon = Util.checkString(rset0.getString("jnl_lon"));
			rec.repay_scl_exps = Util.checkString(rset0.getString("repay_scl_exps"));
			rec.hlth_insr_med_care_insr_fee = Util.checkString(rset0.getString("hlth_insr_med_care_insr_fee"));
			rec.hlth_insr_fee_adjm = Util.checkString(rset0.getString("hlth_insr_fee_adjm"));
			rec.crc_dus_tot = Util.checkString(rset0.getString("crc_dus_tot"));
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
			rec.adpay_amt = Util.checkString(rset0.getString("adpay_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_5002_334_LDataSet ds = (HD_SALY_5002_334_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_5002_334_LCURLISTRecord curlistRec = (HD_SALY_5002_334_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.flnm%>
<%= curlistRec.emp_no%>
<%= curlistRec.dept_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.shft_bank_nm%>
<%= curlistRec.shft_acct_no%>
<%= curlistRec.saly_pay_dt%>
<%= curlistRec.bvarchar2e_saly%>
<%= curlistRec.posk_saly%>
<%= curlistRec.bns_saly%>
<%= curlistRec.month_amt%>
<%= curlistRec.year_amt%>
<%= curlistRec.non_tax_food_alon%>
<%= curlistRec.non_tax_auto_driv_alon%>
<%= curlistRec.non_tax_jrnst%>
<%= curlistRec.evngt_saly%>
<%= curlistRec.congr_fee%>
<%= curlistRec.etc_alon_saly%>
<%= curlistRec.hody_duty_alon%>
<%= curlistRec.welfare_fee%>
<%= curlistRec.yymm_alon%>
<%= curlistRec.retr_saly%>
<%= curlistRec.tot_pay_saly%>
<%= curlistRec.deci_incm_tax%>
<%= curlistRec.deci_res_tax%>
<%= curlistRec.hlth_insr_fee%>
<%= curlistRec.np_slf_ctrb_amt%>
<%= curlistRec.emp_insr_fee%>
<%= curlistRec.jnl_lon%>
<%= curlistRec.repay_scl_exps%>
<%= curlistRec.hlth_insr_med_care_insr_fee%>
<%= curlistRec.hlth_insr_fee_adjm%>
<%= curlistRec.paty_dus_tot%>
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
<%= curlistRec.adpay_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 09 11:42:10 KST 2014 */