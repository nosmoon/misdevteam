/***************************************************************************************************
* ���ϸ� : SS_L_BO_HEAD_INITCURDEPTCDRecord.java
* ��� : ����Info-������-�ʱ�ȭ��-�μ��ڵ�,�ڵ�� ����� ���� Record
* �ۼ����� : 2004-05-19
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * ����Info-������-�ʱ�ȭ��-�μ��ڵ�,�ڵ�� ����� ���� Record
 */

public class SS_L_BO_HEAD_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_BO_HEAD_INITCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Thu May 20 19:15:06 KST 2004 */