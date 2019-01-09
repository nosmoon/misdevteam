/***************************************************************************************************
 * 파일명   : SL_L_BOEMPFLNMCURRecord.java
 * 기능     : 지국경영-아파트투입율-직원검색 직원목록조회
 * 작성일자 : 2005/10/14
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  지국경영-아파트투입율-직원검색 직원목록조회
**/

public class SL_L_BOEMPFLNMCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SL_L_BOEMPFLNMCURRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* 작성시간 : Fri Oct 14 15:23:20 KST 2005 */