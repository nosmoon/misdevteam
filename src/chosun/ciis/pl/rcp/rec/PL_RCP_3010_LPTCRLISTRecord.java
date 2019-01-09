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


public class PL_RCP_3010_LPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf_nm;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String rcpm_dt;
	public String rcpm_shet_no;
	public String budg_nm1;
	public String d_amt;
	public String budg_nm2;
	public String c_amt;

	public PL_RCP_3010_LPTCRLISTRecord(){}

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

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setBudg_nm1(String budg_nm1){
		this.budg_nm1 = budg_nm1;
	}

	public void setD_amt(String d_amt){
		this.d_amt = d_amt;
	}

	public void setBudg_nm2(String budg_nm2){
		this.budg_nm2 = budg_nm2;
	}

	public void setC_amt(String c_amt){
		this.c_amt = c_amt;
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

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getBudg_nm1(){
		return this.budg_nm1;
	}

	public String getD_amt(){
		return this.d_amt;
	}

	public String getBudg_nm2(){
		return this.budg_nm2;
	}

	public String getC_amt(){
		return this.c_amt;
	}
}

/* 작성시간 : Fri Apr 24 17:49:58 KST 2009 */