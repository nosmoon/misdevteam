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


package chosun.ciis.pl.rcp.rec;

import java.sql.*;
import chosun.ciis.pl.rcp.dm.*;
import chosun.ciis.pl.rcp.ds.*;

/**
 * 
 */


public class PL_RCP_3510_LPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf_nm;
	public String area_nm;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String magz_deal_yn;
	public String sep_book_deal_yn;
	public String gurt_amt_tot_amt;
	public String gurt_amt_altn;
	public String gurt_amt;

	public PL_RCP_3510_LPTCRLISTRecord(){}

	public void setDlco_clsf_nm(String dlco_clsf_nm){
		this.dlco_clsf_nm = dlco_clsf_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

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

	public void setMagz_deal_yn(String magz_deal_yn){
		this.magz_deal_yn = magz_deal_yn;
	}

	public void setSep_book_deal_yn(String sep_book_deal_yn){
		this.sep_book_deal_yn = sep_book_deal_yn;
	}

	public void setGurt_amt_tot_amt(String gurt_amt_tot_amt){
		this.gurt_amt_tot_amt = gurt_amt_tot_amt;
	}

	public void setGurt_amt_altn(String gurt_amt_altn){
		this.gurt_amt_altn = gurt_amt_altn;
	}

	public void setGurt_amt(String gurt_amt){
		this.gurt_amt = gurt_amt;
	}

	public String getDlco_clsf_nm(){
		return this.dlco_clsf_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
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

	public String getMagz_deal_yn(){
		return this.magz_deal_yn;
	}

	public String getSep_book_deal_yn(){
		return this.sep_book_deal_yn;
	}

	public String getGurt_amt_tot_amt(){
		return this.gurt_amt_tot_amt;
	}

	public String getGurt_amt_altn(){
		return this.gurt_amt_altn;
	}

	public String getGurt_amt(){
		return this.gurt_amt;
	}
}

/* 작성시간 : Tue Apr 28 14:05:51 KST 2009 */