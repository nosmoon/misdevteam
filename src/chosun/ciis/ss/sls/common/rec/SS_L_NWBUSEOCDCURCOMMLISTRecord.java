/***************************************************************************************************
* ���ϸ� : SS_L_NWBUSEOCDCURCOMMLISTRecord.java
* ��� : ����-�μ��ڵ�,�ڵ�� ����� ���� Record
* �ۼ����� : 2003-11-15
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.common.rec;

import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.ds.*;

/**
 * ����-�μ��ڵ�,�ڵ�� ����� ���� Record
 */

public class SS_L_NWBUSEOCDCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_NWBUSEOCDCURCOMMLISTRecord(){}

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

/* �ۼ��ð� : Wed Nov 19 14:18:54 KST 2003 */