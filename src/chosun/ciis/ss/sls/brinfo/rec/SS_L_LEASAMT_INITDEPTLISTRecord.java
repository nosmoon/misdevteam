/***************************************************************************************************
* 파일명 : SS_L_LEASAMT_INITDEPTLISTRecord.java
* 기능 : 지국INFO-전세지원금현화-초기 화면(부서코드조회)
* 작성일자 : 2004-02-09
* 작성자 : 김성규
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * 지국INFO-전세지원금현황-초기 화면(부서조회)
 *
 */


public class SS_L_LEASAMT_INITDEPTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_LEASAMT_INITDEPTLISTRecord(){}

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

/* 작성시간 : Mon Feb 09 16:39:26 KST 2004 */