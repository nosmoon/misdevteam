/***************************************************************************************************
* 파일명 : .java
* 기능 : * 확장현황-확장제한-초기화면
* 작성일자 : 2009-09-08
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 *  확장현황-확장제한-초기화면
 */

public class SS_L_EXTN_RES_INITADDRCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;
	public String resitypecd;
	public String addrbnji;
	public String mvindt;

	public SS_L_EXTN_RES_INITADDRCDCURRecord(){}

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

/* 작성시간 : Tue Sep 08 16:35:57 KST 2009 */