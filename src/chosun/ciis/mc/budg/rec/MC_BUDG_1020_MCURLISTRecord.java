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


public class MC_BUDG_1020_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_clas_cdnm;
	public String budg_clas_cd;
	public String abrv_nm;

	public MC_BUDG_1020_MCURLISTRecord(){}

	public void setBudg_clas_cdnm(String budg_clas_cdnm){
		this.budg_clas_cdnm = budg_clas_cdnm;
	}

	public void setBudg_clas_cd(String budg_clas_cd){
		this.budg_clas_cd = budg_clas_cd;
	}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public String getBudg_clas_cdnm(){
		return this.budg_clas_cdnm;
	}

	public String getBudg_clas_cd(){
		return this.budg_clas_cd;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}
}

/* �ۼ��ð� : Thu Mar 19 10:52:16 KST 2009 */