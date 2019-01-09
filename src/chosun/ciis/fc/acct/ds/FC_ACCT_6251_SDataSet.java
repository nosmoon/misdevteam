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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6251_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_nondducptcr_list_1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String erplace_cd;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public String ernm_tax;
	public String ern;
	public String presi_nm;
	public String data_cnt;
	public String ptcr_suply_amt;
	public String ptcr_vat_amt;
	public String comn_purc_suply_amt;
	public String comn_purc_vat_amt;
	public String suply_amt_etc;
	public String rtax_suply_amt_etc;
	public String rtax_enpr_ratio;
	public String non_dduc_purc_vat_amt;
	public String calc_aft_suply_amt;
	public String tot_comn_purc_vat_amt;
	public String tot_suply_amt_etc;
	public String tot_rtax_suply_amt_etc;
	public String rtax_enpr_fix_ratio;
	public String tot_non_dduc_purc_vat_amt;
	public String pre_non_dduc_purc_vat_amt;
	public String add_non_dduc_purc_vat_amt;
	public String tot_calc_aft_suply_amt;
	public String gds_purc_vat_amt;
	public String ck_rate;
	public String txn_prd_cnt;
	public String redu_ratio_pymt_re_calc;
	public String incr_redu_rtax_enpr_ratio;
	public String adjm_add_non_dduc_purc_vat;
	public String adjm_calc_aft_suply_amt;
	public String tot_suply_amt;
	public String tot_vat_amt;

	public FC_ACCT_6251_SDataSet(){}
	public FC_ACCT_6251_SDataSet(String errcode, String errmsg, String erplace_cd, String vat_fr_yymm, String vat_to_yymm, String ernm_tax, String ern, String presi_nm, String data_cnt, String ptcr_suply_amt, String ptcr_vat_amt, String comn_purc_suply_amt, String comn_purc_vat_amt, String suply_amt_etc, String rtax_suply_amt_etc, String rtax_enpr_ratio, String non_dduc_purc_vat_amt, String calc_aft_suply_amt, String tot_comn_purc_vat_amt, String tot_suply_amt_etc, String tot_rtax_suply_amt_etc, String rtax_enpr_fix_ratio, String tot_non_dduc_purc_vat_amt, String pre_non_dduc_purc_vat_amt, String add_non_dduc_purc_vat_amt, String tot_calc_aft_suply_amt, String gds_purc_vat_amt, String ck_rate, String txn_prd_cnt, String redu_ratio_pymt_re_calc, String incr_redu_rtax_enpr_ratio, String adjm_add_non_dduc_purc_vat, String adjm_calc_aft_suply_amt, String tot_suply_amt, String tot_vat_amt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.erplace_cd = erplace_cd;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.ernm_tax = ernm_tax;
		this.ern = ern;
		this.presi_nm = presi_nm;
		this.data_cnt = data_cnt;
		this.ptcr_suply_amt = ptcr_suply_amt;
		this.ptcr_vat_amt = ptcr_vat_amt;
		this.comn_purc_suply_amt = comn_purc_suply_amt;
		this.comn_purc_vat_amt = comn_purc_vat_amt;
		this.suply_amt_etc = suply_amt_etc;
		this.rtax_suply_amt_etc = rtax_suply_amt_etc;
		this.rtax_enpr_ratio = rtax_enpr_ratio;
		this.non_dduc_purc_vat_amt = non_dduc_purc_vat_amt;
		this.calc_aft_suply_amt = calc_aft_suply_amt;
		this.tot_comn_purc_vat_amt = tot_comn_purc_vat_amt;
		this.tot_suply_amt_etc = tot_suply_amt_etc;
		this.tot_rtax_suply_amt_etc = tot_rtax_suply_amt_etc;
		this.rtax_enpr_fix_ratio = rtax_enpr_fix_ratio;
		this.tot_non_dduc_purc_vat_amt = tot_non_dduc_purc_vat_amt;
		this.pre_non_dduc_purc_vat_amt = pre_non_dduc_purc_vat_amt;
		this.add_non_dduc_purc_vat_amt = add_non_dduc_purc_vat_amt;
		this.tot_calc_aft_suply_amt = tot_calc_aft_suply_amt;
		this.gds_purc_vat_amt = gds_purc_vat_amt;
		this.ck_rate = ck_rate;
		this.txn_prd_cnt = txn_prd_cnt;
		this.redu_ratio_pymt_re_calc = redu_ratio_pymt_re_calc;
		this.incr_redu_rtax_enpr_ratio = incr_redu_rtax_enpr_ratio;
		this.adjm_add_non_dduc_purc_vat = adjm_add_non_dduc_purc_vat;
		this.adjm_calc_aft_suply_amt = adjm_calc_aft_suply_amt;
		this.tot_suply_amt = tot_suply_amt;
		this.tot_vat_amt = tot_vat_amt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setVat_fr_yymm(String vat_fr_yymm){
		this.vat_fr_yymm = vat_fr_yymm;
	}

	public void setVat_to_yymm(String vat_to_yymm){
		this.vat_to_yymm = vat_to_yymm;
	}

	public void setErnm_tax(String ernm_tax){
		this.ernm_tax = ernm_tax;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setData_cnt(String data_cnt){
		this.data_cnt = data_cnt;
	}

	public void setPtcr_suply_amt(String ptcr_suply_amt){
		this.ptcr_suply_amt = ptcr_suply_amt;
	}

	public void setPtcr_vat_amt(String ptcr_vat_amt){
		this.ptcr_vat_amt = ptcr_vat_amt;
	}

	public void setComn_purc_suply_amt(String comn_purc_suply_amt){
		this.comn_purc_suply_amt = comn_purc_suply_amt;
	}

	public void setComn_purc_vat_amt(String comn_purc_vat_amt){
		this.comn_purc_vat_amt = comn_purc_vat_amt;
	}

	public void setSuply_amt_etc(String suply_amt_etc){
		this.suply_amt_etc = suply_amt_etc;
	}

	public void setRtax_suply_amt_etc(String rtax_suply_amt_etc){
		this.rtax_suply_amt_etc = rtax_suply_amt_etc;
	}

	public void setRtax_enpr_ratio(String rtax_enpr_ratio){
		this.rtax_enpr_ratio = rtax_enpr_ratio;
	}

	public void setNon_dduc_purc_vat_amt(String non_dduc_purc_vat_amt){
		this.non_dduc_purc_vat_amt = non_dduc_purc_vat_amt;
	}

	public void setCalc_aft_suply_amt(String calc_aft_suply_amt){
		this.calc_aft_suply_amt = calc_aft_suply_amt;
	}

	public void setTot_comn_purc_vat_amt(String tot_comn_purc_vat_amt){
		this.tot_comn_purc_vat_amt = tot_comn_purc_vat_amt;
	}

	public void setTot_suply_amt_etc(String tot_suply_amt_etc){
		this.tot_suply_amt_etc = tot_suply_amt_etc;
	}

	public void setTot_rtax_suply_amt_etc(String tot_rtax_suply_amt_etc){
		this.tot_rtax_suply_amt_etc = tot_rtax_suply_amt_etc;
	}

	public void setRtax_enpr_fix_ratio(String rtax_enpr_fix_ratio){
		this.rtax_enpr_fix_ratio = rtax_enpr_fix_ratio;
	}

	public void setTot_non_dduc_purc_vat_amt(String tot_non_dduc_purc_vat_amt){
		this.tot_non_dduc_purc_vat_amt = tot_non_dduc_purc_vat_amt;
	}

	public void setPre_non_dduc_purc_vat_amt(String pre_non_dduc_purc_vat_amt){
		this.pre_non_dduc_purc_vat_amt = pre_non_dduc_purc_vat_amt;
	}

	public void setAdd_non_dduc_purc_vat_amt(String add_non_dduc_purc_vat_amt){
		this.add_non_dduc_purc_vat_amt = add_non_dduc_purc_vat_amt;
	}

	public void setTot_calc_aft_suply_amt(String tot_calc_aft_suply_amt){
		this.tot_calc_aft_suply_amt = tot_calc_aft_suply_amt;
	}

	public void setGds_purc_vat_amt(String gds_purc_vat_amt){
		this.gds_purc_vat_amt = gds_purc_vat_amt;
	}

	public void setCk_rate(String ck_rate){
		this.ck_rate = ck_rate;
	}

	public void setTxn_prd_cnt(String txn_prd_cnt){
		this.txn_prd_cnt = txn_prd_cnt;
	}

	public void setRedu_ratio_pymt_re_calc(String redu_ratio_pymt_re_calc){
		this.redu_ratio_pymt_re_calc = redu_ratio_pymt_re_calc;
	}

	public void setIncr_redu_rtax_enpr_ratio(String incr_redu_rtax_enpr_ratio){
		this.incr_redu_rtax_enpr_ratio = incr_redu_rtax_enpr_ratio;
	}

	public void setAdjm_add_non_dduc_purc_vat(String adjm_add_non_dduc_purc_vat){
		this.adjm_add_non_dduc_purc_vat = adjm_add_non_dduc_purc_vat;
	}

	public void setAdjm_calc_aft_suply_amt(String adjm_calc_aft_suply_amt){
		this.adjm_calc_aft_suply_amt = adjm_calc_aft_suply_amt;
	}

	public void setTot_suply_amt(String tot_suply_amt){
		this.tot_suply_amt = tot_suply_amt;
	}

	public void setTot_vat_amt(String tot_vat_amt){
		this.tot_vat_amt = tot_vat_amt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getVat_fr_yymm(){
		return this.vat_fr_yymm;
	}

	public String getVat_to_yymm(){
		return this.vat_to_yymm;
	}

	public String getErnm_tax(){
		return this.ernm_tax;
	}

	public String getErn(){
		return this.ern;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getData_cnt(){
		return this.data_cnt;
	}

	public String getPtcr_suply_amt(){
		return this.ptcr_suply_amt;
	}

	public String getPtcr_vat_amt(){
		return this.ptcr_vat_amt;
	}

	public String getComn_purc_suply_amt(){
		return this.comn_purc_suply_amt;
	}

	public String getComn_purc_vat_amt(){
		return this.comn_purc_vat_amt;
	}

	public String getSuply_amt_etc(){
		return this.suply_amt_etc;
	}

	public String getRtax_suply_amt_etc(){
		return this.rtax_suply_amt_etc;
	}

	public String getRtax_enpr_ratio(){
		return this.rtax_enpr_ratio;
	}

	public String getNon_dduc_purc_vat_amt(){
		return this.non_dduc_purc_vat_amt;
	}

	public String getCalc_aft_suply_amt(){
		return this.calc_aft_suply_amt;
	}

	public String getTot_comn_purc_vat_amt(){
		return this.tot_comn_purc_vat_amt;
	}

	public String getTot_suply_amt_etc(){
		return this.tot_suply_amt_etc;
	}

	public String getTot_rtax_suply_amt_etc(){
		return this.tot_rtax_suply_amt_etc;
	}

	public String getRtax_enpr_fix_ratio(){
		return this.rtax_enpr_fix_ratio;
	}

	public String getTot_non_dduc_purc_vat_amt(){
		return this.tot_non_dduc_purc_vat_amt;
	}

	public String getPre_non_dduc_purc_vat_amt(){
		return this.pre_non_dduc_purc_vat_amt;
	}

	public String getAdd_non_dduc_purc_vat_amt(){
		return this.add_non_dduc_purc_vat_amt;
	}

	public String getTot_calc_aft_suply_amt(){
		return this.tot_calc_aft_suply_amt;
	}

	public String getGds_purc_vat_amt(){
		return this.gds_purc_vat_amt;
	}

	public String getCk_rate(){
		return this.ck_rate;
	}

	public String getTxn_prd_cnt(){
		return this.txn_prd_cnt;
	}

	public String getRedu_ratio_pymt_re_calc(){
		return this.redu_ratio_pymt_re_calc;
	}

	public String getIncr_redu_rtax_enpr_ratio(){
		return this.incr_redu_rtax_enpr_ratio;
	}

	public String getAdjm_add_non_dduc_purc_vat(){
		return this.adjm_add_non_dduc_purc_vat;
	}

	public String getAdjm_calc_aft_suply_amt(){
		return this.adjm_calc_aft_suply_amt;
	}

	public String getTot_suply_amt(){
		return this.tot_suply_amt;
	}

	public String getTot_vat_amt(){
		return this.tot_vat_amt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			FC_ACCT_6251_SCUR_NONDDUCPTCR_LIST_1Record rec = new FC_ACCT_6251_SCUR_NONDDUCPTCR_LIST_1Record();
			rec.non_dduc_resn_clsf = Util.checkString(rset0.getString("non_dduc_resn_clsf"));
			rec.non_dduc_resn_clsf_nm = Util.checkString(rset0.getString("non_dduc_resn_clsf_nm"));
			rec.tax_stmt_num_shet = rset0.getInt("tax_stmt_num_shet");
			rec.suply_amt = rset0.getLong("suply_amt");
			rec.vat_amt = rset0.getInt("vat_amt");
			this.cur_nondducptcr_list_1.add(rec);
		}
		this.erplace_cd = Util.checkString(cstmt.getString(10));
		this.vat_fr_yymm = Util.checkString(cstmt.getString(11));
		this.vat_to_yymm = Util.checkString(cstmt.getString(12));
		this.ernm_tax = Util.checkString(cstmt.getString(13));
		this.ern = Util.checkString(cstmt.getString(14));
		this.presi_nm = Util.checkString(cstmt.getString(15));
		this.data_cnt = Util.checkString(cstmt.getString(16));
		this.ptcr_suply_amt = Util.checkString(cstmt.getString(17));
		this.ptcr_vat_amt = Util.checkString(cstmt.getString(18));
		this.comn_purc_suply_amt = Util.checkString(cstmt.getString(19));
		this.comn_purc_vat_amt = Util.checkString(cstmt.getString(20));
		this.suply_amt_etc = Util.checkString(cstmt.getString(21));
		this.rtax_suply_amt_etc = Util.checkString(cstmt.getString(22));
		this.rtax_enpr_ratio = Util.checkString(cstmt.getString(23));
		this.non_dduc_purc_vat_amt = Util.checkString(cstmt.getString(24));
		this.calc_aft_suply_amt = Util.checkString(cstmt.getString(25));
		this.tot_comn_purc_vat_amt = Util.checkString(cstmt.getString(26));
		this.tot_suply_amt_etc = Util.checkString(cstmt.getString(27));
		this.tot_rtax_suply_amt_etc = Util.checkString(cstmt.getString(28));
		this.rtax_enpr_fix_ratio = Util.checkString(cstmt.getString(29));
		this.tot_non_dduc_purc_vat_amt = Util.checkString(cstmt.getString(30));
		this.pre_non_dduc_purc_vat_amt = Util.checkString(cstmt.getString(31));
		this.add_non_dduc_purc_vat_amt = Util.checkString(cstmt.getString(32));
		this.tot_calc_aft_suply_amt = Util.checkString(cstmt.getString(33));
		this.gds_purc_vat_amt = Util.checkString(cstmt.getString(34));
		this.ck_rate = Util.checkString(cstmt.getString(35));
		this.txn_prd_cnt = Util.checkString(cstmt.getString(36));
		this.redu_ratio_pymt_re_calc = Util.checkString(cstmt.getString(37));
		this.incr_redu_rtax_enpr_ratio = Util.checkString(cstmt.getString(38));
		this.adjm_add_non_dduc_purc_vat = Util.checkString(cstmt.getString(39));
		this.adjm_calc_aft_suply_amt = Util.checkString(cstmt.getString(40));
		this.tot_suply_amt = Util.checkString(cstmt.getString(41));
		this.tot_vat_amt = Util.checkString(cstmt.getString(42));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6251_SDataSet ds = (FC_ACCT_6251_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_nondducptcr_list_1.size(); i++){
		FC_ACCT_6251_SCUR_NONDDUCPTCR_LIST_1Record cur_nondducptcr_list_1Rec = (FC_ACCT_6251_SCUR_NONDDUCPTCR_LIST_1Record)ds.cur_nondducptcr_list_1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_nondducptcr_list_1()%>
<%= ds.getErplace_cd()%>
<%= ds.getVat_fr_yymm()%>
<%= ds.getVat_to_yymm()%>
<%= ds.getErnm_tax()%>
<%= ds.getErn()%>
<%= ds.getPresi_nm()%>
<%= ds.getData_cnt()%>
<%= ds.getPtcr_suply_amt()%>
<%= ds.getPtcr_vat_amt()%>
<%= ds.getComn_purc_suply_amt()%>
<%= ds.getComn_purc_vat_amt()%>
<%= ds.getSuply_amt_etc()%>
<%= ds.getRtax_suply_amt_etc()%>
<%= ds.getRtax_enpr_ratio()%>
<%= ds.getNon_dduc_purc_vat_amt()%>
<%= ds.getCalc_aft_suply_amt()%>
<%= ds.getTot_comn_purc_vat_amt()%>
<%= ds.getTot_suply_amt_etc()%>
<%= ds.getTot_rtax_suply_amt_etc()%>
<%= ds.getRtax_enpr_fix_ratio()%>
<%= ds.getTot_non_dduc_purc_vat_amt()%>
<%= ds.getPre_non_dduc_purc_vat_amt()%>
<%= ds.getAdd_non_dduc_purc_vat_amt()%>
<%= ds.getTot_calc_aft_suply_amt()%>
<%= ds.getGds_purc_vat_amt()%>
<%= ds.getCk_rate()%>
<%= ds.getTxn_prd_cnt()%>
<%= ds.getRedu_ratio_pymt_re_calc()%>
<%= ds.getIncr_redu_rtax_enpr_ratio()%>
<%= ds.getAdjm_add_non_dduc_purc_vat()%>
<%= ds.getAdjm_calc_aft_suply_amt()%>
<%= ds.getTot_suply_amt()%>
<%= ds.getTot_vat_amt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_nondducptcr_list_1Rec.non_dduc_resn_clsf%>
<%= cur_nondducptcr_list_1Rec.non_dduc_resn_clsf_nm%>
<%= cur_nondducptcr_list_1Rec.tax_stmt_num_shet%>
<%= cur_nondducptcr_list_1Rec.suply_amt%>
<%= cur_nondducptcr_list_1Rec.vat_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 12 16:31:29 KST 2016 */