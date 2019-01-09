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


package chosun.ciis.as.lear.rec;

import java.sql.*;
import chosun.ciis.as.lear.dm.*;
import chosun.ciis.as.lear.ds.*;

/**
 * 
 */


public class AS_LEAR_1401_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bldg_nm;
	public String cntr_no;
	public String hire_dlco_nm;
	public String clam_amt;
	public String vat_clam_amt;
	public String clam_tot_amt;
	public String leas_fr_dt;
	public String leas_to_dt;
	public String cmpy_cd;
	public String bldg_cd;
	public String cntr_yy;
	public String cntr_seq;
	public String rcpm_amt;
	public String hire_dlco_ern;
	public String midw_expy_dt;
	public String pymt_clsf;
	public String leas_clam_amt;
	public String leas_clam_cycl;
	public String mang_clam_cycl;
	public String leas_cntr_dt;

	public AS_LEAR_1401_LCURLISTRecord(){}

	public void setBldg_nm(String bldg_nm){
		this.bldg_nm = bldg_nm;
	}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setHire_dlco_nm(String hire_dlco_nm){
		this.hire_dlco_nm = hire_dlco_nm;
	}

	public void setClam_amt(String clam_amt){
		this.clam_amt = clam_amt;
	}

	public void setVat_clam_amt(String vat_clam_amt){
		this.vat_clam_amt = vat_clam_amt;
	}

	public void setClam_tot_amt(String clam_tot_amt){
		this.clam_tot_amt = clam_tot_amt;
	}

	public void setLeas_fr_dt(String leas_fr_dt){
		this.leas_fr_dt = leas_fr_dt;
	}

	public void setLeas_to_dt(String leas_to_dt){
		this.leas_to_dt = leas_to_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setCntr_yy(String cntr_yy){
		this.cntr_yy = cntr_yy;
	}

	public void setCntr_seq(String cntr_seq){
		this.cntr_seq = cntr_seq;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public void setMidw_expy_dt(String midw_expy_dt){
		this.midw_expy_dt = midw_expy_dt;
	}

	public void setPymt_clsf(String pymt_clsf){
		this.pymt_clsf = pymt_clsf;
	}

	public void setLeas_clam_amt(String leas_clam_amt){
		this.leas_clam_amt = leas_clam_amt;
	}

	public void setLeas_clam_cycl(String leas_clam_cycl){
		this.leas_clam_cycl = leas_clam_cycl;
	}

	public void setMang_clam_cycl(String mang_clam_cycl){
		this.mang_clam_cycl = mang_clam_cycl;
	}

	public void setLeas_cntr_dt(String leas_cntr_dt){
		this.leas_cntr_dt = leas_cntr_dt;
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

	public String getClam_amt(){
		return this.clam_amt;
	}

	public String getVat_clam_amt(){
		return this.vat_clam_amt;
	}

	public String getClam_tot_amt(){
		return this.clam_tot_amt;
	}

	public String getLeas_fr_dt(){
		return this.leas_fr_dt;
	}

	public String getLeas_to_dt(){
		return this.leas_to_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getCntr_yy(){
		return this.cntr_yy;
	}

	public String getCntr_seq(){
		return this.cntr_seq;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
	}

	public String getMidw_expy_dt(){
		return this.midw_expy_dt;
	}

	public String getPymt_clsf(){
		return this.pymt_clsf;
	}

	public String getLeas_clam_amt(){
		return this.leas_clam_amt;
	}

	public String getLeas_clam_cycl(){
		return this.leas_clam_cycl;
	}

	public String getMang_clam_cycl(){
		return this.mang_clam_cycl;
	}

	public String getLeas_cntr_dt(){
		return this.leas_cntr_dt;
	}
}

/* 작성시간 : Fri May 08 09:47:29 KST 2009 */