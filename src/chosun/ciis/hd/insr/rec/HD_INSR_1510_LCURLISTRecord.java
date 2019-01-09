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


package chosun.ciis.hd.insr.rec;

import java.sql.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

/**
 * 
 */


public class HD_INSR_1510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String nm_korn;
	public String dept_cd;
	public String dept_cd_nm;
	public String dty_cd;
	public String dty_cd_nm;
	public String posi_cd;
	public String posi_cd_nm;
	public String last_slf_burd_amt;
	public String slf_burd_amt;
	public String emp_amt;
	public String slf_minus_np;

	public HD_INSR_1510_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_cd_nm(String dty_cd_nm){
		this.dty_cd_nm = dty_cd_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_cd_nm(String posi_cd_nm){
		this.posi_cd_nm = posi_cd_nm;
	}

	public void setLast_slf_burd_amt(String last_slf_burd_amt){
		this.last_slf_burd_amt = last_slf_burd_amt;
	}

	public void setSlf_burd_amt(String slf_burd_amt){
		this.slf_burd_amt = slf_burd_amt;
	}

	public void setEmp_amt(String emp_amt){
		this.emp_amt = emp_amt;
	}

	public void setSlf_minus_np(String slf_minus_np){
		this.slf_minus_np = slf_minus_np;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_cd_nm(){
		return this.dty_cd_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_cd_nm(){
		return this.posi_cd_nm;
	}

	public String getLast_slf_burd_amt(){
		return this.last_slf_burd_amt;
	}

	public String getSlf_burd_amt(){
		return this.slf_burd_amt;
	}

	public String getEmp_amt(){
		return this.emp_amt;
	}

	public String getSlf_minus_np(){
		return this.slf_minus_np;
	}
}

/* 작성시간 : Fri Oct 04 14:43:32 KST 2013 */