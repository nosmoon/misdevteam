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


public class SS_SLS_EXTN_5520_LCURMODLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public String bocd;
	public String extnaloncd;
	public String extnalonnm;
	public String amt;

	public SS_SLS_EXTN_5520_LCURMODLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}
	
	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setExtnaloncd(String extnaloncd){
		this.extnaloncd = extnaloncd;
	}

	public void setExtnalonnm(String extnalonnm){
		this.extnalonnm = extnalonnm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}
	
	public String getYymm(){
		return this.yymm;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getExtnaloncd(){
		return this.extnaloncd;
	}

	public String getExtnalonnm(){
		return this.extnalonnm;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Tue Oct 31 15:44:28 KST 2017 */