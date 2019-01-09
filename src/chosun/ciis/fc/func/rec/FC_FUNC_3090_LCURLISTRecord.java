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


public class FC_FUNC_3090_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deps_isav_clsf_cd;
	public String deps_isav_no;
	public String deps_isav_nm;
	public String comp_dt;
	public String mtry_dt;
	public String tot_pymt_amt;
	public String dlco_cd_nm;
	public String clsf_nm;
	public String prd_from;
	public String prd_end;
	public String int_rate;
	public String int_amt;
	public String clsf;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String yymm;
	public String seq;

	public FC_FUNC_3090_LCURLISTRecord(){}

	public void setDeps_isav_clsf_cd(String deps_isav_clsf_cd){
		this.deps_isav_clsf_cd = deps_isav_clsf_cd;
	}

	public void setDeps_isav_no(String deps_isav_no){
		this.deps_isav_no = deps_isav_no;
	}

	public void setDeps_isav_nm(String deps_isav_nm){
		this.deps_isav_nm = deps_isav_nm;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setTot_pymt_amt(String tot_pymt_amt){
		this.tot_pymt_amt = tot_pymt_amt;
	}

	public void setDlco_cd_nm(String dlco_cd_nm){
		this.dlco_cd_nm = dlco_cd_nm;
	}

	public void setClsf_nm(String clsf_nm){
		this.clsf_nm = clsf_nm;
	}

	public void setPrd_from(String prd_from){
		this.prd_from = prd_from;
	}

	public void setPrd_end(String prd_end){
		this.prd_end = prd_end;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setInt_amt(String int_amt){
		this.int_amt = int_amt;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getDeps_isav_clsf_cd(){
		return this.deps_isav_clsf_cd;
	}

	public String getDeps_isav_no(){
		return this.deps_isav_no;
	}

	public String getDeps_isav_nm(){
		return this.deps_isav_nm;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getTot_pymt_amt(){
		return this.tot_pymt_amt;
	}

	public String getDlco_cd_nm(){
		return this.dlco_cd_nm;
	}

	public String getClsf_nm(){
		return this.clsf_nm;
	}

	public String getPrd_from(){
		return this.prd_from;
	}

	public String getPrd_end(){
		return this.prd_end;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getInt_amt(){
		return this.int_amt;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Tue Jul 14 11:49:43 KST 2009 */