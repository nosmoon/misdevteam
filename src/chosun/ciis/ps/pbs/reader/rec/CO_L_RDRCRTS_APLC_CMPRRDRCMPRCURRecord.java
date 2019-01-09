/***************************************************************************************************
 * 파일명   : CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord.java
 * 기능     : 독자-독자등급관리 구독자비교대상검색
 * 작성일자 : 2004-04-22
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * 독자-독자등급관리 구독자비교대상검색
 */

public class CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String onlmembid;
	public String onlmembseq;
	public String rdrnm;
	public String prn;
	public String email;
	public String rdrgrad;
	public String subsdt;
	public String suspdt;
	public String medicd;
	public String medinm;
	public String termsubsno;
	public String bocd;
	public String bonm;
	public String aplcdt;
	public String subsfrser_no;
	public String substoser_no;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String rdroffinm;
	public String rdroffitel_no1;
	public String rdroffitel_no2;
	public String rdroffitel_no3;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String rnum;

	public CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setOnlmembid(String onlmembid){
		this.onlmembid = onlmembid;
	}

	public void setOnlmembseq(String onlmembseq){
		this.onlmembseq = onlmembseq;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setRdrgrad(String rdrgrad){
		this.rdrgrad = rdrgrad;
	}

	public void setSubsdt(String subsdt){
		this.subsdt = subsdt;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setSubsfrser_no(String subsfrser_no){
		this.subsfrser_no = subsfrser_no;
	}

	public void setSubstoser_no(String substoser_no){
		this.substoser_no = substoser_no;
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

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
	}

	public void setRdroffinm(String rdroffinm){
		this.rdroffinm = rdroffinm;
	}

	public void setRdroffitel_no1(String rdroffitel_no1){
		this.rdroffitel_no1 = rdroffitel_no1;
	}

	public void setRdroffitel_no2(String rdroffitel_no2){
		this.rdroffitel_no2 = rdroffitel_no2;
	}

	public void setRdroffitel_no3(String rdroffitel_no3){
		this.rdroffitel_no3 = rdroffitel_no3;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getOnlmembid(){
		return this.onlmembid;
	}

	public String getOnlmembseq(){
		return this.onlmembseq;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getEmail(){
		return this.email;
	}

	public String getRdrgrad(){
		return this.rdrgrad;
	}

	public String getSubsdt(){
		return this.subsdt;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getSubsfrser_no(){
		return this.subsfrser_no;
	}

	public String getSubstoser_no(){
		return this.substoser_no;
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

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
	}

	public String getRdroffinm(){
		return this.rdroffinm;
	}

	public String getRdroffitel_no1(){
		return this.rdroffitel_no1;
	}

	public String getRdroffitel_no2(){
		return this.rdroffitel_no2;
	}

	public String getRdroffitel_no3(){
		return this.rdroffitel_no3;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Fri Apr 23 16:36:20 KST 2004 */