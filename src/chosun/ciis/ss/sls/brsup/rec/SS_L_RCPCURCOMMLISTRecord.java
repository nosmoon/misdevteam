/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-빌링-수납수수료-현황-목록
* 작성일자 : 2009-04-10
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-빌링-수납수수료-현황-목록
 */

public class SS_L_RCPCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basidt;
	public String bocd;
	public String bonm;
	public String clamtmthd;
	public int noit;
	public int clamt;
	public int insttcoms;
	public int bocoms;
	public int comstot;

	public SS_L_RCPCURCOMMLISTRecord(){}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setClamtmthd(String clamtmthd){
		this.clamtmthd = clamtmthd;
	}

	public void setNoit(int noit){
		this.noit = noit;
	}

	public void setClamt(int clamt){
		this.clamt = clamt;
	}

	public void setInsttcoms(int insttcoms){
		this.insttcoms = insttcoms;
	}

	public void setBocoms(int bocoms){
		this.bocoms = bocoms;
	}

	public void setComstot(int comstot){
		this.comstot = comstot;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getClamtmthd(){
		return this.clamtmthd;
	}

	public int getNoit(){
		return this.noit;
	}

	public int getClamt(){
		return this.clamt;
	}

	public int getInsttcoms(){
		return this.insttcoms;
	}

	public int getBocoms(){
		return this.bocoms;
	}

	public int getComstot(){
		return this.comstot;
	}
}

/* 작성시간 : Fri Apr 10 13:46:19 KST 2009 */