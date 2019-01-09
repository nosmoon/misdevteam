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


public class PR_PAPMAKE_4000_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String basi_prt_qty;
	public String basi_excs_qty;
	public String base_servcost;
	public String basi_excs_servcost;
	public String basi_ovt_prt_qty;
	public String basi_sep_prtn_servcost;
	public String base_make_servcost;
	public String basi_make_pcnt;
	public String basi_excs_pcnt;
	public String basi_excs_make_servcost;
	public String crps_cost;

	public PR_PAPMAKE_4000_LCURLIST2Record(){}

	public void setBasi_prt_qty(String basi_prt_qty){
		this.basi_prt_qty = basi_prt_qty;
	}

	public void setBasi_excs_qty(String basi_excs_qty){
		this.basi_excs_qty = basi_excs_qty;
	}

	public void setBase_servcost(String base_servcost){
		this.base_servcost = base_servcost;
	}

	public void setBasi_excs_servcost(String basi_excs_servcost){
		this.basi_excs_servcost = basi_excs_servcost;
	}

	public void setBasi_ovt_prt_qty(String basi_ovt_prt_qty){
		this.basi_ovt_prt_qty = basi_ovt_prt_qty;
	}

	public void setBasi_sep_prtn_servcost(String basi_sep_prtn_servcost){
		this.basi_sep_prtn_servcost = basi_sep_prtn_servcost;
	}

	public void setBase_make_servcost(String base_make_servcost){
		this.base_make_servcost = base_make_servcost;
	}

	public void setBasi_make_pcnt(String basi_make_pcnt){
		this.basi_make_pcnt = basi_make_pcnt;
	}

	public void setBasi_excs_pcnt(String basi_excs_pcnt){
		this.basi_excs_pcnt = basi_excs_pcnt;
	}

	public void setBasi_excs_make_servcost(String basi_excs_make_servcost){
		this.basi_excs_make_servcost = basi_excs_make_servcost;
	}

	public void setCrps_cost(String crps_cost){
		this.crps_cost = crps_cost;
	}

	public String getBasi_prt_qty(){
		return this.basi_prt_qty;
	}

	public String getBasi_excs_qty(){
		return this.basi_excs_qty;
	}

	public String getBase_servcost(){
		return this.base_servcost;
	}

	public String getBasi_excs_servcost(){
		return this.basi_excs_servcost;
	}

	public String getBasi_ovt_prt_qty(){
		return this.basi_ovt_prt_qty;
	}

	public String getBasi_sep_prtn_servcost(){
		return this.basi_sep_prtn_servcost;
	}

	public String getBase_make_servcost(){
		return this.base_make_servcost;
	}

	public String getBasi_make_pcnt(){
		return this.basi_make_pcnt;
	}

	public String getBasi_excs_pcnt(){
		return this.basi_excs_pcnt;
	}

	public String getBasi_excs_make_servcost(){
		return this.basi_excs_make_servcost;
	}

	public String getCrps_cost(){
		return this.crps_cost;
	}
}

/* 작성시간 : Tue Aug 25 15:07:42 KST 2009 */