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


package chosun.ciis.is.bas.rec;

import java.sql.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.ds.*;

/**
 * 
 */


public class IS_BAS_1140_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String supr_dept_cd;
	public String supr_dept_nm;
	public String step;

	public IS_BAS_1140_LCURLISTRecord(){}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setSupr_dept_nm(String supr_dept_nm){
		this.supr_dept_nm = supr_dept_nm;
	}

	public void setStep(String step){
		this.step = step;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getSupr_dept_nm(){
		return this.supr_dept_nm;
	}

	public String getStep(){
		return this.step;
	}
}

/* �ۼ��ð� : Mon Dec 17 19:04:15 KST 2012 */