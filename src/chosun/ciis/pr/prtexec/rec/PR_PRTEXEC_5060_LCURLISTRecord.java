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


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_5060_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String prt_dt;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String sect_nm;
	public String pap_std;
	public String issu_pcnt;
	public String clr_pcnt;
	public String bw_pcnt;
	public String slip_qty;
	public String chg_yn;
	public String gnr_qty;
	public String spsl_qty;
	public String gnr_add_qty;
	public String spsl_add_qty;
	public String add_prt_seq;
	public String dual_out_clsf;
	public String dual_out_nm;
	public String duty_ovt_prt_yn;
	public String send_clos_point_clsf;

	public PR_PRTEXEC_5060_LCURLISTRecord(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setPap_std(String pap_std){
		this.pap_std = pap_std;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setBw_pcnt(String bw_pcnt){
		this.bw_pcnt = bw_pcnt;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setChg_yn(String chg_yn){
		this.chg_yn = chg_yn;
	}

	public void setGnr_qty(String gnr_qty){
		this.gnr_qty = gnr_qty;
	}

	public void setSpsl_qty(String spsl_qty){
		this.spsl_qty = spsl_qty;
	}

	public void setGnr_add_qty(String gnr_add_qty){
		this.gnr_add_qty = gnr_add_qty;
	}

	public void setSpsl_add_qty(String spsl_add_qty){
		this.spsl_add_qty = spsl_add_qty;
	}

	public void setAdd_prt_seq(String add_prt_seq){
		this.add_prt_seq = add_prt_seq;
	}

	public void setDual_out_clsf(String dual_out_clsf){
		this.dual_out_clsf = dual_out_clsf;
	}

	public void setDual_out_nm(String dual_out_nm){
		this.dual_out_nm = dual_out_nm;
	}

	public void setDuty_ovt_prt_yn(String duty_ovt_prt_yn){
		this.duty_ovt_prt_yn = duty_ovt_prt_yn;
	}

	public void setSend_clos_point_clsf(String send_clos_point_clsf){
		this.send_clos_point_clsf = send_clos_point_clsf;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getPap_std(){
		return this.pap_std;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getBw_pcnt(){
		return this.bw_pcnt;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getChg_yn(){
		return this.chg_yn;
	}

	public String getGnr_qty(){
		return this.gnr_qty;
	}

	public String getSpsl_qty(){
		return this.spsl_qty;
	}

	public String getGnr_add_qty(){
		return this.gnr_add_qty;
	}

	public String getSpsl_add_qty(){
		return this.spsl_add_qty;
	}

	public String getAdd_prt_seq(){
		return this.add_prt_seq;
	}

	public String getDual_out_clsf(){
		return this.dual_out_clsf;
	}

	public String getDual_out_nm(){
		return this.dual_out_nm;
	}

	public String getDuty_ovt_prt_yn(){
		return this.duty_ovt_prt_yn;
	}

	public String getSend_clos_point_clsf(){
		return this.send_clos_point_clsf;
	}
}

/* 작성시간 : Tue Sep 08 17:25:51 KST 2009 */