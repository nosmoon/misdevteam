/***************************************************************************************************
* ���ϸ� : PS_S_PUBL_RDR.java
* ��� :   ����-������ȸ �ʱ�ȭ��
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
 * ����-������ȸ �ʱ�ȭ��
 *
 */

public class PS_S_PUBL_RDRAREACDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;

	public PS_S_PUBL_RDRAREACDCURRecord(){}

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

/* �ۼ��ð� : Tue Jul 15 11:02:56 KST 2008 */