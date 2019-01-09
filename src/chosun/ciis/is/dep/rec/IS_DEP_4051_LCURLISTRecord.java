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


public class IS_DEP_4051_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_suply_amt;
	public String rcpm_vat;
	public String sale_proc_dt;
	public String acwr_reg_dt_seq;
	public String advt_nm;
	public String suply_amt;
	public String vat_amt;
	public String unrcpm_suply_amt;
	public String unrcpm_vat_amt;
	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String sale_dlco_li_seq;

	public IS_DEP_4051_LCURLISTRecord(){}

	public void setRcpm_suply_amt(String rcpm_suply_amt){
		this.rcpm_suply_amt = rcpm_suply_amt;
	}

	public void setRcpm_vat(String rcpm_vat){
		this.rcpm_vat = rcpm_vat;
	}

	public void setSale_proc_dt(String sale_proc_dt){
		this.sale_proc_dt = sale_proc_dt;
	}

	public void setAcwr_reg_dt_seq(String acwr_reg_dt_seq){
		this.acwr_reg_dt_seq = acwr_reg_dt_seq;
	}

	public void setAdvt_nm(String advt_nm){
		this.advt_nm = advt_nm;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setUnrcpm_suply_amt(String unrcpm_suply_amt){
		this.unrcpm_suply_amt = unrcpm_suply_amt;
	}

	public void setUnrcpm_vat_amt(String unrcpm_vat_amt){
		this.unrcpm_vat_amt = unrcpm_vat_amt;
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

	public String getRcpm_suply_amt(){
		return this.rcpm_suply_amt;
	}

	public String getRcpm_vat(){
		return this.rcpm_vat;
	}

	public String getSale_proc_dt(){
		return this.sale_proc_dt;
	}

	public String getAcwr_reg_dt_seq(){
		return this.acwr_reg_dt_seq;
	}

	public String getAdvt_nm(){
		return this.advt_nm;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getUnrcpm_suply_amt(){
		return this.unrcpm_suply_amt;
	}

	public String getUnrcpm_vat_amt(){
		return this.unrcpm_vat_amt;
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
}

/* 작성시간 : Tue Jul 10 16:03:30 KST 2012 */