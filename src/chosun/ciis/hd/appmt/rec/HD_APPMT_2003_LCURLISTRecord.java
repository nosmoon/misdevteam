/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.appmt.rec;

import java.sql.*;
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.ds.*;

/**
 * 
 */


public class HD_APPMT_2003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String in_cmpy_dt;
	public String dept_cd;
	public String dept_nm;
	public String posi_nm;
	public String noti_dt;
	public String aply_fr_dt;
	public String aply_to_dt;
	public String prv_base_saly;
	public String prv_evngt_saly;
	public String prv_evlu_saly;
	public String prv_dty_acty_saly;
	public String aft_base_saly;
	public String aft_evngt_saly;
	public String aft_evlu_saly;
	public String aft_dty_acty_saly;
	public String diff_base_saly;
	public String diff_evngt_saly;
	public String diff_evlu_saly;
	public String diff_dty_acty_saly;
	public String sum_prv_amt;
	public String sum_aft_amt;
	public String sum_diff_amt;
	public String tot_sum_prv_amt;
	public String tot_sum_aft_amt;
	public String tot_sum_diff_amt;

	public HD_APPMT_2003_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setNoti_dt(String noti_dt){
		this.noti_dt = noti_dt;
	}

	public void setAply_fr_dt(String aply_fr_dt){
		this.aply_fr_dt = aply_fr_dt;
	}

	public void setAply_to_dt(String aply_to_dt){
		this.aply_to_dt = aply_to_dt;
	}

	public void setPrv_base_saly(String prv_base_saly){
		this.prv_base_saly = prv_base_saly;
	}

	public void setPrv_evngt_saly(String prv_evngt_saly){
		this.prv_evngt_saly = prv_evngt_saly;
	}

	public void setPrv_evlu_saly(String prv_evlu_saly){
		this.prv_evlu_saly = prv_evlu_saly;
	}

	public void setPrv_dty_acty_saly(String prv_dty_acty_saly){
		this.prv_dty_acty_saly = prv_dty_acty_saly;
	}

	public void setAft_base_saly(String aft_base_saly){
		this.aft_base_saly = aft_base_saly;
	}

	public void setAft_evngt_saly(String aft_evngt_saly){
		this.aft_evngt_saly = aft_evngt_saly;
	}

	public void setAft_evlu_saly(String aft_evlu_saly){
		this.aft_evlu_saly = aft_evlu_saly;
	}

	public void setAft_dty_acty_saly(String aft_dty_acty_saly){
		this.aft_dty_acty_saly = aft_dty_acty_saly;
	}

	public void setDiff_base_saly(String diff_base_saly){
		this.diff_base_saly = diff_base_saly;
	}

	public void setDiff_evngt_saly(String diff_evngt_saly){
		this.diff_evngt_saly = diff_evngt_saly;
	}

	public void setDiff_evlu_saly(String diff_evlu_saly){
		this.diff_evlu_saly = diff_evlu_saly;
	}

	public void setDiff_dty_acty_saly(String diff_dty_acty_saly){
		this.diff_dty_acty_saly = diff_dty_acty_saly;
	}

	public void setSum_prv_amt(String sum_prv_amt){
		this.sum_prv_amt = sum_prv_amt;
	}

	public void setSum_aft_amt(String sum_aft_amt){
		this.sum_aft_amt = sum_aft_amt;
	}

	public void setSum_diff_amt(String sum_diff_amt){
		this.sum_diff_amt = sum_diff_amt;
	}

	public void setTot_sum_prv_amt(String tot_sum_prv_amt){
		this.tot_sum_prv_amt = tot_sum_prv_amt;
	}

	public void setTot_sum_aft_amt(String tot_sum_aft_amt){
		this.tot_sum_aft_amt = tot_sum_aft_amt;
	}

	public void setTot_sum_diff_amt(String tot_sum_diff_amt){
		this.tot_sum_diff_amt = tot_sum_diff_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getNoti_dt(){
		return this.noti_dt;
	}

	public String getAply_fr_dt(){
		return this.aply_fr_dt;
	}

	public String getAply_to_dt(){
		return this.aply_to_dt;
	}

	public String getPrv_base_saly(){
		return this.prv_base_saly;
	}

	public String getPrv_evngt_saly(){
		return this.prv_evngt_saly;
	}

	public String getPrv_evlu_saly(){
		return this.prv_evlu_saly;
	}

	public String getPrv_dty_acty_saly(){
		return this.prv_dty_acty_saly;
	}

	public String getAft_base_saly(){
		return this.aft_base_saly;
	}

	public String getAft_evngt_saly(){
		return this.aft_evngt_saly;
	}

	public String getAft_evlu_saly(){
		return this.aft_evlu_saly;
	}

	public String getAft_dty_acty_saly(){
		return this.aft_dty_acty_saly;
	}

	public String getDiff_base_saly(){
		return this.diff_base_saly;
	}

	public String getDiff_evngt_saly(){
		return this.diff_evngt_saly;
	}

	public String getDiff_evlu_saly(){
		return this.diff_evlu_saly;
	}

	public String getDiff_dty_acty_saly(){
		return this.diff_dty_acty_saly;
	}

	public String getSum_prv_amt(){
		return this.sum_prv_amt;
	}

	public String getSum_aft_amt(){
		return this.sum_aft_amt;
	}

	public String getSum_diff_amt(){
		return this.sum_diff_amt;
	}

	public String getTot_sum_prv_amt(){
		return this.tot_sum_prv_amt;
	}

	public String getTot_sum_aft_amt(){
		return this.tot_sum_aft_amt;
	}

	public String getTot_sum_diff_amt(){
		return this.tot_sum_diff_amt;
	}
}

/* 작성시간 : Tue Jul 11 17:13:18 KST 2017 */