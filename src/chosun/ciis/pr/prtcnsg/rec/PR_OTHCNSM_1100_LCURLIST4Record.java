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


public class PR_OTHCNSM_1100_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String prt_fee;
	public String paper_amt;
	public String psplat_use_amt;
	public String film_make_fee;
	public String gnaw_fee;
	public String pack_fee;
	public String paper_portage;
	public String total;
	public String clr_prt_fee;
	public String bw_prt_fee;

	public PR_OTHCNSM_1100_LCURLIST4Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPrt_fee(String prt_fee){
		this.prt_fee = prt_fee;
	}

	public void setPaper_amt(String paper_amt){
		this.paper_amt = paper_amt;
	}

	public void setPsplat_use_amt(String psplat_use_amt){
		this.psplat_use_amt = psplat_use_amt;
	}

	public void setFilm_make_fee(String film_make_fee){
		this.film_make_fee = film_make_fee;
	}

	public void setGnaw_fee(String gnaw_fee){
		this.gnaw_fee = gnaw_fee;
	}

	public void setPack_fee(String pack_fee){
		this.pack_fee = pack_fee;
	}

	public void setPaper_portage(String paper_portage){
		this.paper_portage = paper_portage;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public void setClr_prt_fee(String clr_prt_fee){
		this.clr_prt_fee = clr_prt_fee;
	}

	public void setBw_prt_fee(String bw_prt_fee){
		this.bw_prt_fee = bw_prt_fee;
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

	public String getPrt_fee(){
		return this.prt_fee;
	}

	public String getPaper_amt(){
		return this.paper_amt;
	}

	public String getPsplat_use_amt(){
		return this.psplat_use_amt;
	}

	public String getFilm_make_fee(){
		return this.film_make_fee;
	}

	public String getGnaw_fee(){
		return this.gnaw_fee;
	}

	public String getPack_fee(){
		return this.pack_fee;
	}

	public String getPaper_portage(){
		return this.paper_portage;
	}

	public String getTotal(){
		return this.total;
	}

	public String getClr_prt_fee(){
		return this.clr_prt_fee;
	}

	public String getBw_prt_fee(){
		return this.bw_prt_fee;
	}
}

/* 작성시간 : Wed Aug 26 16:34:34 KST 2009 */