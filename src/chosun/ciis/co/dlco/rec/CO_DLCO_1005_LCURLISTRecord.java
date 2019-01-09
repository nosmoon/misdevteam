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


package chosun.ciis.co.dlco.rec;

import java.sql.*;
import chosun.ciis.co.dlco.dm.*;
import chosun.ciis.co.dlco.ds.*;

/**
 * 
 */


public class CO_DLCO_1005_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String ern;
	public String sys_clsf_cd;
	public String sys_clsf_nm;
	public String dlco_abrv_nm;
	public String dlco_nm;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String frnc_pers_yn;
	public String natn_cd;
	public String natn_nm;
	public String frnc_addr;
	public String natn_tel_no;
	public String tel_no;
	public String fax_no;
	public String mang_no_2;
	public String presi_nm;
	public String presi_prn;
	public String presi_zip_1;
	public String presi_zip_2;
	public String presi_addr;
	public String presi_dtls_addr;
	public String presi_tel_no;
	public String bizcond;
	public String item;
	public String setl_bank;
	public String setl_bank_nm;
	public String acct_no;
	public String rcpm_main_nm;
	public String email;
	public String elec_tax_stmt_yn;
	public String corp_clsf;
	public String corp_clsf_nm;
	public String err_eps_no_aprv_yn;
	public String err_eps_no_aprv_dt;
	public String err_eps_no_aprv_pers;
	public String incmg_pers_cmpy_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String incmg_nm;
	public String incmg_dt_tm;
	public String chg_pers_cmpy_cd;
	public String chg_pers;
	public String chg_nm;
	public String chg_dt_tm;
	public String txn_clsf;	
	public String acct_stat;	

	public CO_DLCO_1005_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setSys_clsf_cd(String sys_clsf_cd){
		this.sys_clsf_cd = sys_clsf_cd;
	}

	public void setSys_clsf_nm(String sys_clsf_nm){
		this.sys_clsf_nm = sys_clsf_nm;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setFrnc_pers_yn(String frnc_pers_yn){
		this.frnc_pers_yn = frnc_pers_yn;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setNatn_nm(String natn_nm){
		this.natn_nm = natn_nm;
	}

	public void setFrnc_addr(String frnc_addr){
		this.frnc_addr = frnc_addr;
	}

	public void setNatn_tel_no(String natn_tel_no){
		this.natn_tel_no = natn_tel_no;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setMang_no_2(String mang_no_2){
		this.mang_no_2 = mang_no_2;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setPresi_prn(String presi_prn){
		this.presi_prn = presi_prn;
	}

	public void setPresi_zip_1(String presi_zip_1){
		this.presi_zip_1 = presi_zip_1;
	}

	public void setPresi_zip_2(String presi_zip_2){
		this.presi_zip_2 = presi_zip_2;
	}

	public void setPresi_addr(String presi_addr){
		this.presi_addr = presi_addr;
	}

	public void setPresi_dtls_addr(String presi_dtls_addr){
		this.presi_dtls_addr = presi_dtls_addr;
	}

	public void setPresi_tel_no(String presi_tel_no){
		this.presi_tel_no = presi_tel_no;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setSetl_bank(String setl_bank){
		this.setl_bank = setl_bank;
	}

	public void setSetl_bank_nm(String setl_bank_nm){
		this.setl_bank_nm = setl_bank_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setRcpm_main_nm(String rcpm_main_nm){
		this.rcpm_main_nm = rcpm_main_nm;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setElec_tax_stmt_yn(String elec_tax_stmt_yn){
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
	}

	public void setCorp_clsf(String corp_clsf){
		this.corp_clsf = corp_clsf;
	}

	public void setCorp_clsf_nm(String corp_clsf_nm){
		this.corp_clsf_nm = corp_clsf_nm;
	}

	public void setErr_eps_no_aprv_yn(String err_eps_no_aprv_yn){
		this.err_eps_no_aprv_yn = err_eps_no_aprv_yn;
	}

	public void setErr_eps_no_aprv_dt(String err_eps_no_aprv_dt){
		this.err_eps_no_aprv_dt = err_eps_no_aprv_dt;
	}

	public void setErr_eps_no_aprv_pers(String err_eps_no_aprv_pers){
		this.err_eps_no_aprv_pers = err_eps_no_aprv_pers;
	}

	public void setIncmg_pers_cmpy_cd(String incmg_pers_cmpy_cd){
		this.incmg_pers_cmpy_cd = incmg_pers_cmpy_cd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_nm(String incmg_nm){
		this.incmg_nm = incmg_nm;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers_cmpy_cd(String chg_pers_cmpy_cd){
		this.chg_pers_cmpy_cd = chg_pers_cmpy_cd;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_nm(String chg_nm){
		this.chg_nm = chg_nm;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

 	public void setTxn_clsf(String txn_clsf){
		this.txn_clsf = txn_clsf;
	}
 	
	public void setAcct_stat(String acct_stat){
		this.acct_stat = acct_stat;
	}
 	
	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getErn(){
		return this.ern;
	}

	public String getSys_clsf_cd(){
		return this.sys_clsf_cd;
	}

	public String getSys_clsf_nm(){
		return this.sys_clsf_nm;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getFrnc_pers_yn(){
		return this.frnc_pers_yn;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getNatn_nm(){
		return this.natn_nm;
	}

	public String getFrnc_addr(){
		return this.frnc_addr;
	}

	public String getNatn_tel_no(){
		return this.natn_tel_no;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getMang_no_2(){
		return this.mang_no_2;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getPresi_prn(){
		return this.presi_prn;
	}

	public String getPresi_zip_1(){
		return this.presi_zip_1;
	}

	public String getPresi_zip_2(){
		return this.presi_zip_2;
	}

	public String getPresi_addr(){
		return this.presi_addr;
	}

	public String getPresi_dtls_addr(){
		return this.presi_dtls_addr;
	}

	public String getPresi_tel_no(){
		return this.presi_tel_no;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getSetl_bank(){
		return this.setl_bank;
	}

	public String getSetl_bank_nm(){
		return this.setl_bank_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getRcpm_main_nm(){
		return this.rcpm_main_nm;
	}

	public String getEmail(){
		return this.email;
	}

	public String getElec_tax_stmt_yn(){
		return this.elec_tax_stmt_yn;
	}

	public String getCorp_clsf(){
		return this.corp_clsf;
	}

	public String getCorp_clsf_nm(){
		return this.corp_clsf_nm;
	}

	public String getErr_eps_no_aprv_yn(){
		return this.err_eps_no_aprv_yn;
	}

	public String getErr_eps_no_aprv_dt(){
		return this.err_eps_no_aprv_dt;
	}

	public String getErr_eps_no_aprv_pers(){
		return this.err_eps_no_aprv_pers;
	}

	public String getIncmg_pers_cmpy_cd(){
		return this.incmg_pers_cmpy_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_nm(){
		return this.incmg_nm;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers_cmpy_cd(){
		return this.chg_pers_cmpy_cd;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_nm(){
		return this.chg_nm;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getTxn_clsf(){
		return this.txn_clsf;
	}
	
	public String getAcct_stat(){
		return this.acct_stat;
	}


	
}

/* 작성시간 : Wed Apr 08 21:09:15 KST 2009 */