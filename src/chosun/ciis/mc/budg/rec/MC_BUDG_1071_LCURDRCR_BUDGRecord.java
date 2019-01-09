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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_1071_LCURDRCR_BUDGRecord extends java.lang.Object implements java.io.Serializable{

	public String budb_cd;
	public String budg_cdnm;
	public String dept_cd;
	public String offi_nm;
	public String dept_nm;
	public String clas_nm;

	public MC_BUDG_1071_LCURDRCR_BUDGRecord(){}

	public void setBudb_cd(String budb_cd){
		this.budb_cd = budb_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setClas_nm(String clas_nm){
		this.clas_nm = clas_nm;
	}

	public String getBudb_cd(){
		return this.budb_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getOffi_nm(){
		return this.offi_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getClas_nm(){
		return this.clas_nm;
	}
}

/* 작성시간 : Mon Mar 23 11:21:03 KST 2009 */