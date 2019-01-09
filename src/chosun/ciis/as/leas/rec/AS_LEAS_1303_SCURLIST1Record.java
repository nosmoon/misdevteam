/***************************************************************************************************
* 파일명 : .java
* 기능 :  임대 입출금 관리 - 상세조회
* 작성일자 : 2010-06-07
* 작성자 : 노상현
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
 * 임대입출금 관리 - 상세조회
 */


public class AS_LEAS_1303_SCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String flag;
	public String occr_dt;
	public String occr_seq;
	public String rcpm_dt;
	public String rcpm_shet_no;
	public String dlco_clsf_cd;
	public String dlco_ern;
	public String hire_dlco_nm;
	public String remk;
	public String inout_clsf;
	public String inout_acct_clsf;
	public String gurt_payo_clsf;
	public String bldg_cd;
	public String bldg_nm;
	public String cntr_yy;
	public String cntr_seq;
	public String cntr_no;
	public String clam_yymm;
	public String clam_seq;
	public String leas_clam_amt;
	public String mang_clam_amt;
	public String vat_clam_amt;
	public String clam_tot_amt;
	public String leas_rcpm_amt;
	public String mang_rcpm_amt;
	public String vat_rcpm_amt;
	public String rcpm_tot_amt;
	public String gurt_amt;
	public String precpt_amt;
	public String gurt_rcpm_amt;
	public String precpt_rcpm_amt;
	public String trufnd_rcpm_amt;
	public String trufnd_dlco_ern;
	public String trufnd_dlco_nm;
	public String trufnd_slip_clsf_cd;
	public String slip_no;

	public AS_LEAS_1303_SCURLIST1Record(){}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_ern(String dlco_ern){
		this.dlco_ern = dlco_ern;
	}

	public void setHire_dlco_nm(String hire_dlco_nm){
		this.hire_dlco_nm = hire_dlco_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setInout_clsf(String inout_clsf){
		this.inout_clsf = inout_clsf;
	}

	public void setInout_acct_clsf(String inout_acct_clsf){
		this.inout_acct_clsf = inout_acct_clsf;
	}

	public void setGurt_payo_clsf(String gurt_payo_clsf){
		this.gurt_payo_clsf = gurt_payo_clsf;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setBldg_nm(String bldg_nm){
		this.bldg_nm = bldg_nm;
	}

	public void setCntr_yy(String cntr_yy){
		this.cntr_yy = cntr_yy;
	}

	public void setCntr_seq(String cntr_seq){
		this.cntr_seq = cntr_seq;
	}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setClam_yymm(String clam_yymm){
		this.clam_yymm = clam_yymm;
	}

	public void setClam_seq(String clam_seq){
		this.clam_seq = clam_seq;
	}

	public void setLeas_clam_amt(String leas_clam_amt){
		this.leas_clam_amt = leas_clam_amt;
	}

	public void setMang_clam_amt(String mang_clam_amt){
		this.mang_clam_amt = mang_clam_amt;
	}

	public void setVat_clam_amt(String vat_clam_amt){
		this.vat_clam_amt = vat_clam_amt;
	}

	public void setClam_tot_amt(String clam_tot_amt){
		this.clam_tot_amt = clam_tot_amt;
	}

	public void setLeas_rcpm_amt(String leas_rcpm_amt){
		this.leas_rcpm_amt = leas_rcpm_amt;
	}

	public void setMang_rcpm_amt(String mang_rcpm_amt){
		this.mang_rcpm_amt = mang_rcpm_amt;
	}

	public void setVat_rcpm_amt(String vat_rcpm_amt){
		this.vat_rcpm_amt = vat_rcpm_amt;
	}

	public void setRcpm_tot_amt(String rcpm_tot_amt){
		this.rcpm_tot_amt = rcpm_tot_amt;
	}

	public void setGurt_amt(String gurt_amt){
		this.gurt_amt = gurt_amt;
	}

	public void setPrecpt_amt(String precpt_amt){
		this.precpt_amt = precpt_amt;
	}

	public void setGurt_rcpm_amt(String gurt_rcpm_amt){
		this.gurt_rcpm_amt = gurt_rcpm_amt;
	}

	public void setPrecpt_rcpm_amt(String precpt_rcpm_amt){
		this.precpt_rcpm_amt = precpt_rcpm_amt;
	}

	public void setTrufnd_rcpm_amt(String trufnd_rcpm_amt){
		this.trufnd_rcpm_amt = trufnd_rcpm_amt;
	}

	public void setTrufnd_dlco_ern(String trufnd_dlco_ern){
		this.trufnd_dlco_ern = trufnd_dlco_ern;
	}

	public void setTrufnd_dlco_nm(String trufnd_dlco_nm){
		this.trufnd_dlco_nm = trufnd_dlco_nm;
	}

	public void setTrufnd_slip_clsf_cd(String trufnd_slip_clsf_cd){
		this.trufnd_slip_clsf_cd = trufnd_slip_clsf_cd;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_ern(){
		return this.dlco_ern;
	}

	public String getHire_dlco_nm(){
		return this.hire_dlco_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getInout_clsf(){
		return this.inout_clsf;
	}

	public String getInout_acct_clsf(){
		return this.inout_acct_clsf;
	}

	public String getGurt_payo_clsf(){
		return this.gurt_payo_clsf;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getBldg_nm(){
		return this.bldg_nm;
	}

	public String getCntr_yy(){
		return this.cntr_yy;
	}

	public String getCntr_seq(){
		return this.cntr_seq;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getClam_yymm(){
		return this.clam_yymm;
	}

	public String getClam_seq(){
		return this.clam_seq;
	}

	public String getLeas_clam_amt(){
		return this.leas_clam_amt;
	}

	public String getMang_clam_amt(){
		return this.mang_clam_amt;
	}

	public String getVat_clam_amt(){
		return this.vat_clam_amt;
	}

	public String getClam_tot_amt(){
		return this.clam_tot_amt;
	}

	public String getLeas_rcpm_amt(){
		return this.leas_rcpm_amt;
	}

	public String getMang_rcpm_amt(){
		return this.mang_rcpm_amt;
	}

	public String getVat_rcpm_amt(){
		return this.vat_rcpm_amt;
	}

	public String getRcpm_tot_amt(){
		return this.rcpm_tot_amt;
	}

	public String getGurt_amt(){
		return this.gurt_amt;
	}

	public String getPrecpt_amt(){
		return this.precpt_amt;
	}

	public String getGurt_rcpm_amt(){
		return this.gurt_rcpm_amt;
	}

	public String getPrecpt_rcpm_amt(){
		return this.precpt_rcpm_amt;
	}

	public String getTrufnd_rcpm_amt(){
		return this.trufnd_rcpm_amt;
	}

	public String getTrufnd_dlco_ern(){
		return this.trufnd_dlco_ern;
	}

	public String getTrufnd_dlco_nm(){
		return this.trufnd_dlco_nm;
	}

	public String getTrufnd_slip_clsf_cd(){
		return this.trufnd_slip_clsf_cd;
	}

	public String getSlip_no(){
		return this.slip_no;
	}
}

/* 작성시간 : Mon Jun 14 19:56:40 KST 2010 */