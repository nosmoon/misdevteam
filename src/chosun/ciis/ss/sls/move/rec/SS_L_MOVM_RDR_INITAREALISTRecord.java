/***************************************************************************************************
* ���ϸ� : .java
* ��� : *�̻絶��-��û��Ȳ-�ʱ�ȭ��
* �ۼ����� : 2009-04-07
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.move.rec;

import java.sql.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.ds.*;

/**
 * �̻絶��-��û��Ȳ-�ʱ�ȭ��
 */

public class SS_L_MOVM_RDR_INITAREALISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_cd;
	public String area_nm;
	public String dept_cd;
	public String supr_dept_cd;

	public SS_L_MOVM_RDR_INITAREALISTRecord(){}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}
}

/* �ۼ��ð� : Tue Apr 07 17:10:46 KST 2009 */