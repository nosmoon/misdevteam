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


public class MT_SUBMATRSTOK_1010_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String matr_nm;
	public String unit;
	public String befor_wgt;
	public String ewh_wgt;
	public String use_qunt;
	public String jego_wgt;
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
	public String req_remk;
	
	public MT_SUBMATRSTOK_1010_LCURLIST2Record(){}

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
	
	public void setMm_ewh_wgt(String mm_ewh_wgt){
		this.mm_ewh_wgt = mm_ewh_wgt;
	}

	public void setMm_req_wgt(String mm_req_wgt){
		this.mm_req_wgt = mm_req_wgt;
	}

	public void setReq_wgt(String req_wgt){
		this.req_wgt = req_wgt;
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

	public void setRemk(String remk){
		this.remk = remk;
	}
	
	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}
	
	public void setClos_nm(String clos_nm){
		this.clos_nm = clos_nm;
	}
	
	public void setReq_remk(String req_remk){
		this.req_remk = req_remk;
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

	public String getMm_req_wgt(){
		return this.mm_req_wgt;
	}

	public String getMm_ewh_wgt(){
		return this.mm_ewh_wgt;
	}

	public String getReq_wgt(){
		return this.req_wgt;
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
	
	public String getRemk(){
		return this.remk;
	}
	
	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_nm(){
		return this.clos_nm;
	}
	
	public String getReq_remk(){
		return this.req_remk;
	}
	
}

/* 작성시간 : Wed Jun 12 19:16:16 KST 2013 */