

package chosun.ciis.hd.edu.rec;

import java.sql.*;
import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.ds.*;

/**
 * 
 */


public class HD_EDU_2200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_cd_nm;
	public String emp_no;
	public String flnm;
	public String cour_lng_cd;
	public String cour_obj_cd;
	public String cour_tm_cd;
	public String lv_cd;
	public String lv_test_req_cd;
	public String tel_no;
	public String proc_stat;
	public String proc_stat_nm;
	public String remk;
	public String occr_dt;
	public String seq;

	public HD_EDU_2200_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setCour_lng_cd(String cour_lng_cd){
		this.cour_lng_cd = cour_lng_cd;
	}

	public void setCour_obj_cd(String cour_obj_cd){
		this.cour_obj_cd = cour_obj_cd;
	}

	public void setCour_tm_cd(String cour_tm_cd){
		this.cour_tm_cd = cour_tm_cd;
	}

	public void setLv_cd(String lv_cd){
		this.lv_cd = lv_cd;
	}

	public void setLv_test_req_cd(String lv_test_req_cd){
		this.lv_test_req_cd = lv_test_req_cd;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getCour_lng_cd(){
		return this.cour_lng_cd;
	}

	public String getCour_obj_cd(){
		return this.cour_obj_cd;
	}

	public String getCour_tm_cd(){
		return this.cour_tm_cd;
	}

	public String getLv_cd(){
		return this.lv_cd;
	}

	public String getLv_test_req_cd(){
		return this.lv_test_req_cd;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Tue Apr 12 14:54:45 KST 2011 */