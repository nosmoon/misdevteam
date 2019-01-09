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


public class PR_PRTCNSG_1200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String issu_qty;
	public String bw_pcnt;
	public String clr_pcnt;
	public String film_use_qunt;
	public String u_1;
	public String n_1;
	public String u_2;
	public String n_2;
	public String u_4;
	public String n_4;
	public String u_m2;
	public String n_m2;
	public String u_m4;
	public String n_m4;
	public String prt_fee;
	public String paper_wgt;
	public String paper_amt;
	public String psplat_use_amt;
	public String gnaw_fee;
	public String film_make_fee;
	public String pack_fee;
	public String paper_portage;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String total;

	public PR_PRTCNSG_1200_LCURLISTRecord(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setIssu_qty(String issu_qty){
		this.issu_qty = issu_qty;
	}

	public void setBw_pcnt(String bw_pcnt){
		this.bw_pcnt = bw_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setFilm_use_qunt(String film_use_qunt){
		this.film_use_qunt = film_use_qunt;
	}

	public void setU_1(String u_1){
		this.u_1 = u_1;
	}

	public void setN_1(String n_1){
		this.n_1 = n_1;
	}

	public void setU_2(String u_2){
		this.u_2 = u_2;
	}

	public void setN_2(String n_2){
		this.n_2 = n_2;
	}

	public void setU_4(String u_4){
		this.u_4 = u_4;
	}

	public void setN_4(String n_4){
		this.n_4 = n_4;
	}

	public void setU_m2(String u_m2){
		this.u_m2 = u_m2;
	}

	public void setN_m2(String n_m2){
		this.n_m2 = n_m2;
	}

	public void setU_m4(String u_m4){
		this.u_m4 = u_m4;
	}

	public void setN_m4(String n_m4){
		this.n_m4 = n_m4;
	}

	public void setPrt_fee(String prt_fee){
		this.prt_fee = prt_fee;
	}

	public void setPaper_wgt(String paper_wgt){
		this.paper_wgt = paper_wgt;
	}

	public void setPaper_amt(String paper_amt){
		this.paper_amt = paper_amt;
	}

	public void setPsplat_use_amt(String psplat_use_amt){
		this.psplat_use_amt = psplat_use_amt;
	}

	public void setGnaw_fee(String gnaw_fee){
		this.gnaw_fee = gnaw_fee;
	}

	public void setFilm_make_fee(String film_make_fee){
		this.film_make_fee = film_make_fee;
	}

	public void setPack_fee(String pack_fee){
		this.pack_fee = pack_fee;
	}

	public void setPaper_portage(String paper_portage){
		this.paper_portage = paper_portage;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getIssu_qty(){
		return this.issu_qty;
	}

	public String getBw_pcnt(){
		return this.bw_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getFilm_use_qunt(){
		return this.film_use_qunt;
	}

	public String getU_1(){
		return this.u_1;
	}

	public String getN_1(){
		return this.n_1;
	}

	public String getU_2(){
		return this.u_2;
	}

	public String getN_2(){
		return this.n_2;
	}

	public String getU_4(){
		return this.u_4;
	}

	public String getN_4(){
		return this.n_4;
	}

	public String getU_m2(){
		return this.u_m2;
	}

	public String getN_m2(){
		return this.n_m2;
	}

	public String getU_m4(){
		return this.u_m4;
	}

	public String getN_m4(){
		return this.n_m4;
	}

	public String getPrt_fee(){
		return this.prt_fee;
	}

	public String getPaper_wgt(){
		return this.paper_wgt;
	}

	public String getPaper_amt(){
		return this.paper_amt;
	}

	public String getPsplat_use_amt(){
		return this.psplat_use_amt;
	}

	public String getGnaw_fee(){
		return this.gnaw_fee;
	}

	public String getFilm_make_fee(){
		return this.film_make_fee;
	}

	public String getPack_fee(){
		return this.pack_fee;
	}

	public String getPaper_portage(){
		return this.paper_portage;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getTotal(){
		return this.total;
	}
}

/* 작성시간 : Wed Aug 26 21:43:45 KST 2009 */