/***************************************************************************************************
 * 파일명   : PS_L_MOVM_RDR.java
 * 기능     : 이사신청 리스트
 * 작성일자 : 2005-02-07
 * 작성자   : 전현표
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/



package chosun.ciis.ps.pbs.support.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.ds.*;

/**
 * 이사신청 리스트
 */

public class PS_L_MOVM_RDRCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acptbocd;
	public String acptbonm;
	public String trsfbocd;
	public String regdt;
	public String regno;
	public String rdr_no;
	public String rdrnm;
	public String medicd;
	public String medinm;
	public Timestamp aplcdt;
	public String movmdt;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String movmzip;
	public String movmaddr;
	public String movmdtlsaddr;
	public String movmtel_no1;
	public String movmtel_no2;
	public String movmtel_no3;
	public String acptbocnfmyn;
	public String trsfboremk;
	public String acptboremk;
	public String aplcpathnm;
	public Timestamp cns_empcnfmdt;

	public PS_L_MOVM_RDRCURCOMMLISTRecord(){}

	public void setAcptbocd(String acptbocd){
		this.acptbocd = acptbocd;
	}

	public void setAcptbonm(String acptbonm){
		this.acptbonm = acptbonm;
	}

	public void setTrsfbocd(String trsfbocd){
		this.trsfbocd = trsfbocd;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setAplcdt(Timestamp aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setMovmdt(String movmdt){
		this.movmdt = movmdt;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setRdrtel_no1(String rdrtel_no1){
		this.rdrtel_no1 = rdrtel_no1;
	}

	public void setRdrtel_no2(String rdrtel_no2){
		this.rdrtel_no2 = rdrtel_no2;
	}

	public void setRdrtel_no3(String rdrtel_no3){
		this.rdrtel_no3 = rdrtel_no3;
	}

	public void setMovmzip(String movmzip){
		this.movmzip = movmzip;
	}

	public void setMovmaddr(String movmaddr){
		this.movmaddr = movmaddr;
	}

	public void setMovmdtlsaddr(String movmdtlsaddr){
		this.movmdtlsaddr = movmdtlsaddr;
	}

	public void setMovmtel_no1(String movmtel_no1){
		this.movmtel_no1 = movmtel_no1;
	}

	public void setMovmtel_no2(String movmtel_no2){
		this.movmtel_no2 = movmtel_no2;
	}

	public void setMovmtel_no3(String movmtel_no3){
		this.movmtel_no3 = movmtel_no3;
	}

	public void setAcptbocnfmyn(String acptbocnfmyn){
		this.acptbocnfmyn = acptbocnfmyn;
	}

	public void setTrsfboremk(String trsfboremk){
		this.trsfboremk = trsfboremk;
	}

	public void setAcptboremk(String acptboremk){
		this.acptboremk = acptboremk;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setCns_empcnfmdt(Timestamp cns_empcnfmdt){
		this.cns_empcnfmdt = cns_empcnfmdt;
	}

	public String getAcptbocd(){
		return this.acptbocd;
	}

	public String getAcptbonm(){
		return this.acptbonm;
	}

	public String getTrsfbocd(){
		return this.trsfbocd;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public Timestamp getAplcdt(){
		return this.aplcdt;
	}

	public String getMovmdt(){
		return this.movmdt;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getRdrtel_no1(){
		return this.rdrtel_no1;
	}

	public String getRdrtel_no2(){
		return this.rdrtel_no2;
	}

	public String getRdrtel_no3(){
		return this.rdrtel_no3;
	}

	public String getMovmzip(){
		return this.movmzip;
	}

	public String getMovmaddr(){
		return this.movmaddr;
	}

	public String getMovmdtlsaddr(){
		return this.movmdtlsaddr;
	}

	public String getMovmtel_no1(){
		return this.movmtel_no1;
	}

	public String getMovmtel_no2(){
		return this.movmtel_no2;
	}

	public String getMovmtel_no3(){
		return this.movmtel_no3;
	}

	public String getAcptbocnfmyn(){
		return this.acptbocnfmyn;
	}

	public String getTrsfboremk(){
		return this.trsfboremk;
	}

	public String getAcptboremk(){
		return this.acptboremk;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public Timestamp getCns_empcnfmdt(){
		return this.cns_empcnfmdt;
	}
}

/* 작성시간 : Tue Feb 15 09:37:33 KST 2005 */