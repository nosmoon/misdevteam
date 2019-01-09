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


public class MT_PAPORD_1001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String fac_clsf;
	public String matr_cd;
	public String matr_nm;
	public String aply_dt;
	public int max_ewh_roll_cnt;
	public int max_ewh_wgt;
	public int std_ewh_roll_cnt;
	public String oth_prts_ratio;
	public int std_ewh_wgt;
	public double std_amss_ratio;
	public String roll_wgt;

	public MT_PAPORD_1001_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setMax_ewh_roll_cnt(int max_ewh_roll_cnt){
		this.max_ewh_roll_cnt = max_ewh_roll_cnt;
	}

	public void setMax_ewh_wgt(int max_ewh_wgt){
		this.max_ewh_wgt = max_ewh_wgt;
	}

	public void setStd_ewh_roll_cnt(int std_ewh_roll_cnt){
		this.std_ewh_roll_cnt = std_ewh_roll_cnt;
	}

	public void setOth_prts_ratio(String oth_prts_ratio){
		this.oth_prts_ratio = oth_prts_ratio;
	}

	public void setStd_ewh_wgt(int std_ewh_wgt){
		this.std_ewh_wgt = std_ewh_wgt;
	}

	public void setStd_amss_ratio(double std_amss_ratio){
		this.std_amss_ratio = std_amss_ratio;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public int getMax_ewh_roll_cnt(){
		return this.max_ewh_roll_cnt;
	}

	public int getMax_ewh_wgt(){
		return this.max_ewh_wgt;
	}

	public int getStd_ewh_roll_cnt(){
		return this.std_ewh_roll_cnt;
	}

	public String getOth_prts_ratio(){
		return this.oth_prts_ratio;
	}

	public int getStd_ewh_wgt(){
		return this.std_ewh_wgt;
	}

	public double getStd_amss_ratio(){
		return this.std_amss_ratio;
	}

	public String getRoll_wgt(){
		return this.roll_wgt;
	}
}

/* 작성시간 : Thu Apr 30 18:02:59 KST 2009 */