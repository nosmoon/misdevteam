/***************************************************************************************************
* ���ϸ� : SS_S_RDR_EXTN_SERVCLOSCURDEPTCDRecord.java
* ��� : Ȯ����Ȳ-����ISȮ��-����(����IS) �� �μ� ����� ���� Record
* �ۼ����� : 2004-04-24
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
 * Ȯ����Ȳ-����ISȮ��-����(����IS) �� �μ� ����� ���� Record
 */


public class SS_S_RDR_EXTN_SERVCLOSCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_S_RDR_EXTN_SERVCLOSCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Tue Aug 03 16:08:27 KST 2004 */