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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_4106_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chg_aft_dept_cd;
	public String dept_nm;
	public String chg_ratio;

	public MC_BUDG_4106_LCURLISTRecord(){}

	public void setChg_aft_dept_cd(String chg_aft_dept_cd){
		this.chg_aft_dept_cd = chg_aft_dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setChg_ratio(String chg_ratio){
		this.chg_ratio = chg_ratio;
	}

	public String getChg_aft_dept_cd(){
		return this.chg_aft_dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getChg_ratio(){
		return this.chg_ratio;
	}
}

/* �ۼ��ð� : Wed Aug 19 15:31:39 KST 2009 */