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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_3601_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;
	public String ptph_no;
	public String email_id;
	public String asst_dept_nm;
	public String asst_emp_no;
	public String asst_nm_korn;
	public String asst_dty_nm;
	public String asst_posi_nm;
	public String asst_ptph_no;
	public String asst_email_id;
	public String tms1_dept_nm;
	public String tms1_emp_no;
	public String tms1_nm_korn;
	public String tms1_dty_nm;
	public String tms1_posi_nm;
	public String tms1_ptph_no;
	public String tms1_email_id;
	public String tms2_dept_nm;
	public String tms2_emp_no;
	public String tms2_nm_korn;
	public String tms2_dty_nm;
	public String tms2_posi_nm;
	public String tms2_ptph_no;
	public String tms2_email_id;

	public HD_EVLU_3601_LCURLISTRecord(){}

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

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setAsst_dept_nm(String asst_dept_nm){
		this.asst_dept_nm = asst_dept_nm;
	}

	public void setAsst_emp_no(String asst_emp_no){
		this.asst_emp_no = asst_emp_no;
	}

	public void setAsst_nm_korn(String asst_nm_korn){
		this.asst_nm_korn = asst_nm_korn;
	}

	public void setAsst_dty_nm(String asst_dty_nm){
		this.asst_dty_nm = asst_dty_nm;
	}

	public void setAsst_posi_nm(String asst_posi_nm){
		this.asst_posi_nm = asst_posi_nm;
	}

	public void setAsst_ptph_no(String asst_ptph_no){
		this.asst_ptph_no = asst_ptph_no;
	}

	public void setAsst_email_id(String asst_email_id){
		this.asst_email_id = asst_email_id;
	}

	public void setTms1_dept_nm(String tms1_dept_nm){
		this.tms1_dept_nm = tms1_dept_nm;
	}

	public void setTms1_emp_no(String tms1_emp_no){
		this.tms1_emp_no = tms1_emp_no;
	}

	public void setTms1_nm_korn(String tms1_nm_korn){
		this.tms1_nm_korn = tms1_nm_korn;
	}

	public void setTms1_dty_nm(String tms1_dty_nm){
		this.tms1_dty_nm = tms1_dty_nm;
	}

	public void setTms1_posi_nm(String tms1_posi_nm){
		this.tms1_posi_nm = tms1_posi_nm;
	}

	public void setTms1_ptph_no(String tms1_ptph_no){
		this.tms1_ptph_no = tms1_ptph_no;
	}

	public void setTms1_email_id(String tms1_email_id){
		this.tms1_email_id = tms1_email_id;
	}

	public void setTms2_dept_nm(String tms2_dept_nm){
		this.tms2_dept_nm = tms2_dept_nm;
	}

	public void setTms2_emp_no(String tms2_emp_no){
		this.tms2_emp_no = tms2_emp_no;
	}

	public void setTms2_nm_korn(String tms2_nm_korn){
		this.tms2_nm_korn = tms2_nm_korn;
	}

	public void setTms2_dty_nm(String tms2_dty_nm){
		this.tms2_dty_nm = tms2_dty_nm;
	}

	public void setTms2_posi_nm(String tms2_posi_nm){
		this.tms2_posi_nm = tms2_posi_nm;
	}

	public void setTms2_ptph_no(String tms2_ptph_no){
		this.tms2_ptph_no = tms2_ptph_no;
	}

	public void setTms2_email_id(String tms2_email_id){
		this.tms2_email_id = tms2_email_id;
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

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getAsst_dept_nm(){
		return this.asst_dept_nm;
	}

	public String getAsst_emp_no(){
		return this.asst_emp_no;
	}

	public String getAsst_nm_korn(){
		return this.asst_nm_korn;
	}

	public String getAsst_dty_nm(){
		return this.asst_dty_nm;
	}

	public String getAsst_posi_nm(){
		return this.asst_posi_nm;
	}

	public String getAsst_ptph_no(){
		return this.asst_ptph_no;
	}

	public String getAsst_email_id(){
		return this.asst_email_id;
	}

	public String getTms1_dept_nm(){
		return this.tms1_dept_nm;
	}

	public String getTms1_emp_no(){
		return this.tms1_emp_no;
	}

	public String getTms1_nm_korn(){
		return this.tms1_nm_korn;
	}

	public String getTms1_dty_nm(){
		return this.tms1_dty_nm;
	}

	public String getTms1_posi_nm(){
		return this.tms1_posi_nm;
	}

	public String getTms1_ptph_no(){
		return this.tms1_ptph_no;
	}

	public String getTms1_email_id(){
		return this.tms1_email_id;
	}

	public String getTms2_dept_nm(){
		return this.tms2_dept_nm;
	}

	public String getTms2_emp_no(){
		return this.tms2_emp_no;
	}

	public String getTms2_nm_korn(){
		return this.tms2_nm_korn;
	}

	public String getTms2_dty_nm(){
		return this.tms2_dty_nm;
	}

	public String getTms2_posi_nm(){
		return this.tms2_posi_nm;
	}

	public String getTms2_ptph_no(){
		return this.tms2_ptph_no;
	}

	public String getTms2_email_id(){
		return this.tms2_email_id;
	}
}

/* 작성시간 : Fri Nov 14 11:33:42 KST 2014 */