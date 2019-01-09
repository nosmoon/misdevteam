/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 *
 */

public class HD_EVLU_3501_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String self_evlu_proc_stat;
	public String asst_evlu_proc_stat;
	public String evlu_proc_stat_1tms;
	public String evlu_proc_stat_2tms;

	public HD_EVLU_3501_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setSelf_evlu_proc_stat(String self_evlu_proc_stat){
		this.self_evlu_proc_stat = self_evlu_proc_stat;
	}

	public void setAsst_evlu_proc_stat(String asst_evlu_proc_stat){
		this.asst_evlu_proc_stat = asst_evlu_proc_stat;
	}

	public void setEvlu_proc_stat_1tms(String evlu_proc_stat_1tms){
		this.evlu_proc_stat_1tms = evlu_proc_stat_1tms;
	}

	public void setEvlu_proc_stat_2tms(String evlu_proc_stat_2tms){
		this.evlu_proc_stat_2tms = evlu_proc_stat_2tms;
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

	public String getSelf_evlu_proc_stat(){
		return this.self_evlu_proc_stat;
	}

	public String getAsst_evlu_proc_stat(){
		return this.asst_evlu_proc_stat;
	}

	public String getEvlu_proc_stat_1tms(){
		return this.evlu_proc_stat_1tms;
	}

	public String getEvlu_proc_stat_2tms(){
		return this.evlu_proc_stat_2tms;
	}
}

/* 작성시간 : Tue Jun 02 16:36:29 KST 2009 */