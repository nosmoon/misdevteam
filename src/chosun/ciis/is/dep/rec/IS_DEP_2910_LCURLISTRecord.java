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


package chosun.ciis.is.dep.rec;

import java.sql.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;

/**
 * 
 */


public class IS_DEP_2910_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tax_stmt_no;
	public String prof_type_cd_nm;
	public String make_dt;
	public String dlco_nm;
	public String ern;
	public String suply_amt;
	public String vat_amt;
	public String total_amt;
	public String erplace_cd_nm;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers;
	public String clamt_plan_dt;
	public String clamt_plan_dt_cnt;
	public String tot_rcpm_amt;
	public String misu_amt;

	public IS_DEP_2910_LCURLISTRecord(){}

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public void setProf_type_cd_nm(String prof_type_cd_nm){
		this.prof_type_cd_nm = prof_type_cd_nm;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setTotal_amt(String total_amt){
		this.total_amt = total_amt;
	}

	public void setErplace_cd_nm(String erplace_cd_nm){
		this.erplace_cd_nm = erplace_cd_nm;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setSub_dept_cd_nm(String sub_dept_cd_nm){
		this.sub_dept_cd_nm = sub_dept_cd_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setClamt_plan_dt(String clamt_plan_dt){
		this.clamt_plan_dt = clamt_plan_dt;
	}

	public void setClamt_plan_dt_cnt(String clamt_plan_dt_cnt){
		this.clamt_plan_dt_cnt = clamt_plan_dt_cnt;
	}

	public void setTot_rcpm_amt(String tot_rcpm_amt){
		this.tot_rcpm_amt = tot_rcpm_amt;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}

	public String getProf_type_cd_nm(){
		return this.prof_type_cd_nm;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getTotal_amt(){
		return this.total_amt;
	}

	public String getErplace_cd_nm(){
		return this.erplace_cd_nm;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getSub_dept_cd_nm(){
		return this.sub_dept_cd_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getClamt_plan_dt(){
		return this.clamt_plan_dt;
	}

	public String getClamt_plan_dt_cnt(){
		return this.clamt_plan_dt_cnt;
	}

	public String getTot_rcpm_amt(){
		return this.tot_rcpm_amt;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}
}

/* 작성시간 : Thu May 24 09:53:05 KST 2012 */