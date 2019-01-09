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


package chosun.ciis.mt.submatrout.rec;

import java.sql.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 * 
 */


public class MT_SUBMATROUT_1102_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String matr_nm;
	public String unit;
	public String maeipdan;
	public String ewh_budg_cd;
	public String owh_budg_cd;
	public String std_modl;
	public String hjg_cnt;
	public String hjg_amt;
	public String igacctcdnm;
	public String cgacctcdnm;
	public String dstb_rat_cd;
	public String dept_cd;
	public String owh_type;
	public String prv_cnt;
	public String curdd_ewh_qunt;
	public String plan_dt;
	public String mm_qunt;

	public MT_SUBMATROUT_1102_LCURLIST1Record(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setMaeipdan(String maeipdan){
		this.maeipdan = maeipdan;
	}

	public void setEwh_budg_cd(String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public void setHjg_cnt(String hjg_cnt){
		this.hjg_cnt = hjg_cnt;
	}

	public void setHjg_amt(String hjg_amt){
		this.hjg_amt = hjg_amt;
	}

	public void setIgacctcdnm(String igacctcdnm){
		this.igacctcdnm = igacctcdnm;
	}

	public void setCgacctcdnm(String cgacctcdnm){
		this.cgacctcdnm = cgacctcdnm;
	}

	public void setDstb_rat_cd(String dstb_rat_cd){
		this.dstb_rat_cd = dstb_rat_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setOwh_type(String owh_type){
		this.owh_type = owh_type;
	}

	public void setPrv_cnt(String prv_cnt){
		this.prv_cnt = prv_cnt;
	}

	public void setCurdd_ewh_qunt(String curdd_ewh_qunt){
		this.curdd_ewh_qunt = curdd_ewh_qunt;
	}

	public void setPlan_dt(String plan_dt){
		this.plan_dt = plan_dt;
	}

	public void setMm_qunt(String mm_qunt){
		this.mm_qunt = mm_qunt;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getMaeipdan(){
		return this.maeipdan;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getStd_modl(){
		return this.std_modl;
	}

	public String getHjg_cnt(){
		return this.hjg_cnt;
	}

	public String getHjg_amt(){
		return this.hjg_amt;
	}

	public String getIgacctcdnm(){
		return this.igacctcdnm;
	}

	public String getCgacctcdnm(){
		return this.cgacctcdnm;
	}

	public String getDstb_rat_cd(){
		return this.dstb_rat_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getOwh_type(){
		return this.owh_type;
	}

	public String getPrv_cnt(){
		return this.prv_cnt;
	}

	public String getCurdd_ewh_qunt(){
		return this.curdd_ewh_qunt;
	}

	public String getPlan_dt(){
		return this.plan_dt;
	}

	public String getMm_qunt(){
		return this.mm_qunt;
	}
}

/* 작성시간 : Thu Oct 29 10:34:39 KST 2009 */