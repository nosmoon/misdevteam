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


package chosun.ciis.pl.cls.rec;

import java.sql.*;
import chosun.ciis.pl.cls.dm.*;
import chosun.ciis.pl.cls.ds.*;

/**
 * 
 */


public class PL_CLS_2110_LPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basi_yymm;
	public String basi_dt;
	public String slip_no;
	public String deli_qty;
	public String deli_amt;
	public String widr_qty;
	public String widr_amt;
	public String retn_qty;
	public String retn_amt;
	public String sale_qty;
	public String sale_amt;
	public String temp_clos_emp_no;
	public String sale_clos_emp_no;
	public String medi_clsf;

	public PL_CLS_2110_LPTCRLISTRecord(){}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setDeli_qty(String deli_qty){
		this.deli_qty = deli_qty;
	}

	public void setDeli_amt(String deli_amt){
		this.deli_amt = deli_amt;
	}

	public void setWidr_qty(String widr_qty){
		this.widr_qty = widr_qty;
	}

	public void setWidr_amt(String widr_amt){
		this.widr_amt = widr_amt;
	}

	public void setRetn_qty(String retn_qty){
		this.retn_qty = retn_qty;
	}

	public void setRetn_amt(String retn_amt){
		this.retn_amt = retn_amt;
	}

	public void setSale_qty(String sale_qty){
		this.sale_qty = sale_qty;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setTemp_clos_emp_no(String temp_clos_emp_no){
		this.temp_clos_emp_no = temp_clos_emp_no;
	}

	public void setSale_clos_emp_no(String sale_clos_emp_no){
		this.sale_clos_emp_no = sale_clos_emp_no;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getDeli_qty(){
		return this.deli_qty;
	}

	public String getDeli_amt(){
		return this.deli_amt;
	}

	public String getWidr_qty(){
		return this.widr_qty;
	}

	public String getWidr_amt(){
		return this.widr_amt;
	}

	public String getRetn_qty(){
		return this.retn_qty;
	}

	public String getRetn_amt(){
		return this.retn_amt;
	}

	public String getSale_qty(){
		return this.sale_qty;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getTemp_clos_emp_no(){
		return this.temp_clos_emp_no;
	}

	public String getSale_clos_emp_no(){
		return this.sale_clos_emp_no;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}
}

/* 작성시간 : Wed Sep 16 16:46:24 KST 2009 */