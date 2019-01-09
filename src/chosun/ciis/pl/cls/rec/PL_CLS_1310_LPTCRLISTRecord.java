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


public class PL_CLS_1310_LPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basi_yymm;
	public String basi_dt;
	public String cyov_bal;
	public String sale_amt;
	public String rcpm_amt;
	public String retn_amt;
	public String meda_amt;
	public String mmbal_amt;
	public String totbal_amt;
	public String clos_yn;
	public String temp_clos_emp_no;
	public String sale_clos_emp_no;
	public String medi_clsf;

	public PL_CLS_1310_LPTCRLISTRecord(){}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setCyov_bal(String cyov_bal){
		this.cyov_bal = cyov_bal;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setRetn_amt(String retn_amt){
		this.retn_amt = retn_amt;
	}

	public void setMeda_amt(String meda_amt){
		this.meda_amt = meda_amt;
	}

	public void setMmbal_amt(String mmbal_amt){
		this.mmbal_amt = mmbal_amt;
	}

	public void setTotbal_amt(String totbal_amt){
		this.totbal_amt = totbal_amt;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
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

	public String getCyov_bal(){
		return this.cyov_bal;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getRetn_amt(){
		return this.retn_amt;
	}

	public String getMeda_amt(){
		return this.meda_amt;
	}

	public String getMmbal_amt(){
		return this.mmbal_amt;
	}

	public String getTotbal_amt(){
		return this.totbal_amt;
	}

	public String getClos_yn(){
		return this.clos_yn;
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

/* 작성시간 : Wed Aug 26 11:14:57 KST 2009 */