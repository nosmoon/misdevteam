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


package chosun.ciis.is.dep.rec;

import java.sql.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;

/**
 * 
 */


public class IS_DEP_3810_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bill_no;
	public String acwr_reg_dt_seq;
	public String bddb_proc_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String suply_amt;
	public String vat_amt;
	public String unrcp_amt;
	public String unrcp_vat_amt;
	public String sale_proc_dt;
	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String sale_dlco_li_seq;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String bddb_proc_yn;

	public IS_DEP_3810_LCURLISTRecord(){}

	public void setBill_no(String bill_no){
		this.bill_no = bill_no;
	}

	public void setAcwr_reg_dt_seq(String acwr_reg_dt_seq){
		this.acwr_reg_dt_seq = acwr_reg_dt_seq;
	}

	public void setBddb_proc_clsf(String bddb_proc_clsf){
		this.bddb_proc_clsf = bddb_proc_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setUnrcp_amt(String unrcp_amt){
		this.unrcp_amt = unrcp_amt;
	}

	public void setUnrcp_vat_amt(String unrcp_vat_amt){
		this.unrcp_vat_amt = unrcp_vat_amt;
	}

	public void setSale_proc_dt(String sale_proc_dt){
		this.sale_proc_dt = sale_proc_dt;
	}

	public void setAcwr_reg_dt(String acwr_reg_dt){
		this.acwr_reg_dt = acwr_reg_dt;
	}

	public void setAcwr_reg_seq(String acwr_reg_seq){
		this.acwr_reg_seq = acwr_reg_seq;
	}

	public void setSale_dlco_li_seq(String sale_dlco_li_seq){
		this.sale_dlco_li_seq = sale_dlco_li_seq;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setBddb_proc_yn(String bddb_proc_yn){
		this.bddb_proc_yn = bddb_proc_yn;
	}

	public String getBill_no(){
		return this.bill_no;
	}

	public String getAcwr_reg_dt_seq(){
		return this.acwr_reg_dt_seq;
	}

	public String getBddb_proc_clsf(){
		return this.bddb_proc_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getUnrcp_amt(){
		return this.unrcp_amt;
	}

	public String getUnrcp_vat_amt(){
		return this.unrcp_vat_amt;
	}

	public String getSale_proc_dt(){
		return this.sale_proc_dt;
	}

	public String getAcwr_reg_dt(){
		return this.acwr_reg_dt;
	}

	public String getAcwr_reg_seq(){
		return this.acwr_reg_seq;
	}

	public String getSale_dlco_li_seq(){
		return this.sale_dlco_li_seq;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getBddb_proc_yn(){
		return this.bddb_proc_yn;
	}
}

/* 작성시간 : Tue May 22 19:35:34 KST 2012 */