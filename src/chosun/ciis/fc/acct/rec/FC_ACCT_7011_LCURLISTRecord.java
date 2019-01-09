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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_7011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_cd;
	public String slip_no;
	public String fisc_dt;
	public String use_amt;
	public String rece_exp_clsf;
	public String rcpt_clsf;
	public String card_mang_no;
	public String use_pers_emp_no;
	public String rmks1;
	public String rmks2;
	public String budg_cd;
	public String use_dt;
	public String attd_fee;
	public String prof_type_cd;
	public String ern;
	public String prn;
	public String erplace_addr;
	public String firm_nm;
	public String presi_nm;

	public FC_ACCT_7011_LCURLISTRecord(){}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setUse_amt(String use_amt){
		this.use_amt = use_amt;
	}

	public void setRece_exp_clsf(String rece_exp_clsf){
		this.rece_exp_clsf = rece_exp_clsf;
	}

	public void setRcpt_clsf(String rcpt_clsf){
		this.rcpt_clsf = rcpt_clsf;
	}

	public void setCard_mang_no(String card_mang_no){
		this.card_mang_no = card_mang_no;
	}

	public void setUse_pers_emp_no(String use_pers_emp_no){
		this.use_pers_emp_no = use_pers_emp_no;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setUse_dt(String use_dt){
		this.use_dt = use_dt;
	}

	public void setAttd_fee(String attd_fee){
		this.attd_fee = attd_fee;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setErplace_addr(String erplace_addr){
		this.erplace_addr = erplace_addr;
	}

	public void setFirm_nm(String firm_nm){
		this.firm_nm = firm_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getUse_amt(){
		return this.use_amt;
	}

	public String getRece_exp_clsf(){
		return this.rece_exp_clsf;
	}

	public String getRcpt_clsf(){
		return this.rcpt_clsf;
	}

	public String getCard_mang_no(){
		return this.card_mang_no;
	}

	public String getUse_pers_emp_no(){
		return this.use_pers_emp_no;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getUse_dt(){
		return this.use_dt;
	}

	public String getAttd_fee(){
		return this.attd_fee;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getErn(){
		return this.ern;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getErplace_addr(){
		return this.erplace_addr;
	}

	public String getFirm_nm(){
		return this.firm_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}
}

/* 작성시간 : Fri Feb 06 15:09:48 KST 2009 */