/***************************************************************************************************
* ���ϸ� : SL_A_NWSPSUBSCNTRMEDICURRecord.java
* ��� : ������������-�����߰������˾�(���������,����)-��ü�ڵ���
* �ۼ����� : 2004-02-16
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
 * ������������-�����߰������˾�(���������,����)-��ü�ڵ���
 *
 */


public class SL_A_NWSPSUBSCNTRMEDICURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String abrv;
	public int dlvqty;

	public SL_A_NWSPSUBSCNTRMEDICURRecord(){}

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

/* �ۼ��ð� : Mon Feb 16 17:14:51 KST 2004 */