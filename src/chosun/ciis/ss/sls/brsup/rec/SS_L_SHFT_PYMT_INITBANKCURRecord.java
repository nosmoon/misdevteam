/***************************************************************************************************
* ���ϸ� : SS_L_SHFT_PYMT_INITBANKCURRecord.java
* ��� : ������������-Billing�ڵ���ü-�����ڰ���-�ʱ�ȭ��
* �ۼ����� : 2004-04-01
* �ۼ��� : ���
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
 * ������������-Billing�ڵ���ü-�����ڰ���-�ʱ�ȭ��
 *
 */


public class SS_L_SHFT_PYMT_INITBANKCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_SHFT_PYMT_INITBANKCURRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* �ۼ��ð� : Wed Apr 07 21:52:40 KST 2004 */