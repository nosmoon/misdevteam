/***************************************************************************************************
 * 파일명   : SP_SS_L_WEEKSND_CLOS_PRINT
 * 기능     : 지국지원-주간조선관리-송금목록 엑셀저장 
 * 작성일자 : 2007/05/14
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
**  SP_SS_L_WEEKSND_CLOS_PRINT
**/

public class SS_L_WEEKSND_CLOS_PRINTRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String banknm;
	public String bankcd;
	public String acctno;
	public String deps_persnm;
	public String bonm;
	public String bocd;
	public String deptnm;
	public String areanm;
	public int totcnt;
	public int dlvamt;

	public SS_L_WEEKSND_CLOS_PRINTRSLTCURRecord(){}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setBankcd(String bankcd){
		this.bankcd = bankcd;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setDeps_persnm(String deps_persnm){
		this.deps_persnm = deps_persnm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setTotcnt(int totcnt){
		this.totcnt = totcnt;
	}

	public void setDlvamt(int dlvamt){
		this.dlvamt = dlvamt;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getBankcd(){
		return this.bankcd;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getDeps_persnm(){
		return this.deps_persnm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public int getTotcnt(){
		return this.totcnt;
	}

	public int getDlvamt(){
		return this.dlvamt;
	}
}

/* 작성시간 : Wed May 16 11:16:38 KST 2007 */