/***************************************************************************************************
 * 파일명   : PB_L_BOCDDEPTDEPTLISTCURRecord.java
 * 기능     : 공통-지사별 부서검색
 * 작성일자 : 2004-03-08
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ps.pbs.common.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.ds.*;

/**
 * 공통-지사별 부서검색
 */

public class PB_L_BOCDDEPTDEPTLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptnm;

	public PB_L_BOCDDEPTDEPTLISTCURRecord(){}

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

/* 작성시간 : Mon Mar 08 16:18:05 KST 2004 */