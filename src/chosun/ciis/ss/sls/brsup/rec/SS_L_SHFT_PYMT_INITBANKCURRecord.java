/***************************************************************************************************
* 파일명 : SS_L_SHFT_PYMT_INITBANKCURRecord.java
* 기능 : 지국업무지원-Billing자동이체-납부자관리-초기화면
* 작성일자 : 2004-04-01
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국업무지원-Billing자동이체-납부자관리-초기화면
 *
 */


public class SS_L_SHFT_PYMT_INITBANKCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_SHFT_PYMT_INITBANKCURRecord(){}

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

/* 작성시간 : Wed Apr 07 21:52:40 KST 2004 */