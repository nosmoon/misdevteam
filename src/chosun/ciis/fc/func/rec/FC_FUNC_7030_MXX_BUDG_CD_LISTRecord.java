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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_7030_MXX_BUDG_CD_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_abrv_nm;
	public String budg_cd;

	public FC_FUNC_7030_MXX_BUDG_CD_LISTRecord(){}

	public void setBudg_abrv_nm(String budg_abrv_nm){
		this.budg_abrv_nm = budg_abrv_nm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public String getBudg_abrv_nm(){
		return this.budg_abrv_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}
}

/* �ۼ��ð� : Mon Jan 09 17:24:30 KST 2012 */