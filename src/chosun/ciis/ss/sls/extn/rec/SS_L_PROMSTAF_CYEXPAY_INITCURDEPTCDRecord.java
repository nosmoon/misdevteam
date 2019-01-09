/***************************************************************************************************
* 파일명 : SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord.java
* 기능 : 확장현황-사이버확장-수당-초기화면 부서코드 목록을 위한 Record
* 작성일자 : 2004-09-13
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 확장현황-사이버확장-수당-초기화면 부서코드 목록을 위한 Record
 */


public class SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord(){}

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

/* 작성시간 : Tue Sep 14 19:44:43 KST 2004 */