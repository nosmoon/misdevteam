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


package chosun.ciis.hd.appmt.rec;

import java.sql.*;
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.ds.*;

/**
 * 
 */


public class HD_APPMT_3000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String team_nm;
	public String emp_no;
	public String nm_korn;
	public String gender;
	public String posk_clas_nm;
	public String in_cmpy_dt;
	public String su_dt;
	public String fst_dt;
	public String sec_dt;
	public String dspch_enpr_main_nm;
	public String mang_liab_pers_flnm;

	public HD_APPMT_3000_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setTeam_nm(String team_nm){
		this.team_nm = team_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public void setPosk_clas_nm(String posk_clas_nm){
		this.posk_clas_nm = posk_clas_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setSu_dt(String su_dt){
		this.su_dt = su_dt;
	}

	public void setFst_dt(String fst_dt){
		this.fst_dt = fst_dt;
	}

	public void setSec_dt(String sec_dt){
		this.sec_dt = sec_dt;
	}

	public void setDspch_enpr_main_nm(String dspch_enpr_main_nm){
		this.dspch_enpr_main_nm = dspch_enpr_main_nm;
	}

	public void setMang_liab_pers_flnm(String mang_liab_pers_flnm){
		this.mang_liab_pers_flnm = mang_liab_pers_flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getTeam_nm(){
		return this.team_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getGender(){
		return this.gender;
	}

	public String getPosk_clas_nm(){
		return this.posk_clas_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getSu_dt(){
		return this.su_dt;
	}

	public String getFst_dt(){
		return this.fst_dt;
	}

	public String getSec_dt(){
		return this.sec_dt;
	}

	public String getDspch_enpr_main_nm(){
		return this.dspch_enpr_main_nm;
	}

	public String getMang_liab_pers_flnm(){
		return this.mang_liab_pers_flnm;
	}
}

/* 작성시간 : Wed Jun 03 16:01:01 KST 2009 */