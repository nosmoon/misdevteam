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


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_2013_7000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String adjm_rvrs_yy;
	public String emp_no;
	public String nm_korn;
	public String add_file_nm;
	public String chg_dt_tm;
	public String chg_pers_nm;
	public String doc_type;
	public String form_cd;
	public Blob add_file ;
	
	public HD_YADJM_2013_7000_LCURLISTRecord(){}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setAdd_file_nm(String add_file_nm){
		this.add_file_nm = add_file_nm;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setChg_pers_nm(String chg_pers_nm){
		this.chg_pers_nm = chg_pers_nm;
	}

	public void setDoc_type(String doc_type){
		this.doc_type = doc_type;
	}
	
	public void setForm_cd(String form_cd){
		this.form_cd = form_cd;
	}

	public void setAdd_file(Blob add_file){
		this.add_file = add_file;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getAdd_file_nm(){
		return this.add_file_nm;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getChg_pers_nm(){
		return this.chg_pers_nm;
	}
	
	public String getDoc_type(){
		return this.doc_type;
	}

	public String getForm_cd(){
		return this.form_cd;
	}

	public Blob getAdd_file(){
		return this.add_file;
	}
	
}

/* 작성시간 : Tue Jan 15 10:07:23 KST 2013 */