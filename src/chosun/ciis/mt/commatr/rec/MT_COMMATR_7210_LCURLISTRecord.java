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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_7210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_no;
	public String ewh_dt;
	public String rest_amt;
	public String rmks1;

	public MT_COMMATR_7210_LCURLISTRecord(){}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setRest_amt(String rest_amt){
		this.rest_amt = rest_amt;
	}
	
	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getRest_amt(){
		return this.rest_amt;
	}
	
	public String getRmks1(){
		return this.rmks1;
	}
}

/* �ۼ��ð� : Wed Mar 27 17:22:31 KST 2013 */