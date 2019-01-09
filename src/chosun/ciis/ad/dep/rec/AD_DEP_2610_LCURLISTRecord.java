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


package chosun.ciis.ad.dep.rec;

import java.sql.*;
import chosun.ciis.ad.dep.dm.*;
import chosun.ciis.ad.dep.ds.*;

/**
 * 
 */


public class AD_DEP_2610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_nm;
	public String hndl_clsf;
	public String hndl_clsf_nm;
	public String dlco_no;
	public String dlco_nm;
	public String advt_fee;
	public String vat;
	public String tot_fee;
	public String dh;
	public String gjms_advt_fee;
	public String gjms_vat;
	public String gjms_tot_fee;
	public String mchrg_pers;
	public String save_amt;

	public AD_DEP_2610_LCURLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setHndl_clsf_nm(String hndl_clsf_nm){
		this.hndl_clsf_nm = hndl_clsf_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setTot_fee(String tot_fee){
		this.tot_fee = tot_fee;
	}

	public void setDh(String dh){
		this.dh = dh;
	}

	public void setGjms_advt_fee(String gjms_advt_fee){
		this.gjms_advt_fee = gjms_advt_fee;
	}

	public void setGjms_vat(String gjms_vat){
		this.gjms_vat = gjms_vat;
	}

	public void setGjms_tot_fee(String gjms_tot_fee){
		this.gjms_tot_fee = gjms_tot_fee;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setSave_amt(String save_amt){
		this.save_amt = save_amt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getHndl_clsf_nm(){
		return this.hndl_clsf_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getTot_fee(){
		return this.tot_fee;
	}

	public String getDh(){
		return this.dh;
	}

	public String getGjms_advt_fee(){
		return this.gjms_advt_fee;
	}

	public String getGjms_vat(){
		return this.gjms_vat;
	}

	public String getGjms_tot_fee(){
		return this.gjms_tot_fee;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getSave_amt(){
		return this.save_amt;
	}
}

/* 작성시간 : Wed Feb 25 17:59:00 KST 2015 */