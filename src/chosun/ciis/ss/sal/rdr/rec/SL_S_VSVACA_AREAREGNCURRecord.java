/***************************************************************************************************
* ���ϸ� : SL_S_VSVACA_AREAREGNCURRecord.java
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

public class SL_S_VSVACA_AREAREGNCURRecord extends java.lang.Object implements java.io.Serializable{

	public String vaca_arearegncd;
	public String vaca_arearegnnm;

	public SL_S_VSVACA_AREAREGNCURRecord(){}

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setVaca_arearegnnm(String vaca_arearegnnm){
		this.vaca_arearegnnm = vaca_arearegnnm;
	}

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public String getVaca_arearegnnm(){
		return this.vaca_arearegnnm;
	}
}

/* �ۼ��ð� : Fri Apr 02 00:04:31 KST 2004 */