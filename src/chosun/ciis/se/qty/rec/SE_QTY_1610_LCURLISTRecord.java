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


public class SE_QTY_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String team_nm;
	public String part_nm;
	public String area_nm;
	public String bo_nm;
	public String medi_nm;
	public int prvmm_val_qty;
	public int val_icdc_qty;
	public int curmm_val_qty;
	public int avg_qty;
	public String val_rate;
	public int icdc_qty;

	public SE_QTY_1610_LCURLISTRecord(){}

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

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setPrvmm_val_qty(int prvmm_val_qty){
		this.prvmm_val_qty = prvmm_val_qty;
	}

	public void setVal_icdc_qty(int val_icdc_qty){
		this.val_icdc_qty = val_icdc_qty;
	}

	public void setCurmm_val_qty(int curmm_val_qty){
		this.curmm_val_qty = curmm_val_qty;
	}

	public void setAvg_qty(int avg_qty){
		this.avg_qty = avg_qty;
	}

	public void setVal_rate(String val_rate){
		this.val_rate = val_rate;
	}

	public void setIcdc_qty(int icdc_qty){
		this.icdc_qty = icdc_qty;
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

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public int getPrvmm_val_qty(){
		return this.prvmm_val_qty;
	}

	public int getVal_icdc_qty(){
		return this.val_icdc_qty;
	}

	public int getCurmm_val_qty(){
		return this.curmm_val_qty;
	}

	public int getAvg_qty(){
		return this.avg_qty;
	}

	public String getVal_rate(){
		return this.val_rate;
	}

	public int getIcdc_qty(){
		return this.icdc_qty;
	}
}

/* 작성시간 : Fri Feb 20 14:01:01 KST 2009 */