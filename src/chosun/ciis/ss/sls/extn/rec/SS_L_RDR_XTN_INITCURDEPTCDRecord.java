/***************************************************************************************************
* ���ϸ� : .java
* ��� : *Ȯ����Ȳ-�¶���Ȯ��-��û��Ȳ �ʱ�ȭ��
* �ۼ����� : 2009-04-03
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ-�¶���Ȯ��-��û��Ȳ �ʱ�ȭ��
 */

public class SS_L_RDR_XTN_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_RDR_XTN_INITCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Fri Apr 03 16:55:18 KST 2009 */