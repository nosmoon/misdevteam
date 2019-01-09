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


public class HD_EDU_1303_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

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
	public String edu_clsf;
	public String lecture_nm;
	public String edu_frdt;
	public String edu_todt;
	public String edu_tm;
	public String edu_cost;
	public String emp_yn;
	public String edu_scor;
	public String complt_yn;
	public String complt_yn_nm;
	public String emp_yn_nm;
	public String edu_dtls_clsf;
	public String edu_dtls_clsf_nm;
	public String lang_cd;
	public String lang_nm;
	public String offi_nm;
	public String remk;

	public HD_EDU_1303_LCURLISTRecord(){}

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

	public void setEdu_clsf(String edu_clsf){
		this.edu_clsf = edu_clsf;
	}

	public void setLecture_nm(String lecture_nm){
		this.lecture_nm = lecture_nm;
	}

	public void setEdu_frdt(String edu_frdt){
		this.edu_frdt = edu_frdt;
	}

	public void setEdu_todt(String edu_todt){
		this.edu_todt = edu_todt;
	}

	public void setEdu_tm(String edu_tm){
		this.edu_tm = edu_tm;
	}

	public void setEdu_cost(String edu_cost){
		this.edu_cost = edu_cost;
	}

	public void setEmp_yn(String emp_yn){
		this.emp_yn = emp_yn;
	}

	public void setEdu_scor(String edu_scor){
		this.edu_scor = edu_scor;
	}

	public void setComplt_yn(String complt_yn){
		this.complt_yn = complt_yn;
	}

	public void setComplt_yn_nm(String complt_yn_nm){
		this.complt_yn_nm = complt_yn_nm;
	}

	public void setEmp_yn_nm(String emp_yn_nm){
		this.emp_yn_nm = emp_yn_nm;
	}

	public void setEdu_dtls_clsf(String edu_dtls_clsf){
		this.edu_dtls_clsf = edu_dtls_clsf;
	}

	public void setEdu_dtls_clsf_nm(String edu_dtls_clsf_nm){
		this.edu_dtls_clsf_nm = edu_dtls_clsf_nm;
	}

	public void setLang_cd(String lang_cd){
		this.lang_cd = lang_cd;
	}

	public void setLang_nm(String lang_nm){
		this.lang_nm = lang_nm;
	}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getEdu_clsf(){
		return this.edu_clsf;
	}

	public String getLecture_nm(){
		return this.lecture_nm;
	}

	public String getEdu_frdt(){
		return this.edu_frdt;
	}

	public String getEdu_todt(){
		return this.edu_todt;
	}

	public String getEdu_tm(){
		return this.edu_tm;
	}

	public String getEdu_cost(){
		return this.edu_cost;
	}

	public String getEmp_yn(){
		return this.emp_yn;
	}

	public String getEdu_scor(){
		return this.edu_scor;
	}

	public String getComplt_yn(){
		return this.complt_yn;
	}

	public String getComplt_yn_nm(){
		return this.complt_yn_nm;
	}

	public String getEmp_yn_nm(){
		return this.emp_yn_nm;
	}

	public String getEdu_dtls_clsf(){
		return this.edu_dtls_clsf;
	}

	public String getEdu_dtls_clsf_nm(){
		return this.edu_dtls_clsf_nm;
	}

	public String getLang_cd(){
		return this.lang_cd;
	}

	public String getLang_nm(){
		return this.lang_nm;
	}

	public String getOffi_nm(){
		return this.offi_nm;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Thu Sep 06 16:05:09 KST 2018 */