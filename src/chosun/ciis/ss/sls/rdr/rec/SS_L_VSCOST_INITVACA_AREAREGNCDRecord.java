/***************************************************************************************************
* ���ϸ� : SS_L_VSCOST_INITVACA_AREAREGNCDRecord.java
* ��� : ������Ȳ VacationStop ��� �ʱ�ȭ
* �ۼ����� : 2004-01-17
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
 * ������Ȳ VacationStop ��� �ʱ�ȭ
 *
 */


public class SS_L_VSCOST_INITVACA_AREAREGNCDRecord extends java.lang.Object implements java.io.Serializable{

	public String vaca_arearegncd;
	public String vaca_arearegnnm;

	public SS_L_VSCOST_INITVACA_AREAREGNCDRecord(){}

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

/* �ۼ��ð� : Sat Jan 17 19:40:01 KST 2004 */