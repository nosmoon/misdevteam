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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd_medc;
	public String issu_dt;
	public String sect_cd_medc;
	public String issu_pcnt_medc;
	public String prt_qty;
	public String prt_wgt;
	public String pj_excl_prt_wgt;
	public String pap_gm_qunt;
	public String remk;
	public String prt_dt;
	public String issu_dt_issu;
	public String fac_clsf;
	public String medi_cd_issu;
	public String pap_std;
	public String issu_pcnt;
	public String bw_pcnt;
	public String clr_pcnt;
	public String slip_qty;
	public String medi_cdnm_issu;
	public String sect_cdnm_issu;
	public String sect_cd_issu;
	public String sum_pjqunt;

	public MT_PAPINOUT_1002_LCURLISTRecord(){}

	public void setMedi_cd_medc(String medi_cd_medc){
		this.medi_cd_medc = medi_cd_medc;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setSect_cd_medc(String sect_cd_medc){
		this.sect_cd_medc = sect_cd_medc;
	}

	public void setIssu_pcnt_medc(String issu_pcnt_medc){
		this.issu_pcnt_medc = issu_pcnt_medc;
	}

	public void setPrt_qty(String prt_qty){
		this.prt_qty = prt_qty;
	}

	public void setPrt_wgt(String prt_wgt){
		this.prt_wgt = prt_wgt;
	}

	public void setPj_excl_prt_wgt(String pj_excl_prt_wgt){
		this.pj_excl_prt_wgt = pj_excl_prt_wgt;
	}

	public void setPap_gm_qunt(String pap_gm_qunt){
		this.pap_gm_qunt = pap_gm_qunt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setIssu_dt_issu(String issu_dt_issu){
		this.issu_dt_issu = issu_dt_issu;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd_issu(String medi_cd_issu){
		this.medi_cd_issu = medi_cd_issu;
	}

	public void setPap_std(String pap_std){
		this.pap_std = pap_std;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setBw_pcnt(String bw_pcnt){
		this.bw_pcnt = bw_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setMedi_cdnm_issu(String medi_cdnm_issu){
		this.medi_cdnm_issu = medi_cdnm_issu;
	}

	public void setSect_cdnm_issu(String sect_cdnm_issu){
		this.sect_cdnm_issu = sect_cdnm_issu;
	}

	public void setSect_cd_issu(String sect_cd_issu){
		this.sect_cd_issu = sect_cd_issu;
	}

	public void setSum_pjqunt(String sum_pjqunt){
		this.sum_pjqunt = sum_pjqunt;
	}

	public String getMedi_cd_medc(){
		return this.medi_cd_medc;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getSect_cd_medc(){
		return this.sect_cd_medc;
	}

	public String getIssu_pcnt_medc(){
		return this.issu_pcnt_medc;
	}

	public String getPrt_qty(){
		return this.prt_qty;
	}

	public String getPrt_wgt(){
		return this.prt_wgt;
	}

	public String getPj_excl_prt_wgt(){
		return this.pj_excl_prt_wgt;
	}

	public String getPap_gm_qunt(){
		return this.pap_gm_qunt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getIssu_dt_issu(){
		return this.issu_dt_issu;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd_issu(){
		return this.medi_cd_issu;
	}

	public String getPap_std(){
		return this.pap_std;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getBw_pcnt(){
		return this.bw_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getMedi_cdnm_issu(){
		return this.medi_cdnm_issu;
	}

	public String getSect_cdnm_issu(){
		return this.sect_cdnm_issu;
	}

	public String getSect_cd_issu(){
		return this.sect_cd_issu;
	}

	public String getSum_pjqunt(){
		return this.sum_pjqunt;
	}
}

/* 작성시간 : Tue Apr 14 17:43:00 KST 2009 */