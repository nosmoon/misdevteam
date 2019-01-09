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


public class PR_OTHCNSM_2100_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String film_use_qunt;
	public String prd_cnt;
	public String dest_fee;
	public String dest_qunt;
	public String paper_wgt;
	public String ink_use_qunt;
	public String prt_bgn_tm;
	public String prt_end_tm;
	public String seq;
	public String occr_dt;

	public PR_OTHCNSM_2100_LCURLIST3Record(){}

	public void setFilm_use_qunt(String film_use_qunt){
		this.film_use_qunt = film_use_qunt;
	}

	public void setPrd_cnt(String prd_cnt){
		this.prd_cnt = prd_cnt;
	}

	public void setDest_fee(String dest_fee){
		this.dest_fee = dest_fee;
	}

	public void setDest_qunt(String dest_qunt){
		this.dest_qunt = dest_qunt;
	}

	public void setPaper_wgt(String paper_wgt){
		this.paper_wgt = paper_wgt;
	}

	public void setInk_use_qunt(String ink_use_qunt){
		this.ink_use_qunt = ink_use_qunt;
	}

	public void setPrt_bgn_tm(String prt_bgn_tm){
		this.prt_bgn_tm = prt_bgn_tm;
	}

	public void setPrt_end_tm(String prt_end_tm){
		this.prt_end_tm = prt_end_tm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public String getFilm_use_qunt(){
		return this.film_use_qunt;
	}

	public String getPrd_cnt(){
		return this.prd_cnt;
	}

	public String getDest_fee(){
		return this.dest_fee;
	}

	public String getDest_qunt(){
		return this.dest_qunt;
	}

	public String getPaper_wgt(){
		return this.paper_wgt;
	}

	public String getInk_use_qunt(){
		return this.ink_use_qunt;
	}

	public String getPrt_bgn_tm(){
		return this.prt_bgn_tm;
	}

	public String getPrt_end_tm(){
		return this.prt_end_tm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}
}

/* 작성시간 : Tue Oct 06 11:16:41 KST 2009 */