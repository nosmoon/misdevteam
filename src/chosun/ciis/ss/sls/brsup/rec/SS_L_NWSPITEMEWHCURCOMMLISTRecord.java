/***************************************************************************************************
* ���ϸ� : SS_L_NWSPITEMEWHCURCOMMLISTRecord.java
* ��� : ��������-�Ź�������ǰ-�԰�-����� ���� Record
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ��������-�Ź�������ǰ-�԰�-����� ���� Record
 */


public class SS_L_NWSPITEMEWHCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ewhdt;
	public String ewhno;
	public int ewhqunt;
	public int stokqunt;
	public String itemcd;
	public String itemnm;
	public int uprc;
	public int divnuprc;
	public int insddivnuprc;
	public String itemclsfnm;
	public String sendclsfnm;
	public String costclsfnm;

	public SS_L_NWSPITEMEWHCURCOMMLISTRecord(){}

	public void setEwhdt(String ewhdt){
		this.ewhdt = ewhdt;
	}

	public void setEwhno(String ewhno){
		this.ewhno = ewhno;
	}

	public void setEwhqunt(int ewhqunt){
		this.ewhqunt = ewhqunt;
	}

	public void setStokqunt(int stokqunt){
		this.stokqunt = stokqunt;
	}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
	}

	public void setUprc(int uprc){
		this.uprc = uprc;
	}

	public void setDivnuprc(int divnuprc){
		this.divnuprc = divnuprc;
	}

	public void setInsddivnuprc(int insddivnuprc){
		this.insddivnuprc = insddivnuprc;
	}

	public void setItemclsfnm(String itemclsfnm){
		this.itemclsfnm = itemclsfnm;
	}

	public void setSendclsfnm(String sendclsfnm){
		this.sendclsfnm = sendclsfnm;
	}

	public void setCostclsfnm(String costclsfnm){
		this.costclsfnm = costclsfnm;
	}

	public String getEwhdt(){
		return this.ewhdt;
	}

	public String getEwhno(){
		return this.ewhno;
	}

	public int getEwhqunt(){
		return this.ewhqunt;
	}

	public int getStokqunt(){
		return this.stokqunt;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getItemnm(){
		return this.itemnm;
	}

	public int getUprc(){
		return this.uprc;
	}

	public int getDivnuprc(){
		return this.divnuprc;
	}

	public int getInsddivnuprc(){
		return this.insddivnuprc;
	}

	public String getItemclsfnm(){
		return this.itemclsfnm;
	}

	public String getSendclsfnm(){
		return this.sendclsfnm;
	}

	public String getCostclsfnm(){
		return this.costclsfnm;
	}
}

/* �ۼ��ð� : Fri Jan 30 10:43:39 KST 2004 */