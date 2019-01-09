/***************************************************************************************************
* 파일명 : SS_L_VSCD_INITDEPTLISTRecord.java
* 기능 : 독자현황-VacationStop-초기화면-부서명,부서코드 목록을 위한 Record
* 작성일자 : 2004-03-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 독자현황-VacationStop-초기화면-부서명,부서코드 목록을 위한 Record
 */

public class SS_L_VSCD_INITDEPTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_VSCD_INITDEPTLISTRecord(){}

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

/* 작성시간 : Fri Mar 26 19:42:26 KST 2004 */