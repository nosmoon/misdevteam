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


public class MC_BUDG_4050_MCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String budg_abrv_nm;

	public MC_BUDG_4050_MCURLIST4Record(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_abrv_nm(String budg_abrv_nm){
		this.budg_abrv_nm = budg_abrv_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_abrv_nm(){
		return this.budg_abrv_nm;
	}
}

/* �ۼ��ð� : Tue Jun 02 09:43:29 KST 2009 */