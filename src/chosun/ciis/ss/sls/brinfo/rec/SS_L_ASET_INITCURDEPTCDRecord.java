/***************************************************************************************************
* ���ϸ� : SS_L_ASET_INITCURDEPTCDRecord.java
* ��� : ����Info-������ǰ��Ȳ-��Ȳ �ʱ�
* �ۼ����� : 2004-01-27
* �ۼ��� : ����ȫ
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
 * ����Info-������ǰ��Ȳ-��Ȳ �ʱ�
 *
 */


public class SS_L_ASET_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_ASET_INITCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Tue Jan 27 10:41:52 KST 2004 */