/***************************************************************************************************
* 파일명 : SS_L_ASET_DTLCURCOMMLISTRecord.java
* 기능 : 지국Info-지국비품현황-상세 조회
* 작성일자 : 2004-02-01
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * 지국Info-지국비품현황-상세 조회
 *
 */


public class SS_L_ASET_DTLCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String asetseq;
	public String asetclascd;
	public String asetclascdnm;
	public String asetnm;
	public String buydt;

	public SS_L_ASET_DTLCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAsetseq(String asetseq){
		this.asetseq = asetseq;
	}

	public void setAsetclascd(String asetclascd){
		this.asetclascd = asetclascd;
	}

	public void setAsetclascdnm(String asetclascdnm){
		this.asetclascdnm = asetclascdnm;
	}

	public void setAsetnm(String asetnm){
		this.asetnm = asetnm;
	}

	public void setBuydt(String buydt){
		this.buydt = buydt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAsetseq(){
		return this.asetseq;
	}

	public String getAsetclascd(){
		return this.asetclascd;
	}

	public String getAsetclascdnm(){
		return this.asetclascdnm;
	}

	public String getAsetnm(){
		return this.asetnm;
	}

	public String getBuydt(){
		return this.buydt;
	}
}

/* 작성시간 : Sun Feb 01 21:50:12 KST 2004 */