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


public class IS_DEP_4010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String card_rcpm_reg_dt;
	public String card_rcpm_reg_seq;
	public String aprv_dt;
	public String tmnl_no;
	public String card_no;
	public String req_amt;
	public String aprv_no;
	public String card_cmpy_cd;
	public String card_clsf;
	public String coms;
	public String rcpm_amt;
	public String rcpm_dt;
	public String acct_mang_no;
	public String dlco_no;
	public String dlco_nm;
	public String setoff_suply_amt;
	public String setoff_vat_amt;
	public String setoff_tot_rvord_amt;
	public String proc_stat;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String card_cmpy_cd_nm;
	public String card_clsf_nm;
	public String proc_stat_nm;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers_nm;
	public String rcpm_slip_no;

	public IS_DEP_4010_LCURLISTRecord(){}

	public void setCard_rcpm_reg_dt(String card_rcpm_reg_dt){
		this.card_rcpm_reg_dt = card_rcpm_reg_dt;
	}

	public void setCard_rcpm_reg_seq(String card_rcpm_reg_seq){
		this.card_rcpm_reg_seq = card_rcpm_reg_seq;
	}

	public void setAprv_dt(String aprv_dt){
		this.aprv_dt = aprv_dt;
	}

	public void setTmnl_no(String tmnl_no){
		this.tmnl_no = tmnl_no;
	}

	public void setCard_no(String card_no){
		this.card_no = card_no;
	}

	public void setReq_amt(String req_amt){
		this.req_amt = req_amt;
	}

	public void setAprv_no(String aprv_no){
		this.aprv_no = aprv_no;
	}

	public void setCard_cmpy_cd(String card_cmpy_cd){
		this.card_cmpy_cd = card_cmpy_cd;
	}

	public void setCard_clsf(String card_clsf){
		this.card_clsf = card_clsf;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setAcct_mang_no(String acct_mang_no){
		this.acct_mang_no = acct_mang_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSetoff_suply_amt(String setoff_suply_amt){
		this.setoff_suply_amt = setoff_suply_amt;
	}

	public void setSetoff_vat_amt(String setoff_vat_amt){
		this.setoff_vat_amt = setoff_vat_amt;
	}

	public void setSetoff_tot_rvord_amt(String setoff_tot_rvord_amt){
		this.setoff_tot_rvord_amt = setoff_tot_rvord_amt;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setCard_cmpy_cd_nm(String card_cmpy_cd_nm){
		this.card_cmpy_cd_nm = card_cmpy_cd_nm;
	}

	public void setCard_clsf_nm(String card_clsf_nm){
		this.card_clsf_nm = card_clsf_nm;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setSub_dept_cd_nm(String sub_dept_cd_nm){
		this.sub_dept_cd_nm = sub_dept_cd_nm;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public String getCard_rcpm_reg_dt(){
		return this.card_rcpm_reg_dt;
	}

	public String getCard_rcpm_reg_seq(){
		return this.card_rcpm_reg_seq;
	}

	public String getAprv_dt(){
		return this.aprv_dt;
	}

	public String getTmnl_no(){
		return this.tmnl_no;
	}

	public String getCard_no(){
		return this.card_no;
	}

	public String getReq_amt(){
		return this.req_amt;
	}

	public String getAprv_no(){
		return this.aprv_no;
	}

	public String getCard_cmpy_cd(){
		return this.card_cmpy_cd;
	}

	public String getCard_clsf(){
		return this.card_clsf;
	}

	public String getComs(){
		return this.coms;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getAcct_mang_no(){
		return this.acct_mang_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSetoff_suply_amt(){
		return this.setoff_suply_amt;
	}

	public String getSetoff_vat_amt(){
		return this.setoff_vat_amt;
	}

	public String getSetoff_tot_rvord_amt(){
		return this.setoff_tot_rvord_amt;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getCard_cmpy_cd_nm(){
		return this.card_cmpy_cd_nm;
	}

	public String getCard_clsf_nm(){
		return this.card_clsf_nm;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getSub_dept_cd_nm(){
		return this.sub_dept_cd_nm;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}
}

/* 작성시간 : Mon Jul 09 22:51:35 KST 2012 */