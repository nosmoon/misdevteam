/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2610_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public String bocd;
	public String acct_cd;
	public String cmode;
	public String chgdt;

	public SS_SLS_BRMGR_2610_LCURCOMMLISTRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setCmode(String cmode){
		this.cmode = cmode;
	}

	public void setChgdt(String chgdt){
		this.chgdt = chgdt;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getCmode(){
		return this.cmode;
	}

	public String getChgdt(){
		return this.chgdt;
	}
}

/* 작성시간 : Thu Mar 10 19:06:32 KST 2016 */