/***************************************************************************************************
* 파일명 : SS_L_APLC_MANG_INITAPLCCLSFRecord.java
* 기능 : 지국업무지원-Billing자동이체-신청관리-초기화면
* 작성일자 : 2004-03-25
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 매체코드리스트 추가
* 수정자 : 장선희
* 수정일자 : 2017-10-30
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국업무지원-Billing자동이체-신청관리-초기화면
 *
 */


public class SS_L_APLC_MANG_INITAPLCCLSFRecord extends java.lang.Object implements java.io.Serializable{

	public String ciymgbcd;
	public String cicdgb;
	public String cicodeval;
	public String cicdnm;
	public String cicdynm;

	public SS_L_APLC_MANG_INITAPLCCLSFRecord(){}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCicdynm(){
		return this.cicdynm;
	}
}

/* 작성시간 : Mon Oct 30 10:25:25 KST 2017 */