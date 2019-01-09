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


public class FC_FUNC_8031_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String cntr_clsf_cd;
	public String leas_clsf_cd;
	public String leas_no;
	public String leas_nm;
	public String frcr_amt;
	public String pay_plan_tms;
	public String leas_stat_cd;
	public String leas_stat_cdnm;
	public String pymt_cnt;
	public String leas_hire_clsf_cd;
	public String leas_hire_clsf_cdnm;

	public FC_FUNC_8031_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCntr_clsf_cd(String cntr_clsf_cd){
		this.cntr_clsf_cd = cntr_clsf_cd;
	}

	public void setLeas_clsf_cd(String leas_clsf_cd){
		this.leas_clsf_cd = leas_clsf_cd;
	}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setLeas_nm(String leas_nm){
		this.leas_nm = leas_nm;
	}

	public void setFrcr_amt(String frcr_amt){
		this.frcr_amt = frcr_amt;
	}

	public void setPay_plan_tms(String pay_plan_tms){
		this.pay_plan_tms = pay_plan_tms;
	}

	public void setLeas_stat_cd(String leas_stat_cd){
		this.leas_stat_cd = leas_stat_cd;
	}

	public void setLeas_stat_cdnm(String leas_stat_cdnm){
		this.leas_stat_cdnm = leas_stat_cdnm;
	}

	public void setPymt_cnt(String pymt_cnt){
		this.pymt_cnt = pymt_cnt;
	}

	public void setLeas_hire_clsf_cd(String leas_hire_clsf_cd){
		this.leas_hire_clsf_cd = leas_hire_clsf_cd;
	}

	public void setLeas_hire_clsf_cdnm(String leas_hire_clsf_cdnm){
		this.leas_hire_clsf_cdnm = leas_hire_clsf_cdnm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCntr_clsf_cd(){
		return this.cntr_clsf_cd;
	}

	public String getLeas_clsf_cd(){
		return this.leas_clsf_cd;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getLeas_nm(){
		return this.leas_nm;
	}

	public String getFrcr_amt(){
		return this.frcr_amt;
	}

	public String getPay_plan_tms(){
		return this.pay_plan_tms;
	}

	public String getLeas_stat_cd(){
		return this.leas_stat_cd;
	}

	public String getLeas_stat_cdnm(){
		return this.leas_stat_cdnm;
	}

	public String getPymt_cnt(){
		return this.pymt_cnt;
	}

	public String getLeas_hire_clsf_cd(){
		return this.leas_hire_clsf_cd;
	}

	public String getLeas_hire_clsf_cdnm(){
		return this.leas_hire_clsf_cdnm;
	}
}

/* 작성시간 : Wed Apr 01 11:24:24 KST 2009 */