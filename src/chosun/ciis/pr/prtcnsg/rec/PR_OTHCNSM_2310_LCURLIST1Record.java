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


package chosun.ciis.pr.prtcnsg.rec;

import java.sql.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.ds.*;

/**
 * 
 */


public class PR_OTHCNSM_2310_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String fac_clsf_nm;
	public String medi_cd;
	public String sect_cd;
	public String sect_nm;
	public String aply_dt;
	public String film_make_fee;
	public String pack_fee;
	public String base_leas_fee;
	public String real_leas_fee;
	public String dest_fee;
	public String etc_matr_fee_bw;
	public String etc_matr_fee_clr;
	public String leas_use_fee_bw;
	public String leas_use_fee_clr;
	public String paper_wgt;
	public String prt_pj_rate;
	public String incmg_pers;
	public String incmg_dt_tm;

	public PR_OTHCNSM_2310_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
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

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setFilm_make_fee(String film_make_fee){
		this.film_make_fee = film_make_fee;
	}

	public void setPack_fee(String pack_fee){
		this.pack_fee = pack_fee;
	}

	public void setBase_leas_fee(String base_leas_fee){
		this.base_leas_fee = base_leas_fee;
	}

	public void setReal_leas_fee(String real_leas_fee){
		this.real_leas_fee = real_leas_fee;
	}

	public void setDest_fee(String dest_fee){
		this.dest_fee = dest_fee;
	}

	public void setEtc_matr_fee_bw(String etc_matr_fee_bw){
		this.etc_matr_fee_bw = etc_matr_fee_bw;
	}

	public void setEtc_matr_fee_clr(String etc_matr_fee_clr){
		this.etc_matr_fee_clr = etc_matr_fee_clr;
	}

	public void setLeas_use_fee_bw(String leas_use_fee_bw){
		this.leas_use_fee_bw = leas_use_fee_bw;
	}

	public void setLeas_use_fee_clr(String leas_use_fee_clr){
		this.leas_use_fee_clr = leas_use_fee_clr;
	}

	public void setPaper_wgt(String paper_wgt){
		this.paper_wgt = paper_wgt;
	}

	public void setPrt_pj_rate(String prt_pj_rate){
		this.prt_pj_rate = prt_pj_rate;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
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

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getFilm_make_fee(){
		return this.film_make_fee;
	}

	public String getPack_fee(){
		return this.pack_fee;
	}

	public String getBase_leas_fee(){
		return this.base_leas_fee;
	}

	public String getReal_leas_fee(){
		return this.real_leas_fee;
	}

	public String getDest_fee(){
		return this.dest_fee;
	}

	public String getEtc_matr_fee_bw(){
		return this.etc_matr_fee_bw;
	}

	public String getEtc_matr_fee_clr(){
		return this.etc_matr_fee_clr;
	}

	public String getLeas_use_fee_bw(){
		return this.leas_use_fee_bw;
	}

	public String getLeas_use_fee_clr(){
		return this.leas_use_fee_clr;
	}

	public String getPaper_wgt(){
		return this.paper_wgt;
	}

	public String getPrt_pj_rate(){
		return this.prt_pj_rate;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}
}

/* 작성시간 : Fri Sep 25 16:03:55 KST 2009 */