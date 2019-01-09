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


public class HD_SALY_4003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String lon_clsf_cd;
	public String lon_dt;
	public String flnm;
	public String repay_months;
	public String lon_prcp;
	public String yy_int_rate;
	public String lon_no;
	public String mm_pymt_dt;
	public String mm_pymt_prcp;
	public String int_dduc_avg;
	public String pymt_acml_tms;
	public String rmn_amt;
	public String end_yn;
	public String end_dt;
	public String prcp_dduc_amt_sum;
	public String int_dduc_amt_sum;
	public String dduc_dt_max;
	public String tot_amt_sum;

	public HD_SALY_4003_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
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

	public void setLon_clsf_cd(String lon_clsf_cd){
		this.lon_clsf_cd = lon_clsf_cd;
	}

	public void setLon_dt(String lon_dt){
		this.lon_dt = lon_dt;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setRepay_months(String repay_months){
		this.repay_months = repay_months;
	}

	public void setLon_prcp(String lon_prcp){
		this.lon_prcp = lon_prcp;
	}

	public void setYy_int_rate(String yy_int_rate){
		this.yy_int_rate = yy_int_rate;
	}

	public void setLon_no(String lon_no){
		this.lon_no = lon_no;
	}

	public void setMm_pymt_dt(String mm_pymt_dt){
		this.mm_pymt_dt = mm_pymt_dt;
	}

	public void setMm_pymt_prcp(String mm_pymt_prcp){
		this.mm_pymt_prcp = mm_pymt_prcp;
	}

	public void setInt_dduc_avg(String int_dduc_avg){
		this.int_dduc_avg = int_dduc_avg;
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

	public void setPrcp_dduc_amt_sum(String prcp_dduc_amt_sum){
		this.prcp_dduc_amt_sum = prcp_dduc_amt_sum;
	}

	public void setInt_dduc_amt_sum(String int_dduc_amt_sum){
		this.int_dduc_amt_sum = int_dduc_amt_sum;
	}

	public void setDduc_dt_max(String dduc_dt_max){
		this.dduc_dt_max = dduc_dt_max;
	}

	public void setTot_amt_sum(String tot_amt_sum){
		this.tot_amt_sum = tot_amt_sum;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
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

	public String getLon_clsf_cd(){
		return this.lon_clsf_cd;
	}

	public String getLon_dt(){
		return this.lon_dt;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getRepay_months(){
		return this.repay_months;
	}

	public String getLon_prcp(){
		return this.lon_prcp;
	}

	public String getYy_int_rate(){
		return this.yy_int_rate;
	}

	public String getLon_no(){
		return this.lon_no;
	}

	public String getMm_pymt_dt(){
		return this.mm_pymt_dt;
	}

	public String getMm_pymt_prcp(){
		return this.mm_pymt_prcp;
	}

	public String getInt_dduc_avg(){
		return this.int_dduc_avg;
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

	public String getPrcp_dduc_amt_sum(){
		return this.prcp_dduc_amt_sum;
	}

	public String getInt_dduc_amt_sum(){
		return this.int_dduc_amt_sum;
	}

	public String getDduc_dt_max(){
		return this.dduc_dt_max;
	}

	public String getTot_amt_sum(){
		return this.tot_amt_sum;
	}
}

/* 작성시간 : Fri Dec 18 14:30:36 KST 2009 */