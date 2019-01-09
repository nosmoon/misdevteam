/***************************************************************************************************
 * 파일명   : SL_L_APTLISTADDRCDCURRecord.java
 * 기능     : 지국경영-투입율조사
 * 작성일자 : 2006/06/27
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  SP_SL_L_APTLIST
**/

public class SL_L_APTLISTADDRCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;

	public SL_L_APTLISTADDRCDCURRecord(){}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getAddrnm(){
		return this.addrnm;
	}
}

/* 작성시간 : Tue Jun 27 15:11:40 KST 2006 */