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


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 
 */


public class AS_LEAS_1801_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String flag;
	public String occr_no;
	public String inout_clsf_nm;
	public String bldg_nm;
	public String cntr_no;
	public String hire_dlco_nm;
	public String remk;
	public String rcpm_tot_amt;
	public String actu_slip_no;
	public String hire_dlco_ern;
	public String bldg_cd;
	public String inout_clsf;
	public String occr_dt;
	public String occr_seq;

	public AS_LEAS_1801_LCURLISTRecord(){}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setOccr_no(String occr_no){
		this.occr_no = occr_no;
	}

	public void setInout_clsf_nm(String inout_clsf_nm){
		this.inout_clsf_nm = inout_clsf_nm;
	}

	public void setBldg_nm(String bldg_nm){
		this.bldg_nm = bldg_nm;
	}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setHire_dlco_nm(String hire_dlco_nm){
		this.hire_dlco_nm = hire_dlco_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setRcpm_tot_amt(String rcpm_tot_amt){
		this.rcpm_tot_amt = rcpm_tot_amt;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setInout_clsf(String inout_clsf){
		this.inout_clsf = inout_clsf;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getOccr_no(){
		return this.occr_no;
	}

	public String getInout_clsf_nm(){
		return this.inout_clsf_nm;
	}

	public String getBldg_nm(){
		return this.bldg_nm;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getHire_dlco_nm(){
		return this.hire_dlco_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getRcpm_tot_amt(){
		return this.rcpm_tot_amt;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getInout_clsf(){
		return this.inout_clsf;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}
}

/* 작성시간 : Fri May 29 09:53:59 KST 2009 */