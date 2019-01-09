/***************************************************************************************************
* 파일명 : .java
* 기능 :  공통 - 통장 입출금 내역조회
* 작성일자 : 2011-04-27
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.bank.rec;

import java.sql.*;
import chosun.ciis.co.bank.dm.*;
import chosun.ciis.co.bank.ds.*;

/**
 * 공통 - 통장 입출금 내역조회
 */

public class CO_BANK_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bank_name;
	public String tran_content;
	public String tran_amt;
	public String cms_code;
	public String tran_remain;
	public String tran_branch;
	public String acct_tonghwa;
	public String hwanyul;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date;
	public String tran_date_seq;
	public String current_clsf;
	public String remark;

	public CO_BANK_1010_LCURLISTRecord(){}

	public void setBank_name(String bank_name){
		this.bank_name = bank_name;
	}

	public void setTran_content(String tran_content){
		this.tran_content = tran_content;
	}

	public void setTran_amt(String tran_amt){
		this.tran_amt = tran_amt;
	}

	public void setCms_code(String cms_code){
		this.cms_code = cms_code;
	}

	public void setTran_remain(String tran_remain){
		this.tran_remain = tran_remain;
	}

	public void setTran_branch(String tran_branch){
		this.tran_branch = tran_branch;
	}

	public void setAcct_tonghwa(String acct_tonghwa){
		this.acct_tonghwa = acct_tonghwa;
	}

	public void setHwanyul(String hwanyul){
		this.hwanyul = hwanyul;
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

	public void setTran_date(String tran_date){
		this.tran_date = tran_date;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public void setCurrent_clsf(String current_clsf){
		this.current_clsf = current_clsf;
	}

	public void setRemark(String remark){
		this.remark = remark;
	}

	public String getBank_name(){
		return this.bank_name;
	}

	public String getTran_content(){
		return this.tran_content;
	}

	public String getTran_amt(){
		return this.tran_amt;
	}

	public String getCms_code(){
		return this.cms_code;
	}

	public String getTran_remain(){
		return this.tran_remain;
	}

	public String getTran_branch(){
		return this.tran_branch;
	}

	public String getAcct_tonghwa(){
		return this.acct_tonghwa;
	}

	public String getHwanyul(){
		return this.hwanyul;
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

	public String getTran_date(){
		return this.tran_date;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getCurrent_clsf(){
		return this.current_clsf;
	}

	public String getRemark(){
		return this.remark;
	}
}

/* 작성시간 : Wed Jun 22 16:40:56 KST 2011 */