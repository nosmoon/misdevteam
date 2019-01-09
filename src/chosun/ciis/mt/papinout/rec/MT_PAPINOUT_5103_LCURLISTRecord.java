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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_5103_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String dlco_cd;
	public String ern;
	public String dlco_nm;
	public String rcpm_dt;
	public String bank_cd;
	public String acct_no;
	public String rcpm_nm;
	public String cnsm_frdt;
	public String cnsm_todt;
	public String tax_stmt_dt;
	public String tax_stmt_seq;
	public String slip_proc_occr_dt;
	public String slip_proc_seq;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String remk;

	public MT_PAPINOUT_5103_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setRcpm_nm(String rcpm_nm){
		this.rcpm_nm = rcpm_nm;
	}

	public void setCnsm_frdt(String cnsm_frdt){
		this.cnsm_frdt = cnsm_frdt;
	}

	public void setCnsm_todt(String cnsm_todt){
		this.cnsm_todt = cnsm_todt;
	}

	public void setTax_stmt_dt(String tax_stmt_dt){
		this.tax_stmt_dt = tax_stmt_dt;
	}

	public void setTax_stmt_seq(String tax_stmt_seq){
		this.tax_stmt_seq = tax_stmt_seq;
	}

	public void setSlip_proc_occr_dt(String slip_proc_occr_dt){
		this.slip_proc_occr_dt = slip_proc_occr_dt;
	}

	public void setSlip_proc_seq(String slip_proc_seq){
		this.slip_proc_seq = slip_proc_seq;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getRcpm_nm(){
		return this.rcpm_nm;
	}

	public String getCnsm_frdt(){
		return this.cnsm_frdt;
	}

	public String getCnsm_todt(){
		return this.cnsm_todt;
	}

	public String getTax_stmt_dt(){
		return this.tax_stmt_dt;
	}

	public String getTax_stmt_seq(){
		return this.tax_stmt_seq;
	}

	public String getSlip_proc_occr_dt(){
		return this.slip_proc_occr_dt;
	}

	public String getSlip_proc_seq(){
		return this.slip_proc_seq;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri Sep 18 12:20:56 KST 2009 */