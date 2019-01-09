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


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_L_EXTN_RDR_STATSCUREXTNSTATLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpynm;
	public String offinm;
	public String deptnm;
	public String empcd;
	public String empnm;
	public String fixbef;
	public String fixaft;
	public String totqty;
	public String totempcnt;
	public String parempcnt;
	public String parempper;

	public SS_L_EXTN_RDR_STATSCUREXTNSTATLISTRecord(){}

	public void setCmpynm(String cmpynm){
		this.cmpynm = cmpynm;
	}

	public void setOffinm(String offinm){
		this.offinm = offinm;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setEmpcd(String empcd){
		this.empcd = empcd;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
	}

	public void setFixbef(String fixbef){
		this.fixbef = fixbef;
	}

	public void setFixaft(String fixaft){
		this.fixaft = fixaft;
	}

	public void setTotqty(String totqty){
		this.totqty = totqty;
	}

	public void setTotempcnt(String totempcnt){
		this.totempcnt = totempcnt;
	}

	public void setParempcnt(String parempcnt){
		this.parempcnt = parempcnt;
	}

	public void setParempper(String parempper){
		this.parempper = parempper;
	}

	public String getCmpynm(){
		return this.cmpynm;
	}

	public String getOffinm(){
		return this.offinm;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getEmpcd(){
		return this.empcd;
	}

	public String getEmpnm(){
		return this.empnm;
	}

	public String getFixbef(){
		return this.fixbef;
	}

	public String getFixaft(){
		return this.fixaft;
	}

	public String getTotqty(){
		return this.totqty;
	}

	public String getTotempcnt(){
		return this.totempcnt;
	}

	public String getParempcnt(){
		return this.parempcnt;
	}

	public String getParempper(){
		return this.parempper;
	}
}

/* 작성시간 : Thu Mar 15 11:43:54 KST 2012 */