/***************************************************************************************************
* ���ϸ� : .java
* ��� : �������������ý���-���˹�������-�ʱ�ȭ��
* �ۼ����� : 2009-04-28
* �ۼ��� : ����
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * �������������ý���-���˹�������-�ʱ�ȭ��
 */

public class SS_L_BNSITEMINOUT_INITCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_BNSITEMINOUT_INITCURCOMMLISTRecord(){}

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

/* �ۼ��ð� : Tue Apr 28 20:44:29 PDT 2009 */