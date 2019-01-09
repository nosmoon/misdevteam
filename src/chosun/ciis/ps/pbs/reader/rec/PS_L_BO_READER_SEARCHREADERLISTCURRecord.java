/***************************************************************************************************
* 파일명 : PS_L_BO_READER_SEARCH.java
* 기능 :   독자 - 지국 출판 독자 조회
* 작성일자 : 2007-03-28
* 작성자 : 전현표 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * 독자 - 지국 출판 조회
 *
 */

public class PS_L_BO_READER_SEARCHREADERLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String bocd;
	public String bonm;
	public String acq_bocd;
	public String acq_bonm;
	public String subsfrser_no;
	public String substoser_no;
	public String acqnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String rdroffinm;
	public String rdrposi;
	public String rdroffitel_no1;
	public String rdroffitel_no2;
	public String rdroffitel_no3;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String sendmthd;
	public String sendyncd;
	public String sendynprocdt;
	public String dstccd;
	public String dlvno;
	public String boprocyn;
	public String boprocdt;
	public int rnum;

	public PS_L_BO_READER_SEARCHREADERLISTCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
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

	public void setAcq_bocd(String acq_bocd){
		this.acq_bocd = acq_bocd;
	}

	public void setAcq_bonm(String acq_bonm){
		this.acq_bonm = acq_bonm;
	}

	public void setSubsfrser_no(String subsfrser_no){
		this.subsfrser_no = subsfrser_no;
	}

	public void setSubstoser_no(String substoser_no){
		this.substoser_no = substoser_no;
	}

	public void setAcqnm(String acqnm){
		this.acqnm = acqnm;
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

	public void setRdrposi(String rdrposi){
		this.rdrposi = rdrposi;
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

	public void setSendmthd(String sendmthd){
		this.sendmthd = sendmthd;
	}

	public void setSendyncd(String sendyncd){
		this.sendyncd = sendyncd;
	}

	public void setSendynprocdt(String sendynprocdt){
		this.sendynprocdt = sendynprocdt;
	}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
	}

	public void setDlvno(String dlvno){
		this.dlvno = dlvno;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
	}

	public void setBoprocdt(String boprocdt){
		this.boprocdt = boprocdt;
	}

	public void setRnum(int rnum){
		this.rnum = rnum;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
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

	public String getAcq_bocd(){
		return this.acq_bocd;
	}

	public String getAcq_bonm(){
		return this.acq_bonm;
	}

	public String getSubsfrser_no(){
		return this.subsfrser_no;
	}

	public String getSubstoser_no(){
		return this.substoser_no;
	}

	public String getAcqnm(){
		return this.acqnm;
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

	public String getRdrposi(){
		return this.rdrposi;
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

	public String getSendmthd(){
		return this.sendmthd;
	}

	public String getSendyncd(){
		return this.sendyncd;
	}

	public String getSendynprocdt(){
		return this.sendynprocdt;
	}

	public String getDstccd(){
		return this.dstccd;
	}

	public String getDlvno(){
		return this.dlvno;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public String getBoprocdt(){
		return this.boprocdt;
	}

	public int getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Mon May 07 15:58:02 KST 2007 */