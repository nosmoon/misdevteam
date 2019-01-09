/***************************************************************************************************
* 파일명 : SS_L_POSTDLVRDRPOSTRDRLISTRecord.java
* 기능 : 독자관리 우송독자관리 조회
* 작성일자 : 2015-06-17
* 작성자 : 장 선 희 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :  
* 수정일자 : 
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 
 */


public class SS_L_POSTDLVRDRPOSTRDRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String rdrnm;
	public String medinm;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String bonm;
	public String modiyn;
	

	public SS_L_POSTDLVRDRPOSTRDRLISTRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
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

	public void setBonm(String bonm){
		this.bonm = bonm;
	}
	
	public void setModiyn(String modiyn){
		this.modiyn = modiyn;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedinm(){
		return this.medinm;
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

	public String getBonm(){
		return this.bonm;
	}

	public String getModiyn(){
		return this.modiyn;
	}
}

/* 작성시간 : Wed Jun 17 09:50:03 KST 2015 */