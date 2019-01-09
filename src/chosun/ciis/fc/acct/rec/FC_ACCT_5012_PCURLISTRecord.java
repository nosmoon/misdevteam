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


public class FC_ACCT_5012_PCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fisc_dt;
	public String acct_cd;
	public String acct_cd_nm;
	public String dr_amt;
	public String crdt_amt;

	public FC_ACCT_5012_PCURLISTRecord(){}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcct_cd_nm(String acct_cd_nm){
		this.acct_cd_nm = acct_cd_nm;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcct_cd_nm(){
		return this.acct_cd_nm;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}
}

/* 작성시간 : Tue Mar 10 09:52:20 KST 2009 */