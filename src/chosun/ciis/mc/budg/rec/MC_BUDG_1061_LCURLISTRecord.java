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


public class MC_BUDG_1061_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String ycyscdnm;

	public MC_BUDG_1061_LCURLISTRecord(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setYcyscdnm(String ycyscdnm){
		this.ycyscdnm = ycyscdnm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getYcyscdnm(){
		return this.ycyscdnm;
	}
}

/* �ۼ��ð� : Mon Apr 06 13:07:38 KST 2009 */