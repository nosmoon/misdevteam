/***************************************************************************************************
* ���ϸ� : SP_PS_S_MEDI_UPRC.java
* ��� :   �ڵ����-��ü�ܰ����� �ʱ�ȭ��
* �ۼ����� : 2004-02-20
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� : 
* ��� :  
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * �ڵ����-��ü�ܰ����� �ʱ�ȭ��
 *
 */


public class PS_S_MEDI_UPRCBOCDRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;

	public PS_S_MEDI_UPRCBOCDRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}
}

/* �ۼ��ð� : Fri Feb 20 10:26:59 KST 2004 */