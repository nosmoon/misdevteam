/***************************************************************************************************
 * 파일명   : PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord.java
 * 기능     : 수당-사원별수당관리 초기
 * 작성일자 : 2004-03-08
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.allow.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 *   수당-사원별수당관리 초기
 *
 **/

public class PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptnm;

	public PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}
}

/* 작성시간 : Wed Mar 21 18:40:03 KST 2007 */