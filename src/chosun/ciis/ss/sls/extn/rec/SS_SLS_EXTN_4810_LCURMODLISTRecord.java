/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_SLS_EXTN_4810_LCURMODLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String valmm;
	public String area;
	public String bocd;
	public String bonm;
	public String cnfm_qty;
	public String cnfm_amt;
	public String nocnfm_qty;
	public String nocnfm_amt;
	public String meda_amt;
	public String set_amt;
	public String pay_amt;
	public String nopay_amt;
	public String err_qty;

	public SS_SLS_EXTN_4810_LCURMODLISTRecord(){}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setArea(String area){
		this.area = area;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setCnfm_qty(String cnfm_qty){
		this.cnfm_qty = cnfm_qty;
	}

	public void setCnfm_amt(String cnfm_amt){
		this.cnfm_amt = cnfm_amt;
	}

	public void setNocnfm_qty(String nocnfm_qty){
		this.nocnfm_qty = nocnfm_qty;
	}

	public void setNocnfm_amt(String nocnfm_amt){
		this.nocnfm_amt = nocnfm_amt;
	}

	public void setMeda_amt(String meda_amt){
		this.meda_amt = meda_amt;
	}

	public void setSet_amt(String set_amt){
		this.set_amt = set_amt;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setNopay_amt(String nopay_amt){
		this.nopay_amt = nopay_amt;
	}

	public void setErr_qty(String err_qty){
		this.err_qty = err_qty;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getArea(){
		return this.area;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getCnfm_qty(){
		return this.cnfm_qty;
	}

	public String getCnfm_amt(){
		return this.cnfm_amt;
	}

	public String getNocnfm_qty(){
		return this.nocnfm_qty;
	}

	public String getNocnfm_amt(){
		return this.nocnfm_amt;
	}

	public String getMeda_amt(){
		return this.meda_amt;
	}

	public String getSet_amt(){
		return this.set_amt;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getNopay_amt(){
		return this.nopay_amt;
	}

	public String getErr_qty(){
		return this.err_qty;
	}
}

/* 작성시간 : Thu Jul 21 17:40:58 KST 2016 */