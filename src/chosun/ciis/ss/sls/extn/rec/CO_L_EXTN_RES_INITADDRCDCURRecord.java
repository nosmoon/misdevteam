/***************************************************************************************************
* ���ϸ� : .java
* ��� : *Ȯ����Ȳ-Ȯ������-�ʱ�ȭ��
* �ۼ����� : 2009-04-06
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ-Ȯ������-�ʱ�ȭ��
 */

public class CO_L_EXTN_RES_INITADDRCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;
	public String resitypecd;
	public String addrbnji;
	public String mvindt;

	public CO_L_EXTN_RES_INITADDRCDCURRecord(){}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setAddrbnji(String addrbnji){
		this.addrbnji = addrbnji;
	}

	public void setMvindt(String mvindt){
		this.mvindt = mvindt;
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

	public String getAddrbnji(){
		return this.addrbnji;
	}

	public String getMvindt(){
		return this.mvindt;
	}
}

/* �ۼ��ð� : Mon Apr 06 20:48:51 KST 2009 */