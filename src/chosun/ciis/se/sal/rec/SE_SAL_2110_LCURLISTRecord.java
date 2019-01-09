/***************************************************************************************************
* 파일명 : SE_SAL_2110_LCURLISTRecord.java
* 기능 : 판매 - 지대관리 - 매출관리 - 순매출액산출현황
* 작성일자 : 2009-04-07
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


public class SE_SAL_2110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd			;
	public String dept_nm			;
	public String sub_dept_cd		;
	public String sub_dept_nm		;
	public String area_cd			;
	public String area_nm			;
	public String bo_cd				;
	public String bo_nm				;
	public String net_sale_amt		;
	public String val_qty			;
	public String icdc_calc_qty		;
	public String spsl_qty			;
	public String cntr_qty			;
	public String basi_uprc			;
	public String rdff_rdu_uprc		;
	public String cntr_uprc			;
	public String sale_amt			;
	public String fpymt_encur_amt	;

	public SE_SAL_2110_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setSub_dept_nm(String sub_dept_nm){
		this.sub_dept_nm = sub_dept_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
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

	public void setCntr_qty(String cntr_qty){
		this.cntr_qty = cntr_qty;
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

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setFpymt_encur_amt(String fpymt_encur_amt){
		this.fpymt_encur_amt = fpymt_encur_amt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getSub_dept_nm(){
		return this.sub_dept_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_nm(){
		return this.bo_nm;
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

	public String getCntr_qty(){
		return this.cntr_qty;
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

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getFpymt_encur_amt(){
		return this.fpymt_encur_amt;
	}
}

/* 작성시간 : Tue Apr 07 13:14:21 KST 2009 */