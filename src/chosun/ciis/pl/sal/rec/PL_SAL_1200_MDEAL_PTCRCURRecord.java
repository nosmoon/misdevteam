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


public class PL_SAL_1200_MDEAL_PTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String deal_dt;
	public String deal_grp_seq;
	public String deal_seq;
	public String medi_clsf;
	public String medi_cd;
	public String medi_ser_no;
	public String medi_nm;
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

	public PL_SAL_1200_MDEAL_PTCRCURRecord(){}

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

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
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

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getMedi_nm(){
		return this.medi_nm;
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

/* 작성시간 : Tue Mar 24 18:16:37 KST 2009 */