/***************************************************************************************************
* ���ϸ� : SE_ETC_1220_LCURLISTRecord.java
* ��� : �Ǹ�-��Ÿ����-������ ���޵��
* �ۼ����� : 2009-03-05
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.etc.rec;

import java.sql.*;
import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.ds.*;

/**
 * 
 */


public class SE_ETC_1220_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

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
	public String supr_dept_nm	;
	public String sub_dept_cd	;
	public String dept_nm		;
	public String acct_no		;
	public String rcpm_main_nm	;
	public String setl_bank		;
	public String dlco_no		;
	public String rmks			;

	public SE_ETC_1220_LCURLISTRecord(){}

	public String getRmks() {
		return rmks;
	}

	public void setRmks(String rmks) {
		this.rmks = rmks;
	}
	
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

	public void setSupr_dept_nm(String supr_dept_nm){
		this.supr_dept_nm = supr_dept_nm;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
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

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
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

	public String getSupr_dept_nm(){
		return this.supr_dept_nm;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
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

	public String getDlco_no(){
		return this.dlco_no;
	}
}

/* �ۼ��ð� : Thu Mar 05 13:39:42 KST 2009 */