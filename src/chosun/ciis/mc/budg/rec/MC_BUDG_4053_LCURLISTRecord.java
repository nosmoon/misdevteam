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


public class MC_BUDG_4053_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String budg_nm;
	public String fix_asin_amt;

	public MC_BUDG_4053_LCURLISTRecord(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setFix_asin_amt(String fix_asin_amt){
		this.fix_asin_amt = fix_asin_amt;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getFix_asin_amt(){
		return this.fix_asin_amt;
	}
}

/* �ۼ��ð� : Fri May 29 19:39:59 KST 2009 */