/***************************************************************************************************
* ���ϸ� : SL_L_RDR_EXTN_CNFM_INITADDRCDCURRecord.java
* ��� : �ܺ�Ȯ��Ȯ�ΰ���(�ʱ�ȭ��)
* �ۼ����� : 2004-06-03
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
 * �ܺ�Ȯ��Ȯ�ΰ���(�ʱ�ȭ��)
 *
 */

public class SL_L_RDR_EXTN_CNFM_INITADDRCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;
	public String resitypecd;

	public SL_L_RDR_EXTN_CNFM_INITADDRCDCURRecord(){}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}
}

/* �ۼ��ð� : Wed Jun 09 10:06:17 KST 2004 */