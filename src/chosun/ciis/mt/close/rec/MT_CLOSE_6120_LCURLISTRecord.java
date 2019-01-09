/***************************************************************************************************
* 파일명 : .java
* 기능 : 자재 - 마감관리 - 참고지표
* 작성일자 : 2010-07-14
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.close.rec;

import java.sql.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */


public class MT_CLOSE_6120_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String fac_nm;
	public String medi_nm;
	public String issu_cnt;
	public String issu_pcnt;
	public String issu_real_pcnt;
	public String issu_qty;
	public String issu_medi_pcnt;
	public String issu_tot_pcnt;
	public String w_amt;
	public String b_amt;
	public String y_amt;
	public String tot_amt;
	public String ndduc_rate;
	public String one_qty;
	public String one_pcnt;

	public MT_CLOSE_6120_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setFac_nm(String fac_nm){
		this.fac_nm = fac_nm;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setIssu_cnt(String issu_cnt){
		this.issu_cnt = issu_cnt;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setIssu_real_pcnt(String issu_real_pcnt){
		this.issu_real_pcnt = issu_real_pcnt;
	}

	public void setIssu_qty(String issu_qty){
		this.issu_qty = issu_qty;
	}

	public void setIssu_medi_pcnt(String issu_medi_pcnt){
		this.issu_medi_pcnt = issu_medi_pcnt;
	}

	public void setIssu_tot_pcnt(String issu_tot_pcnt){
		this.issu_tot_pcnt = issu_tot_pcnt;
	}

	public void setW_amt(String w_amt){
		this.w_amt = w_amt;
	}

	public void setB_amt(String b_amt){
		this.b_amt = b_amt;
	}

	public void setY_amt(String y_amt){
		this.y_amt = y_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setNdduc_rate(String ndduc_rate){
		this.ndduc_rate = ndduc_rate;
	}

	public void setOne_qty(String one_qty){
		this.one_qty = one_qty;
	}

	public void setOne_pcnt(String one_pcnt){
		this.one_pcnt = one_pcnt;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getFac_nm(){
		return this.fac_nm;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getIssu_cnt(){
		return this.issu_cnt;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getIssu_real_pcnt(){
		return this.issu_real_pcnt;
	}

	public String getIssu_qty(){
		return this.issu_qty;
	}

	public String getIssu_medi_pcnt(){
		return this.issu_medi_pcnt;
	}

	public String getIssu_tot_pcnt(){
		return this.issu_tot_pcnt;
	}

	public String getW_amt(){
		return this.w_amt;
	}

	public String getB_amt(){
		return this.b_amt;
	}

	public String getY_amt(){
		return this.y_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getNdduc_rate(){
		return this.ndduc_rate;
	}

	public String getOne_qty(){
		return this.one_qty;
	}

	public String getOne_pcnt(){
		return this.one_pcnt;
	}
}

/* 작성시간 : Thu Jul 15 14:27:24 KST 2010 */