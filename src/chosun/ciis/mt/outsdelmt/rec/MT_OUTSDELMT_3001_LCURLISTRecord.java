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


package chosun.ciis.mt.outsdelmt.rec;

import java.sql.*;
import chosun.ciis.mt.outsdelmt.dm.*;
import chosun.ciis.mt.outsdelmt.ds.*;

/**
 * 
 */


public class MT_OUTSDELMT_3001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String outsd_elmt_clsf;
	public String outsd_elmt_clsf_nm;
	public String outsd_elmt_cd;
	public String outsd_elmt_cd_nm;
	public String outsd_elmt_amt;
	public String cmps_cost;
	public String cmps_ratio;
	public String cmps_calc;
	public String chg_ratio_yn;
	public String chg_cost;
	public String chg_ratio;

	public MT_OUTSDELMT_3001_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setOutsd_elmt_clsf(String outsd_elmt_clsf){
		this.outsd_elmt_clsf = outsd_elmt_clsf;
	}

	public void setOutsd_elmt_clsf_nm(String outsd_elmt_clsf_nm){
		this.outsd_elmt_clsf_nm = outsd_elmt_clsf_nm;
	}

	public void setOutsd_elmt_cd(String outsd_elmt_cd){
		this.outsd_elmt_cd = outsd_elmt_cd;
	}

	public void setOutsd_elmt_cd_nm(String outsd_elmt_cd_nm){
		this.outsd_elmt_cd_nm = outsd_elmt_cd_nm;
	}

	public void setOutsd_elmt_amt(String outsd_elmt_amt){
		this.outsd_elmt_amt = outsd_elmt_amt;
	}

	public void setCmps_cost(String cmps_cost){
		this.cmps_cost = cmps_cost;
	}

	public void setCmps_ratio(String cmps_ratio){
		this.cmps_ratio = cmps_ratio;
	}

	public void setCmps_calc(String cmps_calc){
		this.cmps_calc = cmps_calc;
	}

	public void setChg_ratio_yn(String chg_ratio_yn){
		this.chg_ratio_yn = chg_ratio_yn;
	}

	public void setChg_cost(String chg_cost){
		this.chg_cost = chg_cost;
	}

	public void setChg_ratio(String chg_ratio){
		this.chg_ratio = chg_ratio;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getOutsd_elmt_clsf(){
		return this.outsd_elmt_clsf;
	}

	public String getOutsd_elmt_clsf_nm(){
		return this.outsd_elmt_clsf_nm;
	}

	public String getOutsd_elmt_cd(){
		return this.outsd_elmt_cd;
	}

	public String getOutsd_elmt_cd_nm(){
		return this.outsd_elmt_cd_nm;
	}

	public String getOutsd_elmt_amt(){
		return this.outsd_elmt_amt;
	}

	public String getCmps_cost(){
		return this.cmps_cost;
	}

	public String getCmps_ratio(){
		return this.cmps_ratio;
	}

	public String getCmps_calc(){
		return this.cmps_calc;
	}

	public String getChg_ratio_yn(){
		return this.chg_ratio_yn;
	}

	public String getChg_cost(){
		return this.chg_cost;
	}

	public String getChg_ratio(){
		return this.chg_ratio;
	}
}

/* 작성시간 : Wed May 27 21:02:40 KST 2009 */