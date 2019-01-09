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


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * 
 */


public class SL_S_RDR_INFOADDRCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;
	public String resitypecd;
	public String addrbnji;
	public String mvindt;

	public SL_S_RDR_INFOADDRCDCURRecord(){}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setAddrbnji(String addrbnji){
		this.addrbnji = addrbnji;
	}

	public void setMvindt(String mvindt){
		this.mvindt = mvindt;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getAddrbnji(){
		return this.addrbnji;
	}

	public String getMvindt(){
		return this.mvindt;
	}
}

/* 작성시간 : Wed Oct 11 17:10:57 KST 2017 */