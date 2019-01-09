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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_nm;
	public String bo_nm;
	public String bo_head_nm;
	public String bo_head_prn;
	public String chrg_flnm;
	public String dept_nm;
	public String bo_zip;
	public String bo_addr;
	public String bo_telno;
	public String bo_cntr_dt;
	public String fst_jd_yymm;
	public String bo_feat_nm;
	public String bo_mang_grad_clasnm;
	public String qty_sell_net_nm;
	public String sido_nm;
	public String adms_dstc_nm;

	public SE_BOI_1310_LCURLISTRecord(){}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setBo_head_prn(String bo_head_prn){
		this.bo_head_prn = bo_head_prn;
	}

	public void setChrg_flnm(String chrg_flnm){
		this.chrg_flnm = chrg_flnm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setBo_zip(String bo_zip){
		this.bo_zip = bo_zip;
	}

	public void setBo_addr(String bo_addr){
		this.bo_addr = bo_addr;
	}

	public void setBo_telno(String bo_telno){
		this.bo_telno = bo_telno;
	}

	public void setBo_cntr_dt(String bo_cntr_dt){
		this.bo_cntr_dt = bo_cntr_dt;
	}

	public void setFst_jd_yymm(String fst_jd_yymm){
		this.fst_jd_yymm = fst_jd_yymm;
	}

	public void setBo_feat_nm(String bo_feat_nm){
		this.bo_feat_nm = bo_feat_nm;
	}

	public void setBo_mang_grad_clasnm(String bo_mang_grad_clasnm){
		this.bo_mang_grad_clasnm = bo_mang_grad_clasnm;
	}

	public void setQty_sell_net_nm(String qty_sell_net_nm){
		this.qty_sell_net_nm = qty_sell_net_nm;
	}

	public void setSido_nm(String sido_nm){
		this.sido_nm = sido_nm;
	}

	public void setAdms_dstc_nm(String adms_dstc_nm){
		this.adms_dstc_nm = adms_dstc_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getBo_head_prn(){
		return this.bo_head_prn;
	}

	public String getChrg_flnm(){
		return this.chrg_flnm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getBo_zip(){
		return this.bo_zip;
	}

	public String getBo_addr(){
		return this.bo_addr;
	}

	public String getBo_telno(){
		return this.bo_telno;
	}

	public String getBo_cntr_dt(){
		return this.bo_cntr_dt;
	}

	public String getFst_jd_yymm(){
		return this.fst_jd_yymm;
	}

	public String getBo_feat_nm(){
		return this.bo_feat_nm;
	}

	public String getBo_mang_grad_clasnm(){
		return this.bo_mang_grad_clasnm;
	}

	public String getQty_sell_net_nm(){
		return this.qty_sell_net_nm;
	}

	public String getSido_nm(){
		return this.sido_nm;
	}

	public String getAdms_dstc_nm(){
		return this.adms_dstc_nm;
	}
}

/* 작성시간 : Tue Feb 03 10:01:21 KST 2009 */