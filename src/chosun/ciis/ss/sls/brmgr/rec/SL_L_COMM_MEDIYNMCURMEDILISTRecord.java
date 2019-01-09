/***************************************************************************************************
 * 파일명   : SL_L_COMM_MEDIYNMCURMEDILISTRecord.java
 * 기능     : 지국경영-아파트투입율-매체 약어표
 * 작성일자 : 2005/10/07
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  지국경영-아파트투입율-매체 약어표
**/

public class SL_L_COMM_MEDIYNMCURMEDILISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicdnm;
	public String cimgtcd2;

	public SL_L_COMM_MEDIYNMCURMEDILISTRecord(){}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCimgtcd2(String cimgtcd2){
		this.cimgtcd2 = cimgtcd2;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCimgtcd2(){
		return this.cimgtcd2;
	}
}

/* 작성시간 : Fri Oct 07 17:27:42 KST 2005 */