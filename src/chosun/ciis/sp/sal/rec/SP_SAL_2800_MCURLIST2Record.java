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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_2800_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String sp_comp_chrg_pers_emp_no;
	public String sp_comp_chrg_pers_emp_nm;

	public SP_SAL_2800_MCURLIST2Record(){}

	public void setSp_comp_chrg_pers_emp_no(String sp_comp_chrg_pers_emp_no){
		this.sp_comp_chrg_pers_emp_no = sp_comp_chrg_pers_emp_no;
	}

	public void setSp_comp_chrg_pers_emp_nm(String sp_comp_chrg_pers_emp_nm){
		this.sp_comp_chrg_pers_emp_nm = sp_comp_chrg_pers_emp_nm;
	}

	public String getSp_comp_chrg_pers_emp_no(){
		return this.sp_comp_chrg_pers_emp_no;
	}

	public String getSp_comp_chrg_pers_emp_nm(){
		return this.sp_comp_chrg_pers_emp_nm;
	}
}

/* 작성시간 : Sun Jul 22 17:16:30 KST 2012 */