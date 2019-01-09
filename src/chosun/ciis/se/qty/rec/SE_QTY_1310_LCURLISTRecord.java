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


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_1310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String team_nm;
	public String part_nm;
	public String area_nm;
	public String bo_nm;
	public String bo_cd;
	public String bo_seq;
	public String medi_nm;
	public int curmm_val_qty;
	public int curmm_no_val_qty;
	public int curmm_qty_tot;
	public String val_rate;
	public int send_qty;
	public int diff_qty;

	public SE_QTY_1310_LCURLISTRecord(){}

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

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setCurmm_val_qty(int curmm_val_qty){
		this.curmm_val_qty = curmm_val_qty;
	}

	public void setCurmm_no_val_qty(int curmm_no_val_qty){
		this.curmm_no_val_qty = curmm_no_val_qty;
	}

	public void setCurmm_qty_tot(int curmm_qty_tot){
		this.curmm_qty_tot = curmm_qty_tot;
	}

	public void setVal_rate(String val_rate){
		this.val_rate = val_rate;
	}

	public void setSend_qty(int send_qty){
		this.send_qty = send_qty;
	}

	public void setDiff_qty(int diff_qty){
		this.diff_qty = diff_qty;
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

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public int getCurmm_val_qty(){
		return this.curmm_val_qty;
	}

	public int getCurmm_no_val_qty(){
		return this.curmm_no_val_qty;
	}

	public int getCurmm_qty_tot(){
		return this.curmm_qty_tot;
	}

	public String getVal_rate(){
		return this.val_rate;
	}

	public int getSend_qty(){
		return this.send_qty;
	}

	public int getDiff_qty(){
		return this.diff_qty;
	}
}

/* 작성시간 : Tue Oct 01 14:38:14 KST 2013 */