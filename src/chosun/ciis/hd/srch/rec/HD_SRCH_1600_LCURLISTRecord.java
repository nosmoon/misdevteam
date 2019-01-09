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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_1600_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String cmpy_cd;
	public String prn;
	public String in_cmpy_dt;
	public String emp_clsf;
	public String emp_dtls_clsf;
	public String emp_clsf_nm;
	public String emp_dtls_clsf_nm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String nm_korn;
	public String dept_name;
	public String dty_name;
	public String posi_name;
	public String addm_dept_cd;
	public String addm_insd_dept_cd;
	public String addm_dty_cd;
	public String addm_posi_cd;
	public String addm_dept_name;
	public String addm_dty_name;
	public String addm_posi_name;

	public HD_SRCH_1600_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setEmp_dtls_clsf(String emp_dtls_clsf){
		this.emp_dtls_clsf = emp_dtls_clsf;
	}

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setEmp_dtls_clsf_nm(String emp_dtls_clsf_nm){
		this.emp_dtls_clsf_nm = emp_dtls_clsf_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_name(String dept_name){
		this.dept_name = dept_name;
	}

	public void setDty_name(String dty_name){
		this.dty_name = dty_name;
	}

	public void setPosi_name(String posi_name){
		this.posi_name = posi_name;
	}

	public void setAddm_dept_cd(String addm_dept_cd){
		this.addm_dept_cd = addm_dept_cd;
	}

	public void setAddm_insd_dept_cd(String addm_insd_dept_cd){
		this.addm_insd_dept_cd = addm_insd_dept_cd;
	}

	public void setAddm_dty_cd(String addm_dty_cd){
		this.addm_dty_cd = addm_dty_cd;
	}

	public void setAddm_posi_cd(String addm_posi_cd){
		this.addm_posi_cd = addm_posi_cd;
	}

	public void setAddm_dept_name(String addm_dept_name){
		this.addm_dept_name = addm_dept_name;
	}

	public void setAddm_dty_name(String addm_dty_name){
		this.addm_dty_name = addm_dty_name;
	}

	public void setAddm_posi_name(String addm_posi_name){
		this.addm_posi_name = addm_posi_name;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getEmp_dtls_clsf(){
		return this.emp_dtls_clsf;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getEmp_dtls_clsf_nm(){
		return this.emp_dtls_clsf_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_name(){
		return this.dept_name;
	}

	public String getDty_name(){
		return this.dty_name;
	}

	public String getPosi_name(){
		return this.posi_name;
	}

	public String getAddm_dept_cd(){
		return this.addm_dept_cd;
	}

	public String getAddm_insd_dept_cd(){
		return this.addm_insd_dept_cd;
	}

	public String getAddm_dty_cd(){
		return this.addm_dty_cd;
	}

	public String getAddm_posi_cd(){
		return this.addm_posi_cd;
	}

	public String getAddm_dept_name(){
		return this.addm_dept_name;
	}

	public String getAddm_dty_name(){
		return this.addm_dty_name;
	}

	public String getAddm_posi_name(){
		return this.addm_posi_name;
	}
}

/* 작성시간 : Fri Mar 27 10:04:25 KST 2009 */