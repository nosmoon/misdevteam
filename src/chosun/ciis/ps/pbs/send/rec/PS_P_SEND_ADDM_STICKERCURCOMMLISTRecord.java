/***************************************************************************************************
* 파일명 : PS_P_SEND_ADDM_STICKER.java
* 기능 : 출판 추가 발송 출력(Excel)
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
 * 출판국- 출판 추가 발송 출력(Excel)
 *
 */

public class PS_P_SEND_ADDM_STICKERCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

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
	public String memo;
	public int rnum;

	public PS_P_SEND_ADDM_STICKERCURCOMMLISTRecord(){}

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

	public void setMemo(String memo){
		this.memo = memo;
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

	public String getMemo(){
		return this.memo;
	}

	public int getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Fri Dec 09 11:45:58 KST 2005 */