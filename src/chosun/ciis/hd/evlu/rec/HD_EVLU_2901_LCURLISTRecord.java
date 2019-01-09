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


public class HD_EVLU_2901_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String self_evlu_proc_stat;
	public String self_evlu_proc_stat_nm;
	public String evlu_view;
	public String evlu_grp_nm;
	public String dept_nm;
	public String tgt_evlu_pers_emp_no;
	public String tgt_evlu_pers_nm_korn;
	public String evlu_grad_cd;
	public String evlu_opn;
	public String db_status;

	public HD_EVLU_2901_LCURLISTRecord(){}

	public void setSelf_evlu_proc_stat(String self_evlu_proc_stat){
		this.self_evlu_proc_stat = self_evlu_proc_stat;
	}

	public void setSelf_evlu_proc_stat_nm(String self_evlu_proc_stat_nm){
		this.self_evlu_proc_stat_nm = self_evlu_proc_stat_nm;
	}

	public void setEvlu_view(String evlu_view){
		this.evlu_view = evlu_view;
	}

	public void setEvlu_grp_nm(String evlu_grp_nm){
		this.evlu_grp_nm = evlu_grp_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setTgt_evlu_pers_emp_no(String tgt_evlu_pers_emp_no){
		this.tgt_evlu_pers_emp_no = tgt_evlu_pers_emp_no;
	}

	public void setTgt_evlu_pers_nm_korn(String tgt_evlu_pers_nm_korn){
		this.tgt_evlu_pers_nm_korn = tgt_evlu_pers_nm_korn;
	}

	public void setEvlu_grad_cd(String evlu_grad_cd){
		this.evlu_grad_cd = evlu_grad_cd;
	}

	public void setEvlu_opn(String evlu_opn){
		this.evlu_opn = evlu_opn;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getSelf_evlu_proc_stat(){
		return this.self_evlu_proc_stat;
	}

	public String getSelf_evlu_proc_stat_nm(){
		return this.self_evlu_proc_stat_nm;
	}

	public String getEvlu_view(){
		return this.evlu_view;
	}

	public String getEvlu_grp_nm(){
		return this.evlu_grp_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getTgt_evlu_pers_emp_no(){
		return this.tgt_evlu_pers_emp_no;
	}

	public String getTgt_evlu_pers_nm_korn(){
		return this.tgt_evlu_pers_nm_korn;
	}

	public String getEvlu_grad_cd(){
		return this.evlu_grad_cd;
	}

	public String getEvlu_opn(){
		return this.evlu_opn;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* 작성시간 : Fri Apr 11 20:12:08 KST 2014 */