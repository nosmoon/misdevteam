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


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_2910_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String reg_dt;
	public String reg_seq;
	public String issu_dt;
	public String medi_nm;
	public String sect_cd;
	public String sect_nm;
	public String qty;
	public String prt_rfl_qty;
	public String cnfm_stat_clsf_nm;
	public String arvl_clsf_nm;
	public String clos_tms;
	public String area_nm;
	public String route_clsf;
	public String bo_cd;
	public String send_plac_seq;
	public String send_plac_nm;
	public String aplc_pers_nm;
	public String call_no;

	public SE_SND_2910_LCURLISTRecord(){}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setReg_seq(String reg_seq){
		this.reg_seq = reg_seq;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setPrt_rfl_qty(String prt_rfl_qty){
		this.prt_rfl_qty = prt_rfl_qty;
	}

	public void setCnfm_stat_clsf_nm(String cnfm_stat_clsf_nm){
		this.cnfm_stat_clsf_nm = cnfm_stat_clsf_nm;
	}

	public void setArvl_clsf_nm(String arvl_clsf_nm){
		this.arvl_clsf_nm = arvl_clsf_nm;
	}

	public void setClos_tms(String clos_tms){
		this.clos_tms = clos_tms;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setAplc_pers_nm(String aplc_pers_nm){
		this.aplc_pers_nm = aplc_pers_nm;
	}

	public void setCall_no(String call_no){
		this.call_no = call_no;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getReg_seq(){
		return this.reg_seq;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getQty(){
		return this.qty;
	}

	public String getPrt_rfl_qty(){
		return this.prt_rfl_qty;
	}

	public String getCnfm_stat_clsf_nm(){
		return this.cnfm_stat_clsf_nm;
	}

	public String getArvl_clsf_nm(){
		return this.arvl_clsf_nm;
	}

	public String getClos_tms(){
		return this.clos_tms;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getAplc_pers_nm(){
		return this.aplc_pers_nm;
	}

	public String getCall_no(){
		return this.call_no;
	}
}

/* 작성시간 : Thu Jul 30 10:29:04 KST 2009 */