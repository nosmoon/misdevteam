/***************************************************************************************************
* ���ϸ� : SS_L_APLC_MANG_INITJYCURRecord.java
* ��� : ������������-Billing�ڵ���ü-��û����-�ʱ�ȭ��
* �ۼ����� : 2004-03-25
* �ۼ��� : ���
***************************************************************************************************/
/***************************************************************************************************
* �������� : ��ü�ڵ帮��Ʈ �߰�
* ������ : �弱��
* �������� : 2017-10-30
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ������������-Billing�ڵ���ü-��û����-�ʱ�ȭ��
 *
 */


public class SS_L_APLC_MANG_INITJYCURRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;

	public SS_L_APLC_MANG_INITJYCURRecord(){}

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

/* �ۼ��ð� : Mon Oct 30 10:25:25 KST 2017 */