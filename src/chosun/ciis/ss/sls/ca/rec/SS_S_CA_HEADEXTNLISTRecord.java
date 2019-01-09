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


package chosun.ciis.ss.sls.ca.rec;

import java.sql.*;
import chosun.ciis.ss.sls.ca.dm.*;
import chosun.ciis.ss.sls.ca.ds.*;

/**
 * 
 */


public class SS_S_CA_HEADEXTNLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String rdrnm;
	public String rdr_extndt;
	public String qty;
	public String bonm;
	public String headcnfmdt;
	public String cnfmstat;
	public String valmm;
	public String suspdt;
	public String suspresn;

	public SS_S_CA_HEADEXTNLISTRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setHeadcnfmdt(String headcnfmdt){
		this.headcnfmdt = headcnfmdt;
	}

	public void setCnfmstat(String cnfmstat){
		this.cnfmstat = cnfmstat;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setSuspresn(String suspresn){
		this.suspresn = suspresn;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getQty(){
		return this.qty;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getHeadcnfmdt(){
		return this.headcnfmdt;
	}

	public String getCnfmstat(){
		return this.cnfmstat;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getSuspresn(){
		return this.suspresn;
	}
}

/* 작성시간 : Fri Sep 04 15:26:04 KST 2015 */