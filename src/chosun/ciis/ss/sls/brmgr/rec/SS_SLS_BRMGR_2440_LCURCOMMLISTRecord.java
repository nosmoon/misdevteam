/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2440_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String bo_head_nm;
	public String boclsf;
	public String rdr_qty;
	public String gap_qty;
	public String v_rdr_qty;
	public String v_rdr_rate;
	public String j_rdr_qty;
	public String j_rdr_rate;
	public String extn_qty;
	public String extn_rate;
	public String sw_extn_qty;
	public String etc_extn_qty;
	public String extn_rate2;
	public String jm_qty;
	public String susp_qty;
	public String susp_rate;
	public String sw_susp_qty;
	public String etc_susp_qty;
	public String susp_rate2;
	public String grow_qty;
	public String grow_rate;
	public String etc_grow_qty;
	public String grow_rate2;
	public String medaqty;
	public String meda_amt;
	public String repm_amt;
	public String repm_rate;
	public String curmm_issu_qty;
	public String net_sale_amt;
	public String net_sale_amt2;
	public String jd_rate;
	public String sale_dscn_amt;
	public String rcpm_amt;
	public String rcpm_rate;
	public String curmm_bal;
	public String bal;
	public String leaf_purc;
	public String extn_bs;
	public String longmisu;
	public String longmisu_rate;
	public String extn_alon;
	public String daenap_amt;
	public String d_point;
	public String d_stat;

	public SS_SLS_BRMGR_2440_LCURCOMMLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setBoclsf(String boclsf){
		this.boclsf = boclsf;
	}

	public void setRdr_qty(String rdr_qty){
		this.rdr_qty = rdr_qty;
	}

	public void setGap_qty(String gap_qty){
		this.gap_qty = gap_qty;
	}

	public void setV_rdr_qty(String v_rdr_qty){
		this.v_rdr_qty = v_rdr_qty;
	}

	public void setV_rdr_rate(String v_rdr_rate){
		this.v_rdr_rate = v_rdr_rate;
	}

	public void setJ_rdr_qty(String j_rdr_qty){
		this.j_rdr_qty = j_rdr_qty;
	}

	public void setJ_rdr_rate(String j_rdr_rate){
		this.j_rdr_rate = j_rdr_rate;
	}

	public void setExtn_qty(String extn_qty){
		this.extn_qty = extn_qty;
	}

	public void setExtn_rate(String extn_rate){
		this.extn_rate = extn_rate;
	}

	public void setSw_extn_qty(String sw_extn_qty){
		this.sw_extn_qty = sw_extn_qty;
	}

	public void setEtc_extn_qty(String etc_extn_qty){
		this.etc_extn_qty = etc_extn_qty;
	}

	public void setExtn_rate2(String extn_rate2){
		this.extn_rate2 = extn_rate2;
	}

	public void setJm_qty(String jm_qty){
		this.jm_qty = jm_qty;
	}

	public void setSusp_qty(String susp_qty){
		this.susp_qty = susp_qty;
	}

	public void setSusp_rate(String susp_rate){
		this.susp_rate = susp_rate;
	}

	public void setSw_susp_qty(String sw_susp_qty){
		this.sw_susp_qty = sw_susp_qty;
	}

	public void setEtc_susp_qty(String etc_susp_qty){
		this.etc_susp_qty = etc_susp_qty;
	}

	public void setSusp_rate2(String susp_rate2){
		this.susp_rate2 = susp_rate2;
	}

	public void setGrow_qty(String grow_qty){
		this.grow_qty = grow_qty;
	}

	public void setGrow_rate(String grow_rate){
		this.grow_rate = grow_rate;
	}

	public void setEtc_grow_qty(String etc_grow_qty){
		this.etc_grow_qty = etc_grow_qty;
	}

	public void setGrow_rate2(String grow_rate2){
		this.grow_rate2 = grow_rate2;
	}

	public void setMedaqty(String medaqty){
		this.medaqty = medaqty;
	}

	public void setMeda_amt(String meda_amt){
		this.meda_amt = meda_amt;
	}

	public void setRepm_amt(String repm_amt){
		this.repm_amt = repm_amt;
	}

	public void setRepm_rate(String repm_rate){
		this.repm_rate = repm_rate;
	}

	public void setCurmm_issu_qty(String curmm_issu_qty){
		this.curmm_issu_qty = curmm_issu_qty;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}

	public void setNet_sale_amt2(String net_sale_amt2){
		this.net_sale_amt2 = net_sale_amt2;
	}

	public void setJd_rate(String jd_rate){
		this.jd_rate = jd_rate;
	}

	public void setSale_dscn_amt(String sale_dscn_amt){
		this.sale_dscn_amt = sale_dscn_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setRcpm_rate(String rcpm_rate){
		this.rcpm_rate = rcpm_rate;
	}

	public void setCurmm_bal(String curmm_bal){
		this.curmm_bal = curmm_bal;
	}

	public void setBal(String bal){
		this.bal = bal;
	}

	public void setLeaf_purc(String leaf_purc){
		this.leaf_purc = leaf_purc;
	}

	public void setExtn_bs(String extn_bs){
		this.extn_bs = extn_bs;
	}

	public void setLongmisu(String longmisu){
		this.longmisu = longmisu;
	}

	public void setLongmisu_rate(String longmisu_rate){
		this.longmisu_rate = longmisu_rate;
	}

	public void setExtn_alon(String extn_alon){
		this.extn_alon = extn_alon;
	}

	public void setDaenap_amt(String daenap_amt){
		this.daenap_amt = daenap_amt;
	}

	public void setD_point(String d_point){
		this.d_point = d_point;
	}

	public void setD_stat(String d_stat){
		this.d_stat = d_stat;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getBoclsf(){
		return this.boclsf;
	}

	public String getRdr_qty(){
		return this.rdr_qty;
	}

	public String getGap_qty(){
		return this.gap_qty;
	}

	public String getV_rdr_qty(){
		return this.v_rdr_qty;
	}

	public String getV_rdr_rate(){
		return this.v_rdr_rate;
	}

	public String getJ_rdr_qty(){
		return this.j_rdr_qty;
	}

	public String getJ_rdr_rate(){
		return this.j_rdr_rate;
	}

	public String getExtn_qty(){
		return this.extn_qty;
	}

	public String getExtn_rate(){
		return this.extn_rate;
	}

	public String getSw_extn_qty(){
		return this.sw_extn_qty;
	}

	public String getEtc_extn_qty(){
		return this.etc_extn_qty;
	}

	public String getExtn_rate2(){
		return this.extn_rate2;
	}

	public String getJm_qty(){
		return this.jm_qty;
	}

	public String getSusp_qty(){
		return this.susp_qty;
	}

	public String getSusp_rate(){
		return this.susp_rate;
	}

	public String getSw_susp_qty(){
		return this.sw_susp_qty;
	}

	public String getEtc_susp_qty(){
		return this.etc_susp_qty;
	}

	public String getSusp_rate2(){
		return this.susp_rate2;
	}

	public String getGrow_qty(){
		return this.grow_qty;
	}

	public String getGrow_rate(){
		return this.grow_rate;
	}

	public String getEtc_grow_qty(){
		return this.etc_grow_qty;
	}

	public String getGrow_rate2(){
		return this.grow_rate2;
	}

	public String getMedaqty(){
		return this.medaqty;
	}

	public String getMeda_amt(){
		return this.meda_amt;
	}

	public String getRepm_amt(){
		return this.repm_amt;
	}

	public String getRepm_rate(){
		return this.repm_rate;
	}

	public String getCurmm_issu_qty(){
		return this.curmm_issu_qty;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}

	public String getNet_sale_amt2(){
		return this.net_sale_amt2;
	}

	public String getJd_rate(){
		return this.jd_rate;
	}

	public String getSale_dscn_amt(){
		return this.sale_dscn_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getRcpm_rate(){
		return this.rcpm_rate;
	}

	public String getCurmm_bal(){
		return this.curmm_bal;
	}

	public String getBal(){
		return this.bal;
	}

	public String getLeaf_purc(){
		return this.leaf_purc;
	}

	public String getExtn_bs(){
		return this.extn_bs;
	}

	public String getLongmisu(){
		return this.longmisu;
	}

	public String getLongmisu_rate(){
		return this.longmisu_rate;
	}

	public String getExtn_alon(){
		return this.extn_alon;
	}

	public String getDaenap_amt(){
		return this.daenap_amt;
	}

	public String getD_point(){
		return this.d_point;
	}

	public String getD_stat(){
		return this.d_stat;
	}
}

/* 작성시간 : Thu Jul 07 17:12:05 KST 2016 */