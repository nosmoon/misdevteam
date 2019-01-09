/***************************************************************************************************
 * 파일명   : SSExtn2280.java
 * 기능     : 일괄확장 등록
 * 작성일자 : 2011-03-30
 * 작성자   : 김태희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_L_BATCH_EXTNRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String valqty;
	public String extndt;
	public String extnno;
	public String extnnm;
	public String extnaddr;
	public String extntel;

	public SS_L_BATCH_EXTNRSLTCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setValqty(String valqty){
		this.valqty = valqty;
	}

	public void setExtndt(String extndt){
		this.extndt = extndt;
	}

	public void setExtnno(String extnno){
		this.extnno = extnno;
	}

	public void setExtnnm(String extnnm){
		this.extnnm = extnnm;
	}

	public void setExtnaddr(String extnaddr){
		this.extnaddr = extnaddr;
	}

	public void setExtntel(String extntel){
		this.extntel = extntel;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getValqty(){
		return this.valqty;
	}

	public String getExtndt(){
		return this.extndt;
	}

	public String getExtnno(){
		return this.extnno;
	}

	public String getExtnnm(){
		return this.extnnm;
	}

	public String getExtnaddr(){
		return this.extnaddr;
	}

	public String getExtntel(){
		return this.extntel;
	}
}

/* 작성시간 : Tue Apr 05 10:56:32 KST 2011 */