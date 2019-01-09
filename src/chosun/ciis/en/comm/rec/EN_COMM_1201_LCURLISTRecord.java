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


package chosun.ciis.en.comm.rec;

import java.sql.*;
import chosun.ciis.en.comm.dm.*;
import chosun.ciis.en.comm.ds.*;

/**
 * 
 */


public class EN_COMM_1201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk_flag;
	public String evnt_nm;
	public String rcpm_unit_clsf;
	public String tran_date;
	public String cms_code;
	public String tran_content;
	public String tran_amt;
	public String occr_no;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date_seq;

	public EN_COMM_1201_LCURLISTRecord(){}

	public void setChk_flag(String chk_flag){
		this.chk_flag = chk_flag;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setRcpm_unit_clsf(String rcpm_unit_clsf){
		this.rcpm_unit_clsf = rcpm_unit_clsf;
	}

	public void setTran_date(String tran_date){
		this.tran_date = tran_date;
	}

	public void setCms_code(String cms_code){
		this.cms_code = cms_code;
	}

	public void setTran_content(String tran_content){
		this.tran_content = tran_content;
	}

	public void setTran_amt(String tran_amt){
		this.tran_amt = tran_amt;
	}

	public void setOccr_no(String occr_no){
		this.occr_no = occr_no;
	}

	public void setBiz_reg_no(String biz_reg_no){
		this.biz_reg_no = biz_reg_no;
	}

	public void setBank_id(String bank_id){
		this.bank_id = bank_id;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public String getChk_flag(){
		return this.chk_flag;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getRcpm_unit_clsf(){
		return this.rcpm_unit_clsf;
	}

	public String getTran_date(){
		return this.tran_date;
	}

	public String getCms_code(){
		return this.cms_code;
	}

	public String getTran_content(){
		return this.tran_content;
	}

	public String getTran_amt(){
		return this.tran_amt;
	}

	public String getOccr_no(){
		return this.occr_no;
	}

	public String getBiz_reg_no(){
		return this.biz_reg_no;
	}

	public String getBank_id(){
		return this.bank_id;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}
}

/* 작성시간 : Thu Jun 18 16:23:48 KST 2009 */