/***************************************************************************************************
* ���ϸ� : PS_S_BO_SEND_INIT.java
* ���   : �߼� - �ʱ�ȭ��
* �ۼ����� : 2007-04-23
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * �߼� - �ʱ�ȭ��
 */

public class PS_S_BO_SEND_INITAREACDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;

	public PS_S_BO_SEND_INITAREACDCURRecord(){}

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

/* �ۼ��ð� : Tue Apr 24 16:33:14 KST 2007 */