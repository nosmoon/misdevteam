/***************************************************************************************************
* ���ϸ� : SE_BAS_1100_MAREALISTRecord.java
* ��� :  �Ǹ� - �������� - �������� 
 * �ۼ����� : 2009.01.15
 * �ۼ��� :   �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.bas.rec;

import java.sql.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.ds.*;

/**
 * 
 */


public class SE_BAS_1100_MAREALISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_cd;
	public String area_nm;
	public String dept_cd;
	public String supr_dept_cd;

	public String getSupr_dept_cd() {
		return supr_dept_cd;
	}

	public void setSupr_dept_cd(String supr_dept_cd) {
		this.supr_dept_cd = supr_dept_cd;
	}

	public SE_BAS_1100_MAREALISTRecord(){}

	public String getArea_cd() {
		return area_cd;
	}

	public void setArea_cd(String area_cd) {
		this.area_cd = area_cd;
	}

	public String getArea_nm() {
		return area_nm;
	}

	public void setArea_nm(String area_nm) {
		this.area_nm = area_nm;
	}

	public String getDept_cd() {
		return dept_cd;
	}

	public void setDept_cd(String dept_cd) {
		this.dept_cd = dept_cd;
	}

	
}

/* �ۼ��ð� : Fri Jan 16 10:05:09 KST 2009 */