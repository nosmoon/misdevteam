/***************************************************************************************************
 * 파일명   : CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord.java
 * 기능     : 독자-독자등급관리 구독자비교대상검색
 * 작성일자 : 2004-04-22
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * 독자-독자등급관리 구독자비교대상검색
 */

public class CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* 작성시간 : Fri Apr 23 16:36:20 KST 2004 */