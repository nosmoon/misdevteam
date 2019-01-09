/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
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


public class PL_BAS_1410_LDLCOBASEBALCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String comn_mang_no;
	public String rptv_flnm;
	public String dlco_clsf_nm;
	public String area_nm;
	public String prv_curr_clsf_nm;
	public String magz_deal_yn;
	public String sep_book_deal_yn;
	public String magz_setup_amt;
	public String sep_book_setup_amt;

	public PL_BAS_1410_LDLCOBASEBALCURRecord(){}

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

	public void setDlco_clsf_nm(String dlco_clsf_nm){
		this.dlco_clsf_nm = dlco_clsf_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setPrv_curr_clsf_nm(String prv_curr_clsf_nm){
		this.prv_curr_clsf_nm = prv_curr_clsf_nm;
	}

	public void setMagz_deal_yn(String magz_deal_yn){
		this.magz_deal_yn = magz_deal_yn;
	}

	public void setSep_book_deal_yn(String sep_book_deal_yn){
		this.sep_book_deal_yn = sep_book_deal_yn;
	}

	public void setMagz_setup_amt(String magz_setup_amt){
		this.magz_setup_amt = magz_setup_amt;
	}

	public void setSep_book_setup_amt(String sep_book_setup_amt){
		this.sep_book_setup_amt = sep_book_setup_amt;
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

	public String getDlco_clsf_nm(){
		return this.dlco_clsf_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getPrv_curr_clsf_nm(){
		return this.prv_curr_clsf_nm;
	}

	public String getMagz_deal_yn(){
		return this.magz_deal_yn;
	}

	public String getSep_book_deal_yn(){
		return this.sep_book_deal_yn;
	}

	public String getMagz_setup_amt(){
		return this.magz_setup_amt;
	}

	public String getSep_book_setup_amt(){
		return this.sep_book_setup_amt;
	}
}

/* 작성시간 : Thu Mar 05 19:55:11 KST 2009 */