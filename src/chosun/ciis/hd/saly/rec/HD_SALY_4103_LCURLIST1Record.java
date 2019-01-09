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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_4103_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String saly_shft_bank_cd;
	public String saly_shft_bank_nm;
	public String saly_shft_acct_no;
	public String alon_shft_bank_cd;
	public String alon_shft_bank_nm;
	public String alon_shft_acct_no;
	public String encrg_amt_shft_bank_cd;
	public String encrg_amt_shft_bank_nm;
	public String encrg_amt_shft_acct_no;

	public HD_SALY_4103_LCURLIST1Record(){}

	public void setSaly_shft_bank_cd(String saly_shft_bank_cd){
		this.saly_shft_bank_cd = saly_shft_bank_cd;
	}

	public void setSaly_shft_bank_nm(String saly_shft_bank_nm){
		this.saly_shft_bank_nm = saly_shft_bank_nm;
	}

	public void setSaly_shft_acct_no(String saly_shft_acct_no){
		this.saly_shft_acct_no = saly_shft_acct_no;
	}

	public void setAlon_shft_bank_cd(String alon_shft_bank_cd){
		this.alon_shft_bank_cd = alon_shft_bank_cd;
	}

	public void setAlon_shft_bank_nm(String alon_shft_bank_nm){
		this.alon_shft_bank_nm = alon_shft_bank_nm;
	}

	public void setAlon_shft_acct_no(String alon_shft_acct_no){
		this.alon_shft_acct_no = alon_shft_acct_no;
	}

	public void setEncrg_amt_shft_bank_cd(String encrg_amt_shft_bank_cd){
		this.encrg_amt_shft_bank_cd = encrg_amt_shft_bank_cd;
	}

	public void setEncrg_amt_shft_bank_nm(String encrg_amt_shft_bank_nm){
		this.encrg_amt_shft_bank_nm = encrg_amt_shft_bank_nm;
	}

	public void setEncrg_amt_shft_acct_no(String encrg_amt_shft_acct_no){
		this.encrg_amt_shft_acct_no = encrg_amt_shft_acct_no;
	}

	public String getSaly_shft_bank_cd(){
		return this.saly_shft_bank_cd;
	}

	public String getSaly_shft_bank_nm(){
		return this.saly_shft_bank_nm;
	}

	public String getSaly_shft_acct_no(){
		return this.saly_shft_acct_no;
	}

	public String getAlon_shft_bank_cd(){
		return this.alon_shft_bank_cd;
	}

	public String getAlon_shft_bank_nm(){
		return this.alon_shft_bank_nm;
	}

	public String getAlon_shft_acct_no(){
		return this.alon_shft_acct_no;
	}

	public String getEncrg_amt_shft_bank_cd(){
		return this.encrg_amt_shft_bank_cd;
	}

	public String getEncrg_amt_shft_bank_nm(){
		return this.encrg_amt_shft_bank_nm;
	}

	public String getEncrg_amt_shft_acct_no(){
		return this.encrg_amt_shft_acct_no;
	}
}

/* 작성시간 : Tue Sep 15 20:17:49 KST 2009 */