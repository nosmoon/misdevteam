/***************************************************************************************************
* 파일명 : SE_COMM_2210_LCURLISTRecord.java
* 기능 :  구독료 지급내역 조회 팝업
* 작성일자 : 2009.03.05
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.rec;

import java.sql.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */


public class SE_COMM_2210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm			;
	public String pay_seq		;
	public String pay_ptcr_seq	;
	public String bo_cd			;
	public String bo_seq		;
	public String bo_nm			;
	public String recp_pers_nm	;
	public String prn			;
	public String qty			;
	public String uprc			;
	public String amt			;
	public String area_cd		;
	public String area_nm		;
	public String dept_cd		;
	public String dept_nm		;
	public String sub_dept_cd	;
	public String sub_dept_nm	;
	public String acct_no		;
	public String rcpm_main_nm	;
	public String setl_bank		;
	public String setl_bank_nm	;
	public String dlco_no		;
	public String rmks			;

	public SE_COMM_2210_LCURLISTRecord(){}

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

	public void setRecp_pers_nm(String recp_pers_nm){
		this.recp_pers_nm = recp_pers_nm;
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

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setSub_dept_nm(String sub_dept_nm){
		this.sub_dept_nm = sub_dept_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setRcpm_main_nm(String rcpm_main_nm){
		this.rcpm_main_nm = rcpm_main_nm;
	}

	public void setSetl_bank(String setl_bank){
		this.setl_bank = setl_bank;
	}

	public void setSetl_bank_nm(String setl_bank_nm){
		this.setl_bank_nm = setl_bank_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
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

	public String getRecp_pers_nm(){
		return this.recp_pers_nm;
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

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getSub_dept_nm(){
		return this.sub_dept_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getRcpm_main_nm(){
		return this.rcpm_main_nm;
	}

	public String getSetl_bank(){
		return this.setl_bank;
	}

	public String getSetl_bank_nm(){
		return this.setl_bank_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getRmks(){
		return this.rmks;
	}
}

/* 작성시간 : Thu Mar 05 19:39:35 KST 2009 */