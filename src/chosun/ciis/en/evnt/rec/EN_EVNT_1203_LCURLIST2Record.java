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


package chosun.ciis.en.evnt.rec;

import java.sql.*;
import chosun.ciis.en.evnt.dm.*;
import chosun.ciis.en.evnt.ds.*;

/**
 * 
 */


public class EN_EVNT_1203_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String tmp_evnt_cd;
	public String evnt_nm;
	public String evnt_rcpm_unit_clsf;
	public String evnt_rcpm_unit_nm;
	public String vitl_acct_no_bgn;
	public String vitl_acct_no_end;
	public String use_end_yn;
	public String remk;
	public String incmg_pers;
	public String incmg_pers_emp_nm;
	public String incmg_dt;
	public String chg_pers;
	public String chg_pers_emp_nm;
	public String chg_dt;
	public String cmpy_cd;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_seq;

	public EN_EVNT_1203_LCURLIST2Record(){}

	public void setTmp_evnt_cd(String tmp_evnt_cd){
		this.tmp_evnt_cd = tmp_evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setEvnt_rcpm_unit_clsf(String evnt_rcpm_unit_clsf){
		this.evnt_rcpm_unit_clsf = evnt_rcpm_unit_clsf;
	}

	public void setEvnt_rcpm_unit_nm(String evnt_rcpm_unit_nm){
		this.evnt_rcpm_unit_nm = evnt_rcpm_unit_nm;
	}

	public void setVitl_acct_no_bgn(String vitl_acct_no_bgn){
		this.vitl_acct_no_bgn = vitl_acct_no_bgn;
	}

	public void setVitl_acct_no_end(String vitl_acct_no_end){
		this.vitl_acct_no_end = vitl_acct_no_end;
	}

	public void setUse_end_yn(String use_end_yn){
		this.use_end_yn = use_end_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_emp_nm(String incmg_pers_emp_nm){
		this.incmg_pers_emp_nm = incmg_pers_emp_nm;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_pers_emp_nm(String chg_pers_emp_nm){
		this.chg_pers_emp_nm = chg_pers_emp_nm;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_seq(String evnt_seq){
		this.evnt_seq = evnt_seq;
	}

	public String getTmp_evnt_cd(){
		return this.tmp_evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getEvnt_rcpm_unit_clsf(){
		return this.evnt_rcpm_unit_clsf;
	}

	public String getEvnt_rcpm_unit_nm(){
		return this.evnt_rcpm_unit_nm;
	}

	public String getVitl_acct_no_bgn(){
		return this.vitl_acct_no_bgn;
	}

	public String getVitl_acct_no_end(){
		return this.vitl_acct_no_end;
	}

	public String getUse_end_yn(){
		return this.use_end_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_emp_nm(){
		return this.incmg_pers_emp_nm;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_pers_emp_nm(){
		return this.chg_pers_emp_nm;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_seq(){
		return this.evnt_seq;
	}
}

/* 작성시간 : Thu May 14 12:00:56 KST 2009 */