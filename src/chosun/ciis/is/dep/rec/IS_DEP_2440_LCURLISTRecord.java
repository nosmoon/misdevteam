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


package chosun.ciis.is.dep.rec;

import java.sql.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;

/**
 * 
 */


public class IS_DEP_2440_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tms;
	public String rcpay_dt;
	public String rcpay_amt;

	public IS_DEP_2440_LCURLISTRecord(){}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setRcpay_dt(String rcpay_dt){
		this.rcpay_dt = rcpay_dt;
	}

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public String getTms(){
		return this.tms;
	}

	public String getRcpay_dt(){
		return this.rcpay_dt;
	}

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}
}

/* �ۼ��ð� : Tue May 22 14:06:36 KST 2012 */