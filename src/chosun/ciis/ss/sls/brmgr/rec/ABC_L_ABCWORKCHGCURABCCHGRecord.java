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


public class ABC_L_ABCWORKCHGCURABCCHGRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String rdr_nm;
	public String subsmappli;
	public String bocd;
	public String wrkseq;
	public String wrkcode;
	public String clamthsty;
	public String clamlist;
	public String remk;
	public String rptvrdr_extndt;
	public String rdrtel;
	public String rdrptph;
	public String dlvcd;
	public String realsubsamt;
	public String dscnamt;

	public ABC_L_ABCWORKCHGCURABCCHGRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdr_nm(String rdr_nm){
		this.rdr_nm = rdr_nm;
	}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setWrkseq(String wrkseq){
		this.wrkseq = wrkseq;
	}

	public void setWrkcode(String wrkcode){
		this.wrkcode = wrkcode;
	}

	public void setClamthsty(String clamthsty){
		this.clamthsty = clamthsty;
	}

	public void setClamlist(String clamlist){
		this.clamlist = clamlist;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setRptvrdr_extndt(String rptvrdr_extndt){
		this.rptvrdr_extndt = rptvrdr_extndt;
	}

	public void setRdrtel(String rdrtel){
		this.rdrtel = rdrtel;
	}

	public void setRdrptph(String rdrptph){
		this.rdrptph = rdrptph;
	}

	public void setDlvcd(String dlvcd){
		this.dlvcd = dlvcd;
	}

	public void setRealsubsamt(String realsubsamt){
		this.realsubsamt = realsubsamt;
	}

	public void setDscnamt(String dscnamt){
		this.dscnamt = dscnamt;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdr_nm(){
		return this.rdr_nm;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getWrkseq(){
		return this.wrkseq;
	}

	public String getWrkcode(){
		return this.wrkcode;
	}

	public String getClamthsty(){
		return this.clamthsty;
	}

	public String getClamlist(){
		return this.clamlist;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getRptvrdr_extndt(){
		return this.rptvrdr_extndt;
	}

	public String getRdrtel(){
		return this.rdrtel;
	}

	public String getRdrptph(){
		return this.rdrptph;
	}

	public String getDlvcd(){
		return this.dlvcd;
	}

	public String getRealsubsamt(){
		return this.realsubsamt;
	}

	public String getDscnamt(){
		return this.dscnamt;
	}
}

/* 작성시간 : Wed Apr 03 05:13:07 GMT 2013 */