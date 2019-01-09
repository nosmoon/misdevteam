/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-지국지원-이사독자수당현황
* 작성일자 : 2011-12-05
* 작성자 : 이기영
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 
 */


public class ABC_L_AUTHRATIODTLCURAUTHRATIODTLRecord extends java.lang.Object implements java.io.Serializable{

	public String subsmappli;
	public String bocd;
	public String abcclsf;
	public String abc;
	public String rdr_no;
	public String valmm;
	public String clamlist;

	public ABC_L_AUTHRATIODTLCURAUTHRATIODTLRecord(){}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAbcclsf(String abcclsf){
		this.abcclsf = abcclsf;
	}

	public void setAbc(String abc){
		this.abc = abc;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setClamlist(String clamlist){
		this.clamlist = clamlist;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAbcclsf(){
		return this.abcclsf;
	}

	public String getAbc(){
		return this.abc;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getClamlist(){
		return this.clamlist;
	}
}

/* 작성시간 : Wed Apr 03 08:16:01 GMT 2013 */