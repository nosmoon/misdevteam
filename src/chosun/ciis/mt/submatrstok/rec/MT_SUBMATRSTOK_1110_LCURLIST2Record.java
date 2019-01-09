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


package chosun.ciis.mt.submatrstok.rec;

import java.sql.*;
import chosun.ciis.mt.submatrstok.dm.*;
import chosun.ciis.mt.submatrstok.ds.*;

/**
 * 
 */


public class MT_SUBMATRSTOK_1110_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String matr_nm;
	public String unit;
	public String befor_wgt;
	public String ewh_wgt;
	public String use_qunt;
	public String jego_wgt;
	public String befor_roll;
	public String ewh_roll;
	public String use_roll;
	public String jego_roll;
	public String mm_ewh_wgt;
	public String mm_req_wgt;
	public String req_wgt;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String fac_clsf;
	public String matr_cd;
	public String remk;
	public String clos_yn;
	public String clos_nm;
	public String roll_wgt;
	
	public MT_SUBMATRSTOK_1110_LCURLIST2Record(){}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setBefor_wgt(String befor_wgt){
		this.befor_wgt = befor_wgt;
	}

	public void setEwh_wgt(String ewh_wgt){
		this.ewh_wgt = ewh_wgt;
	}

	public void setUse_qunt(String use_qunt){
		this.use_qunt = use_qunt;
	}

	public void setJego_wgt(String jego_wgt){
		this.jego_wgt = jego_wgt;
	}
	
	public void setBefor_roll(String befor_roll){
		this.befor_roll = befor_roll;
	}

	public void setEwh_roll(String ewh_roll){
		this.ewh_roll = ewh_roll;
	}

	public void setUse_roll(String use_roll){
		this.use_roll = use_roll;
	}

	public void setJego_roll(String jego_roll){
		this.jego_roll = jego_roll;
	}
	
	public void setMm_ewh_wgt(String mm_ewh_wgt){
		this.mm_ewh_wgt = mm_ewh_wgt;
	}

	public void setMm_req_wgt(String mm_req_wgt){
		this.mm_req_wgt = mm_req_wgt;
	}

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

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}
	
	public void setClos_nm(String clos_nm){
		this.clos_nm = clos_nm;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}
	
	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getBefor_wgt(){
		return this.befor_wgt;
	}

	public String getEwh_wgt(){
		return this.ewh_wgt;
	}

	public String getUse_qunt(){
		return this.use_qunt;
	}

	public String getJego_wgt(){
		return this.jego_wgt;
	}

	public String getBefor_roll(){
		return this.befor_roll;
	}

	public String getEwh_roll(){
		return this.ewh_roll;
	}

	public String getUse_roll(){
		return this.use_roll;
	}

	public String getJego_roll(){
		return this.jego_roll;
	}
	
	public String getMm_req_wgt(){
		return this.mm_req_wgt;
	}

	public String getMm_ewh_wgt(){
		return this.mm_ewh_wgt;
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
	
	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_nm(){
		return this.clos_nm;
	}
	
	public String getRoll_wgt(){
		return this.roll_wgt;
	}
	
	
}

/* 작성시간 : Wed Jun 12 19:16:16 KST 2013 */