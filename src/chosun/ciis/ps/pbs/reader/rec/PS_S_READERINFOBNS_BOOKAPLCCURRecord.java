/***************************************************************************************************
* 파일명   : PS_S_READERINFO.java
* 기능     : 독자-구독자 상세조회
* 작성일자 : 2004-07-24
* 작성자   : 김상옥
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
 * 독자-구독자 상세조회 
 */

public class PS_S_READERINFOBNS_BOOKAPLCCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String aplcseq;
	public String recppersnm;
	public String recpperszip;
	public String recppersaddr;
	public String recppersdtlsaddr;
	public String rptvaddryn;
	public String memo;
	public String bns_booksendtype;
	public String bns_booksendtypenm;
	public String sendmthd;
	public String sendmthdnm;
	public String bosendyn;
	public String brch_offisend_dt;
	public String hdqtsendyn;
	public String hdqtsend_dt;
	public String bns_booknm;
	public String incmgpersnm;

	public PS_S_READERINFOBNS_BOOKAPLCCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setAplcseq(String aplcseq){
		this.aplcseq = aplcseq;
	}

	public void setRecppersnm(String recppersnm){
		this.recppersnm = recppersnm;
	}

	public void setRecpperszip(String recpperszip){
		this.recpperszip = recpperszip;
	}

	public void setRecppersaddr(String recppersaddr){
		this.recppersaddr = recppersaddr;
	}

	public void setRecppersdtlsaddr(String recppersdtlsaddr){
		this.recppersdtlsaddr = recppersdtlsaddr;
	}

	public void setRptvaddryn(String rptvaddryn){
		this.rptvaddryn = rptvaddryn;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setBns_booksendtype(String bns_booksendtype){
		this.bns_booksendtype = bns_booksendtype;
	}

	public void setBns_booksendtypenm(String bns_booksendtypenm){
		this.bns_booksendtypenm = bns_booksendtypenm;
	}

	public void setSendmthd(String sendmthd){
		this.sendmthd = sendmthd;
	}

	public void setSendmthdnm(String sendmthdnm){
		this.sendmthdnm = sendmthdnm;
	}

	public void setBosendyn(String bosendyn){
		this.bosendyn = bosendyn;
	}

	public void setBrch_offisend_dt(String brch_offisend_dt){
		this.brch_offisend_dt = brch_offisend_dt;
	}

	public void setHdqtsendyn(String hdqtsendyn){
		this.hdqtsendyn = hdqtsendyn;
	}

	public void setHdqtsend_dt(String hdqtsend_dt){
		this.hdqtsend_dt = hdqtsend_dt;
	}

	public void setBns_booknm(String bns_booknm){
		this.bns_booknm = bns_booknm;
	}

	public void setIncmgpersnm(String incmgpersnm){
		this.incmgpersnm = incmgpersnm;
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

	public String getAplcseq(){
		return this.aplcseq;
	}

	public String getRecppersnm(){
		return this.recppersnm;
	}

	public String getRecpperszip(){
		return this.recpperszip;
	}

	public String getRecppersaddr(){
		return this.recppersaddr;
	}

	public String getRecppersdtlsaddr(){
		return this.recppersdtlsaddr;
	}

	public String getRptvaddryn(){
		return this.rptvaddryn;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getBns_booksendtype(){
		return this.bns_booksendtype;
	}

	public String getBns_booksendtypenm(){
		return this.bns_booksendtypenm;
	}

	public String getSendmthd(){
		return this.sendmthd;
	}

	public String getSendmthdnm(){
		return this.sendmthdnm;
	}

	public String getBosendyn(){
		return this.bosendyn;
	}

	public String getBrch_offisend_dt(){
		return this.brch_offisend_dt;
	}

	public String getHdqtsendyn(){
		return this.hdqtsendyn;
	}

	public String getHdqtsend_dt(){
		return this.hdqtsend_dt;
	}

	public String getBns_booknm(){
		return this.bns_booknm;
	}

	public String getIncmgpersnm(){
		return this.incmgpersnm;
	}
}

/* 작성시간 : Mon Jun 30 15:58:27 KST 2008 */