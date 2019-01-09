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


public class MT_CLOSE_5001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String cdnm;
	public String matr_cd;
	public String matr_nm;
	public String medi_cd;
	public String sect_cd;
	public String medi_nm;
	public String sect_nm;
	public String shet_qunt;
	public String all_qunt;
	public String owh_qunt;
	public String owh_amt;
	public String ewh_budg_cd;
	public String owh_budg_cd;
	public String dstb_rat_cd;
	public String owh_dept;

	public MT_CLOSE_5001_LCURLISTRecord(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setShet_qunt(String shet_qunt){
		this.shet_qunt = shet_qunt;
	}

	public void setAll_qunt(String all_qunt){
		this.all_qunt = all_qunt;
	}

	public void setOwh_qunt(String owh_qunt){
		this.owh_qunt = owh_qunt;
	}

	public void setOwh_amt(String owh_amt){
		this.owh_amt = owh_amt;
	}

	public void setEwh_budg_cd(String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setDstb_rat_cd(String dstb_rat_cd){
		this.dstb_rat_cd = dstb_rat_cd;
	}

	public void setOwh_dept(String owh_dept){
		this.owh_dept = owh_dept;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getShet_qunt(){
		return this.shet_qunt;
	}

	public String getAll_qunt(){
		return this.all_qunt;
	}

	public String getOwh_qunt(){
		return this.owh_qunt;
	}

	public String getOwh_amt(){
		return this.owh_amt;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getDstb_rat_cd(){
		return this.dstb_rat_cd;
	}

	public String getOwh_dept(){
		return this.owh_dept;
	}
}

/* 작성시간 : Tue Jul 28 20:29:20 KST 2009 */