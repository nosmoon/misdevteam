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


public class SE_QTY_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String team_nm;
	public String part_nm;
	public String area_nm;
	public String bo_nm;
	public String bo_cd;
	public String bo_seq;
	public int prvmm_cntr_uprc;
	public int prvmm_val_qty;
	public int prvmm_no_val_qty;
	public int prvmm_qty_tot;
	public int gnr_enty_qty;
	public int isenty_qty;
	public int isicdc_qty;
	public int rdr_extn_enty_qty;
	public int val_movm_qty;
	public int val_icdc_qty;
	public int val_icdc_tot;
	public int curmm_val_qty;
	public int curmm_no_val_qty;
	public int curmm_issu_qty;
	public int no_val_icdc_qty;
	public int curmm_icdc_tot;
	public int isenty_qty2;
	public int rdr_extn_enty_qty2;

	public SE_QTY_1110_LCURLISTRecord(){}

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

	public void setPrvmm_cntr_uprc(int prvmm_cntr_uprc){
		this.prvmm_cntr_uprc = prvmm_cntr_uprc;
	}

	public void setPrvmm_val_qty(int prvmm_val_qty){
		this.prvmm_val_qty = prvmm_val_qty;
	}

	public void setPrvmm_no_val_qty(int prvmm_no_val_qty){
		this.prvmm_no_val_qty = prvmm_no_val_qty;
	}

	public void setPrvmm_qty_tot(int prvmm_qty_tot){
		this.prvmm_qty_tot = prvmm_qty_tot;
	}

	public void setGnr_enty_qty(int gnr_enty_qty){
		this.gnr_enty_qty = gnr_enty_qty;
	}

	public void setIsenty_qty(int isenty_qty){
		this.isenty_qty = isenty_qty;
	}

	public void setIsicdc_qty(int isicdc_qty){
		this.isicdc_qty = isicdc_qty;
	}

	public void setRdr_extn_enty_qty(int rdr_extn_enty_qty){
		this.rdr_extn_enty_qty = rdr_extn_enty_qty;
	}

	public void setVal_movm_qty(int val_movm_qty){
		this.val_movm_qty = val_movm_qty;
	}

	public void setVal_icdc_qty(int val_icdc_qty){
		this.val_icdc_qty = val_icdc_qty;
	}

	public void setVal_icdc_tot(int val_icdc_tot){
		this.val_icdc_tot = val_icdc_tot;
	}

	public void setCurmm_val_qty(int curmm_val_qty){
		this.curmm_val_qty = curmm_val_qty;
	}

	public void setCurmm_no_val_qty(int curmm_no_val_qty){
		this.curmm_no_val_qty = curmm_no_val_qty;
	}

	public void setCurmm_issu_qty(int curmm_issu_qty){
		this.curmm_issu_qty = curmm_issu_qty;
	}

	public void setNo_val_icdc_qty(int no_val_icdc_qty){
		this.no_val_icdc_qty = no_val_icdc_qty;
	}

	public void setCurmm_icdc_tot(int curmm_icdc_tot){
		this.curmm_icdc_tot = curmm_icdc_tot;
	}

	public void setIsenty_qty2(int isenty_qty2){
		this.isenty_qty2 = isenty_qty2;
	}

	public void setRdr_extn_enty_qty2(int rdr_extn_enty_qty2){
		this.rdr_extn_enty_qty2 = rdr_extn_enty_qty2;
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

	public int getPrvmm_cntr_uprc(){
		return this.prvmm_cntr_uprc;
	}

	public int getPrvmm_val_qty(){
		return this.prvmm_val_qty;
	}

	public int getPrvmm_no_val_qty(){
		return this.prvmm_no_val_qty;
	}

	public int getPrvmm_qty_tot(){
		return this.prvmm_qty_tot;
	}

	public int getGnr_enty_qty(){
		return this.gnr_enty_qty;
	}

	public int getIsenty_qty(){
		return this.isenty_qty;
	}

	public int getIsicdc_qty(){
		return this.isicdc_qty;
	}

	public int getRdr_extn_enty_qty(){
		return this.rdr_extn_enty_qty;
	}

	public int getVal_movm_qty(){
		return this.val_movm_qty;
	}

	public int getVal_icdc_qty(){
		return this.val_icdc_qty;
	}

	public int getVal_icdc_tot(){
		return this.val_icdc_tot;
	}

	public int getCurmm_val_qty(){
		return this.curmm_val_qty;
	}

	public int getCurmm_no_val_qty(){
		return this.curmm_no_val_qty;
	}

	public int getCurmm_issu_qty(){
		return this.curmm_issu_qty;
	}

	public int getNo_val_icdc_qty(){
		return this.no_val_icdc_qty;
	}

	public int getCurmm_icdc_tot(){
		return this.curmm_icdc_tot;
	}

	public int getIsenty_qty2(){
		return this.isenty_qty2;
	}

	public int getRdr_extn_enty_qty2(){
		return this.rdr_extn_enty_qty2;
	}
}

/* 작성시간 : Mon Jan 27 17:12:58 KST 2014 */