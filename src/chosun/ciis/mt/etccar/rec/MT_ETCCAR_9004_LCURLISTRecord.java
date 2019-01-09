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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_9004_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String nm_korn;
	public String cmpy_cd_nm;
	public String dept_nm;
	public String ptph_no;
	public String tel_no;
	public String cmpy_cd;

	public MT_ETCCAR_9004_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setCmpy_cd_nm(String cmpy_cd_nm){
		this.cmpy_cd_nm = cmpy_cd_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}
	
	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getCmpy_cd_nm(){
		return this.cmpy_cd_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

}

/* 작성시간 : Thu Dec 20 18:43:26 KST 2012 */