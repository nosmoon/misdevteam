/***************************************************************************************************
* ���ϸ� : SS_L_VSCD_INITAREAREGCDLISTRecord.java
* ��� : ������Ȳ-VacationStop-�ʱ�ȭ��-�ް����ǿ��ڵ� ����� ���� Record
* �ۼ����� : 2004-03-20
* �ۼ��� : ��뼷
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
 * ������Ȳ-VacationStop-�ʱ�ȭ��-�ް����ǿ��ڵ� ����� ���� Record
 */

public class SS_L_VSCD_INITAREAREGCDLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String vaca_arearegncd;
	public String vaca_arearegnnm;

	public SS_L_VSCD_INITAREAREGCDLISTRecord(){}

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

/* �ۼ��ð� : Fri Mar 26 19:42:26 KST 2004 */