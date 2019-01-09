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


package chosun.ciis.hd.edu.rec;

import java.sql.*;
import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.ds.*;

/**
 * 
 */


public class HD_EDU_1201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String report;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String stdy_yy;
	public String ictry_excep_clsf;
	public String stdy_clsf;
	public String invit_instt;
	public String stdy_frdt;
	public String stdy_todt;
	public String stdy_natn_cd;
	public String stdy_instt;
	public String aviat_cost;
	public String stay_cost;
	public String scl_exps;
	public String etc_cost;
	public String stdy_cost_stot;
	public String ictry_excep_clsf_nm;
	public String stdy_clsf_nm;
	public String stdy_natn_cd_nm;
	public String pk_rep;
	public String rep_cont;

	public HD_EDU_1201_LCURLISTRecord(){}

	public void setReport(String report){
		this.report = report;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setStdy_yy(String stdy_yy){
		this.stdy_yy = stdy_yy;
	}

	public void setIctry_excep_clsf(String ictry_excep_clsf){
		this.ictry_excep_clsf = ictry_excep_clsf;
	}

	public void setStdy_clsf(String stdy_clsf){
		this.stdy_clsf = stdy_clsf;
	}

	public void setInvit_instt(String invit_instt){
		this.invit_instt = invit_instt;
	}

	public void setStdy_frdt(String stdy_frdt){
		this.stdy_frdt = stdy_frdt;
	}

	public void setStdy_todt(String stdy_todt){
		this.stdy_todt = stdy_todt;
	}

	public void setStdy_natn_cd(String stdy_natn_cd){
		this.stdy_natn_cd = stdy_natn_cd;
	}

	public void setStdy_instt(String stdy_instt){
		this.stdy_instt = stdy_instt;
	}

	public void setAviat_cost(String aviat_cost){
		this.aviat_cost = aviat_cost;
	}

	public void setStay_cost(String stay_cost){
		this.stay_cost = stay_cost;
	}

	public void setScl_exps(String scl_exps){
		this.scl_exps = scl_exps;
	}

	public void setEtc_cost(String etc_cost){
		this.etc_cost = etc_cost;
	}

	public void setStdy_cost_stot(String stdy_cost_stot){
		this.stdy_cost_stot = stdy_cost_stot;
	}

	public void setIctry_excep_clsf_nm(String ictry_excep_clsf_nm){
		this.ictry_excep_clsf_nm = ictry_excep_clsf_nm;
	}

	public void setStdy_clsf_nm(String stdy_clsf_nm){
		this.stdy_clsf_nm = stdy_clsf_nm;
	}

	public void setStdy_natn_cd_nm(String stdy_natn_cd_nm){
		this.stdy_natn_cd_nm = stdy_natn_cd_nm;
	}

	public void setPk_rep(String pk_rep){
		this.pk_rep = pk_rep;
	}

	public void setRep_cont(String rep_cont){
		this.rep_cont = rep_cont;
	}

	public String getReport(){
		return this.report;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getStdy_yy(){
		return this.stdy_yy;
	}

	public String getIctry_excep_clsf(){
		return this.ictry_excep_clsf;
	}

	public String getStdy_clsf(){
		return this.stdy_clsf;
	}

	public String getInvit_instt(){
		return this.invit_instt;
	}

	public String getStdy_frdt(){
		return this.stdy_frdt;
	}

	public String getStdy_todt(){
		return this.stdy_todt;
	}

	public String getStdy_natn_cd(){
		return this.stdy_natn_cd;
	}

	public String getStdy_instt(){
		return this.stdy_instt;
	}

	public String getAviat_cost(){
		return this.aviat_cost;
	}

	public String getStay_cost(){
		return this.stay_cost;
	}

	public String getScl_exps(){
		return this.scl_exps;
	}

	public String getEtc_cost(){
		return this.etc_cost;
	}

	public String getStdy_cost_stot(){
		return this.stdy_cost_stot;
	}

	public String getIctry_excep_clsf_nm(){
		return this.ictry_excep_clsf_nm;
	}

	public String getStdy_clsf_nm(){
		return this.stdy_clsf_nm;
	}

	public String getStdy_natn_cd_nm(){
		return this.stdy_natn_cd_nm;
	}

	public String getPk_rep(){
		return this.pk_rep;
	}

	public String getRep_cont(){
		return this.rep_cont;
	}
}

/* 작성시간 : Mon Aug 24 18:04:16 KST 2009 */