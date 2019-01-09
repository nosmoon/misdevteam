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


package chosun.ciis.is.agr.rec;

import java.sql.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.ds.*;

/**
 * 
 */


public class IS_AGR_2700_MCURLIST7Record extends java.lang.Object implements java.io.Serializable{

	public String step;
	public String dept_cd;
	public String dept_nm;
	public String supr_dept_cd;
	public String dept_rptv_addr;

	public IS_AGR_2700_MCURLIST7Record(){}

	public void setStep(String step){
		this.step = step;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setDept_rptv_addr(String dept_rptv_addr){
		this.dept_rptv_addr = dept_rptv_addr;
	}

	public String getStep(){
		return this.step;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getDept_rptv_addr(){
		return this.dept_rptv_addr;
	}
}

/* 작성시간 : Tue Jun 05 21:55:17 KST 2012 */