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


public class MC_BUDG_6291_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String chg_cost;
	public String iss_cnt;
	public String avg_cnt;

	public MC_BUDG_6291_LCURLIST4Record(){}

	public void setChg_cost(String chg_cost){
		this.chg_cost = chg_cost;
	}

	public void setIss_cnt(String iss_cnt){
		this.iss_cnt = iss_cnt;
	}

	public void setAvg_cnt(String avg_cnt){
		this.avg_cnt = avg_cnt;
	}

	public String getChg_cost(){
		return this.chg_cost;
	}

	public String getIss_cnt(){
		return this.iss_cnt;
	}

	public String getAvg_cnt(){
		return this.avg_cnt;
	}
}

/* �ۼ��ð� : Wed Sep 16 10:36:58 KST 2009 */