/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_9011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_yy;
	public String basi_no;
	public String seq;
	public String dept_cd;
	public String cd_nm;
	public String dept_nm;
	public String usag_clsf_cd;
	public String journal_cd;
	public String journal_nm;
	public String prvmm_qty;
	public String qty;
	public String icdc_qty;
	public String subs_pay;
	public String subs_tot_sum;
	public String remk;
	public String clos_yn;
	public String clos_nm;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;
	public String new_occr_yn;

	public HD_AFFR_9011_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBasi_yy(String basi_yy){
		this.basi_yy = basi_yy;
	}

	public void setBasi_no(String basi_no){
		this.basi_no = basi_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setUsag_clsf_cd(String usag_clsf_cd){
		this.usag_clsf_cd = usag_clsf_cd;
	}

	public void setJournal_cd(String journal_cd){
		this.journal_cd = journal_cd;
	}

	public void setJournal_nm(String journal_nm){
		this.journal_nm = journal_nm;
	}

	public void setPrvmm_qty(String prvmm_qty){
		this.prvmm_qty = prvmm_qty;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setIcdc_qty(String icdc_qty){
		this.icdc_qty = icdc_qty;
	}

	public void setSubs_pay(String subs_pay){
		this.subs_pay = subs_pay;
	}

	public void setSubs_tot_sum(String subs_tot_sum){
		this.subs_tot_sum = subs_tot_sum;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setClos_nm(String clos_nm){
		this.clos_nm = clos_nm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setNew_occr_yn(String new_occr_yn){
		this.new_occr_yn = new_occr_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBasi_yy(){
		return this.basi_yy;
	}

	public String getBasi_no(){
		return this.basi_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getUsag_clsf_cd(){
		return this.usag_clsf_cd;
	}

	public String getJournal_cd(){
		return this.journal_cd;
	}

	public String getJournal_nm(){
		return this.journal_nm;
	}

	public String getPrvmm_qty(){
		return this.prvmm_qty;
	}

	public String getQty(){
		return this.qty;
	}

	public String getIcdc_qty(){
		return this.icdc_qty;
	}

	public String getSubs_pay(){
		return this.subs_pay;
	}

	public String getSubs_tot_sum(){
		return this.subs_tot_sum;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_nm(){
		return this.clos_nm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getNew_occr_yn(){
		return this.new_occr_yn;
	}
}

/* 작성시간 : Fri Aug 26 18:41:08 KST 2016 */