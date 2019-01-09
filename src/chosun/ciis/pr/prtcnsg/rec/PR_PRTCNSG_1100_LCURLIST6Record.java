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


public class PR_PRTCNSG_1100_LCURLIST6Record extends java.lang.Object implements java.io.Serializable{

	public String film_make_fee;
	public String pack_fee;
	public String paper_portage;
	public String pj_basi_qty;
	public String prt_pj_rate_bw_1;
	public String prt_pj_rate_clr_1;
	public String prt_pj_rate_bw_2;
	public String prt_pj_rate_clr_2;
	public String paper_wgt;
	public String eps_no;

	public PR_PRTCNSG_1100_LCURLIST6Record(){}

	public void setFilm_make_fee(String film_make_fee){
		this.film_make_fee = film_make_fee;
	}

	public void setPack_fee(String pack_fee){
		this.pack_fee = pack_fee;
	}

	public void setPaper_portage(String paper_portage){
		this.paper_portage = paper_portage;
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

	public void setPaper_wgt(String paper_wgt){
		this.paper_wgt = paper_wgt;
	}

	public void setEps_no(String eps_no){
		this.eps_no = eps_no;
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

	public String getPaper_wgt(){
		return this.paper_wgt;
	}

	public String getEps_no(){
		return this.eps_no;
	}
}

/* 작성시간 : Wed Aug 26 16:34:34 KST 2009 */