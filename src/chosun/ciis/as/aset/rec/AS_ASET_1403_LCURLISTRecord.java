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


public class AS_ASET_1403_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_nm;
	public String aset_no;
	public String aset_nm;
	public String ndduc_rate;
	public String ndduc_amt;
	public String chg_vat_amt;
	public String add_vat;
	public String acct_agg_amt;
	public String budg_cd;

	public AS_ASET_1403_LCURLISTRecord(){}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setNdduc_rate(String ndduc_rate){
		this.ndduc_rate = ndduc_rate;
	}

	public void setNdduc_amt(String ndduc_amt){
		this.ndduc_amt = ndduc_amt;
	}

	public void setChg_vat_amt(String chg_vat_amt){
		this.chg_vat_amt = chg_vat_amt;
	}

	public void setAdd_vat(String add_vat){
		this.add_vat = add_vat;
	}

	public void setAcct_agg_amt(String acct_agg_amt){
		this.acct_agg_amt = acct_agg_amt;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getNdduc_rate(){
		return this.ndduc_rate;
	}

	public String getNdduc_amt(){
		return this.ndduc_amt;
	}

	public String getChg_vat_amt(){
		return this.chg_vat_amt;
	}

	public String getAdd_vat(){
		return this.add_vat;
	}

	public String getAcct_agg_amt(){
		return this.acct_agg_amt;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}
}

/* 작성시간 : Tue Mar 17 19:21:27 KST 2009 */