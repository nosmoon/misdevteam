/***************************************************************************************************
* ���ϸ� : PS_S_PUBL_RDR.java
* ��� :   ����-������ȸ �ʱ�ȭ��
* �ۼ����� : 2004-02-23
* �ۼ��� : ���ȣ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * ����-������ȸ �ʱ�ȭ��
 *
 */

public class PS_S_PUBL_RDRCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public PS_S_PUBL_RDRCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Tue Jul 15 11:02:56 KST 2008 */