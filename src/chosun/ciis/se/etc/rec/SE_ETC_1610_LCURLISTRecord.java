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


package chosun.ciis.se.etc.rec;

import java.sql.*;
import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.ds.*;

/**
 * 
 */


public class SE_ETC_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String dept_cd;
	public String dept_nm;
	public String part_cd;
	public String part_nm;
	public String area_cd;
	public String area_nm;
	public String sido_gugun_cd;
	public String sido_gugun_nm;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String livingin_yn;
	public String house_qty;
	public String business_site_qty;
	public String curmm_val_qty;
	public String curmm_no_val_qty;
	public String avg_send_qty;
	public String no_val_rate;
	public String remk;
	public String hk_housqty;
	public String hk_busiqty;
	public String mk_housqty;
	public String mk_busiqty;
	public String kh_housqty;
	public String kh_busiqty;
	public String km_housqty;
	public String km_busiqty;
	public String da_housqty;
	public String da_busiqty;
	public String ja_housqty;
	public String ja_busiqty;
	public String hap;
	public String lst_aply;
	public String abc_val_qty;
	public String end_dt_send_qty;
	public String sell_net_clsf;

	public SE_ETC_1610_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setSido_gugun_cd(String sido_gugun_cd){
		this.sido_gugun_cd = sido_gugun_cd;
	}

	public void setSido_gugun_nm(String sido_gugun_nm){
		this.sido_gugun_nm = sido_gugun_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setLivingin_yn(String livingin_yn){
		this.livingin_yn = livingin_yn;
	}

	public void setHouse_qty(String house_qty){
		this.house_qty = house_qty;
	}

	public void setBusiness_site_qty(String business_site_qty){
		this.business_site_qty = business_site_qty;
	}

	public void setCurmm_val_qty(String curmm_val_qty){
		this.curmm_val_qty = curmm_val_qty;
	}

	public void setCurmm_no_val_qty(String curmm_no_val_qty){
		this.curmm_no_val_qty = curmm_no_val_qty;
	}

	public void setAvg_send_qty(String avg_send_qty){
		this.avg_send_qty = avg_send_qty;
	}

	public void setNo_val_rate(String no_val_rate){
		this.no_val_rate = no_val_rate;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setHk_housqty(String hk_housqty){
		this.hk_housqty = hk_housqty;
	}

	public void setHk_busiqty(String hk_busiqty){
		this.hk_busiqty = hk_busiqty;
	}

	public void setMk_housqty(String mk_housqty){
		this.mk_housqty = mk_housqty;
	}

	public void setMk_busiqty(String mk_busiqty){
		this.mk_busiqty = mk_busiqty;
	}

	public void setKh_housqty(String kh_housqty){
		this.kh_housqty = kh_housqty;
	}

	public void setKh_busiqty(String kh_busiqty){
		this.kh_busiqty = kh_busiqty;
	}

	public void setKm_housqty(String km_housqty){
		this.km_housqty = km_housqty;
	}

	public void setKm_busiqty(String km_busiqty){
		this.km_busiqty = km_busiqty;
	}

	public void setDa_housqty(String da_housqty){
		this.da_housqty = da_housqty;
	}

	public void setDa_busiqty(String da_busiqty){
		this.da_busiqty = da_busiqty;
	}

	public void setJa_housqty(String ja_housqty){
		this.ja_housqty = ja_housqty;
	}

	public void setJa_busiqty(String ja_busiqty){
		this.ja_busiqty = ja_busiqty;
	}

	public void setHap(String hap){
		this.hap = hap;
	}

	public void setLst_aply(String lst_aply){
		this.lst_aply = lst_aply;
	}

	public void setAbc_val_qty(String abc_val_qty){
		this.abc_val_qty = abc_val_qty;
	}

	public void setEnd_dt_send_qty(String end_dt_send_qty){
		this.end_dt_send_qty = end_dt_send_qty;
	}

	public void setSell_net_clsf(String sell_net_clsf){
		this.sell_net_clsf = sell_net_clsf;
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

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getSido_gugun_cd(){
		return this.sido_gugun_cd;
	}

	public String getSido_gugun_nm(){
		return this.sido_gugun_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getLivingin_yn(){
		return this.livingin_yn;
	}

	public String getHouse_qty(){
		return this.house_qty;
	}

	public String getBusiness_site_qty(){
		return this.business_site_qty;
	}

	public String getCurmm_val_qty(){
		return this.curmm_val_qty;
	}

	public String getCurmm_no_val_qty(){
		return this.curmm_no_val_qty;
	}

	public String getAvg_send_qty(){
		return this.avg_send_qty;
	}

	public String getNo_val_rate(){
		return this.no_val_rate;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getHk_housqty(){
		return this.hk_housqty;
	}

	public String getHk_busiqty(){
		return this.hk_busiqty;
	}

	public String getMk_housqty(){
		return this.mk_housqty;
	}

	public String getMk_busiqty(){
		return this.mk_busiqty;
	}

	public String getKh_housqty(){
		return this.kh_housqty;
	}

	public String getKh_busiqty(){
		return this.kh_busiqty;
	}

	public String getKm_housqty(){
		return this.km_housqty;
	}

	public String getKm_busiqty(){
		return this.km_busiqty;
	}

	public String getDa_housqty(){
		return this.da_housqty;
	}

	public String getDa_busiqty(){
		return this.da_busiqty;
	}

	public String getJa_housqty(){
		return this.ja_housqty;
	}

	public String getJa_busiqty(){
		return this.ja_busiqty;
	}

	public String getHap(){
		return this.hap;
	}

	public String getLst_aply(){
		return this.lst_aply;
	}

	public String getAbc_val_qty(){
		return this.abc_val_qty;
	}

	public String getEnd_dt_send_qty(){
		return this.end_dt_send_qty;
	}

	public String getSell_net_clsf(){
		return this.sell_net_clsf;
	}
}

/* 작성시간 : Tue Oct 23 16:37:24 KST 2012 */