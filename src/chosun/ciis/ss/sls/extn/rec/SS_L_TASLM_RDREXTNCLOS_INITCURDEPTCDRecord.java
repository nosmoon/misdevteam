/***************************************************************************************************
* ���ϸ� : .java
* ��� : �μ��ڵ�,�μ��� ����� �����Ѵ�.
* �ۼ����� :2009/07/09 
* �ۼ��� : ����
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ - ����Ȯ�帶��
 */

public class SS_L_TASLM_RDREXTNCLOS_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_TASLM_RDREXTNCLOS_INITCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Thu Jul 09 17:54:24 PDT 2009 */