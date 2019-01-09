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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_1800_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd_nm;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;
	public String emp_clsf_nm;
	public String emp_clsf;
	public String appmt_cd;
	public String appmt_nm;
	public String appmt_cont;
	public String appmt_frdt;
	public String appmt_todt;
	public String now_dt;

	public HD_SRCH_1800_LCURLISTRecord(){}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setAppmt_cd(String appmt_cd){
		this.appmt_cd = appmt_cd;
	}

	public void setAppmt_nm(String appmt_nm){
		this.appmt_nm = appmt_nm;
	}

	public void setAppmt_cont(String appmt_cont){
		this.appmt_cont = appmt_cont;
	}
	
	public void setAppmt_frdt(String appmt_frdt){
		this.appmt_frdt = appmt_frdt;
	}

	public void setAppmt_todt(String appmt_todt){
		this.appmt_todt = appmt_todt;
	}

	public void setNow_dt(String now_dt){
		this.now_dt = now_dt;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getAppmt_cd(){
		return this.appmt_cd;
	}

	public String getAppmt_nm(){
		return this.appmt_nm;
	}

	public String getAppmt_cont(){
		return this.appmt_cont;
	}
	
	public String getAppmt_frdt(){
		return this.appmt_frdt;
	}

	public String getAppmt_todt(){
		return this.appmt_todt;
	}

	public String getNow_dt(){
		return this.now_dt;
	}
}

/* 작성시간 : Tue Mar 31 14:46:33 KST 2009 */