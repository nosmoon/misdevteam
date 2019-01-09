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


public class MT_PAPORD_5006_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String papcmpy_cd;
	public String matr_cd;
	public String roll_cnt;
	public String wgt;
	public String car_occr_dt;
	public String car_seq;

	public MT_PAPORD_5006_LCURLIST4Record(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setRoll_cnt(String roll_cnt){
		this.roll_cnt = roll_cnt;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public void setCar_occr_dt(String car_occr_dt){
		this.car_occr_dt = car_occr_dt;
	}

	public void setCar_seq(String car_seq){
		this.car_seq = car_seq;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getRoll_cnt(){
		return this.roll_cnt;
	}

	public String getWgt(){
		return this.wgt;
	}

	public String getCar_occr_dt(){
		return this.car_occr_dt;
	}

	public String getCar_seq(){
		return this.car_seq;
	}
}

/* 작성시간 : Mon Nov 23 18:51:23 KST 2009 */