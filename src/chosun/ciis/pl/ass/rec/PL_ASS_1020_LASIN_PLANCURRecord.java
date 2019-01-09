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


package chosun.ciis.pl.ass.rec;

import java.sql.*;
import chosun.ciis.pl.ass.dm.*;
import chosun.ciis.pl.ass.ds.*;

/**
 * 
 */


public class PL_ASS_1020_LASIN_PLANCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf;
	public String dlco_clsf_nm;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String send_plac_seq;
	public String send_plac_nm;
	public String sale_clsf;
	public String sendclsf;
	public String wh_cd;
	public String sell_type;
	public String dcrate;
	public String asin_qty;
	public String appndx_1;
	public String appndx_2;
	public String appndx_3;
	public String bef_ser_no_asin_qty;
	public String ref_deli_qty_1;
	public String ref_sell_qty_1;
	public String ref_deli_qty_2;
	public String ref_sell_qty_2;
	public String calc_qty;
	public String avg_sell_qty;
	public String ocpy_rate;
	public String tot_deli_qty;
	public String avg_deli_qty;
	public String tot_sell_qty;
	public String tot_rtgqty;
	public String remk;

	public PL_ASS_1020_LASIN_PLANCURRecord(){}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_clsf_nm(String dlco_clsf_nm){
		this.dlco_clsf_nm = dlco_clsf_nm;
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

	public void setDcrate(String dcrate){
		this.dcrate = dcrate;
	}

	public void setAsin_qty(String asin_qty){
		this.asin_qty = asin_qty;
	}

	public void setAppndx_1(String appndx_1){
		this.appndx_1 = appndx_1;
	}

	public void setAppndx_2(String appndx_2){
		this.appndx_2 = appndx_2;
	}

	public void setAppndx_3(String appndx_3){
		this.appndx_3 = appndx_3;
	}

	public void setBef_ser_no_asin_qty(String bef_ser_no_asin_qty){
		this.bef_ser_no_asin_qty = bef_ser_no_asin_qty;
	}

	public void setRef_deli_qty_1(String ref_deli_qty_1){
		this.ref_deli_qty_1 = ref_deli_qty_1;
	}

	public void setRef_sell_qty_1(String ref_sell_qty_1){
		this.ref_sell_qty_1 = ref_sell_qty_1;
	}

	public void setRef_deli_qty_2(String ref_deli_qty_2){
		this.ref_deli_qty_2 = ref_deli_qty_2;
	}

	public void setRef_sell_qty_2(String ref_sell_qty_2){
		this.ref_sell_qty_2 = ref_sell_qty_2;
	}

	public void setCalc_qty(String calc_qty){
		this.calc_qty = calc_qty;
	}

	public void setAvg_sell_qty(String avg_sell_qty){
		this.avg_sell_qty = avg_sell_qty;
	}

	public void setOcpy_rate(String ocpy_rate){
		this.ocpy_rate = ocpy_rate;
	}

	public void setTot_deli_qty(String tot_deli_qty){
		this.tot_deli_qty = tot_deli_qty;
	}

	public void setAvg_deli_qty(String avg_deli_qty){
		this.avg_deli_qty = avg_deli_qty;
	}

	public void setTot_sell_qty(String tot_sell_qty){
		this.tot_sell_qty = tot_sell_qty;
	}

	public void setTot_rtgqty(String tot_rtgqty){
		this.tot_rtgqty = tot_rtgqty;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_clsf_nm(){
		return this.dlco_clsf_nm;
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

	public String getDcrate(){
		return this.dcrate;
	}

	public String getAsin_qty(){
		return this.asin_qty;
	}

	public String getAppndx_1(){
		return this.appndx_1;
	}

	public String getAppndx_2(){
		return this.appndx_2;
	}

	public String getAppndx_3(){
		return this.appndx_3;
	}

	public String getBef_ser_no_asin_qty(){
		return this.bef_ser_no_asin_qty;
	}

	public String getRef_deli_qty_1(){
		return this.ref_deli_qty_1;
	}

	public String getRef_sell_qty_1(){
		return this.ref_sell_qty_1;
	}

	public String getRef_deli_qty_2(){
		return this.ref_deli_qty_2;
	}

	public String getRef_sell_qty_2(){
		return this.ref_sell_qty_2;
	}

	public String getCalc_qty(){
		return this.calc_qty;
	}

	public String getAvg_sell_qty(){
		return this.avg_sell_qty;
	}

	public String getOcpy_rate(){
		return this.ocpy_rate;
	}

	public String getTot_deli_qty(){
		return this.tot_deli_qty;
	}

	public String getAvg_deli_qty(){
		return this.avg_deli_qty;
	}

	public String getTot_sell_qty(){
		return this.tot_sell_qty;
	}

	public String getTot_rtgqty(){
		return this.tot_rtgqty;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Mar 16 20:13:03 KST 2009 */