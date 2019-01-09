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


package chosun.ciis.hd.cost.rec;

import java.sql.*;
import chosun.ciis.hd.cost.dm.*;
import chosun.ciis.hd.cost.ds.*;

/**
 * 
 */


public class HD_COST_1100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String subj_sel_dt;
	public String real_fee_subj_sel_item_cd;
	public String item_seq;
	public String real_fee_subj_sel_fee;
	public String subj_sel_ptcr;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String medi_cd;
	public String dtls_medi_cd;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String slip_proc_seq;
	public String proc_stat;
	public String proc_stat_nm;
	public String actu_slip_no;

	public HD_COST_1100_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setSubj_sel_dt(String subj_sel_dt){
		this.subj_sel_dt = subj_sel_dt;
	}

	public void setReal_fee_subj_sel_item_cd(String real_fee_subj_sel_item_cd){
		this.real_fee_subj_sel_item_cd = real_fee_subj_sel_item_cd;
	}

	public void setItem_seq(String item_seq){
		this.item_seq = item_seq;
	}

	public void setReal_fee_subj_sel_fee(String real_fee_subj_sel_fee){
		this.real_fee_subj_sel_fee = real_fee_subj_sel_fee;
	}

	public void setSubj_sel_ptcr(String subj_sel_ptcr){
		this.subj_sel_ptcr = subj_sel_ptcr;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
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

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
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

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getSubj_sel_dt(){
		return this.subj_sel_dt;
	}

	public String getReal_fee_subj_sel_item_cd(){
		return this.real_fee_subj_sel_item_cd;
	}

	public String getItem_seq(){
		return this.item_seq;
	}

	public String getReal_fee_subj_sel_fee(){
		return this.real_fee_subj_sel_fee;
	}

	public String getSubj_sel_ptcr(){
		return this.subj_sel_ptcr;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
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

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
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

/* 작성시간 : Thu Aug 16 15:04:07 KST 2012 */