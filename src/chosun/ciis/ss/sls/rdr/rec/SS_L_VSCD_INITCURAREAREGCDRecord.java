/***************************************************************************************************
* ���ϸ� : .java
* ��� : *������Ȳ-VacationStop-�ڵ�-�ʱ�ȭ��
* �ۼ����� : 2009-03-18
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * ������Ȳ-VacationStop-�ڵ�-�ʱ�ȭ��
 */

public class SS_L_VSCD_INITCURAREAREGCDRecord extends java.lang.Object implements java.io.Serializable{

	public String vaca_arearegncd;
	public String vaca_arearegnnm;

	public SS_L_VSCD_INITCURAREAREGCDRecord(){}

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

/* �ۼ��ð� : Wed Mar 18 18:09:01 KST 2009 */