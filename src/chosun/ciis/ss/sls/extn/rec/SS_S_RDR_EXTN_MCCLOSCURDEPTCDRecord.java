/***************************************************************************************************
* ���ϸ� : SS_S_RDR_EXTN_MCCLOSCURDEPTCDRecord.java
* ��� : Ȯ����Ȳ-����ISȮ��-MCȮ��
* �ۼ����� : 2005-02-19
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
 * Ȯ����Ȳ-����ISȮ��-MCȮ��
 */


public class SS_S_RDR_EXTN_MCCLOSCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_S_RDR_EXTN_MCCLOSCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Sat Feb 19 17:26:37 KST 2005 */