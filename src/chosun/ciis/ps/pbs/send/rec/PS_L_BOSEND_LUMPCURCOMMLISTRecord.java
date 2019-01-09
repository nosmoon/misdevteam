/***************************************************************************************************
* 파일명 : PS_L_BOSEND_LUMP.java
* 기능   : 발송 - 지국별상세 리스트
* 작성일자 : 2007-04-13
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
 * 발송 - 지국별상세 리스트
 */

public class PS_L_BOSEND_LUMPCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String rdr_nonm;
	public String acqnm;
	public String medicdnm;
	public String telno;
	public String addr;
	public String sendseq;
	public String bocd;
	public String bocdnm;
	public String senddt;
	public String sendtype;
	public String sendtypenm;
	public String mediser_no;
	public String sendmthdcd;
	public String sendkindcd;
	public String acq_bocd;
	public String dstccd;
	public String dlvno;
	public String memo;
	public int rnum;

	public PS_L_BOSEND_LUMPCURCOMMLISTRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setRdr_nonm(String rdr_nonm){
		this.rdr_nonm = rdr_nonm;
	}

	public void setAcqnm(String acqnm){
		this.acqnm = acqnm;
	}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setTelno(String telno){
		this.telno = telno;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setSendseq(String sendseq){
		this.sendseq = sendseq;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBocdnm(String bocdnm){
		this.bocdnm = bocdnm;
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

	public void setMemo(String memo){
		this.memo = memo;
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

	public String getRdr_nonm(){
		return this.rdr_nonm;
	}

	public String getAcqnm(){
		return this.acqnm;
	}

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public String getTelno(){
		return this.telno;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getSendseq(){
		return this.sendseq;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBocdnm(){
		return this.bocdnm;
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

	public String getMemo(){
		return this.memo;
	}

	public int getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Mon Apr 16 20:25:07 KST 2007 */