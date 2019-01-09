/***************************************************************************************************
* 파일명 : SP_PS_S_RDR_ARBT.java
* 기능 :   독자-중재처리 초기화면
* 작성일자 : 2004-02-23
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * 독자-중재처리 초기화면
 *
 */


public class PS_S_RDR_ARBTBOCDRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;

	public PS_S_RDR_ARBTBOCDRecord(){}

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

/* 작성시간 : Tue Feb 24 19:48:57 KST 2004 */