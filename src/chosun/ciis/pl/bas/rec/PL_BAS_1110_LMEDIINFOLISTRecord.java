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


public class PL_BAS_1110_LMEDIINFOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_cdnm;
	public String medi_ser_no;
	public String medi_nm;
	public String issu_cmpy;
	public String issu_cmpynm;
	public String medi_clsf;
	public String medi_clsfnm;
	public String basi_yymm;
	public String reg_dt;
	public String uprc;
	public String tot_ewh_qty;
	public String deal_qty;
	public String widr_qty;
	public String retn_qty;
	public String sale_qty;
	public String stok_qty;

	public PL_BAS_1110_LMEDIINFOLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_cdnm(String medi_cdnm){
		this.medi_cdnm = medi_cdnm;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setIssu_cmpy(String issu_cmpy){
		this.issu_cmpy = issu_cmpy;
	}

	public void setIssu_cmpynm(String issu_cmpynm){
		this.issu_cmpynm = issu_cmpynm;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setMedi_clsfnm(String medi_clsfnm){
		this.medi_clsfnm = medi_clsfnm;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setTot_ewh_qty(String tot_ewh_qty){
		this.tot_ewh_qty = tot_ewh_qty;
	}

	public void setDeal_qty(String deal_qty){
		this.deal_qty = deal_qty;
	}

	public void setWidr_qty(String widr_qty){
		this.widr_qty = widr_qty;
	}

	public void setRetn_qty(String retn_qty){
		this.retn_qty = retn_qty;
	}

	public void setSale_qty(String sale_qty){
		this.sale_qty = sale_qty;
	}

	public void setStok_qty(String stok_qty){
		this.stok_qty = stok_qty;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_cdnm(){
		return this.medi_cdnm;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getIssu_cmpy(){
		return this.issu_cmpy;
	}

	public String getIssu_cmpynm(){
		return this.issu_cmpynm;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getMedi_clsfnm(){
		return this.medi_clsfnm;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getTot_ewh_qty(){
		return this.tot_ewh_qty;
	}

	public String getDeal_qty(){
		return this.deal_qty;
	}

	public String getWidr_qty(){
		return this.widr_qty;
	}

	public String getRetn_qty(){
		return this.retn_qty;
	}

	public String getSale_qty(){
		return this.sale_qty;
	}

	public String getStok_qty(){
		return this.stok_qty;
	}
}

/* 작성시간 : Mon Mar 16 21:48:55 KST 2009 */