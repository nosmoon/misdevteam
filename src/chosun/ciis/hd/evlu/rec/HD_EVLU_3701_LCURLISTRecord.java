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


public class HD_EVLU_3701_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sel_chk;
	public String evlu_lcls_grp_nm;
	public String evlu_grp_nm;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String asst_nm_korn;
	public String tms1_nm_korn;
	public String tms2_nm_korn;
	public String asst_pnt;
	public String spc_psdo_redu_scorcnt;
	public String tmp_grad;
	public String evlu_pers_meda_grad_1tms;
	public String evlu_pers_deci_grad_2tms;
	public String rank;
	public String cmpt_scor;
	public String slf_schv_desc1;
	public String slf_schv_desc2;
	public String evlu_scor;
	public String rvis_scor_1tms;
	public String evlu_pers_meda_opn_1tms;
	public String evlu_pers_meda_opn_2tms;
	public String evlu_cmpt_opn_1tms;
	public String evlu_opn;
	public String evlu_grad_cd_01;
	public String evlu_grad_cd_02;
	public String evlu_grad_cd_03;
	public String evlu_grad_cd_04;
	public String evlu_grad_cd_05;
	public String evlu_grad_cd_06;
	public String evlu_dp_scorcnt;

	public HD_EVLU_3701_LCURLISTRecord(){}

	public void setSel_chk(String sel_chk){
		this.sel_chk = sel_chk;
	}

	public void setEvlu_lcls_grp_nm(String evlu_lcls_grp_nm){
		this.evlu_lcls_grp_nm = evlu_lcls_grp_nm;
	}

	public void setEvlu_grp_nm(String evlu_grp_nm){
		this.evlu_grp_nm = evlu_grp_nm;
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

	public void setAsst_nm_korn(String asst_nm_korn){
		this.asst_nm_korn = asst_nm_korn;
	}

	public void setTms1_nm_korn(String tms1_nm_korn){
		this.tms1_nm_korn = tms1_nm_korn;
	}

	public void setTms2_nm_korn(String tms2_nm_korn){
		this.tms2_nm_korn = tms2_nm_korn;
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

	public void setRank(String rank){
		this.rank = rank;
	}

	public void setCmpt_scor(String cmpt_scor){
		this.cmpt_scor = cmpt_scor;
	}

	public void setSlf_schv_desc1(String slf_schv_desc1){
		this.slf_schv_desc1 = slf_schv_desc1;
	}

	public void setSlf_schv_desc2(String slf_schv_desc2){
		this.slf_schv_desc2 = slf_schv_desc2;
	}

	public void setEvlu_scor(String evlu_scor){
		this.evlu_scor = evlu_scor;
	}

	public void setRvis_scor_1tms(String rvis_scor_1tms){
		this.rvis_scor_1tms = rvis_scor_1tms;
	}

	public void setEvlu_pers_meda_opn_1tms(String evlu_pers_meda_opn_1tms){
		this.evlu_pers_meda_opn_1tms = evlu_pers_meda_opn_1tms;
	}

	public void setEvlu_pers_meda_opn_2tms(String evlu_pers_meda_opn_2tms){
		this.evlu_pers_meda_opn_2tms = evlu_pers_meda_opn_2tms;
	}

	public void setEvlu_cmpt_opn_1tms(String evlu_cmpt_opn_1tms){
		this.evlu_cmpt_opn_1tms = evlu_cmpt_opn_1tms;
	}

	public void setEvlu_opn(String evlu_opn){
		this.evlu_opn = evlu_opn;
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

	public void setEvlu_grad_cd_06(String evlu_grad_cd_06){
		this.evlu_grad_cd_06 = evlu_grad_cd_06;
	}

	public void setEvlu_dp_scorcnt(String evlu_dp_scorcnt){
		this.evlu_dp_scorcnt = evlu_dp_scorcnt;
	}

	public String getSel_chk(){
		return this.sel_chk;
	}

	public String getEvlu_lcls_grp_nm(){
		return this.evlu_lcls_grp_nm;
	}

	public String getEvlu_grp_nm(){
		return this.evlu_grp_nm;
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

	public String getAsst_nm_korn(){
		return this.asst_nm_korn;
	}

	public String getTms1_nm_korn(){
		return this.tms1_nm_korn;
	}

	public String getTms2_nm_korn(){
		return this.tms2_nm_korn;
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

	public String getRank(){
		return this.rank;
	}

	public String getCmpt_scor(){
		return this.cmpt_scor;
	}

	public String getSlf_schv_desc1(){
		return this.slf_schv_desc1;
	}

	public String getSlf_schv_desc2(){
		return this.slf_schv_desc2;
	}

	public String getEvlu_scor(){
		return this.evlu_scor;
	}

	public String getRvis_scor_1tms(){
		return this.rvis_scor_1tms;
	}

	public String getEvlu_pers_meda_opn_1tms(){
		return this.evlu_pers_meda_opn_1tms;
	}

	public String getEvlu_pers_meda_opn_2tms(){
		return this.evlu_pers_meda_opn_2tms;
	}

	public String getEvlu_cmpt_opn_1tms(){
		return this.evlu_cmpt_opn_1tms;
	}

	public String getEvlu_opn(){
		return this.evlu_opn;
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

	public String getEvlu_grad_cd_06(){
		return this.evlu_grad_cd_06;
	}

	public String getEvlu_dp_scorcnt(){
		return this.evlu_dp_scorcnt;
	}
}

/* 작성시간 : Thu Jun 21 11:28:01 KST 2018 */