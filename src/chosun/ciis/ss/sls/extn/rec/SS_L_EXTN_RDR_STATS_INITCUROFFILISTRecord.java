/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ�-��������-�̻絶�ڼ�����Ȳ
* �ۼ����� : 2011-12-05
* �ۼ��� : �̱⿵
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_L_EXTN_RDR_STATS_INITCUROFFILISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String supr_dept_cd;

	public SS_L_EXTN_RDR_STATS_INITCUROFFILISTRecord(){}

	public void setDeptcd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDeptnm(String dept_nm){
		this.dept_nm = dept_nm;
	}
	public void setSuprdeptcd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public String getDeptcd(){
		return this.dept_cd;
	}

	public String getDeptnm(){
		return this.dept_nm;
	}
	public String getSuprdeptcd(){
		return this.supr_dept_cd;
	}
}

/* �ۼ��ð� : Sat Feb 11 12:15:39 KST 2012 */