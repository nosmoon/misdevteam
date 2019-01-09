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


package chosun.ciis.as.asrd.rec;

import java.sql.*;
import chosun.ciis.as.asrd.dm.*;
import chosun.ciis.as.asrd.ds.*;

/**
 * 
 */


public class AS_ASRD_1901_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aset_no;
	public String aset_nm;
	public String aset_stat;
	public String aset_loca;
	public String aset_size;
	public String aset_usag;
	public String dept_nm;
	public String acqr_dt;
	public String orgin_acqr_amt;
	public String un_redm_amt;
	public String vat_amt;
	public String sale_dt;
	public String sale_amt;
	public String dlco_ern;
	public String budg_cd;

	public AS_ASRD_1901_LCURLISTRecord(){}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setAset_stat(String aset_stat){
		this.aset_stat = aset_stat;
	}

	public void setAset_loca(String aset_loca){
		this.aset_loca = aset_loca;
	}

	public void setAset_size(String aset_size){
		this.aset_size = aset_size;
	}

	public void setAset_usag(String aset_usag){
		this.aset_usag = aset_usag;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setAcqr_dt(String acqr_dt){
		this.acqr_dt = acqr_dt;
	}

	public void setOrgin_acqr_amt(String orgin_acqr_amt){
		this.orgin_acqr_amt = orgin_acqr_amt;
	}

	public void setUn_redm_amt(String un_redm_amt){
		this.un_redm_amt = un_redm_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setSale_dt(String sale_dt){
		this.sale_dt = sale_dt;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setDlco_ern(String dlco_ern){
		this.dlco_ern = dlco_ern;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getAset_stat(){
		return this.aset_stat;
	}

	public String getAset_loca(){
		return this.aset_loca;
	}

	public String getAset_size(){
		return this.aset_size;
	}

	public String getAset_usag(){
		return this.aset_usag;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getAcqr_dt(){
		return this.acqr_dt;
	}

	public String getOrgin_acqr_amt(){
		return this.orgin_acqr_amt;
	}

	public String getUn_redm_amt(){
		return this.un_redm_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getSale_dt(){
		return this.sale_dt;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getDlco_ern(){
		return this.dlco_ern;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}
}

/* 작성시간 : Wed Mar 11 09:18:43 KST 2009 */