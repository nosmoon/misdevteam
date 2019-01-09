/***************************************************************************************************
* 파일명 : .java
* 기능 : 세금계산서 게재상계내역 조회
* 작성일자 : 2011.03.15
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.tax.rec;

import java.sql.*;
import chosun.ciis.ad.tax.dm.*;
import chosun.ciis.ad.tax.ds.*;

/**
 * 
 */


public class AD_TAX_2810_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prof_type_cd;
	public String prof_type_nm;
	public String medi_cd;
	public String medi_nm;
	public String dlco_no;
	public String dlco_nm;
	public String advt_fee;
	public String vat;
	public String agn;
	public String agn_nm;
	public String fee;
	public String hndl_plac_cd;
	public String hndl_plac_nm;
	public String coms;
	public String pubc_dt;
	public String pubc_slip_no;
	public String sect_cd_seq;
	public String dn;
	public String cm;
	public String arow;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String mchrg_pers;
	public String mchrg_pers_nm;
	
	public AD_TAX_2810_LCURLISTRecord(){}

	public String getAdvt_fee() {
		return advt_fee;
	}

	public void setAdvt_fee(String advt_fee) {
		this.advt_fee = advt_fee;
	}

	public String getAgn() {
		return agn;
	}

	public void setAgn(String agn) {
		this.agn = agn;
	}

	public String getAgn_nm() {
		return agn_nm;
	}

	public void setAgn_nm(String agn_nm) {
		this.agn_nm = agn_nm;
	}

	public String getArow() {
		return arow;
	}

	public void setArow(String arow) {
		this.arow = arow;
	}

	public String getCm() {
		return cm;
	}

	public void setCm(String cm) {
		this.cm = cm;
	}

	public String getComs() {
		return coms;
	}

	public void setComs(String coms) {
		this.coms = coms;
	}

	public String getDlco_nm() {
		return dlco_nm;
	}

	public void setDlco_nm(String dlco_nm) {
		this.dlco_nm = dlco_nm;
	}

	public String getDlco_no() {
		return dlco_no;
	}

	public void setDlco_no(String dlco_no) {
		this.dlco_no = dlco_no;
	}

	public String getDn() {
		return dn;
	}

	public void setDn(String dn) {
		this.dn = dn;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getHndl_plac_cd() {
		return hndl_plac_cd;
	}

	public void setHndl_plac_cd(String hndl_plac_cd) {
		this.hndl_plac_cd = hndl_plac_cd;
	}

	public String getHndl_plac_nm() {
		return hndl_plac_nm;
	}

	public void setHndl_plac_nm(String hndl_plac_nm) {
		this.hndl_plac_nm = hndl_plac_nm;
	}

	public String getMchrg_pers() {
		return mchrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers) {
		this.mchrg_pers = mchrg_pers;
	}

	public String getMchrg_pers_nm() {
		return mchrg_pers_nm;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm) {
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public String getMedi_cd() {
		return medi_cd;
	}

	public void setMedi_cd(String medi_cd) {
		this.medi_cd = medi_cd;
	}

	public String getMedi_nm() {
		return medi_nm;
	}

	public void setMedi_nm(String medi_nm) {
		this.medi_nm = medi_nm;
	}

	public String getProf_type_cd() {
		return prof_type_cd;
	}

	public void setProf_type_cd(String prof_type_cd) {
		this.prof_type_cd = prof_type_cd;
	}

	public String getProf_type_nm() {
		return prof_type_nm;
	}

	public void setProf_type_nm(String prof_type_nm) {
		this.prof_type_nm = prof_type_nm;
	}

	public String getPubc_dt() {
		return pubc_dt;
	}

	public void setPubc_dt(String pubc_dt) {
		this.pubc_dt = pubc_dt;
	}

	public String getPubc_slip_no() {
		return pubc_slip_no;
	}

	public void setPubc_slip_no(String pubc_slip_no) {
		this.pubc_slip_no = pubc_slip_no;
	}

	public String getSect_cd_seq() {
		return sect_cd_seq;
	}

	public void setSect_cd_seq(String sect_cd_seq) {
		this.sect_cd_seq = sect_cd_seq;
	}

	public String getSlcrg_pers() {
		return slcrg_pers;
	}

	public void setSlcrg_pers(String slcrg_pers) {
		this.slcrg_pers = slcrg_pers;
	}

	public String getSlcrg_pers_nm() {
		return slcrg_pers_nm;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm) {
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}
}

/* 작성시간 : Mon Sep 21 10:36:54 KST 2009 */