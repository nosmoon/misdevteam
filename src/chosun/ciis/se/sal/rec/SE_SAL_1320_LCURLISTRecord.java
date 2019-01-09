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


public class SE_SAL_1320_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String dept_cd;
	public String dept_nm;
	public String sub_dept_cd;
	public String sub_dept_nm;
	public String area_cd;
	public String area_nm;
	public String bo_cd;
	public String bo_nm;
	public String jd_sell_net_clsf;
	public String medi_cd;
	public String bo_seq;
	public String prvmm_val_qty;
	public String cntr_uprc_be;
	public String net_sale_amt_be;
	public String qty;
	public String icdc_uprc;
	public String cntr_uprc;
	public String dnt_amt;
	public String fpymt_encur_amt;
	public String net_sale_amt;
	public String rdff_rdu_uprc;
	public String rdff_rdu_uprc_be;
	public String basi_uprc;
	public String icdc_net_sale_amt;
	public String icdc_area;
	public String basi_amt;
	public String surplus_amt;
	public String subs_uprc;

	public SE_SAL_1320_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

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

	public void setJd_sell_net_clsf(String jd_sell_net_clsf){
		this.jd_sell_net_clsf = jd_sell_net_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setPrvmm_val_qty(String prvmm_val_qty){
		this.prvmm_val_qty = prvmm_val_qty;
	}

	public void setCntr_uprc_be(String cntr_uprc_be){
		this.cntr_uprc_be = cntr_uprc_be;
	}

	public void setNet_sale_amt_be(String net_sale_amt_be){
		this.net_sale_amt_be = net_sale_amt_be;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setIcdc_uprc(String icdc_uprc){
		this.icdc_uprc = icdc_uprc;
	}

	public void setCntr_uprc(String cntr_uprc){
		this.cntr_uprc = cntr_uprc;
	}

	public void setDnt_amt(String dnt_amt){
		this.dnt_amt = dnt_amt;
	}

	public void setFpymt_encur_amt(String fpymt_encur_amt){
		this.fpymt_encur_amt = fpymt_encur_amt;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}

	public void setRdff_rdu_uprc(String rdff_rdu_uprc){
		this.rdff_rdu_uprc = rdff_rdu_uprc;
	}

	public void setRdff_rdu_uprc_be(String rdff_rdu_uprc_be){
		this.rdff_rdu_uprc_be = rdff_rdu_uprc_be;
	}

	public void setBasi_uprc(String basi_uprc){
		this.basi_uprc = basi_uprc;
	}

	public void setIcdc_net_sale_amt(String icdc_net_sale_amt){
		this.icdc_net_sale_amt = icdc_net_sale_amt;
	}

	public void setIcdc_area(String icdc_area){
		this.icdc_area = icdc_area;
	}

	public void setBasi_amt(String basi_amt){
		this.basi_amt = basi_amt;
	}

	public void setSurplus_amt(String surplus_amt){
		this.surplus_amt = surplus_amt;
	}

	public void setSubs_uprc(String subs_uprc){
		this.subs_uprc = subs_uprc;
	}

	public String getYymm(){
		return this.yymm;
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

	public String getJd_sell_net_clsf(){
		return this.jd_sell_net_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getPrvmm_val_qty(){
		return this.prvmm_val_qty;
	}

	public String getCntr_uprc_be(){
		return this.cntr_uprc_be;
	}

	public String getNet_sale_amt_be(){
		return this.net_sale_amt_be;
	}

	public String getQty(){
		return this.qty;
	}

	public String getIcdc_uprc(){
		return this.icdc_uprc;
	}

	public String getCntr_uprc(){
		return this.cntr_uprc;
	}

	public String getDnt_amt(){
		return this.dnt_amt;
	}

	public String getFpymt_encur_amt(){
		return this.fpymt_encur_amt;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}

	public String getRdff_rdu_uprc(){
		return this.rdff_rdu_uprc;
	}

	public String getRdff_rdu_uprc_be(){
		return this.rdff_rdu_uprc_be;
	}

	public String getBasi_uprc(){
		return this.basi_uprc;
	}

	public String getIcdc_net_sale_amt(){
		return this.icdc_net_sale_amt;
	}

	public String getIcdc_area(){
		return this.icdc_area;
	}

	public String getBasi_amt(){
		return this.basi_amt;
	}

	public String getSurplus_amt(){
		return this.surplus_amt;
	}

	public String getSubs_uprc(){
		return this.subs_uprc;
	}
}

/* 작성시간 : Thu Aug 06 20:23:46 KST 2009 */