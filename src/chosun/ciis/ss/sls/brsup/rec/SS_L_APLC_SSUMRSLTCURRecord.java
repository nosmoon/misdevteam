/***************************************************************************************************
* ���ϸ� : SS_L_APLC_SSUMRSLTCURRecord.java
* ��� : ������������-Billing�ڵ���ü-��û����-��û���
* �ۼ����� : 2004-03-26
* �ۼ��� : ���
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
 * ������������-Billing�ڵ���ü-��û����-��û���
 *
 */


public class SS_L_APLC_SSUMRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String tel_no11;
	public String tel_no12;
	public String tel_no13;
	public String areanm;
	public String bonm;
	public int aplccnt;
	public int cnfmcnt;
	public String migryn;

	public SS_L_APLC_SSUMRSLTCURRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setTel_no11(String tel_no11){
		this.tel_no11 = tel_no11;
	}

	public void setTel_no12(String tel_no12){
		this.tel_no12 = tel_no12;
	}

	public void setTel_no13(String tel_no13){
		this.tel_no13 = tel_no13;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAplccnt(int aplccnt){
		this.aplccnt = aplccnt;
	}

	public void setCnfmcnt(int cnfmcnt){
		this.cnfmcnt = cnfmcnt;
	}

	public void setMigryn(String migryn){
		this.migryn = migryn;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getTel_no11(){
		return this.tel_no11;
	}

	public String getTel_no12(){
		return this.tel_no12;
	}

	public String getTel_no13(){
		return this.tel_no13;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public int getAplccnt(){
		return this.aplccnt;
	}

	public int getCnfmcnt(){
		return this.cnfmcnt;
	}

	public String getMigryn(){
		return this.migryn;
	}

}

/* �ۼ��ð� : Fri Mar 26 13:36:36 KST 2004 */