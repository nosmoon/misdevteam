/***************************************************************************************************
* ���ϸ� : SS_L_VSCD_INITCURCOMMLISTRecord.java
* ��� : ������Ȳ-VacationStop-�ʱ�ȭ��-�ް�����,�ڵ� ����� ���� Record
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
 * ������Ȳ-VacationStop-�ʱ�ȭ��-�ް�����,�ڵ� ����� ���� Record
 */

public class SS_L_VSCD_INITCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String vaca_arearegncd;
	public String vaca_arearegnnm;
	public String vaca_areacd;
	public String vaca_areanm;
	public String bonm;

	public SS_L_VSCD_INITCURCOMMLISTRecord(){}

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setVaca_arearegnnm(String vaca_arearegnnm){
		this.vaca_arearegnnm = vaca_arearegnnm;
	}

	public void setVaca_areacd(String vaca_areacd){
		this.vaca_areacd = vaca_areacd;
	}

	public void setVaca_areanm(String vaca_areanm){
		this.vaca_areanm = vaca_areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public String getVaca_arearegnnm(){
		return this.vaca_arearegnnm;
	}

	public String getVaca_areacd(){
		return this.vaca_areacd;
	}

	public String getVaca_areanm(){
		return this.vaca_areanm;
	}

	public String getBonm(){
		return this.bonm;
	}
}

/* �ۼ��ð� : Fri Mar 26 19:42:26 KST 2004 */