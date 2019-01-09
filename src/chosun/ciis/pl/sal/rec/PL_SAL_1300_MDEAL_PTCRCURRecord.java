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


public class PL_SAL_1300_MDEAL_PTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String deal_dt;
	public String deal_grp_seq;
	public String deal_seq;
	public String medi_clsf;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String send_plac_seq;
	public String send_plac_nm;
	public String stok_qty;
	public String deal_qty;
	public String deal_uprc;
	public String dcrate;
	public String deal_amt;
	public String sale_clsf;
	public String sendclsf;
	public String wh_cd;
	public String sell_type;
	public String remk;

	public PL_SAL_1300_MDEAL_PTCRCURRecord(){}

	public void setDeal_dt(String deal_dt){
		this.deal_dt = deal_dt;
	}

	public void setDeal_grp_seq(String deal_grp_seq){
		this.deal_grp_seq = deal_grp_seq;
	}

	public void setDeal_seq(String deal_seq){
		this.deal_seq = deal_seq;
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

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setStok_qty(String stok_qty){
		this.stok_qty = stok_qty;
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

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setSendclsf(String sendclsf){
		this.sendclsf = sendclsf;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public void setSell_type(String sell_type){
		this.sell_type = sell_type;
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

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getStok_qty(){
		return this.stok_qty;
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

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getSendclsf(){
		return this.sendclsf;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getSell_type(){
		return this.sell_type;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri Mar 27 20:07:09 KST 2009 */