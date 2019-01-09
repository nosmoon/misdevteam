/***************************************************************************************************
* 파일명 : .java
* 기능 : 발송관리 - 발송비청구
* 작성일자 : 2009-11-11
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.ds.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_2540_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String callgb;
	public String area_cd;
	public String bank_cd;
	public String acct_mang_no;
	public String rmtt_dt;
	public String rmtt_plac;
	public String corp_clsf;
	public String rcpm_yymm;
	public String dlco_no;
	public String slip_occr_dt;
	public String make_dt;
	public String suply_amt;
	public String vat_amt;
	public String remk;
	public String elec_tax_bill_yn;
	public String elec_tax_issu_dt;
	public String mode_ar;
	public String bo_cdseq_ar;
	public String chrg_pers_ar;
	public String acct_tot_ar;
	public String acpt_tot_ar;
	public String amt1_ar;
	public String amt2_ar;
	public String amt3_ar;
	public String amt4_ar;
	public String amt5_ar;
	public String amt_sum_ar;
	public String rcpm_shet_no_ar;
	public String biz_reg_no_ar;
	public String bank_id_ar;
	public String acct_num_ar;
	public String tran_date_seq_ar;
	public String tran_amt_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_SAL_2540_ADM(){}
	public SE_SAL_2540_ADM(String cmpy_cd, String callgb, String area_cd, String bank_cd, String acct_mang_no, String rmtt_dt, String rmtt_plac, String corp_clsf, String rcpm_yymm, String dlco_no, String slip_occr_dt, String make_dt, String suply_amt, String vat_amt, String remk, String elec_tax_bill_yn, String elec_tax_issu_dt, String mode_ar, String bo_cdseq_ar, String chrg_pers_ar, String acct_tot_ar, String acpt_tot_ar, String amt1_ar, String amt2_ar, String amt3_ar, String amt4_ar, String amt5_ar, String amt_sum_ar, String rcpm_shet_no_ar, String biz_reg_no_ar, String bank_id_ar, String acct_num_ar, String tran_date_seq_ar, String tran_amt_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.callgb = callgb;
		this.area_cd = area_cd;
		this.bank_cd = bank_cd;
		this.acct_mang_no = acct_mang_no;
		this.rmtt_dt = rmtt_dt;
		this.rmtt_plac = rmtt_plac;
		this.corp_clsf = corp_clsf;
		this.rcpm_yymm = rcpm_yymm;
		this.dlco_no = dlco_no;
		this.slip_occr_dt = slip_occr_dt;
		this.make_dt = make_dt;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.remk = remk;
		this.elec_tax_bill_yn = elec_tax_bill_yn;
		this.elec_tax_issu_dt = elec_tax_issu_dt;
		this.mode_ar = mode_ar;
		this.bo_cdseq_ar = bo_cdseq_ar;
		this.chrg_pers_ar = chrg_pers_ar;
		this.acct_tot_ar = acct_tot_ar;
		this.acpt_tot_ar = acpt_tot_ar;
		this.amt1_ar = amt1_ar;
		this.amt2_ar = amt2_ar;
		this.amt3_ar = amt3_ar;
		this.amt4_ar = amt4_ar;
		this.amt5_ar = amt5_ar;
		this.amt_sum_ar = amt_sum_ar;
		this.rcpm_shet_no_ar = rcpm_shet_no_ar;
		this.biz_reg_no_ar = biz_reg_no_ar;
		this.bank_id_ar = bank_id_ar;
		this.acct_num_ar = acct_num_ar;
		this.tran_date_seq_ar = tran_date_seq_ar;
		this.tran_amt_ar = tran_amt_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCallgb(String callgb){
		this.callgb = callgb;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setAcct_mang_no(String acct_mang_no){
		this.acct_mang_no = acct_mang_no;
	}

	public void setRmtt_dt(String rmtt_dt){
		this.rmtt_dt = rmtt_dt;
	}

	public void setRmtt_plac(String rmtt_plac){
		this.rmtt_plac = rmtt_plac;
	}

	public void setCorp_clsf(String corp_clsf){
		this.corp_clsf = corp_clsf;
	}

	public void setRcpm_yymm(String rcpm_yymm){
		this.rcpm_yymm = rcpm_yymm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setElec_tax_bill_yn(String elec_tax_bill_yn){
		this.elec_tax_bill_yn = elec_tax_bill_yn;
	}

	public void setElec_tax_issu_dt(String elec_tax_issu_dt){
		this.elec_tax_issu_dt = elec_tax_issu_dt;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setBo_cdseq_ar(String bo_cdseq_ar){
		this.bo_cdseq_ar = bo_cdseq_ar;
	}

	public void setChrg_pers_ar(String chrg_pers_ar){
		this.chrg_pers_ar = chrg_pers_ar;
	}

	public void setAcct_tot_ar(String acct_tot_ar){
		this.acct_tot_ar = acct_tot_ar;
	}

	public void setAcpt_tot_ar(String acpt_tot_ar){
		this.acpt_tot_ar = acpt_tot_ar;
	}

	public void setAmt1_ar(String amt1_ar){
		this.amt1_ar = amt1_ar;
	}

	public void setAmt2_ar(String amt2_ar){
		this.amt2_ar = amt2_ar;
	}

	public void setAmt3_ar(String amt3_ar){
		this.amt3_ar = amt3_ar;
	}

	public void setAmt4_ar(String amt4_ar){
		this.amt4_ar = amt4_ar;
	}

	public void setAmt5_ar(String amt5_ar){
		this.amt5_ar = amt5_ar;
	}

	public void setAmt_sum_ar(String amt_sum_ar){
		this.amt_sum_ar = amt_sum_ar;
	}

	public void setRcpm_shet_no_ar(String rcpm_shet_no_ar){
		this.rcpm_shet_no_ar = rcpm_shet_no_ar;
	}

	public void setBiz_reg_no_ar(String biz_reg_no_ar){
		this.biz_reg_no_ar = biz_reg_no_ar;
	}

	public void setBank_id_ar(String bank_id_ar){
		this.bank_id_ar = bank_id_ar;
	}

	public void setAcct_num_ar(String acct_num_ar){
		this.acct_num_ar = acct_num_ar;
	}

	public void setTran_date_seq_ar(String tran_date_seq_ar){
		this.tran_date_seq_ar = tran_date_seq_ar;
	}

	public void setTran_amt_ar(String tran_amt_ar){
		this.tran_amt_ar = tran_amt_ar;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCallgb(){
		return this.callgb;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getAcct_mang_no(){
		return this.acct_mang_no;
	}

	public String getRmtt_dt(){
		return this.rmtt_dt;
	}

	public String getRmtt_plac(){
		return this.rmtt_plac;
	}

	public String getCorp_clsf(){
		return this.corp_clsf;
	}

	public String getRcpm_yymm(){
		return this.rcpm_yymm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getElec_tax_bill_yn(){
		return this.elec_tax_bill_yn;
	}

	public String getElec_tax_issu_dt(){
		return this.elec_tax_issu_dt;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getBo_cdseq_ar(){
		return this.bo_cdseq_ar;
	}

	public String getChrg_pers_ar(){
		return this.chrg_pers_ar;
	}

	public String getAcct_tot_ar(){
		return this.acct_tot_ar;
	}

	public String getAcpt_tot_ar(){
		return this.acpt_tot_ar;
	}

	public String getAmt1_ar(){
		return this.amt1_ar;
	}

	public String getAmt2_ar(){
		return this.amt2_ar;
	}

	public String getAmt3_ar(){
		return this.amt3_ar;
	}

	public String getAmt4_ar(){
		return this.amt4_ar;
	}

	public String getAmt5_ar(){
		return this.amt5_ar;
	}

	public String getAmt_sum_ar(){
		return this.amt_sum_ar;
	}

	public String getRcpm_shet_no_ar(){
		return this.rcpm_shet_no_ar;
	}

	public String getBiz_reg_no_ar(){
		return this.biz_reg_no_ar;
	}

	public String getBank_id_ar(){
		return this.bank_id_ar;
	}

	public String getAcct_num_ar(){
		return this.acct_num_ar;
	}

	public String getTran_date_seq_ar(){
		return this.tran_date_seq_ar;
	}

	public String getTran_amt_ar(){
		return this.tran_amt_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call SP_SE_SAL_2540_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_2540_ADM dm = (SE_SAL_2540_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.callgb);
		cstmt.setString(5, dm.area_cd);
		cstmt.setString(6, dm.bank_cd);
		cstmt.setString(7, dm.acct_mang_no);
		cstmt.setString(8, dm.rmtt_dt);
		cstmt.setString(9, dm.rmtt_plac);
		cstmt.setString(10, dm.corp_clsf);
		cstmt.setString(11, dm.rcpm_yymm);
		cstmt.setString(12, dm.dlco_no);
		cstmt.setString(13, dm.slip_occr_dt);
		cstmt.setString(14, dm.make_dt);
		cstmt.setString(15, dm.suply_amt);
		cstmt.setString(16, dm.vat_amt);
		cstmt.setString(17, dm.remk);
		cstmt.setString(18, dm.elec_tax_bill_yn);
		cstmt.setString(19, dm.elec_tax_issu_dt);
		cstmt.setString(20, dm.mode_ar);
		cstmt.setString(21, dm.bo_cdseq_ar);
		cstmt.setString(22, dm.chrg_pers_ar);
		cstmt.setString(23, dm.acct_tot_ar);
		cstmt.setString(24, dm.acpt_tot_ar);
		cstmt.setString(25, dm.amt1_ar);
		cstmt.setString(26, dm.amt2_ar);
		cstmt.setString(27, dm.amt3_ar);
		cstmt.setString(28, dm.amt4_ar);
		cstmt.setString(29, dm.amt5_ar);
		cstmt.setString(30, dm.amt_sum_ar);
		cstmt.setString(31, dm.rcpm_shet_no_ar);
		cstmt.setString(32, dm.biz_reg_no_ar);
		cstmt.setString(33, dm.bank_id_ar);
		cstmt.setString(34, dm.acct_num_ar);
		cstmt.setString(35, dm.tran_date_seq_ar);
		cstmt.setString(36, dm.tran_amt_ar);
		cstmt.setString(37, dm.incmg_pers);
		cstmt.setString(38, dm.incmg_pers_ip);
		cstmt.registerOutParameter(39, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_2540_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("callgb = " + getCallgb());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("bank_cd = " + getBank_cd());
        System.out.println("acct_mang_no = " + getAcct_mang_no());
        System.out.println("rmtt_dt = " + getRmtt_dt());
        System.out.println("rmtt_plac = " + getRmtt_plac());
        System.out.println("corp_clsf = " + getCorp_clsf());
        System.out.println("rcpm_yymm = " + getRcpm_yymm());
        System.out.println("dlco_no = " + getDlco_no());
        System.out.println("slip_occr_dt = " + getSlip_occr_dt());
        System.out.println("make_dt = " + getMake_dt());
        System.out.println("suply_amt = " + getSuply_amt());
        System.out.println("vat_amt = " + getVat_amt());
        System.out.println("remk = " + getRemk());
        System.out.println("elec_tax_bill_yn = " + getElec_tax_bill_yn());
        System.out.println("elec_tax_issu_dt = " + getElec_tax_issu_dt());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("bo_cdseq_ar = " + getBo_cdseq_ar());
        System.out.println("chrg_pers_ar = " + getChrg_pers_ar());
        System.out.println("acct_tot_ar = " + getAcct_tot_ar());
        System.out.println("acpt_tot_ar = " + getAcpt_tot_ar());
        System.out.println("amt1_ar = " + getAmt1_ar());
        System.out.println("amt2_ar = " + getAmt2_ar());
        System.out.println("amt3_ar = " + getAmt3_ar());
        System.out.println("amt4_ar = " + getAmt4_ar());
        System.out.println("amt5_ar = " + getAmt5_ar());
        System.out.println("amt_sum_ar = " + getAmt_sum_ar());
        System.out.println("rcpm_shet_no_ar = " + getRcpm_shet_no_ar());
        System.out.println("biz_reg_no_ar = " + getBiz_reg_no_ar());
        System.out.println("bank_id_ar = " + getBank_id_ar());
        System.out.println("acct_num_ar = " + getAcct_num_ar());
        System.out.println("tran_date_seq_ar = " + getTran_date_seq_ar());
        System.out.println("tran_amt_ar = " + getTran_amt_ar());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String callgb = req.getParameter("callgb");
if( callgb == null){
	System.out.println(this.toString+" : callgb is null" );
}else{
	System.out.println(this.toString+" : callgb is "+callgb );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String acct_mang_no = req.getParameter("acct_mang_no");
if( acct_mang_no == null){
	System.out.println(this.toString+" : acct_mang_no is null" );
}else{
	System.out.println(this.toString+" : acct_mang_no is "+acct_mang_no );
}
String rmtt_dt = req.getParameter("rmtt_dt");
if( rmtt_dt == null){
	System.out.println(this.toString+" : rmtt_dt is null" );
}else{
	System.out.println(this.toString+" : rmtt_dt is "+rmtt_dt );
}
String rmtt_plac = req.getParameter("rmtt_plac");
if( rmtt_plac == null){
	System.out.println(this.toString+" : rmtt_plac is null" );
}else{
	System.out.println(this.toString+" : rmtt_plac is "+rmtt_plac );
}
String corp_clsf = req.getParameter("corp_clsf");
if( corp_clsf == null){
	System.out.println(this.toString+" : corp_clsf is null" );
}else{
	System.out.println(this.toString+" : corp_clsf is "+corp_clsf );
}
String rcpm_yymm = req.getParameter("rcpm_yymm");
if( rcpm_yymm == null){
	System.out.println(this.toString+" : rcpm_yymm is null" );
}else{
	System.out.println(this.toString+" : rcpm_yymm is "+rcpm_yymm );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
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
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String elec_tax_bill_yn = req.getParameter("elec_tax_bill_yn");
if( elec_tax_bill_yn == null){
	System.out.println(this.toString+" : elec_tax_bill_yn is null" );
}else{
	System.out.println(this.toString+" : elec_tax_bill_yn is "+elec_tax_bill_yn );
}
String elec_tax_issu_dt = req.getParameter("elec_tax_issu_dt");
if( elec_tax_issu_dt == null){
	System.out.println(this.toString+" : elec_tax_issu_dt is null" );
}else{
	System.out.println(this.toString+" : elec_tax_issu_dt is "+elec_tax_issu_dt );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String bo_cdseq_ar = req.getParameter("bo_cdseq_ar");
if( bo_cdseq_ar == null){
	System.out.println(this.toString+" : bo_cdseq_ar is null" );
}else{
	System.out.println(this.toString+" : bo_cdseq_ar is "+bo_cdseq_ar );
}
String chrg_pers_ar = req.getParameter("chrg_pers_ar");
if( chrg_pers_ar == null){
	System.out.println(this.toString+" : chrg_pers_ar is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_ar is "+chrg_pers_ar );
}
String acct_tot_ar = req.getParameter("acct_tot_ar");
if( acct_tot_ar == null){
	System.out.println(this.toString+" : acct_tot_ar is null" );
}else{
	System.out.println(this.toString+" : acct_tot_ar is "+acct_tot_ar );
}
String acpt_tot_ar = req.getParameter("acpt_tot_ar");
if( acpt_tot_ar == null){
	System.out.println(this.toString+" : acpt_tot_ar is null" );
}else{
	System.out.println(this.toString+" : acpt_tot_ar is "+acpt_tot_ar );
}
String amt1_ar = req.getParameter("amt1_ar");
if( amt1_ar == null){
	System.out.println(this.toString+" : amt1_ar is null" );
}else{
	System.out.println(this.toString+" : amt1_ar is "+amt1_ar );
}
String amt2_ar = req.getParameter("amt2_ar");
if( amt2_ar == null){
	System.out.println(this.toString+" : amt2_ar is null" );
}else{
	System.out.println(this.toString+" : amt2_ar is "+amt2_ar );
}
String amt3_ar = req.getParameter("amt3_ar");
if( amt3_ar == null){
	System.out.println(this.toString+" : amt3_ar is null" );
}else{
	System.out.println(this.toString+" : amt3_ar is "+amt3_ar );
}
String amt4_ar = req.getParameter("amt4_ar");
if( amt4_ar == null){
	System.out.println(this.toString+" : amt4_ar is null" );
}else{
	System.out.println(this.toString+" : amt4_ar is "+amt4_ar );
}
String amt5_ar = req.getParameter("amt5_ar");
if( amt5_ar == null){
	System.out.println(this.toString+" : amt5_ar is null" );
}else{
	System.out.println(this.toString+" : amt5_ar is "+amt5_ar );
}
String amt_sum_ar = req.getParameter("amt_sum_ar");
if( amt_sum_ar == null){
	System.out.println(this.toString+" : amt_sum_ar is null" );
}else{
	System.out.println(this.toString+" : amt_sum_ar is "+amt_sum_ar );
}
String rcpm_shet_no_ar = req.getParameter("rcpm_shet_no_ar");
if( rcpm_shet_no_ar == null){
	System.out.println(this.toString+" : rcpm_shet_no_ar is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no_ar is "+rcpm_shet_no_ar );
}
String biz_reg_no_ar = req.getParameter("biz_reg_no_ar");
if( biz_reg_no_ar == null){
	System.out.println(this.toString+" : biz_reg_no_ar is null" );
}else{
	System.out.println(this.toString+" : biz_reg_no_ar is "+biz_reg_no_ar );
}
String bank_id_ar = req.getParameter("bank_id_ar");
if( bank_id_ar == null){
	System.out.println(this.toString+" : bank_id_ar is null" );
}else{
	System.out.println(this.toString+" : bank_id_ar is "+bank_id_ar );
}
String acct_num_ar = req.getParameter("acct_num_ar");
if( acct_num_ar == null){
	System.out.println(this.toString+" : acct_num_ar is null" );
}else{
	System.out.println(this.toString+" : acct_num_ar is "+acct_num_ar );
}
String tran_date_seq_ar = req.getParameter("tran_date_seq_ar");
if( tran_date_seq_ar == null){
	System.out.println(this.toString+" : tran_date_seq_ar is null" );
}else{
	System.out.println(this.toString+" : tran_date_seq_ar is "+tran_date_seq_ar );
}
String tran_amt_ar = req.getParameter("tran_amt_ar");
if( tran_amt_ar == null){
	System.out.println(this.toString+" : tran_amt_ar is null" );
}else{
	System.out.println(this.toString+" : tran_amt_ar is "+tran_amt_ar );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String callgb = Util.checkString(req.getParameter("callgb"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String acct_mang_no = Util.checkString(req.getParameter("acct_mang_no"));
String rmtt_dt = Util.checkString(req.getParameter("rmtt_dt"));
String rmtt_plac = Util.checkString(req.getParameter("rmtt_plac"));
String corp_clsf = Util.checkString(req.getParameter("corp_clsf"));
String rcpm_yymm = Util.checkString(req.getParameter("rcpm_yymm"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String remk = Util.checkString(req.getParameter("remk"));
String elec_tax_bill_yn = Util.checkString(req.getParameter("elec_tax_bill_yn"));
String elec_tax_issu_dt = Util.checkString(req.getParameter("elec_tax_issu_dt"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String bo_cdseq_ar = Util.checkString(req.getParameter("bo_cdseq_ar"));
String chrg_pers_ar = Util.checkString(req.getParameter("chrg_pers_ar"));
String acct_tot_ar = Util.checkString(req.getParameter("acct_tot_ar"));
String acpt_tot_ar = Util.checkString(req.getParameter("acpt_tot_ar"));
String amt1_ar = Util.checkString(req.getParameter("amt1_ar"));
String amt2_ar = Util.checkString(req.getParameter("amt2_ar"));
String amt3_ar = Util.checkString(req.getParameter("amt3_ar"));
String amt4_ar = Util.checkString(req.getParameter("amt4_ar"));
String amt5_ar = Util.checkString(req.getParameter("amt5_ar"));
String amt_sum_ar = Util.checkString(req.getParameter("amt_sum_ar"));
String rcpm_shet_no_ar = Util.checkString(req.getParameter("rcpm_shet_no_ar"));
String biz_reg_no_ar = Util.checkString(req.getParameter("biz_reg_no_ar"));
String bank_id_ar = Util.checkString(req.getParameter("bank_id_ar"));
String acct_num_ar = Util.checkString(req.getParameter("acct_num_ar"));
String tran_date_seq_ar = Util.checkString(req.getParameter("tran_date_seq_ar"));
String tran_amt_ar = Util.checkString(req.getParameter("tran_amt_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String callgb = Util.Uni2Ksc(Util.checkString(req.getParameter("callgb")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String acct_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_mang_no")));
String rmtt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_dt")));
String rmtt_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_plac")));
String corp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("corp_clsf")));
String rcpm_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_yymm")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String elec_tax_bill_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_tax_bill_yn")));
String elec_tax_issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_tax_issu_dt")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String bo_cdseq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cdseq_ar")));
String chrg_pers_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_ar")));
String acct_tot_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_tot_ar")));
String acpt_tot_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("acpt_tot_ar")));
String amt1_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt1_ar")));
String amt2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt2_ar")));
String amt3_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt3_ar")));
String amt4_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt4_ar")));
String amt5_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt5_ar")));
String amt_sum_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt_sum_ar")));
String rcpm_shet_no_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no_ar")));
String biz_reg_no_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_reg_no_ar")));
String bank_id_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_id_ar")));
String acct_num_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num_ar")));
String tran_date_seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_seq_ar")));
String tran_amt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_amt_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCallgb(callgb);
dm.setArea_cd(area_cd);
dm.setBank_cd(bank_cd);
dm.setAcct_mang_no(acct_mang_no);
dm.setRmtt_dt(rmtt_dt);
dm.setRmtt_plac(rmtt_plac);
dm.setCorp_clsf(corp_clsf);
dm.setRcpm_yymm(rcpm_yymm);
dm.setDlco_no(dlco_no);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setMake_dt(make_dt);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setRemk(remk);
dm.setElec_tax_bill_yn(elec_tax_bill_yn);
dm.setElec_tax_issu_dt(elec_tax_issu_dt);
dm.setMode_ar(mode_ar);
dm.setBo_cdseq_ar(bo_cdseq_ar);
dm.setChrg_pers_ar(chrg_pers_ar);
dm.setAcct_tot_ar(acct_tot_ar);
dm.setAcpt_tot_ar(acpt_tot_ar);
dm.setAmt1_ar(amt1_ar);
dm.setAmt2_ar(amt2_ar);
dm.setAmt3_ar(amt3_ar);
dm.setAmt4_ar(amt4_ar);
dm.setAmt5_ar(amt5_ar);
dm.setAmt_sum_ar(amt_sum_ar);
dm.setRcpm_shet_no_ar(rcpm_shet_no_ar);
dm.setBiz_reg_no_ar(biz_reg_no_ar);
dm.setBank_id_ar(bank_id_ar);
dm.setAcct_num_ar(acct_num_ar);
dm.setTran_date_seq_ar(tran_date_seq_ar);
dm.setTran_amt_ar(tran_amt_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 12 18:18:43 KST 2010 */