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


public class SS_SLS_BRMGR_2210_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public String bocd;
	public String clsf1;
	public String clsf2;
	public String clsf3;
	public String closyn;

	public SS_SLS_BRMGR_2210_LCURCOMMLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

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

	public void setClsf1(String clsf1){
		this.clsf1 = clsf1;
	}

	public void setClsf2(String clsf2){
		this.clsf2 = clsf2;
	}

	public void setClsf3(String clsf3){
		this.clsf3 = clsf3;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public String getYymm(){
		return this.yymm;
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

	public String getClsf1(){
		return this.clsf1;
	}

	public String getClsf2(){
		return this.clsf2;
	}

	public String getClsf3(){
		return this.clsf3;
	}

	public String getClosyn(){
		return this.closyn;
	}
}

/* 작성시간 : Mon May 30 13:57:23 KST 2016 */