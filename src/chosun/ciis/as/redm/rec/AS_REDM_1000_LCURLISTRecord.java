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


package chosun.ciis.as.redm.rec;

import java.sql.*;
import chosun.ciis.as.redm.dm.*;
import chosun.ciis.as.redm.ds.*;

/**
 * 
 */


public class AS_REDM_1000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aset_no;
	public String aset_nm;
	public String aset_stat;
	public String aset_stat_nm;
	public String acqr_dt;
	public String sale_dt;
	public String redm_mthd_cd;
	public String redm_mthd_nm;
	public String svc_yys_cnt;
	public String redm_rate;
	public String cur_acqr_amt;
	public String pre_redm_agg_amt;
	public String tot_redm_amt;
	public String um_redm_amt;
	public String cur_redm_agg_amt;
	public String thmm_redm_amt;
	public String redm_stat_cd;
	public String redm_stat_nm;
	public String dept_cd;
	public String dept_nm;
	public String budg_cd;
	public String budg_nm;
	public String redm_dt;
	public String cmpy_cd;
	public String redm_yymm;

	public AS_REDM_1000_LCURLISTRecord(){}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setAset_stat(String aset_stat){
		this.aset_stat = aset_stat;
	}

	public void setAset_stat_nm(String aset_stat_nm){
		this.aset_stat_nm = aset_stat_nm;
	}

	public void setAcqr_dt(String acqr_dt){
		this.acqr_dt = acqr_dt;
	}

	public void setSale_dt(String sale_dt){
		this.sale_dt = sale_dt;
	}

	public void setRedm_mthd_cd(String redm_mthd_cd){
		this.redm_mthd_cd = redm_mthd_cd;
	}

	public void setRedm_mthd_nm(String redm_mthd_nm){
		this.redm_mthd_nm = redm_mthd_nm;
	}

	public void setSvc_yys_cnt(String svc_yys_cnt){
		this.svc_yys_cnt = svc_yys_cnt;
	}

	public void setRedm_rate(String redm_rate){
		this.redm_rate = redm_rate;
	}

	public void setCur_acqr_amt(String cur_acqr_amt){
		this.cur_acqr_amt = cur_acqr_amt;
	}

	public void setPre_redm_agg_amt(String pre_redm_agg_amt){
		this.pre_redm_agg_amt = pre_redm_agg_amt;
	}

	public void setTot_redm_amt(String tot_redm_amt){
		this.tot_redm_amt = tot_redm_amt;
	}

	public void setUm_redm_amt(String um_redm_amt){
		this.um_redm_amt = um_redm_amt;
	}

	public void setCur_redm_agg_amt(String cur_redm_agg_amt){
		this.cur_redm_agg_amt = cur_redm_agg_amt;
	}

	public void setThmm_redm_amt(String thmm_redm_amt){
		this.thmm_redm_amt = thmm_redm_amt;
	}

	public void setRedm_stat_cd(String redm_stat_cd){
		this.redm_stat_cd = redm_stat_cd;
	}

	public void setRedm_stat_nm(String redm_stat_nm){
		this.redm_stat_nm = redm_stat_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setRedm_dt(String redm_dt){
		this.redm_dt = redm_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRedm_yymm(String redm_yymm){
		this.redm_yymm = redm_yymm;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getAset_stat(){
		return this.aset_stat;
	}

	public String getAset_stat_nm(){
		return this.aset_stat_nm;
	}

	public String getAcqr_dt(){
		return this.acqr_dt;
	}

	public String getSale_dt(){
		return this.sale_dt;
	}

	public String getRedm_mthd_cd(){
		return this.redm_mthd_cd;
	}

	public String getRedm_mthd_nm(){
		return this.redm_mthd_nm;
	}

	public String getSvc_yys_cnt(){
		return this.svc_yys_cnt;
	}

	public String getRedm_rate(){
		return this.redm_rate;
	}

	public String getCur_acqr_amt(){
		return this.cur_acqr_amt;
	}

	public String getPre_redm_agg_amt(){
		return this.pre_redm_agg_amt;
	}

	public String getTot_redm_amt(){
		return this.tot_redm_amt;
	}

	public String getUm_redm_amt(){
		return this.um_redm_amt;
	}

	public String getCur_redm_agg_amt(){
		return this.cur_redm_agg_amt;
	}

	public String getThmm_redm_amt(){
		return this.thmm_redm_amt;
	}

	public String getRedm_stat_cd(){
		return this.redm_stat_cd;
	}

	public String getRedm_stat_nm(){
		return this.redm_stat_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getRedm_dt(){
		return this.redm_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRedm_yymm(){
		return this.redm_yymm;
	}
}

/* 작성시간 : Fri May 08 16:32:49 KST 2009 */