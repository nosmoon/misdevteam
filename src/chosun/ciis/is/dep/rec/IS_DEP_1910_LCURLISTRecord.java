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


package chosun.ciis.is.dep.rec;

import java.sql.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;

/**
 * 
 */


public class IS_DEP_1910_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String dlco_nm;
	public String rmsg_ptph;
	public String amt;
	public String rcpm_clsf_nm;
	public String acct_mang_no_nm;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers;
	public String sms_trsm_yn;
	public String slip_clsf;
	public String seq;
	public String subseq;

	public IS_DEP_1910_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setRmsg_ptph(String rmsg_ptph){
		this.rmsg_ptph = rmsg_ptph;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setRcpm_clsf_nm(String rcpm_clsf_nm){
		this.rcpm_clsf_nm = rcpm_clsf_nm;
	}

	public void setAcct_mang_no_nm(String acct_mang_no_nm){
		this.acct_mang_no_nm = acct_mang_no_nm;
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

	public void setSms_trsm_yn(String sms_trsm_yn){
		this.sms_trsm_yn = sms_trsm_yn;
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

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getRmsg_ptph(){
		return this.rmsg_ptph;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getRcpm_clsf_nm(){
		return this.rcpm_clsf_nm;
	}

	public String getAcct_mang_no_nm(){
		return this.acct_mang_no_nm;
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

	public String getSms_trsm_yn(){
		return this.sms_trsm_yn;
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
}

/* 작성시간 : Thu May 24 14:43:38 KST 2012 */