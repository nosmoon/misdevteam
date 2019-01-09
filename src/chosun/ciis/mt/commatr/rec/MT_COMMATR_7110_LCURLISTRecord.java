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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_7110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{
	
	public String ewh_dt;
	public String dlco_nm;
	public String matr_clas_nm;
	public String matr_nm;
	public String remk;
	public String ewh_qunt;
	public String unit;
	public String ewh_uprc;
	public String ewh_amt;
	public String rest_amt;
	public String stok;
	public String safe_stok;
	public String fac_clsf;
	public String incmg_pers;

	public MT_COMMATR_7110_LCURLISTRecord(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}
	
	public void setMatr_clas_nm(String matr_clas_nm){
		this.matr_clas_nm = matr_clas_nm;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setEwh_qunt(String ewh_qunt){
		this.ewh_qunt = ewh_qunt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setEwh_uprc(String ewh_uprc){
		this.ewh_uprc = ewh_uprc;
	}

	public void setEwh_amt(String ewh_amt){
		this.ewh_amt = ewh_amt;
	}

	public void setRest_amt(String rest_amt){
		this.rest_amt = rest_amt;
	}

	public void setStok(String stok){
		this.stok = stok;
	}

	public void setSafe_stok(String safe_stok){
		this.safe_stok = safe_stok;
	}
	
	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}
	
	public String getFac_clsf(){
		return this.fac_clsf;
	}
	
	public String getEwh_dt(){
		return this.ewh_dt;
	}
	
	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getMatr_clas_nm(){
		return this.matr_clas_nm;
	}
	
	public String getUnit(){
		return this.unit;
	}
	
	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getRemk(){
		return this.remk;
	}
	public String getEwh_qunt(){
		return this.ewh_qunt;
	}

	public String getEwh_uprc(){
		return this.ewh_uprc;
	}

	public String getEwh_amt(){
		return this.ewh_amt;
	}

	public String getRest_amt(){
		return this.rest_amt;
	}

	public String getStok(){
		return this.stok;
	}

	public String getSafe_stok(){
		return this.safe_stok;
	}
	
	public String getIncmg_pers(){
		return this.incmg_pers;
	}
		
}

/* 작성시간 : Wed Dec 26 15:23:27 KST 2012 */