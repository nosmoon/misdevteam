/***************************************************************************************************
* 파일명 : SS_L_MIG_CONV_INITCURDEPTCDRecord.java
* 기능 : 관리자-작업-마이그레이션-초기화면-부서코드,부서명 목록을 위한 Record
* 작성일자 : 2004-02-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자-작업-마이그레이션-초기화면-부서코드,부서명 목록을 위한 Record
 */

public class SS_L_MIG_CONV_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_MIG_CONV_INITCURDEPTCDRecord(){}

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

/* 작성시간 : Wed Feb 25 14:25:10 KST 2004 */