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


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 
 */


public class SS_S_VACT_STATCURRDRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bonm;
	public String rdrnm;
	public String rdr_no;
	public String medinm;
	public String banknm;
	public String acctno;
	public String shftdt;
	public int clamt;
	public String stats;
	public String subsmappli;
	public String tr_no;

	public SS_S_VACT_STATCURRDRLISTRecord(){}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setShftdt(String shftdt){
		this.shftdt = shftdt;
	}

	public void setClamt(int clamt){
		this.clamt = clamt;
	}

	public void setStats(String stats){
		this.stats = stats;
	}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setTr_no(String tr_no){
		this.tr_no = tr_no;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getShftdt(){
		return this.shftdt;
	}

	public int getClamt(){
		return this.clamt;
	}

	public String getStats(){
		return this.stats;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public String getTr_no(){
		return this.tr_no;
	}
}

/* 작성시간 : Thu Oct 01 18:33:42 KST 2015 */