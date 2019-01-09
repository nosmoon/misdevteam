/***************************************************************************************************
* 파일명 : SS_L_APLC_MANG_INITJYCURRecord.java
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


public class SS_L_APLC_MANG_INITJYCURRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;

	public SS_L_APLC_MANG_INITJYCURRecord(){}

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

/* 작성시간 : Mon Oct 30 10:25:25 KST 2017 */