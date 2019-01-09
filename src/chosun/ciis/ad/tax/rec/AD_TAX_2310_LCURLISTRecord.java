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


public class AD_TAX_2310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{ 

	public String dlco_no;
	public String dlco_nm;
	public String pubc_slip_no;
	public String pubc_dt;
	public String advt_fee;
	public String vat;
	public String pubc_tot_amt;
	public String agn;
	public String agn_nm;
	public String rcpm_yn;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String mchrg_pers;
	public String mchrg_pers_nm;

	public AD_TAX_2310_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setPubc_tot_amt(String pubc_tot_amt){
		this.pubc_tot_amt = pubc_tot_amt;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public void setAgn_nm(String agn_nm){
		this.agn_nm = agn_nm;
	}

	public void setRcpm_yn(String rcpm_yn){
		this.rcpm_yn = rcpm_yn;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getPubc_tot_amt(){
		return this.pubc_tot_amt;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getAgn_nm(){
		return this.agn_nm;
	}

	public String getRcpm_yn(){
		return this.rcpm_yn;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}
}

/* 작성시간 : Tue Nov 14 11:19:45 KST 2017 */