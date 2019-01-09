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


package chosun.ciis.is.agr.rec;

import java.sql.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.ds.*;

/**
 * 
 */


public class IS_AGR_3210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String proc_stat_nm;
	public String make_ask_reg_dt;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers;
	public String dlco_nm;
	public String advt_nm;
	public String work_kind_nm;
	public String make_clsf_nm;
	public String std_cd_nm;
	public String clr_cd_nm;
	public String rvord_qunt;
	public String rvord_uprc;
	public String rvord_amt;
	public String acwr_incmg_dt_tm;
	public String draft_end_dt;
	public String dlvs_dt;
	public String purc_dlco_nm;
	public String purc_clsf_nm;
	public String purc_amt;
	public String stmt_recp_yn;
	public String make_ask_reg_seq;

	public IS_AGR_3210_LCURLISTRecord(){}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setMake_ask_reg_dt(String make_ask_reg_dt){
		this.make_ask_reg_dt = make_ask_reg_dt;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setSub_dept_cd_nm(String sub_dept_cd_nm){
		this.sub_dept_cd_nm = sub_dept_cd_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvt_nm(String advt_nm){
		this.advt_nm = advt_nm;
	}

	public void setWork_kind_nm(String work_kind_nm){
		this.work_kind_nm = work_kind_nm;
	}

	public void setMake_clsf_nm(String make_clsf_nm){
		this.make_clsf_nm = make_clsf_nm;
	}

	public void setStd_cd_nm(String std_cd_nm){
		this.std_cd_nm = std_cd_nm;
	}

	public void setClr_cd_nm(String clr_cd_nm){
		this.clr_cd_nm = clr_cd_nm;
	}

	public void setRvord_qunt(String rvord_qunt){
		this.rvord_qunt = rvord_qunt;
	}

	public void setRvord_uprc(String rvord_uprc){
		this.rvord_uprc = rvord_uprc;
	}

	public void setRvord_amt(String rvord_amt){
		this.rvord_amt = rvord_amt;
	}

	public void setAcwr_incmg_dt_tm(String acwr_incmg_dt_tm){
		this.acwr_incmg_dt_tm = acwr_incmg_dt_tm;
	}

	public void setDraft_end_dt(String draft_end_dt){
		this.draft_end_dt = draft_end_dt;
	}

	public void setDlvs_dt(String dlvs_dt){
		this.dlvs_dt = dlvs_dt;
	}

	public void setPurc_dlco_nm(String purc_dlco_nm){
		this.purc_dlco_nm = purc_dlco_nm;
	}

	public void setPurc_clsf_nm(String purc_clsf_nm){
		this.purc_clsf_nm = purc_clsf_nm;
	}

	public void setPurc_amt(String purc_amt){
		this.purc_amt = purc_amt;
	}

	public void setStmt_recp_yn(String stmt_recp_yn){
		this.stmt_recp_yn = stmt_recp_yn;
	}

	public void setMake_ask_reg_seq(String make_ask_reg_seq){
		this.make_ask_reg_seq = make_ask_reg_seq;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getMake_ask_reg_dt(){
		return this.make_ask_reg_dt;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getSub_dept_cd_nm(){
		return this.sub_dept_cd_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvt_nm(){
		return this.advt_nm;
	}

	public String getWork_kind_nm(){
		return this.work_kind_nm;
	}

	public String getMake_clsf_nm(){
		return this.make_clsf_nm;
	}

	public String getStd_cd_nm(){
		return this.std_cd_nm;
	}

	public String getClr_cd_nm(){
		return this.clr_cd_nm;
	}

	public String getRvord_qunt(){
		return this.rvord_qunt;
	}

	public String getRvord_uprc(){
		return this.rvord_uprc;
	}

	public String getRvord_amt(){
		return this.rvord_amt;
	}

	public String getAcwr_incmg_dt_tm(){
		return this.acwr_incmg_dt_tm;
	}

	public String getDraft_end_dt(){
		return this.draft_end_dt;
	}

	public String getDlvs_dt(){
		return this.dlvs_dt;
	}

	public String getPurc_dlco_nm(){
		return this.purc_dlco_nm;
	}

	public String getPurc_clsf_nm(){
		return this.purc_clsf_nm;
	}

	public String getPurc_amt(){
		return this.purc_amt;
	}

	public String getStmt_recp_yn(){
		return this.stmt_recp_yn;
	}

	public String getMake_ask_reg_seq(){
		return this.make_ask_reg_seq;
	}
}

/* 작성시간 : Thu Jun 07 16:40:01 KST 2012 */