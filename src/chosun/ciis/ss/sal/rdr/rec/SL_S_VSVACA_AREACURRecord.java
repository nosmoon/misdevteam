/***************************************************************************************************
* ���ϸ� : SL_S_VSVACA_AREACURRecord.java
* ��� : ����-VacationStop����-��
* �ۼ����� : 2004-04-01
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * ����-VacationStop����-��
 *
 */

public class SL_S_VSVACA_AREACURRecord extends java.lang.Object implements java.io.Serializable{

	public String vaca_areacd;
	public String vaca_areanm;

	public SL_S_VSVACA_AREACURRecord(){}

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

/* �ۼ��ð� : Fri Apr 02 00:04:31 KST 2004 */