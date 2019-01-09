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


package chosun.ciis.pl.trn.rec;

import java.sql.*;
import chosun.ciis.pl.trn.dm.*;
import chosun.ciis.pl.trn.ds.*;

/**
 * 
 */


public class PL_TRN_1210_LDEAL_PTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deal_dt;
	public String deal_grp_seq;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String send_plac_seq;
	public String send_plac_nm;
	public String basi_yymm;
	public String basi_dt;
	public String clos_yn;
	public String deal_qty;
	public String deal_amt;

	public PL_TRN_1210_LDEAL_PTCRLISTRecord(){}

	public void setDeal_dt(String deal_dt){
		this.deal_dt = deal_dt;
	}

	public void setDeal_grp_seq(String deal_grp_seq){
		this.deal_grp_seq = deal_grp_seq;
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

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
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

	public String getDeal_dt(){
		return this.deal_dt;
	}

	public String getDeal_grp_seq(){
		return this.deal_grp_seq;
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

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getBasi_dt(){
		return this.basi_dt;
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

/* 작성시간 : Wed Jul 15 14:35:10 KST 2009 */