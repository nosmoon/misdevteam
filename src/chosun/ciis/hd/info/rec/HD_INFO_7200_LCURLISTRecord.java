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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_7200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String frlc_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String mang_no;
	public String pay_mm;
	public String chrg_posk_cd;
	public String chrg_posk_nm;
	public String medi_cd;
	public String thrw_pgm;
	public String thrw_pgm_nm;
	public String cntr_dt;
	public String lvcmpy_dt;
	public String duty_dds;
	public String pay_cycl;
	public String pay_cycl_nm;
	public String servcost;
	public String duty_tms;
	public String base_amt;
	public String etc_amt;
	public String tot_amt;
	public String incm_clsf_cd;
	public String incm_clsf_nm;
	public String pay_amt;
	public String incm_tax;
	public String res_tax;
	public String draft_no;
	public String draft_dept_cd;
	public String budg_cd;
	public String budg_nm;
	public String bank_cd;
	public String acct_no;
	public String remk;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String slip_proc_seq;
	public String proc_stat;
	public String proc_stat_nm;
	public String actu_slip_no;

	public HD_INFO_7200_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrlc_no(String frlc_no){
		this.frlc_no = frlc_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setPay_mm(String pay_mm){
		this.pay_mm = pay_mm;
	}

	public void setChrg_posk_cd(String chrg_posk_cd){
		this.chrg_posk_cd = chrg_posk_cd;
	}

	public void setChrg_posk_nm(String chrg_posk_nm){
		this.chrg_posk_nm = chrg_posk_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setThrw_pgm(String thrw_pgm){
		this.thrw_pgm = thrw_pgm;
	}

	public void setThrw_pgm_nm(String thrw_pgm_nm){
		this.thrw_pgm_nm = thrw_pgm_nm;
	}

	public void setCntr_dt(String cntr_dt){
		this.cntr_dt = cntr_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setDuty_dds(String duty_dds){
		this.duty_dds = duty_dds;
	}

	public void setPay_cycl(String pay_cycl){
		this.pay_cycl = pay_cycl;
	}

	public void setPay_cycl_nm(String pay_cycl_nm){
		this.pay_cycl_nm = pay_cycl_nm;
	}

	public void setServcost(String servcost){
		this.servcost = servcost;
	}

	public void setDuty_tms(String duty_tms){
		this.duty_tms = duty_tms;
	}

	public void setBase_amt(String base_amt){
		this.base_amt = base_amt;
	}

	public void setEtc_amt(String etc_amt){
		this.etc_amt = etc_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setIncm_clsf_nm(String incm_clsf_nm){
		this.incm_clsf_nm = incm_clsf_nm;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setDraft_no(String draft_no){
		this.draft_no = draft_no;
	}

	public void setDraft_dept_cd(String draft_dept_cd){
		this.draft_dept_cd = draft_dept_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setSlip_proc_seq(String slip_proc_seq){
		this.slip_proc_seq = slip_proc_seq;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrlc_no(){
		return this.frlc_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getPay_mm(){
		return this.pay_mm;
	}

	public String getChrg_posk_cd(){
		return this.chrg_posk_cd;
	}

	public String getChrg_posk_nm(){
		return this.chrg_posk_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getThrw_pgm(){
		return this.thrw_pgm;
	}

	public String getThrw_pgm_nm(){
		return this.thrw_pgm_nm;
	}

	public String getCntr_dt(){
		return this.cntr_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getDuty_dds(){
		return this.duty_dds;
	}

	public String getPay_cycl(){
		return this.pay_cycl;
	}

	public String getPay_cycl_nm(){
		return this.pay_cycl_nm;
	}

	public String getServcost(){
		return this.servcost;
	}

	public String getDuty_tms(){
		return this.duty_tms;
	}

	public String getBase_amt(){
		return this.base_amt;
	}

	public String getEtc_amt(){
		return this.etc_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getIncm_clsf_nm(){
		return this.incm_clsf_nm;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getDraft_no(){
		return this.draft_no;
	}

	public String getDraft_dept_cd(){
		return this.draft_dept_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getSlip_proc_seq(){
		return this.slip_proc_seq;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}
}

/* 작성시간 : Thu Apr 25 14:54:40 KST 2013 */