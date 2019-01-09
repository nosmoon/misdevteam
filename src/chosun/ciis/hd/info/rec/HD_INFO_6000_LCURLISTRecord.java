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


public class HD_INFO_6000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String nm_korn;
	public String prn;
	public String nm_chin;
	public String nm_engl;
	public String emp_dtls_clsf;
	public String emp_dtls_clsf_nm;
	public String in_cmpy_dt;
	public String emp_clsf_cd;
	public String emp_clsf_nm;
	public String cmpy_cd_nm;
	public String dspch_enpr_main_clsf;
	public String dept_cd;
	public String dept_nm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String alon_pay_dept_yn;
	public String addm_dept_cd;
	public String addm_dept_nm;
	public String addm_dty_cd;
	public String addm_dty_nm;
	public String addm_posi_cd;
	public String addm_posi_nm;
	public String addm_alon_pay_dept_yn;

	public HD_INFO_6000_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setNm_chin(String nm_chin){
		this.nm_chin = nm_chin;
	}

	public void setNm_engl(String nm_engl){
		this.nm_engl = nm_engl;
	}

	public void setEmp_dtls_clsf(String emp_dtls_clsf){
		this.emp_dtls_clsf = emp_dtls_clsf;
	}

	public void setEmp_dtls_clsf_nm(String emp_dtls_clsf_nm){
		this.emp_dtls_clsf_nm = emp_dtls_clsf_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setEmp_clsf_cd(String emp_clsf_cd){
		this.emp_clsf_cd = emp_clsf_cd;
	}

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setCmpy_cd_nm(String cmpy_cd_nm){
		this.cmpy_cd_nm = cmpy_cd_nm;
	}

	public void setDspch_enpr_main_clsf(String dspch_enpr_main_clsf){
		this.dspch_enpr_main_clsf = dspch_enpr_main_clsf;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setAlon_pay_dept_yn(String alon_pay_dept_yn){
		this.alon_pay_dept_yn = alon_pay_dept_yn;
	}

	public void setAddm_dept_cd(String addm_dept_cd){
		this.addm_dept_cd = addm_dept_cd;
	}

	public void setAddm_dept_nm(String addm_dept_nm){
		this.addm_dept_nm = addm_dept_nm;
	}

	public void setAddm_dty_cd(String addm_dty_cd){
		this.addm_dty_cd = addm_dty_cd;
	}

	public void setAddm_dty_nm(String addm_dty_nm){
		this.addm_dty_nm = addm_dty_nm;
	}

	public void setAddm_posi_cd(String addm_posi_cd){
		this.addm_posi_cd = addm_posi_cd;
	}

	public void setAddm_posi_nm(String addm_posi_nm){
		this.addm_posi_nm = addm_posi_nm;
	}

	public void setAddm_alon_pay_dept_yn(String addm_alon_pay_dept_yn){
		this.addm_alon_pay_dept_yn = addm_alon_pay_dept_yn;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getNm_chin(){
		return this.nm_chin;
	}

	public String getNm_engl(){
		return this.nm_engl;
	}

	public String getEmp_dtls_clsf(){
		return this.emp_dtls_clsf;
	}

	public String getEmp_dtls_clsf_nm(){
		return this.emp_dtls_clsf_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getEmp_clsf_cd(){
		return this.emp_clsf_cd;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getCmpy_cd_nm(){
		return this.cmpy_cd_nm;
	}

	public String getDspch_enpr_main_clsf(){
		return this.dspch_enpr_main_clsf;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getAlon_pay_dept_yn(){
		return this.alon_pay_dept_yn;
	}

	public String getAddm_dept_cd(){
		return this.addm_dept_cd;
	}

	public String getAddm_dept_nm(){
		return this.addm_dept_nm;
	}

	public String getAddm_dty_cd(){
		return this.addm_dty_cd;
	}

	public String getAddm_dty_nm(){
		return this.addm_dty_nm;
	}

	public String getAddm_posi_cd(){
		return this.addm_posi_cd;
	}

	public String getAddm_posi_nm(){
		return this.addm_posi_nm;
	}

	public String getAddm_alon_pay_dept_yn(){
		return this.addm_alon_pay_dept_yn;
	}
}

/* 작성시간 : Thu Aug 09 16:35:29 KST 2018 */