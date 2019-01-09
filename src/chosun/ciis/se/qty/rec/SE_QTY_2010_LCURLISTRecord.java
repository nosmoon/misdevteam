/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_2010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String team_nm;
	public String part_nm;
	public String area_nm;
	public String bo_nm;
	public int prvdt_qty;
	public int curdt_qty;
	public int diff_qty;
	public int gnr_qty;
	public int spsl_qty;
	public int qty_tot;
	public int gnr_addm_qty;
	public int spsl_addm_qty;
	public int addm_qty_tot;

	public SE_QTY_2010_LCURLISTRecord(){}

	public void setTeam_nm(String team_nm){
		this.team_nm = team_nm;
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

	public void setPrvdt_qty(int prvdt_qty){
		this.prvdt_qty = prvdt_qty;
	}

	public void setCurdt_qty(int curdt_qty){
		this.curdt_qty = curdt_qty;
	}

	public void setDiff_qty(int diff_qty){
		this.diff_qty = diff_qty;
	}

	public void setGnr_qty(int gnr_qty){
		this.gnr_qty = gnr_qty;
	}

	public void setSpsl_qty(int spsl_qty){
		this.spsl_qty = spsl_qty;
	}

	public void setQty_tot(int qty_tot){
		this.qty_tot = qty_tot;
	}

	public void setGnr_addm_qty(int gnr_addm_qty){
		this.gnr_addm_qty = gnr_addm_qty;
	}

	public void setSpsl_addm_qty(int spsl_addm_qty){
		this.spsl_addm_qty = spsl_addm_qty;
	}

	public void setAddm_qty_tot(int addm_qty_tot){
		this.addm_qty_tot = addm_qty_tot;
	}

	public String getTeam_nm(){
		return this.team_nm;
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

	public int getPrvdt_qty(){
		return this.prvdt_qty;
	}

	public int getCurdt_qty(){
		return this.curdt_qty;
	}

	public int getDiff_qty(){
		return this.diff_qty;
	}

	public int getGnr_qty(){
		return this.gnr_qty;
	}

	public int getSpsl_qty(){
		return this.spsl_qty;
	}

	public int getQty_tot(){
		return this.qty_tot;
	}

	public int getGnr_addm_qty(){
		return this.gnr_addm_qty;
	}

	public int getSpsl_addm_qty(){
		return this.spsl_addm_qty;
	}

	public int getAddm_qty_tot(){
		return this.addm_qty_tot;
	}
}

/* 작성시간 : Mon Mar 02 17:23:25 KST 2009 */