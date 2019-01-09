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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_2500_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String lon_clsf_cd;
	public String lon_clsf_nm;
	public String lon_dt;
	public String repay_months;
	public String lon_prcp;
	public String yy_int_rate;
	public String pymt_acml_tms;
	public String rmn_amt;

	public HD_LVCMPY_2500_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setLon_clsf_cd(String lon_clsf_cd){
		this.lon_clsf_cd = lon_clsf_cd;
	}

	public void setLon_clsf_nm(String lon_clsf_nm){
		this.lon_clsf_nm = lon_clsf_nm;
	}

	public void setLon_dt(String lon_dt){
		this.lon_dt = lon_dt;
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

	public void setPymt_acml_tms(String pymt_acml_tms){
		this.pymt_acml_tms = pymt_acml_tms;
	}

	public void setRmn_amt(String rmn_amt){
		this.rmn_amt = rmn_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getLon_clsf_cd(){
		return this.lon_clsf_cd;
	}

	public String getLon_clsf_nm(){
		return this.lon_clsf_nm;
	}

	public String getLon_dt(){
		return this.lon_dt;
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

	public String getPymt_acml_tms(){
		return this.pymt_acml_tms;
	}

	public String getRmn_amt(){
		return this.rmn_amt;
	}
}

/* 작성시간 : Tue Sep 08 15:45:40 KST 2009 */