/***************************************************************************************************
* 파일명 : SE_COMM_2110_LCURLISTRecord.java
* 기능 :  수송단가 팝업
* 작성일자 : 2009.02.18
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.rec;

import java.sql.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */


public class SE_COMM_2110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tran_uprc_cd;
	public String aply_dt;
	public String tran_uprc_route_nm;
	public String tran_uprc_clas;
	public String tran_uprc_clas_nm;
	public String tran_cost;
	public String route_clsf;
	public String route_clsf_nm;
	public String route_cd;
	public String route_nm;
	public String prt_plac_cd;
	public String prt_plac_nm;
	public String load_wgt;
	public String route_lgth;
	
	public SE_COMM_2110_LCURLISTRecord(){}

	public void setTran_uprc_cd(String tran_uprc_cd){
		this.tran_uprc_cd = tran_uprc_cd;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setTran_uprc_route_nm(String tran_uprc_route_nm){
		this.tran_uprc_route_nm = tran_uprc_route_nm;
	}

	public void setTran_uprc_clas(String tran_uprc_clas){
		this.tran_uprc_clas = tran_uprc_clas;
	}

	public void setTran_uprc_clas_nm(String tran_uprc_clas_nm){
		this.tran_uprc_clas_nm = tran_uprc_clas_nm;
	}

	public void setTran_cost(String tran_cost){
		this.tran_cost = tran_cost;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setRoute_nm(String route_nm){
		this.route_nm = route_nm;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
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

	public String getTran_uprc_cd(){
		return this.tran_uprc_cd;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getTran_uprc_route_nm(){
		return this.tran_uprc_route_nm;
	}

	public String getTran_uprc_clas(){
		return this.tran_uprc_clas;
	}

	public String getTran_uprc_clas_nm(){
		return this.tran_uprc_clas_nm;
	}

	public String getTran_cost(){
		return this.tran_cost;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getRoute_nm(){
		return this.route_nm;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
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

	public String getRoute_clsf_nm() {
		return route_clsf_nm;
	}

	public void setRoute_clsf_nm(String route_clsf_nm) {
		this.route_clsf_nm = route_clsf_nm;
	}
}

/* 작성시간 : Wed Feb 18 10:26:50 KST 2009 */