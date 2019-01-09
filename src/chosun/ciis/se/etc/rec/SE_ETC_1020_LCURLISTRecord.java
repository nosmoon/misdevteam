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


package chosun.ciis.se.etc.rec;

import java.sql.*;
import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.ds.*;

/**
 * 
 */


public class SE_ETC_1020_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String pay_seq;
	public String pay_ptcr_seq;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String bo_head_nm;
	public String prn;
	public String qty;
	public String uprc;
	public String amt;
	public String incm_tax;
	public String res_tax;
	public String real_amt;
	public String area_cd;
	public String area_nm;
	public String dept_cd;
	public String supr_dept_nm;
	public String sub_dept_cd;
	public String dept_nm;
	public String chrg_pers;
	public String acct_no;
	public String rmks;
	public String recp_pers_nm;
	public String tax_yn;
	public String chrg_flnm;
	public String dlco_no;
	public String bank_cd;

	public SE_ETC_1020_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setPay_seq(String pay_seq){
		this.pay_seq = pay_seq;
	}

	public void setPay_ptcr_seq(String pay_ptcr_seq){
		this.pay_ptcr_seq = pay_ptcr_seq;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setReal_amt(String real_amt){
		this.real_amt = real_amt;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSupr_dept_nm(String supr_dept_nm){
		this.supr_dept_nm = supr_dept_nm;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setRecp_pers_nm(String recp_pers_nm){
		this.recp_pers_nm = recp_pers_nm;
	}

	public void setTax_yn(String tax_yn){
		this.tax_yn = tax_yn;
	}

	public void setChrg_flnm(String chrg_flnm){
		this.chrg_flnm = chrg_flnm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getPay_seq(){
		return this.pay_seq;
	}

	public String getPay_ptcr_seq(){
		return this.pay_ptcr_seq;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getQty(){
		return this.qty;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getReal_amt(){
		return this.real_amt;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSupr_dept_nm(){
		return this.supr_dept_nm;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getRecp_pers_nm(){
		return this.recp_pers_nm;
	}

	public String getTax_yn(){
		return this.tax_yn;
	}

	public String getChrg_flnm(){
		return this.chrg_flnm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}
}

/* 작성시간 : Mon Jun 29 11:38:12 KST 2009 */