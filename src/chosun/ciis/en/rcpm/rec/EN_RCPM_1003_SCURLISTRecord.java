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


package chosun.ciis.en.rcpm.rec;

import java.sql.*;
import chosun.ciis.en.rcpm.dm.*;
import chosun.ciis.en.rcpm.ds.*;

/**
 * 
 */


public class EN_RCPM_1003_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpm_shet_kind;
	public String rcpm_shet_kind_nm;
	public String rcpm_shet_no;
	public String dlco_no;
	public String dlco_nm;
	public String issu_amt;
	public String issu_ptcr;
	public String issu_dt;
	public String issu_pers_emp_no;
	public String issu_pers_emp_nm;
	public String reven_occr_dt;
	public String slip_clsf_cd;
	public String reven_occr_seq;
	public String widr_resn;
	public String remk;
	public String incmg_pers;
	public String incmg_pers_emp_nm;
	public String incmg_dt;
	public String chg_pers;
	public String chg_pers_emp_nm;
	public String chg_dt;

	public EN_RCPM_1003_SCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_shet_kind_nm(String rcpm_shet_kind_nm){
		this.rcpm_shet_kind_nm = rcpm_shet_kind_nm;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setIssu_amt(String issu_amt){
		this.issu_amt = issu_amt;
	}

	public void setIssu_ptcr(String issu_ptcr){
		this.issu_ptcr = issu_ptcr;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setIssu_pers_emp_no(String issu_pers_emp_no){
		this.issu_pers_emp_no = issu_pers_emp_no;
	}

	public void setIssu_pers_emp_nm(String issu_pers_emp_nm){
		this.issu_pers_emp_nm = issu_pers_emp_nm;
	}

	public void setReven_occr_dt(String reven_occr_dt){
		this.reven_occr_dt = reven_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setReven_occr_seq(String reven_occr_seq){
		this.reven_occr_seq = reven_occr_seq;
	}

	public void setWidr_resn(String widr_resn){
		this.widr_resn = widr_resn;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_shet_kind_nm(){
		return this.rcpm_shet_kind_nm;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getIssu_amt(){
		return this.issu_amt;
	}

	public String getIssu_ptcr(){
		return this.issu_ptcr;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getIssu_pers_emp_no(){
		return this.issu_pers_emp_no;
	}

	public String getIssu_pers_emp_nm(){
		return this.issu_pers_emp_nm;
	}

	public String getReven_occr_dt(){
		return this.reven_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getReven_occr_seq(){
		return this.reven_occr_seq;
	}

	public String getWidr_resn(){
		return this.widr_resn;
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
}

/* 작성시간 : Wed Feb 11 16:08:48 KST 2009 */