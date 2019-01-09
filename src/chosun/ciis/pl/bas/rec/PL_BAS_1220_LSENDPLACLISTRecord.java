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


public class PL_BAS_1220_LSENDPLACLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd;
	public String dlco_seq;
	public String send_plac_seq;
	public String send_plac_nm;
	public String magz_deal_yn;
	public String sep_book_deal_yn;
	public String vexc_dlco_cd;
	public String tel_no;
	public String fax_no;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String remk;

	public PL_BAS_1220_LSENDPLACLISTRecord(){}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setMagz_deal_yn(String magz_deal_yn){
		this.magz_deal_yn = magz_deal_yn;
	}

	public void setSep_book_deal_yn(String sep_book_deal_yn){
		this.sep_book_deal_yn = sep_book_deal_yn;
	}

	public void setVexc_dlco_cd(String vexc_dlco_cd){
		this.vexc_dlco_cd = vexc_dlco_cd;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
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

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getMagz_deal_yn(){
		return this.magz_deal_yn;
	}

	public String getSep_book_deal_yn(){
		return this.sep_book_deal_yn;
	}

	public String getVexc_dlco_cd(){
		return this.vexc_dlco_cd;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
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

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Apr 27 18:18:55 KST 2009 */