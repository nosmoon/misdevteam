/***************************************************************************************************
* ���ϸ� : SS_L_MIGLLMMTCLOS_INITCURDEPTCDRecord.java
* ��� : �����濵-���ϸ�����Ȳ �ʱ�ȭ
* �ۼ����� : 2004-03-16
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * �����濵-���ϸ�����Ȳ �ʱ�ȭ
 *
 */

public class SS_L_MIGLLMMTCLOS_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_MIGLLMMTCLOS_INITCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Tue Mar 16 20:55:10 KST 2004 */