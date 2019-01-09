/***************************************************************************************************
* 파일명 : SP_PS_L_BILL_NONRCPM.java
* 수금-비정상입금 조회화면
* 작성일자 : 2004-03-29
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 : 
* 수정일자 :    
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.ds.*;

/** 
 * 수금-비정상입금 조회화면   
 * 
 */

  

public class PS_L_BILL_NONRCPMCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String seq;
	public String acqdt;
	public String acqno;
	public String rcpmrfldt;
	public String custbrwsno;
	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String rdrnm;
	public String medinm;
	public String tbstprocclsf;
	public String tbstprocclsfnm;
	public int amt;
	public String recpbrchcd;
	public String recpdt;
	public String rcpmrflyn;
	public String rcpmrflynnm;

	public PS_L_BILL_NONRCPMCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAcqdt(String acqdt){
		this.acqdt = acqdt;
	}

	public void setAcqno(String acqno){
		this.acqno = acqno;
	}

	public void setRcpmrfldt(String rcpmrfldt){
		this.rcpmrfldt = rcpmrfldt;
	}

	public void setCustbrwsno(String custbrwsno){
		this.custbrwsno = custbrwsno;
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

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setTbstprocclsf(String tbstprocclsf){
		this.tbstprocclsf = tbstprocclsf;
	}

	public void setTbstprocclsfnm(String tbstprocclsfnm){
		this.tbstprocclsfnm = tbstprocclsfnm;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setRecpbrchcd(String recpbrchcd){
		this.recpbrchcd = recpbrchcd;
	}

	public void setRecpdt(String recpdt){
		this.recpdt = recpdt;
	}

	public void setRcpmrflyn(String rcpmrflyn){
		this.rcpmrflyn = rcpmrflyn;
	}

	public void setRcpmrflynnm(String rcpmrflynnm){
		this.rcpmrflynnm = rcpmrflynnm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAcqdt(){
		return this.acqdt;
	}

	public String getAcqno(){
		return this.acqno;
	}

	public String getRcpmrfldt(){
		return this.rcpmrfldt;
	}

	public String getCustbrwsno(){
		return this.custbrwsno;
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

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getTbstprocclsf(){
		return this.tbstprocclsf;
	}

	public String getTbstprocclsfnm(){
		return this.tbstprocclsfnm;
	}

	public int getAmt(){
		return this.amt;
	}

	public String getRecpbrchcd(){
		return this.recpbrchcd;
	}

	public String getRecpdt(){
		return this.recpdt;
	}

	public String getRcpmrflyn(){
		return this.rcpmrflyn;
	}

	public String getRcpmrflynnm(){
		return this.rcpmrflynnm;
	}
}

/* 작성시간 : Mon Mar 29 17:51:13 KST 2004 */