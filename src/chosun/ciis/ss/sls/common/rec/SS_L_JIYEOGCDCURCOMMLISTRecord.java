/***************************************************************************************************
* ���ϸ� : SS_L_JIYEOGCDCURCOMMLISTRecord.java
* ��� : ����-�����ڵ�,�ڵ�� ����� ���� Record
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
 * ����-�����ڵ�,�ڵ�� ����� ���� Record
 */

public class SS_L_JIYEOGCDCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;

	public SS_L_JIYEOGCDCURCOMMLISTRecord(){}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}
}

/* �ۼ��ð� : Wed Nov 19 14:18:54 KST 2003 */