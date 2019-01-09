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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_5006_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String matr_cd;
	public String papcmpy_cd;
	public String roll_wgt;
	public String somo_roll;
	public String somo_wgt;
	public String ord_roll;
	public String ord_wgt;
	public String car_occr_dt;
	public String car_seq;
	public String car_cnt;

	public MT_PAPORD_5006_LCURLIST3Record(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}

	public void setSomo_roll(String somo_roll){
		this.somo_roll = somo_roll;
	}

	public void setSomo_wgt(String somo_wgt){
		this.somo_wgt = somo_wgt;
	}

	public void setOrd_roll(String ord_roll){
		this.ord_roll = ord_roll;
	}

	public void setOrd_wgt(String ord_wgt){
		this.ord_wgt = ord_wgt;
	}

	public void setCar_occr_dt(String car_occr_dt){
		this.car_occr_dt = car_occr_dt;
	}

	public void setCar_seq(String car_seq){
		this.car_seq = car_seq;
	}

	public void setCar_cnt(String car_cnt){
		this.car_cnt = car_cnt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getRoll_wgt(){
		return this.roll_wgt;
	}

	public String getSomo_roll(){
		return this.somo_roll;
	}

	public String getSomo_wgt(){
		return this.somo_wgt;
	}

	public String getOrd_roll(){
		return this.ord_roll;
	}

	public String getOrd_wgt(){
		return this.ord_wgt;
	}

	public String getCar_occr_dt(){
		return this.car_occr_dt;
	}

	public String getCar_seq(){
		return this.car_seq;
	}

	public String getCar_cnt(){
		return this.car_cnt;
	}
}

/* 작성시간 : Mon Nov 23 18:51:23 KST 2009 */