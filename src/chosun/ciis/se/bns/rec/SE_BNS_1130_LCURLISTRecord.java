/***************************************************************************************************
* ���ϸ� : SE_BNS_1130_LCURLISTRecord.java
* ��� : ���˹����� - ���˹����
* �ۼ����� : 2009-03-16
* �ۼ��� : �̹�ȿ
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


public class SE_BNS_1130_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aply_dt;
	public String uprc;
	public String divn_uprc;
	public String insd_divn_uprc;
	public String chg_dt_tm;

	public SE_BNS_1130_LCURLISTRecord(){}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setDivn_uprc(String divn_uprc){
		this.divn_uprc = divn_uprc;
	}

	public void setInsd_divn_uprc(String insd_divn_uprc){
		this.insd_divn_uprc = insd_divn_uprc;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getDivn_uprc(){
		return this.divn_uprc;
	}

	public String getInsd_divn_uprc(){
		return this.insd_divn_uprc;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
}

/* �ۼ��ð� : Mon Mar 16 19:08:55 KST 2009 */