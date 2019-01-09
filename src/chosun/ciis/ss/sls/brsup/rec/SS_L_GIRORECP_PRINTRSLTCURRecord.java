/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-빌링-지로 수납현황-목록엑셀저장
* 작성일자 : 2009-04-16
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-빌링-지로 수납현황-목록엑셀저장
 */

public class SS_L_GIRORECP_PRINTRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String reqdt;
	public String bocd;
	public String bonm;
	public String girono;
	public String recpclsfcd;
	public String recpclsfnm;
	public String recpbankcd;
	public String recpbanknm;
	public int cnt;
	public int amt;
	public int fee;

	public SS_L_GIRORECP_PRINTRSLTCURRecord(){}

	public void setReqdt(String reqdt){
		this.reqdt = reqdt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setGirono(String girono){
		this.girono = girono;
	}

	public void setRecpclsfcd(String recpclsfcd){
		this.recpclsfcd = recpclsfcd;
	}

	public void setRecpclsfnm(String recpclsfnm){
		this.recpclsfnm = recpclsfnm;
	}

	public void setRecpbankcd(String recpbankcd){
		this.recpbankcd = recpbankcd;
	}

	public void setRecpbanknm(String recpbanknm){
		this.recpbanknm = recpbanknm;
	}

	public void setCnt(int cnt){
		this.cnt = cnt;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setFee(int fee){
		this.fee = fee;
	}

	public String getReqdt(){
		return this.reqdt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getGirono(){
		return this.girono;
	}

	public String getRecpclsfcd(){
		return this.recpclsfcd;
	}

	public String getRecpclsfnm(){
		return this.recpclsfnm;
	}

	public String getRecpbankcd(){
		return this.recpbankcd;
	}

	public String getRecpbanknm(){
		return this.recpbanknm;
	}

	public int getCnt(){
		return this.cnt;
	}

	public int getAmt(){
		return this.amt;
	}

	public int getFee(){
		return this.fee;
	}
}

/* 작성시간 : Thu Apr 16 17:18:32 KST 2009 */