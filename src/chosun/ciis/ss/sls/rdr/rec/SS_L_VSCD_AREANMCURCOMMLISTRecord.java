/***************************************************************************************************
* ���ϸ� : SS_L_VSCD_AREANMCURCOMMLISTRecord.java
* ��� : ������Ȳ VacationStop ��� �ް����ڵ�, �ڵ�� ��ȸ
* �ۼ����� : 2004-01-16
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * ������Ȳ VacationStop ��� �ް����ڵ�, �ڵ�� ��ȸ
 *
 */


public class SS_L_VSCD_AREANMCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String vaca_areacd;
	public String vaca_areanm;

	public SS_L_VSCD_AREANMCURCOMMLISTRecord(){}

	public void setVaca_areacd(String vaca_areacd){
		this.vaca_areacd = vaca_areacd;
	}

	public void setVaca_areanm(String vaca_areanm){
		this.vaca_areanm = vaca_areanm;
	}

	public String getVaca_areacd(){
		return this.vaca_areacd;
	}

	public String getVaca_areanm(){
		return this.vaca_areanm;
	}
}

/* �ۼ��ð� : Sat Jan 17 19:13:37 KST 2004 */