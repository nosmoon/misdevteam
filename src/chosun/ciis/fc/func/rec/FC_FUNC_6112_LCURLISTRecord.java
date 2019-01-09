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


public class FC_FUNC_6112_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yejggbcdnm;
	public String deps_isav_no;
	public String comp_dt;
	public String mtry_dt;
	public String pymt_amt;
	public String rmks;
	public String ybjpno;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String yecompcdnm;

	public FC_FUNC_6112_LCURLISTRecord(){}

	public void setYejggbcdnm(String yejggbcdnm){
		this.yejggbcdnm = yejggbcdnm;
	}

	public void setDeps_isav_no(String deps_isav_no){
		this.deps_isav_no = deps_isav_no;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setPymt_amt(String pymt_amt){
		this.pymt_amt = pymt_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setYbjpno(String ybjpno){
		this.ybjpno = ybjpno;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setYecompcdnm(String yecompcdnm){
		this.yecompcdnm = yecompcdnm;
	}

	public String getYejggbcdnm(){
		return this.yejggbcdnm;
	}

	public String getDeps_isav_no(){
		return this.deps_isav_no;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getPymt_amt(){
		return this.pymt_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getYbjpno(){
		return this.ybjpno;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getYecompcdnm(){
		return this.yecompcdnm;
	}
}

/* 작성시간 : Mon Mar 16 13:09:44 KST 2009 */