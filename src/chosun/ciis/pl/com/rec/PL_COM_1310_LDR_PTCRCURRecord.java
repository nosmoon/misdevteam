/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.com.rec;

import java.sql.*;
import chosun.ciis.pl.com.dm.*;
import chosun.ciis.pl.com.ds.*;

/**
 * 
 */


public class PL_COM_1310_LDR_PTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_type;
	public String amt;
	public String rmtt_dt;
	public String rmtt_plac;
	public String acct_mang_no;
	public String note_no;
	public String note_clsf_cd;
	public String bank_cd;
	public String bank_nm;
	public String issu_pers_nm;
	public String issu_cmpy_clsf_cd;
	public String comp_dt;
	public String mtry_dt;
	public String slip_clsf;
	public String seq;
	public String subseq;
	public String dd_clos_yn;
	public String remk;

	public PL_COM_1310_LDR_PTCRCURRecord(){}

	public void setRcpm_type(String rcpm_type){
		this.rcpm_type = rcpm_type;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setRmtt_dt(String rmtt_dt){
		this.rmtt_dt = rmtt_dt;
	}

	public void setRmtt_plac(String rmtt_plac){
		this.rmtt_plac = rmtt_plac;
	}

	public void setAcct_mang_no(String acct_mang_no){
		this.acct_mang_no = acct_mang_no;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setIssu_cmpy_clsf_cd(String issu_cmpy_clsf_cd){
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSubseq(String subseq){
		this.subseq = subseq;
	}

	public void setDd_clos_yn(String dd_clos_yn){
		this.dd_clos_yn = dd_clos_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getRcpm_type(){
		return this.rcpm_type;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getRmtt_dt(){
		return this.rmtt_dt;
	}

	public String getRmtt_plac(){
		return this.rmtt_plac;
	}

	public String getAcct_mang_no(){
		return this.acct_mang_no;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getIssu_cmpy_clsf_cd(){
		return this.issu_cmpy_clsf_cd;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSubseq(){
		return this.subseq;
	}

	public String getDd_clos_yn(){
		return this.dd_clos_yn;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Apr 22 20:01:20 KST 2009 */