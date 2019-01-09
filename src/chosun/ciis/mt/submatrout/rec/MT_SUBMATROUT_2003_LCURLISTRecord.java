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


public class MT_SUBMATROUT_2003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String matr_nm;
	public String unit;
	public String mov_out_uprc;
	public String mov_in_budg_cd;
	public String mov_out_budg_cd;
	public String std_modl;
	public String safe_stok;
	public String hjg_cnt;
	public String cur_hjg_amt;
	public String mov_in_budg_acctcdnm;
	public String mov_out_budg_acctcdnm;
	public String dstb_rat_cd;

	public MT_SUBMATROUT_2003_LCURLISTRecord(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setMov_out_uprc(String mov_out_uprc){
		this.mov_out_uprc = mov_out_uprc;
	}

	public void setMov_in_budg_cd(String mov_in_budg_cd){
		this.mov_in_budg_cd = mov_in_budg_cd;
	}

	public void setMov_out_budg_cd(String mov_out_budg_cd){
		this.mov_out_budg_cd = mov_out_budg_cd;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public void setSafe_stok(String safe_stok){
		this.safe_stok = safe_stok;
	}

	public void setHjg_cnt(String hjg_cnt){
		this.hjg_cnt = hjg_cnt;
	}

	public void setCur_hjg_amt(String cur_hjg_amt){
		this.cur_hjg_amt = cur_hjg_amt;
	}

	public void setMov_in_budg_acctcdnm(String mov_in_budg_acctcdnm){
		this.mov_in_budg_acctcdnm = mov_in_budg_acctcdnm;
	}

	public void setMov_out_budg_acctcdnm(String mov_out_budg_acctcdnm){
		this.mov_out_budg_acctcdnm = mov_out_budg_acctcdnm;
	}

	public void setDstb_rat_cd(String dstb_rat_cd){
		this.dstb_rat_cd = dstb_rat_cd;
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

	public String getMov_out_uprc(){
		return this.mov_out_uprc;
	}

	public String getMov_in_budg_cd(){
		return this.mov_in_budg_cd;
	}

	public String getMov_out_budg_cd(){
		return this.mov_out_budg_cd;
	}

	public String getStd_modl(){
		return this.std_modl;
	}

	public String getSafe_stok(){
		return this.safe_stok;
	}

	public String getHjg_cnt(){
		return this.hjg_cnt;
	}

	public String getCur_hjg_amt(){
		return this.cur_hjg_amt;
	}

	public String getMov_in_budg_acctcdnm(){
		return this.mov_in_budg_acctcdnm;
	}

	public String getMov_out_budg_acctcdnm(){
		return this.mov_out_budg_acctcdnm;
	}

	public String getDstb_rat_cd(){
		return this.dstb_rat_cd;
	}
}

/* 작성시간 : Tue Mar 31 14:27:14 KST 2009 */