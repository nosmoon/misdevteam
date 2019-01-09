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


public class MT_SUBMATROUT_1401_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String matr_cd;
	public String matr_nm;
	public String unit;
	public String maeipdan;
	public String ewh_budg_cd;
	public String owh_budg_cd;
	public String std_modl;
	public String safe_stok;
	public String hjg_cnt;
	public String hjg_amt;
	public String igacctcdnm;
	public String cgacctcdnm;
	public String dstb_rat_cd;
	public String ordr_qunt;
	public String matr_cnfm_qunt;
	public String matr_acpn_yn;

	public MT_SUBMATROUT_1401_LCURLISTRecord(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setMaeipdan(String maeipdan){
		this.maeipdan = maeipdan;
	}

	public void setEwh_budg_cd(String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public void setSafe_stok(String safe_stok){
		this.safe_stok = safe_stok;
	}

	public void setHjg_cnt(String hjg_cnt){
		this.hjg_cnt = hjg_cnt;
	}

	public void setHjg_amt(String hjg_amt){
		this.hjg_amt = hjg_amt;
	}

	public void setIgacctcdnm(String igacctcdnm){
		this.igacctcdnm = igacctcdnm;
	}

	public void setCgacctcdnm(String cgacctcdnm){
		this.cgacctcdnm = cgacctcdnm;
	}

	public void setDstb_rat_cd(String dstb_rat_cd){
		this.dstb_rat_cd = dstb_rat_cd;
	}

	public void setOrdr_qunt(String ordr_qunt){
		this.ordr_qunt = ordr_qunt;
	}

	public void setMatr_cnfm_qunt(String matr_cnfm_qunt){
		this.matr_cnfm_qunt = matr_cnfm_qunt;
	}
	
	public void setMatr_acpn_yn(String matr_acpn_yn){
		this.matr_acpn_yn = matr_acpn_yn;
	}
	
	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getMaeipdan(){
		return this.maeipdan;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getStd_modl(){
		return this.std_modl;
	}

	public String getSafe_stok(){
		return this.safe_stok;
	}

	public String getHjg_cnt(){
		return this.hjg_cnt;
	}

	public String getHjg_amt(){
		return this.hjg_amt;
	}

	public String getIgacctcdnm(){
		return this.igacctcdnm;
	}

	public String getCgacctcdnm(){
		return this.cgacctcdnm;
	}

	public String getDstb_rat_cd(){
		return this.dstb_rat_cd;
	}

	public String getOrdr_qunt(){
		return this.ordr_qunt;
	}
	
	public String getMatr_cnfm_qunt(){
		return this.matr_cnfm_qunt;
	}
	
	public String getMatr_acpn_yn(){
		return this.matr_acpn_yn;
	}
}

/* 작성시간 : Thu May 07 14:56:52 KST 2009 */