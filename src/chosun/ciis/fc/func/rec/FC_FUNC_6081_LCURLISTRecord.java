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


public class FC_FUNC_6081_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deps_isav_nm;
	public String cntr_amt;
	public String int_rate;
	public String comp_dt;
	public String mtry_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String compnm;
	public String pymt_mm;
	public String tot_pymt_amt;
	public String deps_isav_stat_cd_nm;

	public FC_FUNC_6081_LCURLISTRecord(){}

	public void setDeps_isav_nm(String deps_isav_nm){
		this.deps_isav_nm = deps_isav_nm;
	}

	public void setCntr_amt(String cntr_amt){
		this.cntr_amt = cntr_amt;
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

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setPymt_mm(String pymt_mm){
		this.pymt_mm = pymt_mm;
	}

	public void setTot_pymt_amt(String tot_pymt_amt){
		this.tot_pymt_amt = tot_pymt_amt;
	}

	public void setDeps_isav_stat_cd_nm(String deps_isav_stat_cd_nm){
		this.deps_isav_stat_cd_nm = deps_isav_stat_cd_nm;
	}

	public String getDeps_isav_nm(){
		return this.deps_isav_nm;
	}

	public String getCntr_amt(){
		return this.cntr_amt;
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

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getPymt_mm(){
		return this.pymt_mm;
	}

	public String getTot_pymt_amt(){
		return this.tot_pymt_amt;
	}

	public String getDeps_isav_stat_cd_nm(){
		return this.deps_isav_stat_cd_nm;
	}
}

/* 작성시간 : Mon Mar 09 14:11:50 KST 2009 */