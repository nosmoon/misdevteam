/***************************************************************************************************
* ���ϸ� : .java
* ��� : *������������-�ڵ���ü-û��-�ʱ�ȭ��
* �ۼ����� : 2009-04-14
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ������������-�ڵ���ü-û��-�ʱ�ȭ��
 */

public class SS_S_SHFT_CLAM_INITJYCURRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;

	public SS_S_SHFT_CLAM_INITJYCURRecord(){}

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

/* �ۼ��ð� : Tue Apr 14 14:49:12 KST 2009 */