/***************************************************************************************************
* ���ϸ� : SL_L_NWSPSUBSCNTRMEDICURRecord.java
* ��� : ������������(�����߰������˾�-�����������ȸ)
* �ۼ����� : 2004-05-20
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
 * ������������(�����߰������˾�-�����������ȸ)
 *
 */

public class SL_L_NWSPSUBSCNTRMEDICURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String abrv;
	public int dlvqty;

	public SL_L_NWSPSUBSCNTRMEDICURRecord(){}

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

/* �ۼ��ð� : Mon May 31 16:22:37 KST 2004 */