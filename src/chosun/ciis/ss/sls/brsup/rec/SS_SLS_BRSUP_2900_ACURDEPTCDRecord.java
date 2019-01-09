/***************************************************************************************************
* 파일명 : SS_SLS_BRSUP_2900_ACURDEPTCDRecord.java
* 기능 : 센터지원-판촉현황-요원관리-요원별실적관리
* 작성일자 : 2016-05-02
* 작성자 : 장선희
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
**  센터지원-판촉현황-요원관리-요원별실적관리
**/


public class SS_SLS_BRSUP_2900_ACURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_SLS_BRSUP_2900_ACURDEPTCDRecord(){}

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

/* 작성시간 : Tue May 03 18:08:49 KST 2016 */