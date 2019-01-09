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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_3301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf_nm;
	public String fac_clsf;
	public String psplat_2p;
	public String psplat_4p;
	public String prt_fee;
	public String paper_wgt;
	public String paper_amt;
	public String psplat_use_amt;
	public String gnaw_fee;
	public String film_make_fee;
	public String pack_fee;
	public String paper_portage;
	public String total;
	public String remk;

	public PR_PAPMAKE_3301_LCURLISTRecord(){}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPsplat_2p(String psplat_2p){
		this.psplat_2p = psplat_2p;
	}

	public void setPsplat_4p(String psplat_4p){
		this.psplat_4p = psplat_4p;
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

	public void setTotal(String total) {
		this.total = total;
	}
	
	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPsplat_2p(){
		return this.psplat_2p;
	}

	public String getPsplat_4p(){
		return this.psplat_4p;
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

	public String getRemk(){
		return this.remk;
	}

	public String getTotal() {
		return total;
	}

}

/* 작성시간 : Mon May 23 16:49:12 KST 2016 */