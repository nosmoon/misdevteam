/***************************************************************************************************
* 파일명 : .java
* 기능 : 자재 - 마감관리 - 위탁인쇄현황
* 작성일자 : 2010-07-27
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.close.rec;

import java.sql.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */


public class MT_CLOSE_6130_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String fac_nm;
	public String medi_nm;
	public String prt_fee;
	public String psplat_use_amt;
	public String gnaw_fee;
	public String film_make_fee;
	public String pack_fee;
	public String paper_portage;
	public String gita_amt;
	public String tot_amt;

	public MT_CLOSE_6130_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setFac_nm(String fac_nm){
		this.fac_nm = fac_nm;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setPrt_fee(String prt_fee){
		this.prt_fee = prt_fee;
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

	public void setGita_amt(String gita_amt){
		this.gita_amt = gita_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getFac_nm(){
		return this.fac_nm;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getPrt_fee(){
		return this.prt_fee;
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

	public String getGita_amt(){
		return this.gita_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}
}

/* 작성시간 : Tue Jul 27 11:39:53 KST 2010 */