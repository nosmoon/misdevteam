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


public class FC_FUNC_6101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deps_isav_clsf_cd;
	public String deps_isav_no;
	public String dlco_clsf_cd;
	public String pymt_mm;
	public String bicount;
	public String sumbiamt;
	public String comp_dt;
	public String mtry_dt;
	public String int_rate;
	public String cntr_amt;

	public FC_FUNC_6101_LCURLISTRecord(){}

	public void setDeps_isav_clsf_cd(String deps_isav_clsf_cd){
		this.deps_isav_clsf_cd = deps_isav_clsf_cd;
	}

	public void setDeps_isav_no(String deps_isav_no){
		this.deps_isav_no = deps_isav_no;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setPymt_mm(String pymt_mm){
		this.pymt_mm = pymt_mm;
	}

	public void setBicount(String bicount){
		this.bicount = bicount;
	}

	public void setSumbiamt(String sumbiamt){
		this.sumbiamt = sumbiamt;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setCntr_amt(String cntr_amt){
		this.cntr_amt = cntr_amt;
	}

	public String getDeps_isav_clsf_cd(){
		return this.deps_isav_clsf_cd;
	}

	public String getDeps_isav_no(){
		return this.deps_isav_no;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getPymt_mm(){
		return this.pymt_mm;
	}

	public String getBicount(){
		return this.bicount;
	}

	public String getSumbiamt(){
		return this.sumbiamt;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getCntr_amt(){
		return this.cntr_amt;
	}
}

/* 작성시간 : Wed Mar 04 12:03:51 KST 2009 */