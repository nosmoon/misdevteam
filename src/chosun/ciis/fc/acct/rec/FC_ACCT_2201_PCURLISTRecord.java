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


public class FC_ACCT_2201_PCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pg_mid;
	public String acct_cd;
	public String budg_cd;

	public FC_ACCT_2201_PCURLISTRecord(){}

	public void setPg_mid(String pg_mid){
		this.pg_mid = pg_mid;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public String getPg_mid(){
		return this.pg_mid;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}
}

/* 작성시간 : Sat Jun 20 16:30:58 KST 2009 */