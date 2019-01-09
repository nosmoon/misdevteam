/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-부수증감 신청(담당) 조회(리스트)
* 작성일자 : 2009-07-22
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 지국경영-부수증감 신청(담당) 조회(리스트)
 */

public class SS_L_QTYAPLCCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcdt;
	public String bocd;
	public String bonm;
	public String issudt;
	public String medicd;
	public String medinm;
	public int chrgupdicdcqty;
	public String chrgupdicdcqty_u;
	public int sendqty;
	public String chrgcnfmyn;
	public String closyn;

	public SS_L_QTYAPLCCURCOMMLISTRecord(){}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setIssudt(String issudt){
		this.issudt = issudt;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setChrgupdicdcqty(int chrgupdicdcqty){
		this.chrgupdicdcqty = chrgupdicdcqty;
	}

	public void setChrgupdicdcqty_u(String chrgupdicdcqty_u){
		this.chrgupdicdcqty_u = chrgupdicdcqty_u;
	}

	public void setSendqty(int sendqty){
		this.sendqty = sendqty;
	}

	public void setChrgcnfmyn(String chrgcnfmyn){
		this.chrgcnfmyn = chrgcnfmyn;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getIssudt(){
		return this.issudt;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public int getChrgupdicdcqty(){
		return this.chrgupdicdcqty;
	}

	public String getChrgupdicdcqty_u(){
		return this.chrgupdicdcqty_u;
	}

	public int getSendqty(){
		return this.sendqty;
	}

	public String getChrgcnfmyn(){
		return this.chrgcnfmyn;
	}

	public String getClosyn(){
		return this.closyn;
	}
}

/* 작성시간 : Tue Jul 21 12:06:44 KST 2009 */