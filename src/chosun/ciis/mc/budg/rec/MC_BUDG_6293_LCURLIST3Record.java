/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6293_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String aply_rate;
	public String fix_fee;
	public String iss_cnt;
	public String iss_cnt1;
	public String chg_cost;

	public MC_BUDG_6293_LCURLIST3Record(){}

	public void setAply_rate(String aply_rate){
		this.aply_rate = aply_rate;
	}

	public void setFix_fee(String fix_fee){
		this.fix_fee = fix_fee;
	}

	public void setIss_cnt(String iss_cnt){
		this.iss_cnt = iss_cnt;
	}

	public void setIss_cnt1(String iss_cnt1){
		this.iss_cnt1 = iss_cnt1;
	}

	public void setChg_cost(String chg_cost){
		this.chg_cost = chg_cost;
	}

	public String getAply_rate(){
		return this.aply_rate;
	}

	public String getFix_fee(){
		return this.fix_fee;
	}

	public String getIss_cnt(){
		return this.iss_cnt;
	}

	public String getIss_cnt1(){
		return this.iss_cnt1;
	}

	public String getChg_cost(){
		return this.chg_cost;
	}
}

/* �ۼ��ð� : Mon May 25 16:19:03 KST 2009 */