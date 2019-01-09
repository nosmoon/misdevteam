/***************************************************************************************************
* 파일명 : SS_L_FCT_FRFT_INITDEPTLISTRecord.java
* 기능 : 지국경영-공정위 위약금 조회 화면
* 작성일자 : 2004-03-03
* 작성자 : 김성규
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 지국경영-공정위 위약금 조회 화면
 *
 */


public class SS_L_FCT_FRFT_INITDEPTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String bcbuseonm;

	public SS_L_FCT_FRFT_INITDEPTLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setBcbuseonm(String bcbuseonm){
		this.bcbuseonm = bcbuseonm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getBcbuseonm(){
		return this.bcbuseonm;
	}
}

/* 작성시간 : Mon Mar 22 16:50:35 KST 2004 */