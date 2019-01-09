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


package chosun.ciis.co.dlco.rec;

import java.sql.*;
import chosun.ciis.co.dlco.dm.*;
import chosun.ciis.co.dlco.ds.*;

/**
 * 
 */


public class CO_DLCO_1011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_stat;
	public String dlco_no;
	public String ern;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String setl_bank;
	public String setl_bank_nm;
	public String acct_no;
	public String rcpm_main_nm;
	public String lst_use_dt;

	public CO_DLCO_1011_LCURLISTRecord(){}

	public void setAcct_stat(String acct_stat){
		this.acct_stat = acct_stat;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setSetl_bank(String setl_bank){
		this.setl_bank = setl_bank;
	}

	public void setSetl_bank_nm(String setl_bank_nm){
		this.setl_bank_nm = setl_bank_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setRcpm_main_nm(String rcpm_main_nm){
		this.rcpm_main_nm = rcpm_main_nm;
	}

	public void setLst_use_dt(String lst_use_dt){
		this.lst_use_dt = lst_use_dt;
	}

	public String getAcct_stat(){
		return this.acct_stat;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getSetl_bank(){
		return this.setl_bank;
	}

	public String getSetl_bank_nm(){
		return this.setl_bank_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getRcpm_main_nm(){
		return this.rcpm_main_nm;
	}

	public String getLst_use_dt(){
		return this.lst_use_dt;
	}
}

/* 작성시간 : Fri Mar 15 15:42:42 KST 2013 */