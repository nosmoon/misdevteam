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


public class SP_SAL_1310_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String sell_dept_nm;
	public String sell_area_cd;
	public String sell_area_nm;
	public String bo_nm;
	public String acol_no;
	public String dlco_no;
	public String clam_apt;
	public String clam_hous;
	public String clam_shop_etc;
	public String clam_tot;
	public String ufth_apt;
	public String ufth_hous;
	public String ufth_shop_etc;
	public String ufth_tot;
	public String cnfm_apt;
	public String cnfm_hous;
	public String cnfm_shop_etc;
	public String cnfm_tot;
	public String alon_clam_qty;
	public String rdr_extn_alon;
	public String pay_amt;

	public SP_SAL_1310_LCURLIST1Record(){}

	public void setSell_dept_nm(String sell_dept_nm){
		this.sell_dept_nm = sell_dept_nm;
	}

	public void setSell_area_cd(String sell_area_cd){
		this.sell_area_cd = sell_area_cd;
	}

	public void setSell_area_nm(String sell_area_nm){
		this.sell_area_nm = sell_area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setAcol_no(String acol_no){
		this.acol_no = acol_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setClam_apt(String clam_apt){
		this.clam_apt = clam_apt;
	}

	public void setClam_hous(String clam_hous){
		this.clam_hous = clam_hous;
	}

	public void setClam_shop_etc(String clam_shop_etc){
		this.clam_shop_etc = clam_shop_etc;
	}

	public void setClam_tot(String clam_tot){
		this.clam_tot = clam_tot;
	}

	public void setUfth_apt(String ufth_apt){
		this.ufth_apt = ufth_apt;
	}

	public void setUfth_hous(String ufth_hous){
		this.ufth_hous = ufth_hous;
	}

	public void setUfth_shop_etc(String ufth_shop_etc){
		this.ufth_shop_etc = ufth_shop_etc;
	}

	public void setUfth_tot(String ufth_tot){
		this.ufth_tot = ufth_tot;
	}

	public void setCnfm_apt(String cnfm_apt){
		this.cnfm_apt = cnfm_apt;
	}

	public void setCnfm_hous(String cnfm_hous){
		this.cnfm_hous = cnfm_hous;
	}

	public void setCnfm_shop_etc(String cnfm_shop_etc){
		this.cnfm_shop_etc = cnfm_shop_etc;
	}

	public void setCnfm_tot(String cnfm_tot){
		this.cnfm_tot = cnfm_tot;
	}

	public void setAlon_clam_qty(String alon_clam_qty){
		this.alon_clam_qty = alon_clam_qty;
	}

	public void setRdr_extn_alon(String rdr_extn_alon){
		this.rdr_extn_alon = rdr_extn_alon;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public String getSell_dept_nm(){
		return this.sell_dept_nm;
	}

	public String getSell_area_cd(){
		return this.sell_area_cd;
	}

	public String getSell_area_nm(){
		return this.sell_area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getAcol_no(){
		return this.acol_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getClam_apt(){
		return this.clam_apt;
	}

	public String getClam_hous(){
		return this.clam_hous;
	}

	public String getClam_shop_etc(){
		return this.clam_shop_etc;
	}

	public String getClam_tot(){
		return this.clam_tot;
	}

	public String getUfth_apt(){
		return this.ufth_apt;
	}

	public String getUfth_hous(){
		return this.ufth_hous;
	}

	public String getUfth_shop_etc(){
		return this.ufth_shop_etc;
	}

	public String getUfth_tot(){
		return this.ufth_tot;
	}

	public String getCnfm_apt(){
		return this.cnfm_apt;
	}

	public String getCnfm_hous(){
		return this.cnfm_hous;
	}

	public String getCnfm_shop_etc(){
		return this.cnfm_shop_etc;
	}

	public String getCnfm_tot(){
		return this.cnfm_tot;
	}

	public String getAlon_clam_qty(){
		return this.alon_clam_qty;
	}

	public String getRdr_extn_alon(){
		return this.rdr_extn_alon;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}
}

/* 작성시간 : Fri Jul 13 18:18:02 KST 2012 */