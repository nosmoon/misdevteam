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


public class SE_ETC_1710_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String pay_seq;
	public String evnt_nm;
	public String budg_yymm;
	public String pay_mthd_clsf;
	public String pay_obj_clsf;
	public String tax_yn;
	public String dept_cd;
	public String uprc;
	public String draft_doc_no;
	public String pay_dt;
	public String decid_stat;
	public String clos_yn;
	public String actu_slip_no;

	public SE_ETC_1710_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setPay_seq(String pay_seq){
		this.pay_seq = pay_seq;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setPay_mthd_clsf(String pay_mthd_clsf){
		this.pay_mthd_clsf = pay_mthd_clsf;
	}

	public void setPay_obj_clsf(String pay_obj_clsf){
		this.pay_obj_clsf = pay_obj_clsf;
	}

	public void setTax_yn(String tax_yn){
		this.tax_yn = tax_yn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setDraft_doc_no(String draft_doc_no){
		this.draft_doc_no = draft_doc_no;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setDecid_stat(String decid_stat){
		this.decid_stat = decid_stat;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getPay_seq(){
		return this.pay_seq;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getPay_mthd_clsf(){
		return this.pay_mthd_clsf;
	}

	public String getPay_obj_clsf(){
		return this.pay_obj_clsf;
	}

	public String getTax_yn(){
		return this.tax_yn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getDraft_doc_no(){
		return this.draft_doc_no;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getDecid_stat(){
		return this.decid_stat;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}
}

/* 작성시간 : Thu Jul 11 10:07:51 KST 2013 */