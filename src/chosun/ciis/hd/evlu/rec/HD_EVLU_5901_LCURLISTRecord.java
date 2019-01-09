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


public class HD_EVLU_5901_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String tgt_evlu_pers_emp_no;
	public String nm_korn;
	public String tgt_evlu_pers_dept_cd;
	public String abrv_nm;
	public String evlu_proc_stat_tms;
	public String evlu_proc_stat_nm;

	public HD_EVLU_5901_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setTgt_evlu_pers_emp_no(String tgt_evlu_pers_emp_no){
		this.tgt_evlu_pers_emp_no = tgt_evlu_pers_emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setTgt_evlu_pers_dept_cd(String tgt_evlu_pers_dept_cd){
		this.tgt_evlu_pers_dept_cd = tgt_evlu_pers_dept_cd;
	}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public void setEvlu_proc_stat_tms(String evlu_proc_stat_tms){
		this.evlu_proc_stat_tms = evlu_proc_stat_tms;
	}

	public void setEvlu_proc_stat_nm(String evlu_proc_stat_nm){
		this.evlu_proc_stat_nm = evlu_proc_stat_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getTgt_evlu_pers_emp_no(){
		return this.tgt_evlu_pers_emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getTgt_evlu_pers_dept_cd(){
		return this.tgt_evlu_pers_dept_cd;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}

	public String getEvlu_proc_stat_tms(){
		return this.evlu_proc_stat_tms;
	}

	public String getEvlu_proc_stat_nm(){
		return this.evlu_proc_stat_nm;
	}
}

/* 작성시간 : Mon Jun 08 21:28:16 KST 2009 */