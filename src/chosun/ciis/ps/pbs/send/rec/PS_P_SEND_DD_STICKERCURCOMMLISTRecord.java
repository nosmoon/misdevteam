/***************************************************************************************************
* 파일명 : PS_P_SEND_DD_STICKER.java
* 기능 : 출판 일일 발송 출력(Excel)
* 작성일자 : 2005-12-08
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
 * 출판국- 출판 일일 발송 출력(Excel)
 *
 */

public class PS_P_SEND_DD_STICKERCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bonm;
	public String rdr_no;
	public String rdrnm;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String rdrtel_no;
	public String rdrptph_no;
	public String subsfrdt;
	public String mediser_no;
	public String medinm;
	public String bndlbnsbook;
	public int sendcnt;
	public int rnum;

	public PS_P_SEND_DD_STICKERCURCOMMLISTRecord(){}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
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

	public void setRdrtel_no(String rdrtel_no){
		this.rdrtel_no = rdrtel_no;
	}

	public void setRdrptph_no(String rdrptph_no){
		this.rdrptph_no = rdrptph_no;
	}

	public void setSubsfrdt(String subsfrdt){
		this.subsfrdt = subsfrdt;
	}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setBndlbnsbook(String bndlbnsbook){
		this.bndlbnsbook = bndlbnsbook;
	}

	public void setSendcnt(int sendcnt){
		this.sendcnt = sendcnt;
	}

	public void setRnum(int rnum){
		this.rnum = rnum;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
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

	public String getRdrtel_no(){
		return this.rdrtel_no;
	}

	public String getRdrptph_no(){
		return this.rdrptph_no;
	}

	public String getSubsfrdt(){
		return this.subsfrdt;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getBndlbnsbook(){
		return this.bndlbnsbook;
	}

	public int getSendcnt(){
		return this.sendcnt;
	}

	public int getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Tue Jan 30 17:43:39 KST 2007 */