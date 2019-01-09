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


public class PL_SAL_1310_LDEAL_PTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deal_dt;
	public String deal_grp_seq;
	public String medi_clsf;
	public String medi_cd;
	public String medi_ser_no;
	public String medi_nm;
	public String basi_yymm;
	public String basi_dt;
	public String clos_yn;
	public String stok_qty;
	public String deal_qty;
	public String deal_amt;

	public PL_SAL_1310_LDEAL_PTCRLISTRecord(){}

	public void setDeal_dt(String deal_dt){
		this.deal_dt = deal_dt;
	}

	public void setDeal_grp_seq(String deal_grp_seq){
		this.deal_grp_seq = deal_grp_seq;
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

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setStok_qty(String stok_qty){
		this.stok_qty = stok_qty;
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

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getStok_qty(){
		return this.stok_qty;
	}

	public String getDeal_qty(){
		return this.deal_qty;
	}

	public String getDeal_amt(){
		return this.deal_amt;
	}
}

/* 작성시간 : Fri Mar 27 17:36:20 KST 2009 */