/***************************************************************************************************
* 파일명 : SS_L_QTYAPLC_ILGYECURCOMMLISTRecord.java
* 기능 : 지국경영 - 부수증감 - 본지(담당) - 지역단위 부수현황 조회
* 작성일자 : 2007-05-22
* 작성자 : 황성진
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


public class SS_L_QTYAPLC_ILGYECURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;
	public int iygwygbs;
	public int iygwmgbs;
	public int iytot;
	public int thmmvalqty;
	public int aftcnt_tot;
	public int realtot;

	public SS_L_QTYAPLC_ILGYECURCOMMLISTRecord(){}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setIygwygbs(int iygwygbs){
		this.iygwygbs = iygwygbs;
	}

	public void setIygwmgbs(int iygwmgbs){
		this.iygwmgbs = iygwmgbs;
	}

	public void setIytot(int iytot){
		this.iytot = iytot;
	}

	public void setThmmvalqty(int thmmvalqty){
		this.thmmvalqty = thmmvalqty;
	}

	public void setAftcnt_tot(int aftcnt_tot){
		this.aftcnt_tot = aftcnt_tot;
	}

	public void setRealtot(int realtot){
		this.realtot = realtot;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public int getIygwygbs(){
		return this.iygwygbs;
	}

	public int getIygwmgbs(){
		return this.iygwmgbs;
	}

	public int getIytot(){
		return this.iytot;
	}

	public int getThmmvalqty(){
		return this.thmmvalqty;
	}

	public int getAftcnt_tot(){
		return this.aftcnt_tot;
	}

	public int getRealtot(){
		return this.realtot;
	}
}

/* 작성시간 : Thu Apr 30 17:41:27 KST 2009 */