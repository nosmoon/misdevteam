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


public class PR_OTHCNSM_2100_LCURLIST6Record extends java.lang.Object implements java.io.Serializable{

	public String film_make_fee;
	public String pack_fee;
	public String paper_uprc;
	public String paper_wgt;
	public String dest_fee;
	public String base_leas_fee;
	public String real_leas_fee;
	public String etc_matr_fee_bw;
	public String etc_matr_fee_clr;
	public String leas_use_fee_bw;
	public String leas_use_fee_clr;
	public String prt_pj_rate;

	public PR_OTHCNSM_2100_LCURLIST6Record(){}

	public void setFilm_make_fee(String film_make_fee){
		this.film_make_fee = film_make_fee;
	}

	public void setPack_fee(String pack_fee){
		this.pack_fee = pack_fee;
	}

	public void setPaper_uprc(String paper_uprc){
		this.paper_uprc = paper_uprc;
	}

	public void setPaper_wgt(String paper_wgt){
		this.paper_wgt = paper_wgt;
	}

	public void setDest_fee(String dest_fee){
		this.dest_fee = dest_fee;
	}

	public void setBase_leas_fee(String base_leas_fee){
		this.base_leas_fee = base_leas_fee;
	}

	public void setReal_leas_fee(String real_leas_fee){
		this.real_leas_fee = real_leas_fee;
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

	public void setPrt_pj_rate(String prt_pj_rate){
		this.prt_pj_rate = prt_pj_rate;
	}

	public String getFilm_make_fee(){
		return this.film_make_fee;
	}

	public String getPack_fee(){
		return this.pack_fee;
	}

	public String getPaper_uprc(){
		return this.paper_uprc;
	}

	public String getPaper_wgt(){
		return this.paper_wgt;
	}

	public String getDest_fee(){
		return this.dest_fee;
	}

	public String getBase_leas_fee(){
		return this.base_leas_fee;
	}

	public String getReal_leas_fee(){
		return this.real_leas_fee;
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

	public String getPrt_pj_rate(){
		return this.prt_pj_rate;
	}
}

/* 작성시간 : Tue Oct 06 11:16:41 KST 2009 */