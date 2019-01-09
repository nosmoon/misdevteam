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


public class FC_FUNC_6010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String banknm;
	public String deps_isav_clsf_cd_nm;
	public String deps_isav_no;
	public String mtry_dt;
	public String tot_pymt_amt;
	public String int_rate;
	public String ybjpno;
	public String deps_isav_clsf_cd;
	public String deps_isav_nm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String compnm;

	public FC_FUNC_6010_LCURLISTRecord(){}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setDeps_isav_clsf_cd_nm(String deps_isav_clsf_cd_nm){
		this.deps_isav_clsf_cd_nm = deps_isav_clsf_cd_nm;
	}

	public void setDeps_isav_no(String deps_isav_no){
		this.deps_isav_no = deps_isav_no;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setTot_pymt_amt(String tot_pymt_amt){
		this.tot_pymt_amt = tot_pymt_amt;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setYbjpno(String ybjpno){
		this.ybjpno = ybjpno;
	}

	public void setDeps_isav_clsf_cd(String deps_isav_clsf_cd){
		this.deps_isav_clsf_cd = deps_isav_clsf_cd;
	}

	public void setDeps_isav_nm(String deps_isav_nm){
		this.deps_isav_nm = deps_isav_nm;
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

	public String getBanknm(){
		return this.banknm;
	}

	public String getDeps_isav_clsf_cd_nm(){
		return this.deps_isav_clsf_cd_nm;
	}

	public String getDeps_isav_no(){
		return this.deps_isav_no;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getTot_pymt_amt(){
		return this.tot_pymt_amt;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getYbjpno(){
		return this.ybjpno;
	}

	public String getDeps_isav_clsf_cd(){
		return this.deps_isav_clsf_cd;
	}

	public String getDeps_isav_nm(){
		return this.deps_isav_nm;
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
}

/* 작성시간 : Mon Mar 16 17:48:40 KST 2009 */