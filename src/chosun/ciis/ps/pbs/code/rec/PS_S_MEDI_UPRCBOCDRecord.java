/***************************************************************************************************
* 파일명 : SP_PS_S_MEDI_UPRC.java
* 기능 :   코드관리-매체단가관리 초기화면
* 작성일자 : 2004-02-20
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 : 
* 백업 :  
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * 코드관리-매체단가관리 초기화면
 *
 */


public class PS_S_MEDI_UPRCBOCDRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;

	public PS_S_MEDI_UPRCBOCDRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}
}

/* 작성시간 : Fri Feb 20 10:26:59 KST 2004 */