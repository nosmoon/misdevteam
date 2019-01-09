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


public class HD_EVLU_3102_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sel_chk;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String self_evlu_proc_stat;
	public String asst_evlu_proc_stat;
	public String evlu_proc_stat_1tms;
	public String asst_pnt;
	public String spc_psdo_redu_scorcnt;
	public String tmp_grad;
	public String evlu_pers_meda_grad_1tms;
	public String evlu_pers_deci_grad_2tms;
	public String evlu_grad_cd_01;
	public String evlu_grad_cd_02;
	public String evlu_grad_cd_03;
	public String evlu_grad_cd_04;
	public String evlu_grad_cd_05;
	public String busn_rslt_scor;
	public String evlu_dp_scorcnt;

	public HD_EVLU_3102_LCURLISTRecord(){}

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

	public void setSelf_evlu_proc_stat(String self_evlu_proc_stat){
		this.self_evlu_proc_stat = self_evlu_proc_stat;
	}

	public void setAsst_evlu_proc_stat(String asst_evlu_proc_stat){
		this.asst_evlu_proc_stat = asst_evlu_proc_stat;
	}

	public void setEvlu_proc_stat_1tms(String evlu_proc_stat_1tms){
		this.evlu_proc_stat_1tms = evlu_proc_stat_1tms;
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

	public void setEvlu_grad_cd_01(String evlu_grad_cd_01){
		this.evlu_grad_cd_01 = evlu_grad_cd_01;
	}

	public void setEvlu_grad_cd_02(String evlu_grad_cd_02){
		this.evlu_grad_cd_02 = evlu_grad_cd_02;
	}

	public void setEvlu_grad_cd_03(String evlu_grad_cd_03){
		this.evlu_grad_cd_03 = evlu_grad_cd_03;
	}

	public void setEvlu_grad_cd_04(String evlu_grad_cd_04){
		this.evlu_grad_cd_04 = evlu_grad_cd_04;
	}

	public void setEvlu_grad_cd_05(String evlu_grad_cd_05){
		this.evlu_grad_cd_05 = evlu_grad_cd_05;
	}

	public void setBusn_rslt_scor(String busn_rslt_scor){
		this.busn_rslt_scor = busn_rslt_scor;
	}

	public void setEvlu_dp_scorcnt(String evlu_dp_scorcnt){
		this.evlu_dp_scorcnt = evlu_dp_scorcnt;
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

	public String getSelf_evlu_proc_stat(){
		return this.self_evlu_proc_stat;
	}

	public String getAsst_evlu_proc_stat(){
		return this.asst_evlu_proc_stat;
	}

	public String getEvlu_proc_stat_1tms(){
		return this.evlu_proc_stat_1tms;
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

	public String getEvlu_grad_cd_01(){
		return this.evlu_grad_cd_01;
	}

	public String getEvlu_grad_cd_02(){
		return this.evlu_grad_cd_02;
	}

	public String getEvlu_grad_cd_03(){
		return this.evlu_grad_cd_03;
	}

	public String getEvlu_grad_cd_04(){
		return this.evlu_grad_cd_04;
	}

	public String getEvlu_grad_cd_05(){
		return this.evlu_grad_cd_05;
	}

	public String getBusn_rslt_scor(){
		return this.busn_rslt_scor;
	}

	public String getEvlu_dp_scorcnt(){
		return this.evlu_dp_scorcnt;
	}
}

/* 작성시간 : Fri Jul 29 13:52:13 KST 2016 */