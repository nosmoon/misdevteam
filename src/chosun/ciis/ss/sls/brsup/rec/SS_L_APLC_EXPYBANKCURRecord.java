/***************************************************************************************************
* ���ϸ� : SS_L_APLC_EXPYBANKCURRecord.java
* ��� : ������������-Billing�ڵ���ü-��û����-�ڵ���ü������û �ʱ�ȭ
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
 * ������������-Billing�ڵ���ü-��û����-�ڵ���ü������û �ʱ�ȭ
 *
 */


public class SS_L_APLC_EXPYBANKCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_APLC_EXPYBANKCURRecord(){}

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

/* �ۼ��ð� : Tue Jun 08 16:11:39 KST 2004 */