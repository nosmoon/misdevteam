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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_6021_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deps_isav_nm;
	public String tot_pymt_amt;
	public String int_rate;
	public String comp_dt;
	public String mtry_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String compnm;
	public String rmks;
	public String mm_int;
	public String tot_int;
	public String jpno;
	public String deps_isav_stat_cdnm;
	public String deps_isav_stat_cd;

	public FC_FUNC_6021_LCURLISTRecord(){}

	public void setDeps_isav_nm(String deps_isav_nm){
		this.deps_isav_nm = deps_isav_nm;
	}

	public void setTot_pymt_amt(String tot_pymt_amt){
		this.tot_pymt_amt = tot_pymt_amt;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setMm_int(String mm_int){
		this.mm_int = mm_int;
	}

	public void setTot_int(String tot_int){
		this.tot_int = tot_int;
	}

	public void setJpno(String jpno){
		this.jpno = jpno;
	}

	public void setDeps_isav_stat_cdnm(String deps_isav_stat_cdnm){
		this.deps_isav_stat_cdnm = deps_isav_stat_cdnm;
	}

	public void setDeps_isav_stat_cd(String deps_isav_stat_cd){
		this.deps_isav_stat_cd = deps_isav_stat_cd;
	}

	public String getDeps_isav_nm(){
		return this.deps_isav_nm;
	}

	public String getTot_pymt_amt(){
		return this.tot_pymt_amt;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getMm_int(){
		return this.mm_int;
	}

	public String getTot_int(){
		return this.tot_int;
	}

	public String getJpno(){
		return this.jpno;
	}

	public String getDeps_isav_stat_cdnm(){
		return this.deps_isav_stat_cdnm;
	}

	public String getDeps_isav_stat_cd(){
		return this.deps_isav_stat_cd;
	}
}

/* 작성시간 : Tue Mar 17 14:14:56 KST 2009 */