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


package chosun.ciis.pl.rcp.rec;

import java.sql.*;
import chosun.ciis.pl.rcp.dm.*;
import chosun.ciis.pl.rcp.ds.*;

/**
 * 
 */


public class PL_RCP_3210_LPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_dt;
	public String basi_yymm;
	public String dlco_clsf_nm;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String rcpm_shet_no;
	public String rmtt_plac;
	public String budg_nm;
	public String amt;
	public String remk;
	public String rmtt_dt;

	public PL_RCP_3210_LPTCRLISTRecord(){}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setDlco_clsf_nm(String dlco_clsf_nm){
		this.dlco_clsf_nm = dlco_clsf_nm;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setRmtt_plac(String rmtt_plac){
		this.rmtt_plac = rmtt_plac;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setRmtt_dt(String rmtt_dt){
		this.rmtt_dt = rmtt_dt;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getDlco_clsf_nm(){
		return this.dlco_clsf_nm;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getRmtt_plac(){
		return this.rmtt_plac;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getRemk(){
		return this.remk;
	}
	
	public String getRmtt_dt(){
		return this.rmtt_dt;
	}
}

/* 작성시간 : Thu Sep 10 18:34:53 KST 2009 */