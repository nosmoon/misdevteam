/***************************************************************************************************
* ���ϸ� : SS_L_FCT_FRFT_INITDEPTLISTRecord.java
* ��� : �����濵-������ ����� ��ȸ ȭ��
* �ۼ����� : 2004-03-03
* �ۼ��� : �輺��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * �����濵-������ ����� ��ȸ ȭ��
 *
 */


public class SS_L_FCT_FRFT_INITDEPTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String bcbuseonm;

	public SS_L_FCT_FRFT_INITDEPTLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setBcbuseonm(String bcbuseonm){
		this.bcbuseonm = bcbuseonm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getBcbuseonm(){
		return this.bcbuseonm;
	}
}

/* �ۼ��ð� : Mon Mar 22 16:50:35 KST 2004 */