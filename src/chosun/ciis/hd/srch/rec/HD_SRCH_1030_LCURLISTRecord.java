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


public class HD_SRCH_1030_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String cd_nm;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String gender;
	public String cur_job;
	public String emp_clsf_nm;
	public String emp_dtls_clsf_nm;
	public String in_cmpy_dt;
	public String email_id;
	public String ptph_no;
	public String home_zip;
	public String home_addr;
	public String home_dtls_addr;
	public String cmpy_zip;
	public String cmpy_addr;
	public String cmpy_dtls_addr;
	public String fore_home_zip;
	public String fore_home_addr;
	public String fore_home_dtls_addr;
	public String fore_cmpy_zip;
	public String fore_cmpy_addr;
	public String fore_cmpy_dtls_addr;

	public HD_SRCH_1030_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
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

	public void setGender(String gender){
		this.gender = gender;
	}

	public void setCur_job(String cur_job){
		this.cur_job = cur_job;
	}

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setEmp_dtls_clsf_nm(String emp_dtls_clsf_nm){
		this.emp_dtls_clsf_nm = emp_dtls_clsf_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setHome_zip(String home_zip){
		this.home_zip = home_zip;
	}

	public void setHome_addr(String home_addr){
		this.home_addr = home_addr;
	}

	public void setHome_dtls_addr(String home_dtls_addr){
		this.home_dtls_addr = home_dtls_addr;
	}

	public void setCmpy_zip(String cmpy_zip){
		this.cmpy_zip = cmpy_zip;
	}

	public void setCmpy_addr(String cmpy_addr){
		this.cmpy_addr = cmpy_addr;
	}

	public void setCmpy_dtls_addr(String cmpy_dtls_addr){
		this.cmpy_dtls_addr = cmpy_dtls_addr;
	}

	public void setFore_home_zip(String fore_home_zip){
		this.fore_home_zip = fore_home_zip;
	}

	public void setFore_home_addr(String fore_home_addr){
		this.fore_home_addr = fore_home_addr;
	}

	public void setFore_home_dtls_addr(String fore_home_dtls_addr){
		this.fore_home_dtls_addr = fore_home_dtls_addr;
	}

	public void setFore_cmpy_zip(String fore_cmpy_zip){
		this.fore_cmpy_zip = fore_cmpy_zip;
	}

	public void setFore_cmpy_addr(String fore_cmpy_addr){
		this.fore_cmpy_addr = fore_cmpy_addr;
	}

	public void setFore_cmpy_dtls_addr(String fore_cmpy_dtls_addr){
		this.fore_cmpy_dtls_addr = fore_cmpy_dtls_addr;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
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

	public String getGender(){
		return this.gender;
	}

	public String getCur_job(){
		return this.cur_job;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getEmp_dtls_clsf_nm(){
		return this.emp_dtls_clsf_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getHome_zip(){
		return this.home_zip;
	}

	public String getHome_addr(){
		return this.home_addr;
	}

	public String getHome_dtls_addr(){
		return this.home_dtls_addr;
	}

	public String getCmpy_zip(){
		return this.cmpy_zip;
	}

	public String getCmpy_addr(){
		return this.cmpy_addr;
	}

	public String getCmpy_dtls_addr(){
		return this.cmpy_dtls_addr;
	}

	public String getFore_home_zip(){
		return this.fore_home_zip;
	}

	public String getFore_home_addr(){
		return this.fore_home_addr;
	}

	public String getFore_home_dtls_addr(){
		return this.fore_home_dtls_addr;
	}

	public String getFore_cmpy_zip(){
		return this.fore_cmpy_zip;
	}

	public String getFore_cmpy_addr(){
		return this.fore_cmpy_addr;
	}

	public String getFore_cmpy_dtls_addr(){
		return this.fore_cmpy_dtls_addr;
	}
}

/* 작성시간 : Fri Nov 27 19:49:35 KST 2009 */