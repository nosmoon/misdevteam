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


public class FC_ACCT_2571_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String acct_num_nm;
	public String acct_tonghwa;
	public String tran_date;
	public String tran_date_seq;
	public String extnc_seq;
	public String erp_transfer_date;
	public String tran_content;
	public String tran_amt;
	public String extnc_amt;
	public String slip_no;
	public String actu_slip_no;
	public String slip_aprv_yn;
	public String chg_slip_no;

	public FC_ACCT_2571_LCURLISTRecord(){}

	public void setChk(String chk){
		this.chk = chk;
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

	public void setAcct_num_nm(String acct_num_nm){
		this.acct_num_nm = acct_num_nm;
	}

	public void setAcct_tonghwa(String acct_tonghwa){
		this.acct_tonghwa = acct_tonghwa;
	}

	public void setTran_date(String tran_date){
		this.tran_date = tran_date;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public void setExtnc_seq(String extnc_seq){
		this.extnc_seq = extnc_seq;
	}

	public void setErp_transfer_date(String erp_transfer_date){
		this.erp_transfer_date = erp_transfer_date;
	}

	public void setTran_content(String tran_content){
		this.tran_content = tran_content;
	}

	public void setTran_amt(String tran_amt){
		this.tran_amt = tran_amt;
	}

	public void setExtnc_amt(String extnc_amt){
		this.extnc_amt = extnc_amt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setSlip_aprv_yn(String slip_aprv_yn){
		this.slip_aprv_yn = slip_aprv_yn;
	}

	public void setChg_slip_no(String chg_slip_no){
		this.chg_slip_no = chg_slip_no;
	}

	public String getChk(){
		return this.chk;
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

	public String getAcct_num_nm(){
		return this.acct_num_nm;
	}

	public String getAcct_tonghwa(){
		return this.acct_tonghwa;
	}

	public String getTran_date(){
		return this.tran_date;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getExtnc_seq(){
		return this.extnc_seq;
	}

	public String getErp_transfer_date(){
		return this.erp_transfer_date;
	}

	public String getTran_content(){
		return this.tran_content;
	}

	public String getTran_amt(){
		return this.tran_amt;
	}

	public String getExtnc_amt(){
		return this.extnc_amt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getSlip_aprv_yn(){
		return this.slip_aprv_yn;
	}

	public String getChg_slip_no(){
		return this.chg_slip_no;
	}
}

/* 작성시간 : Mon Feb 13 14:52:50 KST 2012 */