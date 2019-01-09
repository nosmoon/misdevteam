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


package chosun.ciis.mt.submatrout.rec;

import java.sql.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 * 
 */


public class MT_SUBMATROUT_1202_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String owh_dt;
	public String fac_clsf_nm;
	public String matr_cd;
	public String owh_dept;
	public String owh_budg_cd;
	public String owh_qunt;
	public String owh_unit;
	public String owh_uprc;
	public String owh_amt;
	public String medi_cd;
	public String medi_ser_no;
	public String remk;
	public String ewh_budg_cd;
	public String ewh_dt;
	public String ewh_seq;
	public String ewh_sub_seq;
	public String matr_nm;
	public String unit;
	public String purc_uprc;
	public String bccgdeptnm;
	public String matr_clas;

	public MT_SUBMATROUT_1202_LCURLISTRecord(){}

	public void setOwh_dt(String owh_dt){
		this.owh_dt = owh_dt;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setOwh_dept(String owh_dept){
		this.owh_dept = owh_dept;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setOwh_qunt(String owh_qunt){
		this.owh_qunt = owh_qunt;
	}

	public void setOwh_unit(String owh_unit){
		this.owh_unit = owh_unit;
	}

	public void setOwh_uprc(String owh_uprc){
		this.owh_uprc = owh_uprc;
	}

	public void setOwh_amt(String owh_amt){
		this.owh_amt = owh_amt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setEwh_budg_cd(String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setEwh_seq(String ewh_seq){
		this.ewh_seq = ewh_seq;
	}

	public void setEwh_sub_seq(String ewh_sub_seq){
		this.ewh_sub_seq = ewh_sub_seq;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setPurc_uprc(String purc_uprc){
		this.purc_uprc = purc_uprc;
	}

	public void setBccgdeptnm(String bccgdeptnm){
		this.bccgdeptnm = bccgdeptnm;
	}

	public void setMatr_clas(String matr_clas){
		this.matr_clas = matr_clas;
	}
	
	public String getOwh_dt(){
		return this.owh_dt;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getOwh_dept(){
		return this.owh_dept;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getOwh_qunt(){
		return this.owh_qunt;
	}

	public String getOwh_unit(){
		return this.owh_unit;
	}

	public String getOwh_uprc(){
		return this.owh_uprc;
	}

	public String getOwh_amt(){
		return this.owh_amt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getEwh_seq(){
		return this.ewh_seq;
	}

	public String getEwh_sub_seq(){
		return this.ewh_sub_seq;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getPurc_uprc(){
		return this.purc_uprc;
	}

	public String getBccgdeptnm(){
		return this.bccgdeptnm;
	}
	
	public String getMatr_clas(){
		return this.matr_clas;
	}
}

/* 작성시간 : Thu Apr 09 19:56:13 KST 2009 */