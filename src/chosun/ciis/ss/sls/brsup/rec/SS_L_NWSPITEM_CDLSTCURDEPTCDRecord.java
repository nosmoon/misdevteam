/***************************************************************************************************
* ���ϸ� : .java
* ��� : *��������-�Ź�������ǰ-�԰�-�ʱ�ȭ��
* �ۼ����� : 2009-04-07
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ��������-�Ź�������ǰ-�԰�-�ʱ�ȭ��
 */

public class SS_L_NWSPITEM_CDLSTCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_NWSPITEM_CDLSTCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Tue Apr 07 17:22:12 KST 2009 */