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


public class FC_FUNC_6503_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String frex_cd;
	public String exrate;
	public String frex_amt;

	public FC_FUNC_6503_LCURLISTRecord(){}

	public void setFrex_cd(String frex_cd){
		this.frex_cd = frex_cd;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setFrex_amt(String frex_amt){
		this.frex_amt = frex_amt;
	}

	public String getFrex_cd(){
		return this.frex_cd;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getFrex_amt(){
		return this.frex_amt;
	}
}

/* �ۼ��ð� : Fri Mar 13 13:55:11 KST 2009 */