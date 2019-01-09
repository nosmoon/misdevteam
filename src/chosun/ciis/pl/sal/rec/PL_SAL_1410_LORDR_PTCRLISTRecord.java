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


package chosun.ciis.pl.sal.rec;

import java.sql.*;
import chosun.ciis.pl.sal.dm.*;
import chosun.ciis.pl.sal.ds.*;

/**
 * 
 */


public class PL_SAL_1410_LORDR_PTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ordr_dt;
	public String ordr_grp_seq;
	public String basi_dt;
	public String send_plac_nm;
	public String owh_yn;
	public String rcpm_amt;
	public String medi_clsf;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String phone_no;
	public String send_plac_addr;
	public String clos_yn;
	public String deal_qty;
	public String deal_amt;

	public PL_SAL_1410_LORDR_PTCRLISTRecord(){}

	public void setOrdr_dt(String ordr_dt){
		this.ordr_dt = ordr_dt;
	}

	public void setOrdr_grp_seq(String ordr_grp_seq){
		this.ordr_grp_seq = ordr_grp_seq;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setOwh_yn(String owh_yn){
		this.owh_yn = owh_yn;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
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

	public void setPhone_no(String phone_no){
		this.phone_no = phone_no;
	}

	public void setSend_plac_addr(String send_plac_addr){
		this.send_plac_addr = send_plac_addr;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setDeal_qty(String deal_qty){
		this.deal_qty = deal_qty;
	}

	public void setDeal_amt(String deal_amt){
		this.deal_amt = deal_amt;
	}

	public String getOrdr_dt(){
		return this.ordr_dt;
	}

	public String getOrdr_grp_seq(){
		return this.ordr_grp_seq;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getOwh_yn(){
		return this.owh_yn;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
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

	public String getPhone_no(){
		return this.phone_no;
	}

	public String getSend_plac_addr(){
		return this.send_plac_addr;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getDeal_qty(){
		return this.deal_qty;
	}

	public String getDeal_amt(){
		return this.deal_amt;
	}
}

/* 작성시간 : Thu Apr 02 20:36:33 KST 2009 */