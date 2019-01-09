/***************************************************************************************************
 * 파일명   : SS_L_GIRORECPRSLTCURRecord.java
 * 기능     : 지국지원-빌링-지로EDI
 * 작성일자 : 2007/02/22
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
**  SP_SS_L_GIRORECP
**/

public class SS_L_GIRORECPRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String acqdt;
	public String seq;
	public String recpdt;
	public String shftdt;
	public int amt;
	public String custbrwsno;
	public int girocoms;
	public String tbstprocclsf;
	public String rcpmrflclsf;
	public String rcpmrfldescri;
	public String rcpmrflyn;
	public String rcpmrfldt;
	public String recpclsf;
	public String rdr_no;
	public String medicd;
	public String medinm;
	public String mediynm;
	public String subsmappli;
	public int clamamt;
	public int clamt;
	public String rdrnm;
	public String addrnm;
	public String dlvdtlsaddr;
	public String dlvdong;
	public String dlvser_no;
	public String dlvbnji;
	public String dlvteamcd;
	public String dlvdstccd;
	public String dlvno;

	public SS_L_GIRORECPRSLTCURRecord(){}

	public void setAcqdt(String acqdt){
		this.acqdt = acqdt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRecpdt(String recpdt){
		this.recpdt = recpdt;
	}

	public void setShftdt(String shftdt){
		this.shftdt = shftdt;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setCustbrwsno(String custbrwsno){
		this.custbrwsno = custbrwsno;
	}

	public void setGirocoms(int girocoms){
		this.girocoms = girocoms;
	}

	public void setTbstprocclsf(String tbstprocclsf){
		this.tbstprocclsf = tbstprocclsf;
	}

	public void setRcpmrflclsf(String rcpmrflclsf){
		this.rcpmrflclsf = rcpmrflclsf;
	}

	public void setRcpmrfldescri(String rcpmrfldescri){
		this.rcpmrfldescri = rcpmrfldescri;
	}

	public void setRcpmrflyn(String rcpmrflyn){
		this.rcpmrflyn = rcpmrflyn;
	}

	public void setRcpmrfldt(String rcpmrfldt){
		this.rcpmrfldt = rcpmrfldt;
	}

	public void setRecpclsf(String recpclsf){
		this.recpclsf = recpclsf;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setMediynm(String mediynm){
		this.mediynm = mediynm;
	}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setClamamt(int clamamt){
		this.clamamt = clamamt;
	}

	public void setClamt(int clamt){
		this.clamt = clamt;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setDlvdong(String dlvdong){
		this.dlvdong = dlvdong;
	}

	public void setDlvser_no(String dlvser_no){
		this.dlvser_no = dlvser_no;
	}

	public void setDlvbnji(String dlvbnji){
		this.dlvbnji = dlvbnji;
	}

	public void setDlvteamcd(String dlvteamcd){
		this.dlvteamcd = dlvteamcd;
	}

	public void setDlvdstccd(String dlvdstccd){
		this.dlvdstccd = dlvdstccd;
	}

	public void setDlvno(String dlvno){
		this.dlvno = dlvno;
	}

	public String getAcqdt(){
		return this.acqdt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRecpdt(){
		return this.recpdt;
	}

	public String getShftdt(){
		return this.shftdt;
	}

	public int getAmt(){
		return this.amt;
	}

	public String getCustbrwsno(){
		return this.custbrwsno;
	}

	public int getGirocoms(){
		return this.girocoms;
	}

	public String getTbstprocclsf(){
		return this.tbstprocclsf;
	}

	public String getRcpmrflclsf(){
		return this.rcpmrflclsf;
	}

	public String getRcpmrfldescri(){
		return this.rcpmrfldescri;
	}

	public String getRcpmrflyn(){
		return this.rcpmrflyn;
	}

	public String getRcpmrfldt(){
		return this.rcpmrfldt;
	}

	public String getRecpclsf(){
		return this.recpclsf;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getMediynm(){
		return this.mediynm;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public int getClamamt(){
		return this.clamamt;
	}

	public int getClamt(){
		return this.clamt;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getDlvdong(){
		return this.dlvdong;
	}

	public String getDlvser_no(){
		return this.dlvser_no;
	}

	public String getDlvbnji(){
		return this.dlvbnji;
	}

	public String getDlvteamcd(){
		return this.dlvteamcd;
	}

	public String getDlvdstccd(){
		return this.dlvdstccd;
	}

	public String getDlvno(){
		return this.dlvno;
	}
}

/* 작성시간 : Thu Feb 22 16:45:43 KST 2007 */