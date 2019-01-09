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


public class HD_SRCH_1020_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String up_dept_nm;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String gender;
	public String cur_jobforc_nm;
	public String emp_clsf_nm;
	public String in_cmpy_dt;
	public String last_upgrd_dt;
	public String birth_dt;
	public String age;
	public String in_cmpy_clsf_nm;
	public String open_invit_clsf_nm;
	public String open_invit_desty;
	public String j_dt1;
	public String nativ_nm;
	public String t1;
	public String t2;
	public String t3;
	public String t4;
	public String t5;
	public String t6;
	public String t7;
	public String tot_saly;
	public String last_appmt_dt;

	public HD_SRCH_1020_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setUp_dept_nm(String up_dept_nm){
		this.up_dept_nm = up_dept_nm;
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

	public void setCur_jobforc_nm(String cur_jobforc_nm){
		this.cur_jobforc_nm = cur_jobforc_nm;
	}

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLast_upgrd_dt(String last_upgrd_dt){
		this.last_upgrd_dt = last_upgrd_dt;
	}

	public void setBirth_dt(String birth_dt){
		this.birth_dt = birth_dt;
	}

	public void setAge(String age){
		this.age = age;
	}

	public void setIn_cmpy_clsf_nm(String in_cmpy_clsf_nm){
		this.in_cmpy_clsf_nm = in_cmpy_clsf_nm;
	}

	public void setOpen_invit_clsf_nm(String open_invit_clsf_nm){
		this.open_invit_clsf_nm = open_invit_clsf_nm;
	}

	public void setOpen_invit_desty(String open_invit_desty){
		this.open_invit_desty = open_invit_desty;
	}

	public void setJ_dt1(String j_dt1){
		this.j_dt1 = j_dt1;
	}

	public void setNativ_nm(String nativ_nm){
		this.nativ_nm = nativ_nm;
	}

	public void setT1(String t1){
		this.t1 = t1;
	}

	public void setT2(String t2){
		this.t2 = t2;
	}

	public void setT3(String t3){
		this.t3 = t3;
	}

	public void setT4(String t4){
		this.t4 = t4;
	}

	public void setT5(String t5){
		this.t5 = t5;
	}

	public void setT6(String t6){
		this.t6 = t6;
	}

	public void setT7(String t7){
		this.t7 = t7;
	}

	public void setTot_saly(String tot_saly){
		this.tot_saly = tot_saly;
	}

	public void setLast_appmt_dt(String last_appmt_dt){
		this.last_appmt_dt = last_appmt_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getUp_dept_nm(){
		return this.up_dept_nm;
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

	public String getCur_jobforc_nm(){
		return this.cur_jobforc_nm;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLast_upgrd_dt(){
		return this.last_upgrd_dt;
	}

	public String getBirth_dt(){
		return this.birth_dt;
	}

	public String getAge(){
		return this.age;
	}

	public String getIn_cmpy_clsf_nm(){
		return this.in_cmpy_clsf_nm;
	}

	public String getOpen_invit_clsf_nm(){
		return this.open_invit_clsf_nm;
	}

	public String getOpen_invit_desty(){
		return this.open_invit_desty;
	}

	public String getJ_dt1(){
		return this.j_dt1;
	}

	public String getNativ_nm(){
		return this.nativ_nm;
	}

	public String getT1(){
		return this.t1;
	}

	public String getT2(){
		return this.t2;
	}

	public String getT3(){
		return this.t3;
	}

	public String getT4(){
		return this.t4;
	}

	public String getT5(){
		return this.t5;
	}

	public String getT6(){
		return this.t6;
	}

	public String getT7(){
		return this.t7;
	}

	public String getTot_saly(){
		return this.tot_saly;
	}

	public String getLast_appmt_dt(){
		return this.last_appmt_dt;
	}
}

/* 작성시간 : Fri Dec 29 15:12:39 KST 2017 */