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


package chosun.ciis.hd.appmt.rec;

import java.sql.*;
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.ds.*;

/**
 * 
 */


public class HD_APPMT_1300_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String appmt_cd;
	public String appmt_nm;
	public String appmt_resn_cd;
	public String appmt_resn_nm;
	public String appmt_dt;
	public String mtry_dt;
	public String emp_clsf_cd;
	public String emp_clsf_nm;
	public String base_saly;
	public String posk_saly;
	public String saly_stot;
	public String lvcmpy_acml_amt;
	public String bns_incd_servcost;
	public String appmt_sort;
	public String appmt_cont;
	public String clos_proc_yn;
	public String clos_proc_yn_nm;
	public String seq;
	public String occr_dt;

	public HD_APPMT_1300_LCURLISTRecord(){}
	
	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setAppmt_cd(String appmt_cd){
		this.appmt_cd = appmt_cd;
	}

	public void setAppmt_nm(String appmt_nm){
		this.appmt_nm = appmt_nm;
	}

	public void setAppmt_resn_cd(String appmt_resn_cd){
		this.appmt_resn_cd = appmt_resn_cd;
	}

	public void setAppmt_resn_nm(String appmt_resn_nm){
		this.appmt_resn_nm = appmt_resn_nm;
	}

	public void setAppmt_dt(String appmt_dt){
		this.appmt_dt = appmt_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setEmp_clsf_cd(String emp_clsf_cd){
		this.emp_clsf_cd = emp_clsf_cd;
	}

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setPosk_saly(String posk_saly){
		this.posk_saly = posk_saly;
	}

	public void setSaly_stot(String saly_stot){
		this.saly_stot = saly_stot;
	}

	public void setLvcmpy_acml_amt(String lvcmpy_acml_amt){
		this.lvcmpy_acml_amt = lvcmpy_acml_amt;
	}

	public void setBns_incd_servcost(String bns_incd_servcost){
		this.bns_incd_servcost = bns_incd_servcost;
	}

	public void setAppmt_sort(String appmt_sort){
		this.appmt_sort = appmt_sort;
	}

	public void setAppmt_cont(String appmt_cont){
		this.appmt_cont = appmt_cont;
	}

	public void setClos_proc_yn(String clos_proc_yn){
		this.clos_proc_yn = clos_proc_yn;
	}

	public void setClos_proc_yn_nm(String clos_proc_yn_nm){
		this.clos_proc_yn_nm = clos_proc_yn_nm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
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

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getAppmt_cd(){
		return this.appmt_cd;
	}

	public String getAppmt_nm(){
		return this.appmt_nm;
	}

	public String getAppmt_resn_cd(){
		return this.appmt_resn_cd;
	}

	public String getAppmt_resn_nm(){
		return this.appmt_resn_nm;
	}

	public String getAppmt_dt(){
		return this.appmt_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getEmp_clsf_cd(){
		return this.emp_clsf_cd;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getPosk_saly(){
		return this.posk_saly;
	}

	public String getSaly_stot(){
		return this.saly_stot;
	}

	public String getLvcmpy_acml_amt(){
		return this.lvcmpy_acml_amt;
	}

	public String getBns_incd_servcost(){
		return this.bns_incd_servcost;
	}

	public String getAppmt_sort(){
		return this.appmt_sort;
	}

	public String getAppmt_cont(){
		return this.appmt_cont;
	}

	public String getClos_proc_yn(){
		return this.clos_proc_yn;
	}

	public String getClos_proc_yn_nm(){
		return this.clos_proc_yn_nm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}
}

/* 작성시간 : Sun Aug 30 18:04:10 KST 2009 */