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


public class EN_INNEXP_2001_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String reven_amt_2;
	public String expn_amt_2;
	public String bal_amt_2;

	public EN_INNEXP_2001_LCURLIST2Record(){}

	public void setReven_amt_2(String reven_amt_2){
		this.reven_amt_2 = reven_amt_2;
	}

	public void setExpn_amt_2(String expn_amt_2){
		this.expn_amt_2 = expn_amt_2;
	}

	public void setBal_amt_2(String bal_amt_2){
		this.bal_amt_2 = bal_amt_2;
	}

	public String getReven_amt_2(){
		return this.reven_amt_2;
	}

	public String getExpn_amt_2(){
		return this.expn_amt_2;
	}

	public String getBal_amt_2(){
		return this.bal_amt_2;
	}
}

/* �ۼ��ð� : Wed Apr 29 14:49:12 KST 2009 */