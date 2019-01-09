/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_SLS_EXTN_5120_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dncomp;
	public String dncompnm;
	public String adv_deptnm;
	public String ern;
	public String dlco_nm;
	public String tax_no;
	public String suply_amt;
	public String vat_amt;
	public String sum_amt;
	public String prx_amt;
	public String net_inc_amt;
	public String rcpm_amt;
	public String rcpm_slip_no;
	public String budg_cd;
	public String budg_nm;

	public SS_SLS_EXTN_5120_LCURCOMMLISTRecord(){}

	public void setDncomp(String dncomp){
		this.dncomp = dncomp;
	}

	public void setDncompnm(String dncompnm){
		this.dncompnm = dncompnm;
	}

	public void setAdv_deptnm(String adv_deptnm){
		this.adv_deptnm = adv_deptnm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setTax_no(String tax_no){
		this.tax_no = tax_no;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setSum_amt(String sum_amt){
		this.sum_amt = sum_amt;
	}

	public void setPrx_amt(String prx_amt){
		this.prx_amt = prx_amt;
	}

	public void setNet_inc_amt(String net_inc_amt){
		this.net_inc_amt = net_inc_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public String getDncomp(){
		return this.dncomp;
	}

	public String getDncompnm(){
		return this.dncompnm;
	}

	public String getAdv_deptnm(){
		return this.adv_deptnm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getTax_no(){
		return this.tax_no;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getSum_amt(){
		return this.sum_amt;
	}

	public String getPrx_amt(){
		return this.prx_amt;
	}

	public String getNet_inc_amt(){
		return this.net_inc_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}
}

/* 작성시간 : Tue Oct 04 16:14:54 KST 2016 */