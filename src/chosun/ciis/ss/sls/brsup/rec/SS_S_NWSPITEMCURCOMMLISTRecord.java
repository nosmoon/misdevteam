/***************************************************************************************************
* ���ϸ� : SS_S_NWSPITEMCURCOMMLISTRecord.java
* ��� : ��������-�Ź�������ǰ-���-��-��ǰ��ϸ� ���� Record
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ��������-�Ź�������ǰ-���-��-��ǰ��ϸ� ���� Record
 */


public class SS_S_NWSPITEMCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String itemcd;
	public String itemnm;

	public SS_S_NWSPITEMCURCOMMLISTRecord(){}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getItemnm(){
		return this.itemnm;
	}
}

/* �ۼ��ð� : Thu Jan 29 21:06:58 KST 2004 */