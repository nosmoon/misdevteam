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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1702_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_dt;
	public String remk;
	public String rcpm_tot_amt;
	public String actu_slip;
	public String rcpm_shet_no;
	public String chg_dt;
	public String dlco_nm;
	public String misu_amt;
	public String misu_remk;
	public String occr_dt;
	public String occr_seq;
	public String ref_occr_dt;
	public String ref_occr_seq;
	public String actu_slip_dt;
	public String slip_clsf_cd;
	public String actu_slip_no;
	public String dlco_ern;
	public String dlco_clsf_cd;

	public AS_ASET_1702_LCURLISTRecord(){}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setRcpm_tot_amt(String rcpm_tot_amt){
		this.rcpm_tot_amt = rcpm_tot_amt;
	}

	public void setActu_slip(String actu_slip){
		this.actu_slip = actu_slip;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public void setMisu_remk(String misu_remk){
		this.misu_remk = misu_remk;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setRef_occr_dt(String ref_occr_dt){
		this.ref_occr_dt = ref_occr_dt;
	}

	public void setRef_occr_seq(String ref_occr_seq){
		this.ref_occr_seq = ref_occr_seq;
	}

	public void setActu_slip_dt(String actu_slip_dt){
		this.actu_slip_dt = actu_slip_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setDlco_ern(String dlco_ern){
		this.dlco_ern = dlco_ern;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getRcpm_tot_amt(){
		return this.rcpm_tot_amt;
	}

	public String getActu_slip(){
		return this.actu_slip;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}

	public String getMisu_remk(){
		return this.misu_remk;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getRef_occr_dt(){
		return this.ref_occr_dt;
	}

	public String getRef_occr_seq(){
		return this.ref_occr_seq;
	}

	public String getActu_slip_dt(){
		return this.actu_slip_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getDlco_ern(){
		return this.dlco_ern;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}
}

/* 작성시간 : Tue Mar 31 20:33:44 KST 2009 */