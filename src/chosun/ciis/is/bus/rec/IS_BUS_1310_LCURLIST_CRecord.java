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


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_1310_LCURLIST_CRecord extends java.lang.Object implements java.io.Serializable{

	public String mi_amt_1;
	public String mi_amt_2;
	public String mi_amt_3;
	public String mi_amt_t;

	public IS_BUS_1310_LCURLIST_CRecord(){}

	public void setMi_amt_1(String mi_amt_1){
		this.mi_amt_1 = mi_amt_1;
	}

	public void setMi_amt_2(String mi_amt_2){
		this.mi_amt_2 = mi_amt_2;
	}

	public void setMi_amt_3(String mi_amt_3){
		this.mi_amt_3 = mi_amt_3;
	}

	public void setMi_amt_t(String mi_amt_t){
		this.mi_amt_t = mi_amt_t;
	}

	public String getMi_amt_1(){
		return this.mi_amt_1;
	}

	public String getMi_amt_2(){
		return this.mi_amt_2;
	}

	public String getMi_amt_3(){
		return this.mi_amt_3;
	}

	public String getMi_amt_t(){
		return this.mi_amt_t;
	}
}

/* �ۼ��ð� : Tue Jun 19 21:07:14 KST 2012 */