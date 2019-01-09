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


public class HD_EDU_1701_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String chrg_job;
	public String edu_nm;
	public String edu_instt;
	public String edu_frdt;
	public String edu_todt;
	public String edu_tm_clsf;
	public String edu_fr_tm;
	public String edu_to_tm;
	public String remk;
	public String edu_sply_cost;
	public String edu_cost;

	public HD_EDU_1701_LCURLIST2Record(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
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

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setEdu_sply_cost(String edu_sply_cost){
		this.edu_sply_cost = edu_sply_cost;
	}

	public void setEdu_cost(String edu_cost){
		this.edu_cost = edu_cost;
	}

	public String getEmp_no(){
		return this.emp_no;
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

	public String getRemk(){
		return this.remk;
	}

	public String getEdu_sply_cost(){
		return this.edu_sply_cost;
	}

	public String getEdu_cost(){
		return this.edu_cost;
	}
}

/* 작성시간 : Tue Apr 23 17:06:17 KST 2013 */