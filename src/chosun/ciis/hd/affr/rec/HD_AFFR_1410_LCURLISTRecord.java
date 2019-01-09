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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_1410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String faml_seq;
	public String child_flnm;
	public String faml_rshp_cd;
	public String faml_rshp_nm;
	public String treat_edu_frdt;
	public String treat_edu_todt;
	public String treat_edu_cont;
	public String treat_edu_instt;
	public String treat_edu_instt_tel_no;
	public String clam_amt;
	public String cmpy_sply_amt;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String slip_proc_seq;
	public String proc_stat;
	public String proc_stat_nm;
	public String actu_slip_no;
	public String pay_plac_clsf;

	public HD_AFFR_1410_LCURLISTRecord(){}

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

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setFaml_seq(String faml_seq){
		this.faml_seq = faml_seq;
	}

	public void setChild_flnm(String child_flnm){
		this.child_flnm = child_flnm;
	}

	public void setFaml_rshp_cd(String faml_rshp_cd){
		this.faml_rshp_cd = faml_rshp_cd;
	}

	public void setFaml_rshp_nm(String faml_rshp_nm){
		this.faml_rshp_nm = faml_rshp_nm;
	}

	public void setTreat_edu_frdt(String treat_edu_frdt){
		this.treat_edu_frdt = treat_edu_frdt;
	}

	public void setTreat_edu_todt(String treat_edu_todt){
		this.treat_edu_todt = treat_edu_todt;
	}

	public void setTreat_edu_cont(String treat_edu_cont){
		this.treat_edu_cont = treat_edu_cont;
	}

	public void setTreat_edu_instt(String treat_edu_instt){
		this.treat_edu_instt = treat_edu_instt;
	}

	public void setTreat_edu_instt_tel_no(String treat_edu_instt_tel_no){
		this.treat_edu_instt_tel_no = treat_edu_instt_tel_no;
	}

	public void setClam_amt(String clam_amt){
		this.clam_amt = clam_amt;
	}

	public void setCmpy_sply_amt(String cmpy_sply_amt){
		this.cmpy_sply_amt = cmpy_sply_amt;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setSlip_proc_seq(String slip_proc_seq){
		this.slip_proc_seq = slip_proc_seq;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setPay_plac_clsf(String pay_plac_clsf){
		this.pay_plac_clsf = pay_plac_clsf;
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

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getFaml_seq(){
		return this.faml_seq;
	}

	public String getChild_flnm(){
		return this.child_flnm;
	}

	public String getFaml_rshp_cd(){
		return this.faml_rshp_cd;
	}

	public String getFaml_rshp_nm(){
		return this.faml_rshp_nm;
	}

	public String getTreat_edu_frdt(){
		return this.treat_edu_frdt;
	}

	public String getTreat_edu_todt(){
		return this.treat_edu_todt;
	}

	public String getTreat_edu_cont(){
		return this.treat_edu_cont;
	}

	public String getTreat_edu_instt(){
		return this.treat_edu_instt;
	}

	public String getTreat_edu_instt_tel_no(){
		return this.treat_edu_instt_tel_no;
	}

	public String getClam_amt(){
		return this.clam_amt;
	}

	public String getCmpy_sply_amt(){
		return this.cmpy_sply_amt;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getSlip_proc_seq(){
		return this.slip_proc_seq;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getPay_plac_clsf(){
		return this.pay_plac_clsf;
	}
}

/* 작성시간 : Tue Aug 11 14:49:40 KST 2009 */