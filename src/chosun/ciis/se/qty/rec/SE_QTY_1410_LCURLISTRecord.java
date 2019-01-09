/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_1410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String tms;
	public int curmm_val_qty;
	public int curmm_no_val_qty;
	public int curmm_issu_qty;
	public int gnr_enty_qty;
	public int isenty_qty;
	public int isicdc_qty;
	public int rdr_extn_enty_qty;
	public int val_movm_qty;
	public int val_icdc_qty;

	public SE_QTY_1410_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setCurmm_val_qty(int curmm_val_qty){
		this.curmm_val_qty = curmm_val_qty;
	}

	public void setCurmm_no_val_qty(int curmm_no_val_qty){
		this.curmm_no_val_qty = curmm_no_val_qty;
	}

	public void setCurmm_issu_qty(int curmm_issu_qty){
		this.curmm_issu_qty = curmm_issu_qty;
	}

	public void setGnr_enty_qty(int gnr_enty_qty){
		this.gnr_enty_qty = gnr_enty_qty;
	}

	public void setIsenty_qty(int isenty_qty){
		this.isenty_qty = isenty_qty;
	}

	public void setIsicdc_qty(int isicdc_qty){
		this.isicdc_qty = isicdc_qty;
	}

	public void setRdr_extn_enty_qty(int rdr_extn_enty_qty){
		this.rdr_extn_enty_qty = rdr_extn_enty_qty;
	}

	public void setVal_movm_qty(int val_movm_qty){
		this.val_movm_qty = val_movm_qty;
	}

	public void setVal_icdc_qty(int val_icdc_qty){
		this.val_icdc_qty = val_icdc_qty;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getTms(){
		return this.tms;
	}

	public int getCurmm_val_qty(){
		return this.curmm_val_qty;
	}

	public int getCurmm_no_val_qty(){
		return this.curmm_no_val_qty;
	}

	public int getCurmm_issu_qty(){
		return this.curmm_issu_qty;
	}

	public int getGnr_enty_qty(){
		return this.gnr_enty_qty;
	}

	public int getIsenty_qty(){
		return this.isenty_qty;
	}

	public int getIsicdc_qty(){
		return this.isicdc_qty;
	}

	public int getRdr_extn_enty_qty(){
		return this.rdr_extn_enty_qty;
	}

	public int getVal_movm_qty(){
		return this.val_movm_qty;
	}

	public int getVal_icdc_qty(){
		return this.val_icdc_qty;
	}
}

/* 작성시간 : Thu Feb 19 19:55:06 KST 2009 */