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


package chosun.ciis.sp.dep.rec;

import java.sql.*;
import chosun.ciis.sp.dep.dm.*;
import chosun.ciis.sp.dep.ds.*;

/**
 * 
 */


public class SP_DEP_1751_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String slip_clsf;
	public String slip_clsf_nm;
	public String seq;
	public String subseq;
	public String rcpm_slip_no;
	public String rcpm_plac_clsf;
	public String rcpm_plac_clsf_nm;
	public String dlco_no;
	public String dlco_nm;
	public String total_amt;
	public String rcpm_clsf;
	public String note_clsf_cd;
	public String rcpm_clsf_nm;
	public String amt;
	public String advt_amt;
	public String mchrg_pers;
	public String mchrg_pers_nm;
	public String rcpm_acct;
	public String rcpm_acct_nm;
	public String sale_aprv_no;

	public SP_DEP_1751_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSlip_clsf_nm(String slip_clsf_nm){
		this.slip_clsf_nm = slip_clsf_nm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSubseq(String subseq){
		this.subseq = subseq;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setRcpm_plac_clsf(String rcpm_plac_clsf){
		this.rcpm_plac_clsf = rcpm_plac_clsf;
	}

	public void setRcpm_plac_clsf_nm(String rcpm_plac_clsf_nm){
		this.rcpm_plac_clsf_nm = rcpm_plac_clsf_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setTotal_amt(String total_amt){
		this.total_amt = total_amt;
	}

	public void setRcpm_clsf(String rcpm_clsf){
		this.rcpm_clsf = rcpm_clsf;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setRcpm_clsf_nm(String rcpm_clsf_nm){
		this.rcpm_clsf_nm = rcpm_clsf_nm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setAdvt_amt(String advt_amt){
		this.advt_amt = advt_amt;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setRcpm_acct(String rcpm_acct){
		this.rcpm_acct = rcpm_acct;
	}

	public void setRcpm_acct_nm(String rcpm_acct_nm){
		this.rcpm_acct_nm = rcpm_acct_nm;
	}

	public void setSale_aprv_no(String sale_aprv_no){
		this.sale_aprv_no = sale_aprv_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSlip_clsf_nm(){
		return this.slip_clsf_nm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSubseq(){
		return this.subseq;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getRcpm_plac_clsf(){
		return this.rcpm_plac_clsf;
	}

	public String getRcpm_plac_clsf_nm(){
		return this.rcpm_plac_clsf_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getTotal_amt(){
		return this.total_amt;
	}

	public String getRcpm_clsf(){
		return this.rcpm_clsf;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getRcpm_clsf_nm(){
		return this.rcpm_clsf_nm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getAdvt_amt(){
		return this.advt_amt;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getRcpm_acct(){
		return this.rcpm_acct;
	}

	public String getRcpm_acct_nm(){
		return this.rcpm_acct_nm;
	}

	public String getSale_aprv_no(){
		return this.sale_aprv_no;
	}
}

/* 작성시간 : Thu Aug 09 15:42:24 KST 2012 */