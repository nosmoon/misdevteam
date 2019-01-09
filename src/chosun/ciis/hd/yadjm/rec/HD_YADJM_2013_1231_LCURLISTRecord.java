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


public class HD_YADJM_2013_1231_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bank_cd;
	public String account_no;
	public String payment;
	public String deduct_amt;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String stok_savg_type;

	public HD_YADJM_2013_1231_LCURLISTRecord(){}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setAccount_no(String account_no){
		this.account_no = account_no;
	}

	public void setPayment(String payment){
		this.payment = payment;
	}

	public void setDeduct_amt(String deduct_amt){
		this.deduct_amt = deduct_amt;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setStok_savg_type(String stok_savg_type){
		this.stok_savg_type = stok_savg_type;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getAccount_no(){
		return this.account_no;
	}

	public String getPayment(){
		return this.payment;
	}

	public String getDeduct_amt(){
		return this.deduct_amt;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getStok_savg_type(){
		return this.stok_savg_type;
	}
}

/* 작성시간 : Fri Jan 11 15:24:32 KST 2013 */