/***************************************************************************************************
* ���ϸ� : SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord.java
* ��� : ����-�̻絶�ڰ���(�μ�)-�ʱ�ȭ�� ���ּ��ڵ�,�ڵ�� ����� ���� Record 
* �ۼ����� : 2004-01-14
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
 * ����-�̻絶�ڰ���(�μ�)-�ʱ�ȭ�� ���ּ��ڵ�,�ڵ�� ����� ���� Record 
 */

public class SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;
	public String resitypecd;

	public SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord(){}

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

/* �ۼ��ð� : Sun Jan 18 20:09:16 KST 2004 */