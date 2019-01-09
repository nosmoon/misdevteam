/***************************************************************************************************
* 파일명 : SS_S_RDR_EXTN_SERVCLOSCURDEPTCDRecord.java
* 기능 : 확장현황-조선IS확장-마감(조선IS) 상세 부서 목록을 위한 Record
* 작성일자 : 2004-04-24
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
 * 확장현황-조선IS확장-마감(조선IS) 상세 부서 목록을 위한 Record
 */


public class SS_S_RDR_EXTN_SERVCLOSCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_S_RDR_EXTN_SERVCLOSCURDEPTCDRecord(){}

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

/* 작성시간 : Tue Aug 03 16:08:27 KST 2004 */