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


public class IS_DEP_3510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prof_type_cd_nm;
	public String sale_proc_dt;
	public String acwr_reg_dt_seq;
	public String dlco_no;
	public String dlco_nm;
	public String advt_nm;
	public String sale_clsf_nm;
	public String std_cd_nm;
	public String tot_rvord_amt;
	public String ms_amt;
	public String setoff_tot_rvord_amt;
	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String sale_dlco_li_seq;

	public IS_DEP_3510_LCURLISTRecord(){}

	public void setProf_type_cd_nm(String prof_type_cd_nm){
		this.prof_type_cd_nm = prof_type_cd_nm;
	}

	public void setSale_proc_dt(String sale_proc_dt){
		this.sale_proc_dt = sale_proc_dt;
	}

	public void setAcwr_reg_dt_seq(String acwr_reg_dt_seq){
		this.acwr_reg_dt_seq = acwr_reg_dt_seq;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvt_nm(String advt_nm){
		this.advt_nm = advt_nm;
	}

	public void setSale_clsf_nm(String sale_clsf_nm){
		this.sale_clsf_nm = sale_clsf_nm;
	}

	public void setStd_cd_nm(String std_cd_nm){
		this.std_cd_nm = std_cd_nm;
	}

	public void setTot_rvord_amt(String tot_rvord_amt){
		this.tot_rvord_amt = tot_rvord_amt;
	}

	public void setMs_amt(String ms_amt){
		this.ms_amt = ms_amt;
	}

	public void setSetoff_tot_rvord_amt(String setoff_tot_rvord_amt){
		this.setoff_tot_rvord_amt = setoff_tot_rvord_amt;
	}

	public void setAcwr_reg_dt(String acwr_reg_dt){
		this.acwr_reg_dt = acwr_reg_dt;
	}

	public void setAcwr_reg_seq(String acwr_reg_seq){
		this.acwr_reg_seq = acwr_reg_seq;
	}

	public void setSale_dlco_li_seq(String sale_dlco_li_seq){
		this.sale_dlco_li_seq = sale_dlco_li_seq;
	}

	public String getProf_type_cd_nm(){
		return this.prof_type_cd_nm;
	}

	public String getSale_proc_dt(){
		return this.sale_proc_dt;
	}

	public String getAcwr_reg_dt_seq(){
		return this.acwr_reg_dt_seq;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvt_nm(){
		return this.advt_nm;
	}

	public String getSale_clsf_nm(){
		return this.sale_clsf_nm;
	}

	public String getStd_cd_nm(){
		return this.std_cd_nm;
	}

	public String getTot_rvord_amt(){
		return this.tot_rvord_amt;
	}

	public String getMs_amt(){
		return this.ms_amt;
	}

	public String getSetoff_tot_rvord_amt(){
		return this.setoff_tot_rvord_amt;
	}

	public String getAcwr_reg_dt(){
		return this.acwr_reg_dt;
	}

	public String getAcwr_reg_seq(){
		return this.acwr_reg_seq;
	}

	public String getSale_dlco_li_seq(){
		return this.sale_dlco_li_seq;
	}
}

/* 작성시간 : Fri May 18 18:11:42 KST 2012 */