/***************************************************************************************************
* ���ϸ� : .java
* ��� : *������-����������-�ʱ�ȭ��
* �ۼ����� : 2009-04-27
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * ������-����������-�ʱ�ȭ��
 */

public class SS_L_BOCLOS_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_BOCLOS_INITCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Mon Apr 27 19:45:48 KST 2009 */