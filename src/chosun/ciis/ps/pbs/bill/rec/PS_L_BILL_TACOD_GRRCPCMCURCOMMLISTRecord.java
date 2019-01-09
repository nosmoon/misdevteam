/***************************************************************************************************
* 파일명 : SP_PS_L_BILL_TACOD_GRRCPCM.java
* 수금-일괄입금 상세조회화면
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
 * 수금-일괄입금 상세조회화면
 *
 */



public class PS_L_BILL_TACOD_GRRCPCMCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public int amt;
	public String recpbrchcd;
	public String recpdt;
	public String rcpmrflyn;
	public String recpclsf;
	public String tbstprocclsf;
	public String rcpmrflclsf;
	public String bocd;
	public String bonm;
	public String rdr_no;
	public String medinm;
	public String rdrnm;

	public PS_L_BILL_TACOD_GRRCPCMCURCOMMLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
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

	public void setRecpclsf(String recpclsf){
		this.recpclsf = recpclsf;
	}

	public void setTbstprocclsf(String tbstprocclsf){
		this.tbstprocclsf = tbstprocclsf;
	}

	public void setRcpmrflclsf(String rcpmrflclsf){
		this.rcpmrflclsf = rcpmrflclsf;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public String getSeq(){
		return this.seq;
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

	public String getRecpclsf(){
		return this.recpclsf;
	}

	public String getTbstprocclsf(){
		return this.tbstprocclsf;
	}

	public String getRcpmrflclsf(){
		return this.rcpmrflclsf;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}
}

/* 작성시간 : Wed Mar 31 17:54:04 KST 2004 */