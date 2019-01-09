/***************************************************************************************************
 * 파일명   : SP_SS_S_PUBL_RDR
 * 기능     : 지국경영-주간조선 독자조회
 * 작성일자 : 2007/06/15
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  SP_SS_S_PUBL_RDR
**/

public class SS_S_PUBL_RDRCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_S_PUBL_RDRCURDEPTCDRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setBoksnm(String boksnm){
		this.boksnm = boksnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getBoksnm(){
		return this.boksnm;
	}
}

/* 작성시간 : Fri Jun 15 15:57:09 KST 2007 */