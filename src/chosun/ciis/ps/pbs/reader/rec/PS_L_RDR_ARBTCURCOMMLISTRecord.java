/***************************************************************************************************
* 파일명 : SP_PS_L_RDR_ARBT.java
* 기능 :   독자-중재처리 조회화면
* 작성일자 : 2004-02-23
* 작성자 : 김건호 
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
 * 독자-중재처리 조회화면
 *
 */


public class PS_L_RDR_ARBTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String arbtno;
	public String arbtaplcdt;
	public String aprvproccd;
	public String arbtprocresn;
	public String medicd;
	public String medinm;
	public String subsfrser_no;
	public String rdrnm;
	public String rdrtel_no;
	public String rdrptph_no;
	public String bocd;
	public String bonm;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;

	public PS_L_RDR_ARBTCURCOMMLISTRecord(){}

	public void setArbtno(String arbtno){
		this.arbtno = arbtno;
	}

	public void setArbtaplcdt(String arbtaplcdt){
		this.arbtaplcdt = arbtaplcdt;
	}

	public void setAprvproccd(String aprvproccd){
		this.aprvproccd = aprvproccd;
	}

	public void setArbtprocresn(String arbtprocresn){
		this.arbtprocresn = arbtprocresn;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setSubsfrser_no(String subsfrser_no){
		this.subsfrser_no = subsfrser_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdrtel_no(String rdrtel_no){
		this.rdrtel_no = rdrtel_no;
	}

	public void setRdrptph_no(String rdrptph_no){
		this.rdrptph_no = rdrptph_no;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
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

	public String getArbtno(){
		return this.arbtno;
	}

	public String getArbtaplcdt(){
		return this.arbtaplcdt;
	}

	public String getAprvproccd(){
		return this.aprvproccd;
	}

	public String getArbtprocresn(){
		return this.arbtprocresn;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getSubsfrser_no(){
		return this.subsfrser_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdrtel_no(){
		return this.rdrtel_no;
	}

	public String getRdrptph_no(){
		return this.rdrptph_no;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
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
}

/* 작성시간 : Thu Feb 26 20:06:06 KST 2004 */