/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_3002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aply_yymm;
	public String week;
	public String frdt;
	public String todt;

	public HD_VACA_3002_LCURLISTRecord(){}

	public void setAply_yymm(String aply_yymm){
		this.aply_yymm = aply_yymm;
	}

	public void setWeek(String week){
		this.week = week;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public String getAply_yymm(){
		return this.aply_yymm;
	}

	public String getWeek(){
		return this.week;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}
}

/* �ۼ��ð� : Wed Mar 16 11:09:10 KST 2016 */