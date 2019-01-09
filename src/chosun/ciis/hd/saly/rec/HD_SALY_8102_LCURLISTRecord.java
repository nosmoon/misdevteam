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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_8102_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String cd_nm;
	public String dept_cd;
	public String dept_nm;
	public String flnm;
	public String pens_clsf_nm;
	public String pens_aply_mm;
	public String welf_pens_amt;
	public String prsn_pens_amt;
	public String pens_stot;
	public String proc_stat;
	public String proc_stat_nm;
	public String remk;
	public String age;
	public String incmg_dt_tm;
	public String prn;
	public String phone_no;
	public String pymt_gubun_nm;
	public String prsn_sppt_amt;

	public HD_SALY_8102_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPens_clsf_nm(String pens_clsf_nm){
		this.pens_clsf_nm = pens_clsf_nm;
	}

	public void setPens_aply_mm(String pens_aply_mm){
		this.pens_aply_mm = pens_aply_mm;
	}

	public void setWelf_pens_amt(String welf_pens_amt){
		this.welf_pens_amt = welf_pens_amt;
	}

	public void setPrsn_pens_amt(String prsn_pens_amt){
		this.prsn_pens_amt = prsn_pens_amt;
	}

	public void setPens_stot(String pens_stot){
		this.pens_stot = pens_stot;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAge(String age){
		this.age = age;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPhone_no(String phone_no){
		this.phone_no = phone_no;
	}

	public void setPymt_gubun_nm(String pymt_gubun_nm){
		this.pymt_gubun_nm = pymt_gubun_nm;
	}

	public void setPrsn_sppt_amt(String prsn_sppt_amt){
		this.prsn_sppt_amt = prsn_sppt_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPens_clsf_nm(){
		return this.pens_clsf_nm;
	}

	public String getPens_aply_mm(){
		return this.pens_aply_mm;
	}

	public String getWelf_pens_amt(){
		return this.welf_pens_amt;
	}

	public String getPrsn_pens_amt(){
		return this.prsn_pens_amt;
	}

	public String getPens_stot(){
		return this.pens_stot;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getAge(){
		return this.age;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getPhone_no(){
		return this.phone_no;
	}

	public String getPymt_gubun_nm(){
		return this.pymt_gubun_nm;
	}

	public String getPrsn_sppt_amt(){
		return this.prsn_sppt_amt;
	}
}

/* 작성시간 : Fri Mar 04 16:02:31 KST 2016 */