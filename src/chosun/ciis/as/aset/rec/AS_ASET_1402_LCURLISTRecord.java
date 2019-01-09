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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1402_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_nm;
	public String ndduc_rate;
	public String ndduc_amt;
	public String aset_cnt;
	public String ndduc_year;
	public String ndduc_prd_clsf;
	public String acct_cd;

	public AS_ASET_1402_LCURLISTRecord(){}

	public void setAcct_nm(String acct_nm){
		this.acct_nm = acct_nm;
	}

	public void setNdduc_rate(String ndduc_rate){
		this.ndduc_rate = ndduc_rate;
	}

	public void setNdduc_amt(String ndduc_amt){
		this.ndduc_amt = ndduc_amt;
	}

	public void setAset_cnt(String aset_cnt){
		this.aset_cnt = aset_cnt;
	}

	public void setNdduc_year(String ndduc_year){
		this.ndduc_year = ndduc_year;
	}

	public void setNdduc_prd_clsf(String ndduc_prd_clsf){
		this.ndduc_prd_clsf = ndduc_prd_clsf;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public String getAcct_nm(){
		return this.acct_nm;
	}

	public String getNdduc_rate(){
		return this.ndduc_rate;
	}

	public String getNdduc_amt(){
		return this.ndduc_amt;
	}

	public String getAset_cnt(){
		return this.aset_cnt;
	}

	public String getNdduc_year(){
		return this.ndduc_year;
	}

	public String getNdduc_prd_clsf(){
		return this.ndduc_prd_clsf;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}
}

/* 작성시간 : Tue Mar 17 16:21:32 KST 2009 */