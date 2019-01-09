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


public class MT_SUBMATRIN_1303_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ewh_dt;
	public String seq;
	public String ern;
	public String factcdnm;
	public String dlco_nm;
	public String matr_cd;
	public String matr_nm;
	public String remk;
	public String use_deptcd;
	public String biusedeptnm;
	public String ewh_qunt;
	public String ewh_unit;
	public String ewh_uprc;
	public String ewh_amt;
	public String ewh_vat;
	public String bihannm;
	public String matr_clas;
	public String occr_dt;
	public String cmpy_cd;
	public String ewh_budg_cd;
	public String ewh_budg_nm;
	
	public MT_SUBMATRIN_1303_LCURLISTRecord(){}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setFactcdnm(String factcdnm){
		this.factcdnm = factcdnm;
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

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setUse_deptcd(String use_deptcd){
		this.use_deptcd = use_deptcd;
	}

	public void setBiusedeptnm(String biusedeptnm){
		this.biusedeptnm = biusedeptnm;
	}

	public void setEwh_qunt(String ewh_qunt){
		this.ewh_qunt = ewh_qunt;
	}

	public void setEwh_unit(String ewh_unit){
		this.ewh_unit = ewh_unit;
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

	public void setBihannm(String bihannm){
		this.bihannm = bihannm;
	}

	public void setMatr_clas(String matr_clas){
		this.matr_clas = matr_clas;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setCmpy_cd (String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEwh_budg_cd (String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setEwh_budg_nm (String ewh_budg_nm){
		this.ewh_budg_nm = ewh_budg_nm;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getErn(){
		return this.ern;
	}

	public String getFactcdnm(){
		return this.factcdnm;
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

	public String getRemk(){
		return this.remk;
	}

	public String getUse_deptcd(){
		return this.use_deptcd;
	}

	public String getBiusedeptnm(){
		return this.biusedeptnm;
	}

	public String getEwh_qunt(){
		return this.ewh_qunt;
	}

	public String getEwh_unit(){
		return this.ewh_unit;
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

	public String getBihannm(){
		return this.bihannm;
	}
	
	public String getMatr_clas(){
		return this.matr_clas;
	}
	
	public String getOccr_dt(){
		return this.occr_dt;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
	
	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}

	public String getEwh_budg_nm(){
		return this.ewh_budg_nm;
	}
}

/* 작성시간 : Wed May 06 09:50:27 KST 2009 */