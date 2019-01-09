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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_2600_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String non_tax_yn_jrnst;
	public String non_tax_yn_frnc;
	public String simp_tax_rate;

	public HD_SALY_2600_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setNon_tax_yn_jrnst(String non_tax_yn_jrnst){
		this.non_tax_yn_jrnst = non_tax_yn_jrnst;
	}

	public void setNon_tax_yn_frnc(String non_tax_yn_frnc){
		this.non_tax_yn_frnc = non_tax_yn_frnc;
	}

	public void setSimp_tax_rate(String simp_tax_rate){
		this.simp_tax_rate = simp_tax_rate;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getNon_tax_yn_jrnst(){
		return this.non_tax_yn_jrnst;
	}

	public String getNon_tax_yn_frnc(){
		return this.non_tax_yn_frnc;
	}

	public String getSimp_tax_rate(){
		return this.simp_tax_rate;
	}
}

/* 작성시간 : Fri Jul 03 16:47:04 KST 2015 */