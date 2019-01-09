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


public class MT_PAPINOUT_2701_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String save_yymm;
	public String save_fac_clsf;
	public String matr_cd;
	public String ewh_plan_roll;
	public String ewh_plan_wgt;
	public String owh_plan_roll;
	public String owh_plan_wgt;
	public String save_work_frdt;
	public String save_work_todt;
	public String roll_wgt;

	public MT_PAPINOUT_2701_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSave_yymm(String save_yymm){
		this.save_yymm = save_yymm;
	}

	public void setSave_fac_clsf(String save_fac_clsf){
		this.save_fac_clsf = save_fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setEwh_plan_roll(String ewh_plan_roll){
		this.ewh_plan_roll = ewh_plan_roll;
	}

	public void setEwh_plan_wgt(String ewh_plan_wgt){
		this.ewh_plan_wgt = ewh_plan_wgt;
	}

	public void setOwh_plan_roll(String owh_plan_roll){
		this.owh_plan_roll = owh_plan_roll;
	}

	public void setOwh_plan_wgt(String owh_plan_wgt){
		this.owh_plan_wgt = owh_plan_wgt;
	}

	public void setSave_work_frdt(String save_work_frdt){
		this.save_work_frdt = save_work_frdt;
	}

	public void setSave_work_todt(String save_work_todt){
		this.save_work_todt = save_work_todt;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSave_yymm(){
		return this.save_yymm;
	}

	public String getSave_fac_clsf(){
		return this.save_fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getEwh_plan_roll(){
		return this.ewh_plan_roll;
	}

	public String getEwh_plan_wgt(){
		return this.ewh_plan_wgt;
	}

	public String getOwh_plan_roll(){
		return this.owh_plan_roll;
	}

	public String getOwh_plan_wgt(){
		return this.owh_plan_wgt;
	}

	public String getSave_work_frdt(){
		return this.save_work_frdt;
	}

	public String getSave_work_todt(){
		return this.save_work_todt;
	}
	
	public String getRoll_wgt(){
		return this.roll_wgt;
	}
}

/* 작성시간 : Fri May 01 15:53:01 KST 2009 */