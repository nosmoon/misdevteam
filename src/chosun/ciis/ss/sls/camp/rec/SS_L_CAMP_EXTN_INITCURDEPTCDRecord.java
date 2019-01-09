/***************************************************************************************************
 * 파일명   : SP_SS_L_CAMP_EXTN_INIT.java
 * 기능     : 캠페인확장
 * 작성일자 : 2005/05/26
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.camp.rec;

import java.sql.*;
import chosun.ciis.ss.sls.camp.dm.*;
import chosun.ciis.ss.sls.camp.ds.*;

/**
 * 캠페인확장
 */

public class SS_L_CAMP_EXTN_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_CAMP_EXTN_INITCURDEPTCDRecord(){}

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

/* 작성시간 : Fri May 27 15:53:51 KST 2005 */