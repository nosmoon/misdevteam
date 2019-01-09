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


package chosun.ciis.en.evnt.rec;

import java.sql.*;
import chosun.ciis.en.evnt.dm.*;
import chosun.ciis.en.evnt.ds.*;

/**
 * 
 */


public class EN_EVNT_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tmp_evnt_cd;
	public String evnt_nm;
	public String chrg_pers_emp_nm;
	public String clos_yn;
	public String stlm_dt;
	public String stlm_proc_pers_emp_no;
	public String stlm_proc_pers_emp_nm;
	public String cmpy_cd;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_seq;

	public EN_EVNT_1101_LCURLISTRecord(){}

	public void setTmp_evnt_cd(String tmp_evnt_cd){
		this.tmp_evnt_cd = tmp_evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setChrg_pers_emp_nm(String chrg_pers_emp_nm){
		this.chrg_pers_emp_nm = chrg_pers_emp_nm;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setStlm_dt(String stlm_dt){
		this.stlm_dt = stlm_dt;
	}

	public void setStlm_proc_pers_emp_no(String stlm_proc_pers_emp_no){
		this.stlm_proc_pers_emp_no = stlm_proc_pers_emp_no;
	}

	public void setStlm_proc_pers_emp_nm(String stlm_proc_pers_emp_nm){
		this.stlm_proc_pers_emp_nm = stlm_proc_pers_emp_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_seq(String evnt_seq){
		this.evnt_seq = evnt_seq;
	}

	public String getTmp_evnt_cd(){
		return this.tmp_evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getChrg_pers_emp_nm(){
		return this.chrg_pers_emp_nm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getStlm_dt(){
		return this.stlm_dt;
	}

	public String getStlm_proc_pers_emp_no(){
		return this.stlm_proc_pers_emp_no;
	}

	public String getStlm_proc_pers_emp_nm(){
		return this.stlm_proc_pers_emp_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_seq(){
		return this.evnt_seq;
	}
}

/* 작성시간 : Thu Feb 12 18:19:26 KST 2009 */