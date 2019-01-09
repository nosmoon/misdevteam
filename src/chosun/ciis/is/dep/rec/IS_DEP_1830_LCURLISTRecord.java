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


public class IS_DEP_1830_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sale_proc_dt;
	public String stmt_no;
	public String acwr_reg_dt_seq;
	public String dlco_nm;
	public String suply_amt;
	public String vat_amt;
	public String tot_rvord_amt;
	public String trc_unrcp_amt;
	public String chg_prv_dept_cd_nm;
	public String chg_prv_sub_dept_cd_nm;
	public String chg_prv_chrg_pers;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers;
	public String trc_reg_dt;
	public String incmg_pers;

	public IS_DEP_1830_LCURLISTRecord(){}

	public void setSale_proc_dt(String sale_proc_dt){
		this.sale_proc_dt = sale_proc_dt;
	}

	public void setStmt_no(String stmt_no){
		this.stmt_no = stmt_no;
	}

	public void setAcwr_reg_dt_seq(String acwr_reg_dt_seq){
		this.acwr_reg_dt_seq = acwr_reg_dt_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setTot_rvord_amt(String tot_rvord_amt){
		this.tot_rvord_amt = tot_rvord_amt;
	}

	public void setTrc_unrcp_amt(String trc_unrcp_amt){
		this.trc_unrcp_amt = trc_unrcp_amt;
	}

	public void setChg_prv_dept_cd_nm(String chg_prv_dept_cd_nm){
		this.chg_prv_dept_cd_nm = chg_prv_dept_cd_nm;
	}

	public void setChg_prv_sub_dept_cd_nm(String chg_prv_sub_dept_cd_nm){
		this.chg_prv_sub_dept_cd_nm = chg_prv_sub_dept_cd_nm;
	}

	public void setChg_prv_chrg_pers(String chg_prv_chrg_pers){
		this.chg_prv_chrg_pers = chg_prv_chrg_pers;
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

	public void setTrc_reg_dt(String trc_reg_dt){
		this.trc_reg_dt = trc_reg_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getSale_proc_dt(){
		return this.sale_proc_dt;
	}

	public String getStmt_no(){
		return this.stmt_no;
	}

	public String getAcwr_reg_dt_seq(){
		return this.acwr_reg_dt_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getTot_rvord_amt(){
		return this.tot_rvord_amt;
	}

	public String getTrc_unrcp_amt(){
		return this.trc_unrcp_amt;
	}

	public String getChg_prv_dept_cd_nm(){
		return this.chg_prv_dept_cd_nm;
	}

	public String getChg_prv_sub_dept_cd_nm(){
		return this.chg_prv_sub_dept_cd_nm;
	}

	public String getChg_prv_chrg_pers(){
		return this.chg_prv_chrg_pers;
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

	public String getTrc_reg_dt(){
		return this.trc_reg_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}
}

/* 작성시간 : Wed May 23 10:14:52 KST 2012 */