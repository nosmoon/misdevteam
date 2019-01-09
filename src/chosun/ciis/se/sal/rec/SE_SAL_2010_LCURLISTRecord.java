/***************************************************************************************************
* 파일명 : SE_SAL_2010_LCURLISTRecord.java
* 기능 : 판매 - 지대관리 - 매출관리 - 지국매출단가변경
* 작성일자 : 2009-04-08
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_2010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm				;
	public String net_sale_amt		;
	public String val_qty			;
	public String icdc_calc_qty		;
	public String spsl_qty			;
	public String stetsell_qty		;
	public String basi_uprc			;
	public String rdff_rdu_uprc		;
	public String cntr_uprc			;
	public String fpymt_encur_amt	;
	public String sale_amt			;
	public String sply_amt			;

	public SE_SAL_2010_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}

	public void setVal_qty(String val_qty){
		this.val_qty = val_qty;
	}

	public void setIcdc_calc_qty(String icdc_calc_qty){
		this.icdc_calc_qty = icdc_calc_qty;
	}

	public void setSpsl_qty(String spsl_qty){
		this.spsl_qty = spsl_qty;
	}

	public void setStetsell_qty(String stetsell_qty){
		this.stetsell_qty = stetsell_qty;
	}

	public void setBasi_uprc(String basi_uprc){
		this.basi_uprc = basi_uprc;
	}

	public void setRdff_rdu_uprc(String rdff_rdu_uprc){
		this.rdff_rdu_uprc = rdff_rdu_uprc;
	}

	public void setCntr_uprc(String cntr_uprc){
		this.cntr_uprc = cntr_uprc;
	}

	public void setFpymt_encur_amt(String fpymt_encur_amt){
		this.fpymt_encur_amt = fpymt_encur_amt;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setSply_amt(String sply_amt){
		this.sply_amt = sply_amt;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}

	public String getVal_qty(){
		return this.val_qty;
	}

	public String getIcdc_calc_qty(){
		return this.icdc_calc_qty;
	}

	public String getSpsl_qty(){
		return this.spsl_qty;
	}

	public String getStetsell_qty(){
		return this.stetsell_qty;
	}

	public String getBasi_uprc(){
		return this.basi_uprc;
	}

	public String getRdff_rdu_uprc(){
		return this.rdff_rdu_uprc;
	}

	public String getCntr_uprc(){
		return this.cntr_uprc;
	}

	public String getFpymt_encur_amt(){
		return this.fpymt_encur_amt;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getSply_amt(){
		return this.sply_amt;
	}
}

/* 작성시간 : Wed Apr 08 17:31:22 KST 2009 */