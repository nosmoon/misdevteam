/***************************************************************************************************
* ���ϸ� : PS_L_SEND_BNSBK.java
* ��� :   �߼�-���ʽ��Ϲ߼�Ȯ��ó��  ��ȸȭ��
* �ۼ����� : 2004-02-28
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :   
* ��� :   
***************************************************************************************************/



package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * �߼�-���ʽ��Ϲ߼� Ȯ��ó��  ��ȸȭ��
 *
 */ 

public class PS_L_SEND_BNSBKCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String brch_offisend_dt;
	public int bns_qty;
	public String hdqtsendyn;
	public String hdqtsend_dt;

	public PS_L_SEND_BNSBKCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBrch_offisend_dt(String brch_offisend_dt){
		this.brch_offisend_dt = brch_offisend_dt;
	}

	public void setBns_qty(int bns_qty){
		this.bns_qty = bns_qty;
	}

	public void setHdqtsendyn(String hdqtsendyn){
		this.hdqtsendyn = hdqtsendyn;
	}

	public void setHdqtsend_dt(String hdqtsend_dt){
		this.hdqtsend_dt = hdqtsend_dt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBrch_offisend_dt(){
		return this.brch_offisend_dt;
	}

	public int getBns_qty(){
		return this.bns_qty;
	}

	public String getHdqtsendyn(){
		return this.hdqtsendyn;
	}

	public String getHdqtsend_dt(){
		return this.hdqtsend_dt;
	}
}

/* �ۼ��ð� : Thu Apr 07 21:27:00 KST 2005 */