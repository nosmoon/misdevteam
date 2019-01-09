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


package chosun.ciis.mt.submatrin.rec;

import java.sql.*;
import chosun.ciis.mt.submatrin.dm.*;
import chosun.ciis.mt.submatrin.ds.*;

/**
 * 
 */


public class MT_SUBMATRIN_1304_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_occr_dt;
	public String slip_seq;
	public String ern;
	public String wifactcd;
	public String dlco_nm;
	public String matr_cd;
	public String matr_nm;
	public String ewh_wgt;
	public String unit;
	public String ewh_uprc;
	public String ewh_amt;
	public String ewh_vat;
	public String w_amt;

	public MT_SUBMATRIN_1304_LCURLISTRecord(){}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setWifactcd(String wifactcd){
		this.wifactcd = wifactcd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setEwh_wgt(String ewh_wgt){
		this.ewh_wgt = ewh_wgt;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setEwh_uprc(String ewh_uprc){
		this.ewh_uprc = ewh_uprc;
	}

	public void setEwh_amt(String ewh_amt){
		this.ewh_amt = ewh_amt;
	}

	public void setEwh_vat(String ewh_vat){
		this.ewh_vat = ewh_vat;
	}

	public void setW_amt(String w_amt){
		this.w_amt = w_amt;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getErn(){
		return this.ern;
	}

	public String getWifactcd(){
		return this.wifactcd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getEwh_wgt(){
		return this.ewh_wgt;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getEwh_uprc(){
		return this.ewh_uprc;
	}

	public String getEwh_amt(){
		return this.ewh_amt;
	}

	public String getEwh_vat(){
		return this.ewh_vat;
	}

	public String getW_amt(){
		return this.w_amt;
	}
}

/* 작성시간 : Thu Mar 19 17:50:05 KST 2009 */