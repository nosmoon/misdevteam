/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_2100_MPARTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String supr_dept_cd;

	public SE_SAL_2100_MPARTLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
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
}

/* �ۼ��ð� : Fri Sep 04 15:05:51 KST 2009 */