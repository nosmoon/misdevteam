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


public class HD_INFO_7110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String supr_dept_cd;
	public String dept_nm;
	public String frlc_no;
	public String flnm;
	public String chrg_posk_cd;
	public String chrg_posk_cd_nm;
	public String medi_cd;
	public String thrw_pgm;
	public String thrw_pgm_nm;
	public String medi_cd2;
	public String thrw_pgm2;
	public String thrw_pgm2_nm;
	public String cntr_dt;
	public String cntr_expr_dt;
	public String lvcmpy_dt;
	public String work_yn;
	public String servcost;
	public String pay_cycl;
	public String etc_pay_cond;
	public String prn;
	public String tel_no;
	public String addr;
	public String draft_no;
	public String draft_dept_cd;
	public String mang_no;
	public String setl_bank;
	public String acct_no;
	public String bank_nm;
	public String incm_clsf_cd;
	public String incm_clsf_nm;
	public String chrg_posk_nm;
	public String all_insr_dduc_yn;
	public String remk;

	public HD_INFO_7110_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setFrlc_no(String frlc_no){
		this.frlc_no = frlc_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setChrg_posk_cd(String chrg_posk_cd){
		this.chrg_posk_cd = chrg_posk_cd;
	}

	public void setChrg_posk_cd_nm(String chrg_posk_cd_nm){
		this.chrg_posk_cd_nm = chrg_posk_cd_nm;
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

	public void setMedi_cd2(String medi_cd2){
		this.medi_cd2 = medi_cd2;
	}

	public void setThrw_pgm2(String thrw_pgm2){
		this.thrw_pgm2 = thrw_pgm2;
	}

	public void setThrw_pgm2_nm(String thrw_pgm2_nm){
		this.thrw_pgm2_nm = thrw_pgm2_nm;
	}

	public void setCntr_dt(String cntr_dt){
		this.cntr_dt = cntr_dt;
	}

	public void setCntr_expr_dt(String cntr_expr_dt){
		this.cntr_expr_dt = cntr_expr_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setWork_yn(String work_yn){
		this.work_yn = work_yn;
	}

	public void setServcost(String servcost){
		this.servcost = servcost;
	}

	public void setPay_cycl(String pay_cycl){
		this.pay_cycl = pay_cycl;
	}

	public void setEtc_pay_cond(String etc_pay_cond){
		this.etc_pay_cond = etc_pay_cond;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDraft_no(String draft_no){
		this.draft_no = draft_no;
	}

	public void setDraft_dept_cd(String draft_dept_cd){
		this.draft_dept_cd = draft_dept_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setSetl_bank(String setl_bank){
		this.setl_bank = setl_bank;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setIncm_clsf_nm(String incm_clsf_nm){
		this.incm_clsf_nm = incm_clsf_nm;
	}

	public void setChrg_posk_nm(String chrg_posk_nm){
		this.chrg_posk_nm = chrg_posk_nm;
	}

	public void setAll_insr_dduc_yn(String all_insr_dduc_yn){
		this.all_insr_dduc_yn = all_insr_dduc_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getFrlc_no(){
		return this.frlc_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getChrg_posk_cd(){
		return this.chrg_posk_cd;
	}

	public String getChrg_posk_cd_nm(){
		return this.chrg_posk_cd_nm;
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

	public String getMedi_cd2(){
		return this.medi_cd2;
	}

	public String getThrw_pgm2(){
		return this.thrw_pgm2;
	}

	public String getThrw_pgm2_nm(){
		return this.thrw_pgm2_nm;
	}

	public String getCntr_dt(){
		return this.cntr_dt;
	}

	public String getCntr_expr_dt(){
		return this.cntr_expr_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getWork_yn(){
		return this.work_yn;
	}

	public String getServcost(){
		return this.servcost;
	}

	public String getPay_cycl(){
		return this.pay_cycl;
	}

	public String getEtc_pay_cond(){
		return this.etc_pay_cond;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDraft_no(){
		return this.draft_no;
	}

	public String getDraft_dept_cd(){
		return this.draft_dept_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getSetl_bank(){
		return this.setl_bank;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getIncm_clsf_nm(){
		return this.incm_clsf_nm;
	}

	public String getChrg_posk_nm(){
		return this.chrg_posk_nm;
	}

	public String getAll_insr_dduc_yn(){
		return this.all_insr_dduc_yn;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri Jul 13 13:57:56 KST 2018 */