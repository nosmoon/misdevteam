/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.health.rec;

import java.sql.*;
import chosun.ciis.ss.sls.health.dm.*;
import chosun.ciis.ss.sls.health.ds.*;

/**
 * 
 */


public class SS_L_WORKBOOK_SENDCLSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clsdt;
	public String chgpers;
	public String chgdt;

	public SS_L_WORKBOOK_SENDCLSCURCOMMLISTRecord(){}

	public void setClsdt(String clsdt){
		this.clsdt = clsdt;
	}

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
	}

	public void setChgdt(String chgdt){
		this.chgdt = chgdt;
	}

	public String getClsdt(){
		return this.clsdt;
	}

	public String getChgpers(){
		return this.chgpers;
	}

	public String getChgdt(){
		return this.chgdt;
	}
}

/* �ۼ��ð� : Mon Jan 05 13:52:18 KST 2015 */