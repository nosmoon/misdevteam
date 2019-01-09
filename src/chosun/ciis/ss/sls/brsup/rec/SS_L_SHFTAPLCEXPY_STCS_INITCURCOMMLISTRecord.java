/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국업무지원-Billing자동이체-신청/해지통계-초기화면
* 작성일자 : 2005-01-11
* 작성자 : 김영윤
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
 * 지국업무지원-Billing자동이체-신청/해지통계-초기화면
 */


public class SS_L_SHFTAPLCEXPY_STCS_INITCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ciymgbcd;
	public String cicdnm;

	public SS_L_SHFTAPLCEXPY_STCS_INITCURCOMMLISTRecord(){}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* 작성시간 : Tue Jan 11 20:20:09 KST 2005 */
