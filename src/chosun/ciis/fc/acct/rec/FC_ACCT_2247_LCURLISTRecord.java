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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2247_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String biz_reg_no;
	public String bank_id;
	public String bank_name;
	public String acct_num;
	public String cms_code;
	public String tran_date;
	public String tran_date_seq;
	public String remark;
	public String tran_amt;
	public String extnc_amt;
	public String remain_amt;

	public FC_ACCT_2247_LCURLISTRecord(){}

	public void setBiz_reg_no(String biz_reg_no){
		this.biz_reg_no = biz_reg_no;
	}

	public void setBank_id(String bank_id){
		this.bank_id = bank_id;
	}

	public void setBank_name(String bank_name){
		this.bank_name = bank_name;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setCms_code(String cms_code){
		this.cms_code = cms_code;
	}

	public void setTran_date(String tran_date){
		this.tran_date = tran_date;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public void setRemark(String remark){
		this.remark = remark;
	}

	public void setTran_amt(String tran_amt){
		this.tran_amt = tran_amt;
	}

	public void setExtnc_amt(String extnc_amt){
		this.extnc_amt = extnc_amt;
	}

	public void setRemain_amt(String remain_amt){
		this.remain_amt = remain_amt;
	}

	public String getBiz_reg_no(){
		return this.biz_reg_no;
	}

	public String getBank_id(){
		return this.bank_id;
	}

	public String getBank_name(){
		return this.bank_name;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getCms_code(){
		return this.cms_code;
	}

	public String getTran_date(){
		return this.tran_date;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getRemark(){
		return this.remark;
	}

	public String getTran_amt(){
		return this.tran_amt;
	}

	public String getExtnc_amt(){
		return this.extnc_amt;
	}

	public String getRemain_amt(){
		return this.remain_amt;
	}
}

/* 작성시간 : Mon May 09 16:30:19 KST 2016 */