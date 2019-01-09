/***************************************************************************************************
 * 파일명   : SS_S_BO_HEADJGJANGIR_LISTRecord.java
 * 기능     : 지국info-지국장정보-상세조회
 * 작성일자 : 2007/01/11
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
**  SP_SS_S_BO_HEAD
**/

public class SS_S_BO_HEADJGJANGIR_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ircy;
	public String irmm;
	public String irsh;

	public SS_S_BO_HEADJGJANGIR_LISTRecord(){}

	public void setIrcy(String ircy){
		this.ircy = ircy;
	}

	public void setIrmm(String irmm){
		this.irmm = irmm;
	}

	public void setIrsh(String irsh){
		this.irsh = irsh;
	}

	public String getIrcy(){
		return this.ircy;
	}

	public String getIrmm(){
		return this.irmm;
	}

	public String getIrsh(){
		return this.irsh;
	}
}

/* 작성시간 : Thu Jan 11 14:52:18 KST 2007 */