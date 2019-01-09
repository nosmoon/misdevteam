/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
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


public class SS_SLS_EXTN_4830_LCURMODLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String gubun;
	public String dncomp;
	public String dncompnm;
	public String valmm;
	public String bonm;
	public String rdr_no;
	public String rdrnm;
	public String qty;
	public String subsuprc;
	public String cnfm_amt;
	public String bocd;

	public SS_SLS_EXTN_4830_LCURMODLISTRecord(){}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setDncomp(String dncomp){
		this.dncomp = dncomp;
	}

	public void setDncompnm(String dncompnm){
		this.dncompnm = dncompnm;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setSubsuprc(String subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setCnfm_amt(String cnfm_amt){
		this.cnfm_amt = cnfm_amt;
	}
	
	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getDncomp(){
		return this.dncomp;
	}

	public String getDncompnm(){
		return this.dncompnm;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getQty(){
		return this.qty;
	}

	public String getSubsuprc(){
		return this.subsuprc;
	}

	public String getCnfm_amt(){
		return this.cnfm_amt;
	}
	
	public String getBocd(){
		return this.bocd;
	}
}

/* 작성시간 : Thu May 26 14:55:06 KST 2016 */