/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.sp.dep.rec;

import java.sql.*;
import chosun.ciis.sp.dep.dm.*;
import chosun.ciis.sp.dep.ds.*;

/**
 * 
 */


public class SP_DEP_1300_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String sp_comp_chrg_pers_emp_no;
	public String sp_comp_chrg_pers_emp_nm;

	public SP_DEP_1300_MCURLIST2Record(){}

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

/* �ۼ��ð� : Mon Jul 23 14:36:58 KST 2012 */