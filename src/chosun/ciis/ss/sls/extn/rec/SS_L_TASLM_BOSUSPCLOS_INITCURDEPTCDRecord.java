/***************************************************************************************************
* 파일명 : .java
* 기능 : 부서코드,부서명 목록을 리턴한다.
* 작성일자 :2009/07/10
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 확장현황 - 지국중지마감 초기화면
 */

public class SS_L_TASLM_BOSUSPCLOS_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_TASLM_BOSUSPCLOS_INITCURDEPTCDRecord(){}

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

/* 작성시간 : Fri Jul 10 10:25:02 PDT 2009 */