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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_6002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String int_rate_chg_dt;
	public String int_rate;
	public String chg_dt_tm;
	public String chg_pers;
	public String incmg_pers_ipadd;

	public FC_FUNC_6002_LCURLISTRecord(){}

	public void setInt_rate_chg_dt(String int_rate_chg_dt){
		this.int_rate_chg_dt = int_rate_chg_dt;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getInt_rate_chg_dt(){
		return this.int_rate_chg_dt;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}
}

/* �ۼ��ð� : Fri Mar 13 12:01:54 KST 2009 */