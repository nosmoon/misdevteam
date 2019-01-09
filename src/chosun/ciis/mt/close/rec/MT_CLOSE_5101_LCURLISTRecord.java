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


public class MT_CLOSE_5101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String owh_dt;
	public String fac_clsf;
	public String fac_clsf_nm;
	public String matr_cd;
	public String matr_nm;
	public String medi_qunt;
	public String dtl_qunt;
	public String qunt;

	public MT_CLOSE_5101_LCURLISTRecord(){}

	public void setOwh_dt(String owh_dt){
		this.owh_dt = owh_dt;
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

	public void setMedi_qunt(String medi_qunt){
		this.medi_qunt = medi_qunt;
	}

	public void setDtl_qunt(String dtl_qunt){
		this.dtl_qunt = dtl_qunt;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public String getOwh_dt(){
		return this.owh_dt;
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

	public String getMedi_qunt(){
		return this.medi_qunt;
	}

	public String getDtl_qunt(){
		return this.dtl_qunt;
	}

	public String getQunt(){
		return this.qunt;
	}
}

/* 작성시간 : Wed Aug 09 17:28:07 KST 2017 */