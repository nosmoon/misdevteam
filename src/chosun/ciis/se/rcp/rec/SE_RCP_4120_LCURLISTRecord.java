/***************************************************************************************************
* 파일명 : .java
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


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_4120_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String dept_cd;
	public String dept_nm;
	public String part_cd;
	public String part_nm;
	public String area_cd;
	public String area_nm;
	public String bo_nm;
	public String jd_sell_net_clsf;
	public String bo_cd;
	public String bo_seq;
	public String srt_seq;
	public String curmm_issu_qty;
	public String curmm_val_qty;
	public String curmm_tot_qty;

	public SE_RCP_4120_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setJd_sell_net_clsf(String jd_sell_net_clsf){
		this.jd_sell_net_clsf = jd_sell_net_clsf;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setSrt_seq(String srt_seq){
		this.srt_seq = srt_seq;
	}

	public void setCurmm_issu_qty(String curmm_issu_qty){
		this.curmm_issu_qty = curmm_issu_qty;
	}

	public void setCurmm_val_qty(String curmm_val_qty){
		this.curmm_val_qty = curmm_val_qty;
	}

	public void setCurmm_tot_qty(String curmm_tot_qty){
		this.curmm_tot_qty = curmm_tot_qty;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getJd_sell_net_clsf(){
		return this.jd_sell_net_clsf;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getSrt_seq(){
		return this.srt_seq;
	}

	public String getCurmm_issu_qty(){
		return this.curmm_issu_qty;
	}

	public String getCurmm_val_qty(){
		return this.curmm_val_qty;
	}

	public String getCurmm_tot_qty(){
		return this.curmm_tot_qty;
	}
}

/* 작성시간 : Fri Sep 14 10:19:56 KST 2018 */