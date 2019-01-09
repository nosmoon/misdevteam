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


package chosun.ciis.pl.rtn.rec;

import java.sql.*;
import chosun.ciis.pl.rtn.dm.*;
import chosun.ciis.pl.rtn.ds.*;

/**
 * 
 */


public class PL_RTN_1320_LDEAL_PTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String deal_dt;
	public String deal_grp_seq;
	public String deal_seq;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String send_plac_seq;
	public String send_plac_nm;
	public String deal_qty;
	public String deal_uprc;
	public String dcrate;
	public String deal_amt;
	public String wh_cd;
	public String prv_deli_qty;
	public String prv_widr_qty;
	public String prv_retn_qty;
	public String remk;

	public PL_RTN_1320_LDEAL_PTCRCURRecord(){}

	public void setDeal_dt(String deal_dt){
		this.deal_dt = deal_dt;
	}

	public void setDeal_grp_seq(String deal_grp_seq){
		this.deal_grp_seq = deal_grp_seq;
	}

	public void setDeal_seq(String deal_seq){
		this.deal_seq = deal_seq;
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

/* 작성시간 : Wed Jul 15 14:35:10 KST 2009 */