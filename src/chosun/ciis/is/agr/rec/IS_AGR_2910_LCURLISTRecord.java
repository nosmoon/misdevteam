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


package chosun.ciis.is.agr.rec;

import java.sql.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.ds.*;

/**
 * 
 */


public class IS_AGR_2910_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String proc_stat_nm;
	public String dlvs_dt;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers;
	public String dlco_nm;
	public String advcs_cd_nm;
	public String std_cd_nm;
	public String rcpm_clsf;
	public String rcpm_dt;
	public String rcpm_amt;
	public String suply_amt;
	public String card_coms;
	public String out_amt;
	public String im_amt;
	public String im_amt_rate;
	public String prz_rate_clsf_nm;
	public String prz_amt;
	public String prz_phb_saly_boks;
	public String make_ask_reg_dt;
	public String make_ask_reg_seq;

	public IS_AGR_2910_LCURLISTRecord(){}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setDlvs_dt(String dlvs_dt){
		this.dlvs_dt = dlvs_dt;
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

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvcs_cd_nm(String advcs_cd_nm){
		this.advcs_cd_nm = advcs_cd_nm;
	}

	public void setStd_cd_nm(String std_cd_nm){
		this.std_cd_nm = std_cd_nm;
	}

	public void setRcpm_clsf(String rcpm_clsf){
		this.rcpm_clsf = rcpm_clsf;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setCard_coms(String card_coms){
		this.card_coms = card_coms;
	}

	public void setOut_amt(String out_amt){
		this.out_amt = out_amt;
	}

	public void setIm_amt(String im_amt){
		this.im_amt = im_amt;
	}

	public void setIm_amt_rate(String im_amt_rate){
		this.im_amt_rate = im_amt_rate;
	}

	public void setPrz_rate_clsf_nm(String prz_rate_clsf_nm){
		this.prz_rate_clsf_nm = prz_rate_clsf_nm;
	}

	public void setPrz_amt(String prz_amt){
		this.prz_amt = prz_amt;
	}

	public void setPrz_phb_saly_boks(String prz_phb_saly_boks){
		this.prz_phb_saly_boks = prz_phb_saly_boks;
	}

	public void setMake_ask_reg_dt(String make_ask_reg_dt){
		this.make_ask_reg_dt = make_ask_reg_dt;
	}

	public void setMake_ask_reg_seq(String make_ask_reg_seq){
		this.make_ask_reg_seq = make_ask_reg_seq;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getDlvs_dt(){
		return this.dlvs_dt;
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

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvcs_cd_nm(){
		return this.advcs_cd_nm;
	}

	public String getStd_cd_nm(){
		return this.std_cd_nm;
	}

	public String getRcpm_clsf(){
		return this.rcpm_clsf;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getCard_coms(){
		return this.card_coms;
	}

	public String getOut_amt(){
		return this.out_amt;
	}

	public String getIm_amt(){
		return this.im_amt;
	}

	public String getIm_amt_rate(){
		return this.im_amt_rate;
	}

	public String getPrz_rate_clsf_nm(){
		return this.prz_rate_clsf_nm;
	}

	public String getPrz_amt(){
		return this.prz_amt;
	}

	public String getPrz_phb_saly_boks(){
		return this.prz_phb_saly_boks;
	}

	public String getMake_ask_reg_dt(){
		return this.make_ask_reg_dt;
	}

	public String getMake_ask_reg_seq(){
		return this.make_ask_reg_seq;
	}
}

/* 작성시간 : Thu Jun 07 10:25:53 KST 2012 */