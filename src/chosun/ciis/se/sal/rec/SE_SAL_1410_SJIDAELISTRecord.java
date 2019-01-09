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


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_1410_SJIDAELISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String bo_cd;
	public String bo_seq;
	public String yymm;
	public String area_cd;
	public String val_qty_110;
	public String icdc_calc_qty_110;
	public String spsl_qty_110;
	public String cntr_qty_110;
	public String basi_uprc_110;
	public String rdff_rdu_uprc_110;
	public String cntr_uprc_110;
	public String dnt_qty_110;
	public String regu_subs_uprc_110;
	public String dnt_amt_110;
	public String stetsell_qty_110;
	public String stetsell_uprc_110;
	public String stetsell_amt_110;
	public String incmp_sale_qty_110;
	public String incmp_sale_amt_110;
	public String prvmm_val_qty_110;
	public String fpymt_encur_amt_110;
	public String smt_amt_110;
	public String sale_amt_110;
	public String dscn_amt_110;
	public String net_sale_amt_110;
	public String net_sale_amt_all;
	public String val_qty_130;
	public String icdc_calc_qty_130;
	public String spsl_qty_130;
	public String cntr_qty_130;
	public String basi_uprc_130;
	public String rdff_rdu_uprc_130;
	public String cntr_uprc_130;
	public String dnt_qty_130;
	public String regu_subs_uprc_130;
	public String dnt_amt_130;
	public String stetsell_qty_130;
	public String stetsell_uprc_130;
	public String stetsell_amt_130;
	public String incmp_sale_qty_130;
	public String incmp_sale_amt_130;
	public String prvmm_val_qty_130;
	public String fpymt_encur_amt_130;
	public String smt_amt_130;
	public String sale_amt_130;
	public String dscn_amt_130;
	public String net_sale_amt_130;

	public SE_SAL_1410_SJIDAELISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setVal_qty_110(String val_qty_110){
		this.val_qty_110 = val_qty_110;
	}

	public void setIcdc_calc_qty_110(String icdc_calc_qty_110){
		this.icdc_calc_qty_110 = icdc_calc_qty_110;
	}

	public void setSpsl_qty_110(String spsl_qty_110){
		this.spsl_qty_110 = spsl_qty_110;
	}

	public void setCntr_qty_110(String cntr_qty_110){
		this.cntr_qty_110 = cntr_qty_110;
	}

	public void setBasi_uprc_110(String basi_uprc_110){
		this.basi_uprc_110 = basi_uprc_110;
	}

	public void setRdff_rdu_uprc_110(String rdff_rdu_uprc_110){
		this.rdff_rdu_uprc_110 = rdff_rdu_uprc_110;
	}

	public void setCntr_uprc_110(String cntr_uprc_110){
		this.cntr_uprc_110 = cntr_uprc_110;
	}

	public void setDnt_qty_110(String dnt_qty_110){
		this.dnt_qty_110 = dnt_qty_110;
	}

	public void setRegu_subs_uprc_110(String regu_subs_uprc_110){
		this.regu_subs_uprc_110 = regu_subs_uprc_110;
	}

	public void setDnt_amt_110(String dnt_amt_110){
		this.dnt_amt_110 = dnt_amt_110;
	}

	public void setStetsell_qty_110(String stetsell_qty_110){
		this.stetsell_qty_110 = stetsell_qty_110;
	}

	public void setStetsell_uprc_110(String stetsell_uprc_110){
		this.stetsell_uprc_110 = stetsell_uprc_110;
	}

	public void setStetsell_amt_110(String stetsell_amt_110){
		this.stetsell_amt_110 = stetsell_amt_110;
	}

	public void setIncmp_sale_qty_110(String incmp_sale_qty_110){
		this.incmp_sale_qty_110 = incmp_sale_qty_110;
	}

	public void setIncmp_sale_amt_110(String incmp_sale_amt_110){
		this.incmp_sale_amt_110 = incmp_sale_amt_110;
	}

	public void setPrvmm_val_qty_110(String prvmm_val_qty_110){
		this.prvmm_val_qty_110 = prvmm_val_qty_110;
	}

	public void setFpymt_encur_amt_110(String fpymt_encur_amt_110){
		this.fpymt_encur_amt_110 = fpymt_encur_amt_110;
	}

	public void setSmt_amt_110(String smt_amt_110){
		this.smt_amt_110 = smt_amt_110;
	}

	public void setSale_amt_110(String sale_amt_110){
		this.sale_amt_110 = sale_amt_110;
	}

	public void setDscn_amt_110(String dscn_amt_110){
		this.dscn_amt_110 = dscn_amt_110;
	}

	public void setNet_sale_amt_110(String net_sale_amt_110){
		this.net_sale_amt_110 = net_sale_amt_110;
	}

	public void setNet_sale_amt_all(String net_sale_amt_all){
		this.net_sale_amt_all = net_sale_amt_all;
	}

	public void setVal_qty_130(String val_qty_130){
		this.val_qty_130 = val_qty_130;
	}

	public void setIcdc_calc_qty_130(String icdc_calc_qty_130){
		this.icdc_calc_qty_130 = icdc_calc_qty_130;
	}

	public void setSpsl_qty_130(String spsl_qty_130){
		this.spsl_qty_130 = spsl_qty_130;
	}

	public void setCntr_qty_130(String cntr_qty_130){
		this.cntr_qty_130 = cntr_qty_130;
	}

	public void setBasi_uprc_130(String basi_uprc_130){
		this.basi_uprc_130 = basi_uprc_130;
	}

	public void setRdff_rdu_uprc_130(String rdff_rdu_uprc_130){
		this.rdff_rdu_uprc_130 = rdff_rdu_uprc_130;
	}

	public void setCntr_uprc_130(String cntr_uprc_130){
		this.cntr_uprc_130 = cntr_uprc_130;
	}

	public void setDnt_qty_130(String dnt_qty_130){
		this.dnt_qty_130 = dnt_qty_130;
	}

	public void setRegu_subs_uprc_130(String regu_subs_uprc_130){
		this.regu_subs_uprc_130 = regu_subs_uprc_130;
	}

	public void setDnt_amt_130(String dnt_amt_130){
		this.dnt_amt_130 = dnt_amt_130;
	}

	public void setStetsell_qty_130(String stetsell_qty_130){
		this.stetsell_qty_130 = stetsell_qty_130;
	}

	public void setStetsell_uprc_130(String stetsell_uprc_130){
		this.stetsell_uprc_130 = stetsell_uprc_130;
	}

	public void setStetsell_amt_130(String stetsell_amt_130){
		this.stetsell_amt_130 = stetsell_amt_130;
	}

	public void setIncmp_sale_qty_130(String incmp_sale_qty_130){
		this.incmp_sale_qty_130 = incmp_sale_qty_130;
	}

	public void setIncmp_sale_amt_130(String incmp_sale_amt_130){
		this.incmp_sale_amt_130 = incmp_sale_amt_130;
	}

	public void setPrvmm_val_qty_130(String prvmm_val_qty_130){
		this.prvmm_val_qty_130 = prvmm_val_qty_130;
	}

	public void setFpymt_encur_amt_130(String fpymt_encur_amt_130){
		this.fpymt_encur_amt_130 = fpymt_encur_amt_130;
	}

	public void setSmt_amt_130(String smt_amt_130){
		this.smt_amt_130 = smt_amt_130;
	}

	public void setSale_amt_130(String sale_amt_130){
		this.sale_amt_130 = sale_amt_130;
	}

	public void setDscn_amt_130(String dscn_amt_130){
		this.dscn_amt_130 = dscn_amt_130;
	}

	public void setNet_sale_amt_130(String net_sale_amt_130){
		this.net_sale_amt_130 = net_sale_amt_130;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getVal_qty_110(){
		return this.val_qty_110;
	}

	public String getIcdc_calc_qty_110(){
		return this.icdc_calc_qty_110;
	}

	public String getSpsl_qty_110(){
		return this.spsl_qty_110;
	}

	public String getCntr_qty_110(){
		return this.cntr_qty_110;
	}

	public String getBasi_uprc_110(){
		return this.basi_uprc_110;
	}

	public String getRdff_rdu_uprc_110(){
		return this.rdff_rdu_uprc_110;
	}

	public String getCntr_uprc_110(){
		return this.cntr_uprc_110;
	}

	public String getDnt_qty_110(){
		return this.dnt_qty_110;
	}

	public String getRegu_subs_uprc_110(){
		return this.regu_subs_uprc_110;
	}

	public String getDnt_amt_110(){
		return this.dnt_amt_110;
	}

	public String getStetsell_qty_110(){
		return this.stetsell_qty_110;
	}

	public String getStetsell_uprc_110(){
		return this.stetsell_uprc_110;
	}

	public String getStetsell_amt_110(){
		return this.stetsell_amt_110;
	}

	public String getIncmp_sale_qty_110(){
		return this.incmp_sale_qty_110;
	}

	public String getIncmp_sale_amt_110(){
		return this.incmp_sale_amt_110;
	}

	public String getPrvmm_val_qty_110(){
		return this.prvmm_val_qty_110;
	}

	public String getFpymt_encur_amt_110(){
		return this.fpymt_encur_amt_110;
	}

	public String getSmt_amt_110(){
		return this.smt_amt_110;
	}

	public String getSale_amt_110(){
		return this.sale_amt_110;
	}

	public String getDscn_amt_110(){
		return this.dscn_amt_110;
	}

	public String getNet_sale_amt_110(){
		return this.net_sale_amt_110;
	}

	public String getNet_sale_amt_all(){
		return this.net_sale_amt_all;
	}

	public String getVal_qty_130(){
		return this.val_qty_130;
	}

	public String getIcdc_calc_qty_130(){
		return this.icdc_calc_qty_130;
	}

	public String getSpsl_qty_130(){
		return this.spsl_qty_130;
	}

	public String getCntr_qty_130(){
		return this.cntr_qty_130;
	}

	public String getBasi_uprc_130(){
		return this.basi_uprc_130;
	}

	public String getRdff_rdu_uprc_130(){
		return this.rdff_rdu_uprc_130;
	}

	public String getCntr_uprc_130(){
		return this.cntr_uprc_130;
	}

	public String getDnt_qty_130(){
		return this.dnt_qty_130;
	}

	public String getRegu_subs_uprc_130(){
		return this.regu_subs_uprc_130;
	}

	public String getDnt_amt_130(){
		return this.dnt_amt_130;
	}

	public String getStetsell_qty_130(){
		return this.stetsell_qty_130;
	}

	public String getStetsell_uprc_130(){
		return this.stetsell_uprc_130;
	}

	public String getStetsell_amt_130(){
		return this.stetsell_amt_130;
	}

	public String getIncmp_sale_qty_130(){
		return this.incmp_sale_qty_130;
	}

	public String getIncmp_sale_amt_130(){
		return this.incmp_sale_amt_130;
	}

	public String getPrvmm_val_qty_130(){
		return this.prvmm_val_qty_130;
	}

	public String getFpymt_encur_amt_130(){
		return this.fpymt_encur_amt_130;
	}

	public String getSmt_amt_130(){
		return this.smt_amt_130;
	}

	public String getSale_amt_130(){
		return this.sale_amt_130;
	}

	public String getDscn_amt_130(){
		return this.dscn_amt_130;
	}

	public String getNet_sale_amt_130(){
		return this.net_sale_amt_130;
	}
}

/* 작성시간 : Wed Sep 02 14:58:23 KST 2009 */