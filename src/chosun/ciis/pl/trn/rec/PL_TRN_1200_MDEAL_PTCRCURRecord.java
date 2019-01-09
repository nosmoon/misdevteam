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


public class PL_TRN_1200_MDEAL_PTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String deal_dt;
	public String deal_grp_seq;
	public String deal_seq;
	public String medi_cd;
	public String medi_ser_no;
	public String medi_nm;
	public String deal_qty;
	public String deal_uprc;
	public String dcrate;
	public String deal_amt;
	public String wh_cd;
	public String prv_deli_qty;
	public String prv_widr_qty;
	public String prv_retn_qty;
	public String remk;

	public PL_TRN_1200_MDEAL_PTCRCURRecord(){}

	public void setDeal_dt(String deal_dt){
		this.deal_dt = deal_dt;
	}

	public void setDeal_grp_seq(String deal_grp_seq){
		this.deal_grp_seq = deal_grp_seq;
	}

	public void setDeal_seq(String deal_seq){
		this.deal_seq = deal_seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setDeal_qty(String deal_qty){
		this.deal_qty = deal_qty;
	}

	public void setDeal_uprc(String deal_uprc){
		this.deal_uprc = deal_uprc;
	}

	public void setDcrate(String dcrate){
		this.dcrate = dcrate;
	}

	public void setDeal_amt(String deal_amt){
		this.deal_amt = deal_amt;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public void setPrv_deli_qty(String prv_deli_qty){
		this.prv_deli_qty = prv_deli_qty;
	}

	public void setPrv_widr_qty(String prv_widr_qty){
		this.prv_widr_qty = prv_widr_qty;
	}

	public void setPrv_retn_qty(String prv_retn_qty){
		this.prv_retn_qty = prv_retn_qty;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getDeal_dt(){
		return this.deal_dt;
	}

	public String getDeal_grp_seq(){
		return this.deal_grp_seq;
	}

	public String getDeal_seq(){
		return this.deal_seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getDeal_qty(){
		return this.deal_qty;
	}

	public String getDeal_uprc(){
		return this.deal_uprc;
	}

	public String getDcrate(){
		return this.dcrate;
	}

	public String getDeal_amt(){
		return this.deal_amt;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getPrv_deli_qty(){
		return this.prv_deli_qty;
	}

	public String getPrv_widr_qty(){
		return this.prv_widr_qty;
	}

	public String getPrv_retn_qty(){
		return this.prv_retn_qty;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Apr 01 16:59:58 KST 2009 */