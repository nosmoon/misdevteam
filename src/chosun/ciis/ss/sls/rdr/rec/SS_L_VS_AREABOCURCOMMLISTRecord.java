/***************************************************************************************************
* ���ϸ� : SS_L_VS_AREABOCURCOMMLISTRecord.java
* ��� : ������Ȳ-VacationStop-�ް����ڵ�� �������� ����� ���� Record
* �ۼ����� : 2004-04-24
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
 * ������Ȳ-VacationStop-�ް����ڵ�� �������� ����� ���� Record
 */


public class SS_L_VS_AREABOCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String vaca_areacd;
	public String vaca_areanm;
	public String bocd;
	public String bonm;
	public String telno1;
	public String telno2;
	public String telno3;

	public SS_L_VS_AREABOCURCOMMLISTRecord(){}

	public void setVaca_areacd(String vaca_areacd){
		this.vaca_areacd = vaca_areacd;
	}

	public void setVaca_areanm(String vaca_areanm){
		this.vaca_areanm = vaca_areanm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setTelno1(String telno1){
		this.telno1 = telno1;
	}

	public void setTelno2(String telno2){
		this.telno2 = telno2;
	}

	public void setTelno3(String telno3){
		this.telno3 = telno3;
	}

	public String getVaca_areacd(){
		return this.vaca_areacd;
	}

	public String getVaca_areanm(){
		return this.vaca_areanm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getTelno1(){
		return this.telno1;
	}

	public String getTelno2(){
		return this.telno2;
	}

	public String getTelno3(){
		return this.telno3;
	}
}

/* �ۼ��ð� : Fri Jul 16 10:55:48 KST 2004 */