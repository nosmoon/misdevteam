/***************************************************************************************************
 * 파일명 :PS_P_BO_SEND_LIST.java
 * 기능 : 지국별발송독자 목록
 * 작성일자 : 2007-06-21
 * 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * 발송-지국별발송독자 목록
 */

public class PS_P_BO_SEND_LISTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String hbisc;
	public String hbiscnm;
	public String bhnscd;
	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String rdr_no_all;
	public String rdr_nonm;
	public String acqnm;
	public String medinm;
	public String telno;
	public String zip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String offnm;
	public String offposi;
	public String sendseq;
	public String bocd;
	public String acq_bonm;
	public String senddt;
	public String sendtype;
	public String sendtypenm;
	public String mediser_no;
	public String sendmthdcd;
	public String sendkindcd;
	public String acq_bocd;
	public String dstccd;
	public String dlvno;
	public String subsno;
	public String memo;
	public int rnum;

	public PS_P_BO_SEND_LISTCURCOMMLISTRecord(){}

	public void setHbisc(String hbisc){
		this.hbisc = hbisc;
	}

	public void setHbiscnm(String hbiscnm){
		this.hbiscnm = hbiscnm;
	}

	public void setBhnscd(String bhnscd){
		this.bhnscd = bhnscd;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setRdr_no_all(String rdr_no_all){
		this.rdr_no_all = rdr_no_all;
	}

	public void setRdr_nonm(String rdr_nonm){
		this.rdr_nonm = rdr_nonm;
	}

	public void setAcqnm(String acqnm){
		this.acqnm = acqnm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setTelno(String telno){
		this.telno = telno;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setOffnm(String offnm){
		this.offnm = offnm;
	}

	public void setOffposi(String offposi){
		this.offposi = offposi;
	}

	public void setSendseq(String sendseq){
		this.sendseq = sendseq;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAcq_bonm(String acq_bonm){
		this.acq_bonm = acq_bonm;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public void setSendtype(String sendtype){
		this.sendtype = sendtype;
	}

	public void setSendtypenm(String sendtypenm){
		this.sendtypenm = sendtypenm;
	}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setSendmthdcd(String sendmthdcd){
		this.sendmthdcd = sendmthdcd;
	}

	public void setSendkindcd(String sendkindcd){
		this.sendkindcd = sendkindcd;
	}

	public void setAcq_bocd(String acq_bocd){
		this.acq_bocd = acq_bocd;
	}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
	}

	public void setDlvno(String dlvno){
		this.dlvno = dlvno;
	}

	public void setSubsno(String subsno){
		this.subsno = subsno;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setRnum(int rnum){
		this.rnum = rnum;
	}

	public String getHbisc(){
		return this.hbisc;
	}

	public String getHbiscnm(){
		return this.hbiscnm;
	}

	public String getBhnscd(){
		return this.bhnscd;
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

	public String getRdr_no_all(){
		return this.rdr_no_all;
	}

	public String getRdr_nonm(){
		return this.rdr_nonm;
	}

	public String getAcqnm(){
		return this.acqnm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getTelno(){
		return this.telno;
	}

	public String getZip(){
		return this.zip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getOffnm(){
		return this.offnm;
	}

	public String getOffposi(){
		return this.offposi;
	}

	public String getSendseq(){
		return this.sendseq;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAcq_bonm(){
		return this.acq_bonm;
	}

	public String getSenddt(){
		return this.senddt;
	}

	public String getSendtype(){
		return this.sendtype;
	}

	public String getSendtypenm(){
		return this.sendtypenm;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getSendmthdcd(){
		return this.sendmthdcd;
	}

	public String getSendkindcd(){
		return this.sendkindcd;
	}

	public String getAcq_bocd(){
		return this.acq_bocd;
	}

	public String getDstccd(){
		return this.dstccd;
	}

	public String getDlvno(){
		return this.dlvno;
	}

	public String getSubsno(){
		return this.subsno;
	}

	public String getMemo(){
		return this.memo;
	}

	public int getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Thu Jun 21 20:46:29 KST 2007 */