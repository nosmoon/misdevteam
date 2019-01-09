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


public class MT_OUTSDELMT_3000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String matr_cd;
	public String matr_nm;
	public String outsd_elmt_aply_clsf;
	public String outsd_elmt_aply_nm;
	public String aply_dt;
	public String aply_yymm;
	public String matr_uprc;
	public String ratio_yn;
	public String ratio_nm;
	public String fix_val;
	public String fix_item_cost;
	public String fix_item_ratio;
	public String marjn_val;
	public String marjn_cost;
	public String marjn_ratio;

	public MT_OUTSDELMT_3000_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setOutsd_elmt_aply_clsf(String outsd_elmt_aply_clsf){
		this.outsd_elmt_aply_clsf = outsd_elmt_aply_clsf;
	}

	public void setOutsd_elmt_aply_nm(String outsd_elmt_aply_nm){
		this.outsd_elmt_aply_nm = outsd_elmt_aply_nm;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setAply_yymm(String aply_yymm){
		this.aply_yymm = aply_yymm;
	}

	public void setMatr_uprc(String matr_uprc){
		this.matr_uprc = matr_uprc;
	}

	public void setRatio_yn(String ratio_yn){
		this.ratio_yn = ratio_yn;
	}

	public void setRatio_nm(String ratio_nm){
		this.ratio_nm = ratio_nm;
	}

	public void setFix_val(String fix_val){
		this.fix_val = fix_val;
	}

	public void setFix_item_cost(String fix_item_cost){
		this.fix_item_cost = fix_item_cost;
	}

	public void setFix_item_ratio(String fix_item_ratio){
		this.fix_item_ratio = fix_item_ratio;
	}

	public void setMarjn_val(String marjn_val){
		this.marjn_val = marjn_val;
	}

	public void setMarjn_cost(String marjn_cost){
		this.marjn_cost = marjn_cost;
	}

	public void setMarjn_ratio(String marjn_ratio){
		this.marjn_ratio = marjn_ratio;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getOutsd_elmt_aply_clsf(){
		return this.outsd_elmt_aply_clsf;
	}

	public String getOutsd_elmt_aply_nm(){
		return this.outsd_elmt_aply_nm;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getAply_yymm(){
		return this.aply_yymm;
	}

	public String getMatr_uprc(){
		return this.matr_uprc;
	}

	public String getRatio_yn(){
		return this.ratio_yn;
	}

	public String getRatio_nm(){
		return this.ratio_nm;
	}

	public String getFix_val(){
		return this.fix_val;
	}

	public String getFix_item_cost(){
		return this.fix_item_cost;
	}

	public String getFix_item_ratio(){
		return this.fix_item_ratio;
	}

	public String getMarjn_val(){
		return this.marjn_val;
	}

	public String getMarjn_cost(){
		return this.marjn_cost;
	}

	public String getMarjn_ratio(){
		return this.marjn_ratio;
	}
}

/* 작성시간 : Thu May 07 00:49:58 KST 2009 */