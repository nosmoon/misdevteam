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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_1114_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String dr_amt;
	public String mang_clsf_cd;
	public String comp_dt;
	public String frcr_clsf_cd;
	public String exrate;
	public String frcr_amt;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date_seq;
	public String current_clsf;

	public FC_FUNC_1114_LCURLISTRecord(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setFrcr_clsf_cd(String frcr_clsf_cd){
		this.frcr_clsf_cd = frcr_clsf_cd;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setFrcr_amt(String frcr_amt){
		this.frcr_amt = frcr_amt;
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

	public void setCurrent_clsf(String current_clsf){
		this.current_clsf = current_clsf;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getFrcr_clsf_cd(){
		return this.frcr_clsf_cd;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getFrcr_amt(){
		return this.frcr_amt;
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

	public String getCurrent_clsf(){
		return this.current_clsf;
	}
}

/* 작성시간 : Tue Jul 21 16:23:06 KST 2009 */