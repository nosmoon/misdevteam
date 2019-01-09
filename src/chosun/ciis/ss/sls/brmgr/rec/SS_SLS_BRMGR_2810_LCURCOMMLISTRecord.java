/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2810_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String bo_nm;
	public String bo_cd;
	public String avg_send_qty;
	public String rdr_qty;
	public String auth_qty;
	public String susp_qty;
	public String oth_qty;
	public String hv_adj_qty;
	public String mn_adj_qty;
	public String stet_adj_qty;
	public String lv_adj_qty;
	public String area_adj_qty;
	public String adj_qty;
	public String adj_rate;

	public SS_SLS_BRMGR_2810_LCURCOMMLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setAvg_send_qty(String avg_send_qty){
		this.avg_send_qty = avg_send_qty;
	}

	public void setRdr_qty(String rdr_qty){
		this.rdr_qty = rdr_qty;
	}

	public void setAuth_qty(String auth_qty){
		this.auth_qty = auth_qty;
	}

	public void setSusp_qty(String susp_qty){
		this.susp_qty = susp_qty;
	}

	public void setOth_qty(String oth_qty){
		this.oth_qty = oth_qty;
	}

	public void setHv_adj_qty(String hv_adj_qty){
		this.hv_adj_qty = hv_adj_qty;
	}

	public void setMn_adj_qty(String mn_adj_qty){
		this.mn_adj_qty = mn_adj_qty;
	}

	public void setStet_adj_qty(String stet_adj_qty){
		this.stet_adj_qty = stet_adj_qty;
	}

	public void setLv_adj_qty(String lv_adj_qty){
		this.lv_adj_qty = lv_adj_qty;
	}

	public void setArea_adj_qty(String area_adj_qty){
		this.area_adj_qty = area_adj_qty;
	}

	public void setAdj_qty(String adj_qty){
		this.adj_qty = adj_qty;
	}

	public void setAdj_rate(String adj_rate){
		this.adj_rate = adj_rate;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getAvg_send_qty(){
		return this.avg_send_qty;
	}

	public String getRdr_qty(){
		return this.rdr_qty;
	}

	public String getAuth_qty(){
		return this.auth_qty;
	}

	public String getSusp_qty(){
		return this.susp_qty;
	}

	public String getOth_qty(){
		return this.oth_qty;
	}

	public String getHv_adj_qty(){
		return this.hv_adj_qty;
	}

	public String getMn_adj_qty(){
		return this.mn_adj_qty;
	}

	public String getStet_adj_qty(){
		return this.stet_adj_qty;
	}

	public String getLv_adj_qty(){
		return this.lv_adj_qty;
	}

	public String getArea_adj_qty(){
		return this.area_adj_qty;
	}

	public String getAdj_qty(){
		return this.adj_qty;
	}

	public String getAdj_rate(){
		return this.adj_rate;
	}
}

/* 작성시간 : Mon Feb 06 15:24:41 KST 2017 */