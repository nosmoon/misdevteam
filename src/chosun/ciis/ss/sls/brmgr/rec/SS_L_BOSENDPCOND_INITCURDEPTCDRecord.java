/***************************************************************************************************
* ���ϸ� : .java
* ��� : *�����濵-�����μ���Ȳ �ʱ�ȭ��
* �ۼ����� : 2009-04-14
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * �����濵-�����μ���Ȳ �ʱ�ȭ��
 */

public class SS_L_BOSENDPCOND_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_BOSENDPCOND_INITCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Wed Apr 15 11:15:06 KST 2009 */