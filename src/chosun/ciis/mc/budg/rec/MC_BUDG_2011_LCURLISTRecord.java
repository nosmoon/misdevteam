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


public class MC_BUDG_2011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String sum_ini_plan_qunt_01;
	public String sum_ini_plan_qunt_02;
	public String rmks;
	public String form_dept_cd;

	public MC_BUDG_2011_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setSum_ini_plan_qunt_01(String sum_ini_plan_qunt_01){
		this.sum_ini_plan_qunt_01 = sum_ini_plan_qunt_01;
	}

	public void setSum_ini_plan_qunt_02(String sum_ini_plan_qunt_02){
		this.sum_ini_plan_qunt_02 = sum_ini_plan_qunt_02;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setForm_dept_cd(String form_dept_cd){
		this.form_dept_cd = form_dept_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getSum_ini_plan_qunt_01(){
		return this.sum_ini_plan_qunt_01;
	}

	public String getSum_ini_plan_qunt_02(){
		return this.sum_ini_plan_qunt_02;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getForm_dept_cd(){
		return this.form_dept_cd;
	}
}

/* �ۼ��ð� : Fri May 15 17:46:46 KST 2009 */