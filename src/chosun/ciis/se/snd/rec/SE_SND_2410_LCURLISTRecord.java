/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
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


public class SE_SND_2410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_dt;
	public String aply_dt_key;
	public String tran_uprc_clas;
	public String tran_uprc_cd;
	public String tran_uprc_route_nm;
	public String route_clsf;
	public String route_cd;
	public String route_nm;
	public String prt_plac_cd;
	public String route_lgth;
	public String load_wgt;
	public String tran_cost;
	public String tran_cost_ren;
	public String tran_uprc_qty_clsf;
	public String rmks;
	public String cnsg_seqo;
	public String use_yn;
	public String qty01;
	public String qty02;
	public String qty03;
	public String qty04;
	public String qty05;
	public String qty06;
	public String qty07;
	public String qty08;
	public String qty09;
	public String qty10;

	public SE_SND_2410_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setAply_dt_key(String aply_dt_key){
		this.aply_dt_key = aply_dt_key;
	}

	public void setTran_uprc_clas(String tran_uprc_clas){
		this.tran_uprc_clas = tran_uprc_clas;
	}

	public void setTran_uprc_cd(String tran_uprc_cd){
		this.tran_uprc_cd = tran_uprc_cd;
	}

	public void setTran_uprc_route_nm(String tran_uprc_route_nm){
		this.tran_uprc_route_nm = tran_uprc_route_nm;
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

	public void setRoute_lgth(String route_lgth){
		this.route_lgth = route_lgth;
	}

	public void setLoad_wgt(String load_wgt){
		this.load_wgt = load_wgt;
	}

	public void setTran_cost(String tran_cost){
		this.tran_cost = tran_cost;
	}

	public void setTran_cost_ren(String tran_cost_ren){
		this.tran_cost_ren = tran_cost_ren;
	}

	public void setTran_uprc_qty_clsf(String tran_uprc_qty_clsf){
		this.tran_uprc_qty_clsf = tran_uprc_qty_clsf;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setCnsg_seqo(String cnsg_seqo){
		this.cnsg_seqo = cnsg_seqo;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setQty01(String qty01){
		this.qty01 = qty01;
	}

	public void setQty02(String qty02){
		this.qty02 = qty02;
	}

	public void setQty03(String qty03){
		this.qty03 = qty03;
	}

	public void setQty04(String qty04){
		this.qty04 = qty04;
	}

	public void setQty05(String qty05){
		this.qty05 = qty05;
	}

	public void setQty06(String qty06){
		this.qty06 = qty06;
	}

	public void setQty07(String qty07){
		this.qty07 = qty07;
	}

	public void setQty08(String qty08){
		this.qty08 = qty08;
	}

	public void setQty09(String qty09){
		this.qty09 = qty09;
	}

	public void setQty10(String qty10){
		this.qty10 = qty10;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getAply_dt_key(){
		return this.aply_dt_key;
	}

	public String getTran_uprc_clas(){
		return this.tran_uprc_clas;
	}

	public String getTran_uprc_cd(){
		return this.tran_uprc_cd;
	}

	public String getTran_uprc_route_nm(){
		return this.tran_uprc_route_nm;
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

	public String getRoute_lgth(){
		return this.route_lgth;
	}

	public String getLoad_wgt(){
		return this.load_wgt;
	}

	public String getTran_cost(){
		return this.tran_cost;
	}

	public String getTran_cost_ren(){
		return this.tran_cost_ren;
	}

	public String getTran_uprc_qty_clsf(){
		return this.tran_uprc_qty_clsf;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getCnsg_seqo(){
		return this.cnsg_seqo;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getQty01(){
		return this.qty01;
	}

	public String getQty02(){
		return this.qty02;
	}

	public String getQty03(){
		return this.qty03;
	}

	public String getQty04(){
		return this.qty04;
	}

	public String getQty05(){
		return this.qty05;
	}

	public String getQty06(){
		return this.qty06;
	}

	public String getQty07(){
		return this.qty07;
	}

	public String getQty08(){
		return this.qty08;
	}

	public String getQty09(){
		return this.qty09;
	}

	public String getQty10(){
		return this.qty10;
	}
}

/* 작성시간 : Wed Sep 02 13:40:12 KST 2009 */