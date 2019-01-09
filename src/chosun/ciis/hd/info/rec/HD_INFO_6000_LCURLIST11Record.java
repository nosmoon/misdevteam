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


public class HD_INFO_6000_LCURLIST11Record extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String appmt_nm;
	public String appmt_resn_nm;
	public String appmt_dt;
	public String mtry_dt;
	public String emp_clsf_nm;
	public String dty_nm;
	public String posi_nm;
	public String emp_dtls_clsf_nm;
	public String appmt_sort;
	public String appmt_cont;
	public String appmt_stat_clsf;

	public HD_INFO_6000_LCURLIST11Record(){}

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

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setEmp_dtls_clsf_nm(String emp_dtls_clsf_nm){
		this.emp_dtls_clsf_nm = emp_dtls_clsf_nm;
	}

	public void setAppmt_sort(String appmt_sort){
		this.appmt_sort = appmt_sort;
	}

	public void setAppmt_cont(String appmt_cont){
		this.appmt_cont = appmt_cont;
	}

	public void setAppmt_stat_clsf(String appmt_stat_clsf){
		this.appmt_stat_clsf = appmt_stat_clsf;
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

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getEmp_dtls_clsf_nm(){
		return this.emp_dtls_clsf_nm;
	}

	public String getAppmt_sort(){
		return this.appmt_sort;
	}

	public String getAppmt_cont(){
		return this.appmt_cont;
	}

	public String getAppmt_stat_clsf(){
		return this.appmt_stat_clsf;
	}
}

/* 작성시간 : Thu Aug 09 16:35:29 KST 2018 */