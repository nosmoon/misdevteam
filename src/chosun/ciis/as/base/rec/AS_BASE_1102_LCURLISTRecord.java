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


package chosun.ciis.as.base.rec;

import java.sql.*;
import chosun.ciis.as.base.dm.*;
import chosun.ciis.as.base.ds.*;

/**
 * 
 */


public class AS_BASE_1102_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String bund_cd;
	public String bund_nm;
	public String item_cnt;
	public String mang_dt;
	public String usag;
	public String supv_dept_cd;
	public String supv_dept_nm;
	public String dlvs_plac;
	public int tot_amt;
	public String mony_unit_cd;
	public String mony_unit_nm;
	public String ltrm_adpay_cost;
	public String leas_cmpy;
	public String leas_no;
	public String leas_frdt;
	public String leas_todt;
	public String re_leas_frdt;
	public String re_leas_todt;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String incmg_pers_nm;
	public String incmg_dt_tm_1;
	public String chg_pers;
	public String chg_dt_tm;

	public AS_BASE_1102_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBund_cd(String bund_cd){
		this.bund_cd = bund_cd;
	}

	public void setBund_nm(String bund_nm){
		this.bund_nm = bund_nm;
	}

	public void setItem_cnt(String item_cnt){
		this.item_cnt = item_cnt;
	}

	public void setMang_dt(String mang_dt){
		this.mang_dt = mang_dt;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setSupv_dept_cd(String supv_dept_cd){
		this.supv_dept_cd = supv_dept_cd;
	}

	public void setSupv_dept_nm(String supv_dept_nm){
		this.supv_dept_nm = supv_dept_nm;
	}

	public void setDlvs_plac(String dlvs_plac){
		this.dlvs_plac = dlvs_plac;
	}

	public void setTot_amt(int tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setMony_unit_cd(String mony_unit_cd){
		this.mony_unit_cd = mony_unit_cd;
	}

	public void setMony_unit_nm(String mony_unit_nm){
		this.mony_unit_nm = mony_unit_nm;
	}

	public void setLtrm_adpay_cost(String ltrm_adpay_cost){
		this.ltrm_adpay_cost = ltrm_adpay_cost;
	}

	public void setLeas_cmpy(String leas_cmpy){
		this.leas_cmpy = leas_cmpy;
	}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setLeas_frdt(String leas_frdt){
		this.leas_frdt = leas_frdt;
	}

	public void setLeas_todt(String leas_todt){
		this.leas_todt = leas_todt;
	}

	public void setRe_leas_frdt(String re_leas_frdt){
		this.re_leas_frdt = re_leas_frdt;
	}

	public void setRe_leas_todt(String re_leas_todt){
		this.re_leas_todt = re_leas_todt;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setIncmg_pers_nm(String incmg_pers_nm){
		this.incmg_pers_nm = incmg_pers_nm;
	}

	public void setIncmg_dt_tm_1(String incmg_dt_tm_1){
		this.incmg_dt_tm_1 = incmg_dt_tm_1;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBund_cd(){
		return this.bund_cd;
	}

	public String getBund_nm(){
		return this.bund_nm;
	}

	public String getItem_cnt(){
		return this.item_cnt;
	}

	public String getMang_dt(){
		return this.mang_dt;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getSupv_dept_cd(){
		return this.supv_dept_cd;
	}

	public String getSupv_dept_nm(){
		return this.supv_dept_nm;
	}

	public String getDlvs_plac(){
		return this.dlvs_plac;
	}

	public int getTot_amt(){
		return this.tot_amt;
	}

	public String getMony_unit_cd(){
		return this.mony_unit_cd;
	}

	public String getMony_unit_nm(){
		return this.mony_unit_nm;
	}

	public String getLtrm_adpay_cost(){
		return this.ltrm_adpay_cost;
	}

	public String getLeas_cmpy(){
		return this.leas_cmpy;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getLeas_frdt(){
		return this.leas_frdt;
	}

	public String getLeas_todt(){
		return this.leas_todt;
	}

	public String getRe_leas_frdt(){
		return this.re_leas_frdt;
	}

	public String getRe_leas_todt(){
		return this.re_leas_todt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getIncmg_pers_nm(){
		return this.incmg_pers_nm;
	}

	public String getIncmg_dt_tm_1(){
		return this.incmg_dt_tm_1;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
}

/* 작성시간 : Tue Feb 24 19:50:40 KST 2009 */