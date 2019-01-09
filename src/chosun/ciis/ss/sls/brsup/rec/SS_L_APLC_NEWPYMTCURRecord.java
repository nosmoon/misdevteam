/***************************************************************************************************
* 파일명 : SS_L_APLC_NEWPYMTCURRecord.java
* 기능 : 지국업무지원-Billing자동이체-신청관리-신규신청초기화면 초기화
* 작성일자 : 2004-06-07
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국업무지원-Billing자동이체-신청관리-신규신청초기화면 초기화
 *
 */


public class SS_L_APLC_NEWPYMTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bankcd;
	public String banknm;
	public String acctno;

	public SS_L_APLC_NEWPYMTCURRecord(){}

	public void setBankcd(String bankcd){
		this.bankcd = bankcd;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public String getBankcd(){
		return this.bankcd;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getAcctno(){
		return this.acctno;
	}
}

/* 작성시간 : Mon Jun 07 21:27:19 KST 2004 */