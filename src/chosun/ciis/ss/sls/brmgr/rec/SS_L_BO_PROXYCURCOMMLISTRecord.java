/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-지국지원-이사독자수당현황
* 작성일자 : 2011-12-05
* 작성자 : 이기영
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


public class SS_L_BO_PROXYCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String areanm;
	public String bonm;
	public String bocd;
	public String telno1;
	public String telno2;
	public int extn;
	public int morn;
	public int dsct;
	public String shft;
	public int acpt;
	public int trsf;

	public SS_L_BO_PROXYCURCOMMLISTRecord(){}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setTelno1(String telno1){
		this.telno1 = telno1;
	}

	public void setTelno2(String telno2){
		this.telno2 = telno2;
	}

	public void setExtn(int extn){
		this.extn = extn;
	}

	public void setMorn(int morn){
		this.morn = morn;
	}

	public void setDsct(int dsct){
		this.dsct = dsct;
	}

	public void setShft(String shft){
		this.shft = shft;
	}

	public void setAcpt(int acpt){
		this.acpt = acpt;
	}

	public void setTrsf(int trsf){
		this.trsf = trsf;
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

	public String getTelno1(){
		return this.telno1;
	}

	public String getTelno2(){
		return this.telno2;
	}

	public int getExtn(){
		return this.extn;
	}

	public int getMorn(){
		return this.morn;
	}

	public int getDstc(){
		return this.dsct;
	}

	public String getShft(){
		return this.shft;
	}

	public int getAcpt(){
		return this.acpt;
	}

	public int getTrsf(){
		return this.trsf;
	}
}

/* 작성시간 : Fri Jan 25 07:05:03 GMT 2013 */