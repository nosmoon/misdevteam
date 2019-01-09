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


public class PR_PAPMAKE_3201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf_nm;
	public String film_make_fee;
	public String pack_fee;
	public String psplat_fee_2p;
	public String psplat_fee_4p;
	public String gnaw_fee_2p;
	public String gnaw_fee_4p;
	public String paper_uprc;
	public String paper_portage;

	public PR_PAPMAKE_3201_LCURLISTRecord(){}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setFilm_make_fee(String film_make_fee){
		this.film_make_fee = film_make_fee;
	}

	public void setPack_fee(String pack_fee){
		this.pack_fee = pack_fee;
	}

	public void setPsplat_fee_2p(String psplat_fee_2p){
		this.psplat_fee_2p = psplat_fee_2p;
	}

	public void setPsplat_fee_4p(String psplat_fee_4p){
		this.psplat_fee_4p = psplat_fee_4p;
	}

	public void setGnaw_fee_2p(String gnaw_fee_2p){
		this.gnaw_fee_2p = gnaw_fee_2p;
	}

	public void setGnaw_fee_4p(String gnaw_fee_4p){
		this.gnaw_fee_4p = gnaw_fee_4p;
	}

	public void setPaper_uprc(String paper_uprc){
		this.paper_uprc = paper_uprc;
	}

	public void setPaper_portage(String paper_portage){
		this.paper_portage = paper_portage;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getFilm_make_fee(){
		return this.film_make_fee;
	}

	public String getPack_fee(){
		return this.pack_fee;
	}

	public String getPsplat_fee_2p(){
		return this.psplat_fee_2p;
	}

	public String getPsplat_fee_4p(){
		return this.psplat_fee_4p;
	}

	public String getGnaw_fee_2p(){
		return this.gnaw_fee_2p;
	}

	public String getGnaw_fee_4p(){
		return this.gnaw_fee_4p;
	}

	public String getPaper_uprc(){
		return this.paper_uprc;
	}

	public String getPaper_portage(){
		return this.paper_portage;
	}
}

/* 작성시간 : Fri May 20 10:23:58 KST 2016 */