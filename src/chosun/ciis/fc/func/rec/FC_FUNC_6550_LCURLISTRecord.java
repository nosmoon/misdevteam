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


public class FC_FUNC_6550_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deps_isav_clsf_cd;
	public String deps_isav_no;
	public String deps_isav_clsf_cdnm;
	public String tot_pymt_amt;
	public String comp_dt;
	public String mtry_dt;
	public String int_rate;
	public String mangiamt;

	public FC_FUNC_6550_LCURLISTRecord(){}

	public void setDeps_isav_clsf_cd(String deps_isav_clsf_cd){
		this.deps_isav_clsf_cd = deps_isav_clsf_cd;
	}

	public void setDeps_isav_no(String deps_isav_no){
		this.deps_isav_no = deps_isav_no;
	}

	public void setDeps_isav_clsf_cdnm(String deps_isav_clsf_cdnm){
		this.deps_isav_clsf_cdnm = deps_isav_clsf_cdnm;
	}

	public void setTot_pymt_amt(String tot_pymt_amt){
		this.tot_pymt_amt = tot_pymt_amt;
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

	public void setMangiamt(String mangiamt){
		this.mangiamt = mangiamt;
	}

	public String getDeps_isav_clsf_cd(){
		return this.deps_isav_clsf_cd;
	}

	public String getDeps_isav_no(){
		return this.deps_isav_no;
	}

	public String getDeps_isav_clsf_cdnm(){
		return this.deps_isav_clsf_cdnm;
	}

	public String getTot_pymt_amt(){
		return this.tot_pymt_amt;
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

	public String getMangiamt(){
		return this.mangiamt;
	}
}

/* 작성시간 : Thu Mar 19 14:03:34 KST 2009 */