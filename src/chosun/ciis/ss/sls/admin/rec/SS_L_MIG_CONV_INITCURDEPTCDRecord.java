/***************************************************************************************************
* ���ϸ� : SS_L_MIG_CONV_INITCURDEPTCDRecord.java
* ��� : ������-�۾�-���̱׷��̼�-�ʱ�ȭ��-�μ��ڵ�,�μ��� ����� ���� Record
* �ۼ����� : 2004-02-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * ������-�۾�-���̱׷��̼�-�ʱ�ȭ��-�μ��ڵ�,�μ��� ����� ���� Record
 */

public class SS_L_MIG_CONV_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_MIG_CONV_INITCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Wed Feb 25 14:25:10 KST 2004 */