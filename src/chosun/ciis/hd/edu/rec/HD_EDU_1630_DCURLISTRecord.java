/***************************************************************************************************
* 파일명 : .java
* 기능 : 인사-급여관리-총보상 생성 및 조회(TV조선용)
* 작성일자 : 2014-10-15
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


public class HD_EDU_1630_DCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String posi_nm;
	public String edu_clsf_nm;
	public String edu_nm;
	public String edu_frdt;
	public String edu_todt;
	public String edu_instt;
	public String edu_dds;
	public String edu_tm;
	public String edu_cost;
	public String complt;

	public HD_EDU_1630_DCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setEdu_clsf_nm(String edu_clsf_nm){
		this.edu_clsf_nm = edu_clsf_nm;
	}

	public void setEdu_nm(String edu_nm){
		this.edu_nm = edu_nm;
	}

	public void setEdu_frdt(String edu_frdt){
		this.edu_frdt = edu_frdt;
	}

	public void setEdu_todt(String edu_todt){
		this.edu_todt = edu_todt;
	}

	public void setEdu_instt(String edu_instt){
		this.edu_instt = edu_instt;
	}

	public void setEdu_dds(String edu_dds){
		this.edu_dds = edu_dds;
	}

	public void setEdu_tm(String edu_tm){
		this.edu_tm = edu_tm;
	}

	public void setEdu_cost(String edu_cost){
		this.edu_cost = edu_cost;
	}

	public void setComplt(String complt){
		this.complt = complt;
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

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getEdu_clsf_nm(){
		return this.edu_clsf_nm;
	}

	public String getEdu_nm(){
		return this.edu_nm;
	}

	public String getEdu_frdt(){
		return this.edu_frdt;
	}

	public String getEdu_todt(){
		return this.edu_todt;
	}

	public String getEdu_instt(){
		return this.edu_instt;
	}

	public String getEdu_dds(){
		return this.edu_dds;
	}

	public String getEdu_tm(){
		return this.edu_tm;
	}

	public String getEdu_cost(){
		return this.edu_cost;
	}

	public String getComplt(){
		return this.complt;
	}
}

/* 작성시간 : Tue Nov 04 15:56:48 KST 2014 */