/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.lst.rec;

import java.sql.*;
import chosun.ciis.pl.lst.dm.*;
import chosun.ciis.pl.lst.ds.*;

/**
 * 
 */


public class PL_LST_1710_PPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chit_no;
	public String vexc_dlco_cd;
	public String sale_clsf;
	public String issu_clsf;
	public String sendclsf_nm;
	public String sell_type_nm;
	public String wh_cd;
	public String cont;
	public String vexc_medi_ser_no;
	public String deal_uprc;
	public String deal_qty;
	public String dcrate;
	public String deal_amt;
	public String remk;
	public String serial_no;
	public String deal_dt;
	public String deal_grp_seq;
	public String grp_no;

	public PL_LST_1710_PPTCRLISTRecord(){}

	public void setChit_no(String chit_no){
		this.chit_no = chit_no;
	}

	public void setVexc_dlco_cd(String vexc_dlco_cd){
		this.vexc_dlco_cd = vexc_dlco_cd;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setIssu_clsf(String issu_clsf){
		this.issu_clsf = issu_clsf;
	}

	public void setSendclsf_nm(String sendclsf_nm){
		this.sendclsf_nm = sendclsf_nm;
	}

	public void setSell_type_nm(String sell_type_nm){
		this.sell_type_nm = sell_type_nm;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setVexc_medi_ser_no(String vexc_medi_ser_no){
		this.vexc_medi_ser_no = vexc_medi_ser_no;
	}

	public void setDeal_uprc(String deal_uprc){
		this.deal_uprc = deal_uprc;
	}

	public void setDeal_qty(String deal_qty){
		this.deal_qty = deal_qty;
	}

	public void setDcrate(String dcrate){
		this.dcrate = dcrate;
	}

	public void setDeal_amt(String deal_amt){
		this.deal_amt = deal_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSerial_no(String serial_no){
		this.serial_no = serial_no;
	}

	public void setDeal_dt(String deal_dt){
		this.deal_dt = deal_dt;
	}

	public void setDeal_grp_seq(String deal_grp_seq){
		this.deal_grp_seq = deal_grp_seq;
	}
	
	public void setGrp_no(String grp_no){
		this.grp_no = grp_no;
	}

	public String getChit_no(){
		return this.chit_no;
	}

	public String getVexc_dlco_cd(){
		return this.vexc_dlco_cd;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getIssu_clsf(){
		return this.issu_clsf;
	}

	public String getSendclsf_nm(){
		return this.sendclsf_nm;
	}

	public String getSell_type_nm(){
		return this.sell_type_nm;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getCont(){
		return this.cont;
	}

	public String getVexc_medi_ser_no(){
		return this.vexc_medi_ser_no;
	}

	public String getDeal_uprc(){
		return this.deal_uprc;
	}

	public String getDeal_qty(){
		return this.deal_qty;
	}

	public String getDcrate(){
		return this.dcrate;
	}

	public String getDeal_amt(){
		return this.deal_amt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSerial_no(){
		return this.serial_no;
	}

	public String getDeal_dt(){
		return this.deal_dt;
	}

	public String getDeal_grp_seq(){
		return this.deal_grp_seq;
	}
	
	public String getGrp_no(){
		return this.grp_no;
	}
}

/* 작성시간 : Wed Jun 26 18:47:04 KST 2013 */