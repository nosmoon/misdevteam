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


public class MT_PAPINOUT_2501_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String fac_clsf;
	public String matr_cd;
	public String plan_jji_rol;
	public String plan_jji_wt;
	public String base_jji_rol;
	public String base_jji_wt;
	public String base_ji_igrol;
	public String base_ji_igwt;
	public String base_ji_cgrol;
	public String base_ji_cgwt;
	public String ewh_plan_roll;
	public String owh_plan_roll;
	public String ewh_plan_wgt;
	public String owh_plan_wgt;
	public String save_work_frdt;
	public String save_work_todt;

	public MT_PAPINOUT_2501_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setPlan_jji_rol(String plan_jji_rol){
		this.plan_jji_rol = plan_jji_rol;
	}

	public void setPlan_jji_wt(String plan_jji_wt){
		this.plan_jji_wt = plan_jji_wt;
	}

	public void setBase_jji_rol(String base_jji_rol){
		this.base_jji_rol = base_jji_rol;
	}

	public void setBase_jji_wt(String base_jji_wt){
		this.base_jji_wt = base_jji_wt;
	}

	public void setBase_ji_igrol(String base_ji_igrol){
		this.base_ji_igrol = base_ji_igrol;
	}

	public void setBase_ji_igwt(String base_ji_igwt){
		this.base_ji_igwt = base_ji_igwt;
	}

	public void setBase_ji_cgrol(String base_ji_cgrol){
		this.base_ji_cgrol = base_ji_cgrol;
	}

	public void setBase_ji_cgwt(String base_ji_cgwt){
		this.base_ji_cgwt = base_ji_cgwt;
	}

	public void setEwh_plan_roll(String ewh_plan_roll){
		this.ewh_plan_roll = ewh_plan_roll;
	}

	public void setOwh_plan_roll(String owh_plan_roll){
		this.owh_plan_roll = owh_plan_roll;
	}

	public void setEwh_plan_wgt(String ewh_plan_wgt){
		this.ewh_plan_wgt = ewh_plan_wgt;
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

	public String getYymm(){
		return this.yymm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getPlan_jji_rol(){
		return this.plan_jji_rol;
	}

	public String getPlan_jji_wt(){
		return this.plan_jji_wt;
	}

	public String getBase_jji_rol(){
		return this.base_jji_rol;
	}

	public String getBase_jji_wt(){
		return this.base_jji_wt;
	}

	public String getBase_ji_igrol(){
		return this.base_ji_igrol;
	}

	public String getBase_ji_igwt(){
		return this.base_ji_igwt;
	}

	public String getBase_ji_cgrol(){
		return this.base_ji_cgrol;
	}

	public String getBase_ji_cgwt(){
		return this.base_ji_cgwt;
	}

	public String getEwh_plan_roll(){
		return this.ewh_plan_roll;
	}

	public String getOwh_plan_roll(){
		return this.owh_plan_roll;
	}

	public String getEwh_plan_wgt(){
		return this.ewh_plan_wgt;
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
}

/* 작성시간 : Sat Apr 25 09:20:29 KST 2009 */