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


public class IS_AGR_2810_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String proc_stat_nm;
	public String dlvs_dt;
	public String make_ask_reg_dt;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers;
	public String dlco_nm;
	public String advcs_cd_nm;
	public String std_cd_nm;
	public String suply_amt;
	public String vat_amt;
	public String tot_rvord_amt;
	public String prt_paper_cd_nm;
	public String prt_plan_dt;
	public String work_clsf_nm;
	public String clr_cd_nm;
	public String pcnt_clsf_nm;
	public String yy;
	public String purc_dlco_nm;
	public String purc_clsf_nm;
	public String purc_amt;
	public String make_ask_reg_seq;

	public IS_AGR_2810_LCURLISTRecord(){}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setDlvs_dt(String dlvs_dt){
		this.dlvs_dt = dlvs_dt;
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

	public void setAdvcs_cd_nm(String advcs_cd_nm){
		this.advcs_cd_nm = advcs_cd_nm;
	}

	public void setStd_cd_nm(String std_cd_nm){
		this.std_cd_nm = std_cd_nm;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setTot_rvord_amt(String tot_rvord_amt){
		this.tot_rvord_amt = tot_rvord_amt;
	}

	public void setPrt_paper_cd_nm(String prt_paper_cd_nm){
		this.prt_paper_cd_nm = prt_paper_cd_nm;
	}

	public void setPrt_plan_dt(String prt_plan_dt){
		this.prt_plan_dt = prt_plan_dt;
	}

	public void setWork_clsf_nm(String work_clsf_nm){
		this.work_clsf_nm = work_clsf_nm;
	}

	public void setClr_cd_nm(String clr_cd_nm){
		this.clr_cd_nm = clr_cd_nm;
	}

	public void setPcnt_clsf_nm(String pcnt_clsf_nm){
		this.pcnt_clsf_nm = pcnt_clsf_nm;
	}

	public void setYy(String yy){
		this.yy = yy;
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

	public void setMake_ask_reg_seq(String make_ask_reg_seq){
		this.make_ask_reg_seq = make_ask_reg_seq;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getDlvs_dt(){
		return this.dlvs_dt;
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

	public String getAdvcs_cd_nm(){
		return this.advcs_cd_nm;
	}

	public String getStd_cd_nm(){
		return this.std_cd_nm;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getTot_rvord_amt(){
		return this.tot_rvord_amt;
	}

	public String getPrt_paper_cd_nm(){
		return this.prt_paper_cd_nm;
	}

	public String getPrt_plan_dt(){
		return this.prt_plan_dt;
	}

	public String getWork_clsf_nm(){
		return this.work_clsf_nm;
	}

	public String getClr_cd_nm(){
		return this.clr_cd_nm;
	}

	public String getPcnt_clsf_nm(){
		return this.pcnt_clsf_nm;
	}

	public String getYy(){
		return this.yy;
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

	public String getMake_ask_reg_seq(){
		return this.make_ask_reg_seq;
	}
}

/* 작성시간 : Wed Jun 06 17:19:31 KST 2012 */