/***************************************************************************************************
* ���ϸ� : SL_E_READERINIADDRCDCURRecord.java
* ��� : ������������(�ʱ�ȭ��)
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
 * ������������(�ʱ�ȭ��)
 *
 */

public class SL_E_READERINIADDRCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;
	public String resitypecd;

	public SL_E_READERINIADDRCDCURRecord(){}

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

/* �ۼ��ð� : Sun May 30 16:06:43 KST 2004 */