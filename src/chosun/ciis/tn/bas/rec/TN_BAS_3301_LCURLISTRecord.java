/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.bas.rec;

import java.sql.*;
import chosun.ciis.tn.bas.dm.*;
import chosun.ciis.tn.bas.ds.*;

/**
 * 
 */


public class TN_BAS_3301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bankaccountcode;
	public String bankcode;
	public String bank;
	public String branch;
	public String bankaccount;
	public String bankaccountowner;
	public String memo;
	public String useinsert;
	public String useinsert_nm;

	public TN_BAS_3301_LCURLISTRecord(){}

	public void setBankaccountcode(String bankaccountcode){
		this.bankaccountcode = bankaccountcode;
	}

	public void setBankcode(String bankcode){
		this.bankcode = bankcode;
	}

	public void setBank(String bank){
		this.bank = bank;
	}

	public void setBranch(String branch){
		this.branch = branch;
	}

	public void setBankaccount(String bankaccount){
		this.bankaccount = bankaccount;
	}

	public void setBankaccountowner(String bankaccountowner){
		this.bankaccountowner = bankaccountowner;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setUseinsert(String useinsert){
		this.useinsert = useinsert;
	}

	public void setUseinsert_nm(String useinsert_nm){
		this.useinsert_nm = useinsert_nm;
	}

	public String getBankaccountcode(){
		return this.bankaccountcode;
	}

	public String getBankcode(){
		return this.bankcode;
	}

	public String getBank(){
		return this.bank;
	}

	public String getBranch(){
		return this.branch;
	}

	public String getBankaccount(){
		return this.bankaccount;
	}

	public String getBankaccountowner(){
		return this.bankaccountowner;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getUseinsert(){
		return this.useinsert;
	}

	public String getUseinsert_nm(){
		return this.useinsert_nm;
	}
}

/* 작성시간 : Wed Jun 22 18:08:39 KST 2016 */