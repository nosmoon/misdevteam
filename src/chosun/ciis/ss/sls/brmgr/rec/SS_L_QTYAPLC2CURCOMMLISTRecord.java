/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-부수증감 신청(담당) 조회(리스트)
* 작성일자 : 2009-07-21
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 지국경영-부수증감 신청(담당) 조회(리스트)
 */

public class SS_L_QTYAPLC2CURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcdt;
	public String bocd;
	public String bonm;
	public String issudt;
	public String medicd;
	public String medinm;
	public int chrgupdicdcqty;
	public int sendqty;
	public String chrgcnfmyn;
	public String closyn;

	public SS_L_QTYAPLC2CURCOMMLISTRecord(){}

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

/* 작성시간 : Mon Jul 20 20:27:22 KST 2009 */