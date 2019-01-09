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


public class PR_PRTCNSG_1310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String aply_dt;
	public String prt_basi_qty;
	public String prt_uprc_bw_1;
	public String prt_uprc_clr_1;
	public String prt_uprc_bw_2;
	public String prt_uprc_clr_2;
	public String pj_basi_qty;
	public String prt_pj_rate_bw_1;
	public String prt_pj_rate_clr_1;
	public String prt_pj_rate_bw_2;
	public String prt_pj_rate_clr_2;
	public String film_make_fee;
	public String pack_fee;
	public String paper_wgt;
	public String dlco_nm;
	public String eps_no;
	public String dlco_no;
	public String incmg_pers;
	public String incmg_dt_tm;

	public PR_PRTCNSG_1310_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setPrt_basi_qty(String prt_basi_qty){
		this.prt_basi_qty = prt_basi_qty;
	}

	public void setPrt_uprc_bw_1(String prt_uprc_bw_1){
		this.prt_uprc_bw_1 = prt_uprc_bw_1;
	}

	public void setPrt_uprc_clr_1(String prt_uprc_clr_1){
		this.prt_uprc_clr_1 = prt_uprc_clr_1;
	}

	public void setPrt_uprc_bw_2(String prt_uprc_bw_2){
		this.prt_uprc_bw_2 = prt_uprc_bw_2;
	}

	public void setPrt_uprc_clr_2(String prt_uprc_clr_2){
		this.prt_uprc_clr_2 = prt_uprc_clr_2;
	}

	public void setPj_basi_qty(String pj_basi_qty){
		this.pj_basi_qty = pj_basi_qty;
	}

	public void setPrt_pj_rate_bw_1(String prt_pj_rate_bw_1){
		this.prt_pj_rate_bw_1 = prt_pj_rate_bw_1;
	}

	public void setPrt_pj_rate_clr_1(String prt_pj_rate_clr_1){
		this.prt_pj_rate_clr_1 = prt_pj_rate_clr_1;
	}

	public void setPrt_pj_rate_bw_2(String prt_pj_rate_bw_2){
		this.prt_pj_rate_bw_2 = prt_pj_rate_bw_2;
	}

	public void setPrt_pj_rate_clr_2(String prt_pj_rate_clr_2){
		this.prt_pj_rate_clr_2 = prt_pj_rate_clr_2;
	}

	public void setFilm_make_fee(String film_make_fee){
		this.film_make_fee = film_make_fee;
	}

	public void setPack_fee(String pack_fee){
		this.pack_fee = pack_fee;
	}

	public void setPaper_wgt(String paper_wgt){
		this.paper_wgt = paper_wgt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setEps_no(String eps_no){
		this.eps_no = eps_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
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

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getPrt_basi_qty(){
		return this.prt_basi_qty;
	}

	public String getPrt_uprc_bw_1(){
		return this.prt_uprc_bw_1;
	}

	public String getPrt_uprc_clr_1(){
		return this.prt_uprc_clr_1;
	}

	public String getPrt_uprc_bw_2(){
		return this.prt_uprc_bw_2;
	}

	public String getPrt_uprc_clr_2(){
		return this.prt_uprc_clr_2;
	}

	public String getPj_basi_qty(){
		return this.pj_basi_qty;
	}

	public String getPrt_pj_rate_bw_1(){
		return this.prt_pj_rate_bw_1;
	}

	public String getPrt_pj_rate_clr_1(){
		return this.prt_pj_rate_clr_1;
	}

	public String getPrt_pj_rate_bw_2(){
		return this.prt_pj_rate_bw_2;
	}

	public String getPrt_pj_rate_clr_2(){
		return this.prt_pj_rate_clr_2;
	}

	public String getFilm_make_fee(){
		return this.film_make_fee;
	}

	public String getPack_fee(){
		return this.pack_fee;
	}

	public String getPaper_wgt(){
		return this.paper_wgt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getEps_no(){
		return this.eps_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}
}

/* 작성시간 : Wed Aug 26 00:56:42 KST 2009 */