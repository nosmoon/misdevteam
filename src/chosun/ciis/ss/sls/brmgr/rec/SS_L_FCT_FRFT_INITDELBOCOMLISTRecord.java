/***************************************************************************************************
* 파일명 : SS_L_FCT_FRFT_INITDELBOCOMLISTRecord.java
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


public class SS_L_FCT_FRFT_INITDELBOCOMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_FCT_FRFT_INITDELBOCOMLISTRecord(){}

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

/* 작성시간 : Mon Mar 22 16:50:35 KST 2004 */