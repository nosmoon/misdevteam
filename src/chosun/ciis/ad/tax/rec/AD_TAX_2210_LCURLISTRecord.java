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


package chosun.ciis.ad.tax.rec;

import java.sql.*;
import chosun.ciis.ad.tax.dm.*;
import chosun.ciis.ad.tax.ds.*;

/**
 * 
 */


public class AD_TAX_2210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_dt;
	public String slip_no;
	public String medi_nm;
	public String advt_fee;
	public String vat;
	public String issu_pers;
	public String agn;
	public String mchrg_pers;
	public String slcrg_pers;
	public String dlco_clsf_cd;

	public AD_TAX_2210_LCURLISTRecord(){}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setIssu_pers(String issu_pers){
		this.issu_pers = issu_pers;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getIssu_pers(){
		return this.issu_pers;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}
}

/* 작성시간 : Mon Sep 21 10:36:54 KST 2009 */