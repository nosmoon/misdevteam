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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_1000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String nm_korn;
	public String prn;
	public String in_cmpy_dt;
	public String emp_clsf_cd;
	public String emp_clsf_nm;
	public String emp_dtls_clsf;
	public String emp_dtls_clsf_nm;
	public String dept_cd;
	public String dept_nm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String now_duty_dept_cd;
	public String now_duty_dept_nm;
	public String tel_no;
	public String ptph_no;
	public String email_id;
	public String use_hday;
	public String use_day1;
	public String use_day2;
	public String count_day;
	public String use_day1_next;
	public String use_day2_next;
	public String count_day_next;
	public String emp_clsf;

	public HD_AFFR_1000_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setPrn(String prn){
		this.prn = prn;
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

	public void setEmp_dtls_clsf(String emp_dtls_clsf){
		this.emp_dtls_clsf = emp_dtls_clsf;
	}

	public void setEmp_dtls_clsf_nm(String emp_dtls_clsf_nm){
		this.emp_dtls_clsf_nm = emp_dtls_clsf_nm;
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

	public void setNow_duty_dept_cd(String now_duty_dept_cd){
		this.now_duty_dept_cd = now_duty_dept_cd;
	}

	public void setNow_duty_dept_nm(String now_duty_dept_nm){
		this.now_duty_dept_nm = now_duty_dept_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setUse_hday(String use_hday){
		this.use_hday = use_hday;
	}

	public void setUse_day1(String use_day1){
		this.use_day1 = use_day1;
	}

	public void setUse_day2(String use_day2){
		this.use_day2 = use_day2;
	}

	public void setCount_day(String count_day){
		this.count_day = count_day;
	}

	public void setUse_day1_next(String use_day1_next){
		this.use_day1_next = use_day1_next;
	}

	public void setUse_day2_next(String use_day2_next){
		this.use_day2_next = use_day2_next;
	}

	public void setCount_day_next(String count_day_next){
		this.count_day_next = count_day_next;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
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

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getEmp_clsf_cd(){
		return this.emp_clsf_cd;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getEmp_dtls_clsf(){
		return this.emp_dtls_clsf;
	}

	public String getEmp_dtls_clsf_nm(){
		return this.emp_dtls_clsf_nm;
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

	public String getNow_duty_dept_cd(){
		return this.now_duty_dept_cd;
	}

	public String getNow_duty_dept_nm(){
		return this.now_duty_dept_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getUse_hday(){
		return this.use_hday;
	}

	public String getUse_day1(){
		return this.use_day1;
	}

	public String getUse_day2(){
		return this.use_day2;
	}

	public String getCount_day(){
		return this.count_day;
	}

	public String getUse_day1_next(){
		return this.use_day1_next;
	}

	public String getUse_day2_next(){
		return this.use_day2_next;
	}

	public String getCount_day_next(){
		return this.count_day_next;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}
}

/* 작성시간 : Fri Nov 20 14:22:14 KST 2009 */