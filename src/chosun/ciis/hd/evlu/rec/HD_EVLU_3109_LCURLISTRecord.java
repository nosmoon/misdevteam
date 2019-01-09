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


public class HD_EVLU_3109_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sel_chk;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String asst_pnt;
	public String spc_psdo_redu_scorcnt;
	public String tmp_grad;
	public String evlu_pers_meda_grad_1tms;
	public String evlu_pers_deci_grad_2tms;
	public String evlu_pers_meda_opn_2tms;

	public HD_EVLU_3109_LCURLISTRecord(){}

	public void setSel_chk(String sel_chk){
		this.sel_chk = sel_chk;
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

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setAsst_pnt(String asst_pnt){
		this.asst_pnt = asst_pnt;
	}

	public void setSpc_psdo_redu_scorcnt(String spc_psdo_redu_scorcnt){
		this.spc_psdo_redu_scorcnt = spc_psdo_redu_scorcnt;
	}

	public void setTmp_grad(String tmp_grad){
		this.tmp_grad = tmp_grad;
	}

	public void setEvlu_pers_meda_grad_1tms(String evlu_pers_meda_grad_1tms){
		this.evlu_pers_meda_grad_1tms = evlu_pers_meda_grad_1tms;
	}

	public void setEvlu_pers_deci_grad_2tms(String evlu_pers_deci_grad_2tms){
		this.evlu_pers_deci_grad_2tms = evlu_pers_deci_grad_2tms;
	}

	public void setEvlu_pers_meda_opn_2tms(String evlu_pers_meda_opn_2tms){
		this.evlu_pers_meda_opn_2tms = evlu_pers_meda_opn_2tms;
	}

	public String getSel_chk(){
		return this.sel_chk;
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

	public String getAsst_pnt(){
		return this.asst_pnt;
	}

	public String getSpc_psdo_redu_scorcnt(){
		return this.spc_psdo_redu_scorcnt;
	}

	public String getTmp_grad(){
		return this.tmp_grad;
	}

	public String getEvlu_pers_meda_grad_1tms(){
		return this.evlu_pers_meda_grad_1tms;
	}

	public String getEvlu_pers_deci_grad_2tms(){
		return this.evlu_pers_deci_grad_2tms;
	}

	public String getEvlu_pers_meda_opn_2tms(){
		return this.evlu_pers_meda_opn_2tms;
	}
}

/* 작성시간 : Fri Apr 04 11:01:36 KST 2014 */