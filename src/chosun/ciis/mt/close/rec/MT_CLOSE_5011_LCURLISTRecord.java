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


package chosun.ciis.mt.close.rec;

import java.sql.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */


public class MT_CLOSE_5011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_no;
	public String fisc_dt;

	public MT_CLOSE_5011_LCURLISTRecord(){}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}
}

/* �ۼ��ð� : Fri Sep 04 15:57:02 KST 2009 */