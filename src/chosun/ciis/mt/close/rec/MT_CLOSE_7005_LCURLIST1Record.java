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


public class MT_CLOSE_7005_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String fac_clsf_nm;
	public String dstb_rat_cd;
	public String dstb_rat_nm;
	public String owh_budg_cd;
	public String budg_cdnm;
	public String use_dept;
	public String hap_qunt;
	public String hap_amt;
	public String matr_cd;
	public String matr_nm;
	public String medi_cd;
	public String sect_cd;
	public String medi_nm;
	public String sect_nm;
	public String qunt;
	public String amt;

	public MT_CLOSE_7005_LCURLIST1Record(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setDstb_rat_cd(String dstb_rat_cd){
		this.dstb_rat_cd = dstb_rat_cd;
	}

	public void setDstb_rat_nm(String dstb_rat_nm){
		this.dstb_rat_nm = dstb_rat_nm;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setUse_dept(String use_dept){
		this.use_dept = use_dept;
	}

	public void setHap_qunt(String hap_qunt){
		this.hap_qunt = hap_qunt;
	}

	public void setHap_amt(String hap_amt){
		this.hap_amt = hap_amt;
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

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getDstb_rat_cd(){
		return this.dstb_rat_cd;
	}

	public String getDstb_rat_nm(){
		return this.dstb_rat_nm;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getUse_dept(){
		return this.use_dept;
	}

	public String getHap_qunt(){
		return this.hap_qunt;
	}

	public String getHap_amt(){
		return this.hap_amt;
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

	public String getQunt(){
		return this.qunt;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Thu Aug 06 17:51:50 KST 2009 */