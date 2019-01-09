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


public class EN_EVNT_1003_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_seq;
	public String evnt_nm;
	public String evnt_type;
	public String regu_non_regu_clsf;
	public String spons_clsf;
	public int entr_cost;
	public int charg_entr_nops;
	public int free_entr_nops;
	public int grp_entr_nops;
	public int grp_entr_team_cnt;
	public int evnt_dds;
	public String evnt_frdt;
	public String evnt_todt;
	public String plac_1;
	public String plac_2;
	public String plac_3;
	public String dept_cd;
	public String dept_nm;
	public String chrg_pers_emp_no;
	public String chrg_pers_emp_nm;
	public String reven_budg_amt;
	public String expn_budg_amt;
	public String enpr_reven_stlm_amt;
	public String enpr_expn_stlm_amt;
	public String acct_reven_stlm_amt;
	public String acct_expn_stlm_amt;
	public String stlm_dt;
	public String stlm_proc_dt;
	public String stlm_proc_pers_emp_no;
	public String vat_incd_yn;
	public String incmg_pers;
	public String incmg_pers_emp_nm;
	public String incmg_dt;
	public String chg_pers;
	public String chg_pers_emp_nm;
	public String chg_dt;
	public String evnt_cd_nm;

	public EN_EVNT_1003_SCURLISTRecord(){}

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

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setEvnt_type(String evnt_type){
		this.evnt_type = evnt_type;
	}

	public void setRegu_non_regu_clsf(String regu_non_regu_clsf){
		this.regu_non_regu_clsf = regu_non_regu_clsf;
	}

	public void setSpons_clsf(String spons_clsf){
		this.spons_clsf = spons_clsf;
	}

	public void setEntr_cost(int entr_cost){
		this.entr_cost = entr_cost;
	}

	public void setCharg_entr_nops(int charg_entr_nops){
		this.charg_entr_nops = charg_entr_nops;
	}

	public void setFree_entr_nops(int free_entr_nops){
		this.free_entr_nops = free_entr_nops;
	}

	public void setGrp_entr_nops(int grp_entr_nops){
		this.grp_entr_nops = grp_entr_nops;
	}

	public void setGrp_entr_team_cnt(int grp_entr_team_cnt){
		this.grp_entr_team_cnt = grp_entr_team_cnt;
	}

	public void setEvnt_dds(int evnt_dds){
		this.evnt_dds = evnt_dds;
	}

	public void setEvnt_frdt(String evnt_frdt){
		this.evnt_frdt = evnt_frdt;
	}

	public void setEvnt_todt(String evnt_todt){
		this.evnt_todt = evnt_todt;
	}

	public void setPlac_1(String plac_1){
		this.plac_1 = plac_1;
	}

	public void setPlac_2(String plac_2){
		this.plac_2 = plac_2;
	}

	public void setPlac_3(String plac_3){
		this.plac_3 = plac_3;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setChrg_pers_emp_no(String chrg_pers_emp_no){
		this.chrg_pers_emp_no = chrg_pers_emp_no;
	}

	public void setChrg_pers_emp_nm(String chrg_pers_emp_nm){
		this.chrg_pers_emp_nm = chrg_pers_emp_nm;
	}

	public void setReven_budg_amt(String reven_budg_amt){
		this.reven_budg_amt = reven_budg_amt;
	}

	public void setExpn_budg_amt(String expn_budg_amt){
		this.expn_budg_amt = expn_budg_amt;
	}

	public void setEnpr_reven_stlm_amt(String enpr_reven_stlm_amt){
		this.enpr_reven_stlm_amt = enpr_reven_stlm_amt;
	}

	public void setEnpr_expn_stlm_amt(String enpr_expn_stlm_amt){
		this.enpr_expn_stlm_amt = enpr_expn_stlm_amt;
	}

	public void setAcct_reven_stlm_amt(String acct_reven_stlm_amt){
		this.acct_reven_stlm_amt = acct_reven_stlm_amt;
	}

	public void setAcct_expn_stlm_amt(String acct_expn_stlm_amt){
		this.acct_expn_stlm_amt = acct_expn_stlm_amt;
	}

	public void setStlm_dt(String stlm_dt){
		this.stlm_dt = stlm_dt;
	}

	public void setStlm_proc_dt(String stlm_proc_dt){
		this.stlm_proc_dt = stlm_proc_dt;
	}

	public void setStlm_proc_pers_emp_no(String stlm_proc_pers_emp_no){
		this.stlm_proc_pers_emp_no = stlm_proc_pers_emp_no;
	}

	public void setVat_incd_yn(String vat_incd_yn){
		this.vat_incd_yn = vat_incd_yn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_emp_nm(String incmg_pers_emp_nm){
		this.incmg_pers_emp_nm = incmg_pers_emp_nm;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_pers_emp_nm(String chg_pers_emp_nm){
		this.chg_pers_emp_nm = chg_pers_emp_nm;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setEvnt_cd_nm(String evnt_cd_nm){
		this.evnt_cd_nm = evnt_cd_nm;
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

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getEvnt_type(){
		return this.evnt_type;
	}

	public String getRegu_non_regu_clsf(){
		return this.regu_non_regu_clsf;
	}

	public String getSpons_clsf(){
		return this.spons_clsf;
	}

	public int getEntr_cost(){
		return this.entr_cost;
	}

	public int getCharg_entr_nops(){
		return this.charg_entr_nops;
	}

	public int getFree_entr_nops(){
		return this.free_entr_nops;
	}

	public int getGrp_entr_nops(){
		return this.grp_entr_nops;
	}

	public int getGrp_entr_team_cnt(){
		return this.grp_entr_team_cnt;
	}

	public int getEvnt_dds(){
		return this.evnt_dds;
	}

	public String getEvnt_frdt(){
		return this.evnt_frdt;
	}

	public String getEvnt_todt(){
		return this.evnt_todt;
	}

	public String getPlac_1(){
		return this.plac_1;
	}

	public String getPlac_2(){
		return this.plac_2;
	}

	public String getPlac_3(){
		return this.plac_3;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getChrg_pers_emp_no(){
		return this.chrg_pers_emp_no;
	}

	public String getChrg_pers_emp_nm(){
		return this.chrg_pers_emp_nm;
	}

	public String getReven_budg_amt(){
		return this.reven_budg_amt;
	}

	public String getExpn_budg_amt(){
		return this.expn_budg_amt;
	}

	public String getEnpr_reven_stlm_amt(){
		return this.enpr_reven_stlm_amt;
	}

	public String getEnpr_expn_stlm_amt(){
		return this.enpr_expn_stlm_amt;
	}

	public String getAcct_reven_stlm_amt(){
		return this.acct_reven_stlm_amt;
	}

	public String getAcct_expn_stlm_amt(){
		return this.acct_expn_stlm_amt;
	}

	public String getStlm_dt(){
		return this.stlm_dt;
	}

	public String getStlm_proc_dt(){
		return this.stlm_proc_dt;
	}

	public String getStlm_proc_pers_emp_no(){
		return this.stlm_proc_pers_emp_no;
	}

	public String getVat_incd_yn(){
		return this.vat_incd_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_emp_nm(){
		return this.incmg_pers_emp_nm;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_pers_emp_nm(){
		return this.chg_pers_emp_nm;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getEvnt_cd_nm(){
		return this.evnt_cd_nm;
	}
}

/* 작성시간 : Fri Mar 04 19:18:59 KST 2011 */