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


public class PL_SAL_3110_LDEAL_PTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf;
	public String dlco_clsf_nm;
	public String area;
	public String area_nm;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String medi_clsf;
	public String medi_clsf_nm;
	public String medi_cd;
	public String medi_ser_no;
	public String medi_nm;
	public String sendclsf;
	public String sendclsf_nm;
	public String deal_qty;
	public String deal_uprc;
	public String dcrate;
	public String deal_amt;

	public PL_SAL_3110_LDEAL_PTCRCURRecord(){}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_clsf_nm(String dlco_clsf_nm){
		this.dlco_clsf_nm = dlco_clsf_nm;
	}

	public void setArea(String area){
		this.area = area;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
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

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setMedi_clsf_nm(String medi_clsf_nm){
		this.medi_clsf_nm = medi_clsf_nm;
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

	public void setSendclsf(String sendclsf){
		this.sendclsf = sendclsf;
	}

	public void setSendclsf_nm(String sendclsf_nm){
		this.sendclsf_nm = sendclsf_nm;
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

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_clsf_nm(){
		return this.dlco_clsf_nm;
	}

	public String getArea(){
		return this.area;
	}

	public String getArea_nm(){
		return this.area_nm;
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

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getMedi_clsf_nm(){
		return this.medi_clsf_nm;
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

	public String getSendclsf(){
		return this.sendclsf;
	}

	public String getSendclsf_nm(){
		return this.sendclsf_nm;
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
}

/* 작성시간 : Wed Apr 08 18:05:50 KST 2009 */