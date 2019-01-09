/***************************************************************************************************
 * 파일명   : SP_SS_L_RDR_JM_EXTN_INIT
 * 기능     : 확장현황-제휴확장 신청현황
 * 작성일자 : 2007/11/17
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
**  SP_SS_L_RDR_JM_EXTN_INIT
**/

public class SS_L_RDR_JM_EXTN_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_RDR_JM_EXTN_INITCURDEPTCDRecord(){}

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

/* 작성시간 : Fri Nov 16 14:26:43 KST 2007 */