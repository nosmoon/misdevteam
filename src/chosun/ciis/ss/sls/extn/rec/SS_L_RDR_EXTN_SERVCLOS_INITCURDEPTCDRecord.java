/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord.java
* ��� : Ȯ����Ȳ-����ISȮ��-����(����IS)-�ʱ�ȭ��-�μ� ����� ���� Record
* �ۼ����� : 2004-08-01
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
 * Ȯ����Ȳ-����ISȮ��-����(����IS)-�ʱ�ȭ��-�μ� ����� ���� Record
 */


public class SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Mon Aug 02 15:53:00 KST 2004 */