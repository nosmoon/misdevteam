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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_7120_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_nm;
	public String ern;
	public String tel_no;
	public String addr;
	public String acct_no;
	public String setl_bank;
	public String bank_nm;

	public HD_INFO_7120_LCURLIST1Record(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setSetl_bank(String setl_bank){
		this.setl_bank = setl_bank;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getSetl_bank(){
		return this.setl_bank;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}
}

/* 작성시간 : Tue Mar 26 10:35:15 KST 2013 */