/***************************************************************************************************
* ���ϸ� : .java
* ��� : ������������-Billing�ڵ���ü-��û/�������-�ʱ�ȭ��
* �ۼ����� : 2005-01-11
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ������������-Billing�ڵ���ü-��û/�������-�ʱ�ȭ��
 */


public class SS_L_SHFTAPLCEXPY_STCS_INITCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ciymgbcd;
	public String cicdnm;

	public SS_L_SHFTAPLCEXPY_STCS_INITCURCOMMLISTRecord(){}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* �ۼ��ð� : Tue Jan 11 20:20:09 KST 2005 */
