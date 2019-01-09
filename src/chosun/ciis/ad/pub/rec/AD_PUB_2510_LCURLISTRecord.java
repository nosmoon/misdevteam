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


package chosun.ciis.ad.pub.rec;

import java.sql.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;

/**
 * 
 */


public class AD_PUB_2510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_dt;
	public String yoil;
	public String sect_cd;
	public String sect_clas_nm;
	public String sect_nm;
	public String edt_nm;
	public String clr_advt_fee;
	public String blk_advt_fee;
	public String tot_advt_fee;
	public String issu_dt_cnt;
	public String avg_pubc_amt;
	public String cnt_clr_myun;
	public String cnt_blk_myun;
	public String tot_tabl_clsf;
	public String tot_dn;
	public String pubc_cnt;
	public String avg_clr_myun;
	public String avg_blk_myum;
	public String avg_tot_myun;
	public String avg_tot_uprc;
	public String fee;
	public String coms;

	public AD_PUB_2510_LCURLISTRecord(){}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setYoil(String yoil){
		this.yoil = yoil;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_clas_nm(String sect_clas_nm){
		this.sect_clas_nm = sect_clas_nm;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setEdt_nm(String edt_nm){
		this.edt_nm = edt_nm;
	}

	public void setClr_advt_fee(String clr_advt_fee){
		this.clr_advt_fee = clr_advt_fee;
	}

	public void setBlk_advt_fee(String blk_advt_fee){
		this.blk_advt_fee = blk_advt_fee;
	}

	public void setTot_advt_fee(String tot_advt_fee){
		this.tot_advt_fee = tot_advt_fee;
	}

	public void setIssu_dt_cnt(String issu_dt_cnt){
		this.issu_dt_cnt = issu_dt_cnt;
	}

	public void setAvg_pubc_amt(String avg_pubc_amt){
		this.avg_pubc_amt = avg_pubc_amt;
	}

	public void setCnt_clr_myun(String cnt_clr_myun){
		this.cnt_clr_myun = cnt_clr_myun;
	}

	public void setCnt_blk_myun(String cnt_blk_myun){
		this.cnt_blk_myun = cnt_blk_myun;
	}

	public void setTot_tabl_clsf(String tot_tabl_clsf){
		this.tot_tabl_clsf = tot_tabl_clsf;
	}

	public void setTot_dn(String tot_dn){
		this.tot_dn = tot_dn;
	}

	public void setPubc_cnt(String pubc_cnt){
		this.pubc_cnt = pubc_cnt;
	}

	public void setAvg_clr_myun(String avg_clr_myun){
		this.avg_clr_myun = avg_clr_myun;
	}

	public void setAvg_blk_myum(String avg_blk_myum){
		this.avg_blk_myum = avg_blk_myum;
	}

	public void setAvg_tot_myun(String avg_tot_myun){
		this.avg_tot_myun = avg_tot_myun;
	}

	public void setAvg_tot_uprc(String avg_tot_uprc){
		this.avg_tot_uprc = avg_tot_uprc;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getYoil(){
		return this.yoil;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_clas_nm(){
		return this.sect_clas_nm;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getEdt_nm(){
		return this.edt_nm;
	}

	public String getClr_advt_fee(){
		return this.clr_advt_fee;
	}

	public String getBlk_advt_fee(){
		return this.blk_advt_fee;
	}

	public String getTot_advt_fee(){
		return this.tot_advt_fee;
	}

	public String getIssu_dt_cnt(){
		return this.issu_dt_cnt;
	}

	public String getAvg_pubc_amt(){
		return this.avg_pubc_amt;
	}

	public String getCnt_clr_myun(){
		return this.cnt_clr_myun;
	}

	public String getCnt_blk_myun(){
		return this.cnt_blk_myun;
	}

	public String getTot_tabl_clsf(){
		return this.tot_tabl_clsf;
	}

	public String getTot_dn(){
		return this.tot_dn;
	}

	public String getPubc_cnt(){
		return this.pubc_cnt;
	}

	public String getAvg_clr_myun(){
		return this.avg_clr_myun;
	}

	public String getAvg_blk_myum(){
		return this.avg_blk_myum;
	}

	public String getAvg_tot_myun(){
		return this.avg_tot_myun;
	}

	public String getAvg_tot_uprc(){
		return this.avg_tot_uprc;
	}

	public String getFee(){
		return this.fee;
	}

	public String getComs(){
		return this.coms;
	}
}

/* 작성시간 : Mon Jul 31 18:46:09 KST 2017 */