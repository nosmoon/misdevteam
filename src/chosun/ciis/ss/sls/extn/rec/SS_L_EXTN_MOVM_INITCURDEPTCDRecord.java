/***************************************************************************************************
* ���ϸ� : .java
* ��� : *Ȯ����Ȳ-����Ȯ���̻����-�ʱ�ȭ��
* �ۼ����� : 2009-04-02
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ-����Ȯ���̻����-�ʱ�ȭ��
 */

public class SS_L_EXTN_MOVM_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_EXTN_MOVM_INITCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Thu Apr 02 15:58:32 KST 2009 */