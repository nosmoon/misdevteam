/***************************************************************************************************
* ���ϸ� : SE_BNS_1510_LCURLISTRecord.java
* ��� : �Ǹ� - ���˹����� - ���˹����ó��
* �ۼ����� : 2009-05-06
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.bns.rec;

import java.sql.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.ds.*;

/**
 * 
 */


public class SE_BNS_1510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bns_item_cd	;
	public String bns_item_nm	;
	public String send_qunt		;
	public String qunt			;
	public String divn_dt		;

	public SE_BNS_1510_LCURLISTRecord(){}

	public void setBns_item_cd(String bns_item_cd){
		this.bns_item_cd = bns_item_cd;
	}

	public void setBns_item_nm(String bns_item_nm){
		this.bns_item_nm = bns_item_nm;
	}

	public void setSend_qunt(String send_qunt){
		this.send_qunt = send_qunt;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setDivn_dt(String divn_dt){
		this.divn_dt = divn_dt;
	}

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getBns_item_nm(){
		return this.bns_item_nm;
	}

	public String getSend_qunt(){
		return this.send_qunt;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getDivn_dt(){
		return this.divn_dt;
	}
}

/* �ۼ��ð� : Wed May 06 19:56:46 KST 2009 */