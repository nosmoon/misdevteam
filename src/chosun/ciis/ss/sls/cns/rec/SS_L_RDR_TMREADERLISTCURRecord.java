/***************************************************************************************************
* 파일명 : SS_L_RDR_TMREADERLISTCURRecord.java
* 기능 : 상담원-출판독자검색을 위한 Record
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.cns.rec;

import java.sql.*;
import chosun.ciis.ss.sls.cns.dm.*;
import chosun.ciis.ss.sls.cns.ds.*;

/**
 * 상담원-출판독자검색을 위한 Record
 */


public class SS_L_RDR_TMREADERLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String rdrnm;
	public String medicd;
	public String medicd_nm;
	public String termsubsno;
	public String bocd;
	public String bonm;
	public String subsfrser_no;
	public String substoser_no;
	public String rdrtel_no;
	public String rdrptph_no;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String prn;
	public String email;

	public SS_L_RDR_TMREADERLISTCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedicd_nm(String medicd_nm){
		this.medicd_nm = medicd_nm;
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

	public void setSubsfrser_no(String subsfrser_no){
		this.subsfrser_no = subsfrser_no;
	}

	public void setSubstoser_no(String substoser_no){
		this.substoser_no = substoser_no;
	}

	public void setRdrtel_no(String rdrtel_no){
		this.rdrtel_no = rdrtel_no;
	}

	public void setRdrptph_no(String rdrptph_no){
		this.rdrptph_no = rdrptph_no;
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

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setEmail(String email){
		this.email = email;
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

	public String getMedicd_nm(){
		return this.medicd_nm;
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

	public String getSubsfrser_no(){
		return this.subsfrser_no;
	}

	public String getSubstoser_no(){
		return this.substoser_no;
	}

	public String getRdrtel_no(){
		return this.rdrtel_no;
	}

	public String getRdrptph_no(){
		return this.rdrptph_no;
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

	public String getPrn(){
		return this.prn;
	}

	public String getEmail(){
		return this.email;
	}
}

/* 작성시간 : Wed Jul 14 11:10:46 KST 2004 */