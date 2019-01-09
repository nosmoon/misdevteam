/***************************************************************************************************
 * 파일명   : SP_SS_L_COMM_APT_THRW.java
 * 기능     : 판매국-지국경영 아파트 투입현황 조사및 등록(조사내역조회)
 * 작성일자 : 2006/07/13
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  SP_SS_L_COMM_APT_THRW
**/

public class SS_L_COMM_APT_THRWADDRCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;

	public SS_L_COMM_APT_THRWADDRCDCURRecord(){}

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

/* 작성시간 : Wed Jul 12 14:49:50 KST 2006 */