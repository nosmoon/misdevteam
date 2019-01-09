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


package chosun.ciis.ad.pub.rec;

import java.sql.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;

/**
 * 
 */


public class AD_PUB_2311_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sale_stmt_issu_yn;
	public String pubc_dt;
	public String pubc_slip_no;
	public String medi_nm;
	public String advt_clsf;
	public String sect_cd;
	public String sect_seq;
	public String publ_std;
	public String issu_ser_no;
	public String slcrg_nm;
	public String mchrg_nm;
	public String patr_chrg_info;
	public String dlco_nm;
	public String agn;
	public String advt_fee;
	public String vat;
	public String tot_rcpm_amt;
	public String misu_tot_amt;
	public String fee;
	public String tax_email;
	public String tax_clsf;
	public String notaxrate_data_get_dt;
	public String exrate;
	public String mony_kind;
	public String frex_cntr_amt;

	public AD_PUB_2311_LCURLISTRecord(){}

	public void setSale_stmt_issu_yn(String sale_stmt_issu_yn){
		this.sale_stmt_issu_yn = sale_stmt_issu_yn;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setAdvt_clsf(String advt_clsf){
		this.advt_clsf = advt_clsf;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
	}

	public void setPubl_std(String publ_std){
		this.publ_std = publ_std;
	}

	public void setIssu_ser_no(String issu_ser_no){
		this.issu_ser_no = issu_ser_no;
	}

	public void setSlcrg_nm(String slcrg_nm){
		this.slcrg_nm = slcrg_nm;
	}

	public void setMchrg_nm(String mchrg_nm){
		this.mchrg_nm = mchrg_nm;
	}

	public void setPatr_chrg_info(String patr_chrg_info){
		this.patr_chrg_info = patr_chrg_info;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setTot_rcpm_amt(String tot_rcpm_amt){
		this.tot_rcpm_amt = tot_rcpm_amt;
	}

	public void setMisu_tot_amt(String misu_tot_amt){
		this.misu_tot_amt = misu_tot_amt;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setTax_email(String tax_email){
		this.tax_email = tax_email;
	}

	public void setTax_clsf(String tax_clsf){
		this.tax_clsf = tax_clsf;
	}

	public void setNotaxrate_data_get_dt(String notaxrate_data_get_dt){
		this.notaxrate_data_get_dt = notaxrate_data_get_dt;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setMony_kind(String mony_kind){
		this.mony_kind = mony_kind;
	}

	public void setFrex_cntr_amt(String frex_cntr_amt){
		this.frex_cntr_amt = frex_cntr_amt;
	}

	public String getSale_stmt_issu_yn(){
		return this.sale_stmt_issu_yn;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getAdvt_clsf(){
		return this.advt_clsf;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
	}

	public String getPubl_std(){
		return this.publ_std;
	}

	public String getIssu_ser_no(){
		return this.issu_ser_no;
	}

	public String getSlcrg_nm(){
		return this.slcrg_nm;
	}

	public String getMchrg_nm(){
		return this.mchrg_nm;
	}

	public String getPatr_chrg_info(){
		return this.patr_chrg_info;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getTot_rcpm_amt(){
		return this.tot_rcpm_amt;
	}

	public String getMisu_tot_amt(){
		return this.misu_tot_amt;
	}

	public String getFee(){
		return this.fee;
	}

	public String getTax_email(){
		return this.tax_email;
	}

	public String getTax_clsf(){
		return this.tax_clsf;
	}

	public String getNotaxrate_data_get_dt(){
		return this.notaxrate_data_get_dt;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getMony_kind(){
		return this.mony_kind;
	}

	public String getFrex_cntr_amt(){
		return this.frex_cntr_amt;
	}
}

/* 작성시간 : Tue Apr 01 14:12:59 KST 2014 */