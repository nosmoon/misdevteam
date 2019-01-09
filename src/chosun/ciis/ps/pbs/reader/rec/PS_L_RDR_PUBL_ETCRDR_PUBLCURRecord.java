/***************************************************************************************************
* 파일명 : SP_PS_L_RDR_PUBL_ETC.java
* 기능 :   독자-독자조회 조회화면(출판마케팅제외)
* 작성일자 : 2006-01-23
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
 * 독자-독자조회 조회화면
 *
 */

public class PS_L_RDR_PUBL_ETCRDR_PUBLCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String bonm;
	public String rdrnm;
	public String medinm;
	public String subsfrser_no;
	public String rdrtel_no;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String email;
	public String acpntypenm;
	public String sendyncdflag;

	public PS_L_RDR_PUBL_ETCRDR_PUBLCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setSubsfrser_no(String subsfrser_no){
		this.subsfrser_no = subsfrser_no;
	}

	public void setRdrtel_no(String rdrtel_no){
		this.rdrtel_no = rdrtel_no;
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

	public void setEmail(String email){
		this.email = email;
	}

	public void setAcpntypenm(String acpntypenm){
		this.acpntypenm = acpntypenm;
	}

	public void setSendyncdflag(String sendyncdflag){
		this.sendyncdflag = sendyncdflag;
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

	public String getBonm(){
		return this.bonm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getSubsfrser_no(){
		return this.subsfrser_no;
	}

	public String getRdrtel_no(){
		return this.rdrtel_no;
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

	public String getEmail(){
		return this.email;
	}

	public String getAcpntypenm(){
		return this.acpntypenm;
	}

	public String getSendyncdflag(){
		return this.sendyncdflag;
	}
}

/* 작성시간 : Mon Jan 23 11:46:33 KST 2006 */