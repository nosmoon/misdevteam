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


public class PL_CLS_1110_LPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basi_dt;
	public String medi_clsf;
	public String deli_qty;
	public String deli_amt;
	public String retn_qty;
	public String retn_amt;
	public String sale_qty;
	public String sale_amt;
	public String clos_yn;
	public String clos_pers_emp_no;

	public PL_CLS_1110_LPTCRLISTRecord(){}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setDeli_qty(String deli_qty){
		this.deli_qty = deli_qty;
	}

	public void setDeli_amt(String deli_amt){
		this.deli_amt = deli_amt;
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

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setClos_pers_emp_no(String clos_pers_emp_no){
		this.clos_pers_emp_no = clos_pers_emp_no;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getDeli_qty(){
		return this.deli_qty;
	}

	public String getDeli_amt(){
		return this.deli_amt;
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

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_pers_emp_no(){
		return this.clos_pers_emp_no;
	}
}

/* 작성시간 : Mon May 11 20:35:50 KST 2009 */