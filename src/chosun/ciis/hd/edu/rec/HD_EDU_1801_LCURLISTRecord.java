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


public class HD_EDU_1801_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String chrg_job;
	public String edu_nm;
	public String edu_instt;
	public String edu_frdt;
	public String edu_todt;
	public String edu_tm_clsf;
	public String edu_fr_tm;
	public String edu_to_tm;
	public String edu_cost;
	public String edu_sply_cost;
	public String remk;
	public String aprv_yn;
	public String complt_yn;
	public String proc_stat;
	public String occr_dt;
	public String seq;
	public String lang_cd;
	public String course_cd;
	public String sply_fee_pay;

	public HD_EDU_1801_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
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

	public void setChrg_job(String chrg_job){
		this.chrg_job = chrg_job;
	}

	public void setEdu_nm(String edu_nm){
		this.edu_nm = edu_nm;
	}

	public void setEdu_instt(String edu_instt){
		this.edu_instt = edu_instt;
	}

	public void setEdu_frdt(String edu_frdt){
		this.edu_frdt = edu_frdt;
	}

	public void setEdu_todt(String edu_todt){
		this.edu_todt = edu_todt;
	}

	public void setEdu_tm_clsf(String edu_tm_clsf){
		this.edu_tm_clsf = edu_tm_clsf;
	}

	public void setEdu_fr_tm(String edu_fr_tm){
		this.edu_fr_tm = edu_fr_tm;
	}

	public void setEdu_to_tm(String edu_to_tm){
		this.edu_to_tm = edu_to_tm;
	}

	public void setEdu_cost(String edu_cost){
		this.edu_cost = edu_cost;
	}

	public void setEdu_sply_cost(String edu_sply_cost){
		this.edu_sply_cost = edu_sply_cost;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAprv_yn(String aprv_yn){
		this.aprv_yn = aprv_yn;
	}

	public void setComplt_yn(String complt_yn){
		this.complt_yn = complt_yn;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setLang_cd(String lang_cd){
		this.lang_cd = lang_cd;
	}

	public void setCourse_cd(String course_cd){
		this.course_cd = course_cd;
	}

	public void setSply_fee_pay(String sply_fee_pay){
		this.sply_fee_pay = sply_fee_pay;
	}

	public String getEmp_no(){
		return this.emp_no;
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

	public String getChrg_job(){
		return this.chrg_job;
	}

	public String getEdu_nm(){
		return this.edu_nm;
	}

	public String getEdu_instt(){
		return this.edu_instt;
	}

	public String getEdu_frdt(){
		return this.edu_frdt;
	}

	public String getEdu_todt(){
		return this.edu_todt;
	}

	public String getEdu_tm_clsf(){
		return this.edu_tm_clsf;
	}

	public String getEdu_fr_tm(){
		return this.edu_fr_tm;
	}

	public String getEdu_to_tm(){
		return this.edu_to_tm;
	}

	public String getEdu_cost(){
		return this.edu_cost;
	}

	public String getEdu_sply_cost(){
		return this.edu_sply_cost;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getAprv_yn(){
		return this.aprv_yn;
	}

	public String getComplt_yn(){
		return this.complt_yn;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getLang_cd(){
		return this.lang_cd;
	}

	public String getCourse_cd(){
		return this.course_cd;
	}

	public String getSply_fee_pay(){
		return this.sply_fee_pay;
	}
}

/* 작성시간 : Thu Sep 06 15:33:19 KST 2018 */