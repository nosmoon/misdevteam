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


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_1830_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pay_dt;
	public String ern;
	public String firmnm;
	public String obj_pers_flnm;
	public String prn;
	public String rshp;
	public String obcl_pers_rspc_yn;
	public String pay_noit_crdt_card_cash_rcpt;
	public String pay_amt_crdt_card_cash_rcpt;
	public String pay_noit_cash;
	public String pay_amt_cash;
	public String hosp_prof;
	public String cmpy_cd;
	public String emp_no;
	public String seq;
	public String subf_treat_yn;

	public HD_YADJM_1830_LCURLISTRecord(){}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setFirmnm(String firmnm){
		this.firmnm = firmnm;
	}

	public void setObj_pers_flnm(String obj_pers_flnm){
		this.obj_pers_flnm = obj_pers_flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setRshp(String rshp){
		this.rshp = rshp;
	}

	public void setObcl_pers_rspc_yn(String obcl_pers_rspc_yn){
		this.obcl_pers_rspc_yn = obcl_pers_rspc_yn;
	}

	public void setPay_noit_crdt_card_cash_rcpt(String pay_noit_crdt_card_cash_rcpt){
		this.pay_noit_crdt_card_cash_rcpt = pay_noit_crdt_card_cash_rcpt;
	}

	public void setPay_amt_crdt_card_cash_rcpt(String pay_amt_crdt_card_cash_rcpt){
		this.pay_amt_crdt_card_cash_rcpt = pay_amt_crdt_card_cash_rcpt;
	}

	public void setPay_noit_cash(String pay_noit_cash){
		this.pay_noit_cash = pay_noit_cash;
	}

	public void setPay_amt_cash(String pay_amt_cash){
		this.pay_amt_cash = pay_amt_cash;
	}

	public void setHosp_prof(String hosp_prof){
		this.hosp_prof = hosp_prof;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}
	
	public void setSubf_treat_yn(String subf_treat_yn){
		this.subf_treat_yn = subf_treat_yn;
	}
	
	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getErn(){
		return this.ern;
	}

	public String getFirmnm(){
		return this.firmnm;
	}

	public String getObj_pers_flnm(){
		return this.obj_pers_flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getRshp(){
		return this.rshp;
	}

	public String getObcl_pers_rspc_yn(){
		return this.obcl_pers_rspc_yn;
	}

	public String getPay_noit_crdt_card_cash_rcpt(){
		return this.pay_noit_crdt_card_cash_rcpt;
	}

	public String getPay_amt_crdt_card_cash_rcpt(){
		return this.pay_amt_crdt_card_cash_rcpt;
	}

	public String getPay_noit_cash(){
		return this.pay_noit_cash;
	}

	public String getPay_amt_cash(){
		return this.pay_amt_cash;
	}

	public String getHosp_prof(){
		return this.hosp_prof;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSeq(){
		return this.seq;
	}
	
	public String getSubf_treat_yn(){
		return this.subf_treat_yn;
	}
}

/* 작성시간 : Thu Aug 20 11:04:27 KST 2009 */