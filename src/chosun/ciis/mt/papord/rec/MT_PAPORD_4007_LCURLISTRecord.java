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


public class MT_PAPORD_4007_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String d_mon;
	public String d_mon_cnt;
	public String d_tue;
	public String d_tue_cnt;
	public String d_wed;
	public String d_wed_cnt;
	public String d_thr;
	public String d_thr_cnt;
	public String d_fri;
	public String d_fri_cnt;
	public String d_sat;
	public String d_sat_cnt;
	public String d_sun;
	public String d_sun_cnt;
	public String issu_dt_fr;
	public String issu_dt_to;
	public String cmpy_cd;
	public String occr_yy;
	public String seq;
	public String frdt;
	public String todt;
	public String fix_clsf;
	public String fix_clsf_nm;
	public String chg_dt;
	public String chg_tm;

	public MT_PAPORD_4007_LCURLISTRecord(){}

	public void setD_mon(String d_mon){
		this.d_mon = d_mon;
	}

	public void setD_mon_cnt(String d_mon_cnt){
		this.d_mon_cnt = d_mon_cnt;
	}

	public void setD_tue(String d_tue){
		this.d_tue = d_tue;
	}

	public void setD_tue_cnt(String d_tue_cnt){
		this.d_tue_cnt = d_tue_cnt;
	}

	public void setD_wed(String d_wed){
		this.d_wed = d_wed;
	}

	public void setD_wed_cnt(String d_wed_cnt){
		this.d_wed_cnt = d_wed_cnt;
	}

	public void setD_thr(String d_thr){
		this.d_thr = d_thr;
	}

	public void setD_thr_cnt(String d_thr_cnt){
		this.d_thr_cnt = d_thr_cnt;
	}

	public void setD_fri(String d_fri){
		this.d_fri = d_fri;
	}

	public void setD_fri_cnt(String d_fri_cnt){
		this.d_fri_cnt = d_fri_cnt;
	}

	public void setD_sat(String d_sat){
		this.d_sat = d_sat;
	}

	public void setD_sat_cnt(String d_sat_cnt){
		this.d_sat_cnt = d_sat_cnt;
	}

	public void setD_sun(String d_sun){
		this.d_sun = d_sun;
	}

	public void setD_sun_cnt(String d_sun_cnt){
		this.d_sun_cnt = d_sun_cnt;
	}

	public void setIssu_dt_fr(String issu_dt_fr){
		this.issu_dt_fr = issu_dt_fr;
	}

	public void setIssu_dt_to(String issu_dt_to){
		this.issu_dt_to = issu_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_yy(String occr_yy){
		this.occr_yy = occr_yy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setFix_clsf(String fix_clsf){
		this.fix_clsf = fix_clsf;
	}

	public void setFix_clsf_nm(String fix_clsf_nm){
		this.fix_clsf_nm = fix_clsf_nm;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setChg_tm(String chg_tm){
		this.chg_tm = chg_tm;
	}

	public String getD_mon(){
		return this.d_mon;
	}

	public String getD_mon_cnt(){
		return this.d_mon_cnt;
	}

	public String getD_tue(){
		return this.d_tue;
	}

	public String getD_tue_cnt(){
		return this.d_tue_cnt;
	}

	public String getD_wed(){
		return this.d_wed;
	}

	public String getD_wed_cnt(){
		return this.d_wed_cnt;
	}

	public String getD_thr(){
		return this.d_thr;
	}

	public String getD_thr_cnt(){
		return this.d_thr_cnt;
	}

	public String getD_fri(){
		return this.d_fri;
	}

	public String getD_fri_cnt(){
		return this.d_fri_cnt;
	}

	public String getD_sat(){
		return this.d_sat;
	}

	public String getD_sat_cnt(){
		return this.d_sat_cnt;
	}

	public String getD_sun(){
		return this.d_sun;
	}

	public String getD_sun_cnt(){
		return this.d_sun_cnt;
	}

	public String getIssu_dt_fr(){
		return this.issu_dt_fr;
	}

	public String getIssu_dt_to(){
		return this.issu_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_yy(){
		return this.occr_yy;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getFix_clsf(){
		return this.fix_clsf;
	}

	public String getFix_clsf_nm(){
		return this.fix_clsf_nm;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getChg_tm(){
		return this.chg_tm;
	}
}

/* 작성시간 : Wed Jul 08 15:15:25 KST 2009 */