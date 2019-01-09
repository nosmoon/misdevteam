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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6252_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String cmpy_cd;
	public String erplace_cd;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public String non_dduc_resn_clsf;
	public String tax_stmt_num_shet;
	public String suply_amt;
	public String vat_amt;
	public long comn_purc_suply_amt;
	public long comn_purc_vat_amt;
	public long suply_amt_etc;
	public long rtax_suply_amt_etc;
	public long rtax_enpr_ratio;
	public long non_dduc_purc_vat_amt;
	public long calc_aft_suply_amt;
	public long tot_comn_purc_vat_amt;
	public long tot_suply_amt_etc;
	public long tot_rtax_suply_amt_etc;
	public long rtax_enpr_fix_ratio;
	public long tot_non_dduc_purc_vat_amt;
	public long pre_non_dduc_purc_vat_amt;
	public long add_non_dduc_purc_vat_amt;
	public long tot_calc_aft_suply_amt;
	public long gds_purc_vat_amt;
	public long ck_rate;
	public long txn_prd_cnt;
	public long redu_ratio_pymt_re_calc;
	public long incr_redu_rtax_enpr_ratio;
	public long adjm_add_non_dduc_purc_vat;
	public long adjm_calc_aft_suply_amt;

	public FC_ACCT_6252_ADM(){}
	public FC_ACCT_6252_ADM(String flag, String incmg_pers, String incmg_pers_ipadd, String cmpy_cd, String erplace_cd, String vat_fr_yymm, String vat_to_yymm, String non_dduc_resn_clsf, String tax_stmt_num_shet, String suply_amt, String vat_amt, long comn_purc_suply_amt, long comn_purc_vat_amt, long suply_amt_etc, long rtax_suply_amt_etc, long rtax_enpr_ratio, long non_dduc_purc_vat_amt, long calc_aft_suply_amt, long tot_comn_purc_vat_amt, long tot_suply_amt_etc, long tot_rtax_suply_amt_etc, long rtax_enpr_fix_ratio, long tot_non_dduc_purc_vat_amt, long pre_non_dduc_purc_vat_amt, long add_non_dduc_purc_vat_amt, long tot_calc_aft_suply_amt, long gds_purc_vat_amt, long ck_rate, long txn_prd_cnt, long redu_ratio_pymt_re_calc, long incr_redu_rtax_enpr_ratio, long adjm_add_non_dduc_purc_vat, long adjm_calc_aft_suply_amt){
		this.flag = flag;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.cmpy_cd = cmpy_cd;
		this.erplace_cd = erplace_cd;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.non_dduc_resn_clsf = non_dduc_resn_clsf;
		this.tax_stmt_num_shet = tax_stmt_num_shet;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
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
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setNon_dduc_resn_clsf(String non_dduc_resn_clsf){
		this.non_dduc_resn_clsf = non_dduc_resn_clsf;
	}

	public void setTax_stmt_num_shet(String tax_stmt_num_shet){
		this.tax_stmt_num_shet = tax_stmt_num_shet;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setComn_purc_suply_amt(long comn_purc_suply_amt){
		this.comn_purc_suply_amt = comn_purc_suply_amt;
	}

	public void setComn_purc_vat_amt(long comn_purc_vat_amt){
		this.comn_purc_vat_amt = comn_purc_vat_amt;
	}

	public void setSuply_amt_etc(long suply_amt_etc){
		this.suply_amt_etc = suply_amt_etc;
	}

	public void setRtax_suply_amt_etc(long rtax_suply_amt_etc){
		this.rtax_suply_amt_etc = rtax_suply_amt_etc;
	}

	public void setRtax_enpr_ratio(long rtax_enpr_ratio){
		this.rtax_enpr_ratio = rtax_enpr_ratio;
	}

	public void setNon_dduc_purc_vat_amt(long non_dduc_purc_vat_amt){
		this.non_dduc_purc_vat_amt = non_dduc_purc_vat_amt;
	}

	public void setCalc_aft_suply_amt(long calc_aft_suply_amt){
		this.calc_aft_suply_amt = calc_aft_suply_amt;
	}

	public void setTot_comn_purc_vat_amt(long tot_comn_purc_vat_amt){
		this.tot_comn_purc_vat_amt = tot_comn_purc_vat_amt;
	}

	public void setTot_suply_amt_etc(long tot_suply_amt_etc){
		this.tot_suply_amt_etc = tot_suply_amt_etc;
	}

	public void setTot_rtax_suply_amt_etc(long tot_rtax_suply_amt_etc){
		this.tot_rtax_suply_amt_etc = tot_rtax_suply_amt_etc;
	}

	public void setRtax_enpr_fix_ratio(long rtax_enpr_fix_ratio){
		this.rtax_enpr_fix_ratio = rtax_enpr_fix_ratio;
	}

	public void setTot_non_dduc_purc_vat_amt(long tot_non_dduc_purc_vat_amt){
		this.tot_non_dduc_purc_vat_amt = tot_non_dduc_purc_vat_amt;
	}

	public void setPre_non_dduc_purc_vat_amt(long pre_non_dduc_purc_vat_amt){
		this.pre_non_dduc_purc_vat_amt = pre_non_dduc_purc_vat_amt;
	}

	public void setAdd_non_dduc_purc_vat_amt(long add_non_dduc_purc_vat_amt){
		this.add_non_dduc_purc_vat_amt = add_non_dduc_purc_vat_amt;
	}

	public void setTot_calc_aft_suply_amt(long tot_calc_aft_suply_amt){
		this.tot_calc_aft_suply_amt = tot_calc_aft_suply_amt;
	}

	public void setGds_purc_vat_amt(long gds_purc_vat_amt){
		this.gds_purc_vat_amt = gds_purc_vat_amt;
	}

	public void setCk_rate(long ck_rate){
		this.ck_rate = ck_rate;
	}

	public void setTxn_prd_cnt(long txn_prd_cnt){
		this.txn_prd_cnt = txn_prd_cnt;
	}

	public void setRedu_ratio_pymt_re_calc(long redu_ratio_pymt_re_calc){
		this.redu_ratio_pymt_re_calc = redu_ratio_pymt_re_calc;
	}

	public void setIncr_redu_rtax_enpr_ratio(long incr_redu_rtax_enpr_ratio){
		this.incr_redu_rtax_enpr_ratio = incr_redu_rtax_enpr_ratio;
	}

	public void setAdjm_add_non_dduc_purc_vat(long adjm_add_non_dduc_purc_vat){
		this.adjm_add_non_dduc_purc_vat = adjm_add_non_dduc_purc_vat;
	}

	public void setAdjm_calc_aft_suply_amt(long adjm_calc_aft_suply_amt){
		this.adjm_calc_aft_suply_amt = adjm_calc_aft_suply_amt;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getNon_dduc_resn_clsf(){
		return this.non_dduc_resn_clsf;
	}

	public String getTax_stmt_num_shet(){
		return this.tax_stmt_num_shet;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public long getComn_purc_suply_amt(){
		return this.comn_purc_suply_amt;
	}

	public long getComn_purc_vat_amt(){
		return this.comn_purc_vat_amt;
	}

	public long getSuply_amt_etc(){
		return this.suply_amt_etc;
	}

	public long getRtax_suply_amt_etc(){
		return this.rtax_suply_amt_etc;
	}

	public long getRtax_enpr_ratio(){
		return this.rtax_enpr_ratio;
	}

	public long getNon_dduc_purc_vat_amt(){
		return this.non_dduc_purc_vat_amt;
	}

	public long getCalc_aft_suply_amt(){
		return this.calc_aft_suply_amt;
	}

	public long getTot_comn_purc_vat_amt(){
		return this.tot_comn_purc_vat_amt;
	}

	public long getTot_suply_amt_etc(){
		return this.tot_suply_amt_etc;
	}

	public long getTot_rtax_suply_amt_etc(){
		return this.tot_rtax_suply_amt_etc;
	}

	public long getRtax_enpr_fix_ratio(){
		return this.rtax_enpr_fix_ratio;
	}

	public long getTot_non_dduc_purc_vat_amt(){
		return this.tot_non_dduc_purc_vat_amt;
	}

	public long getPre_non_dduc_purc_vat_amt(){
		return this.pre_non_dduc_purc_vat_amt;
	}

	public long getAdd_non_dduc_purc_vat_amt(){
		return this.add_non_dduc_purc_vat_amt;
	}

	public long getTot_calc_aft_suply_amt(){
		return this.tot_calc_aft_suply_amt;
	}

	public long getGds_purc_vat_amt(){
		return this.gds_purc_vat_amt;
	}

	public long getCk_rate(){
		return this.ck_rate;
	}

	public long getTxn_prd_cnt(){
		return this.txn_prd_cnt;
	}

	public long getRedu_ratio_pymt_re_calc(){
		return this.redu_ratio_pymt_re_calc;
	}

	public long getIncr_redu_rtax_enpr_ratio(){
		return this.incr_redu_rtax_enpr_ratio;
	}

	public long getAdjm_add_non_dduc_purc_vat(){
		return this.adjm_add_non_dduc_purc_vat;
	}

	public long getAdjm_calc_aft_suply_amt(){
		return this.adjm_calc_aft_suply_amt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6252_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6252_ADM dm = (FC_ACCT_6252_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.incmg_pers_ipadd);
		cstmt.setString(6, dm.cmpy_cd);
		cstmt.setString(7, dm.erplace_cd);
		cstmt.setString(8, dm.vat_fr_yymm);
		cstmt.setString(9, dm.vat_to_yymm);
		cstmt.setString(10, dm.non_dduc_resn_clsf);
		cstmt.setString(11, dm.tax_stmt_num_shet);
		cstmt.setString(12, dm.suply_amt);
		cstmt.setString(13, dm.vat_amt);
		cstmt.setLong(14, dm.comn_purc_suply_amt);
		cstmt.setLong(15, dm.comn_purc_vat_amt);
		cstmt.setLong(16, dm.suply_amt_etc);
		cstmt.setLong(17, dm.rtax_suply_amt_etc);
		cstmt.setLong(18, dm.rtax_enpr_ratio);
		cstmt.setLong(19, dm.non_dduc_purc_vat_amt);
		cstmt.setLong(20, dm.calc_aft_suply_amt);
		cstmt.setLong(21, dm.tot_comn_purc_vat_amt);
		cstmt.setLong(22, dm.tot_suply_amt_etc);
		cstmt.setLong(23, dm.tot_rtax_suply_amt_etc);
		cstmt.setLong(24, dm.rtax_enpr_fix_ratio);
		cstmt.setLong(25, dm.tot_non_dduc_purc_vat_amt);
		cstmt.setLong(26, dm.pre_non_dduc_purc_vat_amt);
		cstmt.setLong(27, dm.add_non_dduc_purc_vat_amt);
		cstmt.setLong(28, dm.tot_calc_aft_suply_amt);
		cstmt.setLong(29, dm.gds_purc_vat_amt);
		cstmt.setLong(30, dm.ck_rate);
		cstmt.setLong(31, dm.txn_prd_cnt);
		cstmt.setLong(32, dm.redu_ratio_pymt_re_calc);
		cstmt.setLong(33, dm.incr_redu_rtax_enpr_ratio);
		cstmt.setLong(34, dm.adjm_add_non_dduc_purc_vat);
		cstmt.setLong(35, dm.adjm_calc_aft_suply_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6252_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("vat_fr_yymm = [" + getVat_fr_yymm() + "]");
		System.out.println("vat_to_yymm = [" + getVat_to_yymm() + "]");
		System.out.println("non_dduc_resn_clsf = [" + getNon_dduc_resn_clsf() + "]");
		System.out.println("tax_stmt_num_shet = [" + getTax_stmt_num_shet() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("comn_purc_suply_amt = [" + getComn_purc_suply_amt() + "]");
		System.out.println("comn_purc_vat_amt = [" + getComn_purc_vat_amt() + "]");
		System.out.println("suply_amt_etc = [" + getSuply_amt_etc() + "]");
		System.out.println("rtax_suply_amt_etc = [" + getRtax_suply_amt_etc() + "]");
		System.out.println("rtax_enpr_ratio = [" + getRtax_enpr_ratio() + "]");
		System.out.println("non_dduc_purc_vat_amt = [" + getNon_dduc_purc_vat_amt() + "]");
		System.out.println("calc_aft_suply_amt = [" + getCalc_aft_suply_amt() + "]");
		System.out.println("tot_comn_purc_vat_amt = [" + getTot_comn_purc_vat_amt() + "]");
		System.out.println("tot_suply_amt_etc = [" + getTot_suply_amt_etc() + "]");
		System.out.println("tot_rtax_suply_amt_etc = [" + getTot_rtax_suply_amt_etc() + "]");
		System.out.println("rtax_enpr_fix_ratio = [" + getRtax_enpr_fix_ratio() + "]");
		System.out.println("tot_non_dduc_purc_vat_amt = [" + getTot_non_dduc_purc_vat_amt() + "]");
		System.out.println("pre_non_dduc_purc_vat_amt = [" + getPre_non_dduc_purc_vat_amt() + "]");
		System.out.println("add_non_dduc_purc_vat_amt = [" + getAdd_non_dduc_purc_vat_amt() + "]");
		System.out.println("tot_calc_aft_suply_amt = [" + getTot_calc_aft_suply_amt() + "]");
		System.out.println("gds_purc_vat_amt = [" + getGds_purc_vat_amt() + "]");
		System.out.println("ck_rate = [" + getCk_rate() + "]");
		System.out.println("txn_prd_cnt = [" + getTxn_prd_cnt() + "]");
		System.out.println("redu_ratio_pymt_re_calc = [" + getRedu_ratio_pymt_re_calc() + "]");
		System.out.println("incr_redu_rtax_enpr_ratio = [" + getIncr_redu_rtax_enpr_ratio() + "]");
		System.out.println("adjm_add_non_dduc_purc_vat = [" + getAdjm_add_non_dduc_purc_vat() + "]");
		System.out.println("adjm_calc_aft_suply_amt = [" + getAdjm_calc_aft_suply_amt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String vat_fr_yymm = req.getParameter("vat_fr_yymm");
if( vat_fr_yymm == null){
	System.out.println(this.toString+" : vat_fr_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_fr_yymm is "+vat_fr_yymm );
}
String vat_to_yymm = req.getParameter("vat_to_yymm");
if( vat_to_yymm == null){
	System.out.println(this.toString+" : vat_to_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_to_yymm is "+vat_to_yymm );
}
String non_dduc_resn_clsf = req.getParameter("non_dduc_resn_clsf");
if( non_dduc_resn_clsf == null){
	System.out.println(this.toString+" : non_dduc_resn_clsf is null" );
}else{
	System.out.println(this.toString+" : non_dduc_resn_clsf is "+non_dduc_resn_clsf );
}
String tax_stmt_num_shet = req.getParameter("tax_stmt_num_shet");
if( tax_stmt_num_shet == null){
	System.out.println(this.toString+" : tax_stmt_num_shet is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_num_shet is "+tax_stmt_num_shet );
}
String suply_amt = req.getParameter("suply_amt");
if( suply_amt == null){
	System.out.println(this.toString+" : suply_amt is null" );
}else{
	System.out.println(this.toString+" : suply_amt is "+suply_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String comn_purc_suply_amt = req.getParameter("comn_purc_suply_amt");
if( comn_purc_suply_amt == null){
	System.out.println(this.toString+" : comn_purc_suply_amt is null" );
}else{
	System.out.println(this.toString+" : comn_purc_suply_amt is "+comn_purc_suply_amt );
}
String comn_purc_vat_amt = req.getParameter("comn_purc_vat_amt");
if( comn_purc_vat_amt == null){
	System.out.println(this.toString+" : comn_purc_vat_amt is null" );
}else{
	System.out.println(this.toString+" : comn_purc_vat_amt is "+comn_purc_vat_amt );
}
String suply_amt_etc = req.getParameter("suply_amt_etc");
if( suply_amt_etc == null){
	System.out.println(this.toString+" : suply_amt_etc is null" );
}else{
	System.out.println(this.toString+" : suply_amt_etc is "+suply_amt_etc );
}
String rtax_suply_amt_etc = req.getParameter("rtax_suply_amt_etc");
if( rtax_suply_amt_etc == null){
	System.out.println(this.toString+" : rtax_suply_amt_etc is null" );
}else{
	System.out.println(this.toString+" : rtax_suply_amt_etc is "+rtax_suply_amt_etc );
}
String rtax_enpr_ratio = req.getParameter("rtax_enpr_ratio");
if( rtax_enpr_ratio == null){
	System.out.println(this.toString+" : rtax_enpr_ratio is null" );
}else{
	System.out.println(this.toString+" : rtax_enpr_ratio is "+rtax_enpr_ratio );
}
String non_dduc_purc_vat_amt = req.getParameter("non_dduc_purc_vat_amt");
if( non_dduc_purc_vat_amt == null){
	System.out.println(this.toString+" : non_dduc_purc_vat_amt is null" );
}else{
	System.out.println(this.toString+" : non_dduc_purc_vat_amt is "+non_dduc_purc_vat_amt );
}
String calc_aft_suply_amt = req.getParameter("calc_aft_suply_amt");
if( calc_aft_suply_amt == null){
	System.out.println(this.toString+" : calc_aft_suply_amt is null" );
}else{
	System.out.println(this.toString+" : calc_aft_suply_amt is "+calc_aft_suply_amt );
}
String tot_comn_purc_vat_amt = req.getParameter("tot_comn_purc_vat_amt");
if( tot_comn_purc_vat_amt == null){
	System.out.println(this.toString+" : tot_comn_purc_vat_amt is null" );
}else{
	System.out.println(this.toString+" : tot_comn_purc_vat_amt is "+tot_comn_purc_vat_amt );
}
String tot_suply_amt_etc = req.getParameter("tot_suply_amt_etc");
if( tot_suply_amt_etc == null){
	System.out.println(this.toString+" : tot_suply_amt_etc is null" );
}else{
	System.out.println(this.toString+" : tot_suply_amt_etc is "+tot_suply_amt_etc );
}
String tot_rtax_suply_amt_etc = req.getParameter("tot_rtax_suply_amt_etc");
if( tot_rtax_suply_amt_etc == null){
	System.out.println(this.toString+" : tot_rtax_suply_amt_etc is null" );
}else{
	System.out.println(this.toString+" : tot_rtax_suply_amt_etc is "+tot_rtax_suply_amt_etc );
}
String rtax_enpr_fix_ratio = req.getParameter("rtax_enpr_fix_ratio");
if( rtax_enpr_fix_ratio == null){
	System.out.println(this.toString+" : rtax_enpr_fix_ratio is null" );
}else{
	System.out.println(this.toString+" : rtax_enpr_fix_ratio is "+rtax_enpr_fix_ratio );
}
String tot_non_dduc_purc_vat_amt = req.getParameter("tot_non_dduc_purc_vat_amt");
if( tot_non_dduc_purc_vat_amt == null){
	System.out.println(this.toString+" : tot_non_dduc_purc_vat_amt is null" );
}else{
	System.out.println(this.toString+" : tot_non_dduc_purc_vat_amt is "+tot_non_dduc_purc_vat_amt );
}
String pre_non_dduc_purc_vat_amt = req.getParameter("pre_non_dduc_purc_vat_amt");
if( pre_non_dduc_purc_vat_amt == null){
	System.out.println(this.toString+" : pre_non_dduc_purc_vat_amt is null" );
}else{
	System.out.println(this.toString+" : pre_non_dduc_purc_vat_amt is "+pre_non_dduc_purc_vat_amt );
}
String add_non_dduc_purc_vat_amt = req.getParameter("add_non_dduc_purc_vat_amt");
if( add_non_dduc_purc_vat_amt == null){
	System.out.println(this.toString+" : add_non_dduc_purc_vat_amt is null" );
}else{
	System.out.println(this.toString+" : add_non_dduc_purc_vat_amt is "+add_non_dduc_purc_vat_amt );
}
String tot_calc_aft_suply_amt = req.getParameter("tot_calc_aft_suply_amt");
if( tot_calc_aft_suply_amt == null){
	System.out.println(this.toString+" : tot_calc_aft_suply_amt is null" );
}else{
	System.out.println(this.toString+" : tot_calc_aft_suply_amt is "+tot_calc_aft_suply_amt );
}
String gds_purc_vat_amt = req.getParameter("gds_purc_vat_amt");
if( gds_purc_vat_amt == null){
	System.out.println(this.toString+" : gds_purc_vat_amt is null" );
}else{
	System.out.println(this.toString+" : gds_purc_vat_amt is "+gds_purc_vat_amt );
}
String ck_rate = req.getParameter("ck_rate");
if( ck_rate == null){
	System.out.println(this.toString+" : ck_rate is null" );
}else{
	System.out.println(this.toString+" : ck_rate is "+ck_rate );
}
String txn_prd_cnt = req.getParameter("txn_prd_cnt");
if( txn_prd_cnt == null){
	System.out.println(this.toString+" : txn_prd_cnt is null" );
}else{
	System.out.println(this.toString+" : txn_prd_cnt is "+txn_prd_cnt );
}
String redu_ratio_pymt_re_calc = req.getParameter("redu_ratio_pymt_re_calc");
if( redu_ratio_pymt_re_calc == null){
	System.out.println(this.toString+" : redu_ratio_pymt_re_calc is null" );
}else{
	System.out.println(this.toString+" : redu_ratio_pymt_re_calc is "+redu_ratio_pymt_re_calc );
}
String incr_redu_rtax_enpr_ratio = req.getParameter("incr_redu_rtax_enpr_ratio");
if( incr_redu_rtax_enpr_ratio == null){
	System.out.println(this.toString+" : incr_redu_rtax_enpr_ratio is null" );
}else{
	System.out.println(this.toString+" : incr_redu_rtax_enpr_ratio is "+incr_redu_rtax_enpr_ratio );
}
String adjm_add_non_dduc_purc_vat = req.getParameter("adjm_add_non_dduc_purc_vat");
if( adjm_add_non_dduc_purc_vat == null){
	System.out.println(this.toString+" : adjm_add_non_dduc_purc_vat is null" );
}else{
	System.out.println(this.toString+" : adjm_add_non_dduc_purc_vat is "+adjm_add_non_dduc_purc_vat );
}
String adjm_calc_aft_suply_amt = req.getParameter("adjm_calc_aft_suply_amt");
if( adjm_calc_aft_suply_amt == null){
	System.out.println(this.toString+" : adjm_calc_aft_suply_amt is null" );
}else{
	System.out.println(this.toString+" : adjm_calc_aft_suply_amt is "+adjm_calc_aft_suply_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm"));
String vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm"));
String non_dduc_resn_clsf = Util.checkString(req.getParameter("non_dduc_resn_clsf"));
String tax_stmt_num_shet = Util.checkString(req.getParameter("tax_stmt_num_shet"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String comn_purc_suply_amt = Util.checkString(req.getParameter("comn_purc_suply_amt"));
String comn_purc_vat_amt = Util.checkString(req.getParameter("comn_purc_vat_amt"));
String suply_amt_etc = Util.checkString(req.getParameter("suply_amt_etc"));
String rtax_suply_amt_etc = Util.checkString(req.getParameter("rtax_suply_amt_etc"));
String rtax_enpr_ratio = Util.checkString(req.getParameter("rtax_enpr_ratio"));
String non_dduc_purc_vat_amt = Util.checkString(req.getParameter("non_dduc_purc_vat_amt"));
String calc_aft_suply_amt = Util.checkString(req.getParameter("calc_aft_suply_amt"));
String tot_comn_purc_vat_amt = Util.checkString(req.getParameter("tot_comn_purc_vat_amt"));
String tot_suply_amt_etc = Util.checkString(req.getParameter("tot_suply_amt_etc"));
String tot_rtax_suply_amt_etc = Util.checkString(req.getParameter("tot_rtax_suply_amt_etc"));
String rtax_enpr_fix_ratio = Util.checkString(req.getParameter("rtax_enpr_fix_ratio"));
String tot_non_dduc_purc_vat_amt = Util.checkString(req.getParameter("tot_non_dduc_purc_vat_amt"));
String pre_non_dduc_purc_vat_amt = Util.checkString(req.getParameter("pre_non_dduc_purc_vat_amt"));
String add_non_dduc_purc_vat_amt = Util.checkString(req.getParameter("add_non_dduc_purc_vat_amt"));
String tot_calc_aft_suply_amt = Util.checkString(req.getParameter("tot_calc_aft_suply_amt"));
String gds_purc_vat_amt = Util.checkString(req.getParameter("gds_purc_vat_amt"));
String ck_rate = Util.checkString(req.getParameter("ck_rate"));
String txn_prd_cnt = Util.checkString(req.getParameter("txn_prd_cnt"));
String redu_ratio_pymt_re_calc = Util.checkString(req.getParameter("redu_ratio_pymt_re_calc"));
String incr_redu_rtax_enpr_ratio = Util.checkString(req.getParameter("incr_redu_rtax_enpr_ratio"));
String adjm_add_non_dduc_purc_vat = Util.checkString(req.getParameter("adjm_add_non_dduc_purc_vat"));
String adjm_calc_aft_suply_amt = Util.checkString(req.getParameter("adjm_calc_aft_suply_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String vat_fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_fr_yymm")));
String vat_to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_to_yymm")));
String non_dduc_resn_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("non_dduc_resn_clsf")));
String tax_stmt_num_shet = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_num_shet")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String comn_purc_suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("comn_purc_suply_amt")));
String comn_purc_vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("comn_purc_vat_amt")));
String suply_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt_etc")));
String rtax_suply_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("rtax_suply_amt_etc")));
String rtax_enpr_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("rtax_enpr_ratio")));
String non_dduc_purc_vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("non_dduc_purc_vat_amt")));
String calc_aft_suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("calc_aft_suply_amt")));
String tot_comn_purc_vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_comn_purc_vat_amt")));
String tot_suply_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_suply_amt_etc")));
String tot_rtax_suply_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_rtax_suply_amt_etc")));
String rtax_enpr_fix_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("rtax_enpr_fix_ratio")));
String tot_non_dduc_purc_vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_non_dduc_purc_vat_amt")));
String pre_non_dduc_purc_vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_non_dduc_purc_vat_amt")));
String add_non_dduc_purc_vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("add_non_dduc_purc_vat_amt")));
String tot_calc_aft_suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_calc_aft_suply_amt")));
String gds_purc_vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("gds_purc_vat_amt")));
String ck_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("ck_rate")));
String txn_prd_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("txn_prd_cnt")));
String redu_ratio_pymt_re_calc = Util.Uni2Ksc(Util.checkString(req.getParameter("redu_ratio_pymt_re_calc")));
String incr_redu_rtax_enpr_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("incr_redu_rtax_enpr_ratio")));
String adjm_add_non_dduc_purc_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_add_non_dduc_purc_vat")));
String adjm_calc_aft_suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_calc_aft_suply_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setCmpy_cd(cmpy_cd);
dm.setErplace_cd(erplace_cd);
dm.setVat_fr_yymm(vat_fr_yymm);
dm.setVat_to_yymm(vat_to_yymm);
dm.setNon_dduc_resn_clsf(non_dduc_resn_clsf);
dm.setTax_stmt_num_shet(tax_stmt_num_shet);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setComn_purc_suply_amt(comn_purc_suply_amt);
dm.setComn_purc_vat_amt(comn_purc_vat_amt);
dm.setSuply_amt_etc(suply_amt_etc);
dm.setRtax_suply_amt_etc(rtax_suply_amt_etc);
dm.setRtax_enpr_ratio(rtax_enpr_ratio);
dm.setNon_dduc_purc_vat_amt(non_dduc_purc_vat_amt);
dm.setCalc_aft_suply_amt(calc_aft_suply_amt);
dm.setTot_comn_purc_vat_amt(tot_comn_purc_vat_amt);
dm.setTot_suply_amt_etc(tot_suply_amt_etc);
dm.setTot_rtax_suply_amt_etc(tot_rtax_suply_amt_etc);
dm.setRtax_enpr_fix_ratio(rtax_enpr_fix_ratio);
dm.setTot_non_dduc_purc_vat_amt(tot_non_dduc_purc_vat_amt);
dm.setPre_non_dduc_purc_vat_amt(pre_non_dduc_purc_vat_amt);
dm.setAdd_non_dduc_purc_vat_amt(add_non_dduc_purc_vat_amt);
dm.setTot_calc_aft_suply_amt(tot_calc_aft_suply_amt);
dm.setGds_purc_vat_amt(gds_purc_vat_amt);
dm.setCk_rate(ck_rate);
dm.setTxn_prd_cnt(txn_prd_cnt);
dm.setRedu_ratio_pymt_re_calc(redu_ratio_pymt_re_calc);
dm.setIncr_redu_rtax_enpr_ratio(incr_redu_rtax_enpr_ratio);
dm.setAdjm_add_non_dduc_purc_vat(adjm_add_non_dduc_purc_vat);
dm.setAdjm_calc_aft_suply_amt(adjm_calc_aft_suply_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 18 10:26:58 KST 2014 */