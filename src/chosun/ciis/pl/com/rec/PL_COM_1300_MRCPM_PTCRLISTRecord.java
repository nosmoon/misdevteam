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


public class PL_COM_1300_MRCPM_PTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_dt;
	public String dlco_clsf_nm;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String amt;
	public String rcpm_shet_no;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String dd_clos_yn;
	public String gurt_amt;

	public PL_COM_1300_MRCPM_PTCRLISTRecord(){}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
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

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDd_clos_yn(String dd_clos_yn){
		this.dd_clos_yn = dd_clos_yn;
	}

	public void setGurt_amt(String gurt_amt){
		this.gurt_amt = gurt_amt;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
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

	public String getAmt(){
		return this.amt;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDd_clos_yn(){
		return this.dd_clos_yn;
	}

	public String getGurt_amt(){
		return this.gurt_amt;
	}
}

/* 작성시간 : Wed Apr 22 20:01:20 KST 2009 */