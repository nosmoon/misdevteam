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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_4202_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String dept_cd;
	public String dept_nm;
	public String nm_korn;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String adv_clsf;
	public String adv_clsf_nm;
	public String adv_dt;
	public String mtry_months;
	public String adv_prcp;
	public String mm_pymt_prcp;
	public String pymt_acml_tms;
	public String rmn_amt;
	public String end_yn;
	public String end_dt;
	public String dduc_amt_sum;
	public String dduc_dt_max;

	public HD_SALY_4202_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setAdv_clsf(String adv_clsf){
		this.adv_clsf = adv_clsf;
	}

	public void setAdv_clsf_nm(String adv_clsf_nm){
		this.adv_clsf_nm = adv_clsf_nm;
	}

	public void setAdv_dt(String adv_dt){
		this.adv_dt = adv_dt;
	}

	public void setMtry_months(String mtry_months){
		this.mtry_months = mtry_months;
	}

	public void setAdv_prcp(String adv_prcp){
		this.adv_prcp = adv_prcp;
	}

	public void setMm_pymt_prcp(String mm_pymt_prcp){
		this.mm_pymt_prcp = mm_pymt_prcp;
	}

	public void setPymt_acml_tms(String pymt_acml_tms){
		this.pymt_acml_tms = pymt_acml_tms;
	}

	public void setRmn_amt(String rmn_amt){
		this.rmn_amt = rmn_amt;
	}

	public void setEnd_yn(String end_yn){
		this.end_yn = end_yn;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public void setDduc_amt_sum(String dduc_amt_sum){
		this.dduc_amt_sum = dduc_amt_sum;
	}

	public void setDduc_dt_max(String dduc_dt_max){
		this.dduc_dt_max = dduc_dt_max;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getAdv_clsf(){
		return this.adv_clsf;
	}

	public String getAdv_clsf_nm(){
		return this.adv_clsf_nm;
	}

	public String getAdv_dt(){
		return this.adv_dt;
	}

	public String getMtry_months(){
		return this.mtry_months;
	}

	public String getAdv_prcp(){
		return this.adv_prcp;
	}

	public String getMm_pymt_prcp(){
		return this.mm_pymt_prcp;
	}

	public String getPymt_acml_tms(){
		return this.pymt_acml_tms;
	}

	public String getRmn_amt(){
		return this.rmn_amt;
	}

	public String getEnd_yn(){
		return this.end_yn;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}

	public String getDduc_amt_sum(){
		return this.dduc_amt_sum;
	}

	public String getDduc_dt_max(){
		return this.dduc_dt_max;
	}
}

/* 작성시간 : Thu May 21 19:40:07 KST 2009 */