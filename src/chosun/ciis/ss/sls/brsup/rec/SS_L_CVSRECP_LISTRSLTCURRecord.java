/***************************************************************************************************
 * 파일명   : SP_SS_L_CVSRECP_LIST
 * 기능     : 지국지원-빌링-편의점수납현황
 * 작성일자 : 2007/04/20
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
**  SP_SS_L_CVSRECP_LIST
**/

public class SS_L_CVSRECP_LISTRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String acqdt;
	public String bocd;
	public String bonm;
	public String girono;
	public String rdr_no;
	public String medicd;
	public String subsmappli;
	public String custbrwsno;
	public int amt;
	public int fee;
	public String recpbankcd;
	public String recpbanknm;
	public String recpbrchcd;
	public String recpdt;
	public String rcpmrflyn;
	public String rcpmrfldescri;

	public SS_L_CVSRECP_LISTRSLTCURRecord(){}

	public void setAcqdt(String acqdt){
		this.acqdt = acqdt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setGirono(String girono){
		this.girono = girono;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setCustbrwsno(String custbrwsno){
		this.custbrwsno = custbrwsno;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setFee(int fee){
		this.fee = fee;
	}

	public void setRecpbankcd(String recpbankcd){
		this.recpbankcd = recpbankcd;
	}

	public void setRecpbanknm(String recpbanknm){
		this.recpbanknm = recpbanknm;
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

	public void setRcpmrfldescri(String rcpmrfldescri){
		this.rcpmrfldescri = rcpmrfldescri;
	}

	public String getAcqdt(){
		return this.acqdt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getGirono(){
		return this.girono;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public String getCustbrwsno(){
		return this.custbrwsno;
	}

	public int getAmt(){
		return this.amt;
	}

	public int getFee(){
		return this.fee;
	}

	public String getRecpbankcd(){
		return this.recpbankcd;
	}

	public String getRecpbanknm(){
		return this.recpbanknm;
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

	public String getRcpmrfldescri(){
		return this.rcpmrfldescri;
	}
}

/* 작성시간 : Fri Apr 20 16:48:01 KST 2007 */