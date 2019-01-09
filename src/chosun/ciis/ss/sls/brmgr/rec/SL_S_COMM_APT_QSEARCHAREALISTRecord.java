/***************************************************************************************************
 * 파일명   : SP_SL_S_COMM_APT_QSEARCH.java
 * 기능     : 지국경영-투입율조사-아파트구조 바로가기
 * 작성일자 : 2006/06/21
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  SP_SL_S_COMM_APT_QSEARCH
**/

public class SL_S_COMM_APT_QSEARCHAREALISTRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;

	public SL_S_COMM_APT_QSEARCHAREALISTRecord(){}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}
}

/* 작성시간 : Thu Jun 22 11:08:44 KST 2006 */