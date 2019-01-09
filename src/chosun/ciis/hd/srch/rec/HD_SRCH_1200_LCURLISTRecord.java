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


public class HD_SRCH_1200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String nm_korn;
	public String cd_nm;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String emp_clsf_nm;
	public String birth_dt;
	public String min_in_cmpy_dt;
	public String lvcmpy_ck;
	public String lvcmpy_dty_nm;
	public String lvcmpy_posi_nm;
	public String lvcmpy_emp_clsf_nm;
	public String lvcmpy_saly;
	public String last_in_cmpy_saly;
	public String now_saly;
	public String last_lvcmpy_dt;
	public String last_in_cmpy_dt;
	public String last_in_cmpy_dt_ck;
	public String old_cmpy_dt;
	public String now_cmpy_dt;
	public String tot_cmpy_dt;

	public HD_SRCH_1200_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setBirth_dt(String birth_dt){
		this.birth_dt = birth_dt;
	}

	public void setMin_in_cmpy_dt(String min_in_cmpy_dt){
		this.min_in_cmpy_dt = min_in_cmpy_dt;
	}

	public void setLvcmpy_ck(String lvcmpy_ck){
		this.lvcmpy_ck = lvcmpy_ck;
	}

	public void setLvcmpy_dty_nm(String lvcmpy_dty_nm){
		this.lvcmpy_dty_nm = lvcmpy_dty_nm;
	}

	public void setLvcmpy_posi_nm(String lvcmpy_posi_nm){
		this.lvcmpy_posi_nm = lvcmpy_posi_nm;
	}

	public void setLvcmpy_emp_clsf_nm(String lvcmpy_emp_clsf_nm){
		this.lvcmpy_emp_clsf_nm = lvcmpy_emp_clsf_nm;
	}

	public void setLvcmpy_saly(String lvcmpy_saly){
		this.lvcmpy_saly = lvcmpy_saly;
	}

	public void setLast_in_cmpy_saly(String last_in_cmpy_saly){
		this.last_in_cmpy_saly = last_in_cmpy_saly;
	}

	public void setNow_saly(String now_saly){
		this.now_saly = now_saly;
	}

	public void setLast_lvcmpy_dt(String last_lvcmpy_dt){
		this.last_lvcmpy_dt = last_lvcmpy_dt;
	}

	public void setLast_in_cmpy_dt(String last_in_cmpy_dt){
		this.last_in_cmpy_dt = last_in_cmpy_dt;
	}

	public void setLast_in_cmpy_dt_ck(String last_in_cmpy_dt_ck){
		this.last_in_cmpy_dt_ck = last_in_cmpy_dt_ck;
	}

	public void setOld_cmpy_dt(String old_cmpy_dt){
		this.old_cmpy_dt = old_cmpy_dt;
	}

	public void setNow_cmpy_dt(String now_cmpy_dt){
		this.now_cmpy_dt = now_cmpy_dt;
	}

	public void setTot_cmpy_dt(String tot_cmpy_dt){
		this.tot_cmpy_dt = tot_cmpy_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getBirth_dt(){
		return this.birth_dt;
	}

	public String getMin_in_cmpy_dt(){
		return this.min_in_cmpy_dt;
	}

	public String getLvcmpy_ck(){
		return this.lvcmpy_ck;
	}

	public String getLvcmpy_dty_nm(){
		return this.lvcmpy_dty_nm;
	}

	public String getLvcmpy_posi_nm(){
		return this.lvcmpy_posi_nm;
	}

	public String getLvcmpy_emp_clsf_nm(){
		return this.lvcmpy_emp_clsf_nm;
	}

	public String getLvcmpy_saly(){
		return this.lvcmpy_saly;
	}

	public String getLast_in_cmpy_saly(){
		return this.last_in_cmpy_saly;
	}

	public String getNow_saly(){
		return this.now_saly;
	}

	public String getLast_lvcmpy_dt(){
		return this.last_lvcmpy_dt;
	}

	public String getLast_in_cmpy_dt(){
		return this.last_in_cmpy_dt;
	}

	public String getLast_in_cmpy_dt_ck(){
		return this.last_in_cmpy_dt_ck;
	}

	public String getOld_cmpy_dt(){
		return this.old_cmpy_dt;
	}

	public String getNow_cmpy_dt(){
		return this.now_cmpy_dt;
	}

	public String getTot_cmpy_dt(){
		return this.tot_cmpy_dt;
	}
}

/* 작성시간 : Mon Apr 06 20:20:29 KST 2009 */