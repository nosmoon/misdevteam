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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_2702_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String seq;
	public String owh_plan_roll;
	public String owh_plan_dt;
	public String owh_plan_wgt;
	public String roll_wgt;

	public MT_PAPINOUT_2702_LCURLISTRecord(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOwh_plan_roll(String owh_plan_roll){
		this.owh_plan_roll = owh_plan_roll;
	}

	public void setOwh_plan_dt(String owh_plan_dt){
		this.owh_plan_dt = owh_plan_dt;
	}

	public void setOwh_plan_wgt(String owh_plan_wgt){
		this.owh_plan_wgt = owh_plan_wgt;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}
	
	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOwh_plan_roll(){
		return this.owh_plan_roll;
	}

	public String getOwh_plan_dt(){
		return this.owh_plan_dt;
	}

	public String getOwh_plan_wgt(){
		return this.owh_plan_wgt;
	}
}

/* 작성시간 : Mon May 04 10:47:42 KST 2009 */