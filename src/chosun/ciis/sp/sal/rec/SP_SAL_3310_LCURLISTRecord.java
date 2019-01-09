/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_3310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String suply_pers_nm;
	public String doco_no;
	public String dlco_nm;
	public String bo_head_nm;
	public String sp_comp_chrg_pers_emp_nm;
	public String gds_nm;
	public String ordr_dt;
	public String qunt;
	public String buy_unit_price;
	public String buy_amt;
	public String buy_vat_amt;
	public String btot_amt;
	public String sale_unit_price;
	public String sale_amt;
	public String sale_vat_amt;
	public String stot_amt;
	public String profit_amt;
	public String profit_rate;
	public String clamt;
	public String mi_amt;
	public String chrg_pers;

	public SP_SAL_3310_LCURLISTRecord(){}

	public void setSuply_pers_nm(String suply_pers_nm){
		this.suply_pers_nm = suply_pers_nm;
	}

	public void setDoco_no(String doco_no){
		this.doco_no = doco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setSp_comp_chrg_pers_emp_nm(String sp_comp_chrg_pers_emp_nm){
		this.sp_comp_chrg_pers_emp_nm = sp_comp_chrg_pers_emp_nm;
	}

	public void setGds_nm(String gds_nm){
		this.gds_nm = gds_nm;
	}

	public void setOrdr_dt(String ordr_dt){
		this.ordr_dt = ordr_dt;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setBuy_unit_price(String buy_unit_price){
		this.buy_unit_price = buy_unit_price;
	}

	public void setBuy_amt(String buy_amt){
		this.buy_amt = buy_amt;
	}

	public void setBuy_vat_amt(String buy_vat_amt){
		this.buy_vat_amt = buy_vat_amt;
	}

	public void setBtot_amt(String btot_amt){
		this.btot_amt = btot_amt;
	}

	public void setSale_unit_price(String sale_unit_price){
		this.sale_unit_price = sale_unit_price;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setSale_vat_amt(String sale_vat_amt){
		this.sale_vat_amt = sale_vat_amt;
	}

	public void setStot_amt(String stot_amt){
		this.stot_amt = stot_amt;
	}

	public void setProfit_amt(String profit_amt){
		this.profit_amt = profit_amt;
	}

	public void setProfit_rate(String profit_rate){
		this.profit_rate = profit_rate;
	}

	public void setClamt(String clamt){
		this.clamt = clamt;
	}

	public void setMi_amt(String mi_amt){
		this.mi_amt = mi_amt;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public String getSuply_pers_nm(){
		return this.suply_pers_nm;
	}

	public String getDoco_no(){
		return this.doco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getSp_comp_chrg_pers_emp_nm(){
		return this.sp_comp_chrg_pers_emp_nm;
	}

	public String getGds_nm(){
		return this.gds_nm;
	}

	public String getOrdr_dt(){
		return this.ordr_dt;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getBuy_unit_price(){
		return this.buy_unit_price;
	}

	public String getBuy_amt(){
		return this.buy_amt;
	}

	public String getBuy_vat_amt(){
		return this.buy_vat_amt;
	}

	public String getBtot_amt(){
		return this.btot_amt;
	}

	public String getSale_unit_price(){
		return this.sale_unit_price;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getSale_vat_amt(){
		return this.sale_vat_amt;
	}

	public String getStot_amt(){
		return this.stot_amt;
	}

	public String getProfit_amt(){
		return this.profit_amt;
	}

	public String getProfit_rate(){
		return this.profit_rate;
	}

	public String getClamt(){
		return this.clamt;
	}

	public String getMi_amt(){
		return this.mi_amt;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}
}

/* 작성시간 : Sun Jul 22 14:42:25 KST 2012 */