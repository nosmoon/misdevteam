/***************************************************************************************************
* 파일명 : SP_PS_L_BILL_SEPR.java
* 수금-개별입금 조회화면
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
 * 수금-개별입금 조회화면   
 * 
 */

  

public class PS_L_BILL_SEPRCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String rcpmseq;
	public String rdrnm;
	public String medicdnm;
	public String procdt;
	public String recpdt;
	public String recpmthd;
	public String recpmthdnm;
	public int rcpmamt;
	public String bonm;
	public String bocd;

	public PS_L_BILL_SEPRCURCOMMLISTRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setRcpmseq(String rcpmseq){
		this.rcpmseq = rcpmseq;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setProcdt(String procdt){
		this.procdt = procdt;
	}

	public void setRecpdt(String recpdt){
		this.recpdt = recpdt;
	}

	public void setRecpmthd(String recpmthd){
		this.recpmthd = recpmthd;
	}

	public void setRecpmthdnm(String recpmthdnm){
		this.recpmthdnm = recpmthdnm;
	}

	public void setRcpmamt(int rcpmamt){
		this.rcpmamt = rcpmamt;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
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

	public String getRcpmseq(){
		return this.rcpmseq;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public String getProcdt(){
		return this.procdt;
	}

	public String getRecpdt(){
		return this.recpdt;
	}

	public String getRecpmthd(){
		return this.recpmthd;
	}

	public String getRecpmthdnm(){
		return this.recpmthdnm;
	}

	public int getRcpmamt(){
		return this.rcpmamt;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBocd(){
		return this.bocd;
	}
}

/* 작성시간 : Wed Mar 31 10:55:44 KST 2004 */