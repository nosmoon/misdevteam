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


public class PL_SAL_1020_LDELI_PTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_ser_no;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String send_plac_seq;
	public String send_plac_nm;
	public String dlco_clsf;
	public String dlco_clsf_nm;
	public String sale_clsf;
	public String sale_clsf_nm;
	public String sendclsf;
	public String sendclsf_nm;
	public String sell_type;
	public String sell_type_nm;
	public String wh_cd;
	public String wh_cd_nm;
	public String deal_uprc;
	public String dcrate;
	public String deal_qty;
	public String deal_amt;
	public String deal_dt;
	public String deal_grp_seq;
	public String deal_seq;
	public String remk;

	public PL_SAL_1020_LDELI_PTCRCURRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
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

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_clsf_nm(String dlco_clsf_nm){
		this.dlco_clsf_nm = dlco_clsf_nm;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setSale_clsf_nm(String sale_clsf_nm){
		this.sale_clsf_nm = sale_clsf_nm;
	}

	public void setSendclsf(String sendclsf){
		this.sendclsf = sendclsf;
	}

	public void setSendclsf_nm(String sendclsf_nm){
		this.sendclsf_nm = sendclsf_nm;
	}

	public void setSell_type(String sell_type){
		this.sell_type = sell_type;
	}

	public void setSell_type_nm(String sell_type_nm){
		this.sell_type_nm = sell_type_nm;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public void setWh_cd_nm(String wh_cd_nm){
		this.wh_cd_nm = wh_cd_nm;
	}

	public void setDeal_uprc(String deal_uprc){
		this.deal_uprc = deal_uprc;
	}

	public void setDcrate(String dcrate){
		this.dcrate = dcrate;
	}

	public void setDeal_qty(String deal_qty){
		this.deal_qty = deal_qty;
	}

	public void setDeal_amt(String deal_amt){
		this.deal_amt = deal_amt;
	}

	public void setDeal_dt(String deal_dt){
		this.deal_dt = deal_dt;
	}

	public void setDeal_grp_seq(String deal_grp_seq){
		this.deal_grp_seq = deal_grp_seq;
	}

	public void setDeal_seq(String deal_seq){
		this.deal_seq = deal_seq;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
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

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_clsf_nm(){
		return this.dlco_clsf_nm;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getSale_clsf_nm(){
		return this.sale_clsf_nm;
	}

	public String getSendclsf(){
		return this.sendclsf;
	}

	public String getSendclsf_nm(){
		return this.sendclsf_nm;
	}

	public String getSell_type(){
		return this.sell_type;
	}

	public String getSell_type_nm(){
		return this.sell_type_nm;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getWh_cd_nm(){
		return this.wh_cd_nm;
	}

	public String getDeal_uprc(){
		return this.deal_uprc;
	}

	public String getDcrate(){
		return this.dcrate;
	}

	public String getDeal_qty(){
		return this.deal_qty;
	}

	public String getDeal_amt(){
		return this.deal_amt;
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

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Mar 18 21:28:32 KST 2009 */