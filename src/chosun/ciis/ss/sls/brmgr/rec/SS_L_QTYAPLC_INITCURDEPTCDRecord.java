/***************************************************************************************************
* ���ϸ� : .java
* ��� : *�����濵-�μ�����-������û(����)-�ʱ�ȭ��
* �ۼ����� : 2009-04-20
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * �����濵-�μ�����-������û(����)-�ʱ�ȭ��
 */

public class SS_L_QTYAPLC_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_QTYAPLC_INITCURDEPTCDRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setBoksnm(String boksnm){
		this.boksnm = boksnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getBoksnm(){
		return this.boksnm;
	}
}

/* �ۼ��ð� : Mon Apr 20 21:10:39 KST 2009 */