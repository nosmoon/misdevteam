/***************************************************************************************************
* ���ϸ� : SP_PS_S_RDR_ARBT.java
* ��� :   ����-����ó�� �ʱ�ȭ��
* �ۼ����� : 2004-02-23
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :   
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * ����-����ó�� �ʱ�ȭ��
 *
 */


public class PS_S_RDR_ARBTBOCDRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;

	public PS_S_RDR_ARBTBOCDRecord(){}

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

/* �ۼ��ð� : Tue Feb 24 19:48:57 KST 2004 */