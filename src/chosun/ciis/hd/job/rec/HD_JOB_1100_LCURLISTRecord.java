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


package chosun.ciis.hd.job.rec;

import java.sql.*;
import chosun.ciis.hd.job.dm.*;
import chosun.ciis.hd.job.ds.*;

/**
 * 
 */


public class HD_JOB_1100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String nm_korn;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String in_cmpy_psgp_cd;
	public String in_cmpy_octgr_cd;
	public String in_cmpy_posk_cd;
	public String in_cmpy_jobnon_nm;
	public String cur_cmpy_jobnon_nm;
	public String frdt;
	public String cur_jobforc_cd;
	public String cur_jobkind_cd;
	public String cur_jobnon_cd;
	public String cur_jobnon_nm;
	public String now_chrg_job;
	public String now_dtls_job;

	public HD_JOB_1100_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setIn_cmpy_psgp_cd(String in_cmpy_psgp_cd){
		this.in_cmpy_psgp_cd = in_cmpy_psgp_cd;
	}

	public void setIn_cmpy_octgr_cd(String in_cmpy_octgr_cd){
		this.in_cmpy_octgr_cd = in_cmpy_octgr_cd;
	}

	public void setIn_cmpy_posk_cd(String in_cmpy_posk_cd){
		this.in_cmpy_posk_cd = in_cmpy_posk_cd;
	}

	public void setIn_cmpy_jobnon_nm(String in_cmpy_jobnon_nm){
		this.in_cmpy_jobnon_nm = in_cmpy_jobnon_nm;
	}

	public void setCur_cmpy_jobnon_nm(String cur_cmpy_jobnon_nm){
		this.cur_cmpy_jobnon_nm = cur_cmpy_jobnon_nm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setCur_jobforc_cd(String cur_jobforc_cd){
		this.cur_jobforc_cd = cur_jobforc_cd;
	}

	public void setCur_jobkind_cd(String cur_jobkind_cd){
		this.cur_jobkind_cd = cur_jobkind_cd;
	}

	public void setCur_jobnon_cd(String cur_jobnon_cd){
		this.cur_jobnon_cd = cur_jobnon_cd;
	}

	public void setCur_jobnon_nm(String cur_jobnon_nm){
		this.cur_jobnon_nm = cur_jobnon_nm;
	}

	public void setNow_chrg_job(String now_chrg_job){
		this.now_chrg_job = now_chrg_job;
	}

	public void setNow_dtls_job(String now_dtls_job){
		this.now_dtls_job = now_dtls_job;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getIn_cmpy_psgp_cd(){
		return this.in_cmpy_psgp_cd;
	}

	public String getIn_cmpy_octgr_cd(){
		return this.in_cmpy_octgr_cd;
	}

	public String getIn_cmpy_posk_cd(){
		return this.in_cmpy_posk_cd;
	}

	public String getIn_cmpy_jobnon_nm(){
		return this.in_cmpy_jobnon_nm;
	}

	public String getCur_cmpy_jobnon_nm(){
		return this.cur_cmpy_jobnon_nm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getCur_jobforc_cd(){
		return this.cur_jobforc_cd;
	}

	public String getCur_jobkind_cd(){
		return this.cur_jobkind_cd;
	}

	public String getCur_jobnon_cd(){
		return this.cur_jobnon_cd;
	}

	public String getCur_jobnon_nm(){
		return this.cur_jobnon_nm;
	}

	public String getNow_chrg_job(){
		return this.now_chrg_job;
	}

	public String getNow_dtls_job(){
		return this.now_dtls_job;
	}
}

/* 작성시간 : Tue Jun 04 16:46:20 KST 2013 */