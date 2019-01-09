/***************************************************************************************************
* 파일명 : SE_SND_2620_LCURLISTRecord.java
* 기능 : 판매-발송관리-수송단가조회
* 작성일자 : 2009-02-24
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_2620_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tran_uprc_cd;
	public String aply_dt;
	public String tran_uprc_clas_nm;
	public String route_clsf_nm;
	public String tran_uprc_route_nm;
	public String prt_plac_nm;
	public String load_wgt;
	public String route_lgth;
	public String send_plac_nm;
	public String qty;
	public String tran_cost;
	
	public String getTran_cost() {
		return tran_cost;
	}

	public void setTran_cost(String tran_cost) {
		this.tran_cost = tran_cost;
	}

	public SE_SND_2620_LCURLISTRecord(){}

	public void setTran_uprc_cd(String tran_uprc_cd){
		this.tran_uprc_cd = tran_uprc_cd;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setTran_uprc_clas_nm(String tran_uprc_clas_nm){
		this.tran_uprc_clas_nm = tran_uprc_clas_nm;
	}

	public void setRoute_clsf_nm(String route_clsf_nm){
		this.route_clsf_nm = route_clsf_nm;
	}

	public void setTran_uprc_route_nm(String tran_uprc_route_nm){
		this.tran_uprc_route_nm = tran_uprc_route_nm;
	}

	public void setPrt_plac_nm(String prt_plac_nm){
		this.prt_plac_nm = prt_plac_nm;
	}

	public void setLoad_wgt(String load_wgt){
		this.load_wgt = load_wgt;
	}

	public void setRoute_lgth(String route_lgth){
		this.route_lgth = route_lgth;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public String getTran_uprc_cd(){
		return this.tran_uprc_cd;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getTran_uprc_clas_nm(){
		return this.tran_uprc_clas_nm;
	}

	public String getRoute_clsf_nm(){
		return this.route_clsf_nm;
	}

	public String getTran_uprc_route_nm(){
		return this.tran_uprc_route_nm;
	}

	public String getPrt_plac_nm(){
		return this.prt_plac_nm;
	}

	public String getLoad_wgt(){
		return this.load_wgt;
	}

	public String getRoute_lgth(){
		return this.route_lgth;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getQty(){
		return this.qty;
	}
}

/* 작성시간 : Tue Feb 24 13:25:25 KST 2009 */