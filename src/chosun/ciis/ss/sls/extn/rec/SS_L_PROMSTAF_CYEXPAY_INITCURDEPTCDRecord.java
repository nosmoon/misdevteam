/***************************************************************************************************
* ���ϸ� : SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-����-�ʱ�ȭ�� �μ��ڵ� ����� ���� Record
* �ۼ����� : 2004-09-13
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ-���̹�Ȯ��-����-�ʱ�ȭ�� �μ��ڵ� ����� ���� Record
 */


public class SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Tue Sep 14 19:44:43 KST 2004 */