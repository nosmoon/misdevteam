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


public class EN_INNEXP_1503_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_no;
	public String budg_cd;
	public String budg_nm;
	public String amt;
	public String titl;

	public EN_INNEXP_1503_LCURLISTRecord(){}

	public void setOccr_no(String occr_no){
		this.occr_no = occr_no;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public String getOccr_no(){
		return this.occr_no;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getTitl(){
		return this.titl;
	}
}

/* �ۼ��ð� : Fri Apr 24 17:55:18 KST 2009 */