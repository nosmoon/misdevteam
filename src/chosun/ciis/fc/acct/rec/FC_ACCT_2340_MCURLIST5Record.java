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


public class FC_ACCT_2340_MCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String budg_abrv_nm;

	public FC_ACCT_2340_MCURLIST5Record(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_abrv_nm(String budg_abrv_nm){
		this.budg_abrv_nm = budg_abrv_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_abrv_nm(){
		return this.budg_abrv_nm;
	}
}

/* 작성시간 : Thu Jan 12 11:28:16 KST 2012 */