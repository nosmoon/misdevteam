/***************************************************************************************************
* ���ϸ� : SP_PS_L_CMPYBO_INTG.java
* �ڵ�-���纰 �����ڵ���� ��ȸȭ�� 
* �ۼ����� : 2004-03-08
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ : 
* �������� :   
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * �ڵ�-���纰 �����ڵ���� ��ȸȭ��           
 *
 */

  

public class PS_L_CMPYBO_INTGCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String sendintgyn;
	public String clamtintgyn;
	public String alonintgyn;
	public String intgaftboalonpaypoint;
	public String boalonpaynm;
	public String intgafthdqtalonpaypoint;
	public String hdqtalonpaynm;

	public PS_L_CMPYBO_INTGCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setSendintgyn(String sendintgyn){
		this.sendintgyn = sendintgyn;
	}

	public void setClamtintgyn(String clamtintgyn){
		this.clamtintgyn = clamtintgyn;
	}

	public void setAlonintgyn(String alonintgyn){
		this.alonintgyn = alonintgyn;
	}

	public void setIntgaftboalonpaypoint(String intgaftboalonpaypoint){
		this.intgaftboalonpaypoint = intgaftboalonpaypoint;
	}

	public void setBoalonpaynm(String boalonpaynm){
		this.boalonpaynm = boalonpaynm;
	}

	public void setIntgafthdqtalonpaypoint(String intgafthdqtalonpaypoint){
		this.intgafthdqtalonpaypoint = intgafthdqtalonpaypoint;
	}

	public void setHdqtalonpaynm(String hdqtalonpaynm){
		this.hdqtalonpaynm = hdqtalonpaynm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getSendintgyn(){
		return this.sendintgyn;
	}

	public String getClamtintgyn(){
		return this.clamtintgyn;
	}

	public String getAlonintgyn(){
		return this.alonintgyn;
	}

	public String getIntgaftboalonpaypoint(){
		return this.intgaftboalonpaypoint;
	}

	public String getBoalonpaynm(){
		return this.boalonpaynm;
	}

	public String getIntgafthdqtalonpaypoint(){
		return this.intgafthdqtalonpaypoint;
	}

	public String getHdqtalonpaynm(){
		return this.hdqtalonpaynm;
	}
}

/* �ۼ��ð� : Mon Mar 15 21:14:26 KST 2004 */