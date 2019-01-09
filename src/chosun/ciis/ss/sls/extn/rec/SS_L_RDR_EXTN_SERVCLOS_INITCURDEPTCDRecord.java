/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord.java
* 기능 : 확장현황-조선IS확장-마감(조선IS)-초기화면-부서 목록을 위한 Record
* 작성일자 : 2004-08-01
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
 * 확장현황-조선IS확장-마감(조선IS)-초기화면-부서 목록을 위한 Record
 */


public class SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord(){}

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

/* 작성시간 : Mon Aug 02 15:53:00 KST 2004 */