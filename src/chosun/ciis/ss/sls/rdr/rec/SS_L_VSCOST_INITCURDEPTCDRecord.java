/***************************************************************************************************
* ���ϸ� : SS_L_VSCOST_INITCURDEPTCDRecord.java
* ��� : ������Ȳ-VacationStop-���-�ʱ�ȭ��-�μ��ڵ�,�μ��� ����� ���� Record
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * ������Ȳ-VacationStop-���-�ʱ�ȭ��-�μ��ڵ�,�μ��� ����� ���� Record
 */

public class SS_L_VSCOST_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_VSCOST_INITCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Wed May 26 17:25:01 KST 2004 */