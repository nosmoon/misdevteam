/***************************************************************************************************
* ���ϸ� : SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord.java
* ��� : ������������(���������˾�)(�����ȸ)
* �ۼ����� : 2004-04-01
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * ������������(���������˾�)(�����ȸ)
 *
 */

public class SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String abrv;
	public int dlvqty;

	public SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setAbrv(String abrv){
		this.abrv = abrv;
	}

	public void setDlvqty(int dlvqty){
		this.dlvqty = dlvqty;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getAbrv(){
		return this.abrv;
	}

	public int getDlvqty(){
		return this.dlvqty;
	}
}

/* �ۼ��ð� : Sat Apr 03 21:58:52 KST 2004 */