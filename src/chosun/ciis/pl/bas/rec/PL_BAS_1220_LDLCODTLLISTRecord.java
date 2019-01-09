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


package chosun.ciis.pl.bas.rec;

import java.sql.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.ds.*;

/**
 * 
 */


public class PL_BAS_1220_LDLCODTLLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String comn_mang_no;
	public String rptv_flnm;
	public String dlco_clsf;
	public String area;
	public String prv_curr_clsf;
	public String prv_curr_clsf_nm;
	public String bkst_cnt;
	public String tel_no_1;
	public String tel_no_2;
	public String tel_no_3;
	public String tel_no_etc;
	public String ptph_no_1;
	public String ptph_no_2;
	public String ptph_no_3;
	public String fax_no_1;
	public String fax_no_2;
	public String fax_no_3;
	public String email;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String magz_deal_yn;
	public String magz_deal_frdt;
	public String magz_deal_todt;
	public String sep_book_deal_yn;
	public String sep_book_deal_frdt;
	public String sep_book_deal_todt;
	public String elec_tax_stmt_yn;
	public String gurt_amt_tot_amt;
	public String gurt_amt_altn;
	public String remk;

	public PL_BAS_1220_LDLCODTLLISTRecord(){}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setComn_mang_no(String comn_mang_no){
		this.comn_mang_no = comn_mang_no;
	}

	public void setRptv_flnm(String rptv_flnm){
		this.rptv_flnm = rptv_flnm;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setArea(String area){
		this.area = area;
	}

	public void setPrv_curr_clsf(String prv_curr_clsf){
		this.prv_curr_clsf = prv_curr_clsf;
	}

	public void setPrv_curr_clsf_nm(String prv_curr_clsf_nm){
		this.prv_curr_clsf_nm = prv_curr_clsf_nm;
	}

	public void setBkst_cnt(String bkst_cnt){
		this.bkst_cnt = bkst_cnt;
	}

	public void setTel_no_1(String tel_no_1){
		this.tel_no_1 = tel_no_1;
	}

	public void setTel_no_2(String tel_no_2){
		this.tel_no_2 = tel_no_2;
	}

	public void setTel_no_3(String tel_no_3){
		this.tel_no_3 = tel_no_3;
	}

	public void setTel_no_etc(String tel_no_etc){
		this.tel_no_etc = tel_no_etc;
	}

	public void setPtph_no_1(String ptph_no_1){
		this.ptph_no_1 = ptph_no_1;
	}

	public void setPtph_no_2(String ptph_no_2){
		this.ptph_no_2 = ptph_no_2;
	}

	public void setPtph_no_3(String ptph_no_3){
		this.ptph_no_3 = ptph_no_3;
	}

	public void setFax_no_1(String fax_no_1){
		this.fax_no_1 = fax_no_1;
	}

	public void setFax_no_2(String fax_no_2){
		this.fax_no_2 = fax_no_2;
	}

	public void setFax_no_3(String fax_no_3){
		this.fax_no_3 = fax_no_3;
	}

	public void setEmail(String email){
		this.email = email;
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

	public void setMagz_deal_yn(String magz_deal_yn){
		this.magz_deal_yn = magz_deal_yn;
	}

	public void setMagz_deal_frdt(String magz_deal_frdt){
		this.magz_deal_frdt = magz_deal_frdt;
	}

	public void setMagz_deal_todt(String magz_deal_todt){
		this.magz_deal_todt = magz_deal_todt;
	}

	public void setSep_book_deal_yn(String sep_book_deal_yn){
		this.sep_book_deal_yn = sep_book_deal_yn;
	}

	public void setSep_book_deal_frdt(String sep_book_deal_frdt){
		this.sep_book_deal_frdt = sep_book_deal_frdt;
	}

	public void setSep_book_deal_todt(String sep_book_deal_todt){
		this.sep_book_deal_todt = sep_book_deal_todt;
	}

	public void setElec_tax_stmt_yn(String elec_tax_stmt_yn){
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
	}

	public void setGurt_amt_tot_amt(String gurt_amt_tot_amt){
		this.gurt_amt_tot_amt = gurt_amt_tot_amt;
	}

	public void setGurt_amt_altn(String gurt_amt_altn){
		this.gurt_amt_altn = gurt_amt_altn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getComn_mang_no(){
		return this.comn_mang_no;
	}

	public String getRptv_flnm(){
		return this.rptv_flnm;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getArea(){
		return this.area;
	}

	public String getPrv_curr_clsf(){
		return this.prv_curr_clsf;
	}

	public String getPrv_curr_clsf_nm(){
		return this.prv_curr_clsf_nm;
	}

	public String getBkst_cnt(){
		return this.bkst_cnt;
	}

	public String getTel_no_1(){
		return this.tel_no_1;
	}

	public String getTel_no_2(){
		return this.tel_no_2;
	}

	public String getTel_no_3(){
		return this.tel_no_3;
	}

	public String getTel_no_etc(){
		return this.tel_no_etc;
	}

	public String getPtph_no_1(){
		return this.ptph_no_1;
	}

	public String getPtph_no_2(){
		return this.ptph_no_2;
	}

	public String getPtph_no_3(){
		return this.ptph_no_3;
	}

	public String getFax_no_1(){
		return this.fax_no_1;
	}

	public String getFax_no_2(){
		return this.fax_no_2;
	}

	public String getFax_no_3(){
		return this.fax_no_3;
	}

	public String getEmail(){
		return this.email;
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

	public String getMagz_deal_yn(){
		return this.magz_deal_yn;
	}

	public String getMagz_deal_frdt(){
		return this.magz_deal_frdt;
	}

	public String getMagz_deal_todt(){
		return this.magz_deal_todt;
	}

	public String getSep_book_deal_yn(){
		return this.sep_book_deal_yn;
	}

	public String getSep_book_deal_frdt(){
		return this.sep_book_deal_frdt;
	}

	public String getSep_book_deal_todt(){
		return this.sep_book_deal_todt;
	}

	public String getElec_tax_stmt_yn(){
		return this.elec_tax_stmt_yn;
	}

	public String getGurt_amt_tot_amt(){
		return this.gurt_amt_tot_amt;
	}

	public String getGurt_amt_altn(){
		return this.gurt_amt_altn;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Apr 27 18:18:56 KST 2009 */