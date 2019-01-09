/***************************************************************************************************
* 파일명 : PS_L_BOACCT.java
* 기능   : 출판국-지사계좌관리 리스트
* 작성일자 : 2006-11-09
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/



package chosun.ciis.ps.pbs.code.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * 출판지사-통합코드관리 리스트
 *
 */

public class PS_L_BOACCTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String seq;
	public String acctitem;
	public String acctitem_nm;
	public String depskind;
	public String bankcd;
	public String bankcd_nm;
	public String deps_persnm;
	public String acctno;
	public String remk;

	public PS_L_BOACCTCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAcctitem(String acctitem){
		this.acctitem = acctitem;
	}

	public void setAcctitem_nm(String acctitem_nm){
		this.acctitem_nm = acctitem_nm;
	}

	public void setDepskind(String depskind){
		this.depskind = depskind;
	}

	public void setBankcd(String bankcd){
		this.bankcd = bankcd;
	}

	public void setBankcd_nm(String bankcd_nm){
		this.bankcd_nm = bankcd_nm;
	}

	public void setDeps_persnm(String deps_persnm){
		this.deps_persnm = deps_persnm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAcctitem(){
		return this.acctitem;
	}

	public String getAcctitem_nm(){
		return this.acctitem_nm;
	}

	public String getDepskind(){
		return this.depskind;
	}

	public String getBankcd(){
		return this.bankcd;
	}

	public String getBankcd_nm(){
		return this.bankcd_nm;
	}

	public String getDeps_persnm(){
		return this.deps_persnm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri Nov 10 13:16:56 KST 2006 */