/***************************************************************************************************
* ���ϸ� : SS_L_APLC_NEWPYMTCURRecord.java
* ��� : ������������-Billing�ڵ���ü-��û����-�űԽ�û�ʱ�ȭ�� �ʱ�ȭ
* �ۼ����� : 2004-06-07
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
 * ������������-Billing�ڵ���ü-��û����-�űԽ�û�ʱ�ȭ�� �ʱ�ȭ
 *
 */


public class SS_L_APLC_NEWPYMTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bankcd;
	public String banknm;
	public String acctno;

	public SS_L_APLC_NEWPYMTCURRecord(){}

	public void setBankcd(String bankcd){
		this.bankcd = bankcd;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public String getBankcd(){
		return this.bankcd;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getAcctno(){
		return this.acctno;
	}
}

/* �ۼ��ð� : Mon Jun 07 21:27:19 KST 2004 */