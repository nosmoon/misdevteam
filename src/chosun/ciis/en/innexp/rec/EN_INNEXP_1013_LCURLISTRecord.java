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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_1013_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String budg_nm;
	public String occr_amt;

	public EN_INNEXP_1013_LCURLISTRecord(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setOccr_amt(String occr_amt){
		this.occr_amt = occr_amt;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getOccr_amt(){
		return this.occr_amt;
	}
}

/* �ۼ��ð� : Thu Apr 16 18:54:32 KST 2009 */