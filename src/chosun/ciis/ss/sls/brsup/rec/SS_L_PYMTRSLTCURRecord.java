/***************************************************************************************************
* 파일명 : SS_L_PYMTRSLTCURRecord.java
* 기능 : 지국업무지원-Billing자동이체-납부자목록
* 작성일자 : 2004-03-18
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
 * 지국업무지원-Billing자동이체-납부자목록
 *
 */


public class SS_L_PYMTRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bonm;
	public String pymtnm;
	public String rdrnm;
	public String prn;
	public String banknm;
	public String acctno;
	public String cardcmpycd;
	public String cardno;
	public String shftbgnyymm;
	public String shftstatclsfnm;

	public SS_L_PYMTRSLTCURRecord(){}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setPymtnm(String pymtnm){
		this.pymtnm = pymtnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setCardcmpycd(String cardcmpycd){
		this.cardcmpycd = cardcmpycd;
	}

	public void setCardno(String cardno){
		this.cardno = cardno;
	}

	public void setShftbgnyymm(String shftbgnyymm){
		this.shftbgnyymm = shftbgnyymm;
	}

	public void setShftstatclsfnm(String shftstatclsfnm){
		this.shftstatclsfnm = shftstatclsfnm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getPymtnm(){
		return this.pymtnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getCardcmpycd(){
		return this.cardcmpycd;
	}

	public String getCardno(){
		return this.cardno;
	}

	public String getShftbgnyymm(){
		return this.shftbgnyymm;
	}

	public String getShftstatclsfnm(){
		return this.shftstatclsfnm;
	}
}

/* 작성시간 : Tue Mar 23 14:50:46 KST 2004 */