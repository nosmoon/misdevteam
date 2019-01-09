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


public class HD_EDU_2301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String edu_frdt;
	public String edu_todt;
	public String lecture_nm;
	public String complt_yn_nm;
	public String edu_cost;
	public String remk;
	public String lang_aprv_tms_chk;
	public String edu_clsf;

	public HD_EDU_2301_LCURLISTRecord(){}

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

	public void setEdu_frdt(String edu_frdt){
		this.edu_frdt = edu_frdt;
	}

	public void setEdu_todt(String edu_todt){
		this.edu_todt = edu_todt;
	}

	public void setLecture_nm(String lecture_nm){
		this.lecture_nm = lecture_nm;
	}

	public void setComplt_yn_nm(String complt_yn_nm){
		this.complt_yn_nm = complt_yn_nm;
	}

	public void setEdu_cost(String edu_cost){
		this.edu_cost = edu_cost;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setLang_aprv_tms_chk(String lang_aprv_tms_chk){
		this.lang_aprv_tms_chk = lang_aprv_tms_chk;
	}

	public void setEdu_clsf(String edu_clsf){
		this.edu_clsf = edu_clsf;
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

	public String getEdu_frdt(){
		return this.edu_frdt;
	}

	public String getEdu_todt(){
		return this.edu_todt;
	}

	public String getLecture_nm(){
		return this.lecture_nm;
	}

	public String getComplt_yn_nm(){
		return this.complt_yn_nm;
	}

	public String getEdu_cost(){
		return this.edu_cost;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getLang_aprv_tms_chk(){
		return this.lang_aprv_tms_chk;
	}

	public String getEdu_clsf(){
		return this.edu_clsf;
	}
}

/* 작성시간 : Thu Sep 13 16:42:28 KST 2018 */