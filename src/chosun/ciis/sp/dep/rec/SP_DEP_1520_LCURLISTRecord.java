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


public class SP_DEP_1520_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dtls_seq;
	public String budg_cd;
	public String occr_slip_clsf;
	public String occr_slip;
	public String dlco_no;
	public String dlco_nm;
	public String sale_yymm;
	public String sale_item_cd;
	public String sale_item_cd_nm;
	public String rcpm_amt;
	public String rcpm_proc_amt;
	public String rcpm_slip_no;
	public String remk;

	public SP_DEP_1520_LCURLISTRecord(){}

	public void setDtls_seq(String dtls_seq){
		this.dtls_seq = dtls_seq;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setOccr_slip_clsf(String occr_slip_clsf){
		this.occr_slip_clsf = occr_slip_clsf;
	}

	public void setOccr_slip(String occr_slip){
		this.occr_slip = occr_slip;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setSale_item_cd(String sale_item_cd){
		this.sale_item_cd = sale_item_cd;
	}

	public void setSale_item_cd_nm(String sale_item_cd_nm){
		this.sale_item_cd_nm = sale_item_cd_nm;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setRcpm_proc_amt(String rcpm_proc_amt){
		this.rcpm_proc_amt = rcpm_proc_amt;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getDtls_seq(){
		return this.dtls_seq;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getOccr_slip_clsf(){
		return this.occr_slip_clsf;
	}

	public String getOccr_slip(){
		return this.occr_slip;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getSale_item_cd(){
		return this.sale_item_cd;
	}

	public String getSale_item_cd_nm(){
		return this.sale_item_cd_nm;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getRcpm_proc_amt(){
		return this.rcpm_proc_amt;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Jan 07 14:09:24 KST 2013 */