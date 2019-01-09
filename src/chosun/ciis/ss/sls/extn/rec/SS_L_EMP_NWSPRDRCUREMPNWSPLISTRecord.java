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


public class SS_L_EMP_NWSPRDRCUREMPNWSPLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpycd;
	public String cmpynm;
	public String officd;
	public String offinm;
	public String teamcd;
	public String teamnm;
	public String empseq;
	public String empnm;
	public String zip;
	public String addr;
	public String telno;
	public String ptphno;
	public String subsyn;
	public String rdr_no;
	public String rdrnm;
	public String rdr_extndt;
	public String subsfr_dt;
	public String valmm;
	public String qty;
	public String freeyn;
	public String suspdt;
	public String suspresncd;
	public String dlvaddr;
	public String bocd;
	public String bonm;
	public String rdr_extnno;
	public String dlvzip;
	public String dlvtelno;
	public String dlvptphno;
	public String medicd;
	public String modcheck;

	public SS_L_EMP_NWSPRDRCUREMPNWSPLISTRecord(){}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setCmpynm(String cmpynm){
		this.cmpynm = cmpynm;
	}

	public void setOfficd(String officd){
		this.officd = officd;
	}

	public void setOffinm(String offinm){
		this.offinm = offinm;
	}

	public void setTeamcd(String teamcd){
		this.teamcd = teamcd;
	}

	public void setTeamnm(String teamnm){
		this.teamnm = teamnm;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
	}

	public void setZip(String zip){
		this.zip = zip;
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

	public void setSubsyn(String subsyn){
		this.subsyn = subsyn;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setSubsfr_dt(String subsfr_dt){
		this.subsfr_dt = subsfr_dt;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setQty(String qty){
		this.qty = qty;
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

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvtelno(String dlvtelno){
		this.dlvtelno = dlvtelno;
	}

	public void setDlvptphno(String dlvptphno){
		this.dlvptphno = dlvptphno;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setModcheck(String modcheck){
		this.modcheck = modcheck;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getCmpynm(){
		return this.cmpynm;
	}

	public String getOfficd(){
		return this.officd;
	}

	public String getOffinm(){
		return this.offinm;
	}

	public String getTeamcd(){
		return this.teamcd;
	}

	public String getTeamnm(){
		return this.teamnm;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getEmpnm(){
		return this.empnm;
	}

	public String getZip(){
		return this.zip;
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

	public String getSubsyn(){
		return this.subsyn;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getSubsfr_dt(){
		return this.subsfr_dt;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getQty(){
		return this.qty;
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

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvtelno(){
		return this.dlvtelno;
	}

	public String getDlvptphno(){
		return this.dlvptphno;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getModcheck(){
		return this.modcheck;
	}
}

/* 작성시간 : Mon Mar 11 05:55:55 GMT 2013 */