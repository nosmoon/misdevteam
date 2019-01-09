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


package chosun.ciis.ad.bas.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BAS_1720_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String medi_clsf;
	public String dlco_no;
	public String basi_dt;
	public String dlco_clsf;
	public String prvmm_unrcp_amt;
	public String thmm_unrcp_amt;
	public String unrcp_tot_amt;
	public String un_repay_dhon_bal;
	public String mang_expt_ufth_bond_amt;
	public String busn_expt_ufth_bond_amt;
	public String mang_dr_stot;
	public String busn_dr_stot;
	public String mortg_amt;
	public String un_pay_fee;
	public String precpt_amt;
	public String acml_amt;
	public String etc_mortg_amt;
	public String dng_stot;
	public String mang_mortg_surp_amt;
	public String busn_mortg_surp_amt;
	public String mchrg_pers;
	public String slcrg_pers;
	public String mchrg_opn;
	public String slcrg_opn;
	public String cover_note;
	public String advcs_note;
	public String dhon_note;
	public String seq;
	public String mang_chce_yn;
	public String busn_chce_yn;
	public String dhon_chce_yn;
	public String issu_pers;
	public String mtry_dt;
	public String amt;
	public String note_no;
	public String note_stat;
	public String bank_cd;
	public String note_seq;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_BAS_1720_ADM(){}
	public AD_BAS_1720_ADM(String flag, String cmpy_cd, String medi_clsf, String dlco_no, String basi_dt, String dlco_clsf, String prvmm_unrcp_amt, String thmm_unrcp_amt, String unrcp_tot_amt, String un_repay_dhon_bal, String mang_expt_ufth_bond_amt, String busn_expt_ufth_bond_amt, String mang_dr_stot, String busn_dr_stot, String mortg_amt, String un_pay_fee, String precpt_amt, String acml_amt, String etc_mortg_amt, String dng_stot, String mang_mortg_surp_amt, String busn_mortg_surp_amt, String mchrg_pers, String slcrg_pers, String mchrg_opn, String slcrg_opn, String cover_note, String advcs_note, String dhon_note, String seq, String mang_chce_yn, String busn_chce_yn, String dhon_chce_yn, String issu_pers, String mtry_dt, String amt, String note_no, String note_stat, String bank_cd, String note_seq, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.dlco_no = dlco_no;
		this.basi_dt = basi_dt;
		this.dlco_clsf = dlco_clsf;
		this.prvmm_unrcp_amt = prvmm_unrcp_amt;
		this.thmm_unrcp_amt = thmm_unrcp_amt;
		this.unrcp_tot_amt = unrcp_tot_amt;
		this.un_repay_dhon_bal = un_repay_dhon_bal;
		this.mang_expt_ufth_bond_amt = mang_expt_ufth_bond_amt;
		this.busn_expt_ufth_bond_amt = busn_expt_ufth_bond_amt;
		this.mang_dr_stot = mang_dr_stot;
		this.busn_dr_stot = busn_dr_stot;
		this.mortg_amt = mortg_amt;
		this.un_pay_fee = un_pay_fee;
		this.precpt_amt = precpt_amt;
		this.acml_amt = acml_amt;
		this.etc_mortg_amt = etc_mortg_amt;
		this.dng_stot = dng_stot;
		this.mang_mortg_surp_amt = mang_mortg_surp_amt;
		this.busn_mortg_surp_amt = busn_mortg_surp_amt;
		this.mchrg_pers = mchrg_pers;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_opn = mchrg_opn;
		this.slcrg_opn = slcrg_opn;
		this.cover_note = cover_note;
		this.advcs_note = advcs_note;
		this.dhon_note = dhon_note;
		this.seq = seq;
		this.mang_chce_yn = mang_chce_yn;
		this.busn_chce_yn = busn_chce_yn;
		this.dhon_chce_yn = dhon_chce_yn;
		this.issu_pers = issu_pers;
		this.mtry_dt = mtry_dt;
		this.amt = amt;
		this.note_no = note_no;
		this.note_stat = note_stat;
		this.bank_cd = bank_cd;
		this.note_seq = note_seq;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setPrvmm_unrcp_amt(String prvmm_unrcp_amt){
		this.prvmm_unrcp_amt = prvmm_unrcp_amt;
	}

	public void setThmm_unrcp_amt(String thmm_unrcp_amt){
		this.thmm_unrcp_amt = thmm_unrcp_amt;
	}

	public void setUnrcp_tot_amt(String unrcp_tot_amt){
		this.unrcp_tot_amt = unrcp_tot_amt;
	}

	public void setUn_repay_dhon_bal(String un_repay_dhon_bal){
		this.un_repay_dhon_bal = un_repay_dhon_bal;
	}

	public void setMang_expt_ufth_bond_amt(String mang_expt_ufth_bond_amt){
		this.mang_expt_ufth_bond_amt = mang_expt_ufth_bond_amt;
	}

	public void setBusn_expt_ufth_bond_amt(String busn_expt_ufth_bond_amt){
		this.busn_expt_ufth_bond_amt = busn_expt_ufth_bond_amt;
	}

	public void setMang_dr_stot(String mang_dr_stot){
		this.mang_dr_stot = mang_dr_stot;
	}

	public void setBusn_dr_stot(String busn_dr_stot){
		this.busn_dr_stot = busn_dr_stot;
	}

	public void setMortg_amt(String mortg_amt){
		this.mortg_amt = mortg_amt;
	}

	public void setUn_pay_fee(String un_pay_fee){
		this.un_pay_fee = un_pay_fee;
	}

	public void setPrecpt_amt(String precpt_amt){
		this.precpt_amt = precpt_amt;
	}

	public void setAcml_amt(String acml_amt){
		this.acml_amt = acml_amt;
	}

	public void setEtc_mortg_amt(String etc_mortg_amt){
		this.etc_mortg_amt = etc_mortg_amt;
	}

	public void setDng_stot(String dng_stot){
		this.dng_stot = dng_stot;
	}

	public void setMang_mortg_surp_amt(String mang_mortg_surp_amt){
		this.mang_mortg_surp_amt = mang_mortg_surp_amt;
	}

	public void setBusn_mortg_surp_amt(String busn_mortg_surp_amt){
		this.busn_mortg_surp_amt = busn_mortg_surp_amt;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_opn(String mchrg_opn){
		this.mchrg_opn = mchrg_opn;
	}

	public void setSlcrg_opn(String slcrg_opn){
		this.slcrg_opn = slcrg_opn;
	}

	public void setCover_note(String cover_note){
		this.cover_note = cover_note;
	}

	public void setAdvcs_note(String advcs_note){
		this.advcs_note = advcs_note;
	}

	public void setDhon_note(String dhon_note){
		this.dhon_note = dhon_note;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMang_chce_yn(String mang_chce_yn){
		this.mang_chce_yn = mang_chce_yn;
	}

	public void setBusn_chce_yn(String busn_chce_yn){
		this.busn_chce_yn = busn_chce_yn;
	}

	public void setDhon_chce_yn(String dhon_chce_yn){
		this.dhon_chce_yn = dhon_chce_yn;
	}

	public void setIssu_pers(String issu_pers){
		this.issu_pers = issu_pers;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_stat(String note_stat){
		this.note_stat = note_stat;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getPrvmm_unrcp_amt(){
		return this.prvmm_unrcp_amt;
	}

	public String getThmm_unrcp_amt(){
		return this.thmm_unrcp_amt;
	}

	public String getUnrcp_tot_amt(){
		return this.unrcp_tot_amt;
	}

	public String getUn_repay_dhon_bal(){
		return this.un_repay_dhon_bal;
	}

	public String getMang_expt_ufth_bond_amt(){
		return this.mang_expt_ufth_bond_amt;
	}

	public String getBusn_expt_ufth_bond_amt(){
		return this.busn_expt_ufth_bond_amt;
	}

	public String getMang_dr_stot(){
		return this.mang_dr_stot;
	}

	public String getBusn_dr_stot(){
		return this.busn_dr_stot;
	}

	public String getMortg_amt(){
		return this.mortg_amt;
	}

	public String getUn_pay_fee(){
		return this.un_pay_fee;
	}

	public String getPrecpt_amt(){
		return this.precpt_amt;
	}

	public String getAcml_amt(){
		return this.acml_amt;
	}

	public String getEtc_mortg_amt(){
		return this.etc_mortg_amt;
	}

	public String getDng_stot(){
		return this.dng_stot;
	}

	public String getMang_mortg_surp_amt(){
		return this.mang_mortg_surp_amt;
	}

	public String getBusn_mortg_surp_amt(){
		return this.busn_mortg_surp_amt;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_opn(){
		return this.mchrg_opn;
	}

	public String getSlcrg_opn(){
		return this.slcrg_opn;
	}

	public String getCover_note(){
		return this.cover_note;
	}

	public String getAdvcs_note(){
		return this.advcs_note;
	}

	public String getDhon_note(){
		return this.dhon_note;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMang_chce_yn(){
		return this.mang_chce_yn;
	}

	public String getBusn_chce_yn(){
		return this.busn_chce_yn;
	}

	public String getDhon_chce_yn(){
		return this.dhon_chce_yn;
	}

	public String getIssu_pers(){
		return this.issu_pers;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_stat(){
		return this.note_stat;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1720_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1720_ADM dm = (AD_BAS_1720_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.medi_clsf);
		cstmt.setString(6, dm.dlco_no);
		cstmt.setString(7, dm.basi_dt);
		cstmt.setString(8, dm.dlco_clsf);
		cstmt.setString(9, dm.prvmm_unrcp_amt);
		cstmt.setString(10, dm.thmm_unrcp_amt);
		cstmt.setString(11, dm.unrcp_tot_amt);
		cstmt.setString(12, dm.un_repay_dhon_bal);
		cstmt.setString(13, dm.mang_expt_ufth_bond_amt);
		cstmt.setString(14, dm.busn_expt_ufth_bond_amt);
		cstmt.setString(15, dm.mang_dr_stot);
		cstmt.setString(16, dm.busn_dr_stot);
		cstmt.setString(17, dm.mortg_amt);
		cstmt.setString(18, dm.un_pay_fee);
		cstmt.setString(19, dm.precpt_amt);
		cstmt.setString(20, dm.acml_amt);
		cstmt.setString(21, dm.etc_mortg_amt);
		cstmt.setString(22, dm.dng_stot);
		cstmt.setString(23, dm.mang_mortg_surp_amt);
		cstmt.setString(24, dm.busn_mortg_surp_amt);
		cstmt.setString(25, dm.mchrg_pers);
		cstmt.setString(26, dm.slcrg_pers);
		cstmt.setString(27, dm.mchrg_opn);
		cstmt.setString(28, dm.slcrg_opn);
		cstmt.setString(29, dm.cover_note);
		cstmt.setString(30, dm.advcs_note);
		cstmt.setString(31, dm.dhon_note);
		cstmt.setString(32, dm.seq);
		cstmt.setString(33, dm.mang_chce_yn);
		cstmt.setString(34, dm.busn_chce_yn);
		cstmt.setString(35, dm.dhon_chce_yn);
		cstmt.setString(36, dm.issu_pers);
		cstmt.setString(37, dm.mtry_dt);
		cstmt.setString(38, dm.amt);
		cstmt.setString(39, dm.note_no);
		cstmt.setString(40, dm.note_stat);
		cstmt.setString(41, dm.bank_cd);
		cstmt.setString(42, dm.note_seq);
		cstmt.setString(43, dm.incmg_pers_ip);
		cstmt.setString(44, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1720_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("prvmm_unrcp_amt = [" + getPrvmm_unrcp_amt() + "]");
		System.out.println("thmm_unrcp_amt = [" + getThmm_unrcp_amt() + "]");
		System.out.println("unrcp_tot_amt = [" + getUnrcp_tot_amt() + "]");
		System.out.println("un_repay_dhon_bal = [" + getUn_repay_dhon_bal() + "]");
		System.out.println("mang_expt_ufth_bond_amt = [" + getMang_expt_ufth_bond_amt() + "]");
		System.out.println("busn_expt_ufth_bond_amt = [" + getBusn_expt_ufth_bond_amt() + "]");
		System.out.println("mang_dr_stot = [" + getMang_dr_stot() + "]");
		System.out.println("busn_dr_stot = [" + getBusn_dr_stot() + "]");
		System.out.println("mortg_amt = [" + getMortg_amt() + "]");
		System.out.println("un_pay_fee = [" + getUn_pay_fee() + "]");
		System.out.println("precpt_amt = [" + getPrecpt_amt() + "]");
		System.out.println("acml_amt = [" + getAcml_amt() + "]");
		System.out.println("etc_mortg_amt = [" + getEtc_mortg_amt() + "]");
		System.out.println("dng_stot = [" + getDng_stot() + "]");
		System.out.println("mang_mortg_surp_amt = [" + getMang_mortg_surp_amt() + "]");
		System.out.println("busn_mortg_surp_amt = [" + getBusn_mortg_surp_amt() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("mchrg_opn = [" + getMchrg_opn() + "]");
		System.out.println("slcrg_opn = [" + getSlcrg_opn() + "]");
		System.out.println("cover_note = [" + getCover_note() + "]");
		System.out.println("advcs_note = [" + getAdvcs_note() + "]");
		System.out.println("dhon_note = [" + getDhon_note() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("mang_chce_yn = [" + getMang_chce_yn() + "]");
		System.out.println("busn_chce_yn = [" + getBusn_chce_yn() + "]");
		System.out.println("dhon_chce_yn = [" + getDhon_chce_yn() + "]");
		System.out.println("issu_pers = [" + getIssu_pers() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("note_no = [" + getNote_no() + "]");
		System.out.println("note_stat = [" + getNote_stat() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("note_seq = [" + getNote_seq() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String prvmm_unrcp_amt = req.getParameter("prvmm_unrcp_amt");
if( prvmm_unrcp_amt == null){
	System.out.println(this.toString+" : prvmm_unrcp_amt is null" );
}else{
	System.out.println(this.toString+" : prvmm_unrcp_amt is "+prvmm_unrcp_amt );
}
String thmm_unrcp_amt = req.getParameter("thmm_unrcp_amt");
if( thmm_unrcp_amt == null){
	System.out.println(this.toString+" : thmm_unrcp_amt is null" );
}else{
	System.out.println(this.toString+" : thmm_unrcp_amt is "+thmm_unrcp_amt );
}
String unrcp_tot_amt = req.getParameter("unrcp_tot_amt");
if( unrcp_tot_amt == null){
	System.out.println(this.toString+" : unrcp_tot_amt is null" );
}else{
	System.out.println(this.toString+" : unrcp_tot_amt is "+unrcp_tot_amt );
}
String un_repay_dhon_bal = req.getParameter("un_repay_dhon_bal");
if( un_repay_dhon_bal == null){
	System.out.println(this.toString+" : un_repay_dhon_bal is null" );
}else{
	System.out.println(this.toString+" : un_repay_dhon_bal is "+un_repay_dhon_bal );
}
String mang_expt_ufth_bond_amt = req.getParameter("mang_expt_ufth_bond_amt");
if( mang_expt_ufth_bond_amt == null){
	System.out.println(this.toString+" : mang_expt_ufth_bond_amt is null" );
}else{
	System.out.println(this.toString+" : mang_expt_ufth_bond_amt is "+mang_expt_ufth_bond_amt );
}
String busn_expt_ufth_bond_amt = req.getParameter("busn_expt_ufth_bond_amt");
if( busn_expt_ufth_bond_amt == null){
	System.out.println(this.toString+" : busn_expt_ufth_bond_amt is null" );
}else{
	System.out.println(this.toString+" : busn_expt_ufth_bond_amt is "+busn_expt_ufth_bond_amt );
}
String mang_dr_stot = req.getParameter("mang_dr_stot");
if( mang_dr_stot == null){
	System.out.println(this.toString+" : mang_dr_stot is null" );
}else{
	System.out.println(this.toString+" : mang_dr_stot is "+mang_dr_stot );
}
String busn_dr_stot = req.getParameter("busn_dr_stot");
if( busn_dr_stot == null){
	System.out.println(this.toString+" : busn_dr_stot is null" );
}else{
	System.out.println(this.toString+" : busn_dr_stot is "+busn_dr_stot );
}
String mortg_amt = req.getParameter("mortg_amt");
if( mortg_amt == null){
	System.out.println(this.toString+" : mortg_amt is null" );
}else{
	System.out.println(this.toString+" : mortg_amt is "+mortg_amt );
}
String un_pay_fee = req.getParameter("un_pay_fee");
if( un_pay_fee == null){
	System.out.println(this.toString+" : un_pay_fee is null" );
}else{
	System.out.println(this.toString+" : un_pay_fee is "+un_pay_fee );
}
String precpt_amt = req.getParameter("precpt_amt");
if( precpt_amt == null){
	System.out.println(this.toString+" : precpt_amt is null" );
}else{
	System.out.println(this.toString+" : precpt_amt is "+precpt_amt );
}
String acml_amt = req.getParameter("acml_amt");
if( acml_amt == null){
	System.out.println(this.toString+" : acml_amt is null" );
}else{
	System.out.println(this.toString+" : acml_amt is "+acml_amt );
}
String etc_mortg_amt = req.getParameter("etc_mortg_amt");
if( etc_mortg_amt == null){
	System.out.println(this.toString+" : etc_mortg_amt is null" );
}else{
	System.out.println(this.toString+" : etc_mortg_amt is "+etc_mortg_amt );
}
String dng_stot = req.getParameter("dng_stot");
if( dng_stot == null){
	System.out.println(this.toString+" : dng_stot is null" );
}else{
	System.out.println(this.toString+" : dng_stot is "+dng_stot );
}
String mang_mortg_surp_amt = req.getParameter("mang_mortg_surp_amt");
if( mang_mortg_surp_amt == null){
	System.out.println(this.toString+" : mang_mortg_surp_amt is null" );
}else{
	System.out.println(this.toString+" : mang_mortg_surp_amt is "+mang_mortg_surp_amt );
}
String busn_mortg_surp_amt = req.getParameter("busn_mortg_surp_amt");
if( busn_mortg_surp_amt == null){
	System.out.println(this.toString+" : busn_mortg_surp_amt is null" );
}else{
	System.out.println(this.toString+" : busn_mortg_surp_amt is "+busn_mortg_surp_amt );
}
String mchrg_pers = req.getParameter("mchrg_pers");
if( mchrg_pers == null){
	System.out.println(this.toString+" : mchrg_pers is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers is "+mchrg_pers );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String mchrg_opn = req.getParameter("mchrg_opn");
if( mchrg_opn == null){
	System.out.println(this.toString+" : mchrg_opn is null" );
}else{
	System.out.println(this.toString+" : mchrg_opn is "+mchrg_opn );
}
String slcrg_opn = req.getParameter("slcrg_opn");
if( slcrg_opn == null){
	System.out.println(this.toString+" : slcrg_opn is null" );
}else{
	System.out.println(this.toString+" : slcrg_opn is "+slcrg_opn );
}
String cover_note = req.getParameter("cover_note");
if( cover_note == null){
	System.out.println(this.toString+" : cover_note is null" );
}else{
	System.out.println(this.toString+" : cover_note is "+cover_note );
}
String advcs_note = req.getParameter("advcs_note");
if( advcs_note == null){
	System.out.println(this.toString+" : advcs_note is null" );
}else{
	System.out.println(this.toString+" : advcs_note is "+advcs_note );
}
String dhon_note = req.getParameter("dhon_note");
if( dhon_note == null){
	System.out.println(this.toString+" : dhon_note is null" );
}else{
	System.out.println(this.toString+" : dhon_note is "+dhon_note );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String mang_chce_yn = req.getParameter("mang_chce_yn");
if( mang_chce_yn == null){
	System.out.println(this.toString+" : mang_chce_yn is null" );
}else{
	System.out.println(this.toString+" : mang_chce_yn is "+mang_chce_yn );
}
String busn_chce_yn = req.getParameter("busn_chce_yn");
if( busn_chce_yn == null){
	System.out.println(this.toString+" : busn_chce_yn is null" );
}else{
	System.out.println(this.toString+" : busn_chce_yn is "+busn_chce_yn );
}
String dhon_chce_yn = req.getParameter("dhon_chce_yn");
if( dhon_chce_yn == null){
	System.out.println(this.toString+" : dhon_chce_yn is null" );
}else{
	System.out.println(this.toString+" : dhon_chce_yn is "+dhon_chce_yn );
}
String issu_pers = req.getParameter("issu_pers");
if( issu_pers == null){
	System.out.println(this.toString+" : issu_pers is null" );
}else{
	System.out.println(this.toString+" : issu_pers is "+issu_pers );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String note_no = req.getParameter("note_no");
if( note_no == null){
	System.out.println(this.toString+" : note_no is null" );
}else{
	System.out.println(this.toString+" : note_no is "+note_no );
}
String note_stat = req.getParameter("note_stat");
if( note_stat == null){
	System.out.println(this.toString+" : note_stat is null" );
}else{
	System.out.println(this.toString+" : note_stat is "+note_stat );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String note_seq = req.getParameter("note_seq");
if( note_seq == null){
	System.out.println(this.toString+" : note_seq is null" );
}else{
	System.out.println(this.toString+" : note_seq is "+note_seq );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String prvmm_unrcp_amt = Util.checkString(req.getParameter("prvmm_unrcp_amt"));
String thmm_unrcp_amt = Util.checkString(req.getParameter("thmm_unrcp_amt"));
String unrcp_tot_amt = Util.checkString(req.getParameter("unrcp_tot_amt"));
String un_repay_dhon_bal = Util.checkString(req.getParameter("un_repay_dhon_bal"));
String mang_expt_ufth_bond_amt = Util.checkString(req.getParameter("mang_expt_ufth_bond_amt"));
String busn_expt_ufth_bond_amt = Util.checkString(req.getParameter("busn_expt_ufth_bond_amt"));
String mang_dr_stot = Util.checkString(req.getParameter("mang_dr_stot"));
String busn_dr_stot = Util.checkString(req.getParameter("busn_dr_stot"));
String mortg_amt = Util.checkString(req.getParameter("mortg_amt"));
String un_pay_fee = Util.checkString(req.getParameter("un_pay_fee"));
String precpt_amt = Util.checkString(req.getParameter("precpt_amt"));
String acml_amt = Util.checkString(req.getParameter("acml_amt"));
String etc_mortg_amt = Util.checkString(req.getParameter("etc_mortg_amt"));
String dng_stot = Util.checkString(req.getParameter("dng_stot"));
String mang_mortg_surp_amt = Util.checkString(req.getParameter("mang_mortg_surp_amt"));
String busn_mortg_surp_amt = Util.checkString(req.getParameter("busn_mortg_surp_amt"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String mchrg_opn = Util.checkString(req.getParameter("mchrg_opn"));
String slcrg_opn = Util.checkString(req.getParameter("slcrg_opn"));
String cover_note = Util.checkString(req.getParameter("cover_note"));
String advcs_note = Util.checkString(req.getParameter("advcs_note"));
String dhon_note = Util.checkString(req.getParameter("dhon_note"));
String seq = Util.checkString(req.getParameter("seq"));
String mang_chce_yn = Util.checkString(req.getParameter("mang_chce_yn"));
String busn_chce_yn = Util.checkString(req.getParameter("busn_chce_yn"));
String dhon_chce_yn = Util.checkString(req.getParameter("dhon_chce_yn"));
String issu_pers = Util.checkString(req.getParameter("issu_pers"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String amt = Util.checkString(req.getParameter("amt"));
String note_no = Util.checkString(req.getParameter("note_no"));
String note_stat = Util.checkString(req.getParameter("note_stat"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String note_seq = Util.checkString(req.getParameter("note_seq"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String prvmm_unrcp_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prvmm_unrcp_amt")));
String thmm_unrcp_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("thmm_unrcp_amt")));
String unrcp_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("unrcp_tot_amt")));
String un_repay_dhon_bal = Util.Uni2Ksc(Util.checkString(req.getParameter("un_repay_dhon_bal")));
String mang_expt_ufth_bond_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_expt_ufth_bond_amt")));
String busn_expt_ufth_bond_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("busn_expt_ufth_bond_amt")));
String mang_dr_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_dr_stot")));
String busn_dr_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("busn_dr_stot")));
String mortg_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mortg_amt")));
String un_pay_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("un_pay_fee")));
String precpt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("precpt_amt")));
String acml_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("acml_amt")));
String etc_mortg_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_mortg_amt")));
String dng_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("dng_stot")));
String mang_mortg_surp_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_mortg_surp_amt")));
String busn_mortg_surp_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("busn_mortg_surp_amt")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String mchrg_opn = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_opn")));
String slcrg_opn = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_opn")));
String cover_note = Util.Uni2Ksc(Util.checkString(req.getParameter("cover_note")));
String advcs_note = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_note")));
String dhon_note = Util.Uni2Ksc(Util.checkString(req.getParameter("dhon_note")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String mang_chce_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_chce_yn")));
String busn_chce_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("busn_chce_yn")));
String dhon_chce_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("dhon_chce_yn")));
String issu_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pers")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no")));
String note_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("note_stat")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String note_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("note_seq")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setMedi_clsf(medi_clsf);
dm.setDlco_no(dlco_no);
dm.setBasi_dt(basi_dt);
dm.setDlco_clsf(dlco_clsf);
dm.setPrvmm_unrcp_amt(prvmm_unrcp_amt);
dm.setThmm_unrcp_amt(thmm_unrcp_amt);
dm.setUnrcp_tot_amt(unrcp_tot_amt);
dm.setUn_repay_dhon_bal(un_repay_dhon_bal);
dm.setMang_expt_ufth_bond_amt(mang_expt_ufth_bond_amt);
dm.setBusn_expt_ufth_bond_amt(busn_expt_ufth_bond_amt);
dm.setMang_dr_stot(mang_dr_stot);
dm.setBusn_dr_stot(busn_dr_stot);
dm.setMortg_amt(mortg_amt);
dm.setUn_pay_fee(un_pay_fee);
dm.setPrecpt_amt(precpt_amt);
dm.setAcml_amt(acml_amt);
dm.setEtc_mortg_amt(etc_mortg_amt);
dm.setDng_stot(dng_stot);
dm.setMang_mortg_surp_amt(mang_mortg_surp_amt);
dm.setBusn_mortg_surp_amt(busn_mortg_surp_amt);
dm.setMchrg_pers(mchrg_pers);
dm.setSlcrg_pers(slcrg_pers);
dm.setMchrg_opn(mchrg_opn);
dm.setSlcrg_opn(slcrg_opn);
dm.setCover_note(cover_note);
dm.setAdvcs_note(advcs_note);
dm.setDhon_note(dhon_note);
dm.setSeq(seq);
dm.setMang_chce_yn(mang_chce_yn);
dm.setBusn_chce_yn(busn_chce_yn);
dm.setDhon_chce_yn(dhon_chce_yn);
dm.setIssu_pers(issu_pers);
dm.setMtry_dt(mtry_dt);
dm.setAmt(amt);
dm.setNote_no(note_no);
dm.setNote_stat(note_stat);
dm.setBank_cd(bank_cd);
dm.setNote_seq(note_seq);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 20 19:05:04 KST 2009 */