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


package chosun.ciis.mt.close.rec;

import java.sql.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */


public class MT_CLOSE_2000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String fac_clsf;
	public String fac_clsf_nm;
	public String matr_cd;
	public String matr_nm;
	public String owh_qunt;
	public String owh_amt;
	public String avg_owh_amt;
	public String all_qunt;
	public String shet_qunt;

	public MT_CLOSE_2000_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setOwh_qunt(String owh_qunt){
		this.owh_qunt = owh_qunt;
	}

	public void setOwh_amt(String owh_amt){
		this.owh_amt = owh_amt;
	}

	public void setAvg_owh_amt(String avg_owh_amt){
		this.avg_owh_amt = avg_owh_amt;
	}

	public void setAll_qunt(String all_qunt){
		this.all_qunt = all_qunt;
	}

	public void setShet_qunt(String shet_qunt){
		this.shet_qunt = shet_qunt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getOwh_qunt(){
		return this.owh_qunt;
	}

	public String getOwh_amt(){
		return this.owh_amt;
	}

	public String getAvg_owh_amt(){
		return this.avg_owh_amt;
	}

	public String getAll_qunt(){
		return this.all_qunt;
	}

	public String getShet_qunt(){
		return this.shet_qunt;
	}
}

/* 작성시간 : Mon Aug 03 21:09:16 KST 2009 */