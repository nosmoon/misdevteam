/***************************************************************************************************
* ���ϸ� : .java
* ��� : *����Info-����ã��-�ʱ�ȭ��
* �ۼ����� : 2009-03-30
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * ����Info-����ã��-�ʱ�ȭ��
 */

public class SS_L_BO_SRCH_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_BO_SRCH_INITCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Mon Mar 30 17:12:43 KST 2009 */