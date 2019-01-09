/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_EDU_5101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String acpn_no;
	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String phon_num;
	public String out_class_type;
	public String out_class_type_nm;
	public String acty_type;
	public String acty_type_nm;
	public String acty_etc;
	public String req_instt_nm;
	public String req_presi_nm;
	public String req_chrg_dept_nm;
	public String req_chrg_nm;
	public String req_phon_nm;
	public String req_resn;
	public String out_class_subj_nm;
	public String out_class_plac;
	public String out_class_fr_dt;
	public String out_class_to_dt;
	public String out_class_fr_tm;
	public String out_class_to_tm;
	public String yy_avg_tms;
	public String mm_avg_tms;
	public String tms_avg_tm;
	public String tot_amt;
	public String tms_avg_amt;
	public String trff_stay_amt;
	public String tms_avg_trff_stay_amt;
	public String proc_stat;

	public HD_EDU_5101_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAcpn_no(String acpn_no){
		this.acpn_no = acpn_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
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

	public void setPhon_num(String phon_num){
		this.phon_num = phon_num;
	}

	public void setOut_class_type(String out_class_type){
		this.out_class_type = out_class_type;
	}

	public void setOut_class_type_nm(String out_class_type_nm){
		this.out_class_type_nm = out_class_type_nm;
	}

	public void setActy_type(String acty_type){
		this.acty_type = acty_type;
	}

	public void setActy_type_nm(String acty_type_nm){
		this.acty_type_nm = acty_type_nm;
	}

	public void setActy_etc(String acty_etc){
		this.acty_etc = acty_etc;
	}

	public void setReq_instt_nm(String req_instt_nm){
		this.req_instt_nm = req_instt_nm;
	}

	public void setReq_presi_nm(String req_presi_nm){
		this.req_presi_nm = req_presi_nm;
	}

	public void setReq_chrg_dept_nm(String req_chrg_dept_nm){
		this.req_chrg_dept_nm = req_chrg_dept_nm;
	}

	public void setReq_chrg_nm(String req_chrg_nm){
		this.req_chrg_nm = req_chrg_nm;
	}

	public void setReq_phon_nm(String req_phon_nm){
		this.req_phon_nm = req_phon_nm;
	}

	public void setReq_resn(String req_resn){
		this.req_resn = req_resn;
	}

	public void setOut_class_subj_nm(String out_class_subj_nm){
		this.out_class_subj_nm = out_class_subj_nm;
	}

	public void setOut_class_plac(String out_class_plac){
		this.out_class_plac = out_class_plac;
	}

	public void setOut_class_fr_dt(String out_class_fr_dt){
		this.out_class_fr_dt = out_class_fr_dt;
	}

	public void setOut_class_to_dt(String out_class_to_dt){
		this.out_class_to_dt = out_class_to_dt;
	}

	public void setOut_class_fr_tm(String out_class_fr_tm){
		this.out_class_fr_tm = out_class_fr_tm;
	}

	public void setOut_class_to_tm(String out_class_to_tm){
		this.out_class_to_tm = out_class_to_tm;
	}

	public void setYy_avg_tms(String yy_avg_tms){
		this.yy_avg_tms = yy_avg_tms;
	}

	public void setMm_avg_tms(String mm_avg_tms){
		this.mm_avg_tms = mm_avg_tms;
	}

	public void setTms_avg_tm(String tms_avg_tm){
		this.tms_avg_tm = tms_avg_tm;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setTms_avg_amt(String tms_avg_amt){
		this.tms_avg_amt = tms_avg_amt;
	}

	public void setTrff_stay_amt(String trff_stay_amt){
		this.trff_stay_amt = trff_stay_amt;
	}

	public void setTms_avg_trff_stay_amt(String tms_avg_trff_stay_amt){
		this.tms_avg_trff_stay_amt = tms_avg_trff_stay_amt;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAcpn_no(){
		return this.acpn_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
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

	public String getPhon_num(){
		return this.phon_num;
	}

	public String getOut_class_type(){
		return this.out_class_type;
	}

	public String getOut_class_type_nm(){
		return this.out_class_type_nm;
	}

	public String getActy_type(){
		return this.acty_type;
	}

	public String getActy_type_nm(){
		return this.acty_type_nm;
	}

	public String getActy_etc(){
		return this.acty_etc;
	}

	public String getReq_instt_nm(){
		return this.req_instt_nm;
	}

	public String getReq_presi_nm(){
		return this.req_presi_nm;
	}

	public String getReq_chrg_dept_nm(){
		return this.req_chrg_dept_nm;
	}

	public String getReq_chrg_nm(){
		return this.req_chrg_nm;
	}

	public String getReq_phon_nm(){
		return this.req_phon_nm;
	}

	public String getReq_resn(){
		return this.req_resn;
	}

	public String getOut_class_subj_nm(){
		return this.out_class_subj_nm;
	}

	public String getOut_class_plac(){
		return this.out_class_plac;
	}

	public String getOut_class_fr_dt(){
		return this.out_class_fr_dt;
	}

	public String getOut_class_to_dt(){
		return this.out_class_to_dt;
	}

	public String getOut_class_fr_tm(){
		return this.out_class_fr_tm;
	}

	public String getOut_class_to_tm(){
		return this.out_class_to_tm;
	}

	public String getYy_avg_tms(){
		return this.yy_avg_tms;
	}

	public String getMm_avg_tms(){
		return this.mm_avg_tms;
	}

	public String getTms_avg_tm(){
		return this.tms_avg_tm;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getTms_avg_amt(){
		return this.tms_avg_amt;
	}

	public String getTrff_stay_amt(){
		return this.trff_stay_amt;
	}

	public String getTms_avg_trff_stay_amt(){
		return this.tms_avg_trff_stay_amt;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}
}

/* 작성시간 : Thu Sep 29 17:04:20 KST 2016 */