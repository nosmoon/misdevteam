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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_6501_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String evlu_grp_cd;
	public String evlu_grp_nm;
	public String dept_nm1;
	public String emp_no1;
	public String nm_korn1;
	public String dept_nm2;
	public String emp_no2;
	public String nm_korn2;
	public String db_status;
	public String evlu_yy;
	public String tms_clsf;

	public HD_EVLU_6501_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
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

	public void setEvlu_grp_cd(String evlu_grp_cd){
		this.evlu_grp_cd = evlu_grp_cd;
	}

	public void setEvlu_grp_nm(String evlu_grp_nm){
		this.evlu_grp_nm = evlu_grp_nm;
	}

	public void setDept_nm1(String dept_nm1){
		this.dept_nm1 = dept_nm1;
	}

	public void setEmp_no1(String emp_no1){
		this.emp_no1 = emp_no1;
	}

	public void setNm_korn1(String nm_korn1){
		this.nm_korn1 = nm_korn1;
	}

	public void setDept_nm2(String dept_nm2){
		this.dept_nm2 = dept_nm2;
	}

	public void setEmp_no2(String emp_no2){
		this.emp_no2 = emp_no2;
	}

	public void setNm_korn2(String nm_korn2){
		this.nm_korn2 = nm_korn2;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
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

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getEvlu_grp_cd(){
		return this.evlu_grp_cd;
	}

	public String getEvlu_grp_nm(){
		return this.evlu_grp_nm;
	}

	public String getDept_nm1(){
		return this.dept_nm1;
	}

	public String getEmp_no1(){
		return this.emp_no1;
	}

	public String getNm_korn1(){
		return this.nm_korn1;
	}

	public String getDept_nm2(){
		return this.dept_nm2;
	}

	public String getEmp_no2(){
		return this.emp_no2;
	}

	public String getNm_korn2(){
		return this.nm_korn2;
	}

	public String getDb_status(){
		return this.db_status;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}
}

/* 작성시간 : Tue Sep 22 16:20:04 KST 2015 */