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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_2000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String cd_nm;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;
	public String in_cmpy_dt;
	public String temp_yn;
	public String stdy_yn;
	public String prn;
	public String lvcmpy_dt;
	public String ptph_no;
	public String home_zip;
	public String home_addr;
	public String home_dtls_addr;
	public String email_id;

	public HD_SRCH_2000_LCURLISTRecord(){}

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

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setTemp_yn(String temp_yn){
		this.temp_yn = temp_yn;
	}

	public void setStdy_yn(String stdy_yn){
		this.stdy_yn = stdy_yn;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
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

	public void setEmail_id(String email_id){
		this.email_id = email_id;
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

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getTemp_yn(){
		return this.temp_yn;
	}

	public String getStdy_yn(){
		return this.stdy_yn;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
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

	public String getEmail_id(){
		return this.email_id;
	}
}

/* 작성시간 : Fri Aug 07 09:57:48 KST 2015 */