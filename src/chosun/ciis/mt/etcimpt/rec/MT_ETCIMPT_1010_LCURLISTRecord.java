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


package chosun.ciis.mt.etcimpt.rec;

import java.sql.*;
import chosun.ciis.mt.etcimpt.dm.*;
import chosun.ciis.mt.etcimpt.ds.*;

/**
 * 
 */


public class MT_ETCIMPT_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String yy;
	public String seq;
	public String leas_clsf;
	public String case_nm;
	public String impt_resn;
	public String matr_ptcr;
	public String use_dept;
	public String offer_pric;
	public String offer_pric_curc_clsf;
	public String ship_pers;
	public String base_cost;
	public String impt_vexc_coms;
	public String impt_vexc_coms_vat;
	public String lcopen_coms;
	public String telx_fee;
	public String offer_offr_plac;
	public String impt_clsf;
	public String lcopen_dt;
	public String lcopen_bank;
	public String lcno;
	public String lcvdty_prd;
	public String crgo_insr_entr_dt;
	public String crgo_insr_cntr_cmpy;
	public String crgo_insr_fee;
	public String ship_widr;
	public String ship_dt;
	public String ewh_dt;
	public String ewh_amt;
	public String last_entr_dt;
	public String impt_vexc_cmpy;
	public String remk;

	public MT_ETCIMPT_1010_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setLeas_clsf(String leas_clsf){
		this.leas_clsf = leas_clsf;
	}

	public void setCase_nm(String case_nm){
		this.case_nm = case_nm;
	}

	public void setImpt_resn(String impt_resn){
		this.impt_resn = impt_resn;
	}

	public void setMatr_ptcr(String matr_ptcr){
		this.matr_ptcr = matr_ptcr;
	}

	public void setUse_dept(String use_dept){
		this.use_dept = use_dept;
	}

	public void setOffer_pric(String offer_pric){
		this.offer_pric = offer_pric;
	}

	public void setOffer_pric_curc_clsf(String offer_pric_curc_clsf){
		this.offer_pric_curc_clsf = offer_pric_curc_clsf;
	}

	public void setShip_pers(String ship_pers){
		this.ship_pers = ship_pers;
	}

	public void setBase_cost(String base_cost){
		this.base_cost = base_cost;
	}

	public void setImpt_vexc_coms(String impt_vexc_coms){
		this.impt_vexc_coms = impt_vexc_coms;
	}

	public void setImpt_vexc_coms_vat(String impt_vexc_coms_vat){
		this.impt_vexc_coms_vat = impt_vexc_coms_vat;
	}

	public void setLcopen_coms(String lcopen_coms){
		this.lcopen_coms = lcopen_coms;
	}

	public void setTelx_fee(String telx_fee){
		this.telx_fee = telx_fee;
	}

	public void setOffer_offr_plac(String offer_offr_plac){
		this.offer_offr_plac = offer_offr_plac;
	}

	public void setImpt_clsf(String impt_clsf){
		this.impt_clsf = impt_clsf;
	}

	public void setLcopen_dt(String lcopen_dt){
		this.lcopen_dt = lcopen_dt;
	}

	public void setLcopen_bank(String lcopen_bank){
		this.lcopen_bank = lcopen_bank;
	}

	public void setLcno(String lcno){
		this.lcno = lcno;
	}

	public void setLcvdty_prd(String lcvdty_prd){
		this.lcvdty_prd = lcvdty_prd;
	}

	public void setCrgo_insr_entr_dt(String crgo_insr_entr_dt){
		this.crgo_insr_entr_dt = crgo_insr_entr_dt;
	}

	public void setCrgo_insr_cntr_cmpy(String crgo_insr_cntr_cmpy){
		this.crgo_insr_cntr_cmpy = crgo_insr_cntr_cmpy;
	}

	public void setCrgo_insr_fee(String crgo_insr_fee){
		this.crgo_insr_fee = crgo_insr_fee;
	}

	public void setShip_widr(String ship_widr){
		this.ship_widr = ship_widr;
	}

	public void setShip_dt(String ship_dt){
		this.ship_dt = ship_dt;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setEwh_amt(String ewh_amt){
		this.ewh_amt = ewh_amt;
	}

	public void setLast_entr_dt(String last_entr_dt){
		this.last_entr_dt = last_entr_dt;
	}

	public void setImpt_vexc_cmpy(String impt_vexc_cmpy){
		this.impt_vexc_cmpy = impt_vexc_cmpy;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYy(){
		return this.yy;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getLeas_clsf(){
		return this.leas_clsf;
	}

	public String getCase_nm(){
		return this.case_nm;
	}

	public String getImpt_resn(){
		return this.impt_resn;
	}

	public String getMatr_ptcr(){
		return this.matr_ptcr;
	}

	public String getUse_dept(){
		return this.use_dept;
	}

	public String getOffer_pric(){
		return this.offer_pric;
	}

	public String getOffer_pric_curc_clsf(){
		return this.offer_pric_curc_clsf;
	}

	public String getShip_pers(){
		return this.ship_pers;
	}

	public String getBase_cost(){
		return this.base_cost;
	}

	public String getImpt_vexc_coms(){
		return this.impt_vexc_coms;
	}

	public String getImpt_vexc_coms_vat(){
		return this.impt_vexc_coms_vat;
	}

	public String getLcopen_coms(){
		return this.lcopen_coms;
	}

	public String getTelx_fee(){
		return this.telx_fee;
	}

	public String getOffer_offr_plac(){
		return this.offer_offr_plac;
	}

	public String getImpt_clsf(){
		return this.impt_clsf;
	}

	public String getLcopen_dt(){
		return this.lcopen_dt;
	}

	public String getLcopen_bank(){
		return this.lcopen_bank;
	}

	public String getLcno(){
		return this.lcno;
	}

	public String getLcvdty_prd(){
		return this.lcvdty_prd;
	}

	public String getCrgo_insr_entr_dt(){
		return this.crgo_insr_entr_dt;
	}

	public String getCrgo_insr_cntr_cmpy(){
		return this.crgo_insr_cntr_cmpy;
	}

	public String getCrgo_insr_fee(){
		return this.crgo_insr_fee;
	}

	public String getShip_widr(){
		return this.ship_widr;
	}

	public String getShip_dt(){
		return this.ship_dt;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getEwh_amt(){
		return this.ewh_amt;
	}

	public String getLast_entr_dt(){
		return this.last_entr_dt;
	}

	public String getImpt_vexc_cmpy(){
		return this.impt_vexc_cmpy;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri Jul 03 10:40:50 KST 2009 */