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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_6000_LCURLIST12Record extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String appmt_nm;
	public String appmt_resn_nm;
	public String appmt_dt;
	public String mtry_dt;
	public String emp_clsf_nm;
	public String appmt_sort;
	public String base_saly;
	public String posk_saly;
	public String saly_stot;
	public String lvcmpy_acml_amt;
	public String bns_incd_servcost;
	public String appmt_cont;
	public String clos_proc_yn_nm;
	public String posk_clas_cd;
	public String posk_clas_nm;

	public HD_INFO_6000_LCURLIST12Record(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setAppmt_nm(String appmt_nm){
		this.appmt_nm = appmt_nm;
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

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setAppmt_sort(String appmt_sort){
		this.appmt_sort = appmt_sort;
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

	public void setAppmt_cont(String appmt_cont){
		this.appmt_cont = appmt_cont;
	}

	public void setClos_proc_yn_nm(String clos_proc_yn_nm){
		this.clos_proc_yn_nm = clos_proc_yn_nm;
	}

	public void setPosk_clas_cd(String posk_clas_cd){
		this.posk_clas_cd = posk_clas_cd;
	}

	public void setPosk_clas_nm(String posk_clas_nm){
		this.posk_clas_nm = posk_clas_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getAppmt_nm(){
		return this.appmt_nm;
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

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getAppmt_sort(){
		return this.appmt_sort;
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

	public String getAppmt_cont(){
		return this.appmt_cont;
	}

	public String getClos_proc_yn_nm(){
		return this.clos_proc_yn_nm;
	}

	public String getPosk_clas_cd(){
		return this.posk_clas_cd;
	}

	public String getPosk_clas_nm(){
		return this.posk_clas_nm;
	}
}

/* 작성시간 : Thu Aug 09 16:35:29 KST 2018 */