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


public class SS_L_EMP_NWSPRDR_RDRCUREMPNWSP_RDRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String rdrnm;
	public String addr;
	public String telno;
	public String ptphno;
	public String bonm;
	public String bocd;
	public String rdr_extndt;
	public String rdr_extnno;
	public String subsfr_dt;
	public String valmm;
	public String subsqty;
	public String freeyn;
	public String suspdt;
	public String suspresncd;
	public String dlvzip;
	public String medicd;

	public SS_L_EMP_NWSPRDR_RDRCUREMPNWSP_RDRLISTRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setTelno(String telno){
		this.telno = telno;
	}

	public void setPtphno(String ptphno){
		this.ptphno = ptphno;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setSubsfr_dt(String subsfr_dt){
		this.subsfr_dt = subsfr_dt;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setSubsqty(String subsqty){
		this.subsqty = subsqty;
	}

	public void setFreeyn(String freeyn){
		this.freeyn = freeyn;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setSuspresncd(String suspresncd){
		this.suspresncd = suspresncd;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getTelno(){
		return this.telno;
	}

	public String getPtphno(){
		return this.ptphno;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getSubsfr_dt(){
		return this.subsfr_dt;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getSubsqty(){
		return this.subsqty;
	}

	public String getFreeyn(){
		return this.freeyn;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getSuspresncd(){
		return this.suspresncd;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getMedicd(){
		return this.medicd;
	}
}

/* 작성시간 : Wed Mar 06 10:04:19 GMT 2013 */