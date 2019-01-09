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


public class AS_ASET_1602_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String aset_no;
	public String aset_nm;
	public String chg_clsf_nm;
	public String chg_dt;
	public String occr_dt;
	public String occr_seq;
	public String sub_seq;
	public String dept_cd;
	public String budg_cd;
	public String sale_now_acqr_amt;
	public String sale_redm_tot_amt;
	public String sale_un_redm_amt;
	public String sale_pfls_amt;
	public String remk_dtls;

	public AS_ASET_1602_LCURLIST1Record(){}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setChg_clsf_nm(String chg_clsf_nm){
		this.chg_clsf_nm = chg_clsf_nm;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setSale_now_acqr_amt(String sale_now_acqr_amt){
		this.sale_now_acqr_amt = sale_now_acqr_amt;
	}

	public void setSale_redm_tot_amt(String sale_redm_tot_amt){
		this.sale_redm_tot_amt = sale_redm_tot_amt;
	}

	public void setSale_un_redm_amt(String sale_un_redm_amt){
		this.sale_un_redm_amt = sale_un_redm_amt;
	}

	public void setSale_pfls_amt(String sale_pfls_amt){
		this.sale_pfls_amt = sale_pfls_amt;
	}

	public void setRemk_dtls(String remk_dtls){
		this.remk_dtls = remk_dtls;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getChg_clsf_nm(){
		return this.chg_clsf_nm;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getSale_now_acqr_amt(){
		return this.sale_now_acqr_amt;
	}

	public String getSale_redm_tot_amt(){
		return this.sale_redm_tot_amt;
	}

	public String getSale_un_redm_amt(){
		return this.sale_un_redm_amt;
	}

	public String getSale_pfls_amt(){
		return this.sale_pfls_amt;
	}

	public String getRemk_dtls(){
		return this.remk_dtls;
	}
}

/* 작성시간 : Thu Mar 26 17:26:35 KST 2009 */