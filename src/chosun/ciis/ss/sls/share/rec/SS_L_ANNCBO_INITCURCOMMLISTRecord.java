/***************************************************************************************************
* ���ϸ� : .java
* ��� : *��������-�ǽð�������������-�ʱ�ȭ��
* �ۼ����� : 2009-06-12
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * ��������-�ǽð�������������-�ʱ�ȭ��
 */

public class SS_L_ANNCBO_INITCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_ANNCBO_INITCURCOMMLISTRecord(){}

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

/* �ۼ��ð� : Fri Jun 12 16:51:28 KST 2009 */