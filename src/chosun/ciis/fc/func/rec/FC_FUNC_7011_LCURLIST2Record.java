/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_7011_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String int_rate_chg_dt;
	public String int_rate;
	public String incmg_dt_tm;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_FUNC_7011_LCURLIST2Record(){}

	public void setInt_rate_chg_dt(String int_rate_chg_dt){
		this.int_rate_chg_dt = int_rate_chg_dt;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}
}

/* 작성시간 : Wed Apr 01 15:45:42 KST 2009 */