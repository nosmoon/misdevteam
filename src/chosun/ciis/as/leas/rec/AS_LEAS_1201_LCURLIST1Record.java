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


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 
 */


public class AS_LEAS_1201_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String clam_yymm;
	public String clam_dt;
	public String slip_no;
	public String slip_apprv_yn;
	public String clam_cnt;
	public String clam_tot_amt;
	public String clam_tot_cnt;
	public String upd_slip_yn;
	public String canc_dy;
	public String clam_fix_yn;
	public String incmg_dt_tm;
	public String nm_korn;
	public String cmpy_cd;
	public String clam_seq;

	public AS_LEAS_1201_LCURLIST1Record(){}

	public void setClam_yymm(String clam_yymm){
		this.clam_yymm = clam_yymm;
	}

	public void setClam_dt(String clam_dt){
		this.clam_dt = clam_dt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setSlip_apprv_yn(String slip_apprv_yn){
		this.slip_apprv_yn = slip_apprv_yn;
	}

	public void setClam_cnt(String clam_cnt){
		this.clam_cnt = clam_cnt;
	}

	public void setClam_tot_amt(String clam_tot_amt){
		this.clam_tot_amt = clam_tot_amt;
	}

	public void setClam_tot_cnt(String clam_tot_cnt){
		this.clam_tot_cnt = clam_tot_cnt;
	}

	public void setUpd_slip_yn(String upd_slip_yn){
		this.upd_slip_yn = upd_slip_yn;
	}

	public void setCanc_dy(String canc_dy){
		this.canc_dy = canc_dy;
	}

	public void setClam_fix_yn(String clam_fix_yn){
		this.clam_fix_yn = clam_fix_yn;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClam_seq(String clam_seq){
		this.clam_seq = clam_seq;
	}

	public String getClam_yymm(){
		return this.clam_yymm;
	}

	public String getClam_dt(){
		return this.clam_dt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getSlip_apprv_yn(){
		return this.slip_apprv_yn;
	}

	public String getClam_cnt(){
		return this.clam_cnt;
	}

	public String getClam_tot_amt(){
		return this.clam_tot_amt;
	}

	public String getClam_tot_cnt(){
		return this.clam_tot_cnt;
	}

	public String getUpd_slip_yn(){
		return this.upd_slip_yn;
	}

	public String getCanc_dy(){
		return this.canc_dy;
	}

	public String getClam_fix_yn(){
		return this.clam_fix_yn;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClam_seq(){
		return this.clam_seq;
	}
}

/* 작성시간 : Fri Jul 10 17:52:02 KST 2009 */