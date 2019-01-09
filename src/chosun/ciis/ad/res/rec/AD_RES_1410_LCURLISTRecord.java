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


package chosun.ciis.ad.res.rec;

import java.sql.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.ds.*;

/**
 * 
 */


public class AD_RES_1410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String preng_occr_seq;
	public String sect_nm;
	public String issu_dt;
	public String issu_side;
	public String sect_cd;
	public String sect_seq;
	public String cm;
	public String dn;
	public String chro_clsf;
	public String chro_clsf_nm;
	public String advt_cont;
	public String uprc;
	public String advt_fee;
	public String ex_advt_fee;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String agn;
	public String agn_nm;
	public String bw_clr_yn;
	public String dlco_nm;
	public String pubc_clsf;
	public String dlco_clsf;

	public AD_RES_1410_LCURLISTRecord(){}

	public void setPreng_occr_seq(String preng_occr_seq){
		this.preng_occr_seq = preng_occr_seq;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setIssu_side(String issu_side){
		this.issu_side = issu_side;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setChro_clsf(String chro_clsf){
		this.chro_clsf = chro_clsf;
	}

	public void setChro_clsf_nm(String chro_clsf_nm){
		this.chro_clsf_nm = chro_clsf_nm;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setEx_advt_fee(String ex_advt_fee){
		this.ex_advt_fee = ex_advt_fee;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public void setAgn_nm(String agn_nm){
		this.agn_nm = agn_nm;
	}

	public void setBw_clr_yn(String bw_clr_yn){
		this.bw_clr_yn = bw_clr_yn;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPubc_clsf(String pubc_clsf){
		this.pubc_clsf = pubc_clsf;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public String getPreng_occr_seq(){
		return this.preng_occr_seq;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getIssu_side(){
		return this.issu_side;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
	}

	public String getCm(){
		return this.cm;
	}

	public String getDn(){
		return this.dn;
	}

	public String getChro_clsf(){
		return this.chro_clsf;
	}

	public String getChro_clsf_nm(){
		return this.chro_clsf_nm;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getEx_advt_fee(){
		return this.ex_advt_fee;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getAgn_nm(){
		return this.agn_nm;
	}

	public String getBw_clr_yn(){
		return this.bw_clr_yn;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPubc_clsf(){
		return this.pubc_clsf;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}
}

/* 작성시간 : Thu Aug 03 10:16:30 KST 2017 */