/***************************************************************************************************
* ���ϸ� : .java
* ��� : *��������-����-����EDI��������-�ʱ�ȭ��
* �ۼ����� : 2009-04-13
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ��������-����-����EDI��������-�ʱ�ȭ��
 */

public class SS_L_EDI_INITJYCURRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;

	public SS_L_EDI_INITJYCURRecord(){}

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

/* �ۼ��ð� : Mon Apr 13 21:52:28 KST 2009 */